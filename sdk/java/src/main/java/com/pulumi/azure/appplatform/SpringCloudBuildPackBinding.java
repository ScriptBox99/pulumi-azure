// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingState;
import com.pulumi.azure.appplatform.outputs.SpringCloudBuildPackBindingLaunch;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spring Cloud Buildpack Binding.
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
 *         var exampleSpringCloudService = new SpringCloudService(&#34;exampleSpringCloudService&#34;, SpringCloudServiceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .skuName(&#34;E0&#34;)
 *             .build());
 * 
 *         var exampleSpringCloudBuilder = new SpringCloudBuilder(&#34;exampleSpringCloudBuilder&#34;, SpringCloudBuilderArgs.builder()        
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .buildPackGroups(SpringCloudBuilderBuildPackGroupArgs.builder()
 *                 .name(&#34;mix&#34;)
 *                 .buildPackIds(&#34;tanzu-buildpacks/java-azure&#34;)
 *                 .build())
 *             .stack(SpringCloudBuilderStackArgs.builder()
 *                 .id(&#34;io.buildpacks.stacks.bionic&#34;)
 *                 .version(&#34;base&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleSpringCloudBuildPackBinding = new SpringCloudBuildPackBinding(&#34;exampleSpringCloudBuildPackBinding&#34;, SpringCloudBuildPackBindingArgs.builder()        
 *             .springCloudBuilderId(exampleSpringCloudBuilder.id())
 *             .bindingType(&#34;ApplicationInsights&#34;)
 *             .launch(SpringCloudBuildPackBindingLaunchArgs.builder()
 *                 .properties(Map.ofEntries(
 *                     Map.entry(&#34;abc&#34;, &#34;def&#34;),
 *                     Map.entry(&#34;any-string&#34;, &#34;any-string&#34;),
 *                     Map.entry(&#34;sampling-rate&#34;, &#34;12.0&#34;)
 *                 ))
 *                 .secrets(Map.of(&#34;connection-string&#34;, &#34;XXXXXXXXXXXXXXXXX=XXXXXXXXXXXXX-XXXXXXXXXXXXXXXXXXX;XXXXXXXXXXXXXXXXX=XXXXXXXXXXXXXXXXXXX&#34;))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spring Cloud Buildpack Bindings can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudBuildPackBinding:SpringCloudBuildPackBinding example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/Spring/service1/buildServices/buildService1/builders/builder1/buildpackBindings/buildpackBinding1
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudBuildPackBinding:SpringCloudBuildPackBinding")
public class SpringCloudBuildPackBinding extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Buildpack Binding Type. Allowed values are `ApacheSkyWalking`, `AppDynamics`, `ApplicationInsights`, `Dynatrace`, `ElasticAPM` and `NewRelic`.
     * 
     */
    @Export(name="bindingType", type=String.class, parameters={})
    private Output</* @Nullable */ String> bindingType;

    /**
     * @return Specifies the Buildpack Binding Type. Allowed values are `ApacheSkyWalking`, `AppDynamics`, `ApplicationInsights`, `Dynatrace`, `ElasticAPM` and `NewRelic`.
     * 
     */
    public Output<Optional<String>> bindingType() {
        return Codegen.optional(this.bindingType);
    }
    /**
     * A `launch` block as defined below.
     * 
     */
    @Export(name="launch", type=SpringCloudBuildPackBindingLaunch.class, parameters={})
    private Output</* @Nullable */ SpringCloudBuildPackBindingLaunch> launch;

    /**
     * @return A `launch` block as defined below.
     * 
     */
    public Output<Optional<SpringCloudBuildPackBindingLaunch>> launch() {
        return Codegen.optional(this.launch);
    }
    /**
     * The name which should be used for this Spring Cloud Buildpack Binding. Changing this forces a new Spring Cloud Buildpack Binding to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Buildpack Binding. Changing this forces a new Spring Cloud Buildpack Binding to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Spring Cloud Builder. Changing this forces a new Spring Cloud Buildpack Binding to be created.
     * 
     */
    @Export(name="springCloudBuilderId", type=String.class, parameters={})
    private Output<String> springCloudBuilderId;

    /**
     * @return The ID of the Spring Cloud Builder. Changing this forces a new Spring Cloud Buildpack Binding to be created.
     * 
     */
    public Output<String> springCloudBuilderId() {
        return this.springCloudBuilderId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudBuildPackBinding(String name) {
        this(name, SpringCloudBuildPackBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudBuildPackBinding(String name, SpringCloudBuildPackBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudBuildPackBinding(String name, SpringCloudBuildPackBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudBuildPackBinding:SpringCloudBuildPackBinding", name, args == null ? SpringCloudBuildPackBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpringCloudBuildPackBinding(String name, Output<String> id, @Nullable SpringCloudBuildPackBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudBuildPackBinding:SpringCloudBuildPackBinding", name, state, makeResourceOptions(options, id));
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
    public static SpringCloudBuildPackBinding get(String name, Output<String> id, @Nullable SpringCloudBuildPackBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudBuildPackBinding(name, id, state, options);
    }
}