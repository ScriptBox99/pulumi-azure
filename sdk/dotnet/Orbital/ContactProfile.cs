// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Orbital
{
    /// <summary>
    /// Manages a Contact profile.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
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
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("exampleVirtualNetwork", new()
    ///     {
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = azurerm_resource_group.Test.Location,
    ///         ResourceGroupName = azurerm_resource_group.Test.Name,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("exampleSubnet", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.1.0/24",
    ///         },
    ///         Delegations = new[]
    ///         {
    ///             new Azure.Network.Inputs.SubnetDelegationArgs
    ///             {
    ///                 Name = "orbitalgateway",
    ///                 ServiceDelegation = new Azure.Network.Inputs.SubnetDelegationServiceDelegationArgs
    ///                 {
    ///                     Name = "Microsoft.Orbital/orbitalGateways",
    ///                     Actions = new[]
    ///                     {
    ///                         "Microsoft.Network/publicIPAddresses/join/action",
    ///                         "Microsoft.Network/virtualNetworks/subnets/join/action",
    ///                         "Microsoft.Network/virtualNetworks/read",
    ///                         "Microsoft.Network/publicIPAddresses/read",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleContactProfile = new Azure.Orbital.ContactProfile("exampleContactProfile", new()
    ///     {
    ///         ResourceGroupName = azurerm_resource_group.Test.Name,
    ///         Location = azurerm_resource_group.Test.Location,
    ///         MinimumVariableContactDuration = "PT1M",
    ///         AutoTracking = "disabled",
    ///         Links = new[]
    ///         {
    ///             new Azure.Orbital.Inputs.ContactProfileLinkArgs
    ///             {
    ///                 Channels = new[]
    ///                 {
    ///                     new Azure.Orbital.Inputs.ContactProfileLinkChannelArgs
    ///                     {
    ///                         Name = "channelname",
    ///                         BandwidthMhz = 100,
    ///                         CenterFrequencyMhz = 101,
    ///                         EndPoints = new[]
    ///                         {
    ///                             new Azure.Orbital.Inputs.ContactProfileLinkChannelEndPointArgs
    ///                             {
    ///                                 EndPointName = "AQUA_command",
    ///                                 IpAddress = "10.0.1.0",
    ///                                 Port = "49513",
    ///                                 Protocol = "TCP",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 Direction = "Uplink",
    ///                 Name = "RHCP_UL",
    ///                 Polarization = "RHCP",
    ///             },
    ///         },
    ///         NetworkConfigurationSubnetId = exampleSubnet.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Contact profile can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:orbital/contactProfile:ContactProfile example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/contactProfiles/contactProfile1
    /// ```
    /// </summary>
    [AzureResourceType("azure:orbital/contactProfile:ContactProfile")]
    public partial class ContactProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Auto-tracking configurations for a spacecraft. Possible values are `disabled`, `xBand` and `sBand`.
        /// </summary>
        [Output("autoTracking")]
        public Output<string> AutoTracking { get; private set; } = null!;

        /// <summary>
        /// ARM resource identifier of the Event Hub used for telemetry. Requires granting Orbital Resource Provider the rights to send telemetry into the hub.
        /// </summary>
        [Output("eventHubUri")]
        public Output<string?> EventHubUri { get; private set; } = null!;

        /// <summary>
        /// A list of spacecraft links. A `links` block as defined below.
        /// </summary>
        [Output("links")]
        public Output<ImmutableArray<Outputs.ContactProfileLink>> Links { get; private set; } = null!;

        /// <summary>
        /// The location where the contact profile exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Maximum elevation of the antenna during the contact in decimal degrees.
        /// </summary>
        [Output("minimumElevationDegrees")]
        public Output<double?> MinimumElevationDegrees { get; private set; } = null!;

        /// <summary>
        /// Minimum viable contact duration in ISO 8601 format. Used for listing the available contacts with a spacecraft at a given ground station.
        /// </summary>
        [Output("minimumVariableContactDuration")]
        public Output<string> MinimumVariableContactDuration { get; private set; } = null!;

        /// <summary>
        /// The name of the contact profile. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ARM resource identifier of the subnet delegated to the Microsoft.Orbital/orbitalGateways. Needs to be at least a class C subnet, and should not have any IP created in it. Changing this forces a new resource to be created.
        /// </summary>
        [Output("networkConfigurationSubnetId")]
        public Output<string> NetworkConfigurationSubnetId { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the contact profile exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ContactProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContactProfile(string name, ContactProfileArgs args, CustomResourceOptions? options = null)
            : base("azure:orbital/contactProfile:ContactProfile", name, args ?? new ContactProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContactProfile(string name, Input<string> id, ContactProfileState? state = null, CustomResourceOptions? options = null)
            : base("azure:orbital/contactProfile:ContactProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ContactProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContactProfile Get(string name, Input<string> id, ContactProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new ContactProfile(name, id, state, options);
        }
    }

    public sealed class ContactProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto-tracking configurations for a spacecraft. Possible values are `disabled`, `xBand` and `sBand`.
        /// </summary>
        [Input("autoTracking", required: true)]
        public Input<string> AutoTracking { get; set; } = null!;

        /// <summary>
        /// ARM resource identifier of the Event Hub used for telemetry. Requires granting Orbital Resource Provider the rights to send telemetry into the hub.
        /// </summary>
        [Input("eventHubUri")]
        public Input<string>? EventHubUri { get; set; }

        [Input("links", required: true)]
        private InputList<Inputs.ContactProfileLinkArgs>? _links;

        /// <summary>
        /// A list of spacecraft links. A `links` block as defined below.
        /// </summary>
        public InputList<Inputs.ContactProfileLinkArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.ContactProfileLinkArgs>());
            set => _links = value;
        }

        /// <summary>
        /// The location where the contact profile exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Maximum elevation of the antenna during the contact in decimal degrees.
        /// </summary>
        [Input("minimumElevationDegrees")]
        public Input<double>? MinimumElevationDegrees { get; set; }

        /// <summary>
        /// Minimum viable contact duration in ISO 8601 format. Used for listing the available contacts with a spacecraft at a given ground station.
        /// </summary>
        [Input("minimumVariableContactDuration", required: true)]
        public Input<string> MinimumVariableContactDuration { get; set; } = null!;

        /// <summary>
        /// The name of the contact profile. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ARM resource identifier of the subnet delegated to the Microsoft.Orbital/orbitalGateways. Needs to be at least a class C subnet, and should not have any IP created in it. Changing this forces a new resource to be created.
        /// </summary>
        [Input("networkConfigurationSubnetId", required: true)]
        public Input<string> NetworkConfigurationSubnetId { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the contact profile exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ContactProfileArgs()
        {
        }
        public static new ContactProfileArgs Empty => new ContactProfileArgs();
    }

    public sealed class ContactProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto-tracking configurations for a spacecraft. Possible values are `disabled`, `xBand` and `sBand`.
        /// </summary>
        [Input("autoTracking")]
        public Input<string>? AutoTracking { get; set; }

        /// <summary>
        /// ARM resource identifier of the Event Hub used for telemetry. Requires granting Orbital Resource Provider the rights to send telemetry into the hub.
        /// </summary>
        [Input("eventHubUri")]
        public Input<string>? EventHubUri { get; set; }

        [Input("links")]
        private InputList<Inputs.ContactProfileLinkGetArgs>? _links;

        /// <summary>
        /// A list of spacecraft links. A `links` block as defined below.
        /// </summary>
        public InputList<Inputs.ContactProfileLinkGetArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.ContactProfileLinkGetArgs>());
            set => _links = value;
        }

        /// <summary>
        /// The location where the contact profile exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Maximum elevation of the antenna during the contact in decimal degrees.
        /// </summary>
        [Input("minimumElevationDegrees")]
        public Input<double>? MinimumElevationDegrees { get; set; }

        /// <summary>
        /// Minimum viable contact duration in ISO 8601 format. Used for listing the available contacts with a spacecraft at a given ground station.
        /// </summary>
        [Input("minimumVariableContactDuration")]
        public Input<string>? MinimumVariableContactDuration { get; set; }

        /// <summary>
        /// The name of the contact profile. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ARM resource identifier of the subnet delegated to the Microsoft.Orbital/orbitalGateways. Needs to be at least a class C subnet, and should not have any IP created in it. Changing this forces a new resource to be created.
        /// </summary>
        [Input("networkConfigurationSubnetId")]
        public Input<string>? NetworkConfigurationSubnetId { get; set; }

        /// <summary>
        /// The name of the Resource Group where the contact profile exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ContactProfileState()
        {
        }
        public static new ContactProfileState Empty => new ContactProfileState();
    }
}