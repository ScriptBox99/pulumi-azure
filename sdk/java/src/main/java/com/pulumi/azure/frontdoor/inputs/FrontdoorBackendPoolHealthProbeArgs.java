// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorBackendPoolHealthProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorBackendPoolHealthProbeArgs Empty = new FrontdoorBackendPoolHealthProbeArgs();

    /**
     * Is this health probe enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is this health probe enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The ID of the FrontDoor.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the FrontDoor.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The number of seconds between each Health Probe. Defaults to `120`.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    /**
     * @return The number of seconds between each Health Probe. Defaults to `120`.
     * 
     */
    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * Specifies the name of the Health Probe.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Health Probe.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The path to use for the Health Probe. Default is `/`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to use for the Health Probe. Default is `/`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Specifies HTTP method the health probe uses when querying the backend pool instances. Possible values include: `Get` and `Head`. Defaults to `Get`.
     * 
     */
    @Import(name="probeMethod")
    private @Nullable Output<String> probeMethod;

    /**
     * @return Specifies HTTP method the health probe uses when querying the backend pool instances. Possible values include: `Get` and `Head`. Defaults to `Get`.
     * 
     */
    public Optional<Output<String>> probeMethod() {
        return Optional.ofNullable(this.probeMethod);
    }

    /**
     * Protocol scheme to use for the Health Probe. Defaults to `Http`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Protocol scheme to use for the Health Probe. Defaults to `Http`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private FrontdoorBackendPoolHealthProbeArgs() {}

    private FrontdoorBackendPoolHealthProbeArgs(FrontdoorBackendPoolHealthProbeArgs $) {
        this.enabled = $.enabled;
        this.id = $.id;
        this.intervalInSeconds = $.intervalInSeconds;
        this.name = $.name;
        this.path = $.path;
        this.probeMethod = $.probeMethod;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorBackendPoolHealthProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorBackendPoolHealthProbeArgs $;

        public Builder() {
            $ = new FrontdoorBackendPoolHealthProbeArgs();
        }

        public Builder(FrontdoorBackendPoolHealthProbeArgs defaults) {
            $ = new FrontdoorBackendPoolHealthProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Is this health probe enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is this health probe enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param id The ID of the FrontDoor.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the FrontDoor.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param intervalInSeconds The number of seconds between each Health Probe. Defaults to `120`.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds The number of seconds between each Health Probe. Defaults to `120`.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        /**
         * @param name Specifies the name of the Health Probe.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Health Probe.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The path to use for the Health Probe. Default is `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to use for the Health Probe. Default is `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param probeMethod Specifies HTTP method the health probe uses when querying the backend pool instances. Possible values include: `Get` and `Head`. Defaults to `Get`.
         * 
         * @return builder
         * 
         */
        public Builder probeMethod(@Nullable Output<String> probeMethod) {
            $.probeMethod = probeMethod;
            return this;
        }

        /**
         * @param probeMethod Specifies HTTP method the health probe uses when querying the backend pool instances. Possible values include: `Get` and `Head`. Defaults to `Get`.
         * 
         * @return builder
         * 
         */
        public Builder probeMethod(String probeMethod) {
            return probeMethod(Output.of(probeMethod));
        }

        /**
         * @param protocol Protocol scheme to use for the Health Probe. Defaults to `Http`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol scheme to use for the Health Probe. Defaults to `Http`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public FrontdoorBackendPoolHealthProbeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}