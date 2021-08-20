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
    public sealed class GetVpnGatewayBgpSettingResult
    {
        /// <summary>
        /// The ASN of the BGP Speaker.
        /// </summary>
        public readonly int Asn;
        /// <summary>
        /// The Address which should be used for the BGP Peering.
        /// </summary>
        public readonly string BgpPeeringAddress;
        /// <summary>
        /// an `instance_bgp_peering_address` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpnGatewayBgpSettingInstance0BgpPeeringAddressResult> Instance0BgpPeeringAddresses;
        /// <summary>
        /// an `instance_bgp_peering_address` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpnGatewayBgpSettingInstance1BgpPeeringAddressResult> Instance1BgpPeeringAddresses;
        /// <summary>
        /// The weight added to Routes learned from this BGP Speaker.
        /// </summary>
        public readonly int PeerWeight;

        [OutputConstructor]
        private GetVpnGatewayBgpSettingResult(
            int asn,

            string bgpPeeringAddress,

            ImmutableArray<Outputs.GetVpnGatewayBgpSettingInstance0BgpPeeringAddressResult> instance0BgpPeeringAddresses,

            ImmutableArray<Outputs.GetVpnGatewayBgpSettingInstance1BgpPeeringAddressResult> instance1BgpPeeringAddresses,

            int peerWeight)
        {
            Asn = asn;
            BgpPeeringAddress = bgpPeeringAddress;
            Instance0BgpPeeringAddresses = instance0BgpPeeringAddresses;
            Instance1BgpPeeringAddresses = instance1BgpPeeringAddresses;
            PeerWeight = peerWeight;
        }
    }
}