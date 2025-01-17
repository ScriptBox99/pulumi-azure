// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack.
 *
 * ## Import
 *
 * Palo Alto Next Generation Firewall Virtual Network Local Rulestacks can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVNetRulestackFW
 * ```
 */
export class NextGenerationFirewallVirtualNetworkLocalRulestack extends pulumi.CustomResource {
    /**
     * Get an existing NextGenerationFirewallVirtualNetworkLocalRulestack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NextGenerationFirewallVirtualNetworkLocalRulestackState, opts?: pulumi.CustomResourceOptions): NextGenerationFirewallVirtualNetworkLocalRulestack {
        return new NextGenerationFirewallVirtualNetworkLocalRulestack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack';

    /**
     * Returns true if the given object is an instance of NextGenerationFirewallVirtualNetworkLocalRulestack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NextGenerationFirewallVirtualNetworkLocalRulestack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NextGenerationFirewallVirtualNetworkLocalRulestack.__pulumiType;
    }

    /**
     * One or more `destinationNat` blocks as defined below.
     */
    public readonly destinationNats!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat[] | undefined>;
    /**
     * A `dnsSettings` block as defined below.
     */
    public readonly dnsSettings!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings | undefined>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    public readonly networkProfile!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     */
    public readonly rulestackId!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a NextGenerationFirewallVirtualNetworkLocalRulestack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NextGenerationFirewallVirtualNetworkLocalRulestackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NextGenerationFirewallVirtualNetworkLocalRulestackArgs | NextGenerationFirewallVirtualNetworkLocalRulestackState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NextGenerationFirewallVirtualNetworkLocalRulestackState | undefined;
            resourceInputs["destinationNats"] = state ? state.destinationNats : undefined;
            resourceInputs["dnsSettings"] = state ? state.dnsSettings : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkProfile"] = state ? state.networkProfile : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["rulestackId"] = state ? state.rulestackId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NextGenerationFirewallVirtualNetworkLocalRulestackArgs | undefined;
            if ((!args || args.networkProfile === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkProfile'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.rulestackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rulestackId'");
            }
            resourceInputs["destinationNats"] = args ? args.destinationNats : undefined;
            resourceInputs["dnsSettings"] = args ? args.dnsSettings : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkProfile"] = args ? args.networkProfile : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["rulestackId"] = args ? args.rulestackId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NextGenerationFirewallVirtualNetworkLocalRulestack.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NextGenerationFirewallVirtualNetworkLocalRulestack resources.
 */
export interface NextGenerationFirewallVirtualNetworkLocalRulestackState {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     */
    rulestackId?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a NextGenerationFirewallVirtualNetworkLocalRulestack resource.
 */
export interface NextGenerationFirewallVirtualNetworkLocalRulestackArgs {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     */
    rulestackId: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
