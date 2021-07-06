// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Express Route Circuit Connection.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleExpressRoutePort = new azure.network.ExpressRoutePort("exampleExpressRoutePort", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     peeringLocation: "Equinix-Seattle-SE2",
 *     bandwidthInGbps: 10,
 *     encapsulation: "Dot1Q",
 * });
 * const exampleExpressRouteCircuit = new azure.network.ExpressRouteCircuit("exampleExpressRouteCircuit", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     expressRoutePortId: exampleExpressRoutePort.id,
 *     bandwidthInGbps: 5,
 *     sku: {
 *         tier: "Standard",
 *         family: "MeteredData",
 *     },
 * });
 * const example2ExpressRoutePort = new azure.network.ExpressRoutePort("example2ExpressRoutePort", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     peeringLocation: "Allied-Toronto-King-West",
 *     bandwidthInGbps: 10,
 *     encapsulation: "Dot1Q",
 * });
 * const example2ExpressRouteCircuit = new azure.network.ExpressRouteCircuit("example2ExpressRouteCircuit", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     expressRoutePortId: example2ExpressRoutePort.id,
 *     bandwidthInGbps: 5,
 *     sku: {
 *         tier: "Standard",
 *         family: "MeteredData",
 *     },
 * });
 * const exampleExpressRouteCircuitPeering = new azure.network.ExpressRouteCircuitPeering("exampleExpressRouteCircuitPeering", {
 *     peeringType: "AzurePrivatePeering",
 *     expressRouteCircuitName: exampleExpressRouteCircuit.name,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sharedKey: "ItsASecret",
 *     peerAsn: 100,
 *     primaryPeerAddressPrefix: "192.168.1.0/30",
 *     secondaryPeerAddressPrefix: "192.168.1.0/30",
 *     vlanId: 100,
 * });
 * const example2ExpressRouteCircuitPeering = new azure.network.ExpressRouteCircuitPeering("example2ExpressRouteCircuitPeering", {
 *     peeringType: "AzurePrivatePeering",
 *     expressRouteCircuitName: example2ExpressRouteCircuit.name,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sharedKey: "ItsASecret",
 *     peerAsn: 100,
 *     primaryPeerAddressPrefix: "192.168.1.0/30",
 *     secondaryPeerAddressPrefix: "192.168.1.0/30",
 *     vlanId: 100,
 * });
 * const exampleExpressRouteCircuitConnection = new azure.network.ExpressRouteCircuitConnection("exampleExpressRouteCircuitConnection", {
 *     peeringId: exampleExpressRouteCircuitPeering.id,
 *     peerPeeringId: example2ExpressRouteCircuitPeering.id,
 *     addressPrefixIpv4: "192.169.9.0/29",
 *     authorizationKey: "846a1918-b7a2-4917-b43c-8c4cdaee006a",
 * });
 * ```
 *
 * ## Import
 *
 * Express Route Circuit Connections can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:network/expressRouteCircuitConnection:ExpressRouteCircuitConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/expressRouteCircuits/circuit1/peerings/peering1/connections/connection1
 * ```
 */
export class ExpressRouteCircuitConnection extends pulumi.CustomResource {
    /**
     * Get an existing ExpressRouteCircuitConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExpressRouteCircuitConnectionState, opts?: pulumi.CustomResourceOptions): ExpressRouteCircuitConnection {
        return new ExpressRouteCircuitConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/expressRouteCircuitConnection:ExpressRouteCircuitConnection';

    /**
     * Returns true if the given object is an instance of ExpressRouteCircuitConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExpressRouteCircuitConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExpressRouteCircuitConnection.__pulumiType;
    }

    /**
     * The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     */
    public readonly addressPrefixIpv4!: pulumi.Output<string>;
    /**
     * The IPv6 address space from which to allocate customer addresses for global reach.
     */
    public readonly addressPrefixIpv6!: pulumi.Output<string | undefined>;
    /**
     * The authorization key which is associated with the Express Route Circuit Connection.
     */
    public readonly authorizationKey!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     */
    public readonly peerPeeringId!: pulumi.Output<string>;
    /**
     * The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     */
    public readonly peeringId!: pulumi.Output<string>;

    /**
     * Create a ExpressRouteCircuitConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExpressRouteCircuitConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExpressRouteCircuitConnectionArgs | ExpressRouteCircuitConnectionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExpressRouteCircuitConnectionState | undefined;
            inputs["addressPrefixIpv4"] = state ? state.addressPrefixIpv4 : undefined;
            inputs["addressPrefixIpv6"] = state ? state.addressPrefixIpv6 : undefined;
            inputs["authorizationKey"] = state ? state.authorizationKey : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["peerPeeringId"] = state ? state.peerPeeringId : undefined;
            inputs["peeringId"] = state ? state.peeringId : undefined;
        } else {
            const args = argsOrState as ExpressRouteCircuitConnectionArgs | undefined;
            if ((!args || args.addressPrefixIpv4 === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addressPrefixIpv4'");
            }
            if ((!args || args.peerPeeringId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peerPeeringId'");
            }
            if ((!args || args.peeringId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peeringId'");
            }
            inputs["addressPrefixIpv4"] = args ? args.addressPrefixIpv4 : undefined;
            inputs["addressPrefixIpv6"] = args ? args.addressPrefixIpv6 : undefined;
            inputs["authorizationKey"] = args ? args.authorizationKey : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["peerPeeringId"] = args ? args.peerPeeringId : undefined;
            inputs["peeringId"] = args ? args.peeringId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ExpressRouteCircuitConnection.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExpressRouteCircuitConnection resources.
 */
export interface ExpressRouteCircuitConnectionState {
    /**
     * The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     */
    addressPrefixIpv4?: pulumi.Input<string>;
    /**
     * The IPv6 address space from which to allocate customer addresses for global reach.
     */
    addressPrefixIpv6?: pulumi.Input<string>;
    /**
     * The authorization key which is associated with the Express Route Circuit Connection.
     */
    authorizationKey?: pulumi.Input<string>;
    /**
     * The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     */
    peerPeeringId?: pulumi.Input<string>;
    /**
     * The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     */
    peeringId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExpressRouteCircuitConnection resource.
 */
export interface ExpressRouteCircuitConnectionArgs {
    /**
     * The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     */
    addressPrefixIpv4: pulumi.Input<string>;
    /**
     * The IPv6 address space from which to allocate customer addresses for global reach.
     */
    addressPrefixIpv6?: pulumi.Input<string>;
    /**
     * The authorization key which is associated with the Express Route Circuit Connection.
     */
    authorizationKey?: pulumi.Input<string>;
    /**
     * The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     */
    peerPeeringId: pulumi.Input<string>;
    /**
     * The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     */
    peeringId: pulumi.Input<string>;
}