// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventGrid.Outputs
{

    [OutputType]
    public sealed class SystemTopicEventSubscriptionDeliveryProperty
    {
        /// <summary>
        /// The name of the header to send on to the destination.
        /// </summary>
        public readonly string HeaderName;
        /// <summary>
        /// Set to `true` if the `value` is a secret and should be protected, otherwise `false`. If `true` then this value won't be returned from Azure API calls.
        /// </summary>
        public readonly bool? Secret;
        /// <summary>
        /// If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
        /// </summary>
        public readonly string? SourceField;
        /// <summary>
        /// Either `Static` or `Dynamic`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// If the `type` is `Static`, then provide the value to use.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private SystemTopicEventSubscriptionDeliveryProperty(
            string headerName,

            bool? secret,

            string? sourceField,

            string type,

            string? value)
        {
            HeaderName = headerName;
            Secret = secret;
            SourceField = sourceField;
            Type = type;
            Value = value;
        }
    }
}