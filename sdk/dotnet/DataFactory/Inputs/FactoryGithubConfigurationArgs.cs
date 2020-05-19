// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class FactoryGithubConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the GitHub account name.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        /// <summary>
        /// Specifies the branch of the repository to get code from.
        /// </summary>
        [Input("branchName", required: true)]
        public Input<string> BranchName { get; set; } = null!;

        /// <summary>
        /// Specifies the GitHub Enterprise host name. For example: https://github.mydomain.com. Use https://github.com for open source repositories.
        /// </summary>
        [Input("gitUrl", required: true)]
        public Input<string> GitUrl { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the git repository.
        /// </summary>
        [Input("repositoryName", required: true)]
        public Input<string> RepositoryName { get; set; } = null!;

        /// <summary>
        /// Specifies the root folder within the repository. Set to `/` for the top level.
        /// </summary>
        [Input("rootFolder", required: true)]
        public Input<string> RootFolder { get; set; } = null!;

        public FactoryGithubConfigurationArgs()
        {
        }
    }
}