// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MoverAgentState extends com.pulumi.resources.ResourceArgs {

    public static final MoverAgentState Empty = new MoverAgentState();

    /**
     * Specifies the fully qualified ID of the Hybrid Compute resource for the Storage Mover Agent. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="arcVirtualMachineId")
    private @Nullable Output<String> arcVirtualMachineId;

    /**
     * @return Specifies the fully qualified ID of the Hybrid Compute resource for the Storage Mover Agent. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> arcVirtualMachineId() {
        return Optional.ofNullable(this.arcVirtualMachineId);
    }

    /**
     * Specifies the Hybrid Compute resource&#39;s unique SMBIOS ID. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="arcVirtualMachineUuid")
    private @Nullable Output<String> arcVirtualMachineUuid;

    /**
     * @return Specifies the Hybrid Compute resource&#39;s unique SMBIOS ID. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> arcVirtualMachineUuid() {
        return Optional.ofNullable(this.arcVirtualMachineUuid);
    }

    /**
     * Specifies a description for this Storage Mover Agent.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies a description for this Storage Mover Agent.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name which should be used for this Storage Mover Agent. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Storage Mover Agent. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the Storage Mover that this Agent should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageMoverId")
    private @Nullable Output<String> storageMoverId;

    /**
     * @return Specifies the ID of the Storage Mover that this Agent should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageMoverId() {
        return Optional.ofNullable(this.storageMoverId);
    }

    private MoverAgentState() {}

    private MoverAgentState(MoverAgentState $) {
        this.arcVirtualMachineId = $.arcVirtualMachineId;
        this.arcVirtualMachineUuid = $.arcVirtualMachineUuid;
        this.description = $.description;
        this.name = $.name;
        this.storageMoverId = $.storageMoverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MoverAgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoverAgentState $;

        public Builder() {
            $ = new MoverAgentState();
        }

        public Builder(MoverAgentState defaults) {
            $ = new MoverAgentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arcVirtualMachineId Specifies the fully qualified ID of the Hybrid Compute resource for the Storage Mover Agent. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder arcVirtualMachineId(@Nullable Output<String> arcVirtualMachineId) {
            $.arcVirtualMachineId = arcVirtualMachineId;
            return this;
        }

        /**
         * @param arcVirtualMachineId Specifies the fully qualified ID of the Hybrid Compute resource for the Storage Mover Agent. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder arcVirtualMachineId(String arcVirtualMachineId) {
            return arcVirtualMachineId(Output.of(arcVirtualMachineId));
        }

        /**
         * @param arcVirtualMachineUuid Specifies the Hybrid Compute resource&#39;s unique SMBIOS ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder arcVirtualMachineUuid(@Nullable Output<String> arcVirtualMachineUuid) {
            $.arcVirtualMachineUuid = arcVirtualMachineUuid;
            return this;
        }

        /**
         * @param arcVirtualMachineUuid Specifies the Hybrid Compute resource&#39;s unique SMBIOS ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder arcVirtualMachineUuid(String arcVirtualMachineUuid) {
            return arcVirtualMachineUuid(Output.of(arcVirtualMachineUuid));
        }

        /**
         * @param description Specifies a description for this Storage Mover Agent.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies a description for this Storage Mover Agent.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name which should be used for this Storage Mover Agent. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Storage Mover Agent. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageMoverId Specifies the ID of the Storage Mover that this Agent should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageMoverId(@Nullable Output<String> storageMoverId) {
            $.storageMoverId = storageMoverId;
            return this;
        }

        /**
         * @param storageMoverId Specifies the ID of the Storage Mover that this Agent should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageMoverId(String storageMoverId) {
            return storageMoverId(Output.of(storageMoverId));
        }

        public MoverAgentState build() {
            return $;
        }
    }

}