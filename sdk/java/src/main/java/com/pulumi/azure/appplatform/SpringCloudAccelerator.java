// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudAcceleratorArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudAcceleratorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **NOTE:** This resource is applicable only for Spring Cloud Service with enterprise tier.
 * 
 * Manages a Spring Cloud Accelerator.
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
 * import com.pulumi.azure.appplatform.SpringCloudService;
 * import com.pulumi.azure.appplatform.SpringCloudServiceArgs;
 * import com.pulumi.azure.appplatform.SpringCloudAccelerator;
 * import com.pulumi.azure.appplatform.SpringCloudAcceleratorArgs;
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
 *         var exampleSpringCloudService = new SpringCloudService(&#34;exampleSpringCloudService&#34;, SpringCloudServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;E0&#34;)
 *             .build());
 * 
 *         var exampleSpringCloudAccelerator = new SpringCloudAccelerator(&#34;exampleSpringCloudAccelerator&#34;, SpringCloudAcceleratorArgs.builder()        
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spring Cloud Accelerators can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudAccelerator:SpringCloudAccelerator example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/Spring/service1/applicationAccelerators/default
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudAccelerator:SpringCloudAccelerator")
public class SpringCloudAccelerator extends com.pulumi.resources.CustomResource {
    /**
     * The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
     * 
     */
    @Export(name="springCloudServiceId", type=String.class, parameters={})
    private Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
     * 
     */
    public Output<String> springCloudServiceId() {
        return this.springCloudServiceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudAccelerator(String name) {
        this(name, SpringCloudAcceleratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudAccelerator(String name, SpringCloudAcceleratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudAccelerator(String name, SpringCloudAcceleratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudAccelerator:SpringCloudAccelerator", name, args == null ? SpringCloudAcceleratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpringCloudAccelerator(String name, Output<String> id, @Nullable SpringCloudAcceleratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudAccelerator:SpringCloudAccelerator", name, state, makeResourceOptions(options, id));
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
    public static SpringCloudAccelerator get(String name, Output<String> id, @Nullable SpringCloudAcceleratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudAccelerator(name, id, state, options);
    }
}