// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs Empty = new IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs();

    /**
     * The occurrence of the week within the month.
     * 
     */
    @Import(name="week", required=true)
    private Output<Integer> week;

    /**
     * @return The occurrence of the week within the month.
     * 
     */
    public Output<Integer> week() {
        return this.week;
    }

    /**
     * The day of the occurrence. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    @Import(name="weekday", required=true)
    private Output<String> weekday;

    /**
     * @return The day of the occurrence. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    public Output<String> weekday() {
        return this.weekday;
    }

    private IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs() {}

    private IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs(IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs $) {
        this.week = $.week;
        this.weekday = $.weekday;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs $;

        public Builder() {
            $ = new IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs();
        }

        public Builder(IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs defaults) {
            $ = new IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param week The occurrence of the week within the month.
         * 
         * @return builder
         * 
         */
        public Builder week(Output<Integer> week) {
            $.week = week;
            return this;
        }

        /**
         * @param week The occurrence of the week within the month.
         * 
         * @return builder
         * 
         */
        public Builder week(Integer week) {
            return week(Output.of(week));
        }

        /**
         * @param weekday The day of the occurrence. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekday(Output<String> weekday) {
            $.weekday = weekday;
            return this;
        }

        /**
         * @param weekday The day of the occurrence. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekday(String weekday) {
            return weekday(Output.of(weekday));
        }

        public IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs build() {
            $.week = Objects.requireNonNull($.week, "expected parameter 'week' to be non-null");
            $.weekday = Objects.requireNonNull($.weekday, "expected parameter 'weekday' to be non-null");
            return $;
        }
    }

}