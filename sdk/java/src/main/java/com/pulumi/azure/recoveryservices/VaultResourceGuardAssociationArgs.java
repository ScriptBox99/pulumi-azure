// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.recoveryservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultResourceGuardAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultResourceGuardAssociationArgs Empty = new VaultResourceGuardAssociationArgs();

    /**
     * Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGuardId", required=true)
    private Output<String> resourceGuardId;

    /**
     * @return ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGuardId() {
        return this.resourceGuardId;
    }

    /**
     * ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vaultId", required=true)
    private Output<String> vaultId;

    /**
     * @return ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    private VaultResourceGuardAssociationArgs() {}

    private VaultResourceGuardAssociationArgs(VaultResourceGuardAssociationArgs $) {
        this.name = $.name;
        this.resourceGuardId = $.resourceGuardId;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultResourceGuardAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultResourceGuardAssociationArgs $;

        public Builder() {
            $ = new VaultResourceGuardAssociationArgs();
        }

        public Builder(VaultResourceGuardAssociationArgs defaults) {
            $ = new VaultResourceGuardAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGuardId ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGuardId(Output<String> resourceGuardId) {
            $.resourceGuardId = resourceGuardId;
            return this;
        }

        /**
         * @param resourceGuardId ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGuardId(String resourceGuardId) {
            return resourceGuardId(Output.of(resourceGuardId));
        }

        /**
         * @param vaultId ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public VaultResourceGuardAssociationArgs build() {
            $.resourceGuardId = Objects.requireNonNull($.resourceGuardId, "expected parameter 'resourceGuardId' to be non-null");
            $.vaultId = Objects.requireNonNull($.vaultId, "expected parameter 'vaultId' to be non-null");
            return $;
        }
    }

}