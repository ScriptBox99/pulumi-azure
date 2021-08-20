// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DomainServices.Outputs
{

    [OutputType]
    public sealed class GetServiceNotificationResult
    {
        /// <summary>
        /// A list of additional email addresses to notify when there are alerts in the managed domain.
        /// </summary>
        public readonly ImmutableArray<string> AdditionalRecipients;
        /// <summary>
        /// Whethermembers of the _AAD DC Administrators_ group are notified when there are alerts in the managed domain.
        /// </summary>
        public readonly bool NotifyDcAdmins;
        /// <summary>
        /// Whether all Global Administrators are notified when there are alerts in the managed domain.
        /// </summary>
        public readonly bool NotifyGlobalAdmins;

        [OutputConstructor]
        private GetServiceNotificationResult(
            ImmutableArray<string> additionalRecipients,

            bool notifyDcAdmins,

            bool notifyGlobalAdmins)
        {
            AdditionalRecipients = additionalRecipients;
            NotifyDcAdmins = notifyDcAdmins;
            NotifyGlobalAdmins = notifyGlobalAdmins;
        }
    }
}