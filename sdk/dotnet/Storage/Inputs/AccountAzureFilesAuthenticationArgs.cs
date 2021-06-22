// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class AccountAzureFilesAuthenticationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `active_directory` block as defined below. Required when `directory_type` is `AD`.
        /// </summary>
        [Input("activeDirectory")]
        public Input<Inputs.AccountAzureFilesAuthenticationActiveDirectoryArgs>? ActiveDirectory { get; set; }

        /// <summary>
        /// Specifies the directory service used. Possible values are `AADDS` and `AD`.
        /// </summary>
        [Input("directoryType", required: true)]
        public Input<string> DirectoryType { get; set; } = null!;

        public AccountAzureFilesAuthenticationArgs()
        {
        }
    }
}