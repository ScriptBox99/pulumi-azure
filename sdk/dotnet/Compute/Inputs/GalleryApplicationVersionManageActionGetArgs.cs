// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class GalleryApplicationVersionManageActionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The command to install the Gallery Application. Changing this forces a new resource to be created.
        /// </summary>
        [Input("install", required: true)]
        public Input<string> Install { get; set; } = null!;

        /// <summary>
        /// The command to remove the Gallery Application. Changing this forces a new resource to be created.
        /// </summary>
        [Input("remove", required: true)]
        public Input<string> Remove { get; set; } = null!;

        /// <summary>
        /// The command to update the Gallery Application. Changing this forces a new resource to be created.
        /// </summary>
        [Input("update")]
        public Input<string>? Update { get; set; }

        public GalleryApplicationVersionManageActionGetArgs()
        {
        }
    }
}