// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRoutePortAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRoutePortAuthorizationArgs Empty = new ExpressRoutePortAuthorizationArgs();

    /**
     * The name of the Express Route Port in which to create the Authorization. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="expressRoutePortName", required=true)
    private Output<String> expressRoutePortName;

    /**
     * @return The name of the Express Route Port in which to create the Authorization. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> expressRoutePortName() {
        return this.expressRoutePortName;
    }

    /**
     * The name of the ExpressRoute Port. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ExpressRoute Port. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the ExpressRoute Port. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the ExpressRoute Port. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ExpressRoutePortAuthorizationArgs() {}

    private ExpressRoutePortAuthorizationArgs(ExpressRoutePortAuthorizationArgs $) {
        this.expressRoutePortName = $.expressRoutePortName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRoutePortAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRoutePortAuthorizationArgs $;

        public Builder() {
            $ = new ExpressRoutePortAuthorizationArgs();
        }

        public Builder(ExpressRoutePortAuthorizationArgs defaults) {
            $ = new ExpressRoutePortAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressRoutePortName The name of the Express Route Port in which to create the Authorization. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePortName(Output<String> expressRoutePortName) {
            $.expressRoutePortName = expressRoutePortName;
            return this;
        }

        /**
         * @param expressRoutePortName The name of the Express Route Port in which to create the Authorization. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePortName(String expressRoutePortName) {
            return expressRoutePortName(Output.of(expressRoutePortName));
        }

        /**
         * @param name The name of the ExpressRoute Port. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ExpressRoute Port. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the ExpressRoute Port. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the ExpressRoute Port. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ExpressRoutePortAuthorizationArgs build() {
            $.expressRoutePortName = Objects.requireNonNull($.expressRoutePortName, "expected parameter 'expressRoutePortName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
