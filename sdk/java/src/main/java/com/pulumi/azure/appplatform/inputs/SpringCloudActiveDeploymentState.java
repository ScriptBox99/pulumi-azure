// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudActiveDeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudActiveDeploymentState Empty = new SpringCloudActiveDeploymentState();

    /**
     * Specifies the name of Spring Cloud Deployment which is going to be active.
     * 
     */
    @Import(name="deploymentName")
    private @Nullable Output<String> deploymentName;

    /**
     * @return Specifies the name of Spring Cloud Deployment which is going to be active.
     * 
     */
    public Optional<Output<String>> deploymentName() {
        return Optional.ofNullable(this.deploymentName);
    }

    /**
     * Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="springCloudAppId")
    private @Nullable Output<String> springCloudAppId;

    /**
     * @return Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> springCloudAppId() {
        return Optional.ofNullable(this.springCloudAppId);
    }

    private SpringCloudActiveDeploymentState() {}

    private SpringCloudActiveDeploymentState(SpringCloudActiveDeploymentState $) {
        this.deploymentName = $.deploymentName;
        this.springCloudAppId = $.springCloudAppId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudActiveDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudActiveDeploymentState $;

        public Builder() {
            $ = new SpringCloudActiveDeploymentState();
        }

        public Builder(SpringCloudActiveDeploymentState defaults) {
            $ = new SpringCloudActiveDeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentName Specifies the name of Spring Cloud Deployment which is going to be active.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param deploymentName Specifies the name of Spring Cloud Deployment which is going to be active.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            return deploymentName(Output.of(deploymentName));
        }

        /**
         * @param springCloudAppId Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudAppId(@Nullable Output<String> springCloudAppId) {
            $.springCloudAppId = springCloudAppId;
            return this;
        }

        /**
         * @param springCloudAppId Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudAppId(String springCloudAppId) {
            return springCloudAppId(Output.of(springCloudAppId));
        }

        public SpringCloudActiveDeploymentState build() {
            return $;
        }
    }

}