// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Outputs
{

    [OutputType]
    public sealed class DeploymentFrontendPublic
    {
        /// <summary>
        /// Specifies a list of Public IP Resouce ID to this Nginx Deployment.
        /// </summary>
        public readonly ImmutableArray<string> IpAddresses;

        [OutputConstructor]
        private DeploymentFrontendPublic(ImmutableArray<string> ipAddresses)
        {
            IpAddresses = ipAddresses;
        }
    }
}