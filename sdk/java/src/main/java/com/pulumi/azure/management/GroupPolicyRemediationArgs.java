// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPolicyRemediationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyRemediationArgs Empty = new GroupPolicyRemediationArgs();

    @Import(name="locationFilters")
    private @Nullable Output<List<String>> locationFilters;

    public Optional<Output<List<String>>> locationFilters() {
        return Optional.ofNullable(this.locationFilters);
    }

    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="policyAssignmentId", required=true)
    private Output<String> policyAssignmentId;

    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }

    @Import(name="policyDefinitionId")
    private @Nullable Output<String> policyDefinitionId;

    public Optional<Output<String>> policyDefinitionId() {
        return Optional.ofNullable(this.policyDefinitionId);
    }

    @Import(name="resourceDiscoveryMode")
    private @Nullable Output<String> resourceDiscoveryMode;

    public Optional<Output<String>> resourceDiscoveryMode() {
        return Optional.ofNullable(this.resourceDiscoveryMode);
    }

    private GroupPolicyRemediationArgs() {}

    private GroupPolicyRemediationArgs(GroupPolicyRemediationArgs $) {
        this.locationFilters = $.locationFilters;
        this.managementGroupId = $.managementGroupId;
        this.name = $.name;
        this.policyAssignmentId = $.policyAssignmentId;
        this.policyDefinitionId = $.policyDefinitionId;
        this.resourceDiscoveryMode = $.resourceDiscoveryMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyRemediationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyRemediationArgs $;

        public Builder() {
            $ = new GroupPolicyRemediationArgs();
        }

        public Builder(GroupPolicyRemediationArgs defaults) {
            $ = new GroupPolicyRemediationArgs(Objects.requireNonNull(defaults));
        }

        public Builder locationFilters(@Nullable Output<List<String>> locationFilters) {
            $.locationFilters = locationFilters;
            return this;
        }

        public Builder locationFilters(List<String> locationFilters) {
            return locationFilters(Output.of(locationFilters));
        }

        public Builder locationFilters(String... locationFilters) {
            return locationFilters(List.of(locationFilters));
        }

        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policyAssignmentId(Output<String> policyAssignmentId) {
            $.policyAssignmentId = policyAssignmentId;
            return this;
        }

        public Builder policyAssignmentId(String policyAssignmentId) {
            return policyAssignmentId(Output.of(policyAssignmentId));
        }

        public Builder policyDefinitionId(@Nullable Output<String> policyDefinitionId) {
            $.policyDefinitionId = policyDefinitionId;
            return this;
        }

        public Builder policyDefinitionId(String policyDefinitionId) {
            return policyDefinitionId(Output.of(policyDefinitionId));
        }

        public Builder resourceDiscoveryMode(@Nullable Output<String> resourceDiscoveryMode) {
            $.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }

        public Builder resourceDiscoveryMode(String resourceDiscoveryMode) {
            return resourceDiscoveryMode(Output.of(resourceDiscoveryMode));
        }

        public GroupPolicyRemediationArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.policyAssignmentId = Objects.requireNonNull($.policyAssignmentId, "expected parameter 'policyAssignmentId' to be non-null");
            return $;
        }
    }

}