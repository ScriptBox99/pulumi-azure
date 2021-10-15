// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class ApplicationGatewayTrustedClientCertificateGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The base-64 encoded certificate.
        /// </summary>
        [Input("data", required: true)]
        public Input<string> Data { get; set; } = null!;

        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the Trusted Client Certificate that is unique within this Application Gateway.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ApplicationGatewayTrustedClientCertificateGetArgs()
        {
        }
    }
}