// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThreatIntelligenceIndicatorKillChainPhase {
    /**
     * @return The name which should be used for the Lockheed Martin cyber kill chain phase.
     * 
     */
    private @Nullable String name;

    private ThreatIntelligenceIndicatorKillChainPhase() {}
    /**
     * @return The name which should be used for the Lockheed Martin cyber kill chain phase.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThreatIntelligenceIndicatorKillChainPhase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        public Builder() {}
        public Builder(ThreatIntelligenceIndicatorKillChainPhase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ThreatIntelligenceIndicatorKillChainPhase build() {
            final var o = new ThreatIntelligenceIndicatorKillChainPhase();
            o.name = name;
            return o;
        }
    }
}