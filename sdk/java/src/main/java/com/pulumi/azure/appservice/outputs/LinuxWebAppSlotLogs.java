// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotLogsApplicationLogs;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotLogsHttpLogs;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSlotLogs {
    /**
     * @return A `application_logs` block as defined above.
     * 
     */
    private final @Nullable LinuxWebAppSlotLogsApplicationLogs applicationLogs;
    /**
     * @return Should detailed error messages be enabled.
     * 
     */
    private final @Nullable Boolean detailedErrorMessages;
    /**
     * @return Should failed request tracing be enabled.
     * 
     */
    private final @Nullable Boolean failedRequestTracing;
    /**
     * @return An `http_logs` block as defined above.
     * 
     */
    private final @Nullable LinuxWebAppSlotLogsHttpLogs httpLogs;

    @CustomType.Constructor
    private LinuxWebAppSlotLogs(
        @CustomType.Parameter("applicationLogs") @Nullable LinuxWebAppSlotLogsApplicationLogs applicationLogs,
        @CustomType.Parameter("detailedErrorMessages") @Nullable Boolean detailedErrorMessages,
        @CustomType.Parameter("failedRequestTracing") @Nullable Boolean failedRequestTracing,
        @CustomType.Parameter("httpLogs") @Nullable LinuxWebAppSlotLogsHttpLogs httpLogs) {
        this.applicationLogs = applicationLogs;
        this.detailedErrorMessages = detailedErrorMessages;
        this.failedRequestTracing = failedRequestTracing;
        this.httpLogs = httpLogs;
    }

    /**
     * @return A `application_logs` block as defined above.
     * 
     */
    public Optional<LinuxWebAppSlotLogsApplicationLogs> applicationLogs() {
        return Optional.ofNullable(this.applicationLogs);
    }
    /**
     * @return Should detailed error messages be enabled.
     * 
     */
    public Optional<Boolean> detailedErrorMessages() {
        return Optional.ofNullable(this.detailedErrorMessages);
    }
    /**
     * @return Should failed request tracing be enabled.
     * 
     */
    public Optional<Boolean> failedRequestTracing() {
        return Optional.ofNullable(this.failedRequestTracing);
    }
    /**
     * @return An `http_logs` block as defined above.
     * 
     */
    public Optional<LinuxWebAppSlotLogsHttpLogs> httpLogs() {
        return Optional.ofNullable(this.httpLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSlotLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxWebAppSlotLogsApplicationLogs applicationLogs;
        private @Nullable Boolean detailedErrorMessages;
        private @Nullable Boolean failedRequestTracing;
        private @Nullable LinuxWebAppSlotLogsHttpLogs httpLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppSlotLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationLogs = defaults.applicationLogs;
    	      this.detailedErrorMessages = defaults.detailedErrorMessages;
    	      this.failedRequestTracing = defaults.failedRequestTracing;
    	      this.httpLogs = defaults.httpLogs;
        }

        public Builder applicationLogs(@Nullable LinuxWebAppSlotLogsApplicationLogs applicationLogs) {
            this.applicationLogs = applicationLogs;
            return this;
        }
        public Builder detailedErrorMessages(@Nullable Boolean detailedErrorMessages) {
            this.detailedErrorMessages = detailedErrorMessages;
            return this;
        }
        public Builder failedRequestTracing(@Nullable Boolean failedRequestTracing) {
            this.failedRequestTracing = failedRequestTracing;
            return this;
        }
        public Builder httpLogs(@Nullable LinuxWebAppSlotLogsHttpLogs httpLogs) {
            this.httpLogs = httpLogs;
            return this;
        }        public LinuxWebAppSlotLogs build() {
            return new LinuxWebAppSlotLogs(applicationLogs, detailedErrorMessages, failedRequestTracing, httpLogs);
        }
    }
}