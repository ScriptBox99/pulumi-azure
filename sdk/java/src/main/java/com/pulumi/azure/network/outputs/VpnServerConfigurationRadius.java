// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.VpnServerConfigurationRadiusClientRootCertificate;
import com.pulumi.azure.network.outputs.VpnServerConfigurationRadiusServer;
import com.pulumi.azure.network.outputs.VpnServerConfigurationRadiusServerRootCertificate;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class VpnServerConfigurationRadius {
    /**
     * @return One or more `client_root_certificate` blocks as defined above.
     * 
     */
    private final @Nullable List<VpnServerConfigurationRadiusClientRootCertificate> clientRootCertificates;
    /**
     * @return One or more `server_root_certificate` blocks as defined below.
     * 
     */
    private final @Nullable List<VpnServerConfigurationRadiusServerRootCertificate> serverRootCertificates;
    /**
     * @return One or more `server` blocks as defined below.
     * 
     */
    private final @Nullable List<VpnServerConfigurationRadiusServer> servers;

    @CustomType.Constructor
    private VpnServerConfigurationRadius(
        @CustomType.Parameter("clientRootCertificates") @Nullable List<VpnServerConfigurationRadiusClientRootCertificate> clientRootCertificates,
        @CustomType.Parameter("serverRootCertificates") @Nullable List<VpnServerConfigurationRadiusServerRootCertificate> serverRootCertificates,
        @CustomType.Parameter("servers") @Nullable List<VpnServerConfigurationRadiusServer> servers) {
        this.clientRootCertificates = clientRootCertificates;
        this.serverRootCertificates = serverRootCertificates;
        this.servers = servers;
    }

    /**
     * @return One or more `client_root_certificate` blocks as defined above.
     * 
     */
    public List<VpnServerConfigurationRadiusClientRootCertificate> clientRootCertificates() {
        return this.clientRootCertificates == null ? List.of() : this.clientRootCertificates;
    }
    /**
     * @return One or more `server_root_certificate` blocks as defined below.
     * 
     */
    public List<VpnServerConfigurationRadiusServerRootCertificate> serverRootCertificates() {
        return this.serverRootCertificates == null ? List.of() : this.serverRootCertificates;
    }
    /**
     * @return One or more `server` blocks as defined below.
     * 
     */
    public List<VpnServerConfigurationRadiusServer> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigurationRadius defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VpnServerConfigurationRadiusClientRootCertificate> clientRootCertificates;
        private @Nullable List<VpnServerConfigurationRadiusServerRootCertificate> serverRootCertificates;
        private @Nullable List<VpnServerConfigurationRadiusServer> servers;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigurationRadius defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientRootCertificates = defaults.clientRootCertificates;
    	      this.serverRootCertificates = defaults.serverRootCertificates;
    	      this.servers = defaults.servers;
        }

        public Builder clientRootCertificates(@Nullable List<VpnServerConfigurationRadiusClientRootCertificate> clientRootCertificates) {
            this.clientRootCertificates = clientRootCertificates;
            return this;
        }
        public Builder clientRootCertificates(VpnServerConfigurationRadiusClientRootCertificate... clientRootCertificates) {
            return clientRootCertificates(List.of(clientRootCertificates));
        }
        public Builder serverRootCertificates(@Nullable List<VpnServerConfigurationRadiusServerRootCertificate> serverRootCertificates) {
            this.serverRootCertificates = serverRootCertificates;
            return this;
        }
        public Builder serverRootCertificates(VpnServerConfigurationRadiusServerRootCertificate... serverRootCertificates) {
            return serverRootCertificates(List.of(serverRootCertificates));
        }
        public Builder servers(@Nullable List<VpnServerConfigurationRadiusServer> servers) {
            this.servers = servers;
            return this;
        }
        public Builder servers(VpnServerConfigurationRadiusServer... servers) {
            return servers(List.of(servers));
        }        public VpnServerConfigurationRadius build() {
            return new VpnServerConfigurationRadius(clientRootCertificates, serverRootCertificates, servers);
        }
    }
}