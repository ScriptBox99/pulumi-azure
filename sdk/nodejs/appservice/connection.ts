// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a service connector for app service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleAccount = new azure.cosmosdb.Account("exampleAccount", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     offerType: "Standard",
 *     kind: "GlobalDocumentDB",
 *     consistencyPolicy: {
 *         consistencyLevel: "BoundedStaleness",
 *         maxIntervalInSeconds: 10,
 *         maxStalenessPrefix: 200,
 *     },
 *     geoLocations: [{
 *         location: exampleResourceGroup.location,
 *         failoverPriority: 0,
 *     }],
 * });
 * const exampleSqlDatabase = new azure.cosmosdb.SqlDatabase("exampleSqlDatabase", {
 *     resourceGroupName: exampleAccount.resourceGroupName,
 *     accountName: exampleAccount.name,
 *     throughput: 400,
 * });
 * const exampleSqlContainer = new azure.cosmosdb.SqlContainer("exampleSqlContainer", {
 *     resourceGroupName: exampleAccount.resourceGroupName,
 *     accountName: exampleAccount.name,
 *     databaseName: exampleSqlDatabase.name,
 *     partitionKeyPath: "/definition",
 * });
 * const exampleServicePlan = new azure.appservice.ServicePlan("exampleServicePlan", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     skuName: "P1v2",
 *     osType: "Linux",
 * });
 * const exampleLinuxWebApp = new azure.appservice.LinuxWebApp("exampleLinuxWebApp", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     servicePlanId: exampleServicePlan.id,
 *     siteConfig: {},
 * });
 * const exampleConnection = new azure.appservice.Connection("exampleConnection", {
 *     appServiceId: exampleLinuxWebApp.id,
 *     targetResourceId: exampleSqlDatabase.id,
 *     authentication: {
 *         type: "systemAssignedIdentity",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Service Connector for app service can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:appservice/connection:Connection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/sites/webapp/providers/Microsoft.ServiceLinker/linkers/serviceconnector1
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appservice/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * The ID of the data source web app. Changing this forces a new resource to be created.
     */
    public readonly appServiceId!: pulumi.Output<string>;
    /**
     * The authentication info. An `authentication` block as defined below.
     */
    public readonly authentication!: pulumi.Output<outputs.appservice.ConnectionAuthentication>;
    /**
     * The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
     */
    public readonly clientType!: pulumi.Output<string | undefined>;
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible values are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`.
     */
    public readonly targetResourceId!: pulumi.Output<string>;
    /**
     * The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
     */
    public readonly vnetSolution!: pulumi.Output<string | undefined>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["appServiceId"] = state ? state.appServiceId : undefined;
            resourceInputs["authentication"] = state ? state.authentication : undefined;
            resourceInputs["clientType"] = state ? state.clientType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["targetResourceId"] = state ? state.targetResourceId : undefined;
            resourceInputs["vnetSolution"] = state ? state.vnetSolution : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.appServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appServiceId'");
            }
            if ((!args || args.authentication === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authentication'");
            }
            if ((!args || args.targetResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetResourceId'");
            }
            resourceInputs["appServiceId"] = args ? args.appServiceId : undefined;
            resourceInputs["authentication"] = args ? args.authentication : undefined;
            resourceInputs["clientType"] = args ? args.clientType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["targetResourceId"] = args ? args.targetResourceId : undefined;
            resourceInputs["vnetSolution"] = args ? args.vnetSolution : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * The ID of the data source web app. Changing this forces a new resource to be created.
     */
    appServiceId?: pulumi.Input<string>;
    /**
     * The authentication info. An `authentication` block as defined below.
     */
    authentication?: pulumi.Input<inputs.appservice.ConnectionAuthentication>;
    /**
     * The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
     */
    clientType?: pulumi.Input<string>;
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible values are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`.
     */
    targetResourceId?: pulumi.Input<string>;
    /**
     * The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
     */
    vnetSolution?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * The ID of the data source web app. Changing this forces a new resource to be created.
     */
    appServiceId: pulumi.Input<string>;
    /**
     * The authentication info. An `authentication` block as defined below.
     */
    authentication: pulumi.Input<inputs.appservice.ConnectionAuthentication>;
    /**
     * The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
     */
    clientType?: pulumi.Input<string>;
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible values are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`.
     */
    targetResourceId: pulumi.Input<string>;
    /**
     * The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
     */
    vnetSolution?: pulumi.Input<string>;
}