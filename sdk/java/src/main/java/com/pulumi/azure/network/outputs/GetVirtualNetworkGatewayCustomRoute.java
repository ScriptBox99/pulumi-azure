// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNetworkGatewayCustomRoute {
    /**
     * @return A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    private final List<String> addressPrefixes;

    @CustomType.Constructor
    private GetVirtualNetworkGatewayCustomRoute(@CustomType.Parameter("addressPrefixes") List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
    }

    /**
     * @return A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayCustomRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> addressPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayCustomRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
        }

        public Builder addressPrefixes(List<String> addressPrefixes) {
            this.addressPrefixes = Objects.requireNonNull(addressPrefixes);
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }        public GetVirtualNetworkGatewayCustomRoute build() {
            return new GetVirtualNetworkGatewayCustomRoute(addressPrefixes);
        }
    }
}