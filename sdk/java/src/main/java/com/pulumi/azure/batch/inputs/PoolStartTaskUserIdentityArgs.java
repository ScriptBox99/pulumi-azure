// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityAutoUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolStartTaskUserIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolStartTaskUserIdentityArgs Empty = new PoolStartTaskUserIdentityArgs();

    /**
     * A `auto_user` block that describes the user identity under which the start task runs.
     * 
     */
    @Import(name="autoUser")
    private @Nullable Output<PoolStartTaskUserIdentityAutoUserArgs> autoUser;

    /**
     * @return A `auto_user` block that describes the user identity under which the start task runs.
     * 
     */
    public Optional<Output<PoolStartTaskUserIdentityAutoUserArgs>> autoUser() {
        return Optional.ofNullable(this.autoUser);
    }

    /**
     * The username to be used by the Batch pool start task.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The username to be used by the Batch pool start task.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private PoolStartTaskUserIdentityArgs() {}

    private PoolStartTaskUserIdentityArgs(PoolStartTaskUserIdentityArgs $) {
        this.autoUser = $.autoUser;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolStartTaskUserIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolStartTaskUserIdentityArgs $;

        public Builder() {
            $ = new PoolStartTaskUserIdentityArgs();
        }

        public Builder(PoolStartTaskUserIdentityArgs defaults) {
            $ = new PoolStartTaskUserIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUser A `auto_user` block that describes the user identity under which the start task runs.
         * 
         * @return builder
         * 
         */
        public Builder autoUser(@Nullable Output<PoolStartTaskUserIdentityAutoUserArgs> autoUser) {
            $.autoUser = autoUser;
            return this;
        }

        /**
         * @param autoUser A `auto_user` block that describes the user identity under which the start task runs.
         * 
         * @return builder
         * 
         */
        public Builder autoUser(PoolStartTaskUserIdentityAutoUserArgs autoUser) {
            return autoUser(Output.of(autoUser));
        }

        /**
         * @param userName The username to be used by the Batch pool start task.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The username to be used by the Batch pool start task.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public PoolStartTaskUserIdentityArgs build() {
            return $;
        }
    }

}