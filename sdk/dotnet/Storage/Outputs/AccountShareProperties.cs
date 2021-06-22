// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class AccountShareProperties
    {
        /// <summary>
        /// A `cors_rule` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AccountSharePropertiesCorsRule> CorsRules;
        /// <summary>
        /// (Optional) A `retention_policy` block as defined below.
        /// </summary>
        public readonly Outputs.AccountSharePropertiesRetentionPolicy? RetentionPolicy;
        /// <summary>
        /// (Optional) A `smb` block as defined below.
        /// </summary>
        public readonly Outputs.AccountSharePropertiesSmb? Smb;

        [OutputConstructor]
        private AccountShareProperties(
            ImmutableArray<Outputs.AccountSharePropertiesCorsRule> corsRules,

            Outputs.AccountSharePropertiesRetentionPolicy? retentionPolicy,

            Outputs.AccountSharePropertiesSmb? smb)
        {
            CorsRules = corsRules;
            RetentionPolicy = retentionPolicy;
            Smb = smb;
        }
    }
}