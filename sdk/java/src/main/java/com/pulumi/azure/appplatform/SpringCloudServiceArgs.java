// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudServiceArgs Empty = new SpringCloudServiceArgs();

    /**
     * Specifies the size for this Spring Cloud Service&#39;s default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`.
     * 
     */
    @Import(name="buildAgentPoolSize")
    private @Nullable Output<String> buildAgentPoolSize;

    /**
     * @return Specifies the size for this Spring Cloud Service&#39;s default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`.
     * 
     */
    public Optional<Output<String>> buildAgentPoolSize() {
        return Optional.ofNullable(this.buildAgentPoolSize);
    }

    /**
     * A `config_server_git_setting` block as defined below.
     * 
     */
    @Import(name="configServerGitSetting")
    private @Nullable Output<SpringCloudServiceConfigServerGitSettingArgs> configServerGitSetting;

    /**
     * @return A `config_server_git_setting` block as defined below.
     * 
     */
    public Optional<Output<SpringCloudServiceConfigServerGitSettingArgs>> configServerGitSetting() {
        return Optional.ofNullable(this.configServerGitSetting);
    }

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
     * Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="network")
    private @Nullable Output<SpringCloudServiceNetworkArgs> network;

    /**
     * @return A `network` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<SpringCloudServiceNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Whether enable the default Service Registry.
     * 
     */
    @Import(name="serviceRegistryEnabled")
    private @Nullable Output<Boolean> serviceRegistryEnabled;

    /**
     * @return Whether enable the default Service Registry.
     * 
     */
    public Optional<Output<Boolean>> serviceRegistryEnabled() {
        return Optional.ofNullable(this.serviceRegistryEnabled);
    }

    /**
     * Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A `trace` block as defined below.
     * 
     */
    @Import(name="trace")
    private @Nullable Output<SpringCloudServiceTraceArgs> trace;

    /**
     * @return A `trace` block as defined below.
     * 
     */
    public Optional<Output<SpringCloudServiceTraceArgs>> trace() {
        return Optional.ofNullable(this.trace);
    }

    /**
     * Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    /**
     * @return Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private SpringCloudServiceArgs() {}

    private SpringCloudServiceArgs(SpringCloudServiceArgs $) {
        this.buildAgentPoolSize = $.buildAgentPoolSize;
        this.configServerGitSetting = $.configServerGitSetting;
        this.location = $.location;
        this.name = $.name;
        this.network = $.network;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceRegistryEnabled = $.serviceRegistryEnabled;
        this.skuName = $.skuName;
        this.tags = $.tags;
        this.trace = $.trace;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudServiceArgs $;

        public Builder() {
            $ = new SpringCloudServiceArgs();
        }

        public Builder(SpringCloudServiceArgs defaults) {
            $ = new SpringCloudServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildAgentPoolSize Specifies the size for this Spring Cloud Service&#39;s default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`.
         * 
         * @return builder
         * 
         */
        public Builder buildAgentPoolSize(@Nullable Output<String> buildAgentPoolSize) {
            $.buildAgentPoolSize = buildAgentPoolSize;
            return this;
        }

        /**
         * @param buildAgentPoolSize Specifies the size for this Spring Cloud Service&#39;s default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`.
         * 
         * @return builder
         * 
         */
        public Builder buildAgentPoolSize(String buildAgentPoolSize) {
            return buildAgentPoolSize(Output.of(buildAgentPoolSize));
        }

        /**
         * @param configServerGitSetting A `config_server_git_setting` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder configServerGitSetting(@Nullable Output<SpringCloudServiceConfigServerGitSettingArgs> configServerGitSetting) {
            $.configServerGitSetting = configServerGitSetting;
            return this;
        }

        /**
         * @param configServerGitSetting A `config_server_git_setting` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder configServerGitSetting(SpringCloudServiceConfigServerGitSettingArgs configServerGitSetting) {
            return configServerGitSetting(Output.of(configServerGitSetting));
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
         * @param name Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network A `network` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<SpringCloudServiceNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network A `network` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder network(SpringCloudServiceNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param resourceGroupName Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceRegistryEnabled Whether enable the default Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistryEnabled(@Nullable Output<Boolean> serviceRegistryEnabled) {
            $.serviceRegistryEnabled = serviceRegistryEnabled;
            return this;
        }

        /**
         * @param serviceRegistryEnabled Whether enable the default Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistryEnabled(Boolean serviceRegistryEnabled) {
            return serviceRegistryEnabled(Output.of(serviceRegistryEnabled));
        }

        /**
         * @param skuName Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param trace A `trace` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trace(@Nullable Output<SpringCloudServiceTraceArgs> trace) {
            $.trace = trace;
            return this;
        }

        /**
         * @param trace A `trace` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trace(SpringCloudServiceTraceArgs trace) {
            return trace(Output.of(trace));
        }

        /**
         * @param zoneRedundant Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        /**
         * @param zoneRedundant Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(Boolean zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public SpringCloudServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}