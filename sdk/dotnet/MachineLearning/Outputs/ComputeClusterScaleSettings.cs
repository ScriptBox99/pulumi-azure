// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MachineLearning.Outputs
{

    [OutputType]
    public sealed class ComputeClusterScaleSettings
    {
        /// <summary>
        /// Maximum node count. Changing this forces a new Machine Learning Compute Cluster to be created.
        /// </summary>
        public readonly int MaxNodeCount;
        /// <summary>
        /// Minimal node count. Changing this forces a new Machine Learning Compute Cluster to be created.
        /// </summary>
        public readonly int MinNodeCount;
        public readonly string ScaleDownNodesAfterIdleDuration;

        [OutputConstructor]
        private ComputeClusterScaleSettings(
            int maxNodeCount,

            int minNodeCount,

            string scaleDownNodesAfterIdleDuration)
        {
            MaxNodeCount = maxNodeCount;
            MinNodeCount = minNodeCount;
            ScaleDownNodesAfterIdleDuration = scaleDownNodesAfterIdleDuration;
        }
    }
}