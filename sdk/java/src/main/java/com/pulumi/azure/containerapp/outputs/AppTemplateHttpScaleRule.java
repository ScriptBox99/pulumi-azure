// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.azure.containerapp.outputs.AppTemplateHttpScaleRuleAuthentication;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AppTemplateHttpScaleRule {
    /**
     * @return Zero or more `authentication` blocks as defined below.
     * 
     */
    private @Nullable List<AppTemplateHttpScaleRuleAuthentication> authentications;
    /**
     * @return The number of concurrent requests to trigger scaling.
     * 
     */
    private String concurrentRequests;
    /**
     * @return The name of the Scaling Rule
     * 
     */
    private String name;

    private AppTemplateHttpScaleRule() {}
    /**
     * @return Zero or more `authentication` blocks as defined below.
     * 
     */
    public List<AppTemplateHttpScaleRuleAuthentication> authentications() {
        return this.authentications == null ? List.of() : this.authentications;
    }
    /**
     * @return The number of concurrent requests to trigger scaling.
     * 
     */
    public String concurrentRequests() {
        return this.concurrentRequests;
    }
    /**
     * @return The name of the Scaling Rule
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppTemplateHttpScaleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AppTemplateHttpScaleRuleAuthentication> authentications;
        private String concurrentRequests;
        private String name;
        public Builder() {}
        public Builder(AppTemplateHttpScaleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentications = defaults.authentications;
    	      this.concurrentRequests = defaults.concurrentRequests;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder authentications(@Nullable List<AppTemplateHttpScaleRuleAuthentication> authentications) {
            this.authentications = authentications;
            return this;
        }
        public Builder authentications(AppTemplateHttpScaleRuleAuthentication... authentications) {
            return authentications(List.of(authentications));
        }
        @CustomType.Setter
        public Builder concurrentRequests(String concurrentRequests) {
            this.concurrentRequests = Objects.requireNonNull(concurrentRequests);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AppTemplateHttpScaleRule build() {
            final var o = new AppTemplateHttpScaleRule();
            o.authentications = authentications;
            o.concurrentRequests = concurrentRequests;
            o.name = name;
            return o;
        }
    }
}