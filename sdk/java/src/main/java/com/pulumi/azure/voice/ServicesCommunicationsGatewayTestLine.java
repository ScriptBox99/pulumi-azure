// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.voice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.voice.ServicesCommunicationsGatewayTestLineArgs;
import com.pulumi.azure.voice.inputs.ServicesCommunicationsGatewayTestLineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Voice Services Communications Gateway Test Line.
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
 * import com.pulumi.azure.voice.ServicesCommunicationsGateway;
 * import com.pulumi.azure.voice.ServicesCommunicationsGatewayArgs;
 * import com.pulumi.azure.voice.ServicesCommunicationsGatewayTestLine;
 * import com.pulumi.azure.voice.ServicesCommunicationsGatewayTestLineArgs;
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
 *             .location(&#34;West Central US&#34;)
 *             .build());
 * 
 *         var exampleServicesCommunicationsGateway = new ServicesCommunicationsGateway(&#34;exampleServicesCommunicationsGateway&#34;, ServicesCommunicationsGatewayArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleServicesCommunicationsGatewayTestLine = new ServicesCommunicationsGatewayTestLine(&#34;exampleServicesCommunicationsGatewayTestLine&#34;, ServicesCommunicationsGatewayTestLineArgs.builder()        
 *             .location(&#34;West Central US&#34;)
 *             .voiceServicesCommunicationsGatewayId(exampleServicesCommunicationsGateway.id())
 *             .phoneNumber(&#34;123456789&#34;)
 *             .purpose(&#34;Automated&#34;)
 *             .tags(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Voice Services Communications Gateway Test Line can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:voice/servicesCommunicationsGatewayTestLine:ServicesCommunicationsGatewayTestLine example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.VoiceServices/communicationsGateways/communicationsGateway1/testLines/testLine1
 * ```
 * 
 */
@ResourceType(type="azure:voice/servicesCommunicationsGatewayTestLine:ServicesCommunicationsGatewayTestLine")
public class ServicesCommunicationsGatewayTestLine extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Azure Region where the Voice Services Communications Gateway Test Line should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Voice Services Communications Gateway Test Line should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Voice Services Communications Gateway Test Line. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Voice Services Communications Gateway Test Line. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the phone number.
     * 
     */
    @Export(name="phoneNumber", refs={String.class}, tree="[0]")
    private Output<String> phoneNumber;

    /**
     * @return Specifies the phone number.
     * 
     */
    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * The purpose of the Voice Services Communications Gateway Test Line. Possible values are `Automated` or `Manual`.
     * 
     */
    @Export(name="purpose", refs={String.class}, tree="[0]")
    private Output<String> purpose;

    /**
     * @return The purpose of the Voice Services Communications Gateway Test Line. Possible values are `Automated` or `Manual`.
     * 
     */
    public Output<String> purpose() {
        return this.purpose;
    }
    /**
     * A mapping of tags which should be assigned to the Voice Services Communications Gateway Test Line.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Voice Services Communications Gateway Test Line.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the ID of the Voice Services Communications Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="voiceServicesCommunicationsGatewayId", refs={String.class}, tree="[0]")
    private Output<String> voiceServicesCommunicationsGatewayId;

    /**
     * @return Specifies the ID of the Voice Services Communications Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> voiceServicesCommunicationsGatewayId() {
        return this.voiceServicesCommunicationsGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicesCommunicationsGatewayTestLine(String name) {
        this(name, ServicesCommunicationsGatewayTestLineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicesCommunicationsGatewayTestLine(String name, ServicesCommunicationsGatewayTestLineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicesCommunicationsGatewayTestLine(String name, ServicesCommunicationsGatewayTestLineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:voice/servicesCommunicationsGatewayTestLine:ServicesCommunicationsGatewayTestLine", name, args == null ? ServicesCommunicationsGatewayTestLineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicesCommunicationsGatewayTestLine(String name, Output<String> id, @Nullable ServicesCommunicationsGatewayTestLineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:voice/servicesCommunicationsGatewayTestLine:ServicesCommunicationsGatewayTestLine", name, state, makeResourceOptions(options, id));
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
    public static ServicesCommunicationsGatewayTestLine get(String name, Output<String> id, @Nullable ServicesCommunicationsGatewayTestLineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicesCommunicationsGatewayTestLine(name, id, state, options);
    }
}