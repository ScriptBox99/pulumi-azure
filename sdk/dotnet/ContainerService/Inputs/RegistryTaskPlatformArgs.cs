// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryTaskPlatformArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The OS architecture. Possible values are `amd64`, `x86`, `386`, `arm` and `arm64`.
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// The operating system type required for the task. Possible values are `Windows` and `Linux`.
        /// </summary>
        [Input("os", required: true)]
        public Input<string> Os { get; set; } = null!;

        /// <summary>
        /// The variant of the CPU. Possible values are `v6`, `v7`, `v8`.
        /// </summary>
        [Input("variant")]
        public Input<string>? Variant { get; set; }

        public RegistryTaskPlatformArgs()
        {
        }
    }
}