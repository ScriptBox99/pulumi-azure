// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.IPGroupCIDRArgs;
import com.pulumi.azure.network.inputs.IPGroupCIDRState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages IP Group CIDR records.
 * 
 * &gt; Warning Do not use this resource at the same time as the `cidrs` property of the
 * `azure.network.IPGroup` resource for the same IP Group. Doing so will cause a conflict and
 * CIDRS will be removed.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.IPGroup;
 * import com.pulumi.azure.network.IPGroupArgs;
 * import com.pulumi.azure.network.IPGroupCIDR;
 * import com.pulumi.azure.network.IPGroupCIDRArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
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
 *         var exampleIPGroup = new IPGroup(&#34;exampleIPGroup&#34;, IPGroupArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .build());
 * 
 *         var exampleIPGroupCIDR = new IPGroupCIDR(&#34;exampleIPGroupCIDR&#34;, IPGroupCIDRArgs.builder()        
 *             .ipGroupId(exampleIPGroup.id())
 *             .cidr(&#34;10.10.10.0/24&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IP Group CIDRs can be imported using the `resource id` of the IP Group and the CIDR value (`/` characters have to be replaced by `_`), e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/iPGroupCIDR:IPGroupCIDR example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/ipGroups/test-ipgroup/cidrs/10.1.0.0_24
 * ```
 * 
 */
@ResourceType(type="azure:network/iPGroupCIDR:IPGroupCIDR")
public class IPGroupCIDR extends com.pulumi.resources.CustomResource {
    /**
     * The `CIDR` that should be added to the IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    /**
     * @return The `CIDR` that should be added to the IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * The ID of the destination IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    @Export(name="ipGroupId", refs={String.class}, tree="[0]")
    private Output<String> ipGroupId;

    /**
     * @return The ID of the destination IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    public Output<String> ipGroupId() {
        return this.ipGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPGroupCIDR(String name) {
        this(name, IPGroupCIDRArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPGroupCIDR(String name, IPGroupCIDRArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPGroupCIDR(String name, IPGroupCIDRArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/iPGroupCIDR:IPGroupCIDR", name, args == null ? IPGroupCIDRArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IPGroupCIDR(String name, Output<String> id, @Nullable IPGroupCIDRState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/iPGroupCIDR:IPGroupCIDR", name, state, makeResourceOptions(options, id));
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
    public static IPGroupCIDR get(String name, Output<String> id, @Nullable IPGroupCIDRState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IPGroupCIDR(name, id, state, options);
    }
}