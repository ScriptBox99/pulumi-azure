// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class GetApplicationGatewayBackendHttpSettingConnectionDrainingResult
    {
        /// <summary>
        /// The number of seconds connection draining is active.
        /// </summary>
        public readonly int DrainTimeoutSec;
        /// <summary>
        /// Is the Web Application Firewall enabled?
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private GetApplicationGatewayBackendHttpSettingConnectionDrainingResult(
            int drainTimeoutSec,

            bool enabled)
        {
            DrainTimeoutSec = drainTimeoutSec;
            Enabled = enabled;
        }
    }
}