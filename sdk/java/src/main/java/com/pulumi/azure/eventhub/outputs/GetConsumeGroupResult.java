// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConsumeGroupResult {
    private final String eventhubName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String namespaceName;
    private final String resourceGroupName;
    /**
     * @return Specifies the user metadata.
     * 
     */
    private final String userMetadata;

    @CustomType.Constructor
    private GetConsumeGroupResult(
        @CustomType.Parameter("eventhubName") String eventhubName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceName") String namespaceName,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("userMetadata") String userMetadata) {
        this.eventhubName = eventhubName;
        this.id = id;
        this.name = name;
        this.namespaceName = namespaceName;
        this.resourceGroupName = resourceGroupName;
        this.userMetadata = userMetadata;
    }

    public String eventhubName() {
        return this.eventhubName;
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
    public String namespaceName() {
        return this.namespaceName;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return Specifies the user metadata.
     * 
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsumeGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventhubName;
        private String id;
        private String name;
        private String namespaceName;
        private String resourceGroupName;
        private String userMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsumeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventhubName = defaults.eventhubName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userMetadata = defaults.userMetadata;
        }

        public Builder eventhubName(String eventhubName) {
            this.eventhubName = Objects.requireNonNull(eventhubName);
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
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder userMetadata(String userMetadata) {
            this.userMetadata = Objects.requireNonNull(userMetadata);
            return this;
        }        public GetConsumeGroupResult build() {
            return new GetConsumeGroupResult(eventhubName, id, name, namespaceName, resourceGroupName, userMetadata);
        }
    }
}