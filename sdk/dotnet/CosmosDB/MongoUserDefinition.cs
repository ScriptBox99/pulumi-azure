// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB
{
    /// <summary>
    /// Manages a Cosmos DB Mongo User Definition.
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
    ///         Kind = "MongoDB",
    ///         Capabilities = new[]
    ///         {
    ///             new Azure.CosmosDB.Inputs.AccountCapabilityArgs
    ///             {
    ///                 Name = "EnableMongo",
    ///             },
    ///             new Azure.CosmosDB.Inputs.AccountCapabilityArgs
    ///             {
    ///                 Name = "EnableMongoRoleBasedAccessControl",
    ///             },
    ///         },
    ///         ConsistencyPolicy = new Azure.CosmosDB.Inputs.AccountConsistencyPolicyArgs
    ///         {
    ///             ConsistencyLevel = "Strong",
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
    ///     var exampleMongoDatabase = new Azure.CosmosDB.MongoDatabase("exampleMongoDatabase", new()
    ///     {
    ///         ResourceGroupName = exampleAccount.ResourceGroupName,
    ///         AccountName = exampleAccount.Name,
    ///     });
    /// 
    ///     var exampleMongoUserDefinition = new Azure.CosmosDB.MongoUserDefinition("exampleMongoUserDefinition", new()
    ///     {
    ///         CosmosMongoDatabaseId = exampleMongoDatabase.Id,
    ///         Username = "myUserName",
    ///         Password = "myPassword",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cosmos DB Mongo User Definitions can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:cosmosdb/mongoUserDefinition:MongoUserDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/mongodbUserDefinitions/dbname1.username1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cosmosdb/mongoUserDefinition:MongoUserDefinition")]
    public partial class MongoUserDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
        /// </summary>
        [Output("cosmosMongoDatabaseId")]
        public Output<string> CosmosMongoDatabaseId { get; private set; } = null!;

        /// <summary>
        /// A list of Mongo Roles that are inherited to the Mongo User Definition.
        /// 
        /// &gt; **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmos_mongo_database_id`.
        /// </summary>
        [Output("inheritedRoleNames")]
        public Output<ImmutableArray<string>> InheritedRoleNames { get; private set; } = null!;

        /// <summary>
        /// The password for the Mongo User Definition.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The username for the Mongo User Definition. Changing this forces a new resource to be created.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a MongoUserDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MongoUserDefinition(string name, MongoUserDefinitionArgs args, CustomResourceOptions? options = null)
            : base("azure:cosmosdb/mongoUserDefinition:MongoUserDefinition", name, args ?? new MongoUserDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MongoUserDefinition(string name, Input<string> id, MongoUserDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("azure:cosmosdb/mongoUserDefinition:MongoUserDefinition", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MongoUserDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MongoUserDefinition Get(string name, Input<string> id, MongoUserDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new MongoUserDefinition(name, id, state, options);
        }
    }

    public sealed class MongoUserDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
        /// </summary>
        [Input("cosmosMongoDatabaseId", required: true)]
        public Input<string> CosmosMongoDatabaseId { get; set; } = null!;

        [Input("inheritedRoleNames")]
        private InputList<string>? _inheritedRoleNames;

        /// <summary>
        /// A list of Mongo Roles that are inherited to the Mongo User Definition.
        /// 
        /// &gt; **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmos_mongo_database_id`.
        /// </summary>
        public InputList<string> InheritedRoleNames
        {
            get => _inheritedRoleNames ?? (_inheritedRoleNames = new InputList<string>());
            set => _inheritedRoleNames = value;
        }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password for the Mongo User Definition.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username for the Mongo User Definition. Changing this forces a new resource to be created.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public MongoUserDefinitionArgs()
        {
        }
        public static new MongoUserDefinitionArgs Empty => new MongoUserDefinitionArgs();
    }

    public sealed class MongoUserDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
        /// </summary>
        [Input("cosmosMongoDatabaseId")]
        public Input<string>? CosmosMongoDatabaseId { get; set; }

        [Input("inheritedRoleNames")]
        private InputList<string>? _inheritedRoleNames;

        /// <summary>
        /// A list of Mongo Roles that are inherited to the Mongo User Definition.
        /// 
        /// &gt; **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmos_mongo_database_id`.
        /// </summary>
        public InputList<string> InheritedRoleNames
        {
            get => _inheritedRoleNames ?? (_inheritedRoleNames = new InputList<string>());
            set => _inheritedRoleNames = value;
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password for the Mongo User Definition.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username for the Mongo User Definition. Changing this forces a new resource to be created.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public MongoUserDefinitionState()
        {
        }
        public static new MongoUserDefinitionState Empty => new MongoUserDefinitionState();
    }
}