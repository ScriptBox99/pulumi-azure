// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubscriptionCostManagementViewDatasetSorting {
    /**
     * @return Direction of sort. Possible values are `Ascending` and `Descending`.
     * 
     */
    private String direction;
    /**
     * @return The name of the column to sort.
     * 
     */
    private String name;

    private SubscriptionCostManagementViewDatasetSorting() {}
    /**
     * @return Direction of sort. Possible values are `Ascending` and `Descending`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The name of the column to sort.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionCostManagementViewDatasetSorting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String direction;
        private String name;
        public Builder() {}
        public Builder(SubscriptionCostManagementViewDatasetSorting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SubscriptionCostManagementViewDatasetSorting build() {
            final var o = new SubscriptionCostManagementViewDatasetSorting();
            o.direction = direction;
            o.name = name;
            return o;
        }
    }
}