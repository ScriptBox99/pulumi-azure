// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetElasticPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetElasticPoolArgs Empty = new GetElasticPoolArgs();

    /**
     * The name of the elastic pool.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the elastic pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group which contains the elastic pool.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group which contains the elastic pool.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SQL Server which contains the elastic pool.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the SQL Server which contains the elastic pool.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private GetElasticPoolArgs() {}

    private GetElasticPoolArgs(GetElasticPoolArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetElasticPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetElasticPoolArgs $;

        public Builder() {
            $ = new GetElasticPoolArgs();
        }

        public Builder(GetElasticPoolArgs defaults) {
            $ = new GetElasticPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the elastic pool.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the elastic pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group which contains the elastic pool.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group which contains the elastic pool.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the SQL Server which contains the elastic pool.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the SQL Server which contains the elastic pool.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GetElasticPoolArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}