// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetBootDiagnostics {
    private final @Nullable Boolean enabled;
    private final String storageUri;

    @CustomType.Constructor
    private ScaleSetBootDiagnostics(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("storageUri") String storageUri) {
        this.enabled = enabled;
        this.storageUri = storageUri;
    }

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public String storageUri() {
        return this.storageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetBootDiagnostics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSetBootDiagnostics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder storageUri(String storageUri) {
            this.storageUri = Objects.requireNonNull(storageUri);
            return this;
        }        public ScaleSetBootDiagnostics build() {
            return new ScaleSetBootDiagnostics(enabled, storageUri);
        }
    }
}