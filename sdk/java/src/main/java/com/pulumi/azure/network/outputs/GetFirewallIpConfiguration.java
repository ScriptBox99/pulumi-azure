// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallIpConfiguration {
    /**
     * @return The name of the Azure Firewall.
     * 
     */
    private final String name;
    /**
     * @return The private IP address associated with the Azure Firewall.
     * 
     */
    private final String privateIpAddress;
    private final String publicIpAddressId;
    /**
     * @return The ID of the Subnet where the Azure Firewall is deployed.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private GetFirewallIpConfiguration(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateIpAddress") String privateIpAddress,
        @CustomType.Parameter("publicIpAddressId") String publicIpAddressId,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.name = name;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddressId = publicIpAddressId;
        this.subnetId = subnetId;
    }

    /**
     * @return The name of the Azure Firewall.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The private IP address associated with the Azure Firewall.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }
    /**
     * @return The ID of the Subnet where the Azure Firewall is deployed.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String privateIpAddress;
        private String publicIpAddressId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetFirewallIpConfiguration build() {
            return new GetFirewallIpConfiguration(name, privateIpAddress, publicIpAddressId, subnetId);
        }
    }
}