// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.healthcare.ServiceArgs;
import com.pulumi.azure.healthcare.inputs.ServiceState;
import com.pulumi.azure.healthcare.outputs.ServiceAuthenticationConfiguration;
import com.pulumi.azure.healthcare.outputs.ServiceCorsConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Healthcare Service.
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var example = new Service(&#34;example&#34;, ServiceArgs.builder()        
 *             .resourceGroupName(&#34;sample-resource-group&#34;)
 *             .location(&#34;westus2&#34;)
 *             .kind(&#34;fhir-R4&#34;)
 *             .cosmosdbThroughput(&#34;2000&#34;)
 *             .accessPolicyObjectIds(current.apply(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;environment&#34;, &#34;testenv&#34;),
 *                 Map.entry(&#34;purpose&#34;, &#34;AcceptanceTests&#34;)
 *             ))
 *             .authenticationConfiguration(ServiceAuthenticationConfigurationArgs.builder()
 *                 .authority(&#34;https://login.microsoftonline.com/$%7Bdata.azurerm_client_config.current.tenant_id%7D&#34;)
 *                 .audience(&#34;https://azurehealthcareapis.com/&#34;)
 *                 .smartProxyEnabled(&#34;true&#34;)
 *                 .build())
 *             .corsConfiguration(ServiceCorsConfigurationArgs.builder()
 *                 .allowedOrigins(                
 *                     &#34;http://www.example.com&#34;,
 *                     &#34;http://www.example2.com&#34;)
 *                 .allowedHeaders(                
 *                     &#34;x-tempo-*&#34;,
 *                     &#34;x-tempo2-*&#34;)
 *                 .allowedMethods(                
 *                     &#34;GET&#34;,
 *                     &#34;PUT&#34;)
 *                 .maxAgeInSeconds(&#34;500&#34;)
 *                 .allowCredentials(&#34;true&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Healthcare Service can be imported using the resource`id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:healthcare/service:Service example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource_group/providers/Microsoft.HealthcareApis/services/service_name
 * ```
 * 
 */
@ResourceType(type="azure:healthcare/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
    @Export(name="accessPolicyObjectIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> accessPolicyObjectIds;

    public Output<Optional<List<String>>> accessPolicyObjectIds() {
        return Codegen.optional(this.accessPolicyObjectIds);
    }
    /**
     * An `authentication_configuration` block as defined below.
     * 
     */
    @Export(name="authenticationConfiguration", type=ServiceAuthenticationConfiguration.class, parameters={})
    private Output<ServiceAuthenticationConfiguration> authenticationConfiguration;

    /**
     * @return An `authentication_configuration` block as defined below.
     * 
     */
    public Output<ServiceAuthenticationConfiguration> authenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    /**
     * A `cors_configuration` block as defined below.
     * 
     */
    @Export(name="corsConfiguration", type=ServiceCorsConfiguration.class, parameters={})
    private Output<ServiceCorsConfiguration> corsConfiguration;

    /**
     * @return A `cors_configuration` block as defined below.
     * 
     */
    public Output<ServiceCorsConfiguration> corsConfiguration() {
        return this.corsConfiguration;
    }
    /**
     * A versionless Key Vault Key ID for CMK encryption of the backing database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="cosmosdbKeyVaultKeyVersionlessId", type=String.class, parameters={})
    private Output</* @Nullable */ String> cosmosdbKeyVaultKeyVersionlessId;

    /**
     * @return A versionless Key Vault Key ID for CMK encryption of the backing database. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> cosmosdbKeyVaultKeyVersionlessId() {
        return Codegen.optional(this.cosmosdbKeyVaultKeyVersionlessId);
    }
    /**
     * The provisioned throughput for the backing database. Range of `400`-`10000`. Defaults to `400`.
     * 
     */
    @Export(name="cosmosdbThroughput", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cosmosdbThroughput;

    /**
     * @return The provisioned throughput for the backing database. Range of `400`-`10000`. Defaults to `400`.
     * 
     */
    public Output<Optional<Integer>> cosmosdbThroughput() {
        return Codegen.optional(this.cosmosdbThroughput);
    }
    /**
     * The type of the service. Values at time of publication are: `fhir`, `fhir-Stu3` and `fhir-R4`. Default value is `fhir`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The type of the service. Values at time of publication are: `fhir`, `fhir-Stu3` and `fhir-R4`. Default value is `fhir`.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Specifies the supported Azure Region where the Service should be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure Region where the Service should be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the service instance. Used for service endpoint, must be unique within the audience.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the service instance. Used for service endpoint, must be unique within the audience.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether public network access is enabled or disabled for this service instance.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether public network access is enabled or disabled for this service instance.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The name of the Resource Group in which to create the Service.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which to create the Service.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:healthcare/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:healthcare/service:Service", name, state, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}