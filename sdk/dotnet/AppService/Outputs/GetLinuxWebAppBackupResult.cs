// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetLinuxWebAppBackupResult
    {
        /// <summary>
        /// Is the Backup enabled?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The name of this Linux Web App.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A `schedule` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppBackupScheduleResult> Schedules;
        /// <summary>
        /// The SAS URL to the container.
        /// </summary>
        public readonly string StorageAccountUrl;

        [OutputConstructor]
        private GetLinuxWebAppBackupResult(
            bool enabled,

            string name,

            ImmutableArray<Outputs.GetLinuxWebAppBackupScheduleResult> schedules,

            string storageAccountUrl)
        {
            Enabled = enabled;
            Name = name;
            Schedules = schedules;
            StorageAccountUrl = storageAccountUrl;
        }
    }
}