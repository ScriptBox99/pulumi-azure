// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs Empty = new AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs();

    /**
     * The name of the dynamic property. Possible Values are `AlertLink`, `ConfidenceLevel`, `ConfidenceScore`, `ExtendedLinks`, `ProductComponentName`, `ProductName`, `ProviderName`, `RemediationSteps` and `Techniques`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the dynamic property. Possible Values are `AlertLink`, `ConfidenceLevel`, `ConfidenceScore`, `ExtendedLinks`, `ProductComponentName`, `ProductName`, `ProviderName`, `RemediationSteps` and `Techniques`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the dynamic property. Pssible Values are `Caller`, `dcount_ResourceId` and `EventSubmissionTimestamp`.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the dynamic property. Pssible Values are `Caller`, `dcount_ResourceId` and `EventSubmissionTimestamp`.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs() {}

    private AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs(AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs $;

        public Builder() {
            $ = new AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs();
        }

        public Builder(AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs defaults) {
            $ = new AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the dynamic property. Possible Values are `AlertLink`, `ConfidenceLevel`, `ConfidenceScore`, `ExtendedLinks`, `ProductComponentName`, `ProductName`, `ProviderName`, `RemediationSteps` and `Techniques`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the dynamic property. Possible Values are `AlertLink`, `ConfidenceLevel`, `ConfidenceScore`, `ExtendedLinks`, `ProductComponentName`, `ProductName`, `ProviderName`, `RemediationSteps` and `Techniques`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the dynamic property. Pssible Values are `Caller`, `dcount_ResourceId` and `EventSubmissionTimestamp`.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the dynamic property. Pssible Values are `Caller`, `dcount_ResourceId` and `EventSubmissionTimestamp`.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
