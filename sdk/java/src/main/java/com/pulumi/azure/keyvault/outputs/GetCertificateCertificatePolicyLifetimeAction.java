// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.GetCertificateCertificatePolicyLifetimeActionAction;
import com.pulumi.azure.keyvault.outputs.GetCertificateCertificatePolicyLifetimeActionTrigger;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCertificateCertificatePolicyLifetimeAction {
    /**
     * @return A `action` block as defined below.
     * 
     */
    private final List<GetCertificateCertificatePolicyLifetimeActionAction> actions;
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    private final List<GetCertificateCertificatePolicyLifetimeActionTrigger> triggers;

    @CustomType.Constructor
    private GetCertificateCertificatePolicyLifetimeAction(
        @CustomType.Parameter("actions") List<GetCertificateCertificatePolicyLifetimeActionAction> actions,
        @CustomType.Parameter("triggers") List<GetCertificateCertificatePolicyLifetimeActionTrigger> triggers) {
        this.actions = actions;
        this.triggers = triggers;
    }

    /**
     * @return A `action` block as defined below.
     * 
     */
    public List<GetCertificateCertificatePolicyLifetimeActionAction> actions() {
        return this.actions;
    }
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    public List<GetCertificateCertificatePolicyLifetimeActionTrigger> triggers() {
        return this.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateCertificatePolicyLifetimeAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetCertificateCertificatePolicyLifetimeActionAction> actions;
        private List<GetCertificateCertificatePolicyLifetimeActionTrigger> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateCertificatePolicyLifetimeAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.triggers = defaults.triggers;
        }

        public Builder actions(List<GetCertificateCertificatePolicyLifetimeActionAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GetCertificateCertificatePolicyLifetimeActionAction... actions) {
            return actions(List.of(actions));
        }
        public Builder triggers(List<GetCertificateCertificatePolicyLifetimeActionTrigger> triggers) {
            this.triggers = Objects.requireNonNull(triggers);
            return this;
        }
        public Builder triggers(GetCertificateCertificatePolicyLifetimeActionTrigger... triggers) {
            return triggers(List.of(triggers));
        }        public GetCertificateCertificatePolicyLifetimeAction build() {
            return new GetCertificateCertificatePolicyLifetimeAction(actions, triggers);
        }
    }
}