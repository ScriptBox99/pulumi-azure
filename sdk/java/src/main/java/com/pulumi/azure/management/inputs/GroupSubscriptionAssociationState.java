// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupSubscriptionAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final GroupSubscriptionAssociationState Empty = new GroupSubscriptionAssociationState();

    /**
     * The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
     * 
     */
    @Import(name="managementGroupId")
    private @Nullable Output<String> managementGroupId;

    /**
     * @return The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
     * 
     */
    public Optional<Output<String>> managementGroupId() {
        return Optional.ofNullable(this.managementGroupId);
    }

    /**
     * The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private GroupSubscriptionAssociationState() {}

    private GroupSubscriptionAssociationState(GroupSubscriptionAssociationState $) {
        this.managementGroupId = $.managementGroupId;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupSubscriptionAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupSubscriptionAssociationState $;

        public Builder() {
            $ = new GroupSubscriptionAssociationState();
        }

        public Builder(GroupSubscriptionAssociationState defaults) {
            $ = new GroupSubscriptionAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementGroupId The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(@Nullable Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupId The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param subscriptionId The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public GroupSubscriptionAssociationState build() {
            return $;
        }
    }

}