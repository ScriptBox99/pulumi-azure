// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.outputs;

import com.pulumi.azure.lb.outputs.GetBackendAddressPoolBackendAddress;
import com.pulumi.azure.lb.outputs.GetBackendAddressPoolBackendIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendAddressPoolResult {
    /**
     * @return A list of `backend_address` block as defined below.
     * 
     */
    private final List<GetBackendAddressPoolBackendAddress> backendAddresses;
    /**
     * @return A list of references to IP addresses defined in network interfaces.
     * 
     */
    private final List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of the Load Balancing Inbound NAT Rules associated with this Backend Address Pool.
     * 
     */
    private final List<String> inboundNatRules;
    /**
     * @return A list of the Load Balancing Rules associated with this Backend Address Pool.
     * 
     */
    private final List<String> loadBalancingRules;
    private final String loadbalancerId;
    /**
     * @return The name of the Backend Address.
     * 
     */
    private final String name;
    /**
     * @return A list of the Load Balancing Outbound Rules associated with this Backend Address Pool.
     * 
     */
    private final List<String> outboundRules;

    @CustomType.Constructor
    private GetBackendAddressPoolResult(
        @CustomType.Parameter("backendAddresses") List<GetBackendAddressPoolBackendAddress> backendAddresses,
        @CustomType.Parameter("backendIpConfigurations") List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inboundNatRules") List<String> inboundNatRules,
        @CustomType.Parameter("loadBalancingRules") List<String> loadBalancingRules,
        @CustomType.Parameter("loadbalancerId") String loadbalancerId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundRules") List<String> outboundRules) {
        this.backendAddresses = backendAddresses;
        this.backendIpConfigurations = backendIpConfigurations;
        this.id = id;
        this.inboundNatRules = inboundNatRules;
        this.loadBalancingRules = loadBalancingRules;
        this.loadbalancerId = loadbalancerId;
        this.name = name;
        this.outboundRules = outboundRules;
    }

    /**
     * @return A list of `backend_address` block as defined below.
     * 
     */
    public List<GetBackendAddressPoolBackendAddress> backendAddresses() {
        return this.backendAddresses;
    }
    /**
     * @return A list of references to IP addresses defined in network interfaces.
     * 
     */
    public List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations() {
        return this.backendIpConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of the Load Balancing Inbound NAT Rules associated with this Backend Address Pool.
     * 
     */
    public List<String> inboundNatRules() {
        return this.inboundNatRules;
    }
    /**
     * @return A list of the Load Balancing Rules associated with this Backend Address Pool.
     * 
     */
    public List<String> loadBalancingRules() {
        return this.loadBalancingRules;
    }
    public String loadbalancerId() {
        return this.loadbalancerId;
    }
    /**
     * @return The name of the Backend Address.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of the Load Balancing Outbound Rules associated with this Backend Address Pool.
     * 
     */
    public List<String> outboundRules() {
        return this.outboundRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendAddressPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBackendAddressPoolBackendAddress> backendAddresses;
        private List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations;
        private String id;
        private List<String> inboundNatRules;
        private List<String> loadBalancingRules;
        private String loadbalancerId;
        private String name;
        private List<String> outboundRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendAddressPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddresses = defaults.backendAddresses;
    	      this.backendIpConfigurations = defaults.backendIpConfigurations;
    	      this.id = defaults.id;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.loadbalancerId = defaults.loadbalancerId;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
        }

        public Builder backendAddresses(List<GetBackendAddressPoolBackendAddress> backendAddresses) {
            this.backendAddresses = Objects.requireNonNull(backendAddresses);
            return this;
        }
        public Builder backendAddresses(GetBackendAddressPoolBackendAddress... backendAddresses) {
            return backendAddresses(List.of(backendAddresses));
        }
        public Builder backendIpConfigurations(List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations) {
            this.backendIpConfigurations = Objects.requireNonNull(backendIpConfigurations);
            return this;
        }
        public Builder backendIpConfigurations(GetBackendAddressPoolBackendIpConfiguration... backendIpConfigurations) {
            return backendIpConfigurations(List.of(backendIpConfigurations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inboundNatRules(List<String> inboundNatRules) {
            this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
            return this;
        }
        public Builder inboundNatRules(String... inboundNatRules) {
            return inboundNatRules(List.of(inboundNatRules));
        }
        public Builder loadBalancingRules(List<String> loadBalancingRules) {
            this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
            return this;
        }
        public Builder loadBalancingRules(String... loadBalancingRules) {
            return loadBalancingRules(List.of(loadBalancingRules));
        }
        public Builder loadbalancerId(String loadbalancerId) {
            this.loadbalancerId = Objects.requireNonNull(loadbalancerId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outboundRules(List<String> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }
        public Builder outboundRules(String... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }        public GetBackendAddressPoolResult build() {
            return new GetBackendAddressPoolResult(backendAddresses, backendIpConfigurations, id, inboundNatRules, loadBalancingRules, loadbalancerId, name, outboundRules);
        }
    }
}