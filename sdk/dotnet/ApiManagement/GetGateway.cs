// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement
{
    public static class GetGateway
    {
        /// <summary>
        /// Use this data source to access information about an existing API Management Gateway.
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
        ///         var exampleService = Output.Create(Azure.ApiManagement.GetService.InvokeAsync(new Azure.ApiManagement.GetServiceArgs
        ///         {
        ///             Name = "example-apim",
        ///             ResourceGroupName = "example-rg",
        ///         }));
        ///         var exampleGateway = exampleService.Apply(exampleService =&gt; Output.Create(Azure.ApiManagement.GetGateway.InvokeAsync(new Azure.ApiManagement.GetGatewayArgs
        ///         {
        ///             Name = "example-api-gateway",
        ///             ApiManagementId = exampleService.Id,
        ///         })));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGatewayResult> InvokeAsync(GetGatewayArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGatewayResult>("azure:apimanagement/getGateway:getGateway", args ?? new GetGatewayArgs(), options.WithVersion());
    }


    public sealed class GetGatewayArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the API Management Service in which the Gateway exists.
        /// </summary>
        [Input("apiManagementId", required: true)]
        public string ApiManagementId { get; set; } = null!;

        /// <summary>
        /// The name of the API Management Gateway.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetGatewayArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetGatewayResult
    {
        public readonly string ApiManagementId;
        /// <summary>
        /// The description of the API Management Gateway.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A `location_data` block as documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGatewayLocationDataResult> LocationDatas;
        /// <summary>
        /// A canonical name for the geographic or physical location.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetGatewayResult(
            string apiManagementId,

            string description,

            string id,

            ImmutableArray<Outputs.GetGatewayLocationDataResult> locationDatas,

            string name)
        {
            ApiManagementId = apiManagementId;
            Description = description;
            Id = id;
            LocationDatas = locationDatas;
            Name = name;
        }
    }
}