// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.DataCollectionRuleDataSourcesExtension;
import com.pulumi.azure.monitoring.outputs.DataCollectionRuleDataSourcesPerformanceCounter;
import com.pulumi.azure.monitoring.outputs.DataCollectionRuleDataSourcesSyslog;
import com.pulumi.azure.monitoring.outputs.DataCollectionRuleDataSourcesWindowsEventLog;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataCollectionRuleDataSources {
    /**
     * @return One or more `extension` blocks as defined below.
     * 
     */
    private final @Nullable List<DataCollectionRuleDataSourcesExtension> extensions;
    /**
     * @return One or more `performance_counter` blocks as defined below.
     * 
     */
    private final @Nullable List<DataCollectionRuleDataSourcesPerformanceCounter> performanceCounters;
    /**
     * @return One or more `syslog` blocks as defined below.
     * 
     */
    private final @Nullable List<DataCollectionRuleDataSourcesSyslog> syslogs;
    /**
     * @return One or more `windows_event_log` blocks as defined below.
     * 
     */
    private final @Nullable List<DataCollectionRuleDataSourcesWindowsEventLog> windowsEventLogs;

    @CustomType.Constructor
    private DataCollectionRuleDataSources(
        @CustomType.Parameter("extensions") @Nullable List<DataCollectionRuleDataSourcesExtension> extensions,
        @CustomType.Parameter("performanceCounters") @Nullable List<DataCollectionRuleDataSourcesPerformanceCounter> performanceCounters,
        @CustomType.Parameter("syslogs") @Nullable List<DataCollectionRuleDataSourcesSyslog> syslogs,
        @CustomType.Parameter("windowsEventLogs") @Nullable List<DataCollectionRuleDataSourcesWindowsEventLog> windowsEventLogs) {
        this.extensions = extensions;
        this.performanceCounters = performanceCounters;
        this.syslogs = syslogs;
        this.windowsEventLogs = windowsEventLogs;
    }

    /**
     * @return One or more `extension` blocks as defined below.
     * 
     */
    public List<DataCollectionRuleDataSourcesExtension> extensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }
    /**
     * @return One or more `performance_counter` blocks as defined below.
     * 
     */
    public List<DataCollectionRuleDataSourcesPerformanceCounter> performanceCounters() {
        return this.performanceCounters == null ? List.of() : this.performanceCounters;
    }
    /**
     * @return One or more `syslog` blocks as defined below.
     * 
     */
    public List<DataCollectionRuleDataSourcesSyslog> syslogs() {
        return this.syslogs == null ? List.of() : this.syslogs;
    }
    /**
     * @return One or more `windows_event_log` blocks as defined below.
     * 
     */
    public List<DataCollectionRuleDataSourcesWindowsEventLog> windowsEventLogs() {
        return this.windowsEventLogs == null ? List.of() : this.windowsEventLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDataSources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataCollectionRuleDataSourcesExtension> extensions;
        private @Nullable List<DataCollectionRuleDataSourcesPerformanceCounter> performanceCounters;
        private @Nullable List<DataCollectionRuleDataSourcesSyslog> syslogs;
        private @Nullable List<DataCollectionRuleDataSourcesWindowsEventLog> windowsEventLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleDataSources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.performanceCounters = defaults.performanceCounters;
    	      this.syslogs = defaults.syslogs;
    	      this.windowsEventLogs = defaults.windowsEventLogs;
        }

        public Builder extensions(@Nullable List<DataCollectionRuleDataSourcesExtension> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(DataCollectionRuleDataSourcesExtension... extensions) {
            return extensions(List.of(extensions));
        }
        public Builder performanceCounters(@Nullable List<DataCollectionRuleDataSourcesPerformanceCounter> performanceCounters) {
            this.performanceCounters = performanceCounters;
            return this;
        }
        public Builder performanceCounters(DataCollectionRuleDataSourcesPerformanceCounter... performanceCounters) {
            return performanceCounters(List.of(performanceCounters));
        }
        public Builder syslogs(@Nullable List<DataCollectionRuleDataSourcesSyslog> syslogs) {
            this.syslogs = syslogs;
            return this;
        }
        public Builder syslogs(DataCollectionRuleDataSourcesSyslog... syslogs) {
            return syslogs(List.of(syslogs));
        }
        public Builder windowsEventLogs(@Nullable List<DataCollectionRuleDataSourcesWindowsEventLog> windowsEventLogs) {
            this.windowsEventLogs = windowsEventLogs;
            return this;
        }
        public Builder windowsEventLogs(DataCollectionRuleDataSourcesWindowsEventLog... windowsEventLogs) {
            return windowsEventLogs(List.of(windowsEventLogs));
        }        public DataCollectionRuleDataSources build() {
            return new DataCollectionRuleDataSources(extensions, performanceCounters, syslogs, windowsEventLogs);
        }
    }
}