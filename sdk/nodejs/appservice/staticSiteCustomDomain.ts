// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Static Site Custom Domains can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Web/staticSites/my-static-site1/customDomains/name.contoso.com
 * ```
 */
export class StaticSiteCustomDomain extends pulumi.CustomResource {
    /**
     * Get an existing StaticSiteCustomDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StaticSiteCustomDomainState, opts?: pulumi.CustomResourceOptions): StaticSiteCustomDomain {
        return new StaticSiteCustomDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain';

    /**
     * Returns true if the given object is an instance of StaticSiteCustomDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StaticSiteCustomDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StaticSiteCustomDomain.__pulumiType;
    }

    /**
     * The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
     */
    public readonly staticSiteId!: pulumi.Output<string>;
    /**
     * Token to be used with `dns-txt-token` validation.
     */
    public /*out*/ readonly validationToken!: pulumi.Output<string>;
    /**
     * One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
     */
    public readonly validationType!: pulumi.Output<string>;

    /**
     * Create a StaticSiteCustomDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StaticSiteCustomDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StaticSiteCustomDomainArgs | StaticSiteCustomDomainState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StaticSiteCustomDomainState | undefined;
            inputs["domainName"] = state ? state.domainName : undefined;
            inputs["staticSiteId"] = state ? state.staticSiteId : undefined;
            inputs["validationToken"] = state ? state.validationToken : undefined;
            inputs["validationType"] = state ? state.validationType : undefined;
        } else {
            const args = argsOrState as StaticSiteCustomDomainArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            if ((!args || args.staticSiteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'staticSiteId'");
            }
            if ((!args || args.validationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'validationType'");
            }
            inputs["domainName"] = args ? args.domainName : undefined;
            inputs["staticSiteId"] = args ? args.staticSiteId : undefined;
            inputs["validationType"] = args ? args.validationType : undefined;
            inputs["validationToken"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(StaticSiteCustomDomain.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StaticSiteCustomDomain resources.
 */
export interface StaticSiteCustomDomainState {
    /**
     * The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
     */
    staticSiteId?: pulumi.Input<string>;
    /**
     * Token to be used with `dns-txt-token` validation.
     */
    validationToken?: pulumi.Input<string>;
    /**
     * One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
     */
    validationType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StaticSiteCustomDomain resource.
 */
export interface StaticSiteCustomDomainArgs {
    /**
     * The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
     */
    domainName: pulumi.Input<string>;
    /**
     * The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
     */
    staticSiteId: pulumi.Input<string>;
    /**
     * One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
     */
    validationType: pulumi.Input<string>;
}