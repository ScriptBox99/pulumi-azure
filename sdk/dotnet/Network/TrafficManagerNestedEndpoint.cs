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
    /// Manages a Nested Endpoint within a Traffic Manager Profile.
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
    ///         var examplePublicIp = new Azure.Network.PublicIp("examplePublicIp", new Azure.Network.PublicIpArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             AllocationMethod = "Static",
    ///             DomainNameLabel = "example-pip",
    ///         });
    ///         var parent = new Azure.Network.TrafficManagerProfile("parent", new Azure.Network.TrafficManagerProfileArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             TrafficRoutingMethod = "Weighted",
    ///             DnsConfig = new Azure.Network.Inputs.TrafficManagerProfileDnsConfigArgs
    ///             {
    ///                 RelativeName = "parent-profile",
    ///                 Ttl = 100,
    ///             },
    ///             MonitorConfig = new Azure.Network.Inputs.TrafficManagerProfileMonitorConfigArgs
    ///             {
    ///                 Protocol = "HTTP",
    ///                 Port = 80,
    ///                 Path = "/",
    ///                 IntervalInSeconds = 30,
    ///                 TimeoutInSeconds = 9,
    ///                 ToleratedNumberOfFailures = 3,
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "environment", "Production" },
    ///             },
    ///         });
    ///         var nested = new Azure.Network.TrafficManagerProfile("nested", new Azure.Network.TrafficManagerProfileArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             TrafficRoutingMethod = "Priority",
    ///             DnsConfig = new Azure.Network.Inputs.TrafficManagerProfileDnsConfigArgs
    ///             {
    ///                 RelativeName = "nested-profile",
    ///                 Ttl = 30,
    ///             },
    ///             MonitorConfig = new Azure.Network.Inputs.TrafficManagerProfileMonitorConfigArgs
    ///             {
    ///                 Protocol = "HTTP",
    ///                 Port = 443,
    ///                 Path = "/",
    ///             },
    ///         });
    ///         var exampleTrafficManagerNestedEndpoint = new Azure.Network.TrafficManagerNestedEndpoint("exampleTrafficManagerNestedEndpoint", new Azure.Network.TrafficManagerNestedEndpointArgs
    ///         {
    ///             TargetResourceId = nested.Id,
    ///             Priority = 1,
    ///             ProfileId = parent.Id,
    ///             MinimumChildEndpoints = 9,
    ///             Weight = 5,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Nested Endpoints can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.Network/trafficManagerProfiles/example-profile/NestedEndpoints/example-endpoint
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint")]
    public partial class TrafficManagerNestedEndpoint : Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `custom_header` blocks as defined below.
        /// </summary>
        [Output("customHeaders")]
        public Output<ImmutableArray<Outputs.TrafficManagerNestedEndpointCustomHeader>> CustomHeaders { get; private set; } = null!;

        /// <summary>
        /// Is the endpoint enabled? Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the Azure location of the Endpoint,
        /// this must be specified for Profiles using the `Performance` routing method.
        /// </summary>
        [Output("endpointLocation")]
        public Output<string> EndpointLocation { get; private set; } = null!;

        /// <summary>
        /// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
        /// </summary>
        [Output("geoMappings")]
        public Output<ImmutableArray<string>> GeoMappings { get; private set; } = null!;

        /// <summary>
        /// This argument specifies the minimum number
        /// of endpoints that must be ‘online’ in the child profile in order for the
        /// parent profile to direct traffic to any of the endpoints in that child
        /// profile. This value must be larger than `0`.
        /// </summary>
        [Output("minimumChildEndpoints")]
        public Output<int> MinimumChildEndpoints { get; private set; } = null!;

        /// <summary>
        /// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and defaults to `1`.
        /// </summary>
        [Output("minimumRequiredChildEndpointsIpv4")]
        public Output<int?> MinimumRequiredChildEndpointsIpv4 { get; private set; } = null!;

        /// <summary>
        /// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and defaults to `1`.
        /// </summary>
        [Output("minimumRequiredChildEndpointsIpv6")]
        public Output<int?> MinimumRequiredChildEndpointsIpv6 { get; private set; } = null!;

        /// <summary>
        /// The name of the External Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the priority of this Endpoint, this must be
        /// specified for Profiles using the `Priority` traffic routing method. Supports
        /// values between 1 and 1000, with no Endpoints sharing the same value. If
        /// omitted the value will be computed in order of creation.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
        /// </summary>
        [Output("profileId")]
        public Output<string> ProfileId { get; private set; } = null!;

        /// <summary>
        /// One or more `subnet` blocks as defined below
        /// </summary>
        [Output("subnets")]
        public Output<ImmutableArray<Outputs.TrafficManagerNestedEndpointSubnet>> Subnets { get; private set; } = null!;

        /// <summary>
        /// The resource id of an Azure resource to
        /// target.
        /// </summary>
        [Output("targetResourceId")]
        public Output<string> TargetResourceId { get; private set; } = null!;

        /// <summary>
        /// Specifies how much traffic should be distributed to this
        /// endpoint. Valid values are between `1` and `1000`.
        /// </summary>
        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a TrafficManagerNestedEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TrafficManagerNestedEndpoint(string name, TrafficManagerNestedEndpointArgs args, CustomResourceOptions? options = null)
            : base("azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint", name, args ?? new TrafficManagerNestedEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TrafficManagerNestedEndpoint(string name, Input<string> id, TrafficManagerNestedEndpointState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TrafficManagerNestedEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TrafficManagerNestedEndpoint Get(string name, Input<string> id, TrafficManagerNestedEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new TrafficManagerNestedEndpoint(name, id, state, options);
        }
    }

    public sealed class TrafficManagerNestedEndpointArgs : Pulumi.ResourceArgs
    {
        [Input("customHeaders")]
        private InputList<Inputs.TrafficManagerNestedEndpointCustomHeaderArgs>? _customHeaders;

        /// <summary>
        /// One or more `custom_header` blocks as defined below.
        /// </summary>
        public InputList<Inputs.TrafficManagerNestedEndpointCustomHeaderArgs> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputList<Inputs.TrafficManagerNestedEndpointCustomHeaderArgs>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Is the endpoint enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the Azure location of the Endpoint,
        /// this must be specified for Profiles using the `Performance` routing method.
        /// </summary>
        [Input("endpointLocation")]
        public Input<string>? EndpointLocation { get; set; }

        [Input("geoMappings")]
        private InputList<string>? _geoMappings;

        /// <summary>
        /// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
        /// </summary>
        public InputList<string> GeoMappings
        {
            get => _geoMappings ?? (_geoMappings = new InputList<string>());
            set => _geoMappings = value;
        }

        /// <summary>
        /// This argument specifies the minimum number
        /// of endpoints that must be ‘online’ in the child profile in order for the
        /// parent profile to direct traffic to any of the endpoints in that child
        /// profile. This value must be larger than `0`.
        /// </summary>
        [Input("minimumChildEndpoints", required: true)]
        public Input<int> MinimumChildEndpoints { get; set; } = null!;

        /// <summary>
        /// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and defaults to `1`.
        /// </summary>
        [Input("minimumRequiredChildEndpointsIpv4")]
        public Input<int>? MinimumRequiredChildEndpointsIpv4 { get; set; }

        /// <summary>
        /// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and defaults to `1`.
        /// </summary>
        [Input("minimumRequiredChildEndpointsIpv6")]
        public Input<int>? MinimumRequiredChildEndpointsIpv6 { get; set; }

        /// <summary>
        /// The name of the External Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the priority of this Endpoint, this must be
        /// specified for Profiles using the `Priority` traffic routing method. Supports
        /// values between 1 and 1000, with no Endpoints sharing the same value. If
        /// omitted the value will be computed in order of creation.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
        /// </summary>
        [Input("profileId", required: true)]
        public Input<string> ProfileId { get; set; } = null!;

        [Input("subnets")]
        private InputList<Inputs.TrafficManagerNestedEndpointSubnetArgs>? _subnets;

        /// <summary>
        /// One or more `subnet` blocks as defined below
        /// </summary>
        public InputList<Inputs.TrafficManagerNestedEndpointSubnetArgs> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<Inputs.TrafficManagerNestedEndpointSubnetArgs>());
            set => _subnets = value;
        }

        /// <summary>
        /// The resource id of an Azure resource to
        /// target.
        /// </summary>
        [Input("targetResourceId", required: true)]
        public Input<string> TargetResourceId { get; set; } = null!;

        /// <summary>
        /// Specifies how much traffic should be distributed to this
        /// endpoint. Valid values are between `1` and `1000`.
        /// </summary>
        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public TrafficManagerNestedEndpointArgs()
        {
        }
    }

    public sealed class TrafficManagerNestedEndpointState : Pulumi.ResourceArgs
    {
        [Input("customHeaders")]
        private InputList<Inputs.TrafficManagerNestedEndpointCustomHeaderGetArgs>? _customHeaders;

        /// <summary>
        /// One or more `custom_header` blocks as defined below.
        /// </summary>
        public InputList<Inputs.TrafficManagerNestedEndpointCustomHeaderGetArgs> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputList<Inputs.TrafficManagerNestedEndpointCustomHeaderGetArgs>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Is the endpoint enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the Azure location of the Endpoint,
        /// this must be specified for Profiles using the `Performance` routing method.
        /// </summary>
        [Input("endpointLocation")]
        public Input<string>? EndpointLocation { get; set; }

        [Input("geoMappings")]
        private InputList<string>? _geoMappings;

        /// <summary>
        /// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
        /// </summary>
        public InputList<string> GeoMappings
        {
            get => _geoMappings ?? (_geoMappings = new InputList<string>());
            set => _geoMappings = value;
        }

        /// <summary>
        /// This argument specifies the minimum number
        /// of endpoints that must be ‘online’ in the child profile in order for the
        /// parent profile to direct traffic to any of the endpoints in that child
        /// profile. This value must be larger than `0`.
        /// </summary>
        [Input("minimumChildEndpoints")]
        public Input<int>? MinimumChildEndpoints { get; set; }

        /// <summary>
        /// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and defaults to `1`.
        /// </summary>
        [Input("minimumRequiredChildEndpointsIpv4")]
        public Input<int>? MinimumRequiredChildEndpointsIpv4 { get; set; }

        /// <summary>
        /// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and defaults to `1`.
        /// </summary>
        [Input("minimumRequiredChildEndpointsIpv6")]
        public Input<int>? MinimumRequiredChildEndpointsIpv6 { get; set; }

        /// <summary>
        /// The name of the External Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the priority of this Endpoint, this must be
        /// specified for Profiles using the `Priority` traffic routing method. Supports
        /// values between 1 and 1000, with no Endpoints sharing the same value. If
        /// omitted the value will be computed in order of creation.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
        /// </summary>
        [Input("profileId")]
        public Input<string>? ProfileId { get; set; }

        [Input("subnets")]
        private InputList<Inputs.TrafficManagerNestedEndpointSubnetGetArgs>? _subnets;

        /// <summary>
        /// One or more `subnet` blocks as defined below
        /// </summary>
        public InputList<Inputs.TrafficManagerNestedEndpointSubnetGetArgs> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<Inputs.TrafficManagerNestedEndpointSubnetGetArgs>());
            set => _subnets = value;
        }

        /// <summary>
        /// The resource id of an Azure resource to
        /// target.
        /// </summary>
        [Input("targetResourceId")]
        public Input<string>? TargetResourceId { get; set; }

        /// <summary>
        /// Specifies how much traffic should be distributed to this
        /// endpoint. Valid values are between `1` and `1000`.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public TrafficManagerNestedEndpointState()
        {
        }
    }
}