// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("eveentgrid-rg");

// Subscribe to events in resource group, e.g. when a new resource is created
azure.eventgrid.events.onResourceGroupEvent("OnResourceChange", {
    resourceGroup,
    callback: async (context, event) => {
        context.log(`Subject: ${event.data.subject}`);
        context.log(`Event Type: ${event.data.eventType}`);
        context.log(`Data: ${JSON.stringify(event.data)}`);
    },
});

// Sample storage account
const storageAccount = new azure.storage.Account("eventgridsa", {
    resourceGroupName: resourceGroup.name,
    accountReplicationType: "LRS",
    accountTier: "Standard",
    accountKind: "StorageV2", // Only V2 accounts support Event Grid events
});

// Subscribe to creation of JPG files in any container of this storage account
azure.eventgrid.events.onGridBlobCreated("OnNewBlob", {
    storageAccount,
    subjectFilter: {
        caseSensitive: false,
        subjectEndsWith: ".jpg",
    },
    callback: async (context, event) => {
        context.log(`Subject: ${event.data.subject}`);
        context.log(`File size: ${event.data.contentLength}`);
    },
});

// A queue to log events to
const logQueue = new azure.storage.Queue("log", {
    storageAccountName: storageAccount.name,
});

// Subscribe to deletion of any files from any container of this storage account and
// log all event data to a storage queue
azure.eventgrid.events.onGridBlobDeleted("OnDeletedBlob", {
    storageAccount,
    outputs: [logQueue.output("log")],
    callback: async (context, event) => {
        context.log(`Subject: ${event.data.subject}`);
        context.log(`File type: ${event.data.blobType}`);
        return { log: event.data };
    },
});
