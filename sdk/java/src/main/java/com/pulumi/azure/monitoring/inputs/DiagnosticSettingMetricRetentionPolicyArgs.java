// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiagnosticSettingMetricRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticSettingMetricRetentionPolicyArgs Empty = new DiagnosticSettingMetricRetentionPolicyArgs();

    /**
     * The number of days for which this Retention Policy should apply.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return The number of days for which this Retention Policy should apply.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * Is this Retention Policy enabled?
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Is this Retention Policy enabled?
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private DiagnosticSettingMetricRetentionPolicyArgs() {}

    private DiagnosticSettingMetricRetentionPolicyArgs(DiagnosticSettingMetricRetentionPolicyArgs $) {
        this.days = $.days;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticSettingMetricRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticSettingMetricRetentionPolicyArgs $;

        public Builder() {
            $ = new DiagnosticSettingMetricRetentionPolicyArgs();
        }

        public Builder(DiagnosticSettingMetricRetentionPolicyArgs defaults) {
            $ = new DiagnosticSettingMetricRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days The number of days for which this Retention Policy should apply.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days The number of days for which this Retention Policy should apply.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param enabled Is this Retention Policy enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is this Retention Policy enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DiagnosticSettingMetricRetentionPolicyArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}