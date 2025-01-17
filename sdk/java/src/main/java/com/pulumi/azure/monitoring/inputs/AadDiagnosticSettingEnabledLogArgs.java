// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogRetentionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AadDiagnosticSettingEnabledLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final AadDiagnosticSettingEnabledLogArgs Empty = new AadDiagnosticSettingEnabledLogArgs();

    /**
     * The log category for the Azure Active Directory Diagnostic.
     * 
     */
    @Import(name="category", required=true)
    private Output<String> category;

    /**
     * @return The log category for the Azure Active Directory Diagnostic.
     * 
     */
    public Output<String> category() {
        return this.category;
    }

    /**
     * A `retention_policy` block as defined below.
     * 
     */
    @Import(name="retentionPolicy", required=true)
    private Output<AadDiagnosticSettingEnabledLogRetentionPolicyArgs> retentionPolicy;

    /**
     * @return A `retention_policy` block as defined below.
     * 
     */
    public Output<AadDiagnosticSettingEnabledLogRetentionPolicyArgs> retentionPolicy() {
        return this.retentionPolicy;
    }

    private AadDiagnosticSettingEnabledLogArgs() {}

    private AadDiagnosticSettingEnabledLogArgs(AadDiagnosticSettingEnabledLogArgs $) {
        this.category = $.category;
        this.retentionPolicy = $.retentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AadDiagnosticSettingEnabledLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AadDiagnosticSettingEnabledLogArgs $;

        public Builder() {
            $ = new AadDiagnosticSettingEnabledLogArgs();
        }

        public Builder(AadDiagnosticSettingEnabledLogArgs defaults) {
            $ = new AadDiagnosticSettingEnabledLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The log category for the Azure Active Directory Diagnostic.
         * 
         * @return builder
         * 
         */
        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The log category for the Azure Active Directory Diagnostic.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param retentionPolicy A `retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(Output<AadDiagnosticSettingEnabledLogRetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy A `retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(AadDiagnosticSettingEnabledLogRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        public AadDiagnosticSettingEnabledLogArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.retentionPolicy = Objects.requireNonNull($.retentionPolicy, "expected parameter 'retentionPolicy' to be non-null");
            return $;
        }
    }

}
