// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automanage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationAzureSecurityBaseline {
    /**
     * @return The assignment type of the azure security baseline. Possible values are `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `Audit` and `DeployAndAutoCorrect`. Defaults to `ApplyAndAutoCorrect`.
     * 
     */
    private @Nullable String assignmentType;

    private ConfigurationAzureSecurityBaseline() {}
    /**
     * @return The assignment type of the azure security baseline. Possible values are `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `Audit` and `DeployAndAutoCorrect`. Defaults to `ApplyAndAutoCorrect`.
     * 
     */
    public Optional<String> assignmentType() {
        return Optional.ofNullable(this.assignmentType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAzureSecurityBaseline defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String assignmentType;
        public Builder() {}
        public Builder(ConfigurationAzureSecurityBaseline defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentType = defaults.assignmentType;
        }

        @CustomType.Setter
        public Builder assignmentType(@Nullable String assignmentType) {
            this.assignmentType = assignmentType;
            return this;
        }
        public ConfigurationAzureSecurityBaseline build() {
            final var o = new ConfigurationAzureSecurityBaseline();
            o.assignmentType = assignmentType;
            return o;
        }
    }
}