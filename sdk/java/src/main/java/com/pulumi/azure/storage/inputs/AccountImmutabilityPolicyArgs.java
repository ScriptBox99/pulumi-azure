// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AccountImmutabilityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountImmutabilityPolicyArgs Empty = new AccountImmutabilityPolicyArgs();

    /**
     * When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
     * 
     */
    @Import(name="allowProtectedAppendWrites", required=true)
    private Output<Boolean> allowProtectedAppendWrites;

    /**
     * @return When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
     * 
     */
    public Output<Boolean> allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    @Import(name="periodSinceCreationInDays", required=true)
    private Output<Integer> periodSinceCreationInDays;

    /**
     * @return The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    public Output<Integer> periodSinceCreationInDays() {
        return this.periodSinceCreationInDays;
    }

    /**
     * Defines the mode of the policy. `Disabled` state disables the policy, `Unlocked` state allows increase and decrease of immutability retention time and also allows toggling allowProtectedAppendWrites property, `Locked` state only allows the increase of the immutability retention time. A policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a policy in an Unlocked state can transition to a Locked state which cannot be reverted.
     * 
     */
    @Import(name="state", required=true)
    private Output<String> state;

    /**
     * @return Defines the mode of the policy. `Disabled` state disables the policy, `Unlocked` state allows increase and decrease of immutability retention time and also allows toggling allowProtectedAppendWrites property, `Locked` state only allows the increase of the immutability retention time. A policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a policy in an Unlocked state can transition to a Locked state which cannot be reverted.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    private AccountImmutabilityPolicyArgs() {}

    private AccountImmutabilityPolicyArgs(AccountImmutabilityPolicyArgs $) {
        this.allowProtectedAppendWrites = $.allowProtectedAppendWrites;
        this.periodSinceCreationInDays = $.periodSinceCreationInDays;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountImmutabilityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountImmutabilityPolicyArgs $;

        public Builder() {
            $ = new AccountImmutabilityPolicyArgs();
        }

        public Builder(AccountImmutabilityPolicyArgs defaults) {
            $ = new AccountImmutabilityPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowProtectedAppendWrites When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
         * 
         * @return builder
         * 
         */
        public Builder allowProtectedAppendWrites(Output<Boolean> allowProtectedAppendWrites) {
            $.allowProtectedAppendWrites = allowProtectedAppendWrites;
            return this;
        }

        /**
         * @param allowProtectedAppendWrites When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
         * 
         * @return builder
         * 
         */
        public Builder allowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
            return allowProtectedAppendWrites(Output.of(allowProtectedAppendWrites));
        }

        /**
         * @param periodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days.
         * 
         * @return builder
         * 
         */
        public Builder periodSinceCreationInDays(Output<Integer> periodSinceCreationInDays) {
            $.periodSinceCreationInDays = periodSinceCreationInDays;
            return this;
        }

        /**
         * @param periodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days.
         * 
         * @return builder
         * 
         */
        public Builder periodSinceCreationInDays(Integer periodSinceCreationInDays) {
            return periodSinceCreationInDays(Output.of(periodSinceCreationInDays));
        }

        /**
         * @param state Defines the mode of the policy. `Disabled` state disables the policy, `Unlocked` state allows increase and decrease of immutability retention time and also allows toggling allowProtectedAppendWrites property, `Locked` state only allows the increase of the immutability retention time. A policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a policy in an Unlocked state can transition to a Locked state which cannot be reverted.
         * 
         * @return builder
         * 
         */
        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Defines the mode of the policy. `Disabled` state disables the policy, `Unlocked` state allows increase and decrease of immutability retention time and also allows toggling allowProtectedAppendWrites property, `Locked` state only allows the increase of the immutability retention time. A policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a policy in an Unlocked state can transition to a Locked state which cannot be reverted.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public AccountImmutabilityPolicyArgs build() {
            $.allowProtectedAppendWrites = Objects.requireNonNull($.allowProtectedAppendWrites, "expected parameter 'allowProtectedAppendWrites' to be non-null");
            $.periodSinceCreationInDays = Objects.requireNonNull($.periodSinceCreationInDays, "expected parameter 'periodSinceCreationInDays' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}