// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterApiServerAccessProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("authorizedIpRanges")]
        private InputList<string>? _authorizedIpRanges;

        /// <summary>
        /// Set of authorized IP ranges to allow access to API server, e.g. ["198.51.100.0/24"].
        /// </summary>
        public InputList<string> AuthorizedIpRanges
        {
            get => _authorizedIpRanges ?? (_authorizedIpRanges = new InputList<string>());
            set => _authorizedIpRanges = value;
        }

        /// <summary>
        /// The ID of the Subnet where the API server endpoint is delegated to.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// Should API Server VNet Integration be enabled? For more details please visit [Use API Server VNet Integration](https://learn.microsoft.com/en-us/azure/aks/api-server-vnet-integration).
        /// </summary>
        [Input("vnetIntegrationEnabled")]
        public Input<bool>? VnetIntegrationEnabled { get; set; }

        public KubernetesClusterApiServerAccessProfileArgs()
        {
        }
        public static new KubernetesClusterApiServerAccessProfileArgs Empty => new KubernetesClusterApiServerAccessProfileArgs();
    }
}