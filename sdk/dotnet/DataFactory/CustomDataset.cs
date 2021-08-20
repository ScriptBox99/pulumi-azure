// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory
{
    /// <summary>
    /// Manages a Dataset inside an Azure Data Factory. This is a generic resource that supports all different Dataset Types.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleFactory = new Azure.DataFactory.Factory("exampleFactory", new Azure.DataFactory.FactoryArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Identity = new Azure.DataFactory.Inputs.FactoryIdentityArgs
    ///             {
    ///                 Type = "SystemAssigned",
    ///             },
    ///         });
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountKind = "BlobStorage",
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///         });
    ///         var exampleLinkedCustomService = new Azure.DataFactory.LinkedCustomService("exampleLinkedCustomService", new Azure.DataFactory.LinkedCustomServiceArgs
    ///         {
    ///             DataFactoryId = exampleFactory.Id,
    ///             Type = "AzureBlobStorage",
    ///             TypePropertiesJson = @$"{{
    ///   ""connectionString"":""{azurerm_storage_account.Test.Primary_connection_string}""
    /// }}
    /// ",
    ///         });
    ///         var exampleCustomDataset = new Azure.DataFactory.CustomDataset("exampleCustomDataset", new Azure.DataFactory.CustomDatasetArgs
    ///         {
    ///             DataFactoryId = exampleFactory.Id,
    ///             Type = "Json",
    ///             LinkedService = new Azure.DataFactory.Inputs.CustomDatasetLinkedServiceArgs
    ///             {
    ///                 Name = azurerm_data_factory_linked_custom_service.Test.Name,
    ///                 Parameters = 
    ///                 {
    ///                     { "key1", "value1" },
    ///                 },
    ///             },
    ///             TypePropertiesJson = @$"{{
    ///   ""location"": {{
    ///     ""container"":""{azurerm_storage_container.Test.Name}"",
    ///     ""fileName"":""foo.txt"",
    ///     ""folderPath"": ""foo/bar/"",
    ///     ""type"":""AzureBlobStorageLocation""
    ///   }},
    ///   ""encodingName"":""UTF-8""
    /// }}
    /// ",
    ///             Description = "test description",
    ///             Annotations = 
    ///             {
    ///                 "test1",
    ///                 "test2",
    ///                 "test3",
    ///             },
    ///             Folder = "testFolder",
    ///             Parameters = 
    ///             {
    ///                 { "foo", "test1" },
    ///                 { "Bar", "Test2" },
    ///             },
    ///             AdditionalProperties = 
    ///             {
    ///                 { "foo", "test1" },
    ///                 { "bar", "test2" },
    ///             },
    ///             SchemaJson = @"{
    ///   ""type"": ""object"",
    ///   ""properties"": {
    ///     ""name"": {
    ///       ""type"": ""object"",
    ///       ""properties"": {
    ///         ""firstName"": {
    ///           ""type"": ""string""
    ///         },
    ///         ""lastName"": {
    ///           ""type"": ""string""
    ///         }
    ///       }
    ///     },
    ///     ""age"": {
    ///       ""type"": ""integer""
    ///     }
    ///   }
    /// }
    /// ",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Factory Datasets can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:datafactory/customDataset:CustomDataset example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/datasets/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:datafactory/customDataset:CustomDataset")]
    public partial class CustomDataset : Pulumi.CustomResource
    {
        /// <summary>
        /// A map of additional properties to associate with the Data Factory Dataset.
        /// </summary>
        [Output("additionalProperties")]
        public Output<ImmutableDictionary<string, string>?> AdditionalProperties { get; private set; } = null!;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Dataset.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableArray<string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
        /// </summary>
        [Output("dataFactoryId")]
        public Output<string> DataFactoryId { get; private set; } = null!;

        /// <summary>
        /// The description for the Data Factory Dataset.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// A `linked_service` block as defined below.
        /// </summary>
        [Output("linkedService")]
        public Output<Outputs.CustomDatasetLinkedService> LinkedService { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Dataset.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// A JSON object that contains the schema of the Data Factory Dataset.
        /// </summary>
        [Output("schemaJson")]
        public Output<string?> SchemaJson { get; private set; } = null!;

        /// <summary>
        /// The type of dataset that will be associated with Data Factory.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// A JSON object that contains the properties of the Data Factory Dataset.
        /// </summary>
        [Output("typePropertiesJson")]
        public Output<string> TypePropertiesJson { get; private set; } = null!;


        /// <summary>
        /// Create a CustomDataset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomDataset(string name, CustomDatasetArgs args, CustomResourceOptions? options = null)
            : base("azure:datafactory/customDataset:CustomDataset", name, args ?? new CustomDatasetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomDataset(string name, Input<string> id, CustomDatasetState? state = null, CustomResourceOptions? options = null)
            : base("azure:datafactory/customDataset:CustomDataset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomDataset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomDataset Get(string name, Input<string> id, CustomDatasetState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomDataset(name, id, state, options);
        }
    }

    public sealed class CustomDatasetArgs : Pulumi.ResourceArgs
    {
        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Dataset.
        /// </summary>
        public InputMap<string> AdditionalProperties
        {
            get => _additionalProperties ?? (_additionalProperties = new InputMap<string>());
            set => _additionalProperties = value;
        }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Dataset.
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId", required: true)]
        public Input<string> DataFactoryId { get; set; } = null!;

        /// <summary>
        /// The description for the Data Factory Dataset.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// A `linked_service` block as defined below.
        /// </summary>
        [Input("linkedService", required: true)]
        public Input<Inputs.CustomDatasetLinkedServiceArgs> LinkedService { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Dataset.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// A JSON object that contains the schema of the Data Factory Dataset.
        /// </summary>
        [Input("schemaJson")]
        public Input<string>? SchemaJson { get; set; }

        /// <summary>
        /// The type of dataset that will be associated with Data Factory.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// A JSON object that contains the properties of the Data Factory Dataset.
        /// </summary>
        [Input("typePropertiesJson", required: true)]
        public Input<string> TypePropertiesJson { get; set; } = null!;

        public CustomDatasetArgs()
        {
        }
    }

    public sealed class CustomDatasetState : Pulumi.ResourceArgs
    {
        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Dataset.
        /// </summary>
        public InputMap<string> AdditionalProperties
        {
            get => _additionalProperties ?? (_additionalProperties = new InputMap<string>());
            set => _additionalProperties = value;
        }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Dataset.
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId")]
        public Input<string>? DataFactoryId { get; set; }

        /// <summary>
        /// The description for the Data Factory Dataset.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// A `linked_service` block as defined below.
        /// </summary>
        [Input("linkedService")]
        public Input<Inputs.CustomDatasetLinkedServiceGetArgs>? LinkedService { get; set; }

        /// <summary>
        /// Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Dataset.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// A JSON object that contains the schema of the Data Factory Dataset.
        /// </summary>
        [Input("schemaJson")]
        public Input<string>? SchemaJson { get; set; }

        /// <summary>
        /// The type of dataset that will be associated with Data Factory.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// A JSON object that contains the properties of the Data Factory Dataset.
        /// </summary>
        [Input("typePropertiesJson")]
        public Input<string>? TypePropertiesJson { get; set; }

        public CustomDatasetState()
        {
        }
    }
}