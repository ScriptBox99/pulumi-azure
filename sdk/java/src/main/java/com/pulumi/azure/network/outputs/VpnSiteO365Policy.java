// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.VpnSiteO365PolicyTrafficCategory;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnSiteO365Policy {
    /**
     * @return A `traffic_category` block as defined above.
     * 
     */
    private final @Nullable VpnSiteO365PolicyTrafficCategory trafficCategory;

    @CustomType.Constructor
    private VpnSiteO365Policy(@CustomType.Parameter("trafficCategory") @Nullable VpnSiteO365PolicyTrafficCategory trafficCategory) {
        this.trafficCategory = trafficCategory;
    }

    /**
     * @return A `traffic_category` block as defined above.
     * 
     */
    public Optional<VpnSiteO365PolicyTrafficCategory> trafficCategory() {
        return Optional.ofNullable(this.trafficCategory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteO365Policy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VpnSiteO365PolicyTrafficCategory trafficCategory;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteO365Policy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trafficCategory = defaults.trafficCategory;
        }

        public Builder trafficCategory(@Nullable VpnSiteO365PolicyTrafficCategory trafficCategory) {
            this.trafficCategory = trafficCategory;
            return this;
        }        public VpnSiteO365Policy build() {
            return new VpnSiteO365Policy(trafficCategory);
        }
    }
}