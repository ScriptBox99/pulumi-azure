// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EnrichmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnrichmentArgs Empty = new EnrichmentArgs();

    /**
     * The list of endpoints which will be enriched.
     * 
     */
    @Import(name="endpointNames", required=true)
    private Output<List<String>> endpointNames;

    /**
     * @return The list of endpoints which will be enriched.
     * 
     */
    public Output<List<String>> endpointNames() {
        return this.endpointNames;
    }

    @Import(name="iothubName", required=true)
    private Output<String> iothubName;

    public Output<String> iothubName() {
        return this.iothubName;
    }

    /**
     * The key of the enrichment.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key of the enrichment.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EnrichmentArgs() {}

    private EnrichmentArgs(EnrichmentArgs $) {
        this.endpointNames = $.endpointNames;
        this.iothubName = $.iothubName;
        this.key = $.key;
        this.resourceGroupName = $.resourceGroupName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnrichmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnrichmentArgs $;

        public Builder() {
            $ = new EnrichmentArgs();
        }

        public Builder(EnrichmentArgs defaults) {
            $ = new EnrichmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointNames The list of endpoints which will be enriched.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(Output<List<String>> endpointNames) {
            $.endpointNames = endpointNames;
            return this;
        }

        /**
         * @param endpointNames The list of endpoints which will be enriched.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(List<String> endpointNames) {
            return endpointNames(Output.of(endpointNames));
        }

        /**
         * @param endpointNames The list of endpoints which will be enriched.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(String... endpointNames) {
            return endpointNames(List.of(endpointNames));
        }

        public Builder iothubName(Output<String> iothubName) {
            $.iothubName = iothubName;
            return this;
        }

        public Builder iothubName(String iothubName) {
            return iothubName(Output.of(iothubName));
        }

        /**
         * @param key The key of the enrichment.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of the enrichment.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param value The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnrichmentArgs build() {
            $.endpointNames = Objects.requireNonNull($.endpointNames, "expected parameter 'endpointNames' to be non-null");
            $.iothubName = Objects.requireNonNull($.iothubName, "expected parameter 'iothubName' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}