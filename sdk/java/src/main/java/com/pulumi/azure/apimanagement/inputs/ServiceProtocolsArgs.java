// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProtocolsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProtocolsArgs Empty = new ServiceProtocolsArgs();

    /**
     * Should HTTP/2 be supported by the API Management Service? Defaults to `false`.
     * 
     */
    @Import(name="enableHttp2")
    private @Nullable Output<Boolean> enableHttp2;

    /**
     * @return Should HTTP/2 be supported by the API Management Service? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableHttp2() {
        return Optional.ofNullable(this.enableHttp2);
    }

    private ServiceProtocolsArgs() {}

    private ServiceProtocolsArgs(ServiceProtocolsArgs $) {
        this.enableHttp2 = $.enableHttp2;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProtocolsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProtocolsArgs $;

        public Builder() {
            $ = new ServiceProtocolsArgs();
        }

        public Builder(ServiceProtocolsArgs defaults) {
            $ = new ServiceProtocolsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableHttp2 Should HTTP/2 be supported by the API Management Service? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableHttp2(@Nullable Output<Boolean> enableHttp2) {
            $.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * @param enableHttp2 Should HTTP/2 be supported by the API Management Service? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableHttp2(Boolean enableHttp2) {
            return enableHttp2(Output.of(enableHttp2));
        }

        public ServiceProtocolsArgs build() {
            return $;
        }
    }

}