// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlStoredProcedureArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlStoredProcedureArgs Empty = new SqlStoredProcedureArgs();

    /**
     * The name of the Cosmos DB Account to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Cosmos DB Account to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The body of the stored procedure.
     * 
     */
    @Import(name="body", required=true)
    private Output<String> body;

    /**
     * @return The body of the stored procedure.
     * 
     */
    public Output<String> body() {
        return this.body;
    }

    /**
     * The name of the Cosmos DB SQL Container to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return The name of the Cosmos DB SQL Container to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The name of the Cosmos DB SQL Database to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the Cosmos DB SQL Database to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Specifies the name of the Cosmos DB SQL Stored Procedure. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB SQL Stored Procedure. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private SqlStoredProcedureArgs() {}

    private SqlStoredProcedureArgs(SqlStoredProcedureArgs $) {
        this.accountName = $.accountName;
        this.body = $.body;
        this.containerName = $.containerName;
        this.databaseName = $.databaseName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlStoredProcedureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlStoredProcedureArgs $;

        public Builder() {
            $ = new SqlStoredProcedureArgs();
        }

        public Builder(SqlStoredProcedureArgs defaults) {
            $ = new SqlStoredProcedureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Cosmos DB Account to create the stored procedure within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Cosmos DB Account to create the stored procedure within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param body The body of the stored procedure.
         * 
         * @return builder
         * 
         */
        public Builder body(Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body The body of the stored procedure.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param containerName The name of the Cosmos DB SQL Container to create the stored procedure within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of the Cosmos DB SQL Container to create the stored procedure within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param databaseName The name of the Cosmos DB SQL Database to create the stored procedure within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the Cosmos DB SQL Database to create the stored procedure within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param name Specifies the name of the Cosmos DB SQL Stored Procedure. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Cosmos DB SQL Stored Procedure. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public SqlStoredProcedureArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.body = Objects.requireNonNull($.body, "expected parameter 'body' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}