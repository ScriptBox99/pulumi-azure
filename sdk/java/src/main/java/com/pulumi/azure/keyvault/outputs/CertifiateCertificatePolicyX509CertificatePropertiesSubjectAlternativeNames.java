// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames {
    /**
     * @return A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> dnsNames;
    /**
     * @return A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> emails;
    /**
     * @return A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> upns;

    @CustomType.Constructor
    private CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames(
        @CustomType.Parameter("dnsNames") @Nullable List<String> dnsNames,
        @CustomType.Parameter("emails") @Nullable List<String> emails,
        @CustomType.Parameter("upns") @Nullable List<String> upns) {
        this.dnsNames = dnsNames;
        this.emails = emails;
        this.upns = upns;
    }

    /**
     * @return A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    public List<String> dnsNames() {
        return this.dnsNames == null ? List.of() : this.dnsNames;
    }
    /**
     * @return A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
     * 
     */
    public List<String> emails() {
        return this.emails == null ? List.of() : this.emails;
    }
    /**
     * @return A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    public List<String> upns() {
        return this.upns == null ? List.of() : this.upns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsNames;
        private @Nullable List<String> emails;
        private @Nullable List<String> upns;

        public Builder() {
    	      // Empty
        }

        public Builder(CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsNames = defaults.dnsNames;
    	      this.emails = defaults.emails;
    	      this.upns = defaults.upns;
        }

        public Builder dnsNames(@Nullable List<String> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        public Builder emails(@Nullable List<String> emails) {
            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        public Builder upns(@Nullable List<String> upns) {
            this.upns = upns;
            return this;
        }
        public Builder upns(String... upns) {
            return upns(List.of(upns));
        }        public CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames build() {
            return new CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames(dnsNames, emails, upns);
        }
    }
}