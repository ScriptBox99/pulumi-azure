# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['EventGridDataConnection']


class EventGridDataConnection(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blob_storage_event_type: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 eventhub_consumer_group_name: Optional[pulumi.Input[str]] = None,
                 eventhub_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 skip_first_record: Optional[pulumi.Input[bool]] = None,
                 storage_account_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a Kusto (also known as Azure Data Explorer) Event Grid Data Connection

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_cluster = azure.kusto.Cluster("exampleCluster",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku=azure.kusto.ClusterSkuArgs(
                name="Standard_D13_v2",
                capacity=2,
            ))
        example_database = azure.kusto.Database("exampleDatabase",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cluster_name=example_cluster.name,
            hot_cache_period="P7D",
            soft_delete_period="P31D")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="GRS")
        test_event_hub_namespace = azure.eventhub.EventHubNamespace("testEventHubNamespace",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku="Standard")
        test_event_hub = azure.eventhub.EventHub("testEventHub",
            namespace_name=azurerm_eventhub_namespace["example"]["name"],
            resource_group_name=example_resource_group.name,
            partition_count=1,
            message_retention=1)
        example_consumer_group = azure.eventhub.ConsumerGroup("exampleConsumerGroup",
            namespace_name=azurerm_eventhub_namespace["example"]["name"],
            eventhub_name=azurerm_eventhub["example"]["name"],
            resource_group_name=example_resource_group.name)
        example_event_subscription = azure.eventgrid.EventSubscription("exampleEventSubscription",
            scope=example_account.id,
            eventhub_endpoint_id=azurerm_eventhub["example"]["id"],
            event_delivery_schema="EventGridSchema",
            included_event_types=[
                "Microsoft.Storage.BlobCreated",
                "Microsoft.Storage.BlobRenamed",
            ],
            retry_policy=azure.eventgrid.EventSubscriptionRetryPolicyArgs(
                event_time_to_live=144,
                max_delivery_attempts=10,
            ))
        example_event_grid_data_connection = azure.kusto.EventGridDataConnection("exampleEventGridDataConnection",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cluster_name=example_cluster.name,
            database_name=example_database.name,
            storage_account_id=example_account.id,
            eventhub_id=azurerm_eventhub["example"]["id"],
            eventhub_consumer_group_name=example_consumer_group.name,
            opts=pulumi.ResourceOptions(depends_on=[example_event_subscription]))
        ```

        ## Import

        Kusto Event Grid Data Connections can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:kusto/eventGridDataConnection:EventGridDataConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/Clusters/cluster1/Databases/database1/DataConnections/dataConnection1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] blob_storage_event_type: Specifies the blob storage event type that needs to be processed. Possible
               Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults
               to `Microsoft.Storage.BlobCreated`.
        :param pulumi.Input[str] cluster_name: Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] database_name: Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] eventhub_consumer_group_name: Specifies the Event Hub consumer group this data connection will use for
               ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] eventhub_id: Specifies the resource id of the Event Hub this data connection will use for ingestion.
               Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] skip_first_record: is the first record of every file ignored? Defaults to `false`.
        :param pulumi.Input[str] storage_account_id: Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['blob_storage_event_type'] = blob_storage_event_type
            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__['cluster_name'] = cluster_name
            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__['database_name'] = database_name
            if eventhub_consumer_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'eventhub_consumer_group_name'")
            __props__['eventhub_consumer_group_name'] = eventhub_consumer_group_name
            if eventhub_id is None and not opts.urn:
                raise TypeError("Missing required property 'eventhub_id'")
            __props__['eventhub_id'] = eventhub_id
            __props__['location'] = location
            __props__['name'] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__['resource_group_name'] = resource_group_name
            __props__['skip_first_record'] = skip_first_record
            if storage_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_account_id'")
            __props__['storage_account_id'] = storage_account_id
        super(EventGridDataConnection, __self__).__init__(
            'azure:kusto/eventGridDataConnection:EventGridDataConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            blob_storage_event_type: Optional[pulumi.Input[str]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            eventhub_consumer_group_name: Optional[pulumi.Input[str]] = None,
            eventhub_id: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            skip_first_record: Optional[pulumi.Input[bool]] = None,
            storage_account_id: Optional[pulumi.Input[str]] = None) -> 'EventGridDataConnection':
        """
        Get an existing EventGridDataConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] blob_storage_event_type: Specifies the blob storage event type that needs to be processed. Possible
               Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults
               to `Microsoft.Storage.BlobCreated`.
        :param pulumi.Input[str] cluster_name: Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] database_name: Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] eventhub_consumer_group_name: Specifies the Event Hub consumer group this data connection will use for
               ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] eventhub_id: Specifies the resource id of the Event Hub this data connection will use for ingestion.
               Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] skip_first_record: is the first record of every file ignored? Defaults to `false`.
        :param pulumi.Input[str] storage_account_id: Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["blob_storage_event_type"] = blob_storage_event_type
        __props__["cluster_name"] = cluster_name
        __props__["database_name"] = database_name
        __props__["eventhub_consumer_group_name"] = eventhub_consumer_group_name
        __props__["eventhub_id"] = eventhub_id
        __props__["location"] = location
        __props__["name"] = name
        __props__["resource_group_name"] = resource_group_name
        __props__["skip_first_record"] = skip_first_record
        __props__["storage_account_id"] = storage_account_id
        return EventGridDataConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="blobStorageEventType")
    def blob_storage_event_type(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the blob storage event type that needs to be processed. Possible
        Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults
        to `Microsoft.Storage.BlobCreated`.
        """
        return pulumi.get(self, "blob_storage_event_type")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter(name="eventhubConsumerGroupName")
    def eventhub_consumer_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the Event Hub consumer group this data connection will use for
        ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "eventhub_consumer_group_name")

    @property
    @pulumi.getter(name="eventhubId")
    def eventhub_id(self) -> pulumi.Output[str]:
        """
        Specifies the resource id of the Event Hub this data connection will use for ingestion.
        Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "eventhub_id")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="skipFirstRecord")
    def skip_first_record(self) -> pulumi.Output[Optional[bool]]:
        """
        is the first record of every file ignored? Defaults to `false`.
        """
        return pulumi.get(self, "skip_first_record")

    @property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Output[str]:
        """
        Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
