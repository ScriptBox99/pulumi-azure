// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesSubscription {
    private @Nullable Boolean preventCancellationOnDestroy;

    private FeaturesSubscription() {}
    public Optional<Boolean> preventCancellationOnDestroy() {
        return Optional.ofNullable(this.preventCancellationOnDestroy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesSubscription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean preventCancellationOnDestroy;
        public Builder() {}
        public Builder(FeaturesSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preventCancellationOnDestroy = defaults.preventCancellationOnDestroy;
        }

        @CustomType.Setter
        public Builder preventCancellationOnDestroy(@Nullable Boolean preventCancellationOnDestroy) {
            this.preventCancellationOnDestroy = preventCancellationOnDestroy;
            return this;
        }
        public FeaturesSubscription build() {
            final var _resultValue = new FeaturesSubscription();
            _resultValue.preventCancellationOnDestroy = preventCancellationOnDestroy;
            return _resultValue;
        }
    }
}
