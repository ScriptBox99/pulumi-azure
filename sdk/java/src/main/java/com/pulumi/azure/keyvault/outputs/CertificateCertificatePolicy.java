// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyIssuerParameters;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyKeyProperties;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyLifetimeAction;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicySecretProperties;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyX509CertificateProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificatePolicy {
    /**
     * @return A `issuer_parameters` block as defined below.
     * 
     */
    private final CertificateCertificatePolicyIssuerParameters issuerParameters;
    /**
     * @return A `key_properties` block as defined below.
     * 
     */
    private final CertificateCertificatePolicyKeyProperties keyProperties;
    /**
     * @return A `lifetime_action` block as defined below.
     * 
     */
    private final @Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions;
    /**
     * @return A `secret_properties` block as defined below.
     * 
     */
    private final CertificateCertificatePolicySecretProperties secretProperties;
    /**
     * @return A `x509_certificate_properties` block as defined below. Required when `certificate` block is not specified.
     * 
     */
    private final @Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties;

    @CustomType.Constructor
    private CertificateCertificatePolicy(
        @CustomType.Parameter("issuerParameters") CertificateCertificatePolicyIssuerParameters issuerParameters,
        @CustomType.Parameter("keyProperties") CertificateCertificatePolicyKeyProperties keyProperties,
        @CustomType.Parameter("lifetimeActions") @Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions,
        @CustomType.Parameter("secretProperties") CertificateCertificatePolicySecretProperties secretProperties,
        @CustomType.Parameter("x509CertificateProperties") @Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties) {
        this.issuerParameters = issuerParameters;
        this.keyProperties = keyProperties;
        this.lifetimeActions = lifetimeActions;
        this.secretProperties = secretProperties;
        this.x509CertificateProperties = x509CertificateProperties;
    }

    /**
     * @return A `issuer_parameters` block as defined below.
     * 
     */
    public CertificateCertificatePolicyIssuerParameters issuerParameters() {
        return this.issuerParameters;
    }
    /**
     * @return A `key_properties` block as defined below.
     * 
     */
    public CertificateCertificatePolicyKeyProperties keyProperties() {
        return this.keyProperties;
    }
    /**
     * @return A `lifetime_action` block as defined below.
     * 
     */
    public List<CertificateCertificatePolicyLifetimeAction> lifetimeActions() {
        return this.lifetimeActions == null ? List.of() : this.lifetimeActions;
    }
    /**
     * @return A `secret_properties` block as defined below.
     * 
     */
    public CertificateCertificatePolicySecretProperties secretProperties() {
        return this.secretProperties;
    }
    /**
     * @return A `x509_certificate_properties` block as defined below. Required when `certificate` block is not specified.
     * 
     */
    public Optional<CertificateCertificatePolicyX509CertificateProperties> x509CertificateProperties() {
        return Optional.ofNullable(this.x509CertificateProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificatePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificatePolicyIssuerParameters issuerParameters;
        private CertificateCertificatePolicyKeyProperties keyProperties;
        private @Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions;
        private CertificateCertificatePolicySecretProperties secretProperties;
        private @Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuerParameters = defaults.issuerParameters;
    	      this.keyProperties = defaults.keyProperties;
    	      this.lifetimeActions = defaults.lifetimeActions;
    	      this.secretProperties = defaults.secretProperties;
    	      this.x509CertificateProperties = defaults.x509CertificateProperties;
        }

        public Builder issuerParameters(CertificateCertificatePolicyIssuerParameters issuerParameters) {
            this.issuerParameters = Objects.requireNonNull(issuerParameters);
            return this;
        }
        public Builder keyProperties(CertificateCertificatePolicyKeyProperties keyProperties) {
            this.keyProperties = Objects.requireNonNull(keyProperties);
            return this;
        }
        public Builder lifetimeActions(@Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions) {
            this.lifetimeActions = lifetimeActions;
            return this;
        }
        public Builder lifetimeActions(CertificateCertificatePolicyLifetimeAction... lifetimeActions) {
            return lifetimeActions(List.of(lifetimeActions));
        }
        public Builder secretProperties(CertificateCertificatePolicySecretProperties secretProperties) {
            this.secretProperties = Objects.requireNonNull(secretProperties);
            return this;
        }
        public Builder x509CertificateProperties(@Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties) {
            this.x509CertificateProperties = x509CertificateProperties;
            return this;
        }        public CertificateCertificatePolicy build() {
            return new CertificateCertificatePolicy(issuerParameters, keyProperties, lifetimeActions, secretProperties, x509CertificateProperties);
        }
    }
}