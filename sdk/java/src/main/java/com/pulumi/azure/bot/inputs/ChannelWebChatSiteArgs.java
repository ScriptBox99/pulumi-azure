// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelWebChatSiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelWebChatSiteArgs Empty = new ChannelWebChatSiteArgs();

    /**
     * Is the endpoint parameters enabled for this site?
     * 
     */
    @Import(name="endpointParametersEnabled")
    private @Nullable Output<Boolean> endpointParametersEnabled;

    /**
     * @return Is the endpoint parameters enabled for this site?
     * 
     */
    public Optional<Output<Boolean>> endpointParametersEnabled() {
        return Optional.ofNullable(this.endpointParametersEnabled);
    }

    /**
     * The name of the site.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the site.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Is the storage site enabled for detailed logging? Defaults to `true`.
     * 
     */
    @Import(name="storageEnabled")
    private @Nullable Output<Boolean> storageEnabled;

    /**
     * @return Is the storage site enabled for detailed logging? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> storageEnabled() {
        return Optional.ofNullable(this.storageEnabled);
    }

    /**
     * Is the user upload enabled for this site? Defaults to `true`.
     * 
     */
    @Import(name="userUploadEnabled")
    private @Nullable Output<Boolean> userUploadEnabled;

    /**
     * @return Is the user upload enabled for this site? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> userUploadEnabled() {
        return Optional.ofNullable(this.userUploadEnabled);
    }

    private ChannelWebChatSiteArgs() {}

    private ChannelWebChatSiteArgs(ChannelWebChatSiteArgs $) {
        this.endpointParametersEnabled = $.endpointParametersEnabled;
        this.name = $.name;
        this.storageEnabled = $.storageEnabled;
        this.userUploadEnabled = $.userUploadEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelWebChatSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelWebChatSiteArgs $;

        public Builder() {
            $ = new ChannelWebChatSiteArgs();
        }

        public Builder(ChannelWebChatSiteArgs defaults) {
            $ = new ChannelWebChatSiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointParametersEnabled Is the endpoint parameters enabled for this site?
         * 
         * @return builder
         * 
         */
        public Builder endpointParametersEnabled(@Nullable Output<Boolean> endpointParametersEnabled) {
            $.endpointParametersEnabled = endpointParametersEnabled;
            return this;
        }

        /**
         * @param endpointParametersEnabled Is the endpoint parameters enabled for this site?
         * 
         * @return builder
         * 
         */
        public Builder endpointParametersEnabled(Boolean endpointParametersEnabled) {
            return endpointParametersEnabled(Output.of(endpointParametersEnabled));
        }

        /**
         * @param name The name of the site.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the site.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageEnabled Is the storage site enabled for detailed logging? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder storageEnabled(@Nullable Output<Boolean> storageEnabled) {
            $.storageEnabled = storageEnabled;
            return this;
        }

        /**
         * @param storageEnabled Is the storage site enabled for detailed logging? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder storageEnabled(Boolean storageEnabled) {
            return storageEnabled(Output.of(storageEnabled));
        }

        /**
         * @param userUploadEnabled Is the user upload enabled for this site? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder userUploadEnabled(@Nullable Output<Boolean> userUploadEnabled) {
            $.userUploadEnabled = userUploadEnabled;
            return this;
        }

        /**
         * @param userUploadEnabled Is the user upload enabled for this site? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder userUploadEnabled(Boolean userUploadEnabled) {
            return userUploadEnabled(Output.of(userUploadEnabled));
        }

        public ChannelWebChatSiteArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}