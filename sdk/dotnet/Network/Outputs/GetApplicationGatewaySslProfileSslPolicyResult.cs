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
    public sealed class GetApplicationGatewaySslProfileSslPolicyResult
    {
        /// <summary>
        /// A List of accepted cipher suites.
        /// </summary>
        public readonly ImmutableArray<string> CipherSuites;
        /// <summary>
        /// A list of SSL Protocols which are disabled on this Application Gateway.
        /// </summary>
        public readonly ImmutableArray<string> DisabledProtocols;
        /// <summary>
        /// The minimum TLS version.
        /// </summary>
        public readonly string MinProtocolVersion;
        /// <summary>
        /// The Name of the Policy.
        /// </summary>
        public readonly string PolicyName;
        /// <summary>
        /// The Type of the Policy.
        /// </summary>
        public readonly string PolicyType;

        [OutputConstructor]
        private GetApplicationGatewaySslProfileSslPolicyResult(
            ImmutableArray<string> cipherSuites,

            ImmutableArray<string> disabledProtocols,

            string minProtocolVersion,

            string policyName,

            string policyType)
        {
            CipherSuites = cipherSuites;
            DisabledProtocols = disabledProtocols;
            MinProtocolVersion = minProtocolVersion;
            PolicyName = policyName;
            PolicyType = policyType;
        }
    }
}