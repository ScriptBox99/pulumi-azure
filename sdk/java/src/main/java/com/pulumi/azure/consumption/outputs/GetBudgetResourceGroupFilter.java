// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupFilterDimension;
import com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupFilterNot;
import com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupFilterTag;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBudgetResourceGroupFilter {
    /**
     * @return A `dimension` block as defined below.
     * 
     */
    private final List<GetBudgetResourceGroupFilterDimension> dimensions;
    /**
     * @return A `not` block as defined below.
     * 
     */
    private final List<GetBudgetResourceGroupFilterNot> nots;
    /**
     * @return A `tag` block as defined below.
     * 
     */
    private final List<GetBudgetResourceGroupFilterTag> tags;

    @CustomType.Constructor
    private GetBudgetResourceGroupFilter(
        @CustomType.Parameter("dimensions") List<GetBudgetResourceGroupFilterDimension> dimensions,
        @CustomType.Parameter("nots") List<GetBudgetResourceGroupFilterNot> nots,
        @CustomType.Parameter("tags") List<GetBudgetResourceGroupFilterTag> tags) {
        this.dimensions = dimensions;
        this.nots = nots;
        this.tags = tags;
    }

    /**
     * @return A `dimension` block as defined below.
     * 
     */
    public List<GetBudgetResourceGroupFilterDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return A `not` block as defined below.
     * 
     */
    public List<GetBudgetResourceGroupFilterNot> nots() {
        return this.nots;
    }
    /**
     * @return A `tag` block as defined below.
     * 
     */
    public List<GetBudgetResourceGroupFilterTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetResourceGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBudgetResourceGroupFilterDimension> dimensions;
        private List<GetBudgetResourceGroupFilterNot> nots;
        private List<GetBudgetResourceGroupFilterTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetResourceGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.nots = defaults.nots;
    	      this.tags = defaults.tags;
        }

        public Builder dimensions(List<GetBudgetResourceGroupFilterDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(GetBudgetResourceGroupFilterDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder nots(List<GetBudgetResourceGroupFilterNot> nots) {
            this.nots = Objects.requireNonNull(nots);
            return this;
        }
        public Builder nots(GetBudgetResourceGroupFilterNot... nots) {
            return nots(List.of(nots));
        }
        public Builder tags(List<GetBudgetResourceGroupFilterTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetBudgetResourceGroupFilterTag... tags) {
            return tags(List.of(tags));
        }        public GetBudgetResourceGroupFilter build() {
            return new GetBudgetResourceGroupFilter(dimensions, nots, tags);
        }
    }
}