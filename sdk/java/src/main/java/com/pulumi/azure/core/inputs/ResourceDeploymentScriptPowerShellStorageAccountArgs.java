// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourceDeploymentScriptPowerShellStorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDeploymentScriptPowerShellStorageAccountArgs Empty = new ResourceDeploymentScriptPowerShellStorageAccountArgs();

    /**
     * Specifies the storage account access key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Specifies the storage account access key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Specifies the storage account name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the storage account name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ResourceDeploymentScriptPowerShellStorageAccountArgs() {}

    private ResourceDeploymentScriptPowerShellStorageAccountArgs(ResourceDeploymentScriptPowerShellStorageAccountArgs $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceDeploymentScriptPowerShellStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceDeploymentScriptPowerShellStorageAccountArgs $;

        public Builder() {
            $ = new ResourceDeploymentScriptPowerShellStorageAccountArgs();
        }

        public Builder(ResourceDeploymentScriptPowerShellStorageAccountArgs defaults) {
            $ = new ResourceDeploymentScriptPowerShellStorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Specifies the storage account access key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Specifies the storage account access key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Specifies the storage account name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the storage account name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ResourceDeploymentScriptPowerShellStorageAccountArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}