// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouteFilterRule {
    /**
     * @return The access type of the rule. The only possible value is `Allow`.
     * 
     */
    private final String access;
    /**
     * @return The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
     * 
     */
    private final List<String> communities;
    /**
     * @return The name of the route filter rule.
     * 
     */
    private final String name;
    /**
     * @return The rule type of the rule. The only possible value is `Community`.
     * 
     */
    private final String ruleType;

    @CustomType.Constructor
    private RouteFilterRule(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("communities") List<String> communities,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ruleType") String ruleType) {
        this.access = access;
        this.communities = communities;
        this.name = name;
        this.ruleType = ruleType;
    }

    /**
     * @return The access type of the rule. The only possible value is `Allow`.
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
     * 
     */
    public List<String> communities() {
        return this.communities;
    }
    /**
     * @return The name of the route filter rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The rule type of the rule. The only possible value is `Community`.
     * 
     */
    public String ruleType() {
        return this.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteFilterRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private List<String> communities;
        private String name;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteFilterRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.communities = defaults.communities;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder communities(List<String> communities) {
            this.communities = Objects.requireNonNull(communities);
            return this;
        }
        public Builder communities(String... communities) {
            return communities(List.of(communities));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }        public RouteFilterRule build() {
            return new RouteFilterRule(access, communities, name, ruleType);
        }
    }
}