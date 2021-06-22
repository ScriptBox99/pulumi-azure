// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Avs
{
    /// <summary>
    /// Manages an Express Route Vmware Authorization.
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
    ///         var examplePrivateCloud = new Azure.Avs.PrivateCloud("examplePrivateCloud", new Azure.Avs.PrivateCloudArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             SkuName = "av36",
    ///             ManagementCluster = new Azure.Avs.Inputs.PrivateCloudManagementClusterArgs
    ///             {
    ///                 Size = 3,
    ///             },
    ///             NetworkSubnetCidr = "192.168.48.0/22",
    ///             InternetConnectionEnabled = false,
    ///             NsxtPassword = "QazWsx13$Edc",
    ///             VcenterPassword = "WsxEdc23$Rfv",
    ///         });
    ///         var exampleExpressRouteAuthorization = new Azure.Avs.ExpressRouteAuthorization("exampleExpressRouteAuthorization", new Azure.Avs.ExpressRouteAuthorizationArgs
    ///         {
    ///             PrivateCloudId = examplePrivateCloud.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Vmware Authorizations can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:avs/expressRouteAuthorization:ExpressRouteAuthorization example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.AVS/privateClouds/privateCloud1/authorizations/authorization1
    /// ```
    /// </summary>
    [AzureResourceType("azure:avs/expressRouteAuthorization:ExpressRouteAuthorization")]
    public partial class ExpressRouteAuthorization : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Express Route Circuit Authorization.
        /// </summary>
        [Output("expressRouteAuthorizationId")]
        public Output<string> ExpressRouteAuthorizationId { get; private set; } = null!;

        /// <summary>
        /// The key of the Express Route Circuit Authorization.
        /// </summary>
        [Output("expressRouteAuthorizationKey")]
        public Output<string> ExpressRouteAuthorizationKey { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Express Route Vmware Authorization. Changing this forces a new Vmware Authorization to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Vmware Private Cloud in which to create this Express Route Vmware Authorization. Changing this forces a new Vmware Authorization to be created.
        /// </summary>
        [Output("privateCloudId")]
        public Output<string> PrivateCloudId { get; private set; } = null!;


        /// <summary>
        /// Create a ExpressRouteAuthorization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExpressRouteAuthorization(string name, ExpressRouteAuthorizationArgs args, CustomResourceOptions? options = null)
            : base("azure:avs/expressRouteAuthorization:ExpressRouteAuthorization", name, args ?? new ExpressRouteAuthorizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExpressRouteAuthorization(string name, Input<string> id, ExpressRouteAuthorizationState? state = null, CustomResourceOptions? options = null)
            : base("azure:avs/expressRouteAuthorization:ExpressRouteAuthorization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExpressRouteAuthorization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExpressRouteAuthorization Get(string name, Input<string> id, ExpressRouteAuthorizationState? state = null, CustomResourceOptions? options = null)
        {
            return new ExpressRouteAuthorization(name, id, state, options);
        }
    }

    public sealed class ExpressRouteAuthorizationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name which should be used for this Express Route Vmware Authorization. Changing this forces a new Vmware Authorization to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Vmware Private Cloud in which to create this Express Route Vmware Authorization. Changing this forces a new Vmware Authorization to be created.
        /// </summary>
        [Input("privateCloudId", required: true)]
        public Input<string> PrivateCloudId { get; set; } = null!;

        public ExpressRouteAuthorizationArgs()
        {
        }
    }

    public sealed class ExpressRouteAuthorizationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Express Route Circuit Authorization.
        /// </summary>
        [Input("expressRouteAuthorizationId")]
        public Input<string>? ExpressRouteAuthorizationId { get; set; }

        /// <summary>
        /// The key of the Express Route Circuit Authorization.
        /// </summary>
        [Input("expressRouteAuthorizationKey")]
        public Input<string>? ExpressRouteAuthorizationKey { get; set; }

        /// <summary>
        /// The name which should be used for this Express Route Vmware Authorization. Changing this forces a new Vmware Authorization to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Vmware Private Cloud in which to create this Express Route Vmware Authorization. Changing this forces a new Vmware Authorization to be created.
        /// </summary>
        [Input("privateCloudId")]
        public Input<string>? PrivateCloudId { get; set; }

        public ExpressRouteAuthorizationState()
        {
        }
    }
}