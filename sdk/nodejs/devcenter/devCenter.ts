// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * <!-- Note: This documentation is generated. Any manual changes will be overwritten -->
 *
 * Manages a Dev Center.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleUserAssignedIdentity = new azure.authorization.UserAssignedIdentity("exampleUserAssignedIdentity", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 * });
 * const exampleDevCenter = new azure.devcenter.DevCenter("exampleDevCenter", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * ```
 * ## Blocks Reference
 *
 * ### `identity` Block
 *
 * The `identity` block supports the following arguments:
 *
 * * `type` - (Required) Specifies the type of Managed Identity that should be assigned to this Dev Center. Possible values are `SystemAssigned`, `SystemAssigned, UserAssigned` and `UserAssigned`.
 * * `identityIds` - (Optional) A list of the User Assigned Identity IDs that should be assigned to this Dev Center.
 *
 * In addition to the arguments defined above, the `identity` block exports the following attributes:
 *
 * * `principalId` - The Principal ID for the System-Assigned Managed Identity assigned to this Dev Center.
 * * `tenantId` - The Tenant ID for the System-Assigned Managed Identity assigned to this Dev Center.
 *
 * ## Import
 *
 * An existing Dev Center can be imported into Terraform using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:devcenter/devCenter:DevCenter example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/devCenters/{devCenterName}
 * ```
 *
 *  * Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center exists. For example `12345678-1234-9876-4563-123456789012`. * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center exists. For example `example-resource-group`. * Where `{devCenterName}` is the name of the Dev Center. For example `devCenterValue`.
 */
export class DevCenter extends pulumi.CustomResource {
    /**
     * Get an existing DevCenter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DevCenterState, opts?: pulumi.CustomResourceOptions): DevCenter {
        return new DevCenter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:devcenter/devCenter:DevCenter';

    /**
     * Returns true if the given object is an instance of DevCenter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DevCenter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DevCenter.__pulumiType;
    }

    /**
     * The URI of the Dev Center.
     */
    public /*out*/ readonly devCenterUri!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     */
    public readonly identity!: pulumi.Output<outputs.devcenter.DevCenterIdentity | undefined>;
    /**
     * The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Dev Center.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a DevCenter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DevCenterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DevCenterArgs | DevCenterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DevCenterState | undefined;
            resourceInputs["devCenterUri"] = state ? state.devCenterUri : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DevCenterArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["devCenterUri"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DevCenter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DevCenter resources.
 */
export interface DevCenterState {
    /**
     * The URI of the Dev Center.
     */
    devCenterUri?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     */
    identity?: pulumi.Input<inputs.devcenter.DevCenterIdentity>;
    /**
     * The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Dev Center.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DevCenter resource.
 */
export interface DevCenterArgs {
    /**
     * An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     */
    identity?: pulumi.Input<inputs.devcenter.DevCenterIdentity>;
    /**
     * The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Dev Center.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}