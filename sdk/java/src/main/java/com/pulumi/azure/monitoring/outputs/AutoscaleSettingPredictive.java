// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleSettingPredictive {
    /**
     * @return Specifies the amount of time by which instances are launched in advance. It must be between `PT1M` and `PT1H` in ISO 8601 format.
     * 
     */
    private @Nullable String lookAheadTime;
    /**
     * @return Specifies the predictive scale mode. Possible values are `Enabled` or `ForecastOnly`.
     * 
     */
    private String scaleMode;

    private AutoscaleSettingPredictive() {}
    /**
     * @return Specifies the amount of time by which instances are launched in advance. It must be between `PT1M` and `PT1H` in ISO 8601 format.
     * 
     */
    public Optional<String> lookAheadTime() {
        return Optional.ofNullable(this.lookAheadTime);
    }
    /**
     * @return Specifies the predictive scale mode. Possible values are `Enabled` or `ForecastOnly`.
     * 
     */
    public String scaleMode() {
        return this.scaleMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingPredictive defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lookAheadTime;
        private String scaleMode;
        public Builder() {}
        public Builder(AutoscaleSettingPredictive defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lookAheadTime = defaults.lookAheadTime;
    	      this.scaleMode = defaults.scaleMode;
        }

        @CustomType.Setter
        public Builder lookAheadTime(@Nullable String lookAheadTime) {
            this.lookAheadTime = lookAheadTime;
            return this;
        }
        @CustomType.Setter
        public Builder scaleMode(String scaleMode) {
            this.scaleMode = Objects.requireNonNull(scaleMode);
            return this;
        }
        public AutoscaleSettingPredictive build() {
            final var _resultValue = new AutoscaleSettingPredictive();
            _resultValue.lookAheadTime = lookAheadTime;
            _resultValue.scaleMode = scaleMode;
            return _resultValue;
        }
    }
}
