// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cognitive.Inputs
{

    public sealed class DeploymentScaleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Deployment scale type. Possible value is `Standard`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DeploymentScaleGetArgs()
        {
        }
        public static new DeploymentScaleGetArgs Empty => new DeploymentScaleGetArgs();
    }
}