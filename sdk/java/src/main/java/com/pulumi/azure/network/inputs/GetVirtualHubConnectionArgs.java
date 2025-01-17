// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualHubConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualHubConnectionArgs Empty = new GetVirtualHubConnectionArgs();

    /**
     * The name of the Connection which should be retrieved.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Connection which should be retrieved.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the Virtual Hub Connection exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the Virtual Hub Connection exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Virtual Hub where this Connection exists.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private Output<String> virtualHubName;

    /**
     * @return The name of the Virtual Hub where this Connection exists.
     * 
     */
    public Output<String> virtualHubName() {
        return this.virtualHubName;
    }

    private GetVirtualHubConnectionArgs() {}

    private GetVirtualHubConnectionArgs(GetVirtualHubConnectionArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualHubConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualHubConnectionArgs $;

        public Builder() {
            $ = new GetVirtualHubConnectionArgs();
        }

        public Builder(GetVirtualHubConnectionArgs defaults) {
            $ = new GetVirtualHubConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Connection which should be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Connection which should be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the Virtual Hub Connection exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the Virtual Hub Connection exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param virtualHubName The name of the Virtual Hub where this Connection exists.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(Output<String> virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        /**
         * @param virtualHubName The name of the Virtual Hub where this Connection exists.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            return virtualHubName(Output.of(virtualHubName));
        }

        public GetVirtualHubConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
