// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class PoolStartTaskContainerRegistryArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password to log into the registry server. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The container registry URL. The default is "docker.io". Changing this forces a new resource to be created.
        /// </summary>
        [Input("registryServer", required: true)]
        public Input<string> RegistryServer { get; set; } = null!;

        /// <summary>
        /// An identity reference from pool's user assigned managed identity list.
        /// </summary>
        [Input("userAssignedIdentityId")]
        public Input<string>? UserAssignedIdentityId { get; set; }

        /// <summary>
        /// The username to be used by the Batch pool start task.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public PoolStartTaskContainerRegistryArgs()
        {
        }
        public static new PoolStartTaskContainerRegistryArgs Empty => new PoolStartTaskContainerRegistryArgs();
    }
}