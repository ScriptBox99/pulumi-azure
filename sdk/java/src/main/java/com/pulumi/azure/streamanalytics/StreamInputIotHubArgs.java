// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamInputIotHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamInputIotHubArgs Empty = new StreamInputIotHubArgs();

    /**
     * The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
     * 
     */
    @Import(name="eventhubConsumerGroupName", required=true)
    private Output<String> eventhubConsumerGroupName;

    /**
     * @return The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
     * 
     */
    public Output<String> eventhubConsumerGroupName() {
        return this.eventhubConsumerGroupName;
    }

    /**
     * The name or the URI of the IoT Hub.
     * 
     */
    @Import(name="iothubNamespace", required=true)
    private Output<String> iothubNamespace;

    /**
     * @return The name or the URI of the IoT Hub.
     * 
     */
    public Output<String> iothubNamespace() {
        return this.iothubNamespace;
    }

    /**
     * The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `serialization` block as defined below.
     * 
     */
    @Import(name="serialization", required=true)
    private Output<StreamInputIotHubSerializationArgs> serialization;

    /**
     * @return A `serialization` block as defined below.
     * 
     */
    public Output<StreamInputIotHubSerializationArgs> serialization() {
        return this.serialization;
    }

    /**
     * The shared access policy key for the specified shared access policy.
     * 
     */
    @Import(name="sharedAccessPolicyKey", required=true)
    private Output<String> sharedAccessPolicyKey;

    /**
     * @return The shared access policy key for the specified shared access policy.
     * 
     */
    public Output<String> sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    @Import(name="sharedAccessPolicyName", required=true)
    private Output<String> sharedAccessPolicyName;

    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    public Output<String> sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName", required=true)
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }

    private StreamInputIotHubArgs() {}

    private StreamInputIotHubArgs(StreamInputIotHubArgs $) {
        this.endpoint = $.endpoint;
        this.eventhubConsumerGroupName = $.eventhubConsumerGroupName;
        this.iothubNamespace = $.iothubNamespace;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serialization = $.serialization;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamInputIotHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamInputIotHubArgs $;

        public Builder() {
            $ = new StreamInputIotHubArgs();
        }

        public Builder(StreamInputIotHubArgs defaults) {
            $ = new StreamInputIotHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param eventhubConsumerGroupName The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubConsumerGroupName(Output<String> eventhubConsumerGroupName) {
            $.eventhubConsumerGroupName = eventhubConsumerGroupName;
            return this;
        }

        /**
         * @param eventhubConsumerGroupName The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubConsumerGroupName(String eventhubConsumerGroupName) {
            return eventhubConsumerGroupName(Output.of(eventhubConsumerGroupName));
        }

        /**
         * @param iothubNamespace The name or the URI of the IoT Hub.
         * 
         * @return builder
         * 
         */
        public Builder iothubNamespace(Output<String> iothubNamespace) {
            $.iothubNamespace = iothubNamespace;
            return this;
        }

        /**
         * @param iothubNamespace The name or the URI of the IoT Hub.
         * 
         * @return builder
         * 
         */
        public Builder iothubNamespace(String iothubNamespace) {
            return iothubNamespace(Output.of(iothubNamespace));
        }

        /**
         * @param name The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(Output<StreamInputIotHubSerializationArgs> serialization) {
            $.serialization = serialization;
            return this;
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(StreamInputIotHubSerializationArgs serialization) {
            return serialization(Output.of(serialization));
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(Output<String> sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(String sharedAccessPolicyKey) {
            return sharedAccessPolicyKey(Output.of(sharedAccessPolicyKey));
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(Output<String> sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            return sharedAccessPolicyName(Output.of(sharedAccessPolicyName));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        public StreamInputIotHubArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.eventhubConsumerGroupName = Objects.requireNonNull($.eventhubConsumerGroupName, "expected parameter 'eventhubConsumerGroupName' to be non-null");
            $.iothubNamespace = Objects.requireNonNull($.iothubNamespace, "expected parameter 'iothubNamespace' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serialization = Objects.requireNonNull($.serialization, "expected parameter 'serialization' to be non-null");
            $.sharedAccessPolicyKey = Objects.requireNonNull($.sharedAccessPolicyKey, "expected parameter 'sharedAccessPolicyKey' to be non-null");
            $.sharedAccessPolicyName = Objects.requireNonNull($.sharedAccessPolicyName, "expected parameter 'sharedAccessPolicyName' to be non-null");
            $.streamAnalyticsJobName = Objects.requireNonNull($.streamAnalyticsJobName, "expected parameter 'streamAnalyticsJobName' to be non-null");
            return $;
        }
    }

}