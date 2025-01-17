// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService
{
    /// <summary>
    /// Manages a service connector for function app.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.CosmosDB.Account("exampleAccount", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         OfferType = "Standard",
    ///         Kind = "GlobalDocumentDB",
    ///         ConsistencyPolicy = new Azure.CosmosDB.Inputs.AccountConsistencyPolicyArgs
    ///         {
    ///             ConsistencyLevel = "BoundedStaleness",
    ///             MaxIntervalInSeconds = 10,
    ///             MaxStalenessPrefix = 200,
    ///         },
    ///         GeoLocations = new[]
    ///         {
    ///             new Azure.CosmosDB.Inputs.AccountGeoLocationArgs
    ///             {
    ///                 Location = exampleResourceGroup.Location,
    ///                 FailoverPriority = 0,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleSqlDatabase = new Azure.CosmosDB.SqlDatabase("exampleSqlDatabase", new()
    ///     {
    ///         ResourceGroupName = exampleAccount.ResourceGroupName,
    ///         AccountName = exampleAccount.Name,
    ///         Throughput = 400,
    ///     });
    /// 
    ///     var exampleSqlContainer = new Azure.CosmosDB.SqlContainer("exampleSqlContainer", new()
    ///     {
    ///         ResourceGroupName = exampleAccount.ResourceGroupName,
    ///         AccountName = exampleAccount.Name,
    ///         DatabaseName = exampleSqlDatabase.Name,
    ///         PartitionKeyPath = "/definition",
    ///     });
    /// 
    ///     var exampleStorage_accountAccount = new Azure.Storage.Account("exampleStorage/accountAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleServicePlan = new Azure.AppService.ServicePlan("exampleServicePlan", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         SkuName = "P1v2",
    ///         OsType = "Linux",
    ///     });
    /// 
    ///     var test = new Azure.AppService.FunctionApp("test", new()
    ///     {
    ///         Location = azurerm_resource_group.Test.Location,
    ///         ResourceGroupName = azurerm_resource_group.Test.Name,
    ///         AppServicePlanId = azurerm_app_service_plan.Test.Id,
    ///         StorageAccountName = azurerm_storage_account.Test.Name,
    ///         StorageAccountAccessKey = azurerm_storage_account.Test.Primary_access_key,
    ///     });
    /// 
    ///     var exampleAppConnection = new Azure.AppService.AppConnection("exampleAppConnection", new()
    ///     {
    ///         FunctionAppId = azurerm_function_app.Example.Id,
    ///         TargetResourceId = azurerm_cosmosdb_account.Test.Id,
    ///         Authentication = new Azure.AppService.Inputs.AppConnectionAuthenticationArgs
    ///         {
    ///             Type = "systemAssignedIdentity",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Service Connector for app service can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:appservice/appConnection:AppConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/sites/webapp/providers/Microsoft.ServiceLinker/linkers/serviceconnector1
    /// ```
    /// </summary>
    [AzureResourceType("azure:appservice/appConnection:AppConnection")]
    public partial class AppConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The authentication info. An `authentication` block as defined below.
        /// 
        /// &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
        /// </summary>
        [Output("authentication")]
        public Output<Outputs.AppConnectionAuthentication> Authentication { get; private set; } = null!;

        /// <summary>
        /// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
        /// </summary>
        [Output("clientType")]
        public Output<string?> ClientType { get; private set; } = null!;

        /// <summary>
        /// The ID of the data source function app. Changing this forces a new resource to be created.
        /// </summary>
        [Output("functionAppId")]
        public Output<string> FunctionAppId { get; private set; } = null!;

        /// <summary>
        /// The name of the service connection. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// An option to store secret value in secure place. An `secret_store` block as defined below.
        /// </summary>
        [Output("secretStore")]
        public Output<Outputs.AppConnectionSecretStore?> SecretStore { get; private set; } = null!;

        /// <summary>
        /// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
        /// </summary>
        [Output("targetResourceId")]
        public Output<string> TargetResourceId { get; private set; } = null!;

        /// <summary>
        /// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
        /// </summary>
        [Output("vnetSolution")]
        public Output<string?> VnetSolution { get; private set; } = null!;


        /// <summary>
        /// Create a AppConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppConnection(string name, AppConnectionArgs args, CustomResourceOptions? options = null)
            : base("azure:appservice/appConnection:AppConnection", name, args ?? new AppConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppConnection(string name, Input<string> id, AppConnectionState? state = null, CustomResourceOptions? options = null)
            : base("azure:appservice/appConnection:AppConnection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AppConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppConnection Get(string name, Input<string> id, AppConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new AppConnection(name, id, state, options);
        }
    }

    public sealed class AppConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication info. An `authentication` block as defined below.
        /// 
        /// &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
        /// </summary>
        [Input("authentication", required: true)]
        public Input<Inputs.AppConnectionAuthenticationArgs> Authentication { get; set; } = null!;

        /// <summary>
        /// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
        /// </summary>
        [Input("clientType")]
        public Input<string>? ClientType { get; set; }

        /// <summary>
        /// The ID of the data source function app. Changing this forces a new resource to be created.
        /// </summary>
        [Input("functionAppId", required: true)]
        public Input<string> FunctionAppId { get; set; } = null!;

        /// <summary>
        /// The name of the service connection. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An option to store secret value in secure place. An `secret_store` block as defined below.
        /// </summary>
        [Input("secretStore")]
        public Input<Inputs.AppConnectionSecretStoreArgs>? SecretStore { get; set; }

        /// <summary>
        /// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
        /// </summary>
        [Input("targetResourceId", required: true)]
        public Input<string> TargetResourceId { get; set; } = null!;

        /// <summary>
        /// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
        /// </summary>
        [Input("vnetSolution")]
        public Input<string>? VnetSolution { get; set; }

        public AppConnectionArgs()
        {
        }
        public static new AppConnectionArgs Empty => new AppConnectionArgs();
    }

    public sealed class AppConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication info. An `authentication` block as defined below.
        /// 
        /// &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.AppConnectionAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
        /// </summary>
        [Input("clientType")]
        public Input<string>? ClientType { get; set; }

        /// <summary>
        /// The ID of the data source function app. Changing this forces a new resource to be created.
        /// </summary>
        [Input("functionAppId")]
        public Input<string>? FunctionAppId { get; set; }

        /// <summary>
        /// The name of the service connection. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An option to store secret value in secure place. An `secret_store` block as defined below.
        /// </summary>
        [Input("secretStore")]
        public Input<Inputs.AppConnectionSecretStoreGetArgs>? SecretStore { get; set; }

        /// <summary>
        /// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
        /// </summary>
        [Input("targetResourceId")]
        public Input<string>? TargetResourceId { get; set; }

        /// <summary>
        /// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
        /// </summary>
        [Input("vnetSolution")]
        public Input<string>? VnetSolution { get; set; }

        public AppConnectionState()
        {
        }
        public static new AppConnectionState Empty => new AppConnectionState();
    }
}
