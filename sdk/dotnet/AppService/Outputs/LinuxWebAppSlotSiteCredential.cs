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
    public sealed class LinuxWebAppSlotSiteCredential
    {
        /// <summary>
        /// The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Site Credentials Password used for publishing.
        /// </summary>
        public readonly string? Password;

        [OutputConstructor]
        private LinuxWebAppSlotSiteCredential(
            string? name,

            string? password)
        {
            Name = name;
            Password = password;
        }
    }
}