// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventPreviewIpAccessControlAllow {
    /**
     * @return The IP address or CIDR range.
     * 
     */
    private final @Nullable String address;
    /**
     * @return The friendly name for the IP address range.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The subnet mask prefix length (see CIDR notation).
     * 
     */
    private final @Nullable Integer subnetPrefixLength;

    @CustomType.Constructor
    private LiveEventPreviewIpAccessControlAllow(
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("subnetPrefixLength") @Nullable Integer subnetPrefixLength) {
        this.address = address;
        this.name = name;
        this.subnetPrefixLength = subnetPrefixLength;
    }

    /**
     * @return The IP address or CIDR range.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The friendly name for the IP address range.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The subnet mask prefix length (see CIDR notation).
     * 
     */
    public Optional<Integer> subnetPrefixLength() {
        return Optional.ofNullable(this.subnetPrefixLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreviewIpAccessControlAllow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String name;
        private @Nullable Integer subnetPrefixLength;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventPreviewIpAccessControlAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
    	      this.subnetPrefixLength = defaults.subnetPrefixLength;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder subnetPrefixLength(@Nullable Integer subnetPrefixLength) {
            this.subnetPrefixLength = subnetPrefixLength;
            return this;
        }        public LiveEventPreviewIpAccessControlAllow build() {
            return new LiveEventPreviewIpAccessControlAllow(address, name, subnetPrefixLength);
        }
    }
}