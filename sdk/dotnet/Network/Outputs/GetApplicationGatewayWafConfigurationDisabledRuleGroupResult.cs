// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class GetApplicationGatewayWafConfigurationDisabledRuleGroupResult
    {
        /// <summary>
        /// The rule group where specific rules are disabled.
        /// </summary>
        public readonly string RuleGroupName;
        /// <summary>
        /// A list of rules which will be disabled in that group.
        /// </summary>
        public readonly ImmutableArray<int> Rules;

        [OutputConstructor]
        private GetApplicationGatewayWafConfigurationDisabledRuleGroupResult(
            string ruleGroupName,

            ImmutableArray<int> rules)
        {
            RuleGroupName = ruleGroupName;
            Rules = rules;
        }
    }
}