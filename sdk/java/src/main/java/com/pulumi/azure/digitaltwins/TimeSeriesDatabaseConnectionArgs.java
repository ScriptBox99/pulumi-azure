// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.digitaltwins;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimeSeriesDatabaseConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeSeriesDatabaseConnectionArgs Empty = new TimeSeriesDatabaseConnectionArgs();

    /**
     * The ID of the Digital Twins. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="digitalTwinsId", required=true)
    private Output<String> digitalTwinsId;

    /**
     * @return The ID of the Digital Twins. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> digitalTwinsId() {
        return this.digitalTwinsId;
    }

    /**
     * Name of the Event Hub Consumer Group. Changing this forces a new resource to be created. Defaults to `$Default`.
     * 
     */
    @Import(name="eventhubConsumerGroupName")
    private @Nullable Output<String> eventhubConsumerGroupName;

    /**
     * @return Name of the Event Hub Consumer Group. Changing this forces a new resource to be created. Defaults to `$Default`.
     * 
     */
    public Optional<Output<String>> eventhubConsumerGroupName() {
        return Optional.ofNullable(this.eventhubConsumerGroupName);
    }

    /**
     * Name of the Event Hub. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventhubName", required=true)
    private Output<String> eventhubName;

    /**
     * @return Name of the Event Hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }

    /**
     * URI of the Event Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventhubNamespaceEndpointUri", required=true)
    private Output<String> eventhubNamespaceEndpointUri;

    /**
     * @return URI of the Event Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubNamespaceEndpointUri() {
        return this.eventhubNamespaceEndpointUri;
    }

    /**
     * The ID of the Event Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventhubNamespaceId", required=true)
    private Output<String> eventhubNamespaceId;

    /**
     * @return The ID of the Event Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubNamespaceId() {
        return this.eventhubNamespaceId;
    }

    /**
     * The ID of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kustoClusterId", required=true)
    private Output<String> kustoClusterId;

    /**
     * @return The ID of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> kustoClusterId() {
        return this.kustoClusterId;
    }

    /**
     * URI of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kustoClusterUri", required=true)
    private Output<String> kustoClusterUri;

    /**
     * @return URI of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> kustoClusterUri() {
        return this.kustoClusterUri;
    }

    /**
     * Name of the Kusto Database. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kustoDatabaseName", required=true)
    private Output<String> kustoDatabaseName;

    /**
     * @return Name of the Kusto Database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> kustoDatabaseName() {
        return this.kustoDatabaseName;
    }

    /**
     * Name of the Kusto Table. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kustoTableName")
    private @Nullable Output<String> kustoTableName;

    /**
     * @return Name of the Kusto Table. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> kustoTableName() {
        return Optional.ofNullable(this.kustoTableName);
    }

    /**
     * The name which should be used for this Digital Twins Time Series Database Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Digital Twins Time Series Database Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TimeSeriesDatabaseConnectionArgs() {}

    private TimeSeriesDatabaseConnectionArgs(TimeSeriesDatabaseConnectionArgs $) {
        this.digitalTwinsId = $.digitalTwinsId;
        this.eventhubConsumerGroupName = $.eventhubConsumerGroupName;
        this.eventhubName = $.eventhubName;
        this.eventhubNamespaceEndpointUri = $.eventhubNamespaceEndpointUri;
        this.eventhubNamespaceId = $.eventhubNamespaceId;
        this.kustoClusterId = $.kustoClusterId;
        this.kustoClusterUri = $.kustoClusterUri;
        this.kustoDatabaseName = $.kustoDatabaseName;
        this.kustoTableName = $.kustoTableName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesDatabaseConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesDatabaseConnectionArgs $;

        public Builder() {
            $ = new TimeSeriesDatabaseConnectionArgs();
        }

        public Builder(TimeSeriesDatabaseConnectionArgs defaults) {
            $ = new TimeSeriesDatabaseConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param digitalTwinsId The ID of the Digital Twins. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder digitalTwinsId(Output<String> digitalTwinsId) {
            $.digitalTwinsId = digitalTwinsId;
            return this;
        }

        /**
         * @param digitalTwinsId The ID of the Digital Twins. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder digitalTwinsId(String digitalTwinsId) {
            return digitalTwinsId(Output.of(digitalTwinsId));
        }

        /**
         * @param eventhubConsumerGroupName Name of the Event Hub Consumer Group. Changing this forces a new resource to be created. Defaults to `$Default`.
         * 
         * @return builder
         * 
         */
        public Builder eventhubConsumerGroupName(@Nullable Output<String> eventhubConsumerGroupName) {
            $.eventhubConsumerGroupName = eventhubConsumerGroupName;
            return this;
        }

        /**
         * @param eventhubConsumerGroupName Name of the Event Hub Consumer Group. Changing this forces a new resource to be created. Defaults to `$Default`.
         * 
         * @return builder
         * 
         */
        public Builder eventhubConsumerGroupName(String eventhubConsumerGroupName) {
            return eventhubConsumerGroupName(Output.of(eventhubConsumerGroupName));
        }

        /**
         * @param eventhubName Name of the Event Hub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(Output<String> eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        /**
         * @param eventhubName Name of the Event Hub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            return eventhubName(Output.of(eventhubName));
        }

        /**
         * @param eventhubNamespaceEndpointUri URI of the Event Hub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceEndpointUri(Output<String> eventhubNamespaceEndpointUri) {
            $.eventhubNamespaceEndpointUri = eventhubNamespaceEndpointUri;
            return this;
        }

        /**
         * @param eventhubNamespaceEndpointUri URI of the Event Hub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceEndpointUri(String eventhubNamespaceEndpointUri) {
            return eventhubNamespaceEndpointUri(Output.of(eventhubNamespaceEndpointUri));
        }

        /**
         * @param eventhubNamespaceId The ID of the Event Hub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceId(Output<String> eventhubNamespaceId) {
            $.eventhubNamespaceId = eventhubNamespaceId;
            return this;
        }

        /**
         * @param eventhubNamespaceId The ID of the Event Hub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceId(String eventhubNamespaceId) {
            return eventhubNamespaceId(Output.of(eventhubNamespaceId));
        }

        /**
         * @param kustoClusterId The ID of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoClusterId(Output<String> kustoClusterId) {
            $.kustoClusterId = kustoClusterId;
            return this;
        }

        /**
         * @param kustoClusterId The ID of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoClusterId(String kustoClusterId) {
            return kustoClusterId(Output.of(kustoClusterId));
        }

        /**
         * @param kustoClusterUri URI of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoClusterUri(Output<String> kustoClusterUri) {
            $.kustoClusterUri = kustoClusterUri;
            return this;
        }

        /**
         * @param kustoClusterUri URI of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoClusterUri(String kustoClusterUri) {
            return kustoClusterUri(Output.of(kustoClusterUri));
        }

        /**
         * @param kustoDatabaseName Name of the Kusto Database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseName(Output<String> kustoDatabaseName) {
            $.kustoDatabaseName = kustoDatabaseName;
            return this;
        }

        /**
         * @param kustoDatabaseName Name of the Kusto Database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseName(String kustoDatabaseName) {
            return kustoDatabaseName(Output.of(kustoDatabaseName));
        }

        /**
         * @param kustoTableName Name of the Kusto Table. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoTableName(@Nullable Output<String> kustoTableName) {
            $.kustoTableName = kustoTableName;
            return this;
        }

        /**
         * @param kustoTableName Name of the Kusto Table. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoTableName(String kustoTableName) {
            return kustoTableName(Output.of(kustoTableName));
        }

        /**
         * @param name The name which should be used for this Digital Twins Time Series Database Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Digital Twins Time Series Database Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TimeSeriesDatabaseConnectionArgs build() {
            $.digitalTwinsId = Objects.requireNonNull($.digitalTwinsId, "expected parameter 'digitalTwinsId' to be non-null");
            $.eventhubName = Objects.requireNonNull($.eventhubName, "expected parameter 'eventhubName' to be non-null");
            $.eventhubNamespaceEndpointUri = Objects.requireNonNull($.eventhubNamespaceEndpointUri, "expected parameter 'eventhubNamespaceEndpointUri' to be non-null");
            $.eventhubNamespaceId = Objects.requireNonNull($.eventhubNamespaceId, "expected parameter 'eventhubNamespaceId' to be non-null");
            $.kustoClusterId = Objects.requireNonNull($.kustoClusterId, "expected parameter 'kustoClusterId' to be non-null");
            $.kustoClusterUri = Objects.requireNonNull($.kustoClusterUri, "expected parameter 'kustoClusterUri' to be non-null");
            $.kustoDatabaseName = Objects.requireNonNull($.kustoDatabaseName, "expected parameter 'kustoDatabaseName' to be non-null");
            return $;
        }
    }

}