// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetworkFunction.Outputs
{

    [OutputType]
    public sealed class CollectorPolicyIpfxEmission
    {
        /// <summary>
        /// A list of emission destination types. The only possible value is `AzureMonitor`. Changing this forces a new Network Function Collector Policy to be created.
        /// </summary>
        public readonly string DestinationTypes;

        [OutputConstructor]
        private CollectorPolicyIpfxEmission(string destinationTypes)
        {
            DestinationTypes = destinationTypes;
        }
    }
}