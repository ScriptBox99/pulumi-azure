// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.bot.ConnectionArgs;
import com.pulumi.azure.bot.inputs.ConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Bot Connection.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleChannelsRegistration = new ChannelsRegistration(&#34;exampleChannelsRegistration&#34;, ChannelsRegistrationArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;F0&#34;)
 *             .microsoftAppId(current.apply(getClientConfigResult -&gt; getClientConfigResult.clientId()))
 *             .build());
 * 
 *         var exampleConnection = new Connection(&#34;exampleConnection&#34;, ConnectionArgs.builder()        
 *             .botName(exampleChannelsRegistration.name())
 *             .location(exampleChannelsRegistration.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .serviceProviderName(&#34;box&#34;)
 *             .clientId(&#34;exampleId&#34;)
 *             .clientSecret(&#34;exampleSecret&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Bot Connection can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:bot/connection:Connection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example/connections/example
 * ```
 * 
 */
@ResourceType(type="azure:bot/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Bot Resource this connection will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="botName", type=String.class, parameters={})
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this connection will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }
    /**
     * The Client ID that will be used to authenticate with the service provider.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The Client ID that will be used to authenticate with the service provider.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The Client Secret that will be used to authenticate with the service provider.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return The Client Secret that will be used to authenticate with the service provider.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Bot Connection. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Bot Connection. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of additional parameters to apply to the connection.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of additional parameters to apply to the connection.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The name of the resource group in which to create the Bot Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Scopes at which the connection should be applied.
     * 
     */
    @Export(name="scopes", type=String.class, parameters={})
    private Output</* @Nullable */ String> scopes;

    /**
     * @return The Scopes at which the connection should be applied.
     * 
     */
    public Output<Optional<String>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * The name of the service provider that will be associated with this connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serviceProviderName", type=String.class, parameters={})
    private Output<String> serviceProviderName;

    /**
     * @return The name of the service provider that will be associated with this connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serviceProviderName() {
        return this.serviceProviderName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     * @deprecated
     * This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider.
     * 
     */
    @Deprecated /* This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider. */
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
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}