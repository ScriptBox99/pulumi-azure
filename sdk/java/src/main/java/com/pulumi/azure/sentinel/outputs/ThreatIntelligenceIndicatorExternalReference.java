// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThreatIntelligenceIndicatorExternalReference {
    /**
     * @return The description of the external reference of the Threat Intelligence Indicator.
     * 
     */
    private @Nullable String description;
    /**
     * @return The list of hashes of the external reference of the Threat Intelligence Indicator.
     * 
     */
    private @Nullable Map<String,String> hashes;
    /**
     * @return The ID of the Sentinel Threat Intelligence Indicator.
     * 
     */
    private @Nullable String id;
    /**
     * @return The source name of the external reference of the Threat Intelligence Indicator.
     * 
     */
    private @Nullable String sourceName;
    /**
     * @return The url of the external reference of the Threat Intelligence Indicator.
     * 
     */
    private @Nullable String url;

    private ThreatIntelligenceIndicatorExternalReference() {}
    /**
     * @return The description of the external reference of the Threat Intelligence Indicator.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The list of hashes of the external reference of the Threat Intelligence Indicator.
     * 
     */
    public Map<String,String> hashes() {
        return this.hashes == null ? Map.of() : this.hashes;
    }
    /**
     * @return The ID of the Sentinel Threat Intelligence Indicator.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The source name of the external reference of the Threat Intelligence Indicator.
     * 
     */
    public Optional<String> sourceName() {
        return Optional.ofNullable(this.sourceName);
    }
    /**
     * @return The url of the external reference of the Threat Intelligence Indicator.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThreatIntelligenceIndicatorExternalReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable Map<String,String> hashes;
        private @Nullable String id;
        private @Nullable String sourceName;
        private @Nullable String url;
        public Builder() {}
        public Builder(ThreatIntelligenceIndicatorExternalReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hashes = defaults.hashes;
    	      this.id = defaults.id;
    	      this.sourceName = defaults.sourceName;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder hashes(@Nullable Map<String,String> hashes) {
            this.hashes = hashes;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder sourceName(@Nullable String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ThreatIntelligenceIndicatorExternalReference build() {
            final var _resultValue = new ThreatIntelligenceIndicatorExternalReference();
            _resultValue.description = description;
            _resultValue.hashes = hashes;
            _resultValue.id = id;
            _resultValue.sourceName = sourceName;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
