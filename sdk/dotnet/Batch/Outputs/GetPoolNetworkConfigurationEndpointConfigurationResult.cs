// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Outputs
{

    [OutputType]
    public sealed class GetPoolNetworkConfigurationEndpointConfigurationResult
    {
        /// <summary>
        /// The port number on the compute node.
        /// </summary>
        public readonly int BackendPort;
        /// <summary>
        /// The range of external ports that are used to provide inbound access to the backendPort on the individual compute nodes in the format of `1000-1100`.
        /// </summary>
        public readonly string FrontendPortRange;
        /// <summary>
        /// The name of the endpoint.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The list of network security group rules that are applied to the endpoint.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleResult> NetworkSecurityGroupRules;
        /// <summary>
        /// The protocol of the endpoint.
        /// </summary>
        public readonly string Protocol;

        [OutputConstructor]
        private GetPoolNetworkConfigurationEndpointConfigurationResult(
            int backendPort,

            string frontendPortRange,

            string name,

            ImmutableArray<Outputs.GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleResult> networkSecurityGroupRules,

            string protocol)
        {
            BackendPort = backendPort;
            FrontendPortRange = frontendPortRange;
            Name = name;
            NetworkSecurityGroupRules = networkSecurityGroupRules;
            Protocol = protocol;
        }
    }
}