// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxiiArgs;
import com.pulumi.azure.sentinel.inputs.DataConnectorThreatIntelligenceTaxiiState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Threat Intelligence TAXII Data Connector.
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
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
 * import com.pulumi.azure.operationalinsights.AnalyticsSolution;
 * import com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs;
 * import com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs;
 * import com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxii;
 * import com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxiiArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;PerGB2018&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsSolution = new AnalyticsSolution(&#34;exampleAnalyticsSolution&#34;, AnalyticsSolutionArgs.builder()        
 *             .solutionName(&#34;SecurityInsights&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.id())
 *             .workspaceName(exampleAnalyticsWorkspace.name())
 *             .plan(AnalyticsSolutionPlanArgs.builder()
 *                 .publisher(&#34;Microsoft&#34;)
 *                 .product(&#34;OMSGallery/SecurityInsights&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleDataConnectorThreatIntelligenceTaxii = new DataConnectorThreatIntelligenceTaxii(&#34;exampleDataConnectorThreatIntelligenceTaxii&#34;, DataConnectorThreatIntelligenceTaxiiArgs.builder()        
 *             .logAnalyticsWorkspaceId(exampleAnalyticsSolution.workspaceResourceId())
 *             .displayName(&#34;example&#34;)
 *             .apiRootUrl(&#34;https://foo/taxii2/api2/&#34;)
 *             .collectionId(&#34;someid&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(azurerm_log_analytics_solution.test())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Threat Intelligence TAXII Data Connectors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:sentinel/dataConnectorThreatIntelligenceTaxii:DataConnectorThreatIntelligenceTaxii example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/dataConnectorThreatIntelligenceTaxii:DataConnectorThreatIntelligenceTaxii")
public class DataConnectorThreatIntelligenceTaxii extends com.pulumi.resources.CustomResource {
    /**
     * The API root URI of the TAXII server.
     * 
     */
    @Export(name="apiRootUrl", type=String.class, parameters={})
    private Output<String> apiRootUrl;

    /**
     * @return The API root URI of the TAXII server.
     * 
     */
    public Output<String> apiRootUrl() {
        return this.apiRootUrl;
    }
    /**
     * The collection ID of the TAXII server.
     * 
     */
    @Export(name="collectionId", type=String.class, parameters={})
    private Output<String> collectionId;

    /**
     * @return The collection ID of the TAXII server.
     * 
     */
    public Output<String> collectionId() {
        return this.collectionId;
    }
    /**
     * The friendly name which should be used for this Threat Intelligence TAXII Data Connector.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The friendly name which should be used for this Threat Intelligence TAXII Data Connector.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The ID of the Log Analytics Workspace that this Threat Intelligence TAXII Data Connector resides in. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", type=String.class, parameters={})
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this Threat Intelligence TAXII Data Connector resides in. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * The lookback date for the TAXII server in RFC3339. Defaults to `1970-01-01T00:00:00Z`.
     * 
     */
    @Export(name="lookbackDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> lookbackDate;

    /**
     * @return The lookback date for the TAXII server in RFC3339. Defaults to `1970-01-01T00:00:00Z`.
     * 
     */
    public Output<Optional<String>> lookbackDate() {
        return Codegen.optional(this.lookbackDate);
    }
    /**
     * The name which should be used for this Threat Intelligence TAXII Data Connector. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Threat Intelligence TAXII Data Connector. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The password for the TAXII server.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return The password for the TAXII server.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The polling frequency for the TAXII server. Possible values are `OnceAMinute`, `OnceAnHour` and `OnceADay`. Defaults to `OnceAnHour`.
     * 
     */
    @Export(name="pollingFrequency", type=String.class, parameters={})
    private Output</* @Nullable */ String> pollingFrequency;

    /**
     * @return The polling frequency for the TAXII server. Possible values are `OnceAMinute`, `OnceAnHour` and `OnceADay`. Defaults to `OnceAnHour`.
     * 
     */
    public Output<Optional<String>> pollingFrequency() {
        return Codegen.optional(this.pollingFrequency);
    }
    /**
     * The ID of the tenant that this Threat Intelligence TAXII Data Connector connects to. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The ID of the tenant that this Threat Intelligence TAXII Data Connector connects to. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }
    /**
     * The user name for the TAXII server.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return The user name for the TAXII server.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataConnectorThreatIntelligenceTaxii(String name) {
        this(name, DataConnectorThreatIntelligenceTaxiiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataConnectorThreatIntelligenceTaxii(String name, DataConnectorThreatIntelligenceTaxiiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataConnectorThreatIntelligenceTaxii(String name, DataConnectorThreatIntelligenceTaxiiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorThreatIntelligenceTaxii:DataConnectorThreatIntelligenceTaxii", name, args == null ? DataConnectorThreatIntelligenceTaxiiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataConnectorThreatIntelligenceTaxii(String name, Output<String> id, @Nullable DataConnectorThreatIntelligenceTaxiiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorThreatIntelligenceTaxii:DataConnectorThreatIntelligenceTaxii", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password",
                "userName"
            ))
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
    public static DataConnectorThreatIntelligenceTaxii get(String name, Output<String> id, @Nullable DataConnectorThreatIntelligenceTaxiiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataConnectorThreatIntelligenceTaxii(name, id, state, options);
    }
}