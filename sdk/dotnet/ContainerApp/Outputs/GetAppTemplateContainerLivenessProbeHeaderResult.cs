// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class GetAppTemplateContainerLivenessProbeHeaderResult
    {
        /// <summary>
        /// The name of the Container App.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The HTTP Header value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetAppTemplateContainerLivenessProbeHeaderResult(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}