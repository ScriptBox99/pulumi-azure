// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobScheduleState extends com.pulumi.resources.ResourceArgs {

    public static final JobScheduleState Empty = new JobScheduleState();

    /**
     * The time at which the Stream Analytics job last produced an output.
     * 
     */
    @Import(name="lastOutputTime")
    private @Nullable Output<String> lastOutputTime;

    /**
     * @return The time at which the Stream Analytics job last produced an output.
     * 
     */
    public Optional<Output<String>> lastOutputTime() {
        return Optional.ofNullable(this.lastOutputTime);
    }

    /**
     * The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     * 
     */
    @Import(name="startMode")
    private @Nullable Output<String> startMode;

    /**
     * @return The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     * 
     */
    public Optional<Output<String>> startMode() {
        return Optional.ofNullable(this.startMode);
    }

    /**
     * The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobId")
    private @Nullable Output<String> streamAnalyticsJobId;

    /**
     * @return The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobId() {
        return Optional.ofNullable(this.streamAnalyticsJobId);
    }

    private JobScheduleState() {}

    private JobScheduleState(JobScheduleState $) {
        this.lastOutputTime = $.lastOutputTime;
        this.startMode = $.startMode;
        this.startTime = $.startTime;
        this.streamAnalyticsJobId = $.streamAnalyticsJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobScheduleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobScheduleState $;

        public Builder() {
            $ = new JobScheduleState();
        }

        public Builder(JobScheduleState defaults) {
            $ = new JobScheduleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastOutputTime The time at which the Stream Analytics job last produced an output.
         * 
         * @return builder
         * 
         */
        public Builder lastOutputTime(@Nullable Output<String> lastOutputTime) {
            $.lastOutputTime = lastOutputTime;
            return this;
        }

        /**
         * @param lastOutputTime The time at which the Stream Analytics job last produced an output.
         * 
         * @return builder
         * 
         */
        public Builder lastOutputTime(String lastOutputTime) {
            return lastOutputTime(Output.of(lastOutputTime));
        }

        /**
         * @param startMode The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
         * 
         * @return builder
         * 
         */
        public Builder startMode(@Nullable Output<String> startMode) {
            $.startMode = startMode;
            return this;
        }

        /**
         * @param startMode The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
         * 
         * @return builder
         * 
         */
        public Builder startMode(String startMode) {
            return startMode(Output.of(startMode));
        }

        /**
         * @param startTime The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(@Nullable Output<String> streamAnalyticsJobId) {
            $.streamAnalyticsJobId = streamAnalyticsJobId;
            return this;
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(String streamAnalyticsJobId) {
            return streamAnalyticsJobId(Output.of(streamAnalyticsJobId));
        }

        public JobScheduleState build() {
            return $;
        }
    }

}