// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret {
    private final List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate> certificates;
    private final String keyVaultId;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret(
        @CustomType.Parameter("certificates") List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate> certificates,
        @CustomType.Parameter("keyVaultId") String keyVaultId) {
        this.certificates = certificates;
        this.keyVaultId = keyVaultId;
    }

    public List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate> certificates() {
        return this.certificates;
    }
    public String keyVaultId() {
        return this.keyVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate> certificates;
        private String keyVaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.keyVaultId = defaults.keyVaultId;
        }

        public Builder certificates(List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }        public OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret build() {
            return new OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret(certificates, keyVaultId);
        }
    }
}