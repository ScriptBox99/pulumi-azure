// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.ExpressRouteGatewayArgs;
import com.pulumi.azure.network.inputs.ExpressRouteGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an ExpressRoute gateway.
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
 *         var exampleVirtualWan = new VirtualWan(&#34;exampleVirtualWan&#34;, VirtualWanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleVirtualHub = new VirtualHub(&#34;exampleVirtualHub&#34;, VirtualHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .virtualWanId(exampleVirtualWan.id())
 *             .addressPrefix(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var exampleExpressRouteGateway = new ExpressRouteGateway(&#34;exampleExpressRouteGateway&#34;, ExpressRouteGatewayArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .virtualHubId(exampleVirtualHub.id())
 *             .scaleUnits(1)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ExpressRoute Gateways can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/expressRouteGateway:ExpressRouteGateway example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/expressRouteGateways/myExpressRouteGateway
 * ```
 * 
 */
@ResourceType(type="azure:network/expressRouteGateway:ExpressRouteGateway")
public class ExpressRouteGateway extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The number of scale units with which to provision the ExpressRoute gateway. Each scale unit is equal to 2Gbps, with support for up to 10 scale units (20Gbps).
     * 
     */
    @Export(name="scaleUnits", type=Integer.class, parameters={})
    private Output<Integer> scaleUnits;

    /**
     * @return The number of scale units with which to provision the ExpressRoute gateway. Each scale unit is equal to 2Gbps, with support for up to 10 scale units (20Gbps).
     * 
     */
    public Output<Integer> scaleUnits() {
        return this.scaleUnits;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of a Virtual HUB within which the ExpressRoute gateway should be created.
     * 
     */
    @Export(name="virtualHubId", type=String.class, parameters={})
    private Output<String> virtualHubId;

    /**
     * @return The ID of a Virtual HUB within which the ExpressRoute gateway should be created.
     * 
     */
    public Output<String> virtualHubId() {
        return this.virtualHubId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressRouteGateway(String name) {
        this(name, ExpressRouteGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteGateway(String name, ExpressRouteGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteGateway(String name, ExpressRouteGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteGateway:ExpressRouteGateway", name, args == null ? ExpressRouteGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressRouteGateway(String name, Output<String> id, @Nullable ExpressRouteGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteGateway:ExpressRouteGateway", name, state, makeResourceOptions(options, id));
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
    public static ExpressRouteGateway get(String name, Output<String> id, @Nullable ExpressRouteGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteGateway(name, id, state, options);
    }
}