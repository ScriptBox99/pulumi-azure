// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueueAuthorizationRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueueAuthorizationRuleArgs Empty = new GetQueueAuthorizationRuleArgs();

    /**
     * The name of this ServiceBus Queue Authorisation Rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this ServiceBus Queue Authorisation Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the ServiceBus Namespace.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return The name of the ServiceBus Namespace.
     * 
     */
    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    @Import(name="queueId")
    private @Nullable Output<String> queueId;

    public Optional<Output<String>> queueId() {
        return Optional.ofNullable(this.queueId);
    }

    /**
     * The name of the ServiceBus Queue.
     * 
     */
    @Import(name="queueName")
    private @Nullable Output<String> queueName;

    /**
     * @return The name of the ServiceBus Queue.
     * 
     */
    public Optional<Output<String>> queueName() {
        return Optional.ofNullable(this.queueName);
    }

    /**
     * The name of the Resource Group where the ServiceBus Queue Authorisation Rule exists.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the ServiceBus Queue Authorisation Rule exists.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private GetQueueAuthorizationRuleArgs() {}

    private GetQueueAuthorizationRuleArgs(GetQueueAuthorizationRuleArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.queueId = $.queueId;
        this.queueName = $.queueName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueueAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueueAuthorizationRuleArgs $;

        public Builder() {
            $ = new GetQueueAuthorizationRuleArgs();
        }

        public Builder(GetQueueAuthorizationRuleArgs defaults) {
            $ = new GetQueueAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this ServiceBus Queue Authorisation Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this ServiceBus Queue Authorisation Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        public Builder queueId(@Nullable Output<String> queueId) {
            $.queueId = queueId;
            return this;
        }

        public Builder queueId(String queueId) {
            return queueId(Output.of(queueId));
        }

        /**
         * @param queueName The name of the ServiceBus Queue.
         * 
         * @return builder
         * 
         */
        public Builder queueName(@Nullable Output<String> queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param queueName The name of the ServiceBus Queue.
         * 
         * @return builder
         * 
         */
        public Builder queueName(String queueName) {
            return queueName(Output.of(queueName));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the ServiceBus Queue Authorisation Rule exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the ServiceBus Queue Authorisation Rule exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetQueueAuthorizationRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}