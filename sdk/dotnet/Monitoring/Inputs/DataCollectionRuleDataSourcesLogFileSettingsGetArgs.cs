// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class DataCollectionRuleDataSourcesLogFileSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `text` block as defined below.
        /// </summary>
        [Input("text", required: true)]
        public Input<Inputs.DataCollectionRuleDataSourcesLogFileSettingsTextGetArgs> Text { get; set; } = null!;

        public DataCollectionRuleDataSourcesLogFileSettingsGetArgs()
        {
        }
        public static new DataCollectionRuleDataSourcesLogFileSettingsGetArgs Empty => new DataCollectionRuleDataSourcesLogFileSettingsGetArgs();
    }
}