// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode {
    /**
     * @return The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
     * 
     */
    private final Integer count;
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    private final String interval;
    /**
     * @return The path to which this rule status code applies.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
     * 
     */
    private final String statusCodeRange;
    /**
     * @return The Request Sub Status of the Status Code.
     * 
     */
    private final @Nullable Integer subStatus;
    /**
     * @return The Win32 Status Code of the Request.
     * 
     */
    private final @Nullable String win32Status;

    @CustomType.Constructor
    private LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("interval") String interval,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("statusCodeRange") String statusCodeRange,
        @CustomType.Parameter("subStatus") @Nullable Integer subStatus,
        @CustomType.Parameter("win32Status") @Nullable String win32Status) {
        this.count = count;
        this.interval = interval;
        this.path = path;
        this.statusCodeRange = statusCodeRange;
        this.subStatus = subStatus;
        this.win32Status = win32Status;
    }

    /**
     * @return The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The path to which this rule status code applies.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
     * 
     */
    public String statusCodeRange() {
        return this.statusCodeRange;
    }
    /**
     * @return The Request Sub Status of the Status Code.
     * 
     */
    public Optional<Integer> subStatus() {
        return Optional.ofNullable(this.subStatus);
    }
    /**
     * @return The Win32 Status Code of the Request.
     * 
     */
    public Optional<String> win32Status() {
        return Optional.ofNullable(this.win32Status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String interval;
        private @Nullable String path;
        private String statusCodeRange;
        private @Nullable Integer subStatus;
        private @Nullable String win32Status;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.statusCodeRange = defaults.statusCodeRange;
    	      this.subStatus = defaults.subStatus;
    	      this.win32Status = defaults.win32Status;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder statusCodeRange(String statusCodeRange) {
            this.statusCodeRange = Objects.requireNonNull(statusCodeRange);
            return this;
        }
        public Builder subStatus(@Nullable Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Builder win32Status(@Nullable String win32Status) {
            this.win32Status = win32Status;
            return this;
        }        public LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode build() {
            return new LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode(count, interval, path, statusCodeRange, subStatus, win32Status);
        }
    }
}