// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssignmentVirtualMachineScaleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssignmentVirtualMachineScaleSetArgs Empty = new AssignmentVirtualMachineScaleSetArgs();

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="maintenanceConfigurationId", required=true)
    private Output<String> maintenanceConfigurationId;

    /**
     * @return Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> maintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }

    /**
     * Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualMachineScaleSetId", required=true)
    private Output<String> virtualMachineScaleSetId;

    /**
     * @return Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineScaleSetId() {
        return this.virtualMachineScaleSetId;
    }

    private AssignmentVirtualMachineScaleSetArgs() {}

    private AssignmentVirtualMachineScaleSetArgs(AssignmentVirtualMachineScaleSetArgs $) {
        this.location = $.location;
        this.maintenanceConfigurationId = $.maintenanceConfigurationId;
        this.virtualMachineScaleSetId = $.virtualMachineScaleSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignmentVirtualMachineScaleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignmentVirtualMachineScaleSetArgs $;

        public Builder() {
            $ = new AssignmentVirtualMachineScaleSetArgs();
        }

        public Builder(AssignmentVirtualMachineScaleSetArgs defaults) {
            $ = new AssignmentVirtualMachineScaleSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceConfigurationId Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceConfigurationId(Output<String> maintenanceConfigurationId) {
            $.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        /**
         * @param maintenanceConfigurationId Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceConfigurationId(String maintenanceConfigurationId) {
            return maintenanceConfigurationId(Output.of(maintenanceConfigurationId));
        }

        /**
         * @param virtualMachineScaleSetId Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineScaleSetId(Output<String> virtualMachineScaleSetId) {
            $.virtualMachineScaleSetId = virtualMachineScaleSetId;
            return this;
        }

        /**
         * @param virtualMachineScaleSetId Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineScaleSetId(String virtualMachineScaleSetId) {
            return virtualMachineScaleSetId(Output.of(virtualMachineScaleSetId));
        }

        public AssignmentVirtualMachineScaleSetArgs build() {
            $.maintenanceConfigurationId = Objects.requireNonNull($.maintenanceConfigurationId, "expected parameter 'maintenanceConfigurationId' to be non-null");
            $.virtualMachineScaleSetId = Objects.requireNonNull($.virtualMachineScaleSetId, "expected parameter 'virtualMachineScaleSetId' to be non-null");
            return $;
        }
    }

}