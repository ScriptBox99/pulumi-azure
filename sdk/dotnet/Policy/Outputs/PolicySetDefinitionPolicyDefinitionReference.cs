// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Policy.Outputs
{

    [OutputType]
    public sealed class PolicySetDefinitionPolicyDefinitionReference
    {
        /// <summary>
        /// A mapping of the parameter values for the referenced policy rule. The keys are the parameter names.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Parameters;
        /// <summary>
        /// The ID of the policy definition or policy set definition that will be included in this policy set definition.
        /// </summary>
        public readonly string PolicyDefinitionId;
        /// <summary>
        /// A unique ID within this policy set definition for this policy definition reference.
        /// </summary>
        public readonly string? ReferenceId;

        [OutputConstructor]
        private PolicySetDefinitionPolicyDefinitionReference(
            ImmutableDictionary<string, object>? parameters,

            string policyDefinitionId,

            string? referenceId)
        {
            Parameters = parameters;
            PolicyDefinitionId = policyDefinitionId;
            ReferenceId = referenceId;
        }
    }
}