// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class StreamingPolicyCommonEncryptionCencClearTrackCondition
    {
        /// <summary>
        /// The track property condition operation. Possible value is `Equal`. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public readonly string Operation;
        /// <summary>
        /// The track property type. Possible value is `FourCC`. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public readonly string Property;
        /// <summary>
        /// The track property value. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private StreamingPolicyCommonEncryptionCencClearTrackCondition(
            string operation,

            string property,

            string value)
        {
            Operation = operation;
            Property = property;
            Value = value;
        }
    }
}
