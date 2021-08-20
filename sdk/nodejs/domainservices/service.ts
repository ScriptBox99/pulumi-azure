// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Domain Services can be imported using the resource ID, together with the Replica Set ID that you wish to designate as the initial replica set, e.g.
 *
 * ```sh
 *  $ pulumi import azure:domainservices/service:Service example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.AAD/domainServices/instance1/initialReplicaSetId/00000000-0000-0000-0000-000000000000
 * ```
 */
export class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service {
        return new Service(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:domainservices/service:Service';

    /**
     * Returns true if the given object is an instance of Service.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Service {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Service.__pulumiType;
    }

    /**
     * A unique ID for the managed domain deployment.
     */
    public /*out*/ readonly deploymentId!: pulumi.Output<string>;
    /**
     * The Active Directory domain to use. See [official documentation](https://docs.microsoft.com/en-us/azure/active-directory-domain-services/tutorial-create-instance#create-a-managed-domain) for constraints and recommendations.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * Whether to enable group-based filtered sync (also called scoped synchronisation). Defaults to `false`.
     */
    public readonly filteredSyncEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     */
    public readonly initialReplicaSet!: pulumi.Output<outputs.domainservices.ServiceInitialReplicaSet>;
    /**
     * The Azure location where the Domain Service exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The display name for your managed Active Directory Domain Service resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `notifications` block as defined below.
     */
    public readonly notifications!: pulumi.Output<outputs.domainservices.ServiceNotifications>;
    /**
     * The name of the Resource Group in which the Domain Service should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The Azure resource ID for the domain service.
     */
    public /*out*/ readonly resourceId!: pulumi.Output<string>;
    /**
     * A `secureLdap` block as defined below.
     */
    public readonly secureLdap!: pulumi.Output<outputs.domainservices.ServiceSecureLdap>;
    /**
     * A `security` block as defined below.
     */
    public readonly security!: pulumi.Output<outputs.domainservices.ServiceSecurity>;
    /**
     * The SKU to use when provisioning the Domain Service resource. One of `Standard`, `Enterprise` or `Premium`.
     */
    public readonly sku!: pulumi.Output<string>;
    public /*out*/ readonly syncOwner!: pulumi.Output<string>;
    /**
     * A mapping of tags assigned to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tenantId!: pulumi.Output<string>;
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceArgs | ServiceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceState | undefined;
            inputs["deploymentId"] = state ? state.deploymentId : undefined;
            inputs["domainName"] = state ? state.domainName : undefined;
            inputs["filteredSyncEnabled"] = state ? state.filteredSyncEnabled : undefined;
            inputs["initialReplicaSet"] = state ? state.initialReplicaSet : undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["notifications"] = state ? state.notifications : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["resourceId"] = state ? state.resourceId : undefined;
            inputs["secureLdap"] = state ? state.secureLdap : undefined;
            inputs["security"] = state ? state.security : undefined;
            inputs["sku"] = state ? state.sku : undefined;
            inputs["syncOwner"] = state ? state.syncOwner : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tenantId"] = state ? state.tenantId : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ServiceArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            if ((!args || args.initialReplicaSet === undefined) && !opts.urn) {
                throw new Error("Missing required property 'initialReplicaSet'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            inputs["domainName"] = args ? args.domainName : undefined;
            inputs["filteredSyncEnabled"] = args ? args.filteredSyncEnabled : undefined;
            inputs["initialReplicaSet"] = args ? args.initialReplicaSet : undefined;
            inputs["location"] = args ? args.location : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["notifications"] = args ? args.notifications : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["secureLdap"] = args ? args.secureLdap : undefined;
            inputs["security"] = args ? args.security : undefined;
            inputs["sku"] = args ? args.sku : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["deploymentId"] = undefined /*out*/;
            inputs["resourceId"] = undefined /*out*/;
            inputs["syncOwner"] = undefined /*out*/;
            inputs["tenantId"] = undefined /*out*/;
            inputs["version"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Service.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * A unique ID for the managed domain deployment.
     */
    deploymentId?: pulumi.Input<string>;
    /**
     * The Active Directory domain to use. See [official documentation](https://docs.microsoft.com/en-us/azure/active-directory-domain-services/tutorial-create-instance#create-a-managed-domain) for constraints and recommendations.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Whether to enable group-based filtered sync (also called scoped synchronisation). Defaults to `false`.
     */
    filteredSyncEnabled?: pulumi.Input<boolean>;
    /**
     * An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     */
    initialReplicaSet?: pulumi.Input<inputs.domainservices.ServiceInitialReplicaSet>;
    /**
     * The Azure location where the Domain Service exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The display name for your managed Active Directory Domain Service resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `notifications` block as defined below.
     */
    notifications?: pulumi.Input<inputs.domainservices.ServiceNotifications>;
    /**
     * The name of the Resource Group in which the Domain Service should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The Azure resource ID for the domain service.
     */
    resourceId?: pulumi.Input<string>;
    /**
     * A `secureLdap` block as defined below.
     */
    secureLdap?: pulumi.Input<inputs.domainservices.ServiceSecureLdap>;
    /**
     * A `security` block as defined below.
     */
    security?: pulumi.Input<inputs.domainservices.ServiceSecurity>;
    /**
     * The SKU to use when provisioning the Domain Service resource. One of `Standard`, `Enterprise` or `Premium`.
     */
    sku?: pulumi.Input<string>;
    syncOwner?: pulumi.Input<string>;
    /**
     * A mapping of tags assigned to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tenantId?: pulumi.Input<string>;
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * The Active Directory domain to use. See [official documentation](https://docs.microsoft.com/en-us/azure/active-directory-domain-services/tutorial-create-instance#create-a-managed-domain) for constraints and recommendations.
     */
    domainName: pulumi.Input<string>;
    /**
     * Whether to enable group-based filtered sync (also called scoped synchronisation). Defaults to `false`.
     */
    filteredSyncEnabled?: pulumi.Input<boolean>;
    /**
     * An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     */
    initialReplicaSet: pulumi.Input<inputs.domainservices.ServiceInitialReplicaSet>;
    /**
     * The Azure location where the Domain Service exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The display name for your managed Active Directory Domain Service resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `notifications` block as defined below.
     */
    notifications?: pulumi.Input<inputs.domainservices.ServiceNotifications>;
    /**
     * The name of the Resource Group in which the Domain Service should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `secureLdap` block as defined below.
     */
    secureLdap?: pulumi.Input<inputs.domainservices.ServiceSecureLdap>;
    /**
     * A `security` block as defined below.
     */
    security?: pulumi.Input<inputs.domainservices.ServiceSecurity>;
    /**
     * The SKU to use when provisioning the Domain Service resource. One of `Standard`, `Enterprise` or `Premium`.
     */
    sku: pulumi.Input<string>;
    /**
     * A mapping of tags assigned to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}