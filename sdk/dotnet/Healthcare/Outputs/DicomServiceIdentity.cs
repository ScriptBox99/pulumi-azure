// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare.Outputs
{

    [OutputType]
    public sealed class DicomServiceIdentity
    {
        /// <summary>
        /// A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        public readonly string? PrincipalId;
        public readonly string? TenantId;
        /// <summary>
        /// The type of identity used for the Healthcare DICOM service. Possible values are `SystemAssigned` and `UserAssigned`. If `UserAssigned` is set, an `identity_ids` must be set as well.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private DicomServiceIdentity(
            ImmutableArray<string> identityIds,

            string? principalId,

            string? tenantId,

            string type)
        {
            IdentityIds = identityIds;
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}