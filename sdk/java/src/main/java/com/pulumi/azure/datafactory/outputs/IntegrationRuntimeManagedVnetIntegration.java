// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntegrationRuntimeManagedVnetIntegration {
    /**
     * @return Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    private final String subnetName;
    /**
     * @return ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    private final String vnetId;

    @CustomType.Constructor
    private IntegrationRuntimeManagedVnetIntegration(
        @CustomType.Parameter("subnetName") String subnetName,
        @CustomType.Parameter("vnetId") String vnetId) {
        this.subnetName = subnetName;
        this.vnetId = vnetId;
    }

    /**
     * @return Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    public String subnetName() {
        return this.subnetName;
    }
    /**
     * @return ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    public String vnetId() {
        return this.vnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeManagedVnetIntegration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnetName;
        private String vnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeManagedVnetIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetName = defaults.subnetName;
    	      this.vnetId = defaults.vnetId;
        }

        public Builder subnetName(String subnetName) {
            this.subnetName = Objects.requireNonNull(subnetName);
            return this;
        }
        public Builder vnetId(String vnetId) {
            this.vnetId = Objects.requireNonNull(vnetId);
            return this;
        }        public IntegrationRuntimeManagedVnetIntegration build() {
            return new IntegrationRuntimeManagedVnetIntegration(subnetName, vnetId);
        }
    }
}