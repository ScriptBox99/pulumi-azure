// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayFrontendPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFrontendPortArgs Empty = new ApplicationGatewayFrontendPortArgs();

    /**
     * The ID of the Rewrite Rule Set
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Frontend Port.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Frontend Port.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The port used for this Frontend Port.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port used for this Frontend Port.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private ApplicationGatewayFrontendPortArgs() {}

    private ApplicationGatewayFrontendPortArgs(ApplicationGatewayFrontendPortArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayFrontendPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayFrontendPortArgs $;

        public Builder() {
            $ = new ApplicationGatewayFrontendPortArgs();
        }

        public Builder(ApplicationGatewayFrontendPortArgs defaults) {
            $ = new ApplicationGatewayFrontendPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the Frontend Port.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Frontend Port.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port used for this Frontend Port.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port used for this Frontend Port.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ApplicationGatewayFrontendPortArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}