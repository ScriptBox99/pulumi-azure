// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.ScheduledQueryRulesLogCriteriaDimension;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ScheduledQueryRulesLogCriteria {
    /**
     * @return A `dimension` block as defined below.
     * 
     */
    private final List<ScheduledQueryRulesLogCriteriaDimension> dimensions;
    /**
     * @return Name of the metric.  Supported metrics are listed in the Azure Monitor [Microsoft.OperationalInsights/workspaces](https://docs.microsoft.com/azure/azure-monitor/platform/metrics-supported#microsoftoperationalinsightsworkspaces) metrics namespace.
     * 
     */
    private final String metricName;

    @CustomType.Constructor
    private ScheduledQueryRulesLogCriteria(
        @CustomType.Parameter("dimensions") List<ScheduledQueryRulesLogCriteriaDimension> dimensions,
        @CustomType.Parameter("metricName") String metricName) {
        this.dimensions = dimensions;
        this.metricName = metricName;
    }

    /**
     * @return A `dimension` block as defined below.
     * 
     */
    public List<ScheduledQueryRulesLogCriteriaDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return Name of the metric.  Supported metrics are listed in the Azure Monitor [Microsoft.OperationalInsights/workspaces](https://docs.microsoft.com/azure/azure-monitor/platform/metrics-supported#microsoftoperationalinsightsworkspaces) metrics namespace.
     * 
     */
    public String metricName() {
        return this.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryRulesLogCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ScheduledQueryRulesLogCriteriaDimension> dimensions;
        private String metricName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryRulesLogCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
        }

        public Builder dimensions(List<ScheduledQueryRulesLogCriteriaDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(ScheduledQueryRulesLogCriteriaDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }        public ScheduledQueryRulesLogCriteria build() {
            return new ScheduledQueryRulesLogCriteria(dimensions, metricName);
        }
    }
}