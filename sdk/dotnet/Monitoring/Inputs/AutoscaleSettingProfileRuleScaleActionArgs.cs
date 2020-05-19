// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class AutoscaleSettingProfileRuleScaleActionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The amount of time to wait since the last scaling action before this action occurs. Must be between 1 minute and 1 week and formatted as a ISO 8601 string.
        /// </summary>
        [Input("cooldown", required: true)]
        public Input<string> Cooldown { get; set; } = null!;

        /// <summary>
        /// The scale direction. Possible values are `Increase` and `Decrease`.
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// The type of action that should occur. Possible values are `ChangeCount`, `ExactCount` and `PercentChangeCount`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The number of instances involved in the scaling action. Defaults to `1`.
        /// </summary>
        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public AutoscaleSettingProfileRuleScaleActionArgs()
        {
        }
    }
}