// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.DomainArgs;
import com.pulumi.azure.eventhub.inputs.DomainState;
import com.pulumi.azure.eventhub.outputs.DomainIdentity;
import com.pulumi.azure.eventhub.outputs.DomainInboundIpRule;
import com.pulumi.azure.eventhub.outputs.DomainInputMappingDefaultValues;
import com.pulumi.azure.eventhub.outputs.DomainInputMappingFields;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EventGrid Domain
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
 *         var exampleDomain = new Domain(&#34;exampleDomain&#34;, DomainArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EventGrid Domains can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/domain:Domain domain1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventGrid/domains/domain1
 * ```
 * 
 * @deprecated
 * azure.eventhub.Domain has been deprecated in favor of azure.eventgrid.Domain
 * 
 */
@Deprecated /* azure.eventhub.Domain has been deprecated in favor of azure.eventgrid.Domain */
@ResourceType(type="azure:eventhub/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * Whether to create the domain topic when the first event subscription at the scope of the domain topic is created. Defaults to `true`.
     * 
     */
    @Export(name="autoCreateTopicWithFirstSubscription", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoCreateTopicWithFirstSubscription;

    /**
     * @return Whether to create the domain topic when the first event subscription at the scope of the domain topic is created. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> autoCreateTopicWithFirstSubscription() {
        return Codegen.optional(this.autoCreateTopicWithFirstSubscription);
    }
    /**
     * Whether to delete the domain topic when the last event subscription at the scope of the domain topic is deleted. Defaults to `true`.
     * 
     */
    @Export(name="autoDeleteTopicWithLastSubscription", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoDeleteTopicWithLastSubscription;

    /**
     * @return Whether to delete the domain topic when the last event subscription at the scope of the domain topic is deleted. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> autoDeleteTopicWithLastSubscription() {
        return Codegen.optional(this.autoDeleteTopicWithLastSubscription);
    }
    /**
     * The Endpoint associated with the EventGrid Domain.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The Endpoint associated with the EventGrid Domain.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=DomainIdentity.class, parameters={})
    private Output</* @Nullable */ DomainIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<DomainIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    @Export(name="inboundIpRules", type=List.class, parameters={DomainInboundIpRule.class})
    private Output</* @Nullable */ List<DomainInboundIpRule>> inboundIpRules;

    /**
     * @return One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    public Output<Optional<List<DomainInboundIpRule>>> inboundIpRules() {
        return Codegen.optional(this.inboundIpRules);
    }
    /**
     * A `input_mapping_default_values` block as defined below.
     * 
     */
    @Export(name="inputMappingDefaultValues", type=DomainInputMappingDefaultValues.class, parameters={})
    private Output</* @Nullable */ DomainInputMappingDefaultValues> inputMappingDefaultValues;

    /**
     * @return A `input_mapping_default_values` block as defined below.
     * 
     */
    public Output<Optional<DomainInputMappingDefaultValues>> inputMappingDefaultValues() {
        return Codegen.optional(this.inputMappingDefaultValues);
    }
    /**
     * A `input_mapping_fields` block as defined below.
     * 
     */
    @Export(name="inputMappingFields", type=DomainInputMappingFields.class, parameters={})
    private Output</* @Nullable */ DomainInputMappingFields> inputMappingFields;

    /**
     * @return A `input_mapping_fields` block as defined below.
     * 
     */
    public Output<Optional<DomainInputMappingFields>> inputMappingFields() {
        return Codegen.optional(this.inputMappingFields);
    }
    /**
     * Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `eventgridschema`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="inputSchema", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputSchema;

    /**
     * @return Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `eventgridschema`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> inputSchema() {
        return Codegen.optional(this.inputSchema);
    }
    /**
     * Whether local authentication methods is enabled for the EventGrid Domain. Defaults to `true`.
     * 
     */
    @Export(name="localAuthEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> localAuthEnabled;

    /**
     * @return Whether local authentication methods is enabled for the EventGrid Domain. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> localAuthEnabled() {
        return Codegen.optional(this.localAuthEnabled);
    }
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
     * Specifies the name of the EventGrid Domain resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the EventGrid Domain resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Primary Shared Access Key associated with the EventGrid Domain.
     * 
     */
    @Export(name="primaryAccessKey", type=String.class, parameters={})
    private Output<String> primaryAccessKey;

    /**
     * @return The Primary Shared Access Key associated with the EventGrid Domain.
     * 
     */
    public Output<String> primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The name of the resource group in which the EventGrid Domain exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventGrid Domain exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Secondary Shared Access Key associated with the EventGrid Domain.
     * 
     */
    @Export(name="secondaryAccessKey", type=String.class, parameters={})
    private Output<String> secondaryAccessKey;

    /**
     * @return The Secondary Shared Access Key associated with the EventGrid Domain.
     * 
     */
    public Output<String> secondaryAccessKey() {
        return this.secondaryAccessKey;
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
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}