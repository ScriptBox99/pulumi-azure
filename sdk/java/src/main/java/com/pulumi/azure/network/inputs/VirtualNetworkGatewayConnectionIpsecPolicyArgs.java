// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayConnectionIpsecPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayConnectionIpsecPolicyArgs Empty = new VirtualNetworkGatewayConnectionIpsecPolicyArgs();

    /**
     * The DH group used in IKE phase 1 for initial SA. Valid
     * options are `DHGroup1`, `DHGroup14`, `DHGroup2`, `DHGroup2048`, `DHGroup24`,
     * `ECP256`, `ECP384`, or `None`.
     * 
     */
    @Import(name="dhGroup", required=true)
    private Output<String> dhGroup;

    /**
     * @return The DH group used in IKE phase 1 for initial SA. Valid
     * options are `DHGroup1`, `DHGroup14`, `DHGroup2`, `DHGroup2048`, `DHGroup24`,
     * `ECP256`, `ECP384`, or `None`.
     * 
     */
    public Output<String> dhGroup() {
        return this.dhGroup;
    }

    /**
     * The IKE encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, or `GCMAES256`.
     * 
     */
    @Import(name="ikeEncryption", required=true)
    private Output<String> ikeEncryption;

    /**
     * @return The IKE encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, or `GCMAES256`.
     * 
     */
    public Output<String> ikeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * The IKE integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256`, or `SHA384`.
     * 
     */
    @Import(name="ikeIntegrity", required=true)
    private Output<String> ikeIntegrity;

    /**
     * @return The IKE integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256`, or `SHA384`.
     * 
     */
    public Output<String> ikeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * The IPSec encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, or `None`.
     * 
     */
    @Import(name="ipsecEncryption", required=true)
    private Output<String> ipsecEncryption;

    /**
     * @return The IPSec encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, or `None`.
     * 
     */
    public Output<String> ipsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * The IPSec integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1`, or `SHA256`.
     * 
     */
    @Import(name="ipsecIntegrity", required=true)
    private Output<String> ipsecIntegrity;

    /**
     * @return The IPSec integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1`, or `SHA256`.
     * 
     */
    public Output<String> ipsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * The DH group used in IKE phase 2 for new child SA.
     * Valid options are `ECP256`, `ECP384`, `PFS1`, `PFS14`, `PFS2`, `PFS2048`, `PFS24`, `PFSMM`,
     * or `None`.
     * 
     */
    @Import(name="pfsGroup", required=true)
    private Output<String> pfsGroup;

    /**
     * @return The DH group used in IKE phase 2 for new child SA.
     * Valid options are `ECP256`, `ECP384`, `PFS1`, `PFS14`, `PFS2`, `PFS2048`, `PFS24`, `PFSMM`,
     * or `None`.
     * 
     */
    public Output<String> pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * The IPSec SA payload size in KB. Must be at least
     * `1024` KB. Defaults to `102400000` KB.
     * 
     */
    @Import(name="saDatasize")
    private @Nullable Output<Integer> saDatasize;

    /**
     * @return The IPSec SA payload size in KB. Must be at least
     * `1024` KB. Defaults to `102400000` KB.
     * 
     */
    public Optional<Output<Integer>> saDatasize() {
        return Optional.ofNullable(this.saDatasize);
    }

    /**
     * The IPSec SA lifetime in seconds. Must be at least
     * `300` seconds. Defaults to `27000` seconds.
     * 
     */
    @Import(name="saLifetime")
    private @Nullable Output<Integer> saLifetime;

    /**
     * @return The IPSec SA lifetime in seconds. Must be at least
     * `300` seconds. Defaults to `27000` seconds.
     * 
     */
    public Optional<Output<Integer>> saLifetime() {
        return Optional.ofNullable(this.saLifetime);
    }

    private VirtualNetworkGatewayConnectionIpsecPolicyArgs() {}

    private VirtualNetworkGatewayConnectionIpsecPolicyArgs(VirtualNetworkGatewayConnectionIpsecPolicyArgs $) {
        this.dhGroup = $.dhGroup;
        this.ikeEncryption = $.ikeEncryption;
        this.ikeIntegrity = $.ikeIntegrity;
        this.ipsecEncryption = $.ipsecEncryption;
        this.ipsecIntegrity = $.ipsecIntegrity;
        this.pfsGroup = $.pfsGroup;
        this.saDatasize = $.saDatasize;
        this.saLifetime = $.saLifetime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayConnectionIpsecPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayConnectionIpsecPolicyArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayConnectionIpsecPolicyArgs();
        }

        public Builder(VirtualNetworkGatewayConnectionIpsecPolicyArgs defaults) {
            $ = new VirtualNetworkGatewayConnectionIpsecPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhGroup The DH group used in IKE phase 1 for initial SA. Valid
         * options are `DHGroup1`, `DHGroup14`, `DHGroup2`, `DHGroup2048`, `DHGroup24`,
         * `ECP256`, `ECP384`, or `None`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(Output<String> dhGroup) {
            $.dhGroup = dhGroup;
            return this;
        }

        /**
         * @param dhGroup The DH group used in IKE phase 1 for initial SA. Valid
         * options are `DHGroup1`, `DHGroup14`, `DHGroup2`, `DHGroup2048`, `DHGroup24`,
         * `ECP256`, `ECP384`, or `None`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(String dhGroup) {
            return dhGroup(Output.of(dhGroup));
        }

        /**
         * @param ikeEncryption The IKE encryption algorithm. Valid
         * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, or `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncryption(Output<String> ikeEncryption) {
            $.ikeEncryption = ikeEncryption;
            return this;
        }

        /**
         * @param ikeEncryption The IKE encryption algorithm. Valid
         * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, or `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncryption(String ikeEncryption) {
            return ikeEncryption(Output.of(ikeEncryption));
        }

        /**
         * @param ikeIntegrity The IKE integrity algorithm. Valid
         * options are `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256`, or `SHA384`.
         * 
         * @return builder
         * 
         */
        public Builder ikeIntegrity(Output<String> ikeIntegrity) {
            $.ikeIntegrity = ikeIntegrity;
            return this;
        }

        /**
         * @param ikeIntegrity The IKE integrity algorithm. Valid
         * options are `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256`, or `SHA384`.
         * 
         * @return builder
         * 
         */
        public Builder ikeIntegrity(String ikeIntegrity) {
            return ikeIntegrity(Output.of(ikeIntegrity));
        }

        /**
         * @param ipsecEncryption The IPSec encryption algorithm. Valid
         * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, or `None`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecEncryption(Output<String> ipsecEncryption) {
            $.ipsecEncryption = ipsecEncryption;
            return this;
        }

        /**
         * @param ipsecEncryption The IPSec encryption algorithm. Valid
         * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, or `None`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecEncryption(String ipsecEncryption) {
            return ipsecEncryption(Output.of(ipsecEncryption));
        }

        /**
         * @param ipsecIntegrity The IPSec integrity algorithm. Valid
         * options are `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1`, or `SHA256`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecIntegrity(Output<String> ipsecIntegrity) {
            $.ipsecIntegrity = ipsecIntegrity;
            return this;
        }

        /**
         * @param ipsecIntegrity The IPSec integrity algorithm. Valid
         * options are `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1`, or `SHA256`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecIntegrity(String ipsecIntegrity) {
            return ipsecIntegrity(Output.of(ipsecIntegrity));
        }

        /**
         * @param pfsGroup The DH group used in IKE phase 2 for new child SA.
         * Valid options are `ECP256`, `ECP384`, `PFS1`, `PFS14`, `PFS2`, `PFS2048`, `PFS24`, `PFSMM`,
         * or `None`.
         * 
         * @return builder
         * 
         */
        public Builder pfsGroup(Output<String> pfsGroup) {
            $.pfsGroup = pfsGroup;
            return this;
        }

        /**
         * @param pfsGroup The DH group used in IKE phase 2 for new child SA.
         * Valid options are `ECP256`, `ECP384`, `PFS1`, `PFS14`, `PFS2`, `PFS2048`, `PFS24`, `PFSMM`,
         * or `None`.
         * 
         * @return builder
         * 
         */
        public Builder pfsGroup(String pfsGroup) {
            return pfsGroup(Output.of(pfsGroup));
        }

        /**
         * @param saDatasize The IPSec SA payload size in KB. Must be at least
         * `1024` KB. Defaults to `102400000` KB.
         * 
         * @return builder
         * 
         */
        public Builder saDatasize(@Nullable Output<Integer> saDatasize) {
            $.saDatasize = saDatasize;
            return this;
        }

        /**
         * @param saDatasize The IPSec SA payload size in KB. Must be at least
         * `1024` KB. Defaults to `102400000` KB.
         * 
         * @return builder
         * 
         */
        public Builder saDatasize(Integer saDatasize) {
            return saDatasize(Output.of(saDatasize));
        }

        /**
         * @param saLifetime The IPSec SA lifetime in seconds. Must be at least
         * `300` seconds. Defaults to `27000` seconds.
         * 
         * @return builder
         * 
         */
        public Builder saLifetime(@Nullable Output<Integer> saLifetime) {
            $.saLifetime = saLifetime;
            return this;
        }

        /**
         * @param saLifetime The IPSec SA lifetime in seconds. Must be at least
         * `300` seconds. Defaults to `27000` seconds.
         * 
         * @return builder
         * 
         */
        public Builder saLifetime(Integer saLifetime) {
            return saLifetime(Output.of(saLifetime));
        }

        public VirtualNetworkGatewayConnectionIpsecPolicyArgs build() {
            $.dhGroup = Objects.requireNonNull($.dhGroup, "expected parameter 'dhGroup' to be non-null");
            $.ikeEncryption = Objects.requireNonNull($.ikeEncryption, "expected parameter 'ikeEncryption' to be non-null");
            $.ikeIntegrity = Objects.requireNonNull($.ikeIntegrity, "expected parameter 'ikeIntegrity' to be non-null");
            $.ipsecEncryption = Objects.requireNonNull($.ipsecEncryption, "expected parameter 'ipsecEncryption' to be non-null");
            $.ipsecIntegrity = Objects.requireNonNull($.ipsecIntegrity, "expected parameter 'ipsecIntegrity' to be non-null");
            $.pfsGroup = Objects.requireNonNull($.pfsGroup, "expected parameter 'pfsGroup' to be non-null");
            return $;
        }
    }

}