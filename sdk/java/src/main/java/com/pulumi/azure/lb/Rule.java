// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.lb.RuleArgs;
import com.pulumi.azure.lb.inputs.RuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Load Balancer Rule.
 * 
 * &gt; **NOTE** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
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
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .allocationMethod(&#34;Static&#34;)
 *             .build());
 * 
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .frontendIpConfigurations(LoadBalancerFrontendIpConfigurationArgs.builder()
 *                 .name(&#34;PublicIPAddress&#34;)
 *                 .publicIpAddressId(examplePublicIp.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleRule = new Rule(&#34;exampleRule&#34;, RuleArgs.builder()        
 *             .loadbalancerId(exampleLoadBalancer.id())
 *             .protocol(&#34;Tcp&#34;)
 *             .frontendPort(3389)
 *             .backendPort(3389)
 *             .frontendIpConfigurationName(&#34;PublicIPAddress&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load Balancer Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:lb/rule:Rule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/loadBalancers/lb1/loadBalancingRules/rule1
 * ```
 * 
 */
@ResourceType(type="azure:lb/rule:Rule")
public class Rule extends com.pulumi.resources.CustomResource {
    /**
     * A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
     * 
     */
    @Export(name="backendAddressPoolIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> backendAddressPoolIds;

    /**
     * @return A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
     * 
     */
    public Output<Optional<List<String>>> backendAddressPoolIds() {
        return Codegen.optional(this.backendAddressPoolIds);
    }
    /**
     * The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
     * 
     */
    @Export(name="backendPort", type=Integer.class, parameters={})
    private Output<Integer> backendPort;

    /**
     * @return The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
     * 
     */
    public Output<Integer> backendPort() {
        return this.backendPort;
    }
    /**
     * Is snat enabled for this Load Balancer Rule? Default `false`.
     * 
     */
    @Export(name="disableOutboundSnat", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableOutboundSnat;

    /**
     * @return Is snat enabled for this Load Balancer Rule? Default `false`.
     * 
     */
    public Output<Optional<Boolean>> disableOutboundSnat() {
        return Codegen.optional(this.disableOutboundSnat);
    }
    /**
     * Are the Floating IPs enabled for this Load Balncer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    @Export(name="enableFloatingIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFloatingIp;

    /**
     * @return Are the Floating IPs enabled for this Load Balncer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableFloatingIp() {
        return Codegen.optional(this.enableFloatingIp);
    }
    /**
     * Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    @Export(name="enableTcpReset", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableTcpReset;

    /**
     * @return Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableTcpReset() {
        return Codegen.optional(this.enableTcpReset);
    }
    @Export(name="frontendIpConfigurationId", type=String.class, parameters={})
    private Output<String> frontendIpConfigurationId;

    public Output<String> frontendIpConfigurationId() {
        return this.frontendIpConfigurationId;
    }
    /**
     * The name of the frontend IP configuration to which the rule is associated.
     * 
     */
    @Export(name="frontendIpConfigurationName", type=String.class, parameters={})
    private Output<String> frontendIpConfigurationName;

    /**
     * @return The name of the frontend IP configuration to which the rule is associated.
     * 
     */
    public Output<String> frontendIpConfigurationName() {
        return this.frontendIpConfigurationName;
    }
    /**
     * The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
     * 
     */
    @Export(name="frontendPort", type=Integer.class, parameters={})
    private Output<Integer> frontendPort;

    /**
     * @return The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
     * 
     */
    public Output<Integer> frontendPort() {
        return this.frontendPort;
    }
    /**
     * Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
     * 
     */
    @Export(name="idleTimeoutInMinutes", type=Integer.class, parameters={})
    private Output<Integer> idleTimeoutInMinutes;

    /**
     * @return Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
     * 
     */
    public Output<Integer> idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }
    /**
     * Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where  the options are called `None`, `Client IP` and `Client IP and Protocol` respectively.
     * 
     */
    @Export(name="loadDistribution", type=String.class, parameters={})
    private Output<String> loadDistribution;

    /**
     * @return Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where  the options are called `None`, `Client IP` and `Client IP and Protocol` respectively.
     * 
     */
    public Output<String> loadDistribution() {
        return this.loadDistribution;
    }
    /**
     * The ID of the Load Balancer in which to create the Rule.
     * 
     */
    @Export(name="loadbalancerId", type=String.class, parameters={})
    private Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the Rule.
     * 
     */
    public Output<String> loadbalancerId() {
        return this.loadbalancerId;
    }
    /**
     * Specifies the name of the LB Rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the LB Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A reference to a Probe used by this Load Balancing Rule.
     * 
     */
    @Export(name="probeId", type=String.class, parameters={})
    private Output<String> probeId;

    /**
     * @return A reference to a Probe used by this Load Balancing Rule.
     * 
     */
    public Output<String> probeId() {
        return this.probeId;
    }
    /**
     * The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lb/rule:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lb/rule:Rule", name, state, makeResourceOptions(options, id));
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
    public static Rule get(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, state, options);
    }
}