// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    /// <summary>
    /// Manages a Network Manager Connectivity Configuration.
    /// 
    /// &gt; **Note:** The `azure.network.NetworkManagerConnectivityConfiguration` deployment may modify or delete existing Network Peering resource.
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
    ///     var current = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var exampleNetworkManager = new Azure.Network.NetworkManager("exampleNetworkManager", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Scope = new Azure.Network.Inputs.NetworkManagerScopeArgs
    ///         {
    ///             SubscriptionIds = new[]
    ///             {
    ///                 current.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id),
    ///             },
    ///         },
    ///         ScopeAccesses = new[]
    ///         {
    ///             "Connectivity",
    ///             "SecurityAdmin",
    ///         },
    ///         Description = "example network manager",
    ///     });
    /// 
    ///     var exampleNetworkManagerNetworkGroup = new Azure.Network.NetworkManagerNetworkGroup("exampleNetworkManagerNetworkGroup", new()
    ///     {
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("exampleVirtualNetwork", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         FlowTimeoutInMinutes = 10,
    ///     });
    /// 
    ///     var exampleNetworkManagerConnectivityConfiguration = new Azure.Network.NetworkManagerConnectivityConfiguration("exampleNetworkManagerConnectivityConfiguration", new()
    ///     {
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///         ConnectivityTopology = "HubAndSpoke",
    ///         AppliesToGroups = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs
    ///             {
    ///                 GroupConnectivity = "DirectlyConnected",
    ///                 NetworkGroupId = exampleNetworkManagerNetworkGroup.Id,
    ///             },
    ///         },
    ///         Hub = new Azure.Network.Inputs.NetworkManagerConnectivityConfigurationHubArgs
    ///         {
    ///             ResourceId = exampleVirtualNetwork.Id,
    ///             ResourceType = "Microsoft.Network/virtualNetworks",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Network Manager Connectivity Configuration can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/networkManagers/networkManager1/connectivityConfigurations/configuration1
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration")]
    public partial class NetworkManagerConnectivityConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An `applies_to_group` block as defined below.
        /// </summary>
        [Output("appliesToGroups")]
        public Output<ImmutableArray<Outputs.NetworkManagerConnectivityConfigurationAppliesToGroup>> AppliesToGroups { get; private set; } = null!;

        /// <summary>
        /// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
        /// </summary>
        [Output("connectivityTopology")]
        public Output<string> ConnectivityTopology { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
        /// </summary>
        [Output("deleteExistingPeeringEnabled")]
        public Output<bool?> DeleteExistingPeeringEnabled { get; private set; } = null!;

        /// <summary>
        /// A description of the Connectivity Configuration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
        /// </summary>
        [Output("globalMeshEnabled")]
        public Output<bool?> GlobalMeshEnabled { get; private set; } = null!;

        /// <summary>
        /// A `hub` block as defined below.
        /// </summary>
        [Output("hub")]
        public Output<Outputs.NetworkManagerConnectivityConfigurationHub?> Hub { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
        /// </summary>
        [Output("networkManagerId")]
        public Output<string> NetworkManagerId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkManagerConnectivityConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkManagerConnectivityConfiguration(string name, NetworkManagerConnectivityConfigurationArgs args, CustomResourceOptions? options = null)
            : base("azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration", name, args ?? new NetworkManagerConnectivityConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkManagerConnectivityConfiguration(string name, Input<string> id, NetworkManagerConnectivityConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkManagerConnectivityConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkManagerConnectivityConfiguration Get(string name, Input<string> id, NetworkManagerConnectivityConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkManagerConnectivityConfiguration(name, id, state, options);
        }
    }

    public sealed class NetworkManagerConnectivityConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("appliesToGroups", required: true)]
        private InputList<Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs>? _appliesToGroups;

        /// <summary>
        /// An `applies_to_group` block as defined below.
        /// </summary>
        public InputList<Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs> AppliesToGroups
        {
            get => _appliesToGroups ?? (_appliesToGroups = new InputList<Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs>());
            set => _appliesToGroups = value;
        }

        /// <summary>
        /// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
        /// </summary>
        [Input("connectivityTopology", required: true)]
        public Input<string> ConnectivityTopology { get; set; } = null!;

        /// <summary>
        /// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
        /// </summary>
        [Input("deleteExistingPeeringEnabled")]
        public Input<bool>? DeleteExistingPeeringEnabled { get; set; }

        /// <summary>
        /// A description of the Connectivity Configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
        /// </summary>
        [Input("globalMeshEnabled")]
        public Input<bool>? GlobalMeshEnabled { get; set; }

        /// <summary>
        /// A `hub` block as defined below.
        /// </summary>
        [Input("hub")]
        public Input<Inputs.NetworkManagerConnectivityConfigurationHubArgs>? Hub { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
        /// </summary>
        [Input("networkManagerId", required: true)]
        public Input<string> NetworkManagerId { get; set; } = null!;

        public NetworkManagerConnectivityConfigurationArgs()
        {
        }
        public static new NetworkManagerConnectivityConfigurationArgs Empty => new NetworkManagerConnectivityConfigurationArgs();
    }

    public sealed class NetworkManagerConnectivityConfigurationState : global::Pulumi.ResourceArgs
    {
        [Input("appliesToGroups")]
        private InputList<Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupGetArgs>? _appliesToGroups;

        /// <summary>
        /// An `applies_to_group` block as defined below.
        /// </summary>
        public InputList<Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupGetArgs> AppliesToGroups
        {
            get => _appliesToGroups ?? (_appliesToGroups = new InputList<Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupGetArgs>());
            set => _appliesToGroups = value;
        }

        /// <summary>
        /// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
        /// </summary>
        [Input("connectivityTopology")]
        public Input<string>? ConnectivityTopology { get; set; }

        /// <summary>
        /// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
        /// </summary>
        [Input("deleteExistingPeeringEnabled")]
        public Input<bool>? DeleteExistingPeeringEnabled { get; set; }

        /// <summary>
        /// A description of the Connectivity Configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
        /// </summary>
        [Input("globalMeshEnabled")]
        public Input<bool>? GlobalMeshEnabled { get; set; }

        /// <summary>
        /// A `hub` block as defined below.
        /// </summary>
        [Input("hub")]
        public Input<Inputs.NetworkManagerConnectivityConfigurationHubGetArgs>? Hub { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
        /// </summary>
        [Input("networkManagerId")]
        public Input<string>? NetworkManagerId { get; set; }

        public NetworkManagerConnectivityConfigurationState()
        {
        }
        public static new NetworkManagerConnectivityConfigurationState Empty => new NetworkManagerConnectivityConfigurationState();
    }
}