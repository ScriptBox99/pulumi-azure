// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualMachineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineArgs Empty = new GetVirtualMachineArgs();

    /**
     * Specifies the name of the Virtual Machine.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Virtual Machine.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group the Virtual Machine is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group the Virtual Machine is located in.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVirtualMachineArgs() {}

    private GetVirtualMachineArgs(GetVirtualMachineArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineArgs $;

        public Builder() {
            $ = new GetVirtualMachineArgs();
        }

        public Builder(GetVirtualMachineArgs defaults) {
            $ = new GetVirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the Virtual Machine is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the Virtual Machine is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetVirtualMachineArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}