// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class AccountCustomerManagedKeyGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Key Vault Key, supplying a version-less key ID will enable auto-rotation of this key.
        /// </summary>
        [Input("keyVaultKeyId", required: true)]
        public Input<string> KeyVaultKeyId { get; set; } = null!;

        /// <summary>
        /// The ID of a user assigned identity.
        /// </summary>
        [Input("userAssignedIdentityId", required: true)]
        public Input<string> UserAssignedIdentityId { get; set; } = null!;

        public AccountCustomerManagedKeyGetArgs()
        {
        }
    }
}