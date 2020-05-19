// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Kusto.Outputs
{

    [OutputType]
    public sealed class ClusterSku
    {
        /// <summary>
        /// Specifies the node count for the cluster. Boundaries depend on the sku name.
        /// </summary>
        public readonly int Capacity;
        /// <summary>
        /// The name of the SKU. Valid values are: `Dev(No SLA)_Standard_D11_v2`, `Standard_D11_v2`, `Standard_D12_v2`, `Standard_D13_v2`, `Standard_D14_v2`, `Standard_DS13_v2+1TB_PS`, `Standard_DS13_v2+2TB_PS`, `Standard_DS14_v2+3TB_PS`, `Standard_DS14_v2+4TB_PS`, `Standard_L16s`, `Standard_L4s` and `Standard_L8s`
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ClusterSku(
            int capacity,

            string name)
        {
            Capacity = capacity;
            Name = name;
        }
    }
}