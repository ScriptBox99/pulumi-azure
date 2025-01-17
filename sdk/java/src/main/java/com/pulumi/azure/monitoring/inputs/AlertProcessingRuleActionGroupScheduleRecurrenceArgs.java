// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertProcessingRuleActionGroupScheduleRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertProcessingRuleActionGroupScheduleRecurrenceArgs Empty = new AlertProcessingRuleActionGroupScheduleRecurrenceArgs();

    /**
     * One or more `daily` blocks as defined above.
     * 
     */
    @Import(name="dailies")
    private @Nullable Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs>> dailies;

    /**
     * @return One or more `daily` blocks as defined above.
     * 
     */
    public Optional<Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs>>> dailies() {
        return Optional.ofNullable(this.dailies);
    }

    /**
     * One or more `monthly` blocks as defined above.
     * 
     */
    @Import(name="monthlies")
    private @Nullable Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs>> monthlies;

    /**
     * @return One or more `monthly` blocks as defined above.
     * 
     */
    public Optional<Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs>>> monthlies() {
        return Optional.ofNullable(this.monthlies);
    }

    /**
     * One or more `weekly` blocks as defined below.
     * 
     */
    @Import(name="weeklies")
    private @Nullable Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs>> weeklies;

    /**
     * @return One or more `weekly` blocks as defined below.
     * 
     */
    public Optional<Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs>>> weeklies() {
        return Optional.ofNullable(this.weeklies);
    }

    private AlertProcessingRuleActionGroupScheduleRecurrenceArgs() {}

    private AlertProcessingRuleActionGroupScheduleRecurrenceArgs(AlertProcessingRuleActionGroupScheduleRecurrenceArgs $) {
        this.dailies = $.dailies;
        this.monthlies = $.monthlies;
        this.weeklies = $.weeklies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertProcessingRuleActionGroupScheduleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertProcessingRuleActionGroupScheduleRecurrenceArgs $;

        public Builder() {
            $ = new AlertProcessingRuleActionGroupScheduleRecurrenceArgs();
        }

        public Builder(AlertProcessingRuleActionGroupScheduleRecurrenceArgs defaults) {
            $ = new AlertProcessingRuleActionGroupScheduleRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dailies One or more `daily` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder dailies(@Nullable Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs>> dailies) {
            $.dailies = dailies;
            return this;
        }

        /**
         * @param dailies One or more `daily` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder dailies(List<AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs> dailies) {
            return dailies(Output.of(dailies));
        }

        /**
         * @param dailies One or more `daily` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder dailies(AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs... dailies) {
            return dailies(List.of(dailies));
        }

        /**
         * @param monthlies One or more `monthly` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder monthlies(@Nullable Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs>> monthlies) {
            $.monthlies = monthlies;
            return this;
        }

        /**
         * @param monthlies One or more `monthly` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder monthlies(List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs> monthlies) {
            return monthlies(Output.of(monthlies));
        }

        /**
         * @param monthlies One or more `monthly` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder monthlies(AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs... monthlies) {
            return monthlies(List.of(monthlies));
        }

        /**
         * @param weeklies One or more `weekly` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder weeklies(@Nullable Output<List<AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs>> weeklies) {
            $.weeklies = weeklies;
            return this;
        }

        /**
         * @param weeklies One or more `weekly` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder weeklies(List<AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs> weeklies) {
            return weeklies(Output.of(weeklies));
        }

        /**
         * @param weeklies One or more `weekly` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder weeklies(AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs... weeklies) {
            return weeklies(List.of(weeklies));
        }

        public AlertProcessingRuleActionGroupScheduleRecurrenceArgs build() {
            return $;
        }
    }

}
