// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMongoDatabaseResult {
    private final String accountName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Cosmos DB Mongo Database.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetMongoDatabaseResult(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.accountName = accountName;
        this.id = id;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.tags = tags;
    }

    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the Cosmos DB Mongo Database.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String id;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetMongoDatabaseResult build() {
            return new GetMongoDatabaseResult(accountName, id, name, resourceGroupName, tags);
        }
    }
}