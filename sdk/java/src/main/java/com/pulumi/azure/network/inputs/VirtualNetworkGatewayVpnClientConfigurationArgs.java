// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayVpnClientConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayVpnClientConfigurationArgs Empty = new VirtualNetworkGatewayVpnClientConfigurationArgs();

    /**
     * The client id of the Azure VPN application.
     * See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
     * 
     */
    @Import(name="aadAudience")
    private @Nullable Output<String> aadAudience;

    /**
     * @return The client id of the Azure VPN application.
     * See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
     * 
     */
    public Optional<Output<String>> aadAudience() {
        return Optional.ofNullable(this.aadAudience);
    }

    /**
     * The STS url for your tenant
     * 
     */
    @Import(name="aadIssuer")
    private @Nullable Output<String> aadIssuer;

    /**
     * @return The STS url for your tenant
     * 
     */
    public Optional<Output<String>> aadIssuer() {
        return Optional.ofNullable(this.aadIssuer);
    }

    /**
     * AzureAD Tenant URL
     * 
     */
    @Import(name="aadTenant")
    private @Nullable Output<String> aadTenant;

    /**
     * @return AzureAD Tenant URL
     * 
     */
    public Optional<Output<String>> aadTenant() {
        return Optional.ofNullable(this.aadTenant);
    }

    /**
     * The address space out of which IP addresses for
     * vpn clients will be taken. You can provide more than one address space, e.g.
     * in CIDR notation.
     * 
     */
    @Import(name="addressSpaces", required=true)
    private Output<List<String>> addressSpaces;

    /**
     * @return The address space out of which IP addresses for
     * vpn clients will be taken. You can provide more than one address space, e.g.
     * in CIDR notation.
     * 
     */
    public Output<List<String>> addressSpaces() {
        return this.addressSpaces;
    }

    /**
     * The address of the Radius server.
     * 
     */
    @Import(name="radiusServerAddress")
    private @Nullable Output<String> radiusServerAddress;

    /**
     * @return The address of the Radius server.
     * 
     */
    public Optional<Output<String>> radiusServerAddress() {
        return Optional.ofNullable(this.radiusServerAddress);
    }

    /**
     * The secret used by the Radius server.
     * 
     */
    @Import(name="radiusServerSecret")
    private @Nullable Output<String> radiusServerSecret;

    /**
     * @return The secret used by the Radius server.
     * 
     */
    public Optional<Output<String>> radiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }

    /**
     * One or more `revoked_certificate` blocks which
     * are defined below.
     * 
     */
    @Import(name="revokedCertificates")
    private @Nullable Output<List<VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs>> revokedCertificates;

    /**
     * @return One or more `revoked_certificate` blocks which
     * are defined below.
     * 
     */
    public Optional<Output<List<VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs>>> revokedCertificates() {
        return Optional.ofNullable(this.revokedCertificates);
    }

    /**
     * One or more `root_certificate` blocks which are
     * defined below. These root certificates are used to sign the client certificate
     * used by the VPN clients to connect to the gateway.
     * 
     */
    @Import(name="rootCertificates")
    private @Nullable Output<List<VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs>> rootCertificates;

    /**
     * @return One or more `root_certificate` blocks which are
     * defined below. These root certificates are used to sign the client certificate
     * used by the VPN clients to connect to the gateway.
     * 
     */
    public Optional<Output<List<VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs>>> rootCertificates() {
        return Optional.ofNullable(this.rootCertificates);
    }

    /**
     * List of the vpn authentication types for the virtual network gateway.
     * The supported values are `AAD`, `Radius` and `Certificate`.
     * 
     */
    @Import(name="vpnAuthTypes")
    private @Nullable Output<List<String>> vpnAuthTypes;

    /**
     * @return List of the vpn authentication types for the virtual network gateway.
     * The supported values are `AAD`, `Radius` and `Certificate`.
     * 
     */
    public Optional<Output<List<String>>> vpnAuthTypes() {
        return Optional.ofNullable(this.vpnAuthTypes);
    }

    /**
     * List of the protocols supported by the vpn client.
     * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
     * Values `SSTP` and `IkeV2` are incompatible with the use of
     * `aad_tenant`, `aad_audience` and `aad_issuer`.
     * 
     */
    @Import(name="vpnClientProtocols")
    private @Nullable Output<List<String>> vpnClientProtocols;

    /**
     * @return List of the protocols supported by the vpn client.
     * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
     * Values `SSTP` and `IkeV2` are incompatible with the use of
     * `aad_tenant`, `aad_audience` and `aad_issuer`.
     * 
     */
    public Optional<Output<List<String>>> vpnClientProtocols() {
        return Optional.ofNullable(this.vpnClientProtocols);
    }

    private VirtualNetworkGatewayVpnClientConfigurationArgs() {}

    private VirtualNetworkGatewayVpnClientConfigurationArgs(VirtualNetworkGatewayVpnClientConfigurationArgs $) {
        this.aadAudience = $.aadAudience;
        this.aadIssuer = $.aadIssuer;
        this.aadTenant = $.aadTenant;
        this.addressSpaces = $.addressSpaces;
        this.radiusServerAddress = $.radiusServerAddress;
        this.radiusServerSecret = $.radiusServerSecret;
        this.revokedCertificates = $.revokedCertificates;
        this.rootCertificates = $.rootCertificates;
        this.vpnAuthTypes = $.vpnAuthTypes;
        this.vpnClientProtocols = $.vpnClientProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayVpnClientConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayVpnClientConfigurationArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayVpnClientConfigurationArgs();
        }

        public Builder(VirtualNetworkGatewayVpnClientConfigurationArgs defaults) {
            $ = new VirtualNetworkGatewayVpnClientConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aadAudience The client id of the Azure VPN application.
         * See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
         * 
         * @return builder
         * 
         */
        public Builder aadAudience(@Nullable Output<String> aadAudience) {
            $.aadAudience = aadAudience;
            return this;
        }

        /**
         * @param aadAudience The client id of the Azure VPN application.
         * See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
         * 
         * @return builder
         * 
         */
        public Builder aadAudience(String aadAudience) {
            return aadAudience(Output.of(aadAudience));
        }

        /**
         * @param aadIssuer The STS url for your tenant
         * 
         * @return builder
         * 
         */
        public Builder aadIssuer(@Nullable Output<String> aadIssuer) {
            $.aadIssuer = aadIssuer;
            return this;
        }

        /**
         * @param aadIssuer The STS url for your tenant
         * 
         * @return builder
         * 
         */
        public Builder aadIssuer(String aadIssuer) {
            return aadIssuer(Output.of(aadIssuer));
        }

        /**
         * @param aadTenant AzureAD Tenant URL
         * 
         * @return builder
         * 
         */
        public Builder aadTenant(@Nullable Output<String> aadTenant) {
            $.aadTenant = aadTenant;
            return this;
        }

        /**
         * @param aadTenant AzureAD Tenant URL
         * 
         * @return builder
         * 
         */
        public Builder aadTenant(String aadTenant) {
            return aadTenant(Output.of(aadTenant));
        }

        /**
         * @param addressSpaces The address space out of which IP addresses for
         * vpn clients will be taken. You can provide more than one address space, e.g.
         * in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder addressSpaces(Output<List<String>> addressSpaces) {
            $.addressSpaces = addressSpaces;
            return this;
        }

        /**
         * @param addressSpaces The address space out of which IP addresses for
         * vpn clients will be taken. You can provide more than one address space, e.g.
         * in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder addressSpaces(List<String> addressSpaces) {
            return addressSpaces(Output.of(addressSpaces));
        }

        /**
         * @param addressSpaces The address space out of which IP addresses for
         * vpn clients will be taken. You can provide more than one address space, e.g.
         * in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder addressSpaces(String... addressSpaces) {
            return addressSpaces(List.of(addressSpaces));
        }

        /**
         * @param radiusServerAddress The address of the Radius server.
         * 
         * @return builder
         * 
         */
        public Builder radiusServerAddress(@Nullable Output<String> radiusServerAddress) {
            $.radiusServerAddress = radiusServerAddress;
            return this;
        }

        /**
         * @param radiusServerAddress The address of the Radius server.
         * 
         * @return builder
         * 
         */
        public Builder radiusServerAddress(String radiusServerAddress) {
            return radiusServerAddress(Output.of(radiusServerAddress));
        }

        /**
         * @param radiusServerSecret The secret used by the Radius server.
         * 
         * @return builder
         * 
         */
        public Builder radiusServerSecret(@Nullable Output<String> radiusServerSecret) {
            $.radiusServerSecret = radiusServerSecret;
            return this;
        }

        /**
         * @param radiusServerSecret The secret used by the Radius server.
         * 
         * @return builder
         * 
         */
        public Builder radiusServerSecret(String radiusServerSecret) {
            return radiusServerSecret(Output.of(radiusServerSecret));
        }

        /**
         * @param revokedCertificates One or more `revoked_certificate` blocks which
         * are defined below.
         * 
         * @return builder
         * 
         */
        public Builder revokedCertificates(@Nullable Output<List<VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs>> revokedCertificates) {
            $.revokedCertificates = revokedCertificates;
            return this;
        }

        /**
         * @param revokedCertificates One or more `revoked_certificate` blocks which
         * are defined below.
         * 
         * @return builder
         * 
         */
        public Builder revokedCertificates(List<VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs> revokedCertificates) {
            return revokedCertificates(Output.of(revokedCertificates));
        }

        /**
         * @param revokedCertificates One or more `revoked_certificate` blocks which
         * are defined below.
         * 
         * @return builder
         * 
         */
        public Builder revokedCertificates(VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs... revokedCertificates) {
            return revokedCertificates(List.of(revokedCertificates));
        }

        /**
         * @param rootCertificates One or more `root_certificate` blocks which are
         * defined below. These root certificates are used to sign the client certificate
         * used by the VPN clients to connect to the gateway.
         * 
         * @return builder
         * 
         */
        public Builder rootCertificates(@Nullable Output<List<VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs>> rootCertificates) {
            $.rootCertificates = rootCertificates;
            return this;
        }

        /**
         * @param rootCertificates One or more `root_certificate` blocks which are
         * defined below. These root certificates are used to sign the client certificate
         * used by the VPN clients to connect to the gateway.
         * 
         * @return builder
         * 
         */
        public Builder rootCertificates(List<VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs> rootCertificates) {
            return rootCertificates(Output.of(rootCertificates));
        }

        /**
         * @param rootCertificates One or more `root_certificate` blocks which are
         * defined below. These root certificates are used to sign the client certificate
         * used by the VPN clients to connect to the gateway.
         * 
         * @return builder
         * 
         */
        public Builder rootCertificates(VirtualNetworkGatewayVpnClientConfigurationRootCertificateArgs... rootCertificates) {
            return rootCertificates(List.of(rootCertificates));
        }

        /**
         * @param vpnAuthTypes List of the vpn authentication types for the virtual network gateway.
         * The supported values are `AAD`, `Radius` and `Certificate`.
         * 
         * @return builder
         * 
         */
        public Builder vpnAuthTypes(@Nullable Output<List<String>> vpnAuthTypes) {
            $.vpnAuthTypes = vpnAuthTypes;
            return this;
        }

        /**
         * @param vpnAuthTypes List of the vpn authentication types for the virtual network gateway.
         * The supported values are `AAD`, `Radius` and `Certificate`.
         * 
         * @return builder
         * 
         */
        public Builder vpnAuthTypes(List<String> vpnAuthTypes) {
            return vpnAuthTypes(Output.of(vpnAuthTypes));
        }

        /**
         * @param vpnAuthTypes List of the vpn authentication types for the virtual network gateway.
         * The supported values are `AAD`, `Radius` and `Certificate`.
         * 
         * @return builder
         * 
         */
        public Builder vpnAuthTypes(String... vpnAuthTypes) {
            return vpnAuthTypes(List.of(vpnAuthTypes));
        }

        /**
         * @param vpnClientProtocols List of the protocols supported by the vpn client.
         * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
         * Values `SSTP` and `IkeV2` are incompatible with the use of
         * `aad_tenant`, `aad_audience` and `aad_issuer`.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientProtocols(@Nullable Output<List<String>> vpnClientProtocols) {
            $.vpnClientProtocols = vpnClientProtocols;
            return this;
        }

        /**
         * @param vpnClientProtocols List of the protocols supported by the vpn client.
         * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
         * Values `SSTP` and `IkeV2` are incompatible with the use of
         * `aad_tenant`, `aad_audience` and `aad_issuer`.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientProtocols(List<String> vpnClientProtocols) {
            return vpnClientProtocols(Output.of(vpnClientProtocols));
        }

        /**
         * @param vpnClientProtocols List of the protocols supported by the vpn client.
         * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
         * Values `SSTP` and `IkeV2` are incompatible with the use of
         * `aad_tenant`, `aad_audience` and `aad_issuer`.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientProtocols(String... vpnClientProtocols) {
            return vpnClientProtocols(List.of(vpnClientProtocols));
        }

        public VirtualNetworkGatewayVpnClientConfigurationArgs build() {
            $.addressSpaces = Objects.requireNonNull($.addressSpaces, "expected parameter 'addressSpaces' to be non-null");
            return $;
        }
    }

}