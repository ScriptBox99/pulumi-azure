// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration.Outputs
{

    [OutputType]
    public sealed class ConfigurationStoreEncryption
    {
        /// <summary>
        /// Specifies the client id of the identity which will be used to access key vault.
        /// </summary>
        public readonly string? IdentityClientId;
        /// <summary>
        /// Specifies the URI of the key vault key used to encrypt data.
        /// </summary>
        public readonly string? KeyVaultKeyIdentifier;

        [OutputConstructor]
        private ConfigurationStoreEncryption(
            string? identityClientId,

            string? keyVaultKeyIdentifier)
        {
            IdentityClientId = identityClientId;
            KeyVaultKeyIdentifier = keyVaultKeyIdentifier;
        }
    }
}