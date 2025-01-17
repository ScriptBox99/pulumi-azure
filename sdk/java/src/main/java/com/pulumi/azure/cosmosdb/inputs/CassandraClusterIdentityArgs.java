// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CassandraClusterIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CassandraClusterIdentityArgs Empty = new CassandraClusterIdentityArgs();

    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this Cassandra Cluster. The only possible value is `SystemAssigned`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Cassandra Cluster. The only possible value is `SystemAssigned`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CassandraClusterIdentityArgs() {}

    private CassandraClusterIdentityArgs(CassandraClusterIdentityArgs $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CassandraClusterIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CassandraClusterIdentityArgs $;

        public Builder() {
            $ = new CassandraClusterIdentityArgs();
        }

        public Builder(CassandraClusterIdentityArgs defaults) {
            $ = new CassandraClusterIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Cassandra Cluster. The only possible value is `SystemAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Cassandra Cluster. The only possible value is `SystemAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CassandraClusterIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
