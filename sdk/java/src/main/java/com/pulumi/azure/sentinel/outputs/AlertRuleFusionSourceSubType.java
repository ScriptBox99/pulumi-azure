// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertRuleFusionSourceSubType {
    /**
     * @return Whether this source subtype under source signal is enabled or disabled in Fusion detection. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The Name of the source subtype under a given source signal in Fusion detection. Refer to Fusion alert rule template for supported values.
     * 
     */
    private String name;
    /**
     * @return A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
     * 
     */
    private List<String> severitiesAlloweds;

    private AlertRuleFusionSourceSubType() {}
    /**
     * @return Whether this source subtype under source signal is enabled or disabled in Fusion detection. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The Name of the source subtype under a given source signal in Fusion detection. Refer to Fusion alert rule template for supported values.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
     * 
     */
    public List<String> severitiesAlloweds() {
        return this.severitiesAlloweds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleFusionSourceSubType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private String name;
        private List<String> severitiesAlloweds;
        public Builder() {}
        public Builder(AlertRuleFusionSourceSubType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.severitiesAlloweds = defaults.severitiesAlloweds;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder severitiesAlloweds(List<String> severitiesAlloweds) {
            this.severitiesAlloweds = Objects.requireNonNull(severitiesAlloweds);
            return this;
        }
        public Builder severitiesAlloweds(String... severitiesAlloweds) {
            return severitiesAlloweds(List.of(severitiesAlloweds));
        }
        public AlertRuleFusionSourceSubType build() {
            final var o = new AlertRuleFusionSourceSubType();
            o.enabled = enabled;
            o.name = name;
            o.severitiesAlloweds = severitiesAlloweds;
            return o;
        }
    }
}