// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **Note:** This resource creates a Stream Input of type `Microsoft.EventHub/EventHub`, to create a Stream Input of type `Microsoft.ServiceBus/EventHub` please use the resource azurerm_stream_analytics_stream_input_eventhub.
 *
 * Manages a Stream Analytics Stream Input EventHub V2.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleJob = azure.streamanalytics.getJobOutput({
 *     name: "example-job",
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleEventHubNamespace = new azure.eventhub.EventHubNamespace("exampleEventHubNamespace", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "Standard",
 *     capacity: 1,
 * });
 * const exampleEventHub = new azure.eventhub.EventHub("exampleEventHub", {
 *     namespaceName: exampleEventHubNamespace.name,
 *     resourceGroupName: exampleResourceGroup.name,
 *     partitionCount: 2,
 *     messageRetention: 1,
 * });
 * const exampleConsumerGroup = new azure.eventhub.ConsumerGroup("exampleConsumerGroup", {
 *     namespaceName: exampleEventHubNamespace.name,
 *     eventhubName: exampleEventHub.name,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleStreamInputEventHubV2 = new azure.streamanalytics.StreamInputEventHubV2("exampleStreamInputEventHubV2", {
 *     streamAnalyticsJobId: exampleJob.apply(exampleJob => exampleJob.id),
 *     eventhubConsumerGroupName: exampleConsumerGroup.name,
 *     eventhubName: exampleEventHub.name,
 *     servicebusNamespace: exampleEventHubNamespace.name,
 *     sharedAccessPolicyKey: exampleEventHubNamespace.defaultPrimaryKey,
 *     sharedAccessPolicyName: "RootManageSharedAccessKey",
 *     serialization: {
 *         type: "Json",
 *         encoding: "UTF8",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Stream Analytics Stream Input EventHub's can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:streamanalytics/streamInputEventHubV2:StreamInputEventHubV2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/inputs/input1
 * ```
 */
export class StreamInputEventHubV2 extends pulumi.CustomResource {
    /**
     * Get an existing StreamInputEventHubV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamInputEventHubV2State, opts?: pulumi.CustomResourceOptions): StreamInputEventHubV2 {
        return new StreamInputEventHubV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:streamanalytics/streamInputEventHubV2:StreamInputEventHubV2';

    /**
     * Returns true if the given object is an instance of StreamInputEventHubV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamInputEventHubV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamInputEventHubV2.__pulumiType;
    }

    /**
     * The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    public readonly authenticationMode!: pulumi.Output<string | undefined>;
    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not set the input will use the Event Hub's default consumer group.
     */
    public readonly eventhubConsumerGroupName!: pulumi.Output<string | undefined>;
    /**
     * The name of the Event Hub.
     */
    public readonly eventhubName!: pulumi.Output<string>;
    /**
     * The name of the Stream Input EventHub V2. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The property the input Event Hub has been partitioned by.
     */
    public readonly partitionKey!: pulumi.Output<string | undefined>;
    /**
     * A `serialization` block as defined below.
     */
    public readonly serialization!: pulumi.Output<outputs.streamanalytics.StreamInputEventHubV2Serialization>;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    public readonly servicebusNamespace!: pulumi.Output<string>;
    /**
     * The shared access policy key for the specified shared access policy.
     */
    public readonly sharedAccessPolicyKey!: pulumi.Output<string | undefined>;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    public readonly sharedAccessPolicyName!: pulumi.Output<string | undefined>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    public readonly streamAnalyticsJobId!: pulumi.Output<string>;

    /**
     * Create a StreamInputEventHubV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamInputEventHubV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamInputEventHubV2Args | StreamInputEventHubV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamInputEventHubV2State | undefined;
            resourceInputs["authenticationMode"] = state ? state.authenticationMode : undefined;
            resourceInputs["eventhubConsumerGroupName"] = state ? state.eventhubConsumerGroupName : undefined;
            resourceInputs["eventhubName"] = state ? state.eventhubName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["partitionKey"] = state ? state.partitionKey : undefined;
            resourceInputs["serialization"] = state ? state.serialization : undefined;
            resourceInputs["servicebusNamespace"] = state ? state.servicebusNamespace : undefined;
            resourceInputs["sharedAccessPolicyKey"] = state ? state.sharedAccessPolicyKey : undefined;
            resourceInputs["sharedAccessPolicyName"] = state ? state.sharedAccessPolicyName : undefined;
            resourceInputs["streamAnalyticsJobId"] = state ? state.streamAnalyticsJobId : undefined;
        } else {
            const args = argsOrState as StreamInputEventHubV2Args | undefined;
            if ((!args || args.eventhubName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventhubName'");
            }
            if ((!args || args.serialization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serialization'");
            }
            if ((!args || args.servicebusNamespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'servicebusNamespace'");
            }
            if ((!args || args.streamAnalyticsJobId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'streamAnalyticsJobId'");
            }
            resourceInputs["authenticationMode"] = args ? args.authenticationMode : undefined;
            resourceInputs["eventhubConsumerGroupName"] = args ? args.eventhubConsumerGroupName : undefined;
            resourceInputs["eventhubName"] = args ? args.eventhubName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partitionKey"] = args ? args.partitionKey : undefined;
            resourceInputs["serialization"] = args ? args.serialization : undefined;
            resourceInputs["servicebusNamespace"] = args ? args.servicebusNamespace : undefined;
            resourceInputs["sharedAccessPolicyKey"] = args?.sharedAccessPolicyKey ? pulumi.secret(args.sharedAccessPolicyKey) : undefined;
            resourceInputs["sharedAccessPolicyName"] = args ? args.sharedAccessPolicyName : undefined;
            resourceInputs["streamAnalyticsJobId"] = args ? args.streamAnalyticsJobId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["sharedAccessPolicyKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(StreamInputEventHubV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamInputEventHubV2 resources.
 */
export interface StreamInputEventHubV2State {
    /**
     * The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    authenticationMode?: pulumi.Input<string>;
    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not set the input will use the Event Hub's default consumer group.
     */
    eventhubConsumerGroupName?: pulumi.Input<string>;
    /**
     * The name of the Event Hub.
     */
    eventhubName?: pulumi.Input<string>;
    /**
     * The name of the Stream Input EventHub V2. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The property the input Event Hub has been partitioned by.
     */
    partitionKey?: pulumi.Input<string>;
    /**
     * A `serialization` block as defined below.
     */
    serialization?: pulumi.Input<inputs.streamanalytics.StreamInputEventHubV2Serialization>;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    servicebusNamespace?: pulumi.Input<string>;
    /**
     * The shared access policy key for the specified shared access policy.
     */
    sharedAccessPolicyKey?: pulumi.Input<string>;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    sharedAccessPolicyName?: pulumi.Input<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamInputEventHubV2 resource.
 */
export interface StreamInputEventHubV2Args {
    /**
     * The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    authenticationMode?: pulumi.Input<string>;
    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not set the input will use the Event Hub's default consumer group.
     */
    eventhubConsumerGroupName?: pulumi.Input<string>;
    /**
     * The name of the Event Hub.
     */
    eventhubName: pulumi.Input<string>;
    /**
     * The name of the Stream Input EventHub V2. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The property the input Event Hub has been partitioned by.
     */
    partitionKey?: pulumi.Input<string>;
    /**
     * A `serialization` block as defined below.
     */
    serialization: pulumi.Input<inputs.streamanalytics.StreamInputEventHubV2Serialization>;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    servicebusNamespace: pulumi.Input<string>;
    /**
     * The shared access policy key for the specified shared access policy.
     */
    sharedAccessPolicyKey?: pulumi.Input<string>;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    sharedAccessPolicyName?: pulumi.Input<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobId: pulumi.Input<string>;
}