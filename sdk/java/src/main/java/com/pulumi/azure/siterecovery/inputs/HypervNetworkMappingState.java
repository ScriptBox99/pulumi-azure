// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HypervNetworkMappingState extends com.pulumi.resources.ResourceArgs {

    public static final HypervNetworkMappingState Empty = new HypervNetworkMappingState();

    /**
     * The name of the HyperV network mapping. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the HyperV network mapping. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="recoveryVaultId")
    private @Nullable Output<String> recoveryVaultId;

    /**
     * @return The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> recoveryVaultId() {
        return Optional.ofNullable(this.recoveryVaultId);
    }

    /**
     * The Name of the primary network. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourceNetworkName")
    private @Nullable Output<String> sourceNetworkName;

    /**
     * @return The Name of the primary network. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sourceNetworkName() {
        return Optional.ofNullable(this.sourceNetworkName);
    }

    /**
     * Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourceSystemCenterVirtualMachineManagerName")
    private @Nullable Output<String> sourceSystemCenterVirtualMachineManagerName;

    /**
     * @return Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sourceSystemCenterVirtualMachineManagerName() {
        return Optional.ofNullable(this.sourceSystemCenterVirtualMachineManagerName);
    }

    /**
     * The id of the recovery network. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="targetNetworkId")
    private @Nullable Output<String> targetNetworkId;

    /**
     * @return The id of the recovery network. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> targetNetworkId() {
        return Optional.ofNullable(this.targetNetworkId);
    }

    private HypervNetworkMappingState() {}

    private HypervNetworkMappingState(HypervNetworkMappingState $) {
        this.name = $.name;
        this.recoveryVaultId = $.recoveryVaultId;
        this.sourceNetworkName = $.sourceNetworkName;
        this.sourceSystemCenterVirtualMachineManagerName = $.sourceSystemCenterVirtualMachineManagerName;
        this.targetNetworkId = $.targetNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HypervNetworkMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HypervNetworkMappingState $;

        public Builder() {
            $ = new HypervNetworkMappingState();
        }

        public Builder(HypervNetworkMappingState defaults) {
            $ = new HypervNetworkMappingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the HyperV network mapping. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the HyperV network mapping. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recoveryVaultId The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(@Nullable Output<String> recoveryVaultId) {
            $.recoveryVaultId = recoveryVaultId;
            return this;
        }

        /**
         * @param recoveryVaultId The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(String recoveryVaultId) {
            return recoveryVaultId(Output.of(recoveryVaultId));
        }

        /**
         * @param sourceNetworkName The Name of the primary network. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceNetworkName(@Nullable Output<String> sourceNetworkName) {
            $.sourceNetworkName = sourceNetworkName;
            return this;
        }

        /**
         * @param sourceNetworkName The Name of the primary network. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceNetworkName(String sourceNetworkName) {
            return sourceNetworkName(Output.of(sourceNetworkName));
        }

        /**
         * @param sourceSystemCenterVirtualMachineManagerName Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceSystemCenterVirtualMachineManagerName(@Nullable Output<String> sourceSystemCenterVirtualMachineManagerName) {
            $.sourceSystemCenterVirtualMachineManagerName = sourceSystemCenterVirtualMachineManagerName;
            return this;
        }

        /**
         * @param sourceSystemCenterVirtualMachineManagerName Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceSystemCenterVirtualMachineManagerName(String sourceSystemCenterVirtualMachineManagerName) {
            return sourceSystemCenterVirtualMachineManagerName(Output.of(sourceSystemCenterVirtualMachineManagerName));
        }

        /**
         * @param targetNetworkId The id of the recovery network. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetNetworkId(@Nullable Output<String> targetNetworkId) {
            $.targetNetworkId = targetNetworkId;
            return this;
        }

        /**
         * @param targetNetworkId The id of the recovery network. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetNetworkId(String targetNetworkId) {
            return targetNetworkId(Output.of(targetNetworkId));
        }

        public HypervNetworkMappingState build() {
            return $;
        }
    }

}
