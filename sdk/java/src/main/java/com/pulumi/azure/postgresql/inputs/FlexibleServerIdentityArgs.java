// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleServerIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleServerIdentityArgs Empty = new FlexibleServerIdentityArgs();

    /**
     * A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID of the Azure Active Directory which is used by the Active Directory authentication. `active_directory_auth_enabled` must be set to `true`.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID of the Azure Active Directory which is used by the Active Directory authentication. `active_directory_auth_enabled` must be set to `true`.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. Should be set to `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. Should be set to `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FlexibleServerIdentityArgs() {}

    private FlexibleServerIdentityArgs(FlexibleServerIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleServerIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleServerIdentityArgs $;

        public Builder() {
            $ = new FlexibleServerIdentityArgs();
        }

        public Builder(FlexibleServerIdentityArgs defaults) {
            $ = new FlexibleServerIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID of the Azure Active Directory which is used by the Active Directory authentication. `active_directory_auth_enabled` must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID of the Azure Active Directory which is used by the Active Directory authentication. `active_directory_auth_enabled` must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. Should be set to `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. Should be set to `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FlexibleServerIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}