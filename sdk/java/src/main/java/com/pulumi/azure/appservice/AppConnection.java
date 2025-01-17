// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.AppConnectionArgs;
import com.pulumi.azure.appservice.inputs.AppConnectionState;
import com.pulumi.azure.appservice.outputs.AppConnectionAuthentication;
import com.pulumi.azure.appservice.outputs.AppConnectionSecretStore;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a service connector for function app.
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
 * import com.pulumi.azure.cosmosdb.Account;
 * import com.pulumi.azure.cosmosdb.AccountArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs;
 * import com.pulumi.azure.cosmosdb.SqlDatabase;
 * import com.pulumi.azure.cosmosdb.SqlDatabaseArgs;
 * import com.pulumi.azure.cosmosdb.SqlContainer;
 * import com.pulumi.azure.cosmosdb.SqlContainerArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.appservice.ServicePlan;
 * import com.pulumi.azure.appservice.ServicePlanArgs;
 * import com.pulumi.azure.appservice.FunctionApp;
 * import com.pulumi.azure.appservice.FunctionAppArgs;
 * import com.pulumi.azure.appservice.AppConnection;
 * import com.pulumi.azure.appservice.AppConnectionArgs;
 * import com.pulumi.azure.appservice.inputs.AppConnectionAuthenticationArgs;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .offerType(&#34;Standard&#34;)
 *             .kind(&#34;GlobalDocumentDB&#34;)
 *             .consistencyPolicy(AccountConsistencyPolicyArgs.builder()
 *                 .consistencyLevel(&#34;BoundedStaleness&#34;)
 *                 .maxIntervalInSeconds(10)
 *                 .maxStalenessPrefix(200)
 *                 .build())
 *             .geoLocations(AccountGeoLocationArgs.builder()
 *                 .location(exampleResourceGroup.location())
 *                 .failoverPriority(0)
 *                 .build())
 *             .build());
 * 
 *         var exampleSqlDatabase = new SqlDatabase(&#34;exampleSqlDatabase&#34;, SqlDatabaseArgs.builder()        
 *             .resourceGroupName(exampleAccount.resourceGroupName())
 *             .accountName(exampleAccount.name())
 *             .throughput(400)
 *             .build());
 * 
 *         var exampleSqlContainer = new SqlContainer(&#34;exampleSqlContainer&#34;, SqlContainerArgs.builder()        
 *             .resourceGroupName(exampleAccount.resourceGroupName())
 *             .accountName(exampleAccount.name())
 *             .databaseName(exampleSqlDatabase.name())
 *             .partitionKeyPath(&#34;/definition&#34;)
 *             .build());
 * 
 *         var exampleStorage_accountAccount = new Account(&#34;exampleStorage/accountAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;P1v2&#34;)
 *             .osType(&#34;Linux&#34;)
 *             .build());
 * 
 *         var test = new FunctionApp(&#34;test&#34;, FunctionAppArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .appServicePlanId(azurerm_app_service_plan.test().id())
 *             .storageAccountName(azurerm_storage_account.test().name())
 *             .storageAccountAccessKey(azurerm_storage_account.test().primary_access_key())
 *             .build());
 * 
 *         var exampleAppConnection = new AppConnection(&#34;exampleAppConnection&#34;, AppConnectionArgs.builder()        
 *             .functionAppId(azurerm_function_app.example().id())
 *             .targetResourceId(azurerm_cosmosdb_account.test().id())
 *             .authentication(AppConnectionAuthenticationArgs.builder()
 *                 .type(&#34;systemAssignedIdentity&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Connector for app service can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/appConnection:AppConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/sites/webapp/providers/Microsoft.ServiceLinker/linkers/serviceconnector1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/appConnection:AppConnection")
public class AppConnection extends com.pulumi.resources.CustomResource {
    /**
     * The authentication info. An `authentication` block as defined below.
     * 
     * &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     * 
     */
    @Export(name="authentication", refs={AppConnectionAuthentication.class}, tree="[0]")
    private Output<AppConnectionAuthentication> authentication;

    /**
     * @return The authentication info. An `authentication` block as defined below.
     * 
     * &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     * 
     */
    public Output<AppConnectionAuthentication> authentication() {
        return this.authentication;
    }
    /**
     * The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
     * 
     */
    @Export(name="clientType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientType;

    /**
     * @return The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
     * 
     */
    public Output<Optional<String>> clientType() {
        return Codegen.optional(this.clientType);
    }
    /**
     * The ID of the data source function app. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="functionAppId", refs={String.class}, tree="[0]")
    private Output<String> functionAppId;

    /**
     * @return The ID of the data source function app. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> functionAppId() {
        return this.functionAppId;
    }
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the service connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An option to store secret value in secure place. An `secret_store` block as defined below.
     * 
     */
    @Export(name="secretStore", refs={AppConnectionSecretStore.class}, tree="[0]")
    private Output</* @Nullable */ AppConnectionSecretStore> secretStore;

    /**
     * @return An option to store secret value in secure place. An `secret_store` block as defined below.
     * 
     */
    public Output<Optional<AppConnectionSecretStore>> secretStore() {
        return Codegen.optional(this.secretStore);
    }
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
     * 
     */
    @Export(name="targetResourceId", refs={String.class}, tree="[0]")
    private Output<String> targetResourceId;

    /**
     * @return The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }
    /**
     * The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
     * 
     */
    @Export(name="vnetSolution", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vnetSolution;

    /**
     * @return The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
     * 
     */
    public Output<Optional<String>> vnetSolution() {
        return Codegen.optional(this.vnetSolution);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppConnection(String name) {
        this(name, AppConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppConnection(String name, AppConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppConnection(String name, AppConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/appConnection:AppConnection", name, args == null ? AppConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppConnection(String name, Output<String> id, @Nullable AppConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/appConnection:AppConnection", name, state, makeResourceOptions(options, id));
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
    public static AppConnection get(String name, Output<String> id, @Nullable AppConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppConnection(name, id, state, options);
    }
}
