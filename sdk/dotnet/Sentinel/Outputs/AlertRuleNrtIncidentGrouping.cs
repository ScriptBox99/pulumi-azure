// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Outputs
{

    [OutputType]
    public sealed class AlertRuleNrtIncidentGrouping
    {
        /// <summary>
        /// A list of alert details to group by, only when the `entity_matching_method` is `Selected`. Possible values are `DisplayName` and `Severity`.
        /// </summary>
        public readonly ImmutableArray<string> ByAlertDetails;
        /// <summary>
        /// A list of custom details keys to group by, only when the `entity_matching_method` is `Selected`. Only keys defined in the `custom_details` may be used.
        /// </summary>
        public readonly ImmutableArray<string> ByCustomDetails;
        /// <summary>
        /// A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
        /// </summary>
        public readonly ImmutableArray<string> ByEntities;
        /// <summary>
        /// Enable grouping incidents created from alerts triggered by this Sentinel NRT Alert Rule. Defaults to `true`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
        /// </summary>
        public readonly string? EntityMatchingMethod;
        /// <summary>
        /// Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
        /// </summary>
        public readonly string? LookbackDuration;
        /// <summary>
        /// Whether to re-open closed matching incidents? Defaults to `false`.
        /// </summary>
        public readonly bool? ReopenClosedIncidents;

        [OutputConstructor]
        private AlertRuleNrtIncidentGrouping(
            ImmutableArray<string> byAlertDetails,

            ImmutableArray<string> byCustomDetails,

            ImmutableArray<string> byEntities,

            bool? enabled,

            string? entityMatchingMethod,

            string? lookbackDuration,

            bool? reopenClosedIncidents)
        {
            ByAlertDetails = byAlertDetails;
            ByCustomDetails = byCustomDetails;
            ByEntities = byEntities;
            Enabled = enabled;
            EntityMatchingMethod = entityMatchingMethod;
            LookbackDuration = lookbackDuration;
            ReopenClosedIncidents = reopenClosedIncidents;
        }
    }
}