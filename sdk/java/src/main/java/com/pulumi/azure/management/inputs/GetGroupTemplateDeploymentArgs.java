// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupTemplateDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupTemplateDeploymentArgs Empty = new GetGroupTemplateDeploymentArgs();

    /**
     * The ID of the Management Group to which this template was applied.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    /**
     * @return The ID of the Management Group to which this template was applied.
     * 
     */
    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of this Management Group Template Deployment.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Management Group Template Deployment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetGroupTemplateDeploymentArgs() {}

    private GetGroupTemplateDeploymentArgs(GetGroupTemplateDeploymentArgs $) {
        this.managementGroupId = $.managementGroupId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupTemplateDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupTemplateDeploymentArgs $;

        public Builder() {
            $ = new GetGroupTemplateDeploymentArgs();
        }

        public Builder(GetGroupTemplateDeploymentArgs defaults) {
            $ = new GetGroupTemplateDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementGroupId The ID of the Management Group to which this template was applied.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupId The ID of the Management Group to which this template was applied.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param name The name of this Management Group Template Deployment.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Management Group Template Deployment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetGroupTemplateDeploymentArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}