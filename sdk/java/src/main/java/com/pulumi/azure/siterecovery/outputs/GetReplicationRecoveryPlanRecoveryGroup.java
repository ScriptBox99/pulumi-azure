// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.outputs;

import com.pulumi.azure.siterecovery.outputs.GetReplicationRecoveryPlanRecoveryGroupPostAction;
import com.pulumi.azure.siterecovery.outputs.GetReplicationRecoveryPlanRecoveryGroupPreAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetReplicationRecoveryPlanRecoveryGroup {
    /**
     * @return one or more `action` block. which will be executed after the group recovery.
     * 
     */
    private List<List<GetReplicationRecoveryPlanRecoveryGroupPostAction>> postActions;
    /**
     * @return one or more `action` block. which will be executed before the group recovery.
     * 
     */
    private List<List<GetReplicationRecoveryPlanRecoveryGroupPreAction>> preActions;
    /**
     * @return one or more id of protected VM.
     * 
     */
    private List<String> replicatedProtectedItems;
    /**
     * @return Type of the action detail.
     * 
     */
    private String type;

    private GetReplicationRecoveryPlanRecoveryGroup() {}
    /**
     * @return one or more `action` block. which will be executed after the group recovery.
     * 
     */
    public List<List<GetReplicationRecoveryPlanRecoveryGroupPostAction>> postActions() {
        return this.postActions;
    }
    /**
     * @return one or more `action` block. which will be executed before the group recovery.
     * 
     */
    public List<List<GetReplicationRecoveryPlanRecoveryGroupPreAction>> preActions() {
        return this.preActions;
    }
    /**
     * @return one or more id of protected VM.
     * 
     */
    public List<String> replicatedProtectedItems() {
        return this.replicatedProtectedItems;
    }
    /**
     * @return Type of the action detail.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationRecoveryPlanRecoveryGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<List<GetReplicationRecoveryPlanRecoveryGroupPostAction>> postActions;
        private List<List<GetReplicationRecoveryPlanRecoveryGroupPreAction>> preActions;
        private List<String> replicatedProtectedItems;
        private String type;
        public Builder() {}
        public Builder(GetReplicationRecoveryPlanRecoveryGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postActions = defaults.postActions;
    	      this.preActions = defaults.preActions;
    	      this.replicatedProtectedItems = defaults.replicatedProtectedItems;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder postActions(List<List<GetReplicationRecoveryPlanRecoveryGroupPostAction>> postActions) {
            this.postActions = Objects.requireNonNull(postActions);
            return this;
        }
        @CustomType.Setter
        public Builder preActions(List<List<GetReplicationRecoveryPlanRecoveryGroupPreAction>> preActions) {
            this.preActions = Objects.requireNonNull(preActions);
            return this;
        }
        @CustomType.Setter
        public Builder replicatedProtectedItems(List<String> replicatedProtectedItems) {
            this.replicatedProtectedItems = Objects.requireNonNull(replicatedProtectedItems);
            return this;
        }
        public Builder replicatedProtectedItems(String... replicatedProtectedItems) {
            return replicatedProtectedItems(List.of(replicatedProtectedItems));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetReplicationRecoveryPlanRecoveryGroup build() {
            final var o = new GetReplicationRecoveryPlanRecoveryGroup();
            o.postActions = postActions;
            o.preActions = preActions;
            o.replicatedProtectedItems = replicatedProtectedItems;
            o.type = type;
            return o;
        }
    }
}