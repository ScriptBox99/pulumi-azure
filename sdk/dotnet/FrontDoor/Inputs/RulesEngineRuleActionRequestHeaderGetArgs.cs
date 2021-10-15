// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Inputs
{

    public sealed class RulesEngineRuleActionRequestHeaderGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// can be set to `Overwrite`, `Append` or `Delete`.
        /// </summary>
        [Input("headerActionType")]
        public Input<string>? HeaderActionType { get; set; }

        /// <summary>
        /// header name (string).
        /// </summary>
        [Input("headerName")]
        public Input<string>? HeaderName { get; set; }

        /// <summary>
        /// value name (string).
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public RulesEngineRuleActionRequestHeaderGetArgs()
        {
        }
    }
}