// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayPrivateLinkConfigurationIpConfiguration {
    /**
     * @return The name of the IP configuration.
     * 
     */
    private final String name;
    /**
     * @return Is this the Primary IP Configuration?
     * 
     */
    private final Boolean primary;
    /**
     * @return The Static IP Address which should be used.
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * @return The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     */
    private final String privateIpAddressAllocation;
    /**
     * @return The ID of the subnet the private link configuration should connect to.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private ApplicationGatewayPrivateLinkConfigurationIpConfiguration(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primary") Boolean primary,
        @CustomType.Parameter("privateIpAddress") @Nullable String privateIpAddress,
        @CustomType.Parameter("privateIpAddressAllocation") String privateIpAddressAllocation,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.name = name;
        this.primary = primary;
        this.privateIpAddress = privateIpAddress;
        this.privateIpAddressAllocation = privateIpAddressAllocation;
        this.subnetId = subnetId;
    }

    /**
     * @return The name of the IP configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Is this the Primary IP Configuration?
     * 
     */
    public Boolean primary() {
        return this.primary;
    }
    /**
     * @return The Static IP Address which should be used.
     * 
     */
    public Optional<String> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * @return The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     */
    public String privateIpAddressAllocation() {
        return this.privateIpAddressAllocation;
    }
    /**
     * @return The ID of the subnet the private link configuration should connect to.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPrivateLinkConfigurationIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Boolean primary;
        private @Nullable String privateIpAddress;
        private String privateIpAddressAllocation;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayPrivateLinkConfigurationIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddressAllocation = defaults.privateIpAddressAllocation;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            this.privateIpAddressAllocation = Objects.requireNonNull(privateIpAddressAllocation);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public ApplicationGatewayPrivateLinkConfigurationIpConfiguration build() {
            return new ApplicationGatewayPrivateLinkConfigurationIpConfiguration(name, primary, privateIpAddress, privateIpAddressAllocation, subnetId);
        }
    }
}