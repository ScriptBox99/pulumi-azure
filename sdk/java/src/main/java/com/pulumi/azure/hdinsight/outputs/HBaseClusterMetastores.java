// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.HBaseClusterMetastoresAmbari;
import com.pulumi.azure.hdinsight.outputs.HBaseClusterMetastoresHive;
import com.pulumi.azure.hdinsight.outputs.HBaseClusterMetastoresOozie;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HBaseClusterMetastores {
    /**
     * @return An `ambari` block as defined below.
     * 
     */
    private final @Nullable HBaseClusterMetastoresAmbari ambari;
    /**
     * @return A `hive` block as defined below.
     * 
     */
    private final @Nullable HBaseClusterMetastoresHive hive;
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    private final @Nullable HBaseClusterMetastoresOozie oozie;

    @CustomType.Constructor
    private HBaseClusterMetastores(
        @CustomType.Parameter("ambari") @Nullable HBaseClusterMetastoresAmbari ambari,
        @CustomType.Parameter("hive") @Nullable HBaseClusterMetastoresHive hive,
        @CustomType.Parameter("oozie") @Nullable HBaseClusterMetastoresOozie oozie) {
        this.ambari = ambari;
        this.hive = hive;
        this.oozie = oozie;
    }

    /**
     * @return An `ambari` block as defined below.
     * 
     */
    public Optional<HBaseClusterMetastoresAmbari> ambari() {
        return Optional.ofNullable(this.ambari);
    }
    /**
     * @return A `hive` block as defined below.
     * 
     */
    public Optional<HBaseClusterMetastoresHive> hive() {
        return Optional.ofNullable(this.hive);
    }
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    public Optional<HBaseClusterMetastoresOozie> oozie() {
        return Optional.ofNullable(this.oozie);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HBaseClusterMetastores defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HBaseClusterMetastoresAmbari ambari;
        private @Nullable HBaseClusterMetastoresHive hive;
        private @Nullable HBaseClusterMetastoresOozie oozie;

        public Builder() {
    	      // Empty
        }

        public Builder(HBaseClusterMetastores defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambari = defaults.ambari;
    	      this.hive = defaults.hive;
    	      this.oozie = defaults.oozie;
        }

        public Builder ambari(@Nullable HBaseClusterMetastoresAmbari ambari) {
            this.ambari = ambari;
            return this;
        }
        public Builder hive(@Nullable HBaseClusterMetastoresHive hive) {
            this.hive = hive;
            return this;
        }
        public Builder oozie(@Nullable HBaseClusterMetastoresOozie oozie) {
            this.oozie = oozie;
            return this;
        }        public HBaseClusterMetastores build() {
            return new HBaseClusterMetastores(ambari, hive, oozie);
        }
    }
}