// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Allows you to manage rules for allowing traffic between an Azure SQL server and a subnet of a virtual network.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     addressSpaces: ["10.7.29.0/29"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.7.29.0/29"],
 *     serviceEndpoints: ["Microsoft.Sql"],
 * });
 * const exampleServer = new azure.mssql.Server("exampleServer", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     version: "12.0",
 *     administratorLogin: "4dm1n157r470r",
 *     administratorLoginPassword: "4-v3ry-53cr37-p455w0rd",
 * });
 * const exampleVirtualNetworkRule = new azure.mssql.VirtualNetworkRule("exampleVirtualNetworkRule", {
 *     serverId: exampleServer.id,
 *     subnetId: exampleSubnet.id,
 * });
 * ```
 *
 * ## Import
 *
 * SQL Virtual Network Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mssql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver/virtualNetworkRules/vnetrulename
 * ```
 */
export class VirtualNetworkRule extends pulumi.CustomResource {
    /**
     * Get an existing VirtualNetworkRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions): VirtualNetworkRule {
        return new VirtualNetworkRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/virtualNetworkRule:VirtualNetworkRule';

    /**
     * Returns true if the given object is an instance of VirtualNetworkRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualNetworkRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualNetworkRule.__pulumiType;
    }

    /**
     * Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     */
    public readonly ignoreMissingVnetServiceEndpoint!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     */
    public readonly serverId!: pulumi.Output<string>;
    /**
     * The ID of the subnet from which the SQL server will accept communications.
     */
    public readonly subnetId!: pulumi.Output<string>;

    /**
     * Create a VirtualNetworkRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualNetworkRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualNetworkRuleArgs | VirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualNetworkRuleState | undefined;
            inputs["ignoreMissingVnetServiceEndpoint"] = state ? state.ignoreMissingVnetServiceEndpoint : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["serverId"] = state ? state.serverId : undefined;
            inputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as VirtualNetworkRuleArgs | undefined;
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            inputs["ignoreMissingVnetServiceEndpoint"] = args ? args.ignoreMissingVnetServiceEndpoint : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["serverId"] = args ? args.serverId : undefined;
            inputs["subnetId"] = args ? args.subnetId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(VirtualNetworkRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualNetworkRule resources.
 */
export interface VirtualNetworkRuleState {
    /**
     * Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     */
    readonly ignoreMissingVnetServiceEndpoint?: pulumi.Input<boolean>;
    /**
     * The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     */
    readonly serverId?: pulumi.Input<string>;
    /**
     * The ID of the subnet from which the SQL server will accept communications.
     */
    readonly subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualNetworkRule resource.
 */
export interface VirtualNetworkRuleArgs {
    /**
     * Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     */
    readonly ignoreMissingVnetServiceEndpoint?: pulumi.Input<boolean>;
    /**
     * The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     */
    readonly serverId: pulumi.Input<string>;
    /**
     * The ID of the subnet from which the SQL server will accept communications.
     */
    readonly subnetId: pulumi.Input<string>;
}