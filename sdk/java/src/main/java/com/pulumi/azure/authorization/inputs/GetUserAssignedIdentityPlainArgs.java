// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserAssignedIdentityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserAssignedIdentityPlainArgs Empty = new GetUserAssignedIdentityPlainArgs();

    /**
     * The name of the User Assigned Identity.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the User Assigned Identity.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group in which the User Assigned Identity exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group in which the User Assigned Identity exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetUserAssignedIdentityPlainArgs() {}

    private GetUserAssignedIdentityPlainArgs(GetUserAssignedIdentityPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserAssignedIdentityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserAssignedIdentityPlainArgs $;

        public Builder() {
            $ = new GetUserAssignedIdentityPlainArgs();
        }

        public Builder(GetUserAssignedIdentityPlainArgs defaults) {
            $ = new GetUserAssignedIdentityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the User Assigned Identity.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the User Assigned Identity exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetUserAssignedIdentityPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}