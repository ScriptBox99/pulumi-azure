// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpringCloudServiceMarketplace {
    /**
     * @return Specifies the plan ID of the 3rd Party Artifact that is being procured.
     * 
     */
    private String plan;
    /**
     * @return Specifies the 3rd Party artifact that is being procured.
     * 
     */
    private String product;
    /**
     * @return Specifies the publisher ID of the 3rd Party Artifact that is being procured.
     * 
     */
    private String publisher;

    private SpringCloudServiceMarketplace() {}
    /**
     * @return Specifies the plan ID of the 3rd Party Artifact that is being procured.
     * 
     */
    public String plan() {
        return this.plan;
    }
    /**
     * @return Specifies the 3rd Party artifact that is being procured.
     * 
     */
    public String product() {
        return this.product;
    }
    /**
     * @return Specifies the publisher ID of the 3rd Party Artifact that is being procured.
     * 
     */
    public String publisher() {
        return this.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudServiceMarketplace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String plan;
        private String product;
        private String publisher;
        public Builder() {}
        public Builder(SpringCloudServiceMarketplace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.plan = defaults.plan;
    	      this.product = defaults.product;
    	      this.publisher = defaults.publisher;
        }

        @CustomType.Setter
        public Builder plan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }
        @CustomType.Setter
        public Builder product(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }
        @CustomType.Setter
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public SpringCloudServiceMarketplace build() {
            final var o = new SpringCloudServiceMarketplace();
            o.plan = plan;
            o.product = product;
            o.publisher = publisher;
            return o;
        }
    }
}