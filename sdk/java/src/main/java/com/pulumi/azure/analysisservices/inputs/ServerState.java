// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.analysisservices.inputs;

import com.pulumi.azure.analysisservices.inputs.ServerIpv4FirewallRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerState extends com.pulumi.resources.ResourceArgs {

    public static final ServerState Empty = new ServerState();

    /**
     * List of email addresses of admin users.
     * 
     */
    @Import(name="adminUsers")
    private @Nullable Output<List<String>> adminUsers;

    /**
     * @return List of email addresses of admin users.
     * 
     */
    public Optional<Output<List<String>>> adminUsers() {
        return Optional.ofNullable(this.adminUsers);
    }

    /**
     * URI and SAS token for a blob container to store backups.
     * 
     */
    @Import(name="backupBlobContainerUri")
    private @Nullable Output<String> backupBlobContainerUri;

    /**
     * @return URI and SAS token for a blob container to store backups.
     * 
     */
    public Optional<Output<String>> backupBlobContainerUri() {
        return Optional.ofNullable(this.backupBlobContainerUri);
    }

    /**
     * Indicates if the Power BI service is allowed to access or not.
     * 
     */
    @Import(name="enablePowerBiService")
    private @Nullable Output<Boolean> enablePowerBiService;

    /**
     * @return Indicates if the Power BI service is allowed to access or not.
     * 
     */
    public Optional<Output<Boolean>> enablePowerBiService() {
        return Optional.ofNullable(this.enablePowerBiService);
    }

    /**
     * One or more `ipv4_firewall_rule` block(s) as defined below.
     * 
     */
    @Import(name="ipv4FirewallRules")
    private @Nullable Output<List<ServerIpv4FirewallRuleArgs>> ipv4FirewallRules;

    /**
     * @return One or more `ipv4_firewall_rule` block(s) as defined below.
     * 
     */
    public Optional<Output<List<ServerIpv4FirewallRuleArgs>>> ipv4FirewallRules() {
        return Optional.ofNullable(this.ipv4FirewallRules);
    }

    /**
     * The Azure location where the Analysis Services Server exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location where the Analysis Services Server exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the firewall rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the firewall rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Controls how the read-write server is used in the query pool. If this value is set to `All` then read-write servers are also used for queries. Otherwise with `ReadOnly` these servers do not participate in query operations.
     * 
     */
    @Import(name="querypoolConnectionMode")
    private @Nullable Output<String> querypoolConnectionMode;

    /**
     * @return Controls how the read-write server is used in the query pool. If this value is set to `All` then read-write servers are also used for queries. Otherwise with `ReadOnly` these servers do not participate in query operations.
     * 
     */
    public Optional<Output<String>> querypoolConnectionMode() {
        return Optional.ofNullable(this.querypoolConnectionMode);
    }

    /**
     * The name of the Resource Group in which the Analysis Services Server should be exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Analysis Services Server should be exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The full name of the Analysis Services Server.
     * 
     */
    @Import(name="serverFullName")
    private @Nullable Output<String> serverFullName;

    /**
     * @return The full name of the Analysis Services Server.
     * 
     */
    public Optional<Output<String>> serverFullName() {
        return Optional.ofNullable(this.serverFullName);
    }

    /**
     * SKU for the Analysis Services Server. Possible values are: `D1`, `B1`, `B2`, `S0`, `S1`, `S2`, `S4`, `S8`, `S9`, `S8v2` and `S9v2`.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return SKU for the Analysis Services Server. Possible values are: `D1`, `B1`, `B2`, `S0`, `S1`, `S2`, `S4`, `S8`, `S9`, `S8v2` and `S9v2`.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ServerState() {}

    private ServerState(ServerState $) {
        this.adminUsers = $.adminUsers;
        this.backupBlobContainerUri = $.backupBlobContainerUri;
        this.enablePowerBiService = $.enablePowerBiService;
        this.ipv4FirewallRules = $.ipv4FirewallRules;
        this.location = $.location;
        this.name = $.name;
        this.querypoolConnectionMode = $.querypoolConnectionMode;
        this.resourceGroupName = $.resourceGroupName;
        this.serverFullName = $.serverFullName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerState $;

        public Builder() {
            $ = new ServerState();
        }

        public Builder(ServerState defaults) {
            $ = new ServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminUsers List of email addresses of admin users.
         * 
         * @return builder
         * 
         */
        public Builder adminUsers(@Nullable Output<List<String>> adminUsers) {
            $.adminUsers = adminUsers;
            return this;
        }

        /**
         * @param adminUsers List of email addresses of admin users.
         * 
         * @return builder
         * 
         */
        public Builder adminUsers(List<String> adminUsers) {
            return adminUsers(Output.of(adminUsers));
        }

        /**
         * @param adminUsers List of email addresses of admin users.
         * 
         * @return builder
         * 
         */
        public Builder adminUsers(String... adminUsers) {
            return adminUsers(List.of(adminUsers));
        }

        /**
         * @param backupBlobContainerUri URI and SAS token for a blob container to store backups.
         * 
         * @return builder
         * 
         */
        public Builder backupBlobContainerUri(@Nullable Output<String> backupBlobContainerUri) {
            $.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }

        /**
         * @param backupBlobContainerUri URI and SAS token for a blob container to store backups.
         * 
         * @return builder
         * 
         */
        public Builder backupBlobContainerUri(String backupBlobContainerUri) {
            return backupBlobContainerUri(Output.of(backupBlobContainerUri));
        }

        /**
         * @param enablePowerBiService Indicates if the Power BI service is allowed to access or not.
         * 
         * @return builder
         * 
         */
        public Builder enablePowerBiService(@Nullable Output<Boolean> enablePowerBiService) {
            $.enablePowerBiService = enablePowerBiService;
            return this;
        }

        /**
         * @param enablePowerBiService Indicates if the Power BI service is allowed to access or not.
         * 
         * @return builder
         * 
         */
        public Builder enablePowerBiService(Boolean enablePowerBiService) {
            return enablePowerBiService(Output.of(enablePowerBiService));
        }

        /**
         * @param ipv4FirewallRules One or more `ipv4_firewall_rule` block(s) as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipv4FirewallRules(@Nullable Output<List<ServerIpv4FirewallRuleArgs>> ipv4FirewallRules) {
            $.ipv4FirewallRules = ipv4FirewallRules;
            return this;
        }

        /**
         * @param ipv4FirewallRules One or more `ipv4_firewall_rule` block(s) as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipv4FirewallRules(List<ServerIpv4FirewallRuleArgs> ipv4FirewallRules) {
            return ipv4FirewallRules(Output.of(ipv4FirewallRules));
        }

        /**
         * @param ipv4FirewallRules One or more `ipv4_firewall_rule` block(s) as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipv4FirewallRules(ServerIpv4FirewallRuleArgs... ipv4FirewallRules) {
            return ipv4FirewallRules(List.of(ipv4FirewallRules));
        }

        /**
         * @param location The Azure location where the Analysis Services Server exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location where the Analysis Services Server exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param querypoolConnectionMode Controls how the read-write server is used in the query pool. If this value is set to `All` then read-write servers are also used for queries. Otherwise with `ReadOnly` these servers do not participate in query operations.
         * 
         * @return builder
         * 
         */
        public Builder querypoolConnectionMode(@Nullable Output<String> querypoolConnectionMode) {
            $.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }

        /**
         * @param querypoolConnectionMode Controls how the read-write server is used in the query pool. If this value is set to `All` then read-write servers are also used for queries. Otherwise with `ReadOnly` these servers do not participate in query operations.
         * 
         * @return builder
         * 
         */
        public Builder querypoolConnectionMode(String querypoolConnectionMode) {
            return querypoolConnectionMode(Output.of(querypoolConnectionMode));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Analysis Services Server should be exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Analysis Services Server should be exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverFullName The full name of the Analysis Services Server.
         * 
         * @return builder
         * 
         */
        public Builder serverFullName(@Nullable Output<String> serverFullName) {
            $.serverFullName = serverFullName;
            return this;
        }

        /**
         * @param serverFullName The full name of the Analysis Services Server.
         * 
         * @return builder
         * 
         */
        public Builder serverFullName(String serverFullName) {
            return serverFullName(Output.of(serverFullName));
        }

        /**
         * @param sku SKU for the Analysis Services Server. Possible values are: `D1`, `B1`, `B2`, `S0`, `S1`, `S2`, `S4`, `S8`, `S9`, `S8v2` and `S9v2`.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU for the Analysis Services Server. Possible values are: `D1`, `B1`, `B2`, `S0`, `S1`, `S2`, `S4`, `S8`, `S9`, `S8v2` and `S9v2`.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ServerState build() {
            return $;
        }
    }

}