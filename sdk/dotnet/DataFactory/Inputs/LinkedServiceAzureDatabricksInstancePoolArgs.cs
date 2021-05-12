// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class LinkedServiceAzureDatabricksInstancePoolArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Spark version of a the cluster.
        /// </summary>
        [Input("clusterVersion", required: true)]
        public Input<string> ClusterVersion { get; set; } = null!;

        /// <summary>
        /// Identifier of the instance pool within the linked ADB instance.
        /// </summary>
        [Input("instancePoolId", required: true)]
        public Input<string> InstancePoolId { get; set; } = null!;

        /// <summary>
        /// The max number of worker nodes. Set this value if you want to enable autoscaling between the `min_number_of_workers` and this value. Omit this value to use a fixed number of workers defined in the `min_number_of_workers` property.
        /// </summary>
        [Input("maxNumberOfWorkers")]
        public Input<int>? MaxNumberOfWorkers { get; set; }

        /// <summary>
        /// The minimum number of worker nodes. Defaults to 1.
        /// </summary>
        [Input("minNumberOfWorkers")]
        public Input<int>? MinNumberOfWorkers { get; set; }

        public LinkedServiceAzureDatabricksInstancePoolArgs()
        {
        }
    }
}