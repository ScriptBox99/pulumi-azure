// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeploymentFrontendPrivate {
    /**
     * @return Specify the methos of allocating the private IP. Possible values are `Static` and `Dynamic`.
     * 
     */
    private String allocationMethod;
    /**
     * @return Specify the IP Address of this private IP.
     * 
     */
    private String ipAddress;
    /**
     * @return Specify the SubNet Resource ID to this Nginx Deployment.
     * 
     */
    private String subnetId;

    private DeploymentFrontendPrivate() {}
    /**
     * @return Specify the methos of allocating the private IP. Possible values are `Static` and `Dynamic`.
     * 
     */
    public String allocationMethod() {
        return this.allocationMethod;
    }
    /**
     * @return Specify the IP Address of this private IP.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Specify the SubNet Resource ID to this Nginx Deployment.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentFrontendPrivate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationMethod;
        private String ipAddress;
        private String subnetId;
        public Builder() {}
        public Builder(DeploymentFrontendPrivate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationMethod = defaults.allocationMethod;
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder allocationMethod(String allocationMethod) {
            this.allocationMethod = Objects.requireNonNull(allocationMethod);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public DeploymentFrontendPrivate build() {
            final var o = new DeploymentFrontendPrivate();
            o.allocationMethod = allocationMethod;
            o.ipAddress = ipAddress;
            o.subnetId = subnetId;
            return o;
        }
    }
}