// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataCollectionRuleDestinationsLogAnalytic {
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    private final String name;
    /**
     * @return The ID of a Log Analytic Workspace resource.
     * 
     */
    private final String workspaceResourceId;

    @CustomType.Constructor
    private DataCollectionRuleDestinationsLogAnalytic(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("workspaceResourceId") String workspaceResourceId) {
        this.name = name;
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of a Log Analytic Workspace resource.
     * 
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDestinationsLogAnalytic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleDestinationsLogAnalytic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder workspaceResourceId(String workspaceResourceId) {
            this.workspaceResourceId = Objects.requireNonNull(workspaceResourceId);
            return this;
        }        public DataCollectionRuleDestinationsLogAnalytic build() {
            return new DataCollectionRuleDestinationsLogAnalytic(name, workspaceResourceId);
        }
    }
}