// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs Empty = new PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs();

    /**
     * The number of monthly backups to keep. Must be between `1` and `1188`.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The number of monthly backups to keep. Must be between `1` and `1188`.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * The retention schedule format type for monthly retention policy. Possible values are `Daily` and `Weekly`.
     * 
     */
    @Import(name="formatType", required=true)
    private Output<String> formatType;

    /**
     * @return The retention schedule format type for monthly retention policy. Possible values are `Daily` and `Weekly`.
     * 
     */
    public Output<String> formatType() {
        return this.formatType;
    }

    /**
     * The monthday backups to retain. Possible values are between `0` and `28`.
     * 
     */
    @Import(name="monthdays")
    private @Nullable Output<List<Integer>> monthdays;

    /**
     * @return The monthday backups to retain. Possible values are between `0` and `28`.
     * 
     */
    public Optional<Output<List<Integer>>> monthdays() {
        return Optional.ofNullable(this.monthdays);
    }

    /**
     * The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
     * 
     */
    @Import(name="weekdays")
    private @Nullable Output<List<String>> weekdays;

    /**
     * @return The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
     * 
     */
    public Optional<Output<List<String>>> weekdays() {
        return Optional.ofNullable(this.weekdays);
    }

    /**
     * The weeks of the month to retain backups of. Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`.
     * 
     */
    @Import(name="weeks")
    private @Nullable Output<List<String>> weeks;

    /**
     * @return The weeks of the month to retain backups of. Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`.
     * 
     */
    public Optional<Output<List<String>>> weeks() {
        return Optional.ofNullable(this.weeks);
    }

    private PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs() {}

    private PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs(PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs $) {
        this.count = $.count;
        this.formatType = $.formatType;
        this.monthdays = $.monthdays;
        this.weekdays = $.weekdays;
        this.weeks = $.weeks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs $;

        public Builder() {
            $ = new PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs();
        }

        public Builder(PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs defaults) {
            $ = new PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of monthly backups to keep. Must be between `1` and `1188`.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of monthly backups to keep. Must be between `1` and `1188`.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param formatType The retention schedule format type for monthly retention policy. Possible values are `Daily` and `Weekly`.
         * 
         * @return builder
         * 
         */
        public Builder formatType(Output<String> formatType) {
            $.formatType = formatType;
            return this;
        }

        /**
         * @param formatType The retention schedule format type for monthly retention policy. Possible values are `Daily` and `Weekly`.
         * 
         * @return builder
         * 
         */
        public Builder formatType(String formatType) {
            return formatType(Output.of(formatType));
        }

        /**
         * @param monthdays The monthday backups to retain. Possible values are between `0` and `28`.
         * 
         * @return builder
         * 
         */
        public Builder monthdays(@Nullable Output<List<Integer>> monthdays) {
            $.monthdays = monthdays;
            return this;
        }

        /**
         * @param monthdays The monthday backups to retain. Possible values are between `0` and `28`.
         * 
         * @return builder
         * 
         */
        public Builder monthdays(List<Integer> monthdays) {
            return monthdays(Output.of(monthdays));
        }

        /**
         * @param monthdays The monthday backups to retain. Possible values are between `0` and `28`.
         * 
         * @return builder
         * 
         */
        public Builder monthdays(Integer... monthdays) {
            return monthdays(List.of(monthdays));
        }

        /**
         * @param weekdays The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(@Nullable Output<List<String>> weekdays) {
            $.weekdays = weekdays;
            return this;
        }

        /**
         * @param weekdays The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(List<String> weekdays) {
            return weekdays(Output.of(weekdays));
        }

        /**
         * @param weekdays The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(String... weekdays) {
            return weekdays(List.of(weekdays));
        }

        /**
         * @param weeks The weeks of the month to retain backups of. Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`.
         * 
         * @return builder
         * 
         */
        public Builder weeks(@Nullable Output<List<String>> weeks) {
            $.weeks = weeks;
            return this;
        }

        /**
         * @param weeks The weeks of the month to retain backups of. Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`.
         * 
         * @return builder
         * 
         */
        public Builder weeks(List<String> weeks) {
            return weeks(Output.of(weeks));
        }

        /**
         * @param weeks The weeks of the month to retain backups of. Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`.
         * 
         * @return builder
         * 
         */
        public Builder weeks(String... weeks) {
            return weeks(List.of(weeks));
        }

        public PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.formatType = Objects.requireNonNull($.formatType, "expected parameter 'formatType' to be non-null");
            return $;
        }
    }

}
