// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Outputs
{

    [OutputType]
    public sealed class ReplicatedVMNetworkInterface
    {
        /// <summary>
        /// Id of the public IP object to use when a test failover is done.
        /// </summary>
        public readonly string? FailoverTestPublicIpAddressId;
        /// <summary>
        /// Static IP to assign when a test failover is done.
        /// </summary>
        public readonly string? FailoverTestStaticIp;
        /// <summary>
        /// Name of the subnet to to use when a test failover is done.
        /// </summary>
        public readonly string? FailoverTestSubnetName;
        public readonly bool? IsPrimary;
        /// <summary>
        /// Id of the public IP object to use when a failover is done.
        /// </summary>
        public readonly string? RecoveryPublicIpAddressId;
        /// <summary>
        /// (Required if the network_interface block is specified) Id source network interface.
        /// </summary>
        public readonly string? SourceNetworkInterfaceId;
        /// <summary>
        /// Static IP to assign when a failover is done.
        /// </summary>
        public readonly string? TargetStaticIp;
        /// <summary>
        /// Name of the subnet to to use when a failover is done.
        /// </summary>
        public readonly string? TargetSubnetName;

        [OutputConstructor]
        private ReplicatedVMNetworkInterface(
            string? failoverTestPublicIpAddressId,

            string? failoverTestStaticIp,

            string? failoverTestSubnetName,

            bool? isPrimary,

            string? recoveryPublicIpAddressId,

            string? sourceNetworkInterfaceId,

            string? targetStaticIp,

            string? targetSubnetName)
        {
            FailoverTestPublicIpAddressId = failoverTestPublicIpAddressId;
            FailoverTestStaticIp = failoverTestStaticIp;
            FailoverTestSubnetName = failoverTestSubnetName;
            IsPrimary = isPrimary;
            RecoveryPublicIpAddressId = recoveryPublicIpAddressId;
            SourceNetworkInterfaceId = sourceNetworkInterfaceId;
            TargetStaticIp = targetStaticIp;
            TargetSubnetName = targetSubnetName;
        }
    }
}
