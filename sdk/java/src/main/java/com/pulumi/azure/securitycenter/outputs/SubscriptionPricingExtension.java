// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionPricingExtension {
    /**
     * @return Key/Value pairs that are required for some extensions.
     * 
     * &gt; **NOTE:** If an extension is not defined, it will not be enabled. Use `ignore_changes` on the `extension` field if you want to use the default extensions.
     * 
     * &gt; **NOTE:** Changing the pricing tier to `Standard` affects all resources of the given type in the subscription and could be quite costly.
     * 
     */
    private @Nullable Map<String,String> additionalExtensionProperties;
    /**
     * @return The name of extension.
     * 
     */
    private String name;

    private SubscriptionPricingExtension() {}
    /**
     * @return Key/Value pairs that are required for some extensions.
     * 
     * &gt; **NOTE:** If an extension is not defined, it will not be enabled. Use `ignore_changes` on the `extension` field if you want to use the default extensions.
     * 
     * &gt; **NOTE:** Changing the pricing tier to `Standard` affects all resources of the given type in the subscription and could be quite costly.
     * 
     */
    public Map<String,String> additionalExtensionProperties() {
        return this.additionalExtensionProperties == null ? Map.of() : this.additionalExtensionProperties;
    }
    /**
     * @return The name of extension.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPricingExtension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> additionalExtensionProperties;
        private String name;
        public Builder() {}
        public Builder(SubscriptionPricingExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensionProperties = defaults.additionalExtensionProperties;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder additionalExtensionProperties(@Nullable Map<String,String> additionalExtensionProperties) {
            this.additionalExtensionProperties = additionalExtensionProperties;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SubscriptionPricingExtension build() {
            final var o = new SubscriptionPricingExtension();
            o.additionalExtensionProperties = additionalExtensionProperties;
            o.name = name;
            return o;
        }
    }
}