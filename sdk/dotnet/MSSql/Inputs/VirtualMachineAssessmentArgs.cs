// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class VirtualMachineAssessmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should Assessment be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Should Assessment be run immediately? Defaults to `false`.
        /// </summary>
        [Input("runImmediately")]
        public Input<bool>? RunImmediately { get; set; }

        /// <summary>
        /// An `schedule` block as defined below.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.VirtualMachineAssessmentScheduleArgs>? Schedule { get; set; }

        public VirtualMachineAssessmentArgs()
        {
        }
        public static new VirtualMachineAssessmentArgs Empty => new VirtualMachineAssessmentArgs();
    }
}