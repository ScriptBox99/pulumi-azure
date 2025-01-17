// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.azure.containerapp.outputs.AppTemplateCustomScaleRuleAuthentication;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AppTemplateCustomScaleRule {
    /**
     * @return Zero or more `authentication` blocks as defined below.
     * 
     */
    private @Nullable List<AppTemplateCustomScaleRuleAuthentication> authentications;
    /**
     * @return The Custom rule type. Possible values include: `activemq`, `artemis-queue`, `kafka`, `pulsar`, `aws-cloudwatch`, `aws-dynamodb`, `aws-dynamodb-streams`, `aws-kinesis-stream`, `aws-sqs-queue`, `azure-app-insights`, `azure-blob`, `azure-data-explorer`, `azure-eventhub`, `azure-log-analytics`, `azure-monitor`, `azure-pipelines`, `azure-servicebus`, `azure-queue`, `cassandra`, `cpu`, `cron`, `datadog`, `elasticsearch`, `external`, `external-push`, `gcp-stackdriver`, `gcp-storage`, `gcp-pubsub`, `graphite`, `http`, `huawei-cloudeye`, `ibmmq`, `influxdb`, `kubernetes-workload`, `liiklus`, `memory`, `metrics-api`, `mongodb`, `mssql`, `mysql`, `nats-jetstream`, `stan`, `tcp`, `new-relic`, `openstack-metric`, `openstack-swift`, `postgresql`, `predictkube`, `prometheus`, `rabbitmq`, `redis`, `redis-cluster`, `redis-sentinel`, `redis-streams`, `redis-cluster-streams`, `redis-sentinel-streams`, `selenium-grid`,`solace-event-queue`, and `github-runner`.
     * 
     */
    private String customRuleType;
    /**
     * @return A map of string key-value pairs to configure the Custom Scale Rule.
     * 
     */
    private Map<String,String> metadata;
    /**
     * @return The name of the Scaling Rule
     * 
     */
    private String name;

    private AppTemplateCustomScaleRule() {}
    /**
     * @return Zero or more `authentication` blocks as defined below.
     * 
     */
    public List<AppTemplateCustomScaleRuleAuthentication> authentications() {
        return this.authentications == null ? List.of() : this.authentications;
    }
    /**
     * @return The Custom rule type. Possible values include: `activemq`, `artemis-queue`, `kafka`, `pulsar`, `aws-cloudwatch`, `aws-dynamodb`, `aws-dynamodb-streams`, `aws-kinesis-stream`, `aws-sqs-queue`, `azure-app-insights`, `azure-blob`, `azure-data-explorer`, `azure-eventhub`, `azure-log-analytics`, `azure-monitor`, `azure-pipelines`, `azure-servicebus`, `azure-queue`, `cassandra`, `cpu`, `cron`, `datadog`, `elasticsearch`, `external`, `external-push`, `gcp-stackdriver`, `gcp-storage`, `gcp-pubsub`, `graphite`, `http`, `huawei-cloudeye`, `ibmmq`, `influxdb`, `kubernetes-workload`, `liiklus`, `memory`, `metrics-api`, `mongodb`, `mssql`, `mysql`, `nats-jetstream`, `stan`, `tcp`, `new-relic`, `openstack-metric`, `openstack-swift`, `postgresql`, `predictkube`, `prometheus`, `rabbitmq`, `redis`, `redis-cluster`, `redis-sentinel`, `redis-streams`, `redis-cluster-streams`, `redis-sentinel-streams`, `selenium-grid`,`solace-event-queue`, and `github-runner`.
     * 
     */
    public String customRuleType() {
        return this.customRuleType;
    }
    /**
     * @return A map of string key-value pairs to configure the Custom Scale Rule.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of the Scaling Rule
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppTemplateCustomScaleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AppTemplateCustomScaleRuleAuthentication> authentications;
        private String customRuleType;
        private Map<String,String> metadata;
        private String name;
        public Builder() {}
        public Builder(AppTemplateCustomScaleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentications = defaults.authentications;
    	      this.customRuleType = defaults.customRuleType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder authentications(@Nullable List<AppTemplateCustomScaleRuleAuthentication> authentications) {
            this.authentications = authentications;
            return this;
        }
        public Builder authentications(AppTemplateCustomScaleRuleAuthentication... authentications) {
            return authentications(List.of(authentications));
        }
        @CustomType.Setter
        public Builder customRuleType(String customRuleType) {
            this.customRuleType = Objects.requireNonNull(customRuleType);
            return this;
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AppTemplateCustomScaleRule build() {
            final var _resultValue = new AppTemplateCustomScaleRule();
            _resultValue.authentications = authentications;
            _resultValue.customRuleType = customRuleType;
            _resultValue.metadata = metadata;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
