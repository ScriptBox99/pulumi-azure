// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterMicrosoftDefenderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the ID of the Log Analytics Workspace where the audit logs collected by Microsoft Defender should be sent to.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        public KubernetesClusterMicrosoftDefenderArgs()
        {
        }
    }
}