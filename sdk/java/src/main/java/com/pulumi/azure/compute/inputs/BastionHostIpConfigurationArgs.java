// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BastionHostIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BastionHostIpConfigurationArgs Empty = new BastionHostIpConfigurationArgs();

    /**
     * The name of the IP configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the IP configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Reference to a Public IP Address to associate with this Bastion Host.
     * 
     */
    @Import(name="publicIpAddressId", required=true)
    private Output<String> publicIpAddressId;

    /**
     * @return Reference to a Public IP Address to associate with this Bastion Host.
     * 
     */
    public Output<String> publicIpAddressId() {
        return this.publicIpAddressId;
    }

    /**
     * Reference to a subnet in which this Bastion Host has been created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return Reference to a subnet in which this Bastion Host has been created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private BastionHostIpConfigurationArgs() {}

    private BastionHostIpConfigurationArgs(BastionHostIpConfigurationArgs $) {
        this.name = $.name;
        this.publicIpAddressId = $.publicIpAddressId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BastionHostIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BastionHostIpConfigurationArgs $;

        public Builder() {
            $ = new BastionHostIpConfigurationArgs();
        }

        public Builder(BastionHostIpConfigurationArgs defaults) {
            $ = new BastionHostIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicIpAddressId Reference to a Public IP Address to associate with this Bastion Host.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId Reference to a Public IP Address to associate with this Bastion Host.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        /**
         * @param subnetId Reference to a subnet in which this Bastion Host has been created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId Reference to a subnet in which this Bastion Host has been created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public BastionHostIpConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.publicIpAddressId = Objects.requireNonNull($.publicIpAddressId, "expected parameter 'publicIpAddressId' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}