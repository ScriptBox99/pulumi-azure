// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlDedicatedGatewayState extends com.pulumi.resources.ResourceArgs {

    public static final SqlDedicatedGatewayState Empty = new SqlDedicatedGatewayState();

    /**
     * The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="cosmosdbAccountId")
    private @Nullable Output<String> cosmosdbAccountId;

    /**
     * @return The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> cosmosdbAccountId() {
        return Optional.ofNullable(this.cosmosdbAccountId);
    }

    /**
     * The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
     * 
     */
    @Import(name="instanceSize")
    private @Nullable Output<String> instanceSize;

    /**
     * @return The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
     * 
     */
    public Optional<Output<String>> instanceSize() {
        return Optional.ofNullable(this.instanceSize);
    }

    private SqlDedicatedGatewayState() {}

    private SqlDedicatedGatewayState(SqlDedicatedGatewayState $) {
        this.cosmosdbAccountId = $.cosmosdbAccountId;
        this.instanceCount = $.instanceCount;
        this.instanceSize = $.instanceSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlDedicatedGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlDedicatedGatewayState $;

        public Builder() {
            $ = new SqlDedicatedGatewayState();
        }

        public Builder(SqlDedicatedGatewayState defaults) {
            $ = new SqlDedicatedGatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cosmosdbAccountId The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbAccountId(@Nullable Output<String> cosmosdbAccountId) {
            $.cosmosdbAccountId = cosmosdbAccountId;
            return this;
        }

        /**
         * @param cosmosdbAccountId The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbAccountId(String cosmosdbAccountId) {
            return cosmosdbAccountId(Output.of(cosmosdbAccountId));
        }

        /**
         * @param instanceCount The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param instanceSize The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
         * 
         * @return builder
         * 
         */
        public Builder instanceSize(@Nullable Output<String> instanceSize) {
            $.instanceSize = instanceSize;
            return this;
        }

        /**
         * @param instanceSize The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
         * 
         * @return builder
         * 
         */
        public Builder instanceSize(String instanceSize) {
            return instanceSize(Output.of(instanceSize));
        }

        public SqlDedicatedGatewayState build() {
            return $;
        }
    }

}