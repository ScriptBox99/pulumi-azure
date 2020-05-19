// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Outputs
{

    [OutputType]
    public sealed class FirewallPolicyManagedRule
    {
        /// <summary>
        /// One or more `exclusion` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.FirewallPolicyManagedRuleExclusion> Exclusions;
        /// <summary>
        /// One or more `override` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.FirewallPolicyManagedRuleOverride> Overrides;
        /// <summary>
        /// The name of the managed rule to use with this resource.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The version on the managed rule to use with this resource.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private FirewallPolicyManagedRule(
            ImmutableArray<Outputs.FirewallPolicyManagedRuleExclusion> exclusions,

            ImmutableArray<Outputs.FirewallPolicyManagedRuleOverride> overrides,

            string type,

            string version)
        {
            Exclusions = exclusions;
            Overrides = overrides;
            Type = type;
            Version = version;
        }
    }
}