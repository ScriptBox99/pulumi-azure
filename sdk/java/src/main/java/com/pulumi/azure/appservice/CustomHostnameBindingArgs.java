// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomHostnameBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameBindingArgs Empty = new CustomHostnameBindingArgs();

    /**
     * The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServiceName", required=true)
    private Output<String> appServiceName;

    /**
     * @return The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceName() {
        return this.appServiceName;
    }

    /**
     * Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sslState")
    private @Nullable Output<String> sslState;

    /**
     * @return The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sslState() {
        return Optional.ofNullable(this.sslState);
    }

    /**
     * The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private CustomHostnameBindingArgs() {}

    private CustomHostnameBindingArgs(CustomHostnameBindingArgs $) {
        this.appServiceName = $.appServiceName;
        this.hostname = $.hostname;
        this.resourceGroupName = $.resourceGroupName;
        this.sslState = $.sslState;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameBindingArgs $;

        public Builder() {
            $ = new CustomHostnameBindingArgs();
        }

        public Builder(CustomHostnameBindingArgs defaults) {
            $ = new CustomHostnameBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceName The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(Output<String> appServiceName) {
            $.appServiceName = appServiceName;
            return this;
        }

        /**
         * @param appServiceName The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(String appServiceName) {
            return appServiceName(Output.of(appServiceName));
        }

        /**
         * @param hostname Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sslState The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sslState(@Nullable Output<String> sslState) {
            $.sslState = sslState;
            return this;
        }

        /**
         * @param sslState The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sslState(String sslState) {
            return sslState(Output.of(sslState));
        }

        /**
         * @param thumbprint The SSL certificate thumbprint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The SSL certificate thumbprint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public CustomHostnameBindingArgs build() {
            $.appServiceName = Objects.requireNonNull($.appServiceName, "expected parameter 'appServiceName' to be non-null");
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}