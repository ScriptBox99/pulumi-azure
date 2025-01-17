// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class FlexibleServerActiveDirectoryAdministratory extends pulumi.CustomResource {
    /**
     * Get an existing FlexibleServerActiveDirectoryAdministratory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlexibleServerActiveDirectoryAdministratoryState, opts?: pulumi.CustomResourceOptions): FlexibleServerActiveDirectoryAdministratory {
        return new FlexibleServerActiveDirectoryAdministratory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mysql/flexibleServerActiveDirectoryAdministratory:FlexibleServerActiveDirectoryAdministratory';

    /**
     * Returns true if the given object is an instance of FlexibleServerActiveDirectoryAdministratory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlexibleServerActiveDirectoryAdministratory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlexibleServerActiveDirectoryAdministratory.__pulumiType;
    }

    public readonly identityId!: pulumi.Output<string>;
    public readonly login!: pulumi.Output<string>;
    public readonly objectId!: pulumi.Output<string>;
    public readonly serverId!: pulumi.Output<string>;
    public readonly tenantId!: pulumi.Output<string>;

    /**
     * Create a FlexibleServerActiveDirectoryAdministratory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlexibleServerActiveDirectoryAdministratoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlexibleServerActiveDirectoryAdministratoryArgs | FlexibleServerActiveDirectoryAdministratoryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlexibleServerActiveDirectoryAdministratoryState | undefined;
            resourceInputs["identityId"] = state ? state.identityId : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["objectId"] = state ? state.objectId : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["tenantId"] = state ? state.tenantId : undefined;
        } else {
            const args = argsOrState as FlexibleServerActiveDirectoryAdministratoryArgs | undefined;
            if ((!args || args.identityId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityId'");
            }
            if ((!args || args.login === undefined) && !opts.urn) {
                throw new Error("Missing required property 'login'");
            }
            if ((!args || args.objectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'objectId'");
            }
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            if ((!args || args.tenantId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantId'");
            }
            resourceInputs["identityId"] = args ? args.identityId : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["objectId"] = args ? args.objectId : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["tenantId"] = args ? args.tenantId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "azure:mysql/flexibleServerActiveDirectoryAdministrator:FlexibleServerActiveDirectoryAdministrator" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(FlexibleServerActiveDirectoryAdministratory.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlexibleServerActiveDirectoryAdministratory resources.
 */
export interface FlexibleServerActiveDirectoryAdministratoryState {
    identityId?: pulumi.Input<string>;
    login?: pulumi.Input<string>;
    objectId?: pulumi.Input<string>;
    serverId?: pulumi.Input<string>;
    tenantId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlexibleServerActiveDirectoryAdministratory resource.
 */
export interface FlexibleServerActiveDirectoryAdministratoryArgs {
    identityId: pulumi.Input<string>;
    login: pulumi.Input<string>;
    objectId: pulumi.Input<string>;
    serverId: pulumi.Input<string>;
    tenantId: pulumi.Input<string>;
}
