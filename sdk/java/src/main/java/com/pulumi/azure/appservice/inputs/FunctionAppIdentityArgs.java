// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionAppIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionAppIdentityArgs Empty = new FunctionAppIdentityArgs();

    /**
     * Specifies a list of user managed identity ids to be assigned. Required if `type` is `UserAssigned`.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return Specifies a list of user managed identity ids to be assigned. Required if `type` is `UserAssigned`.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    /**
     * The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the identity type of the Function App. Possible values are `SystemAssigned` (where Azure will generate a Service Principal for you), `UserAssigned` where you can specify the Service Principal IDs in the `identity_ids` field, and `SystemAssigned, UserAssigned` which assigns both a system managed identity as well as the specified user assigned identities.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the identity type of the Function App. Possible values are `SystemAssigned` (where Azure will generate a Service Principal for you), `UserAssigned` where you can specify the Service Principal IDs in the `identity_ids` field, and `SystemAssigned, UserAssigned` which assigns both a system managed identity as well as the specified user assigned identities.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FunctionAppIdentityArgs() {}

    private FunctionAppIdentityArgs(FunctionAppIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionAppIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionAppIdentityArgs $;

        public Builder() {
            $ = new FunctionAppIdentityArgs();
        }

        public Builder(FunctionAppIdentityArgs defaults) {
            $ = new FunctionAppIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds Specifies a list of user managed identity ids to be assigned. Required if `type` is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds Specifies a list of user managed identity ids to be assigned. Required if `type` is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds Specifies a list of user managed identity ids to be assigned. Required if `type` is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the identity type of the Function App. Possible values are `SystemAssigned` (where Azure will generate a Service Principal for you), `UserAssigned` where you can specify the Service Principal IDs in the `identity_ids` field, and `SystemAssigned, UserAssigned` which assigns both a system managed identity as well as the specified user assigned identities.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the identity type of the Function App. Possible values are `SystemAssigned` (where Azure will generate a Service Principal for you), `UserAssigned` where you can specify the Service Principal IDs in the `identity_ids` field, and `SystemAssigned, UserAssigned` which assigns both a system managed identity as well as the specified user assigned identities.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FunctionAppIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}