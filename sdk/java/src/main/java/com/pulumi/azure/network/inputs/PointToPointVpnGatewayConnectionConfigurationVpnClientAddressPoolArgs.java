// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs Empty = new PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs();

    /**
     * A list of CIDR Ranges which should be used as Address Prefixes.
     * 
     */
    @Import(name="addressPrefixes", required=true)
    private Output<List<String>> addressPrefixes;

    /**
     * @return A list of CIDR Ranges which should be used as Address Prefixes.
     * 
     */
    public Output<List<String>> addressPrefixes() {
        return this.addressPrefixes;
    }

    private PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs() {}

    private PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs(PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs $) {
        this.addressPrefixes = $.addressPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs $;

        public Builder() {
            $ = new PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs();
        }

        public Builder(PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs defaults) {
            $ = new PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes A list of CIDR Ranges which should be used as Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes A list of CIDR Ranges which should be used as Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes A list of CIDR Ranges which should be used as Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        public PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolArgs build() {
            $.addressPrefixes = Objects.requireNonNull($.addressPrefixes, "expected parameter 'addressPrefixes' to be non-null");
            return $;
        }
    }

}
