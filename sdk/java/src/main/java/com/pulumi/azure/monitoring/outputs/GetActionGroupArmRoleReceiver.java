// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionGroupArmRoleReceiver {
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    private final String name;
    /**
     * @return The arm role id.
     * 
     */
    private final String roleId;
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    private final Boolean useCommonAlertSchema;

    @CustomType.Constructor
    private GetActionGroupArmRoleReceiver(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("roleId") String roleId,
        @CustomType.Parameter("useCommonAlertSchema") Boolean useCommonAlertSchema) {
        this.name = name;
        this.roleId = roleId;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The arm role id.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionGroupArmRoleReceiver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String roleId;
        private Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActionGroupArmRoleReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.roleId = defaults.roleId;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = Objects.requireNonNull(useCommonAlertSchema);
            return this;
        }        public GetActionGroupArmRoleReceiver build() {
            return new GetActionGroupArmRoleReceiver(name, roleId, useCommonAlertSchema);
        }
    }
}