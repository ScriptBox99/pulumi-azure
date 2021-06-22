// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterNodePoolKubeletConfig
    {
        /// <summary>
        /// Specifies the allow list of unsafe sysctls command or patterns (ending in `*`). Changing this forces a new resource to be created.
        /// </summary>
        public readonly ImmutableArray<string> AllowedUnsafeSysctls;
        /// <summary>
        /// Specifies the maximum number of container log files that can be present for a container. must be at least 2. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? ContainerLogMaxLine;
        /// <summary>
        /// Specifies the maximum size (e.g. 10MB) of container log file before it is rotated. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? ContainerLogMaxSizeMb;
        /// <summary>
        /// Is CPU CFS quota enforcement for containers enabled? Changing this forces a new resource to be created.
        /// </summary>
        public readonly bool? CpuCfsQuotaEnabled;
        /// <summary>
        /// Specifies the CPU CFS quota period value. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? CpuCfsQuotaPeriod;
        /// <summary>
        /// Specifies the CPU Manager policy to use. Possible values are `none` and `static`, Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? CpuManagerPolicy;
        /// <summary>
        /// Specifies the percent of disk usage above which image garbage collection is always run. Must be between `0` and `100`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? ImageGcHighThreshold;
        /// <summary>
        /// Specifies the percent of disk usage lower than which image garbage collection is never run. Must be between `0` and `100`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? ImageGcLowThreshold;
        public readonly int? PodMaxPid;
        /// <summary>
        /// Specifies the Topology Manager policy to use. Possible values are `none`, `best-effort`, `restricted` or `single-numa-node`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? TopologyManagerPolicy;

        [OutputConstructor]
        private KubernetesClusterNodePoolKubeletConfig(
            ImmutableArray<string> allowedUnsafeSysctls,

            int? containerLogMaxLine,

            int? containerLogMaxSizeMb,

            bool? cpuCfsQuotaEnabled,

            string? cpuCfsQuotaPeriod,

            string? cpuManagerPolicy,

            int? imageGcHighThreshold,

            int? imageGcLowThreshold,

            int? podMaxPid,

            string? topologyManagerPolicy)
        {
            AllowedUnsafeSysctls = allowedUnsafeSysctls;
            ContainerLogMaxLine = containerLogMaxLine;
            ContainerLogMaxSizeMb = containerLogMaxSizeMb;
            CpuCfsQuotaEnabled = cpuCfsQuotaEnabled;
            CpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            CpuManagerPolicy = cpuManagerPolicy;
            ImageGcHighThreshold = imageGcHighThreshold;
            ImageGcLowThreshold = imageGcLowThreshold;
            PodMaxPid = podMaxPid;
            TopologyManagerPolicy = topologyManagerPolicy;
        }
    }
}