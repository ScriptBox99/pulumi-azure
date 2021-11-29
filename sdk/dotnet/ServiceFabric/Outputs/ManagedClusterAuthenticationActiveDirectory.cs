// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceFabric.Outputs
{

    [OutputType]
    public sealed class ManagedClusterAuthenticationActiveDirectory
    {
        /// <summary>
        /// The ID of the Client Application.
        /// </summary>
        public readonly string ClientApplicationId;
        /// <summary>
        /// The ID of the Cluster Application.
        /// </summary>
        public readonly string ClusterApplicationId;
        /// <summary>
        /// The ID of the Tenant.
        /// </summary>
        public readonly string TenantId;

        [OutputConstructor]
        private ManagedClusterAuthenticationActiveDirectory(
            string clientApplicationId,

            string clusterApplicationId,

            string tenantId)
        {
            ClientApplicationId = clientApplicationId;
            ClusterApplicationId = clusterApplicationId;
            TenantId = tenantId;
        }
    }
}