// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrafficManagerExternalEndpointSubnet {
    /**
     * @return The first IP Address in this subnet.
     * 
     */
    private final String first;
    /**
     * @return The last IP Address in this subnet.
     * 
     */
    private final @Nullable String last;
    /**
     * @return The block size (number of leading bits in the subnet mask).
     * 
     */
    private final @Nullable Integer scope;

    @CustomType.Constructor
    private TrafficManagerExternalEndpointSubnet(
        @CustomType.Parameter("first") String first,
        @CustomType.Parameter("last") @Nullable String last,
        @CustomType.Parameter("scope") @Nullable Integer scope) {
        this.first = first;
        this.last = last;
        this.scope = scope;
    }

    /**
     * @return The first IP Address in this subnet.
     * 
     */
    public String first() {
        return this.first;
    }
    /**
     * @return The last IP Address in this subnet.
     * 
     */
    public Optional<String> last() {
        return Optional.ofNullable(this.last);
    }
    /**
     * @return The block size (number of leading bits in the subnet mask).
     * 
     */
    public Optional<Integer> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficManagerExternalEndpointSubnet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String first;
        private @Nullable String last;
        private @Nullable Integer scope;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficManagerExternalEndpointSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.first = defaults.first;
    	      this.last = defaults.last;
    	      this.scope = defaults.scope;
        }

        public Builder first(String first) {
            this.first = Objects.requireNonNull(first);
            return this;
        }
        public Builder last(@Nullable String last) {
            this.last = last;
            return this;
        }
        public Builder scope(@Nullable Integer scope) {
            this.scope = scope;
            return this;
        }        public TrafficManagerExternalEndpointSubnet build() {
            return new TrafficManagerExternalEndpointSubnet(first, last, scope);
        }
    }
}