// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceVirtualNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVirtualNetworkConfigurationArgs Empty = new ServiceVirtualNetworkConfigurationArgs();

    /**
     * The id of the subnet that will be used for the API Management.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The id of the subnet that will be used for the API Management.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private ServiceVirtualNetworkConfigurationArgs() {}

    private ServiceVirtualNetworkConfigurationArgs(ServiceVirtualNetworkConfigurationArgs $) {
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVirtualNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVirtualNetworkConfigurationArgs $;

        public Builder() {
            $ = new ServiceVirtualNetworkConfigurationArgs();
        }

        public Builder(ServiceVirtualNetworkConfigurationArgs defaults) {
            $ = new ServiceVirtualNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetId The id of the subnet that will be used for the API Management.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The id of the subnet that will be used for the API Management.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public ServiceVirtualNetworkConfigurationArgs build() {
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}