// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionAlertContext;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionAlertRuleId;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionDescription;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionMonitor;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionMonitorService;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionSeverity;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupConditionTargetResourceType;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionRuleActionGroupCondition {
    /**
     * @return A `alert_context` block as defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionAlertContext alertContext;
    /**
     * @return A `alert_rule_id` block as defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionAlertRuleId alertRuleId;
    /**
     * @return A `description` block as defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionDescription description;
    /**
     * @return A `monitor` block as defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionMonitor monitor;
    /**
     * @return A `monitor_service` as block defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionMonitorService monitorService;
    /**
     * @return A `severity` block as defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionSeverity severity;
    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    private final @Nullable ActionRuleActionGroupConditionTargetResourceType targetResourceType;

    @CustomType.Constructor
    private ActionRuleActionGroupCondition(
        @CustomType.Parameter("alertContext") @Nullable ActionRuleActionGroupConditionAlertContext alertContext,
        @CustomType.Parameter("alertRuleId") @Nullable ActionRuleActionGroupConditionAlertRuleId alertRuleId,
        @CustomType.Parameter("description") @Nullable ActionRuleActionGroupConditionDescription description,
        @CustomType.Parameter("monitor") @Nullable ActionRuleActionGroupConditionMonitor monitor,
        @CustomType.Parameter("monitorService") @Nullable ActionRuleActionGroupConditionMonitorService monitorService,
        @CustomType.Parameter("severity") @Nullable ActionRuleActionGroupConditionSeverity severity,
        @CustomType.Parameter("targetResourceType") @Nullable ActionRuleActionGroupConditionTargetResourceType targetResourceType) {
        this.alertContext = alertContext;
        this.alertRuleId = alertRuleId;
        this.description = description;
        this.monitor = monitor;
        this.monitorService = monitorService;
        this.severity = severity;
        this.targetResourceType = targetResourceType;
    }

    /**
     * @return A `alert_context` block as defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionAlertContext> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }
    /**
     * @return A `alert_rule_id` block as defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionAlertRuleId> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }
    /**
     * @return A `description` block as defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionDescription> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionMonitor> monitor() {
        return Optional.ofNullable(this.monitor);
    }
    /**
     * @return A `monitor_service` as block defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionMonitorService> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }
    /**
     * @return A `severity` block as defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionSeverity> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    public Optional<ActionRuleActionGroupConditionTargetResourceType> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionRuleActionGroupCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActionRuleActionGroupConditionAlertContext alertContext;
        private @Nullable ActionRuleActionGroupConditionAlertRuleId alertRuleId;
        private @Nullable ActionRuleActionGroupConditionDescription description;
        private @Nullable ActionRuleActionGroupConditionMonitor monitor;
        private @Nullable ActionRuleActionGroupConditionMonitorService monitorService;
        private @Nullable ActionRuleActionGroupConditionSeverity severity;
        private @Nullable ActionRuleActionGroupConditionTargetResourceType targetResourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionRuleActionGroupCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContext = defaults.alertContext;
    	      this.alertRuleId = defaults.alertRuleId;
    	      this.description = defaults.description;
    	      this.monitor = defaults.monitor;
    	      this.monitorService = defaults.monitorService;
    	      this.severity = defaults.severity;
    	      this.targetResourceType = defaults.targetResourceType;
        }

        public Builder alertContext(@Nullable ActionRuleActionGroupConditionAlertContext alertContext) {
            this.alertContext = alertContext;
            return this;
        }
        public Builder alertRuleId(@Nullable ActionRuleActionGroupConditionAlertRuleId alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }
        public Builder description(@Nullable ActionRuleActionGroupConditionDescription description) {
            this.description = description;
            return this;
        }
        public Builder monitor(@Nullable ActionRuleActionGroupConditionMonitor monitor) {
            this.monitor = monitor;
            return this;
        }
        public Builder monitorService(@Nullable ActionRuleActionGroupConditionMonitorService monitorService) {
            this.monitorService = monitorService;
            return this;
        }
        public Builder severity(@Nullable ActionRuleActionGroupConditionSeverity severity) {
            this.severity = severity;
            return this;
        }
        public Builder targetResourceType(@Nullable ActionRuleActionGroupConditionTargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }        public ActionRuleActionGroupCondition build() {
            return new ActionRuleActionGroupCondition(alertContext, alertRuleId, description, monitor, monitorService, severity, targetResourceType);
        }
    }
}