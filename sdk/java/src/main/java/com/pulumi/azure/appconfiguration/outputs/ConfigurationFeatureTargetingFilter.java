// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.outputs;

import com.pulumi.azure.appconfiguration.outputs.ConfigurationFeatureTargetingFilterGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationFeatureTargetingFilter {
    /**
     * @return A number representing the percentage of the entire user base.
     * 
     */
    private final Integer defaultRolloutPercentage;
    /**
     * @return One or more blocks of type `groups` as defined below.
     * 
     */
    private final @Nullable List<ConfigurationFeatureTargetingFilterGroup> groups;
    /**
     * @return A list of users to target for this feature.
     * 
     */
    private final @Nullable List<String> users;

    @CustomType.Constructor
    private ConfigurationFeatureTargetingFilter(
        @CustomType.Parameter("defaultRolloutPercentage") Integer defaultRolloutPercentage,
        @CustomType.Parameter("groups") @Nullable List<ConfigurationFeatureTargetingFilterGroup> groups,
        @CustomType.Parameter("users") @Nullable List<String> users) {
        this.defaultRolloutPercentage = defaultRolloutPercentage;
        this.groups = groups;
        this.users = users;
    }

    /**
     * @return A number representing the percentage of the entire user base.
     * 
     */
    public Integer defaultRolloutPercentage() {
        return this.defaultRolloutPercentage;
    }
    /**
     * @return One or more blocks of type `groups` as defined below.
     * 
     */
    public List<ConfigurationFeatureTargetingFilterGroup> groups() {
        return this.groups == null ? List.of() : this.groups;
    }
    /**
     * @return A list of users to target for this feature.
     * 
     */
    public List<String> users() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationFeatureTargetingFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultRolloutPercentage;
        private @Nullable List<ConfigurationFeatureTargetingFilterGroup> groups;
        private @Nullable List<String> users;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationFeatureTargetingFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRolloutPercentage = defaults.defaultRolloutPercentage;
    	      this.groups = defaults.groups;
    	      this.users = defaults.users;
        }

        public Builder defaultRolloutPercentage(Integer defaultRolloutPercentage) {
            this.defaultRolloutPercentage = Objects.requireNonNull(defaultRolloutPercentage);
            return this;
        }
        public Builder groups(@Nullable List<ConfigurationFeatureTargetingFilterGroup> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(ConfigurationFeatureTargetingFilterGroup... groups) {
            return groups(List.of(groups));
        }
        public Builder users(@Nullable List<String> users) {
            this.users = users;
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }        public ConfigurationFeatureTargetingFilter build() {
            return new ConfigurationFeatureTargetingFilter(defaultRolloutPercentage, groups, users);
        }
    }
}