// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateCertificatePolicyLifetimeActionAction {
    /**
     * @return The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
     * 
     */
    private final String actionType;

    @CustomType.Constructor
    private CertificateCertificatePolicyLifetimeActionAction(@CustomType.Parameter("actionType") String actionType) {
        this.actionType = actionType;
    }

    /**
     * @return The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
     * 
     */
    public String actionType() {
        return this.actionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificatePolicyLifetimeActionAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificatePolicyLifetimeActionAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }        public CertificateCertificatePolicyLifetimeActionAction build() {
            return new CertificateCertificatePolicyLifetimeActionAction(actionType);
        }
    }
}