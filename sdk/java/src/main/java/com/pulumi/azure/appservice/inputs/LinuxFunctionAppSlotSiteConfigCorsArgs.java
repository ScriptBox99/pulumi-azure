// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxFunctionAppSlotSiteConfigCorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxFunctionAppSlotSiteConfigCorsArgs Empty = new LinuxFunctionAppSlotSiteConfigCorsArgs();

    /**
     * an `allowed_origins` block as detailed below.
     * 
     */
    @Import(name="allowedOrigins", required=true)
    private Output<List<String>> allowedOrigins;

    /**
     * @return an `allowed_origins` block as detailed below.
     * 
     */
    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Are credentials allowed in CORS requests? Defaults to `false`.
     * 
     */
    @Import(name="supportCredentials")
    private @Nullable Output<Boolean> supportCredentials;

    /**
     * @return Are credentials allowed in CORS requests? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    private LinuxFunctionAppSlotSiteConfigCorsArgs() {}

    private LinuxFunctionAppSlotSiteConfigCorsArgs(LinuxFunctionAppSlotSiteConfigCorsArgs $) {
        this.allowedOrigins = $.allowedOrigins;
        this.supportCredentials = $.supportCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxFunctionAppSlotSiteConfigCorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxFunctionAppSlotSiteConfigCorsArgs $;

        public Builder() {
            $ = new LinuxFunctionAppSlotSiteConfigCorsArgs();
        }

        public Builder(LinuxFunctionAppSlotSiteConfigCorsArgs defaults) {
            $ = new LinuxFunctionAppSlotSiteConfigCorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedOrigins an `allowed_origins` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins an `allowed_origins` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            return allowedOrigins(Output.of(allowedOrigins));
        }

        /**
         * @param allowedOrigins an `allowed_origins` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param supportCredentials Are credentials allowed in CORS requests? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder supportCredentials(@Nullable Output<Boolean> supportCredentials) {
            $.supportCredentials = supportCredentials;
            return this;
        }

        /**
         * @param supportCredentials Are credentials allowed in CORS requests? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder supportCredentials(Boolean supportCredentials) {
            return supportCredentials(Output.of(supportCredentials));
        }

        public LinuxFunctionAppSlotSiteConfigCorsArgs build() {
            $.allowedOrigins = Objects.requireNonNull($.allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
            return $;
        }
    }

}