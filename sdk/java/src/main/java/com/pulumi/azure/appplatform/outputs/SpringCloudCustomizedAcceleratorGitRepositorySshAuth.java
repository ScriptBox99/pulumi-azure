// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudCustomizedAcceleratorGitRepositorySshAuth {
    /**
     * @return Specifies the Public SSH Key of git repository basic auth.
     * 
     */
    private @Nullable String hostKey;
    /**
     * @return Specifies the SSH Key algorithm of git repository basic auth.
     * 
     */
    private @Nullable String hostKeyAlgorithm;
    /**
     * @return Specifies the Private SSH Key of git repository basic auth.
     * 
     */
    private String privateKey;

    private SpringCloudCustomizedAcceleratorGitRepositorySshAuth() {}
    /**
     * @return Specifies the Public SSH Key of git repository basic auth.
     * 
     */
    public Optional<String> hostKey() {
        return Optional.ofNullable(this.hostKey);
    }
    /**
     * @return Specifies the SSH Key algorithm of git repository basic auth.
     * 
     */
    public Optional<String> hostKeyAlgorithm() {
        return Optional.ofNullable(this.hostKeyAlgorithm);
    }
    /**
     * @return Specifies the Private SSH Key of git repository basic auth.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudCustomizedAcceleratorGitRepositorySshAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hostKey;
        private @Nullable String hostKeyAlgorithm;
        private String privateKey;
        public Builder() {}
        public Builder(SpringCloudCustomizedAcceleratorGitRepositorySshAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostKey = defaults.hostKey;
    	      this.hostKeyAlgorithm = defaults.hostKeyAlgorithm;
    	      this.privateKey = defaults.privateKey;
        }

        @CustomType.Setter
        public Builder hostKey(@Nullable String hostKey) {
            this.hostKey = hostKey;
            return this;
        }
        @CustomType.Setter
        public Builder hostKeyAlgorithm(@Nullable String hostKeyAlgorithm) {
            this.hostKeyAlgorithm = hostKeyAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public SpringCloudCustomizedAcceleratorGitRepositorySshAuth build() {
            final var o = new SpringCloudCustomizedAcceleratorGitRepositorySshAuth();
            o.hostKey = hostKey;
            o.hostKeyAlgorithm = hostKeyAlgorithm;
            o.privateKey = privateKey;
            return o;
        }
    }
}