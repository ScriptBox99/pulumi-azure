// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfidentialLedgerCertificateBasedSecurityPrincipal {
    /**
     * @return The Ledger Role to grant this Certificate Security Principal.
     * 
     */
    private final String ledgerRoleName;
    /**
     * @return The public key, in PEM format, of the certificate used by this identity to authenticate with the Confidential Ledger.
     * 
     */
    private final String pemPublicKey;

    @CustomType.Constructor
    private GetConfidentialLedgerCertificateBasedSecurityPrincipal(
        @CustomType.Parameter("ledgerRoleName") String ledgerRoleName,
        @CustomType.Parameter("pemPublicKey") String pemPublicKey) {
        this.ledgerRoleName = ledgerRoleName;
        this.pemPublicKey = pemPublicKey;
    }

    /**
     * @return The Ledger Role to grant this Certificate Security Principal.
     * 
     */
    public String ledgerRoleName() {
        return this.ledgerRoleName;
    }
    /**
     * @return The public key, in PEM format, of the certificate used by this identity to authenticate with the Confidential Ledger.
     * 
     */
    public String pemPublicKey() {
        return this.pemPublicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfidentialLedgerCertificateBasedSecurityPrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ledgerRoleName;
        private String pemPublicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfidentialLedgerCertificateBasedSecurityPrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ledgerRoleName = defaults.ledgerRoleName;
    	      this.pemPublicKey = defaults.pemPublicKey;
        }

        public Builder ledgerRoleName(String ledgerRoleName) {
            this.ledgerRoleName = Objects.requireNonNull(ledgerRoleName);
            return this;
        }
        public Builder pemPublicKey(String pemPublicKey) {
            this.pemPublicKey = Objects.requireNonNull(pemPublicKey);
            return this;
        }        public GetConfidentialLedgerCertificateBasedSecurityPrincipal build() {
            return new GetConfidentialLedgerCertificateBasedSecurityPrincipal(ledgerRoleName, pemPublicKey);
        }
    }
}