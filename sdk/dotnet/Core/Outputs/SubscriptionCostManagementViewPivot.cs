// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Outputs
{

    [OutputType]
    public sealed class SubscriptionCostManagementViewPivot
    {
        /// <summary>
        /// The name of the column which should be used for this sub-view in the Cost Analysis UI.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The data type to show in this sub-view. Possible values are `Dimension` and `TagKey`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private SubscriptionCostManagementViewPivot(
            string name,

            string type)
        {
            Name = name;
            Type = type;
        }
    }
}