// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TrafficManagerProfileMonitorConfigCustomHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficManagerProfileMonitorConfigCustomHeaderArgs Empty = new TrafficManagerProfileMonitorConfigCustomHeaderArgs();

    /**
     * The name of the custom header.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the custom header.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of custom header. Applicable for HTTP and HTTPS protocol.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of custom header. Applicable for HTTP and HTTPS protocol.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private TrafficManagerProfileMonitorConfigCustomHeaderArgs() {}

    private TrafficManagerProfileMonitorConfigCustomHeaderArgs(TrafficManagerProfileMonitorConfigCustomHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficManagerProfileMonitorConfigCustomHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficManagerProfileMonitorConfigCustomHeaderArgs $;

        public Builder() {
            $ = new TrafficManagerProfileMonitorConfigCustomHeaderArgs();
        }

        public Builder(TrafficManagerProfileMonitorConfigCustomHeaderArgs defaults) {
            $ = new TrafficManagerProfileMonitorConfigCustomHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the custom header.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the custom header.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of custom header. Applicable for HTTP and HTTPS protocol.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of custom header. Applicable for HTTP and HTTPS protocol.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TrafficManagerProfileMonitorConfigCustomHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
