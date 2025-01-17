// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewayFrontendIpConfiguration {
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private String id;
    /**
     * @return The name of this Application Gateway.
     * 
     */
    private String name;
    /**
     * @return The Static IP Address which is used.
     * 
     */
    private String privateIpAddress;
    /**
     * @return The allocation method used for the Private IP Address.
     * 
     */
    private String privateIpAddressAllocation;
    /**
     * @return The ID of the associated Private Link configuration.
     * 
     */
    private String privateLinkConfigurationId;
    /**
     * @return The name of the Private Link configuration in use by this Frontend IP Configuration.
     * 
     */
    private String privateLinkConfigurationName;
    /**
     * @return The ID of the Public IP Address which the Application Gateway will use.
     * 
     */
    private String publicIpAddressId;
    /**
     * @return The ID of the subnet the private link configuration is connected to.
     * 
     */
    private String subnetId;

    private GetApplicationGatewayFrontendIpConfiguration() {}
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of this Application Gateway.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Static IP Address which is used.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The allocation method used for the Private IP Address.
     * 
     */
    public String privateIpAddressAllocation() {
        return this.privateIpAddressAllocation;
    }
    /**
     * @return The ID of the associated Private Link configuration.
     * 
     */
    public String privateLinkConfigurationId() {
        return this.privateLinkConfigurationId;
    }
    /**
     * @return The name of the Private Link configuration in use by this Frontend IP Configuration.
     * 
     */
    public String privateLinkConfigurationName() {
        return this.privateLinkConfigurationName;
    }
    /**
     * @return The ID of the Public IP Address which the Application Gateway will use.
     * 
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }
    /**
     * @return The ID of the subnet the private link configuration is connected to.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewayFrontendIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String privateIpAddress;
        private String privateIpAddressAllocation;
        private String privateLinkConfigurationId;
        private String privateLinkConfigurationName;
        private String publicIpAddressId;
        private String subnetId;
        public Builder() {}
        public Builder(GetApplicationGatewayFrontendIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddressAllocation = defaults.privateIpAddressAllocation;
    	      this.privateLinkConfigurationId = defaults.privateLinkConfigurationId;
    	      this.privateLinkConfigurationName = defaults.privateLinkConfigurationName;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            this.privateIpAddressAllocation = Objects.requireNonNull(privateIpAddressAllocation);
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkConfigurationId(String privateLinkConfigurationId) {
            this.privateLinkConfigurationId = Objects.requireNonNull(privateLinkConfigurationId);
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkConfigurationName(String privateLinkConfigurationName) {
            this.privateLinkConfigurationName = Objects.requireNonNull(privateLinkConfigurationName);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetApplicationGatewayFrontendIpConfiguration build() {
            final var _resultValue = new GetApplicationGatewayFrontendIpConfiguration();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.privateIpAddress = privateIpAddress;
            _resultValue.privateIpAddressAllocation = privateIpAddressAllocation;
            _resultValue.privateLinkConfigurationId = privateLinkConfigurationId;
            _resultValue.privateLinkConfigurationName = privateLinkConfigurationName;
            _resultValue.publicIpAddressId = publicIpAddressId;
            _resultValue.subnetId = subnetId;
            return _resultValue;
        }
    }
}
