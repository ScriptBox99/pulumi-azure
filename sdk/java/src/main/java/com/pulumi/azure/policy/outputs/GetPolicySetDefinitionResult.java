// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.outputs;

import com.pulumi.azure.policy.outputs.GetPolicySetDefinitionPolicyDefinitionGroup;
import com.pulumi.azure.policy.outputs.GetPolicySetDefinitionPolicyDefinitionReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicySetDefinitionResult {
    /**
     * @return The description of this policy definition group.
     * 
     */
    private final String description;
    /**
     * @return The display name of this policy definition group.
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String managementGroupName;
    /**
     * @return Any Metadata defined in the Policy Set Definition.
     * 
     */
    private final String metadata;
    /**
     * @return The name of this policy definition group.
     * 
     */
    private final String name;
    /**
     * @return The mapping of the parameter values for the referenced policy rule. The keys are the parameter names.
     * 
     */
    private final String parameters;
    /**
     * @return One or more `policy_definition_group` blocks as defined below.
     * 
     */
    private final List<GetPolicySetDefinitionPolicyDefinitionGroup> policyDefinitionGroups;
    /**
     * @return One or more `policy_definition_reference` blocks as defined below.
     * 
     */
    private final List<GetPolicySetDefinitionPolicyDefinitionReference> policyDefinitionReferences;
    /**
     * @return The policy definitions contained within the policy set definition.
     * 
     */
    private final String policyDefinitions;
    /**
     * @return The Type of the Policy Set Definition.
     * 
     */
    private final String policyType;

    @CustomType.Constructor
    private GetPolicySetDefinitionResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("managementGroupName") @Nullable String managementGroupName,
        @CustomType.Parameter("metadata") String metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") String parameters,
        @CustomType.Parameter("policyDefinitionGroups") List<GetPolicySetDefinitionPolicyDefinitionGroup> policyDefinitionGroups,
        @CustomType.Parameter("policyDefinitionReferences") List<GetPolicySetDefinitionPolicyDefinitionReference> policyDefinitionReferences,
        @CustomType.Parameter("policyDefinitions") String policyDefinitions,
        @CustomType.Parameter("policyType") String policyType) {
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.managementGroupName = managementGroupName;
        this.metadata = metadata;
        this.name = name;
        this.parameters = parameters;
        this.policyDefinitionGroups = policyDefinitionGroups;
        this.policyDefinitionReferences = policyDefinitionReferences;
        this.policyDefinitions = policyDefinitions;
        this.policyType = policyType;
    }

    /**
     * @return The description of this policy definition group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of this policy definition group.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> managementGroupName() {
        return Optional.ofNullable(this.managementGroupName);
    }
    /**
     * @return Any Metadata defined in the Policy Set Definition.
     * 
     */
    public String metadata() {
        return this.metadata;
    }
    /**
     * @return The name of this policy definition group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The mapping of the parameter values for the referenced policy rule. The keys are the parameter names.
     * 
     */
    public String parameters() {
        return this.parameters;
    }
    /**
     * @return One or more `policy_definition_group` blocks as defined below.
     * 
     */
    public List<GetPolicySetDefinitionPolicyDefinitionGroup> policyDefinitionGroups() {
        return this.policyDefinitionGroups;
    }
    /**
     * @return One or more `policy_definition_reference` blocks as defined below.
     * 
     */
    public List<GetPolicySetDefinitionPolicyDefinitionReference> policyDefinitionReferences() {
        return this.policyDefinitionReferences;
    }
    /**
     * @return The policy definitions contained within the policy set definition.
     * 
     */
    public String policyDefinitions() {
        return this.policyDefinitions;
    }
    /**
     * @return The Type of the Policy Set Definition.
     * 
     */
    public String policyType() {
        return this.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicySetDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private String id;
        private @Nullable String managementGroupName;
        private String metadata;
        private String name;
        private String parameters;
        private List<GetPolicySetDefinitionPolicyDefinitionGroup> policyDefinitionGroups;
        private List<GetPolicySetDefinitionPolicyDefinitionReference> policyDefinitionReferences;
        private String policyDefinitions;
        private String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicySetDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.managementGroupName = defaults.managementGroupName;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionGroups = defaults.policyDefinitionGroups;
    	      this.policyDefinitionReferences = defaults.policyDefinitionReferences;
    	      this.policyDefinitions = defaults.policyDefinitions;
    	      this.policyType = defaults.policyType;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder managementGroupName(@Nullable String managementGroupName) {
            this.managementGroupName = managementGroupName;
            return this;
        }
        public Builder metadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder policyDefinitionGroups(List<GetPolicySetDefinitionPolicyDefinitionGroup> policyDefinitionGroups) {
            this.policyDefinitionGroups = Objects.requireNonNull(policyDefinitionGroups);
            return this;
        }
        public Builder policyDefinitionGroups(GetPolicySetDefinitionPolicyDefinitionGroup... policyDefinitionGroups) {
            return policyDefinitionGroups(List.of(policyDefinitionGroups));
        }
        public Builder policyDefinitionReferences(List<GetPolicySetDefinitionPolicyDefinitionReference> policyDefinitionReferences) {
            this.policyDefinitionReferences = Objects.requireNonNull(policyDefinitionReferences);
            return this;
        }
        public Builder policyDefinitionReferences(GetPolicySetDefinitionPolicyDefinitionReference... policyDefinitionReferences) {
            return policyDefinitionReferences(List.of(policyDefinitionReferences));
        }
        public Builder policyDefinitions(String policyDefinitions) {
            this.policyDefinitions = Objects.requireNonNull(policyDefinitions);
            return this;
        }
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }        public GetPolicySetDefinitionResult build() {
            return new GetPolicySetDefinitionResult(description, displayName, id, managementGroupName, metadata, name, parameters, policyDefinitionGroups, policyDefinitionReferences, policyDefinitions, policyType);
        }
    }
}