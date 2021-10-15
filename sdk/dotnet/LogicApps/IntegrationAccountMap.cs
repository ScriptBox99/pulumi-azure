// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps
{
    /// <summary>
    /// Manages a Logic App Integration Account Map.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.IO;
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
    ///         var exampleIntegrationAccount = new Azure.LogicApps.IntegrationAccount("exampleIntegrationAccount", new Azure.LogicApps.IntegrationAccountArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             SkuName = "Standard",
    ///         });
    ///         var exampleIntegrationAccountMap = new Azure.LogicApps.IntegrationAccountMap("exampleIntegrationAccountMap", new Azure.LogicApps.IntegrationAccountMapArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             IntegrationAccountName = exampleIntegrationAccount.Name,
    ///             MapType = "Xslt",
    ///             Content = File.ReadAllText("testdata/integration_account_map_content.xsd"),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Logic App Integration Account Maps can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:logicapps/integrationAccountMap:IntegrationAccountMap example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1/maps/map1
    /// ```
    /// </summary>
    [AzureResourceType("azure:logicapps/integrationAccountMap:IntegrationAccountMap")]
    public partial class IntegrationAccountMap : Pulumi.CustomResource
    {
        /// <summary>
        /// The content of the Logic App Integration Account Map.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        /// <summary>
        /// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Output("integrationAccountName")]
        public Output<string> IntegrationAccountName { get; private set; } = null!;

        /// <summary>
        /// The type of the Logic App Integration Account Map.
        /// </summary>
        [Output("mapType")]
        public Output<string> MapType { get; private set; } = null!;

        /// <summary>
        /// The metadata of the Logic App Integration Account Map.
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, string>?> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationAccountMap resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationAccountMap(string name, IntegrationAccountMapArgs args, CustomResourceOptions? options = null)
            : base("azure:logicapps/integrationAccountMap:IntegrationAccountMap", name, args ?? new IntegrationAccountMapArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationAccountMap(string name, Input<string> id, IntegrationAccountMapState? state = null, CustomResourceOptions? options = null)
            : base("azure:logicapps/integrationAccountMap:IntegrationAccountMap", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IntegrationAccountMap resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationAccountMap Get(string name, Input<string> id, IntegrationAccountMapState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationAccountMap(name, id, state, options);
        }
    }

    public sealed class IntegrationAccountMapArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content of the Logic App Integration Account Map.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Input("integrationAccountName", required: true)]
        public Input<string> IntegrationAccountName { get; set; } = null!;

        /// <summary>
        /// The type of the Logic App Integration Account Map.
        /// </summary>
        [Input("mapType", required: true)]
        public Input<string> MapType { get; set; } = null!;

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// The metadata of the Logic App Integration Account Map.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public IntegrationAccountMapArgs()
        {
        }
    }

    public sealed class IntegrationAccountMapState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content of the Logic App Integration Account Map.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Input("integrationAccountName")]
        public Input<string>? IntegrationAccountName { get; set; }

        /// <summary>
        /// The type of the Logic App Integration Account Map.
        /// </summary>
        [Input("mapType")]
        public Input<string>? MapType { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// The metadata of the Logic App Integration Account Map.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public IntegrationAccountMapState()
        {
        }
    }
}