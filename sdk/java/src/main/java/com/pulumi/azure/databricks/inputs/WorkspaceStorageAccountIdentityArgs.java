// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceStorageAccountIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceStorageAccountIdentityArgs Empty = new WorkspaceStorageAccountIdentityArgs();

    /**
     * The principal UUID for the internal databricks storage account needed to provide access to the workspace for enabling Customer Managed Keys.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The principal UUID for the internal databricks storage account needed to provide access to the workspace for enabling Customer Managed Keys.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The UUID of the tenant where the internal databricks storage account was created.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The UUID of the tenant where the internal databricks storage account was created.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The type of the internal databricks storage account.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the internal databricks storage account.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WorkspaceStorageAccountIdentityArgs() {}

    private WorkspaceStorageAccountIdentityArgs(WorkspaceStorageAccountIdentityArgs $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceStorageAccountIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceStorageAccountIdentityArgs $;

        public Builder() {
            $ = new WorkspaceStorageAccountIdentityArgs();
        }

        public Builder(WorkspaceStorageAccountIdentityArgs defaults) {
            $ = new WorkspaceStorageAccountIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The principal UUID for the internal databricks storage account needed to provide access to the workspace for enabling Customer Managed Keys.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal UUID for the internal databricks storage account needed to provide access to the workspace for enabling Customer Managed Keys.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The UUID of the tenant where the internal databricks storage account was created.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The UUID of the tenant where the internal databricks storage account was created.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type The type of the internal databricks storage account.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the internal databricks storage account.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WorkspaceStorageAccountIdentityArgs build() {
            return $;
        }
    }

}