// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs : Pulumi.ResourceArgs
    {
        [Input("certificates", required: true)]
        private InputList<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs>? _certificates;
        public InputList<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateArgs>());
            set => _certificates = value;
        }

        [Input("keyVaultId", required: true)]
        public Input<string> KeyVaultId { get; set; } = null!;

        public OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs()
        {
        }
    }
}