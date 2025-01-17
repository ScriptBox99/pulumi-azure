// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NetworkPacketCoreControlPlaneIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPacketCoreControlPlaneIdentityArgs Empty = new NetworkPacketCoreControlPlaneIdentityArgs();

    /**
     * A list of the IDs for User Assigned Managed Identity resources to be assigned.
     * 
     */
    @Import(name="identityIds", required=true)
    private Output<List<String>> identityIds;

    /**
     * @return A list of the IDs for User Assigned Managed Identity resources to be assigned.
     * 
     */
    public Output<List<String>> identityIds() {
        return this.identityIds;
    }

    /**
     * Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private NetworkPacketCoreControlPlaneIdentityArgs() {}

    private NetworkPacketCoreControlPlaneIdentityArgs(NetworkPacketCoreControlPlaneIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPacketCoreControlPlaneIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPacketCoreControlPlaneIdentityArgs $;

        public Builder() {
            $ = new NetworkPacketCoreControlPlaneIdentityArgs();
        }

        public Builder(NetworkPacketCoreControlPlaneIdentityArgs defaults) {
            $ = new NetworkPacketCoreControlPlaneIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds A list of the IDs for User Assigned Managed Identity resources to be assigned.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds A list of the IDs for User Assigned Managed Identity resources to be assigned.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds A list of the IDs for User Assigned Managed Identity resources to be assigned.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param type Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NetworkPacketCoreControlPlaneIdentityArgs build() {
            $.identityIds = Objects.requireNonNull($.identityIds, "expected parameter 'identityIds' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
