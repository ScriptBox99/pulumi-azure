// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class GetFrontdoorSecretSecretCustomerCertificateResult
    {
        /// <summary>
        /// The key vault certificate ID.
        /// </summary>
        public readonly string KeyVaultCertificateId;
        /// <summary>
        /// One or more `subject alternative names` contained within the key vault certificate.
        /// </summary>
        public readonly ImmutableArray<string> SubjectAlternativeNames;

        [OutputConstructor]
        private GetFrontdoorSecretSecretCustomerCertificateResult(
            string keyVaultCertificateId,

            ImmutableArray<string> subjectAlternativeNames)
        {
            KeyVaultCertificateId = keyVaultCertificateId;
            SubjectAlternativeNames = subjectAlternativeNames;
        }
    }
}