// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    public static class GetFrontdoorProfile
    {
        /// <summary>
        /// Use this data source to access information about an existing CDN FrontDoor Profile.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Azure.Cdn.GetFrontdoorProfile.InvokeAsync(new Azure.Cdn.GetFrontdoorProfileArgs
        ///         {
        ///             Name = "existing-cdn-profile",
        ///             ResourceGroupName = "existing-resources",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFrontdoorProfileResult> InvokeAsync(GetFrontdoorProfileArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFrontdoorProfileResult>("azure:cdn/getFrontdoorProfile:getFrontdoorProfile", args ?? new GetFrontdoorProfileArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing CDN FrontDoor Profile.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Azure.Cdn.GetFrontdoorProfile.InvokeAsync(new Azure.Cdn.GetFrontdoorProfileArgs
        ///         {
        ///             Name = "existing-cdn-profile",
        ///             ResourceGroupName = "existing-resources",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFrontdoorProfileResult> Invoke(GetFrontdoorProfileInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetFrontdoorProfileResult>("azure:cdn/getFrontdoorProfile:getFrontdoorProfile", args ?? new GetFrontdoorProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFrontdoorProfileArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the FrontDoor Profile.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where this FrontDoor Profile exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetFrontdoorProfileArgs()
        {
        }
    }

    public sealed class GetFrontdoorProfileInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the FrontDoor Profile.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where this FrontDoor Profile exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetFrontdoorProfileInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetFrontdoorProfileResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The UUID of this CDN FrontDoor Profile.
        /// </summary>
        public readonly string ResourceGuid;
        /// <summary>
        /// Specifies the maximum response timeout in seconds.
        /// </summary>
        public readonly int ResponseTimeoutSeconds;
        /// <summary>
        /// Specifies the SKU for this CDN FrontDoor Profile.
        /// </summary>
        public readonly string SkuName;
        /// <summary>
        /// Specifies a mapping of Tags assigned to this CDN FrontDoor Profile.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetFrontdoorProfileResult(
            string id,

            string name,

            string resourceGroupName,

            string resourceGuid,

            int responseTimeoutSeconds,

            string skuName,

            ImmutableDictionary<string, string> tags)
        {
            Id = id;
            Name = name;
            ResourceGroupName = resourceGroupName;
            ResourceGuid = resourceGuid;
            ResponseTimeoutSeconds = responseTimeoutSeconds;
            SkuName = skuName;
            Tags = tags;
        }
    }
}