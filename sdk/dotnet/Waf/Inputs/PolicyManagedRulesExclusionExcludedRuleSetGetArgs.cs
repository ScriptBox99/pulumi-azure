// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Waf.Inputs
{

    public sealed class PolicyManagedRulesExclusionExcludedRuleSetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ruleGroups")]
        private InputList<Inputs.PolicyManagedRulesExclusionExcludedRuleSetRuleGroupGetArgs>? _ruleGroups;

        /// <summary>
        /// One or more `rule_group` block defined below.
        /// </summary>
        public InputList<Inputs.PolicyManagedRulesExclusionExcludedRuleSetRuleGroupGetArgs> RuleGroups
        {
            get => _ruleGroups ?? (_ruleGroups = new InputList<Inputs.PolicyManagedRulesExclusionExcludedRuleSetRuleGroupGetArgs>());
            set => _ruleGroups = value;
        }

        /// <summary>
        /// The rule set type. The only possible value is `OWASP` . Defaults to `OWASP`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The rule set version. The only possible value is `3.2` . Defaults to `3.2`.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public PolicyManagedRulesExclusionExcludedRuleSetGetArgs()
        {
        }
        public static new PolicyManagedRulesExclusionExcludedRuleSetGetArgs Empty => new PolicyManagedRulesExclusionExcludedRuleSetGetArgs();
    }
}