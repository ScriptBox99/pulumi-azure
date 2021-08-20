// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Custom Domain for a CDN Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "west europe"});
 * const exampleAccount = new azure.storage.Account("exampleAccount", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "GRS",
 * });
 * const exampleProfile = new azure.cdn.Profile("exampleProfile", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "Standard_Verizon",
 * });
 * const exampleEndpoint = new azure.cdn.Endpoint("exampleEndpoint", {
 *     profileName: exampleProfile.name,
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     origins: [{
 *         name: "example",
 *         hostName: exampleAccount.primaryBlobHost,
 *     }],
 * });
 * const exampleZone = azure.dns.getZone({
 *     name: "example-domain.com",
 *     resourceGroupName: "domain-rg",
 * });
 * const exampleCNameRecord = new azure.dns.CNameRecord("exampleCNameRecord", {
 *     zoneName: exampleZone.then(exampleZone => exampleZone.name),
 *     resourceGroupName: exampleZone.then(exampleZone => exampleZone.resourceGroupName),
 *     ttl: 3600,
 *     targetResourceId: exampleEndpoint.id,
 * });
 * const exampleEndpointCustomDomain = new azure.cdn.EndpointCustomDomain("exampleEndpointCustomDomain", {
 *     cdnEndpointId: exampleEndpoint.id,
 *     hostName: pulumi.all([exampleCNameRecord.name, exampleZone]).apply(([name, exampleZone]) => `${name}.${exampleZone.name}`),
 * });
 * ```
 *
 * ## Import
 *
 * CDN Endpoint Custom Domains can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:cdn/endpointCustomDomain:EndpointCustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/customDomains/domain1
 * ```
 */
export class EndpointCustomDomain extends pulumi.CustomResource {
    /**
     * Get an existing EndpointCustomDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EndpointCustomDomainState, opts?: pulumi.CustomResourceOptions): EndpointCustomDomain {
        return new EndpointCustomDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cdn/endpointCustomDomain:EndpointCustomDomain';

    /**
     * Returns true if the given object is an instance of EndpointCustomDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EndpointCustomDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EndpointCustomDomain.__pulumiType;
    }

    /**
     * The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    public readonly cdnEndpointId!: pulumi.Output<string>;
    /**
     * The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    public readonly hostName!: pulumi.Output<string>;
    /**
     * The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a EndpointCustomDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EndpointCustomDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EndpointCustomDomainArgs | EndpointCustomDomainState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EndpointCustomDomainState | undefined;
            inputs["cdnEndpointId"] = state ? state.cdnEndpointId : undefined;
            inputs["hostName"] = state ? state.hostName : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as EndpointCustomDomainArgs | undefined;
            if ((!args || args.cdnEndpointId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cdnEndpointId'");
            }
            if ((!args || args.hostName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostName'");
            }
            inputs["cdnEndpointId"] = args ? args.cdnEndpointId : undefined;
            inputs["hostName"] = args ? args.hostName : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EndpointCustomDomain.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EndpointCustomDomain resources.
 */
export interface EndpointCustomDomainState {
    /**
     * The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    cdnEndpointId?: pulumi.Input<string>;
    /**
     * The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    hostName?: pulumi.Input<string>;
    /**
     * The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EndpointCustomDomain resource.
 */
export interface EndpointCustomDomainArgs {
    /**
     * The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    cdnEndpointId: pulumi.Input<string>;
    /**
     * The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    hostName: pulumi.Input<string>;
    /**
     * The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     */
    name?: pulumi.Input<string>;
}