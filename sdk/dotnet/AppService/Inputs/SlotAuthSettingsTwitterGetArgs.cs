// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class SlotAuthSettingsTwitterGetArgs : Pulumi.ResourceArgs
    {
        [Input("consumerKey", required: true)]
        public Input<string> ConsumerKey { get; set; } = null!;

        [Input("consumerSecret", required: true)]
        public Input<string> ConsumerSecret { get; set; } = null!;

        public SlotAuthSettingsTwitterGetArgs()
        {
        }
    }
}