// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualMachineScaleSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetArgs Empty = new GetVirtualMachineScaleSetArgs();

    /**
     * The name of this Virtual Machine Scale Set.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Virtual Machine Scale Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Virtual Machine Scale Set exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Virtual Machine Scale Set exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVirtualMachineScaleSetArgs() {}

    private GetVirtualMachineScaleSetArgs(GetVirtualMachineScaleSetArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineScaleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineScaleSetArgs $;

        public Builder() {
            $ = new GetVirtualMachineScaleSetArgs();
        }

        public Builder(GetVirtualMachineScaleSetArgs defaults) {
            $ = new GetVirtualMachineScaleSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Virtual Machine Scale Set.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Virtual Machine Scale Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Virtual Machine Scale Set exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Virtual Machine Scale Set exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetVirtualMachineScaleSetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}