// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.azure.sentinel.outputs.AlertRuleScheduledIncidentConfigurationGrouping;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class AlertRuleScheduledIncidentConfiguration {
    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    private final Boolean createIncident;
    /**
     * @return A `grouping` block as defined below.
     * 
     */
    private final AlertRuleScheduledIncidentConfigurationGrouping grouping;

    @CustomType.Constructor
    private AlertRuleScheduledIncidentConfiguration(
        @CustomType.Parameter("createIncident") Boolean createIncident,
        @CustomType.Parameter("grouping") AlertRuleScheduledIncidentConfigurationGrouping grouping) {
        this.createIncident = createIncident;
        this.grouping = grouping;
    }

    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    public Boolean createIncident() {
        return this.createIncident;
    }
    /**
     * @return A `grouping` block as defined below.
     * 
     */
    public AlertRuleScheduledIncidentConfigurationGrouping grouping() {
        return this.grouping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleScheduledIncidentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean createIncident;
        private AlertRuleScheduledIncidentConfigurationGrouping grouping;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleScheduledIncidentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createIncident = defaults.createIncident;
    	      this.grouping = defaults.grouping;
        }

        public Builder createIncident(Boolean createIncident) {
            this.createIncident = Objects.requireNonNull(createIncident);
            return this;
        }
        public Builder grouping(AlertRuleScheduledIncidentConfigurationGrouping grouping) {
            this.grouping = Objects.requireNonNull(grouping);
            return this;
        }        public AlertRuleScheduledIncidentConfiguration build() {
            return new AlertRuleScheduledIncidentConfiguration(createIncident, grouping);
        }
    }
}