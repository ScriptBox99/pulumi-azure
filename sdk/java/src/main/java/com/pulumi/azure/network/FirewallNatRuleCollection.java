// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.FirewallNatRuleCollectionArgs;
import com.pulumi.azure.network.inputs.FirewallNatRuleCollectionState;
import com.pulumi.azure.network.outputs.FirewallNatRuleCollectionRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a NAT Rule Collection within an Azure Firewall.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .allocationMethod(&#34;Static&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleFirewall = new Firewall(&#34;exampleFirewall&#34;, FirewallArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;AZFW_VNet&#34;)
 *             .skuTier(&#34;Standard&#34;)
 *             .ipConfigurations(FirewallIpConfigurationArgs.builder()
 *                 .name(&#34;configuration&#34;)
 *                 .subnetId(exampleSubnet.id())
 *                 .publicIpAddressId(examplePublicIp.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleFirewallNatRuleCollection = new FirewallNatRuleCollection(&#34;exampleFirewallNatRuleCollection&#34;, FirewallNatRuleCollectionArgs.builder()        
 *             .azureFirewallName(exampleFirewall.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .priority(100)
 *             .action(&#34;Dnat&#34;)
 *             .rules(FirewallNatRuleCollectionRuleArgs.builder()
 *                 .name(&#34;testrule&#34;)
 *                 .sourceAddresses(&#34;10.0.0.0/16&#34;)
 *                 .destinationPorts(&#34;53&#34;)
 *                 .destinationAddresses(examplePublicIp.ipAddress())
 *                 .translatedPort(53)
 *                 .translatedAddress(&#34;8.8.8.8&#34;)
 *                 .protocols(                
 *                     &#34;TCP&#34;,
 *                     &#34;UDP&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Firewall NAT Rule Collections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/firewallNatRuleCollection:FirewallNatRuleCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/azureFirewalls/myfirewall/natRuleCollections/mycollection
 * ```
 * 
 */
@ResourceType(type="azure:network/firewallNatRuleCollection:FirewallNatRuleCollection")
public class FirewallNatRuleCollection extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the action the rule will apply to matching traffic. Possible values are `Dnat` and `Snat`.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return Specifies the action the rule will apply to matching traffic. Possible values are `Dnat` and `Snat`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * Specifies the name of the Firewall in which the NAT Rule Collection should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="azureFirewallName", type=String.class, parameters={})
    private Output<String> azureFirewallName;

    /**
     * @return Specifies the name of the Firewall in which the NAT Rule Collection should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> azureFirewallName() {
        return this.azureFirewallName;
    }
    /**
     * Specifies the name of the NAT Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the NAT Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `rule` blocks as defined below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={FirewallNatRuleCollectionRule.class})
    private Output<List<FirewallNatRuleCollectionRule>> rules;

    /**
     * @return One or more `rule` blocks as defined below.
     * 
     */
    public Output<List<FirewallNatRuleCollectionRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallNatRuleCollection(String name) {
        this(name, FirewallNatRuleCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallNatRuleCollection(String name, FirewallNatRuleCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallNatRuleCollection(String name, FirewallNatRuleCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/firewallNatRuleCollection:FirewallNatRuleCollection", name, args == null ? FirewallNatRuleCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallNatRuleCollection(String name, Output<String> id, @Nullable FirewallNatRuleCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/firewallNatRuleCollection:FirewallNatRuleCollection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FirewallNatRuleCollection get(String name, Output<String> id, @Nullable FirewallNatRuleCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallNatRuleCollection(name, id, state, options);
    }
}