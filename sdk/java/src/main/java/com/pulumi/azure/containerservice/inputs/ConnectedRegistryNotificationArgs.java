// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectedRegistryNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectedRegistryNotificationArgs Empty = new ConnectedRegistryNotificationArgs();

    /**
     * The action of the artifact that wants to be subscribed for the Connected Registry. Possible values are `push`, `delete` and `*` (i.e. any).
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action of the artifact that wants to be subscribed for the Connected Registry. Possible values are `push`, `delete` and `*` (i.e. any).
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The digest of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    @Import(name="digest")
    private @Nullable Output<String> digest;

    /**
     * @return The digest of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    public Optional<Output<String>> digest() {
        return Optional.ofNullable(this.digest);
    }

    /**
     * The name of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The tag of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The tag of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private ConnectedRegistryNotificationArgs() {}

    private ConnectedRegistryNotificationArgs(ConnectedRegistryNotificationArgs $) {
        this.action = $.action;
        this.digest = $.digest;
        this.name = $.name;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectedRegistryNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectedRegistryNotificationArgs $;

        public Builder() {
            $ = new ConnectedRegistryNotificationArgs();
        }

        public Builder(ConnectedRegistryNotificationArgs defaults) {
            $ = new ConnectedRegistryNotificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action of the artifact that wants to be subscribed for the Connected Registry. Possible values are `push`, `delete` and `*` (i.e. any).
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action of the artifact that wants to be subscribed for the Connected Registry. Possible values are `push`, `delete` and `*` (i.e. any).
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param digest The digest of the artifact that wants to be subscribed for the Connected Registry.
         * 
         * @return builder
         * 
         */
        public Builder digest(@Nullable Output<String> digest) {
            $.digest = digest;
            return this;
        }

        /**
         * @param digest The digest of the artifact that wants to be subscribed for the Connected Registry.
         * 
         * @return builder
         * 
         */
        public Builder digest(String digest) {
            return digest(Output.of(digest));
        }

        /**
         * @param name The name of the artifact that wants to be subscribed for the Connected Registry.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the artifact that wants to be subscribed for the Connected Registry.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tag The tag of the artifact that wants to be subscribed for the Connected Registry.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag of the artifact that wants to be subscribed for the Connected Registry.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public ConnectedRegistryNotificationArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}