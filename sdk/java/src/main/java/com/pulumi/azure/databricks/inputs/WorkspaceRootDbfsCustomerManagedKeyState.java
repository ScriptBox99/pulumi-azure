// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceRootDbfsCustomerManagedKeyState extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceRootDbfsCustomerManagedKeyState Empty = new WorkspaceRootDbfsCustomerManagedKeyState();

    /**
     * The resource ID of the Key Vault Key to be used.
     * 
     */
    @Import(name="keyVaultKeyId")
    private @Nullable Output<String> keyVaultKeyId;

    /**
     * @return The resource ID of the Key Vault Key to be used.
     * 
     */
    public Optional<Output<String>> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }

    /**
     * The resource ID of the Databricks Workspace.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The resource ID of the Databricks Workspace.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private WorkspaceRootDbfsCustomerManagedKeyState() {}

    private WorkspaceRootDbfsCustomerManagedKeyState(WorkspaceRootDbfsCustomerManagedKeyState $) {
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceRootDbfsCustomerManagedKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceRootDbfsCustomerManagedKeyState $;

        public Builder() {
            $ = new WorkspaceRootDbfsCustomerManagedKeyState();
        }

        public Builder(WorkspaceRootDbfsCustomerManagedKeyState defaults) {
            $ = new WorkspaceRootDbfsCustomerManagedKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultKeyId The resource ID of the Key Vault Key to be used.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(@Nullable Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The resource ID of the Key Vault Key to be used.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param workspaceId The resource ID of the Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The resource ID of the Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceRootDbfsCustomerManagedKeyState build() {
            return $;
        }
    }

}