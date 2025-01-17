// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class ActionRuleActionGroupConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `alert_context` block as defined below.
        /// </summary>
        [Input("alertContext")]
        public Input<Inputs.ActionRuleActionGroupConditionAlertContextGetArgs>? AlertContext { get; set; }

        /// <summary>
        /// A `alert_rule_id` block as defined below.
        /// </summary>
        [Input("alertRuleId")]
        public Input<Inputs.ActionRuleActionGroupConditionAlertRuleIdGetArgs>? AlertRuleId { get; set; }

        /// <summary>
        /// A `description` block as defined below.
        /// </summary>
        [Input("description")]
        public Input<Inputs.ActionRuleActionGroupConditionDescriptionGetArgs>? Description { get; set; }

        /// <summary>
        /// A `monitor` block as defined below.
        /// </summary>
        [Input("monitor")]
        public Input<Inputs.ActionRuleActionGroupConditionMonitorGetArgs>? Monitor { get; set; }

        /// <summary>
        /// A `monitor_service` as block defined below.
        /// </summary>
        [Input("monitorService")]
        public Input<Inputs.ActionRuleActionGroupConditionMonitorServiceGetArgs>? MonitorService { get; set; }

        /// <summary>
        /// A `severity` block as defined below.
        /// </summary>
        [Input("severity")]
        public Input<Inputs.ActionRuleActionGroupConditionSeverityGetArgs>? Severity { get; set; }

        /// <summary>
        /// A `target_resource_type` block as defined below.
        /// </summary>
        [Input("targetResourceType")]
        public Input<Inputs.ActionRuleActionGroupConditionTargetResourceTypeGetArgs>? TargetResourceType { get; set; }

        public ActionRuleActionGroupConditionGetArgs()
        {
        }
        public static new ActionRuleActionGroupConditionGetArgs Empty => new ActionRuleActionGroupConditionGetArgs();
    }
}
