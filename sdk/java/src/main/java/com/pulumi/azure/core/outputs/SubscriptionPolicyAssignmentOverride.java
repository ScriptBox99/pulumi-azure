// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.azure.core.outputs.SubscriptionPolicyAssignmentOverrideSelector;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionPolicyAssignmentOverride {
    /**
     * @return One or more `override_selector` as defined below.
     * 
     */
    private @Nullable List<SubscriptionPolicyAssignmentOverrideSelector> selectors;
    /**
     * @return Specifies the value to override the policy property. Possible values for `policyEffect` override listed [policy effects](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/effects).
     * 
     */
    private String value;

    private SubscriptionPolicyAssignmentOverride() {}
    /**
     * @return One or more `override_selector` as defined below.
     * 
     */
    public List<SubscriptionPolicyAssignmentOverrideSelector> selectors() {
        return this.selectors == null ? List.of() : this.selectors;
    }
    /**
     * @return Specifies the value to override the policy property. Possible values for `policyEffect` override listed [policy effects](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/effects).
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPolicyAssignmentOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<SubscriptionPolicyAssignmentOverrideSelector> selectors;
        private String value;
        public Builder() {}
        public Builder(SubscriptionPolicyAssignmentOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder selectors(@Nullable List<SubscriptionPolicyAssignmentOverrideSelector> selectors) {
            this.selectors = selectors;
            return this;
        }
        public Builder selectors(SubscriptionPolicyAssignmentOverrideSelector... selectors) {
            return selectors(List.of(selectors));
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SubscriptionPolicyAssignmentOverride build() {
            final var _resultValue = new SubscriptionPolicyAssignmentOverride();
            _resultValue.selectors = selectors;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
