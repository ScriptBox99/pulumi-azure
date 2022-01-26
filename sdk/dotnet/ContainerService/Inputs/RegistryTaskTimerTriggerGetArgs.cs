// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryTaskTimerTriggerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should the trigger be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name which should be used for this trigger.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The CRON expression for the task schedule.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        public RegistryTaskTimerTriggerGetArgs()
        {
        }
    }
}