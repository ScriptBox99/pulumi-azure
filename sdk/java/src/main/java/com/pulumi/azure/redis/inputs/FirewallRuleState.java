// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleState Empty = new FirewallRuleState();

    /**
     * The highest IP address included in the range.
     * 
     */
    @Import(name="endIp")
    private @Nullable Output<String> endIp;

    /**
     * @return The highest IP address included in the range.
     * 
     */
    public Optional<Output<String>> endIp() {
        return Optional.ofNullable(this.endIp);
    }

    /**
     * The name of the Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Redis Cache. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="redisCacheName")
    private @Nullable Output<String> redisCacheName;

    /**
     * @return The name of the Redis Cache. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> redisCacheName() {
        return Optional.ofNullable(this.redisCacheName);
    }

    /**
     * The name of the resource group in which this Redis Cache exists.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which this Redis Cache exists.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The lowest IP address included in the range
     * 
     */
    @Import(name="startIp")
    private @Nullable Output<String> startIp;

    /**
     * @return The lowest IP address included in the range
     * 
     */
    public Optional<Output<String>> startIp() {
        return Optional.ofNullable(this.startIp);
    }

    private FirewallRuleState() {}

    private FirewallRuleState(FirewallRuleState $) {
        this.endIp = $.endIp;
        this.name = $.name;
        this.redisCacheName = $.redisCacheName;
        this.resourceGroupName = $.resourceGroupName;
        this.startIp = $.startIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleState $;

        public Builder() {
            $ = new FirewallRuleState();
        }

        public Builder(FirewallRuleState defaults) {
            $ = new FirewallRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIp The highest IP address included in the range.
         * 
         * @return builder
         * 
         */
        public Builder endIp(@Nullable Output<String> endIp) {
            $.endIp = endIp;
            return this;
        }

        /**
         * @param endIp The highest IP address included in the range.
         * 
         * @return builder
         * 
         */
        public Builder endIp(String endIp) {
            return endIp(Output.of(endIp));
        }

        /**
         * @param name The name of the Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redisCacheName The name of the Redis Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheName(@Nullable Output<String> redisCacheName) {
            $.redisCacheName = redisCacheName;
            return this;
        }

        /**
         * @param redisCacheName The name of the Redis Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheName(String redisCacheName) {
            return redisCacheName(Output.of(redisCacheName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which this Redis Cache exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which this Redis Cache exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startIp The lowest IP address included in the range
         * 
         * @return builder
         * 
         */
        public Builder startIp(@Nullable Output<String> startIp) {
            $.startIp = startIp;
            return this;
        }

        /**
         * @param startIp The lowest IP address included in the range
         * 
         * @return builder
         * 
         */
        public Builder startIp(String startIp) {
            return startIp(Output.of(startIp));
        }

        public FirewallRuleState build() {
            return $;
        }
    }

}