// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Maintenance.Outputs
{

    [OutputType]
    public sealed class GetConfigurationInstallPatchResult
    {
        /// <summary>
        /// A `linux` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConfigurationInstallPatchLinuxResult> Linuxes;
        /// <summary>
        /// Possible reboot preference as defined by the user based on which it would be decided to reboot the machine or not after the patch operation is completed.
        /// </summary>
        public readonly string Reboot;
        /// <summary>
        /// A `windows` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConfigurationInstallPatchWindowResult> Windows;

        [OutputConstructor]
        private GetConfigurationInstallPatchResult(
            ImmutableArray<Outputs.GetConfigurationInstallPatchLinuxResult> linuxes,

            string reboot,

            ImmutableArray<Outputs.GetConfigurationInstallPatchWindowResult> windows)
        {
            Linuxes = linuxes;
            Reboot = reboot;
            Windows = windows;
        }
    }
}