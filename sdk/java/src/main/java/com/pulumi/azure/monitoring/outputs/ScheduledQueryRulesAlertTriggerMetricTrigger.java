// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduledQueryRulesAlertTriggerMetricTrigger {
    /**
     * @return Evaluation of metric on a particular column.
     * 
     */
    private final String metricColumn;
    /**
     * @return Metric Trigger Type - &#39;Consecutive&#39; or &#39;Total&#39;.
     * 
     */
    private final String metricTriggerType;
    /**
     * @return Evaluation operation for rule - &#39;Equal&#39;, &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    private final String operator;
    /**
     * @return The threshold of the metric trigger.    Values must be between 0 and 10000 inclusive.
     * 
     */
    private final Double threshold;

    @CustomType.Constructor
    private ScheduledQueryRulesAlertTriggerMetricTrigger(
        @CustomType.Parameter("metricColumn") String metricColumn,
        @CustomType.Parameter("metricTriggerType") String metricTriggerType,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("threshold") Double threshold) {
        this.metricColumn = metricColumn;
        this.metricTriggerType = metricTriggerType;
        this.operator = operator;
        this.threshold = threshold;
    }

    /**
     * @return Evaluation of metric on a particular column.
     * 
     */
    public String metricColumn() {
        return this.metricColumn;
    }
    /**
     * @return Metric Trigger Type - &#39;Consecutive&#39; or &#39;Total&#39;.
     * 
     */
    public String metricTriggerType() {
        return this.metricTriggerType;
    }
    /**
     * @return Evaluation operation for rule - &#39;Equal&#39;, &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The threshold of the metric trigger.    Values must be between 0 and 10000 inclusive.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryRulesAlertTriggerMetricTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricColumn;
        private String metricTriggerType;
        private String operator;
        private Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryRulesAlertTriggerMetricTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricColumn = defaults.metricColumn;
    	      this.metricTriggerType = defaults.metricTriggerType;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
        }

        public Builder metricColumn(String metricColumn) {
            this.metricColumn = Objects.requireNonNull(metricColumn);
            return this;
        }
        public Builder metricTriggerType(String metricTriggerType) {
            this.metricTriggerType = Objects.requireNonNull(metricTriggerType);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }        public ScheduledQueryRulesAlertTriggerMetricTrigger build() {
            return new ScheduledQueryRulesAlertTriggerMetricTrigger(metricColumn, metricTriggerType, operator, threshold);
        }
    }
}