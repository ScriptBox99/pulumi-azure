// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorPlanArgs Empty = new MonitorPlanArgs();

    /**
     * Specifies the billing cycles. Possible values are `MONTHLY`, `WEEKLY` and `YEARLY`. Defaults to `MONTHLY`. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    @Import(name="billingCycle")
    private @Nullable Output<String> billingCycle;

    /**
     * @return Specifies the billing cycles. Possible values are `MONTHLY`, `WEEKLY` and `YEARLY`. Defaults to `MONTHLY`. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    public Optional<Output<String>> billingCycle() {
        return Optional.ofNullable(this.billingCycle);
    }

    /**
     * Specifies the date when plan was applied. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    @Import(name="effectiveDate", required=true)
    private Output<String> effectiveDate;

    /**
     * @return Specifies the date when plan was applied. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    public Output<String> effectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Specifies the plan id published by NewRelic. The only possible value is `newrelic-pay-as-you-go-free-live`. Defaults to `newrelic-pay-as-you-go-free-live`. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    /**
     * @return Specifies the plan id published by NewRelic. The only possible value is `newrelic-pay-as-you-go-free-live`. Defaults to `newrelic-pay-as-you-go-free-live`. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * Specifies the usage type. Possible values are `COMMITTED` and `PAYG`. Defaults to `PAYG`. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    @Import(name="usageType")
    private @Nullable Output<String> usageType;

    /**
     * @return Specifies the usage type. Possible values are `COMMITTED` and `PAYG`. Defaults to `PAYG`. Changing this forces a new Azure Native New Relic Monitor to be created.
     * 
     */
    public Optional<Output<String>> usageType() {
        return Optional.ofNullable(this.usageType);
    }

    private MonitorPlanArgs() {}

    private MonitorPlanArgs(MonitorPlanArgs $) {
        this.billingCycle = $.billingCycle;
        this.effectiveDate = $.effectiveDate;
        this.planId = $.planId;
        this.usageType = $.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorPlanArgs $;

        public Builder() {
            $ = new MonitorPlanArgs();
        }

        public Builder(MonitorPlanArgs defaults) {
            $ = new MonitorPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingCycle Specifies the billing cycles. Possible values are `MONTHLY`, `WEEKLY` and `YEARLY`. Defaults to `MONTHLY`. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder billingCycle(@Nullable Output<String> billingCycle) {
            $.billingCycle = billingCycle;
            return this;
        }

        /**
         * @param billingCycle Specifies the billing cycles. Possible values are `MONTHLY`, `WEEKLY` and `YEARLY`. Defaults to `MONTHLY`. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder billingCycle(String billingCycle) {
            return billingCycle(Output.of(billingCycle));
        }

        /**
         * @param effectiveDate Specifies the date when plan was applied. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder effectiveDate(Output<String> effectiveDate) {
            $.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * @param effectiveDate Specifies the date when plan was applied. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder effectiveDate(String effectiveDate) {
            return effectiveDate(Output.of(effectiveDate));
        }

        /**
         * @param planId Specifies the plan id published by NewRelic. The only possible value is `newrelic-pay-as-you-go-free-live`. Defaults to `newrelic-pay-as-you-go-free-live`. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param planId Specifies the plan id published by NewRelic. The only possible value is `newrelic-pay-as-you-go-free-live`. Defaults to `newrelic-pay-as-you-go-free-live`. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        /**
         * @param usageType Specifies the usage type. Possible values are `COMMITTED` and `PAYG`. Defaults to `PAYG`. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder usageType(@Nullable Output<String> usageType) {
            $.usageType = usageType;
            return this;
        }

        /**
         * @param usageType Specifies the usage type. Possible values are `COMMITTED` and `PAYG`. Defaults to `PAYG`. Changing this forces a new Azure Native New Relic Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder usageType(String usageType) {
            return usageType(Output.of(usageType));
        }

        public MonitorPlanArgs build() {
            $.effectiveDate = Objects.requireNonNull($.effectiveDate, "expected parameter 'effectiveDate' to be non-null");
            return $;
        }
    }

}