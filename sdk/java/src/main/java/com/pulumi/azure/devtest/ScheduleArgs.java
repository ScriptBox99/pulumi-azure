// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest;

import com.pulumi.azure.devtest.inputs.ScheduleDailyRecurrenceArgs;
import com.pulumi.azure.devtest.inputs.ScheduleHourlyRecurrenceArgs;
import com.pulumi.azure.devtest.inputs.ScheduleNotificationSettingsArgs;
import com.pulumi.azure.devtest.inputs.ScheduleWeeklyRecurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    @Import(name="dailyRecurrence")
    private @Nullable Output<ScheduleDailyRecurrenceArgs> dailyRecurrence;

    public Optional<Output<ScheduleDailyRecurrenceArgs>> dailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
    }

    @Import(name="hourlyRecurrence")
    private @Nullable Output<ScheduleHourlyRecurrenceArgs> hourlyRecurrence;

    public Optional<Output<ScheduleHourlyRecurrenceArgs>> hourlyRecurrence() {
        return Optional.ofNullable(this.hourlyRecurrence);
    }

    /**
     * The name of the dev test lab. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="labName", required=true)
    private Output<String> labName;

    /**
     * @return The name of the dev test lab. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The location where the schedule is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the schedule is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the dev test lab schedule. Valid value for name depends on the `task_type`. For instance for task_type `LabVmsStartupTask` the name needs to be `LabVmAutoStart`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the dev test lab schedule. Valid value for name depends on the `task_type`. For instance for task_type `LabVmsStartupTask` the name needs to be `LabVmAutoStart`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="notificationSettings", required=true)
    private Output<ScheduleNotificationSettingsArgs> notificationSettings;

    public Output<ScheduleNotificationSettingsArgs> notificationSettings() {
        return this.notificationSettings;
    }

    /**
     * The name of the resource group in which to create the dev test lab schedule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the dev test lab schedule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The status of this schedule. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of this schedule. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The task type of the schedule. Possible values include `LabVmsShutdownTask` and `LabVmAutoStart`.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return The task type of the schedule. Possible values include `LabVmsShutdownTask` and `LabVmAutoStart`.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Import(name="timeZoneId", required=true)
    private Output<String> timeZoneId;

    /**
     * @return The time zone ID (e.g. Pacific Standard time).
     * 
     */
    public Output<String> timeZoneId() {
        return this.timeZoneId;
    }

    @Import(name="weeklyRecurrence")
    private @Nullable Output<ScheduleWeeklyRecurrenceArgs> weeklyRecurrence;

    public Optional<Output<ScheduleWeeklyRecurrenceArgs>> weeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    private ScheduleArgs() {}

    private ScheduleArgs(ScheduleArgs $) {
        this.dailyRecurrence = $.dailyRecurrence;
        this.hourlyRecurrence = $.hourlyRecurrence;
        this.labName = $.labName;
        this.location = $.location;
        this.name = $.name;
        this.notificationSettings = $.notificationSettings;
        this.resourceGroupName = $.resourceGroupName;
        this.status = $.status;
        this.tags = $.tags;
        this.taskType = $.taskType;
        this.timeZoneId = $.timeZoneId;
        this.weeklyRecurrence = $.weeklyRecurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleArgs $;

        public Builder() {
            $ = new ScheduleArgs();
        }

        public Builder(ScheduleArgs defaults) {
            $ = new ScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder dailyRecurrence(@Nullable Output<ScheduleDailyRecurrenceArgs> dailyRecurrence) {
            $.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder dailyRecurrence(ScheduleDailyRecurrenceArgs dailyRecurrence) {
            return dailyRecurrence(Output.of(dailyRecurrence));
        }

        public Builder hourlyRecurrence(@Nullable Output<ScheduleHourlyRecurrenceArgs> hourlyRecurrence) {
            $.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder hourlyRecurrence(ScheduleHourlyRecurrenceArgs hourlyRecurrence) {
            return hourlyRecurrence(Output.of(hourlyRecurrence));
        }

        /**
         * @param labName The name of the dev test lab. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder labName(Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the dev test lab. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param location The location where the schedule is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the schedule is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the dev test lab schedule. Valid value for name depends on the `task_type`. For instance for task_type `LabVmsStartupTask` the name needs to be `LabVmAutoStart`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the dev test lab schedule. Valid value for name depends on the `task_type`. For instance for task_type `LabVmsStartupTask` the name needs to be `LabVmAutoStart`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notificationSettings(Output<ScheduleNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        public Builder notificationSettings(ScheduleNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the dev test lab schedule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the dev test lab schedule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param status The status of this schedule. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of this schedule. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param taskType The task type of the schedule. Possible values include `LabVmsShutdownTask` and `LabVmAutoStart`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType The task type of the schedule. Possible values include `LabVmsShutdownTask` and `LabVmAutoStart`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        /**
         * @param timeZoneId The time zone ID (e.g. Pacific Standard time).
         * 
         * @return builder
         * 
         */
        public Builder timeZoneId(Output<String> timeZoneId) {
            $.timeZoneId = timeZoneId;
            return this;
        }

        /**
         * @param timeZoneId The time zone ID (e.g. Pacific Standard time).
         * 
         * @return builder
         * 
         */
        public Builder timeZoneId(String timeZoneId) {
            return timeZoneId(Output.of(timeZoneId));
        }

        public Builder weeklyRecurrence(@Nullable Output<ScheduleWeeklyRecurrenceArgs> weeklyRecurrence) {
            $.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        public Builder weeklyRecurrence(ScheduleWeeklyRecurrenceArgs weeklyRecurrence) {
            return weeklyRecurrence(Output.of(weeklyRecurrence));
        }

        public ScheduleArgs build() {
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.notificationSettings = Objects.requireNonNull($.notificationSettings, "expected parameter 'notificationSettings' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            $.timeZoneId = Objects.requireNonNull($.timeZoneId, "expected parameter 'timeZoneId' to be non-null");
            return $;
        }
    }

}