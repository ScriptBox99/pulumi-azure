// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionRuleDataSourcesLogFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDataSourcesLogFileArgs Empty = new DataCollectionRuleDataSourcesLogFileArgs();

    /**
     * Specifies a list of file patterns where the log files are located. For example, `C:\\JavaLogs\\*.log`.
     * 
     */
    @Import(name="filePatterns", required=true)
    private Output<List<String>> filePatterns;

    /**
     * @return Specifies a list of file patterns where the log files are located. For example, `C:\\JavaLogs\\*.log`.
     * 
     */
    public Output<List<String>> filePatterns() {
        return this.filePatterns;
    }

    /**
     * The data format of the log files. possible value is `text`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The data format of the log files. possible value is `text`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A `settings` block as defined below.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<DataCollectionRuleDataSourcesLogFileSettingsArgs> settings;

    /**
     * @return A `settings` block as defined below.
     * 
     */
    public Optional<Output<DataCollectionRuleDataSourcesLogFileSettingsArgs>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value should be custom stream names.
     * 
     */
    @Import(name="streams", required=true)
    private Output<List<String>> streams;

    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value should be custom stream names.
     * 
     */
    public Output<List<String>> streams() {
        return this.streams;
    }

    private DataCollectionRuleDataSourcesLogFileArgs() {}

    private DataCollectionRuleDataSourcesLogFileArgs(DataCollectionRuleDataSourcesLogFileArgs $) {
        this.filePatterns = $.filePatterns;
        this.format = $.format;
        this.name = $.name;
        this.settings = $.settings;
        this.streams = $.streams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleDataSourcesLogFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleDataSourcesLogFileArgs $;

        public Builder() {
            $ = new DataCollectionRuleDataSourcesLogFileArgs();
        }

        public Builder(DataCollectionRuleDataSourcesLogFileArgs defaults) {
            $ = new DataCollectionRuleDataSourcesLogFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePatterns Specifies a list of file patterns where the log files are located. For example, `C:\\JavaLogs\\*.log`.
         * 
         * @return builder
         * 
         */
        public Builder filePatterns(Output<List<String>> filePatterns) {
            $.filePatterns = filePatterns;
            return this;
        }

        /**
         * @param filePatterns Specifies a list of file patterns where the log files are located. For example, `C:\\JavaLogs\\*.log`.
         * 
         * @return builder
         * 
         */
        public Builder filePatterns(List<String> filePatterns) {
            return filePatterns(Output.of(filePatterns));
        }

        /**
         * @param filePatterns Specifies a list of file patterns where the log files are located. For example, `C:\\JavaLogs\\*.log`.
         * 
         * @return builder
         * 
         */
        public Builder filePatterns(String... filePatterns) {
            return filePatterns(List.of(filePatterns));
        }

        /**
         * @param format The data format of the log files. possible value is `text`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The data format of the log files. possible value is `text`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param name The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param settings A `settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<DataCollectionRuleDataSourcesLogFileSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings A `settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder settings(DataCollectionRuleDataSourcesLogFileSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param streams Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value should be custom stream names.
         * 
         * @return builder
         * 
         */
        public Builder streams(Output<List<String>> streams) {
            $.streams = streams;
            return this;
        }

        /**
         * @param streams Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value should be custom stream names.
         * 
         * @return builder
         * 
         */
        public Builder streams(List<String> streams) {
            return streams(Output.of(streams));
        }

        /**
         * @param streams Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value should be custom stream names.
         * 
         * @return builder
         * 
         */
        public Builder streams(String... streams) {
            return streams(List.of(streams));
        }

        public DataCollectionRuleDataSourcesLogFileArgs build() {
            $.filePatterns = Objects.requireNonNull($.filePatterns, "expected parameter 'filePatterns' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.streams = Objects.requireNonNull($.streams, "expected parameter 'streams' to be non-null");
            return $;
        }
    }

}