// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class NetworkAttachedDataNetworkNetworkAddressPortTranslation
    {
        /// <summary>
        /// Pinhole timeout for ICMP pinholes in seconds. Must between `1` to `180`, Default to `180`.
        /// </summary>
        public readonly int? IcmpPinholeTimeoutInSeconds;
        public readonly int? PinholeMaximumNumber;
        /// <summary>
        /// A `port_range` block as defined below.
        /// </summary>
        public readonly Outputs.NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange? PortRange;
        /// <summary>
        /// Pinhole timeout for TCP pinholes in seconds. Must between `1` to `180`, Default to `180`.
        /// </summary>
        public readonly int? TcpPinholeTimeoutInSeconds;
        /// <summary>
        /// Minimum time in seconds that will pass before a TCP port that was used by a closed pinhole can be reused. Defaults to `120`.
        /// </summary>
        public readonly int? TcpPortReuseMinimumHoldTimeInSeconds;
        /// <summary>
        /// Pinhole timeout for UDP pinholes in seconds. Must between `1` to `180`, Default to `180`.
        /// </summary>
        public readonly int? UdpPinholeTimeoutInSeconds;
        /// <summary>
        /// Minimum time in seconds that will pass before a UDP port that was used by a closed pinhole can be reused. Defaults to `60`.
        /// </summary>
        public readonly int? UdpPortReuseMinimumHoldTimeInSeconds;

        [OutputConstructor]
        private NetworkAttachedDataNetworkNetworkAddressPortTranslation(
            int? icmpPinholeTimeoutInSeconds,

            int? pinholeMaximumNumber,

            Outputs.NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange? portRange,

            int? tcpPinholeTimeoutInSeconds,

            int? tcpPortReuseMinimumHoldTimeInSeconds,

            int? udpPinholeTimeoutInSeconds,

            int? udpPortReuseMinimumHoldTimeInSeconds)
        {
            IcmpPinholeTimeoutInSeconds = icmpPinholeTimeoutInSeconds;
            PinholeMaximumNumber = pinholeMaximumNumber;
            PortRange = portRange;
            TcpPinholeTimeoutInSeconds = tcpPinholeTimeoutInSeconds;
            TcpPortReuseMinimumHoldTimeInSeconds = tcpPortReuseMinimumHoldTimeInSeconds;
            UdpPinholeTimeoutInSeconds = udpPinholeTimeoutInSeconds;
            UdpPortReuseMinimumHoldTimeInSeconds = udpPortReuseMinimumHoldTimeInSeconds;
        }
    }
}