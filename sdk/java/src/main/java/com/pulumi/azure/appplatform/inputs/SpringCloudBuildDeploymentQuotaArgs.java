// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudBuildDeploymentQuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudBuildDeploymentQuotaArgs Empty = new SpringCloudBuildDeploymentQuotaArgs();

    /**
     * Specifies the required cpu of the Spring Cloud Deployment. Possible Values are `500m`, `1`, `2`, `3` and `4`. Defaults to `1` if not specified.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<String> cpu;

    /**
     * @return Specifies the required cpu of the Spring Cloud Deployment. Possible Values are `500m`, `1`, `2`, `3` and `4`. Defaults to `1` if not specified.
     * 
     */
    public Optional<Output<String>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Specifies the required memory size of the Spring Cloud Deployment. Possible Values are `512Mi`, `1Gi`, `2Gi`, `3Gi`, `4Gi`, `5Gi`, `6Gi`, `7Gi`, and `8Gi`. Defaults to `1Gi` if not specified.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<String> memory;

    /**
     * @return Specifies the required memory size of the Spring Cloud Deployment. Possible Values are `512Mi`, `1Gi`, `2Gi`, `3Gi`, `4Gi`, `5Gi`, `6Gi`, `7Gi`, and `8Gi`. Defaults to `1Gi` if not specified.
     * 
     */
    public Optional<Output<String>> memory() {
        return Optional.ofNullable(this.memory);
    }

    private SpringCloudBuildDeploymentQuotaArgs() {}

    private SpringCloudBuildDeploymentQuotaArgs(SpringCloudBuildDeploymentQuotaArgs $) {
        this.cpu = $.cpu;
        this.memory = $.memory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudBuildDeploymentQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudBuildDeploymentQuotaArgs $;

        public Builder() {
            $ = new SpringCloudBuildDeploymentQuotaArgs();
        }

        public Builder(SpringCloudBuildDeploymentQuotaArgs defaults) {
            $ = new SpringCloudBuildDeploymentQuotaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu Specifies the required cpu of the Spring Cloud Deployment. Possible Values are `500m`, `1`, `2`, `3` and `4`. Defaults to `1` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<String> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu Specifies the required cpu of the Spring Cloud Deployment. Possible Values are `500m`, `1`, `2`, `3` and `4`. Defaults to `1` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder cpu(String cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param memory Specifies the required memory size of the Spring Cloud Deployment. Possible Values are `512Mi`, `1Gi`, `2Gi`, `3Gi`, `4Gi`, `5Gi`, `6Gi`, `7Gi`, and `8Gi`. Defaults to `1Gi` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<String> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory Specifies the required memory size of the Spring Cloud Deployment. Possible Values are `512Mi`, `1Gi`, `2Gi`, `3Gi`, `4Gi`, `5Gi`, `6Gi`, `7Gi`, and `8Gi`. Defaults to `1Gi` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder memory(String memory) {
            return memory(Output.of(memory));
        }

        public SpringCloudBuildDeploymentQuotaArgs build() {
            return $;
        }
    }

}