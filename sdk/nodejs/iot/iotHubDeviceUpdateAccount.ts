// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an IoT Hub Device Update Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "East US"});
 * const exampleIotHubDeviceUpdateAccount = new azure.iot.IotHubDeviceUpdateAccount("exampleIotHubDeviceUpdateAccount", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 *     tags: {
 *         key: "value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * IoT Hub Device Update Account can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:iot/iotHubDeviceUpdateAccount:IotHubDeviceUpdateAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DeviceUpdate/accounts/account1
 * ```
 */
export class IotHubDeviceUpdateAccount extends pulumi.CustomResource {
    /**
     * Get an existing IotHubDeviceUpdateAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IotHubDeviceUpdateAccountState, opts?: pulumi.CustomResourceOptions): IotHubDeviceUpdateAccount {
        return new IotHubDeviceUpdateAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:iot/iotHubDeviceUpdateAccount:IotHubDeviceUpdateAccount';

    /**
     * Returns true if the given object is an instance of IotHubDeviceUpdateAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IotHubDeviceUpdateAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IotHubDeviceUpdateAccount.__pulumiType;
    }

    /**
     * The API host name of the IoT Hub Device Update Account.
     */
    public /*out*/ readonly hostName!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.iot.IotHubDeviceUpdateAccountIdentity | undefined>;
    /**
     * Specifies the Azure Region where the IoT Hub Device Update Account should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name which should be used for this IoT Hub Device Update Account. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies whether the public network access is enabled for the IoT Hub Device Update Account. Possible values are `true` and `false`. Defaults to `true`.
     */
    public readonly publicNetworkAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the name of the Resource Group where the IoT Hub Device Update Account should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Sku of the IoT Hub Device Update Account. Possible values are `Free` and `Standard`. Defaults to `Standard`.
     */
    public readonly sku!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags which should be assigned to the IoT Hub Device Update Account.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a IotHubDeviceUpdateAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IotHubDeviceUpdateAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IotHubDeviceUpdateAccountArgs | IotHubDeviceUpdateAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IotHubDeviceUpdateAccountState | undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = state ? state.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IotHubDeviceUpdateAccountArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = args ? args.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["hostName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IotHubDeviceUpdateAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IotHubDeviceUpdateAccount resources.
 */
export interface IotHubDeviceUpdateAccountState {
    /**
     * The API host name of the IoT Hub Device Update Account.
     */
    hostName?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.iot.IotHubDeviceUpdateAccountIdentity>;
    /**
     * Specifies the Azure Region where the IoT Hub Device Update Account should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this IoT Hub Device Update Account. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies whether the public network access is enabled for the IoT Hub Device Update Account. Possible values are `true` and `false`. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the Resource Group where the IoT Hub Device Update Account should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Sku of the IoT Hub Device Update Account. Possible values are `Free` and `Standard`. Defaults to `Standard`.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the IoT Hub Device Update Account.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IotHubDeviceUpdateAccount resource.
 */
export interface IotHubDeviceUpdateAccountArgs {
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.iot.IotHubDeviceUpdateAccountIdentity>;
    /**
     * Specifies the Azure Region where the IoT Hub Device Update Account should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this IoT Hub Device Update Account. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies whether the public network access is enabled for the IoT Hub Device Update Account. Possible values are `true` and `false`. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the Resource Group where the IoT Hub Device Update Account should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Sku of the IoT Hub Device Update Account. Possible values are `Free` and `Standard`. Defaults to `Standard`.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the IoT Hub Device Update Account.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}