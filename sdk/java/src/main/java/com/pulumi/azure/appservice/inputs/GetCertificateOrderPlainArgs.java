// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateOrderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateOrderPlainArgs Empty = new GetCertificateOrderPlainArgs();

    /**
     * The name of the App Service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the App Service.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the App Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where the App Service exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCertificateOrderPlainArgs() {}

    private GetCertificateOrderPlainArgs(GetCertificateOrderPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateOrderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateOrderPlainArgs $;

        public Builder() {
            $ = new GetCertificateOrderPlainArgs();
        }

        public Builder(GetCertificateOrderPlainArgs defaults) {
            $ = new GetCertificateOrderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the App Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the App Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCertificateOrderPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}