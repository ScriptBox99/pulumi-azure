// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile
{
    public static class GetNetworkDataNetwork
    {
        /// <summary>
        /// Get information about a Mobile Network Data Network.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleNetwork = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = "example-rg",
        ///     });
        /// 
        ///     var exampleNetworkDataNetwork = Azure.Mobile.GetNetworkDataNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mndn",
        ///         MobileNetworkId = exampleNetwork.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkDataNetworkResult> InvokeAsync(GetNetworkDataNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkDataNetworkResult>("azure:mobile/getNetworkDataNetwork:getNetworkDataNetwork", args ?? new GetNetworkDataNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Mobile Network Data Network.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleNetwork = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = "example-rg",
        ///     });
        /// 
        ///     var exampleNetworkDataNetwork = Azure.Mobile.GetNetworkDataNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mndn",
        ///         MobileNetworkId = exampleNetwork.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworkDataNetworkResult> Invoke(GetNetworkDataNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkDataNetworkResult>("azure:mobile/getNetworkDataNetwork:getNetworkDataNetwork", args ?? new GetNetworkDataNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkDataNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the ID of the Mobile Network.
        /// </summary>
        [Input("mobileNetworkId", required: true)]
        public string MobileNetworkId { get; set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Mobile Network Data Network.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetNetworkDataNetworkArgs()
        {
        }
        public static new GetNetworkDataNetworkArgs Empty => new GetNetworkDataNetworkArgs();
    }

    public sealed class GetNetworkDataNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the ID of the Mobile Network.
        /// </summary>
        [Input("mobileNetworkId", required: true)]
        public Input<string> MobileNetworkId { get; set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Mobile Network Data Network.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetNetworkDataNetworkInvokeArgs()
        {
        }
        public static new GetNetworkDataNetworkInvokeArgs Empty => new GetNetworkDataNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkDataNetworkResult
    {
        /// <summary>
        /// The description for this Mobile Network Data Network.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Azure Region where the Mobile Network Data Network exists.
        /// </summary>
        public readonly string Location;
        public readonly string MobileNetworkId;
        public readonly string Name;
        /// <summary>
        /// A mapping of tags which should be assigned to the Mobile Network Data Network.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetNetworkDataNetworkResult(
            string description,

            string id,

            string location,

            string mobileNetworkId,

            string name,

            ImmutableDictionary<string, string> tags)
        {
            Description = description;
            Id = id;
            Location = location;
            MobileNetworkId = mobileNetworkId;
            Name = name;
            Tags = tags;
        }
    }
}