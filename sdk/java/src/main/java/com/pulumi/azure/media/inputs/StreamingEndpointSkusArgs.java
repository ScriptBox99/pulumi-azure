// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingEndpointSkusArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingEndpointSkusArgs Empty = new StreamingEndpointSkusArgs();

    /**
     * The sku capacity of Streaming Endpoint.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The sku capacity of Streaming Endpoint.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The name which should be used for this Streaming Endpoint maximum length is `24`. Changing this forces a new Streaming Endpoint to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Streaming Endpoint maximum length is `24`. Changing this forces a new Streaming Endpoint to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private StreamingEndpointSkusArgs() {}

    private StreamingEndpointSkusArgs(StreamingEndpointSkusArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingEndpointSkusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingEndpointSkusArgs $;

        public Builder() {
            $ = new StreamingEndpointSkusArgs();
        }

        public Builder(StreamingEndpointSkusArgs defaults) {
            $ = new StreamingEndpointSkusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The sku capacity of Streaming Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The sku capacity of Streaming Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param name The name which should be used for this Streaming Endpoint maximum length is `24`. Changing this forces a new Streaming Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Streaming Endpoint maximum length is `24`. Changing this forces a new Streaming Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public StreamingEndpointSkusArgs build() {
            return $;
        }
    }

}