// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiArgs Empty = new GetApiArgs();

    /**
     * The name of the API Management Service in which the API Management API exists.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the API Management API exists.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The name of the API Management API.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the API Management API.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group in which the API Management Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which the API Management Service exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Revision of the API Management API.
     * 
     */
    @Import(name="revision", required=true)
    private Output<String> revision;

    /**
     * @return The Revision of the API Management API.
     * 
     */
    public Output<String> revision() {
        return this.revision;
    }

    private GetApiArgs() {}

    private GetApiArgs(GetApiArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiArgs $;

        public Builder() {
            $ = new GetApiArgs();
        }

        public Builder(GetApiArgs defaults) {
            $ = new GetApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the API Management API exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the API Management API exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param name The name of the API Management API.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the API Management API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param revision The Revision of the API Management API.
         * 
         * @return builder
         * 
         */
        public Builder revision(Output<String> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision The Revision of the API Management API.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            return revision(Output.of(revision));
        }

        public GetApiArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            return $;
        }
    }

}