// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.GetBudgetSubscriptionFilter;
import com.pulumi.azure.consumption.outputs.GetBudgetSubscriptionNotification;
import com.pulumi.azure.consumption.outputs.GetBudgetSubscriptionTimePeriod;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBudgetSubscriptionResult {
    /**
     * @return The total amount of cost to track with the budget.
     * 
     */
    private final Double amount;
    /**
     * @return A `filter` block as defined below.
     * 
     */
    private final List<GetBudgetSubscriptionFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The name of the tag to use for the filter.
     * 
     */
    private final String name;
    /**
     * @return A `notification` block as defined below.
     * 
     */
    private final List<GetBudgetSubscriptionNotification> notifications;
    private final String subscriptionId;
    /**
     * @return The time covered by a budget.
     * 
     */
    private final String timeGrain;
    /**
     * @return A `time_period` block as defined below.
     * 
     */
    private final List<GetBudgetSubscriptionTimePeriod> timePeriods;

    @CustomType.Constructor
    private GetBudgetSubscriptionResult(
        @CustomType.Parameter("amount") Double amount,
        @CustomType.Parameter("filters") List<GetBudgetSubscriptionFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notifications") List<GetBudgetSubscriptionNotification> notifications,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("timeGrain") String timeGrain,
        @CustomType.Parameter("timePeriods") List<GetBudgetSubscriptionTimePeriod> timePeriods) {
        this.amount = amount;
        this.filters = filters;
        this.id = id;
        this.name = name;
        this.notifications = notifications;
        this.subscriptionId = subscriptionId;
        this.timeGrain = timeGrain;
        this.timePeriods = timePeriods;
    }

    /**
     * @return The total amount of cost to track with the budget.
     * 
     */
    public Double amount() {
        return this.amount;
    }
    /**
     * @return A `filter` block as defined below.
     * 
     */
    public List<GetBudgetSubscriptionFilter> filters() {
        return this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the tag to use for the filter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `notification` block as defined below.
     * 
     */
    public List<GetBudgetSubscriptionNotification> notifications() {
        return this.notifications;
    }
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return The time covered by a budget.
     * 
     */
    public String timeGrain() {
        return this.timeGrain;
    }
    /**
     * @return A `time_period` block as defined below.
     * 
     */
    public List<GetBudgetSubscriptionTimePeriod> timePeriods() {
        return this.timePeriods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double amount;
        private List<GetBudgetSubscriptionFilter> filters;
        private String id;
        private String name;
        private List<GetBudgetSubscriptionNotification> notifications;
        private String subscriptionId;
        private String timeGrain;
        private List<GetBudgetSubscriptionTimePeriod> timePeriods;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.timeGrain = defaults.timeGrain;
    	      this.timePeriods = defaults.timePeriods;
        }

        public Builder amount(Double amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        public Builder filters(List<GetBudgetSubscriptionFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(GetBudgetSubscriptionFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notifications(List<GetBudgetSubscriptionNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetBudgetSubscriptionNotification... notifications) {
            return notifications(List.of(notifications));
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder timeGrain(String timeGrain) {
            this.timeGrain = Objects.requireNonNull(timeGrain);
            return this;
        }
        public Builder timePeriods(List<GetBudgetSubscriptionTimePeriod> timePeriods) {
            this.timePeriods = Objects.requireNonNull(timePeriods);
            return this;
        }
        public Builder timePeriods(GetBudgetSubscriptionTimePeriod... timePeriods) {
            return timePeriods(List.of(timePeriods));
        }        public GetBudgetSubscriptionResult build() {
            return new GetBudgetSubscriptionResult(amount, filters, id, name, notifications, subscriptionId, timeGrain, timePeriods);
        }
    }
}