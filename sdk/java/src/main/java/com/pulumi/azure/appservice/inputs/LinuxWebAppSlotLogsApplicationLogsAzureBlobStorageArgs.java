// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs Empty = new LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs();

    /**
     * The level at which to log. Possible values include `Error`, `Warning`, `Information`, `Verbose` and `Off`. **NOTE:** this field is not available for `http_logs`
     * 
     */
    @Import(name="level", required=true)
    private Output<String> level;

    /**
     * @return The level at which to log. Possible values include `Error`, `Warning`, `Information`, `Verbose` and `Off`. **NOTE:** this field is not available for `http_logs`
     * 
     */
    public Output<String> level() {
        return this.level;
    }

    /**
     * The time in days after which to remove blobs. A value of `0` means no retention.
     * 
     */
    @Import(name="retentionInDays", required=true)
    private Output<Integer> retentionInDays;

    /**
     * @return The time in days after which to remove blobs. A value of `0` means no retention.
     * 
     */
    public Output<Integer> retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * SAS url to an Azure blob container with read/write/list/delete permissions.
     * 
     */
    @Import(name="sasUrl", required=true)
    private Output<String> sasUrl;

    /**
     * @return SAS url to an Azure blob container with read/write/list/delete permissions.
     * 
     */
    public Output<String> sasUrl() {
        return this.sasUrl;
    }

    private LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs() {}

    private LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs(LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs $) {
        this.level = $.level;
        this.retentionInDays = $.retentionInDays;
        this.sasUrl = $.sasUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs $;

        public Builder() {
            $ = new LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs();
        }

        public Builder(LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs defaults) {
            $ = new LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param level The level at which to log. Possible values include `Error`, `Warning`, `Information`, `Verbose` and `Off`. **NOTE:** this field is not available for `http_logs`
         * 
         * @return builder
         * 
         */
        public Builder level(Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The level at which to log. Possible values include `Error`, `Warning`, `Information`, `Verbose` and `Off`. **NOTE:** this field is not available for `http_logs`
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param retentionInDays The time in days after which to remove blobs. A value of `0` means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays The time in days after which to remove blobs. A value of `0` means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param sasUrl SAS url to an Azure blob container with read/write/list/delete permissions.
         * 
         * @return builder
         * 
         */
        public Builder sasUrl(Output<String> sasUrl) {
            $.sasUrl = sasUrl;
            return this;
        }

        /**
         * @param sasUrl SAS url to an Azure blob container with read/write/list/delete permissions.
         * 
         * @return builder
         * 
         */
        public Builder sasUrl(String sasUrl) {
            return sasUrl(Output.of(sasUrl));
        }

        public LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs build() {
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            $.retentionInDays = Objects.requireNonNull($.retentionInDays, "expected parameter 'retentionInDays' to be non-null");
            $.sasUrl = Objects.requireNonNull($.sasUrl, "expected parameter 'sasUrl' to be non-null");
            return $;
        }
    }

}