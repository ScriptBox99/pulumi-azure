// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotLogsApplicationLogsAzureBlobStorage;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSlotLogsApplicationLogs {
    /**
     * @return An `azure_blob_storage` block as defined below.
     * 
     */
    private final @Nullable LinuxWebAppSlotLogsApplicationLogsAzureBlobStorage azureBlobStorage;
    /**
     * @return Log level. Possible values include: `Verbose`, `Information`, `Warning`, and `Error`.
     * 
     */
    private final String fileSystemLevel;

    @CustomType.Constructor
    private LinuxWebAppSlotLogsApplicationLogs(
        @CustomType.Parameter("azureBlobStorage") @Nullable LinuxWebAppSlotLogsApplicationLogsAzureBlobStorage azureBlobStorage,
        @CustomType.Parameter("fileSystemLevel") String fileSystemLevel) {
        this.azureBlobStorage = azureBlobStorage;
        this.fileSystemLevel = fileSystemLevel;
    }

    /**
     * @return An `azure_blob_storage` block as defined below.
     * 
     */
    public Optional<LinuxWebAppSlotLogsApplicationLogsAzureBlobStorage> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * @return Log level. Possible values include: `Verbose`, `Information`, `Warning`, and `Error`.
     * 
     */
    public String fileSystemLevel() {
        return this.fileSystemLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSlotLogsApplicationLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxWebAppSlotLogsApplicationLogsAzureBlobStorage azureBlobStorage;
        private String fileSystemLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppSlotLogsApplicationLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystemLevel = defaults.fileSystemLevel;
        }

        public Builder azureBlobStorage(@Nullable LinuxWebAppSlotLogsApplicationLogsAzureBlobStorage azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        public Builder fileSystemLevel(String fileSystemLevel) {
            this.fileSystemLevel = Objects.requireNonNull(fileSystemLevel);
            return this;
        }        public LinuxWebAppSlotLogsApplicationLogs build() {
            return new LinuxWebAppSlotLogsApplicationLogs(azureBlobStorage, fileSystemLevel);
        }
    }
}