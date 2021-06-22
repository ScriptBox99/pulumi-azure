// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class LinkedServiceSqlServerKeyVaultConnectionString
    {
        /// <summary>
        /// Specifies the name of an existing Key Vault Data Factory Linked Service.
        /// </summary>
        public readonly string LinkedServiceName;
        /// <summary>
        /// Specifies the secret name in Azure Key Vault that stores SQL Server connection string.
        /// </summary>
        public readonly string SecretName;

        [OutputConstructor]
        private LinkedServiceSqlServerKeyVaultConnectionString(
            string linkedServiceName,

            string secretName)
        {
            LinkedServiceName = linkedServiceName;
            SecretName = secretName;
        }
    }
}