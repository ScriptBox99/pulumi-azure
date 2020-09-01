// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class ApiOauth2AuthorizationGetArgs : Pulumi.ResourceArgs
    {
        [Input("authorizationServerName", required: true)]
        public Input<string> AuthorizationServerName { get; set; } = null!;

        /// <summary>
        /// Operations scope.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public ApiOauth2AuthorizationGetArgs()
        {
        }
    }
}