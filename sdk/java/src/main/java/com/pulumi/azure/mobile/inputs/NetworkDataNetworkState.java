// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkDataNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkDataNetworkState Empty = new NetworkDataNetworkState();

    /**
     * A description of this Mobile Network Data Network.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this Mobile Network Data Network.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the Azure Region where the Mobile Network Data Network should exist. Changing this forces a new Mobile Network Data Network to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Mobile Network Data Network should exist. Changing this forces a new Mobile Network Data Network to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the ID of the Mobile Network. Changing this forces a new Mobile Network Data Network to be created.
     * 
     */
    @Import(name="mobileNetworkId")
    private @Nullable Output<String> mobileNetworkId;

    /**
     * @return Specifies the ID of the Mobile Network. Changing this forces a new Mobile Network Data Network to be created.
     * 
     */
    public Optional<Output<String>> mobileNetworkId() {
        return Optional.ofNullable(this.mobileNetworkId);
    }

    /**
     * Specifies the name which should be used for this Mobile Network Data Network. Changing this forces a new Mobile Network Data Network to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Mobile Network Data Network. Changing this forces a new Mobile Network Data Network to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping of tags which should be assigned to the Mobile Network Data Network.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Data Network.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkDataNetworkState() {}

    private NetworkDataNetworkState(NetworkDataNetworkState $) {
        this.description = $.description;
        this.location = $.location;
        this.mobileNetworkId = $.mobileNetworkId;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkDataNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkDataNetworkState $;

        public Builder() {
            $ = new NetworkDataNetworkState();
        }

        public Builder(NetworkDataNetworkState defaults) {
            $ = new NetworkDataNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of this Mobile Network Data Network.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this Mobile Network Data Network.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network Data Network should exist. Changing this forces a new Mobile Network Data Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network Data Network should exist. Changing this forces a new Mobile Network Data Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mobileNetworkId Specifies the ID of the Mobile Network. Changing this forces a new Mobile Network Data Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(@Nullable Output<String> mobileNetworkId) {
            $.mobileNetworkId = mobileNetworkId;
            return this;
        }

        /**
         * @param mobileNetworkId Specifies the ID of the Mobile Network. Changing this forces a new Mobile Network Data Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(String mobileNetworkId) {
            return mobileNetworkId(Output.of(mobileNetworkId));
        }

        /**
         * @param name Specifies the name which should be used for this Mobile Network Data Network. Changing this forces a new Mobile Network Data Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Mobile Network Data Network. Changing this forces a new Mobile Network Data Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network Data Network.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network Data Network.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkDataNetworkState build() {
            return $;
        }
    }

}