// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.billing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMpaAccountScopePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMpaAccountScopePlainArgs Empty = new GetMpaAccountScopePlainArgs();

    /**
     * The Billing Account Name of the MPA account.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private String billingAccountName;

    /**
     * @return The Billing Account Name of the MPA account.
     * 
     */
    public String billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The Customer Name in the above Billing Account.
     * 
     */
    @Import(name="customerName", required=true)
    private String customerName;

    /**
     * @return The Customer Name in the above Billing Account.
     * 
     */
    public String customerName() {
        return this.customerName;
    }

    private GetMpaAccountScopePlainArgs() {}

    private GetMpaAccountScopePlainArgs(GetMpaAccountScopePlainArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.customerName = $.customerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMpaAccountScopePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMpaAccountScopePlainArgs $;

        public Builder() {
            $ = new GetMpaAccountScopePlainArgs();
        }

        public Builder(GetMpaAccountScopePlainArgs defaults) {
            $ = new GetMpaAccountScopePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountName The Billing Account Name of the MPA account.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(String billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        /**
         * @param customerName The Customer Name in the above Billing Account.
         * 
         * @return builder
         * 
         */
        public Builder customerName(String customerName) {
            $.customerName = customerName;
            return this;
        }

        public GetMpaAccountScopePlainArgs build() {
            $.billingAccountName = Objects.requireNonNull($.billingAccountName, "expected parameter 'billingAccountName' to be non-null");
            $.customerName = Objects.requireNonNull($.customerName, "expected parameter 'customerName' to be non-null");
            return $;
        }
    }

}