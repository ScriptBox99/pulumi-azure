// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.outputs;

import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile {
    /**
     * @return Specifies a list of Azure Public IP Address IDs that can be used for Egress (Source) Network Address Translation.
     * 
     */
    private @Nullable List<String> egressNatIpAddressIds;
    private @Nullable List<String> egressNatIpAddresses;
    /**
     * @return Specifies a list of Azure Public IP Address IDs.
     * 
     */
    private List<String> publicIpAddressIds;
    private @Nullable List<String> publicIpAddresses;
    /**
     * @return A `vnet_configuration` block as defined below.
     * 
     */
    private NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration vnetConfiguration;

    private NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile() {}
    /**
     * @return Specifies a list of Azure Public IP Address IDs that can be used for Egress (Source) Network Address Translation.
     * 
     */
    public List<String> egressNatIpAddressIds() {
        return this.egressNatIpAddressIds == null ? List.of() : this.egressNatIpAddressIds;
    }
    public List<String> egressNatIpAddresses() {
        return this.egressNatIpAddresses == null ? List.of() : this.egressNatIpAddresses;
    }
    /**
     * @return Specifies a list of Azure Public IP Address IDs.
     * 
     */
    public List<String> publicIpAddressIds() {
        return this.publicIpAddressIds;
    }
    public List<String> publicIpAddresses() {
        return this.publicIpAddresses == null ? List.of() : this.publicIpAddresses;
    }
    /**
     * @return A `vnet_configuration` block as defined below.
     * 
     */
    public NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration vnetConfiguration() {
        return this.vnetConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> egressNatIpAddressIds;
        private @Nullable List<String> egressNatIpAddresses;
        private List<String> publicIpAddressIds;
        private @Nullable List<String> publicIpAddresses;
        private NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration vnetConfiguration;
        public Builder() {}
        public Builder(NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressNatIpAddressIds = defaults.egressNatIpAddressIds;
    	      this.egressNatIpAddresses = defaults.egressNatIpAddresses;
    	      this.publicIpAddressIds = defaults.publicIpAddressIds;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.vnetConfiguration = defaults.vnetConfiguration;
        }

        @CustomType.Setter
        public Builder egressNatIpAddressIds(@Nullable List<String> egressNatIpAddressIds) {
            this.egressNatIpAddressIds = egressNatIpAddressIds;
            return this;
        }
        public Builder egressNatIpAddressIds(String... egressNatIpAddressIds) {
            return egressNatIpAddressIds(List.of(egressNatIpAddressIds));
        }
        @CustomType.Setter
        public Builder egressNatIpAddresses(@Nullable List<String> egressNatIpAddresses) {
            this.egressNatIpAddresses = egressNatIpAddresses;
            return this;
        }
        public Builder egressNatIpAddresses(String... egressNatIpAddresses) {
            return egressNatIpAddresses(List.of(egressNatIpAddresses));
        }
        @CustomType.Setter
        public Builder publicIpAddressIds(List<String> publicIpAddressIds) {
            this.publicIpAddressIds = Objects.requireNonNull(publicIpAddressIds);
            return this;
        }
        public Builder publicIpAddressIds(String... publicIpAddressIds) {
            return publicIpAddressIds(List.of(publicIpAddressIds));
        }
        @CustomType.Setter
        public Builder publicIpAddresses(@Nullable List<String> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public Builder publicIpAddresses(String... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }
        @CustomType.Setter
        public Builder vnetConfiguration(NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration vnetConfiguration) {
            this.vnetConfiguration = Objects.requireNonNull(vnetConfiguration);
            return this;
        }
        public NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile build() {
            final var o = new NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile();
            o.egressNatIpAddressIds = egressNatIpAddressIds;
            o.egressNatIpAddresses = egressNatIpAddresses;
            o.publicIpAddressIds = publicIpAddressIds;
            o.publicIpAddresses = publicIpAddresses;
            o.vnetConfiguration = vnetConfiguration;
            return o;
        }
    }
}