// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Mobile Network Sim Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleNetwork = new azure.mobile.Network("exampleNetwork", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     mobileCountryCode: "001",
 *     mobileNetworkCode: "01",
 * });
 * const exampleUserAssignedIdentity = azure.authorization.getUserAssignedIdentity({
 *     name: "example-identity",
 * });
 * const exampleKey = azure.keyvault.getKey({
 *     name: "some-key",
 *     keyVaultId: data.azurerm_key_vault.example.id,
 * });
 * const exampleNetworkSimGroup = new azure.mobile.NetworkSimGroup("exampleNetworkSimGroup", {
 *     location: exampleResourceGroup.location,
 *     mobileNetworkId: exampleNetwork.id,
 *     encryptionKeyUrl: exampleKey.then(exampleKey => exampleKey.id),
 *     identity: {
 *         type: "SystemAssigned, UserAssigned",
 *         identityIds: [exampleUserAssignedIdentity.then(exampleUserAssignedIdentity => exampleUserAssignedIdentity.id)],
 *     },
 *     tags: {
 *         key: "value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Mobile Network Sim Groups can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mobile/networkSimGroup:NetworkSimGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/simGroups/simGroup1
 * ```
 */
export class NetworkSimGroup extends pulumi.CustomResource {
    /**
     * Get an existing NetworkSimGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkSimGroupState, opts?: pulumi.CustomResourceOptions): NetworkSimGroup {
        return new NetworkSimGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mobile/networkSimGroup:NetworkSimGroup';

    /**
     * Returns true if the given object is an instance of NetworkSimGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkSimGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkSimGroup.__pulumiType;
    }

    /**
     * A key to encrypt the SIM data that belongs to this SIM group.
     */
    public readonly encryptionKeyUrl!: pulumi.Output<string | undefined>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.mobile.NetworkSimGroupIdentity | undefined>;
    /**
     * Specifies the Azure Region where the Mobile Network Sim Groups should exist. Changing this forces a new Mobile Network Sim Group to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The ID of Mobile Network which the Mobile Network Sim Group belongs to. Changing this forces a new Mobile Network Slice to be created.
     */
    public readonly mobileNetworkId!: pulumi.Output<string>;
    /**
     * Specifies the name which should be used for this Mobile Network Sim Groups. Changing this forces a new Mobile Network Sim Group to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Groups.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a NetworkSimGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkSimGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkSimGroupArgs | NetworkSimGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkSimGroupState | undefined;
            resourceInputs["encryptionKeyUrl"] = state ? state.encryptionKeyUrl : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["mobileNetworkId"] = state ? state.mobileNetworkId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NetworkSimGroupArgs | undefined;
            if ((!args || args.mobileNetworkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mobileNetworkId'");
            }
            resourceInputs["encryptionKeyUrl"] = args ? args.encryptionKeyUrl : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["mobileNetworkId"] = args ? args.mobileNetworkId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkSimGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkSimGroup resources.
 */
export interface NetworkSimGroupState {
    /**
     * A key to encrypt the SIM data that belongs to this SIM group.
     */
    encryptionKeyUrl?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.mobile.NetworkSimGroupIdentity>;
    /**
     * Specifies the Azure Region where the Mobile Network Sim Groups should exist. Changing this forces a new Mobile Network Sim Group to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of Mobile Network which the Mobile Network Sim Group belongs to. Changing this forces a new Mobile Network Slice to be created.
     */
    mobileNetworkId?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Mobile Network Sim Groups. Changing this forces a new Mobile Network Sim Group to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Groups.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a NetworkSimGroup resource.
 */
export interface NetworkSimGroupArgs {
    /**
     * A key to encrypt the SIM data that belongs to this SIM group.
     */
    encryptionKeyUrl?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.mobile.NetworkSimGroupIdentity>;
    /**
     * Specifies the Azure Region where the Mobile Network Sim Groups should exist. Changing this forces a new Mobile Network Sim Group to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of Mobile Network which the Mobile Network Sim Group belongs to. Changing this forces a new Mobile Network Slice to be created.
     */
    mobileNetworkId: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Mobile Network Sim Groups. Changing this forces a new Mobile Network Sim Group to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Groups.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}