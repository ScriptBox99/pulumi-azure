// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSimStaticIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkSimStaticIpConfigurationArgs Empty = new NetworkSimStaticIpConfigurationArgs();

    /**
     * The ID of attached data network on which the static IP address will be used. The combination of attached data network and slice defines the network scope of the IP address.
     * 
     */
    @Import(name="attachedDataNetworkId", required=true)
    private Output<String> attachedDataNetworkId;

    /**
     * @return The ID of attached data network on which the static IP address will be used. The combination of attached data network and slice defines the network scope of the IP address.
     * 
     */
    public Output<String> attachedDataNetworkId() {
        return this.attachedDataNetworkId;
    }

    @Import(name="sliceId", required=true)
    private Output<String> sliceId;

    public Output<String> sliceId() {
        return this.sliceId;
    }

    /**
     * The IPv4 address assigned to the SIM at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attached data network.
     * 
     */
    @Import(name="staticIpv4Address")
    private @Nullable Output<String> staticIpv4Address;

    /**
     * @return The IPv4 address assigned to the SIM at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attached data network.
     * 
     */
    public Optional<Output<String>> staticIpv4Address() {
        return Optional.ofNullable(this.staticIpv4Address);
    }

    private NetworkSimStaticIpConfigurationArgs() {}

    private NetworkSimStaticIpConfigurationArgs(NetworkSimStaticIpConfigurationArgs $) {
        this.attachedDataNetworkId = $.attachedDataNetworkId;
        this.sliceId = $.sliceId;
        this.staticIpv4Address = $.staticIpv4Address;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkSimStaticIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkSimStaticIpConfigurationArgs $;

        public Builder() {
            $ = new NetworkSimStaticIpConfigurationArgs();
        }

        public Builder(NetworkSimStaticIpConfigurationArgs defaults) {
            $ = new NetworkSimStaticIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachedDataNetworkId The ID of attached data network on which the static IP address will be used. The combination of attached data network and slice defines the network scope of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataNetworkId(Output<String> attachedDataNetworkId) {
            $.attachedDataNetworkId = attachedDataNetworkId;
            return this;
        }

        /**
         * @param attachedDataNetworkId The ID of attached data network on which the static IP address will be used. The combination of attached data network and slice defines the network scope of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataNetworkId(String attachedDataNetworkId) {
            return attachedDataNetworkId(Output.of(attachedDataNetworkId));
        }

        public Builder sliceId(Output<String> sliceId) {
            $.sliceId = sliceId;
            return this;
        }

        public Builder sliceId(String sliceId) {
            return sliceId(Output.of(sliceId));
        }

        /**
         * @param staticIpv4Address The IPv4 address assigned to the SIM at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attached data network.
         * 
         * @return builder
         * 
         */
        public Builder staticIpv4Address(@Nullable Output<String> staticIpv4Address) {
            $.staticIpv4Address = staticIpv4Address;
            return this;
        }

        /**
         * @param staticIpv4Address The IPv4 address assigned to the SIM at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attached data network.
         * 
         * @return builder
         * 
         */
        public Builder staticIpv4Address(String staticIpv4Address) {
            return staticIpv4Address(Output.of(staticIpv4Address));
        }

        public NetworkSimStaticIpConfigurationArgs build() {
            $.attachedDataNetworkId = Objects.requireNonNull($.attachedDataNetworkId, "expected parameter 'attachedDataNetworkId' to be non-null");
            $.sliceId = Objects.requireNonNull($.sliceId, "expected parameter 'sliceId' to be non-null");
            return $;
        }
    }

}