// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.DiagnosticFrontendRequestDataMasking;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiagnosticFrontendRequest {
    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    private final @Nullable Integer bodyBytes;
    private final @Nullable DiagnosticFrontendRequestDataMasking dataMasking;
    /**
     * @return Specifies a list of headers to log.
     * 
     */
    private final @Nullable List<String> headersToLogs;

    @CustomType.Constructor
    private DiagnosticFrontendRequest(
        @CustomType.Parameter("bodyBytes") @Nullable Integer bodyBytes,
        @CustomType.Parameter("dataMasking") @Nullable DiagnosticFrontendRequestDataMasking dataMasking,
        @CustomType.Parameter("headersToLogs") @Nullable List<String> headersToLogs) {
        this.bodyBytes = bodyBytes;
        this.dataMasking = dataMasking;
        this.headersToLogs = headersToLogs;
    }

    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    public Optional<Integer> bodyBytes() {
        return Optional.ofNullable(this.bodyBytes);
    }
    public Optional<DiagnosticFrontendRequestDataMasking> dataMasking() {
        return Optional.ofNullable(this.dataMasking);
    }
    /**
     * @return Specifies a list of headers to log.
     * 
     */
    public List<String> headersToLogs() {
        return this.headersToLogs == null ? List.of() : this.headersToLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticFrontendRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bodyBytes;
        private @Nullable DiagnosticFrontendRequestDataMasking dataMasking;
        private @Nullable List<String> headersToLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticFrontendRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyBytes = defaults.bodyBytes;
    	      this.dataMasking = defaults.dataMasking;
    	      this.headersToLogs = defaults.headersToLogs;
        }

        public Builder bodyBytes(@Nullable Integer bodyBytes) {
            this.bodyBytes = bodyBytes;
            return this;
        }
        public Builder dataMasking(@Nullable DiagnosticFrontendRequestDataMasking dataMasking) {
            this.dataMasking = dataMasking;
            return this;
        }
        public Builder headersToLogs(@Nullable List<String> headersToLogs) {
            this.headersToLogs = headersToLogs;
            return this;
        }
        public Builder headersToLogs(String... headersToLogs) {
            return headersToLogs(List.of(headersToLogs));
        }        public DiagnosticFrontendRequest build() {
            return new DiagnosticFrontendRequest(bodyBytes, dataMasking, headersToLogs);
        }
    }
}