// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualMachineScaleSetNetworkInterface {
    /**
     * @return An array of the DNS servers in use.
     * 
     */
    private final List<String> dnsServers;
    /**
     * @return Whether to enable accelerated networking or not.
     * 
     */
    private final Boolean enableAcceleratedNetworking;
    /**
     * @return Whether IP forwarding is enabled on this NIC.
     * 
     */
    private final Boolean enableIpForwarding;
    /**
     * @return An `ip_configuration` block as documented below.
     * 
     */
    private final List<GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration> ipConfigurations;
    /**
     * @return The name of this Virtual Machine Scale Set.
     * 
     */
    private final String name;
    /**
     * @return The identifier for the network security group.
     * 
     */
    private final String networkSecurityGroupId;
    /**
     * @return If this ip_configuration is the primary one.
     * 
     */
    private final Boolean primary;

    @CustomType.Constructor
    private GetVirtualMachineScaleSetNetworkInterface(
        @CustomType.Parameter("dnsServers") List<String> dnsServers,
        @CustomType.Parameter("enableAcceleratedNetworking") Boolean enableAcceleratedNetworking,
        @CustomType.Parameter("enableIpForwarding") Boolean enableIpForwarding,
        @CustomType.Parameter("ipConfigurations") List<GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration> ipConfigurations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkSecurityGroupId") String networkSecurityGroupId,
        @CustomType.Parameter("primary") Boolean primary) {
        this.dnsServers = dnsServers;
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.enableIpForwarding = enableIpForwarding;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.networkSecurityGroupId = networkSecurityGroupId;
        this.primary = primary;
    }

    /**
     * @return An array of the DNS servers in use.
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }
    /**
     * @return Whether to enable accelerated networking or not.
     * 
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }
    /**
     * @return Whether IP forwarding is enabled on this NIC.
     * 
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }
    /**
     * @return An `ip_configuration` block as documented below.
     * 
     */
    public List<GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return The name of this Virtual Machine Scale Set.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The identifier for the network security group.
     * 
     */
    public String networkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }
    /**
     * @return If this ip_configuration is the primary one.
     * 
     */
    public Boolean primary() {
        return this.primary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dnsServers;
        private Boolean enableAcceleratedNetworking;
        private Boolean enableIpForwarding;
        private List<GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration> ipConfigurations;
        private String name;
        private String networkSecurityGroupId;
        private Boolean primary;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineScaleSetNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableIpForwarding = defaults.enableIpForwarding;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupId = defaults.networkSecurityGroupId;
    	      this.primary = defaults.primary;
        }

        public Builder dnsServers(List<String> dnsServers) {
            this.dnsServers = Objects.requireNonNull(dnsServers);
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder enableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = Objects.requireNonNull(enableAcceleratedNetworking);
            return this;
        }
        public Builder enableIpForwarding(Boolean enableIpForwarding) {
            this.enableIpForwarding = Objects.requireNonNull(enableIpForwarding);
            return this;
        }
        public Builder ipConfigurations(List<GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(GetVirtualMachineScaleSetNetworkInterfaceIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            this.networkSecurityGroupId = Objects.requireNonNull(networkSecurityGroupId);
            return this;
        }
        public Builder primary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }        public GetVirtualMachineScaleSetNetworkInterface build() {
            return new GetVirtualMachineScaleSetNetworkInterface(dnsServers, enableAcceleratedNetworking, enableIpForwarding, ipConfigurations, name, networkSecurityGroupId, primary);
        }
    }
}