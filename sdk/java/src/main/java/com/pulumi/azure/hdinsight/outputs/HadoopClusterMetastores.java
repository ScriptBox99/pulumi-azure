// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.HadoopClusterMetastoresAmbari;
import com.pulumi.azure.hdinsight.outputs.HadoopClusterMetastoresHive;
import com.pulumi.azure.hdinsight.outputs.HadoopClusterMetastoresOozie;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HadoopClusterMetastores {
    /**
     * @return An `ambari` block as defined below.
     * 
     */
    private final @Nullable HadoopClusterMetastoresAmbari ambari;
    /**
     * @return A `hive` block as defined below.
     * 
     */
    private final @Nullable HadoopClusterMetastoresHive hive;
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    private final @Nullable HadoopClusterMetastoresOozie oozie;

    @CustomType.Constructor
    private HadoopClusterMetastores(
        @CustomType.Parameter("ambari") @Nullable HadoopClusterMetastoresAmbari ambari,
        @CustomType.Parameter("hive") @Nullable HadoopClusterMetastoresHive hive,
        @CustomType.Parameter("oozie") @Nullable HadoopClusterMetastoresOozie oozie) {
        this.ambari = ambari;
        this.hive = hive;
        this.oozie = oozie;
    }

    /**
     * @return An `ambari` block as defined below.
     * 
     */
    public Optional<HadoopClusterMetastoresAmbari> ambari() {
        return Optional.ofNullable(this.ambari);
    }
    /**
     * @return A `hive` block as defined below.
     * 
     */
    public Optional<HadoopClusterMetastoresHive> hive() {
        return Optional.ofNullable(this.hive);
    }
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    public Optional<HadoopClusterMetastoresOozie> oozie() {
        return Optional.ofNullable(this.oozie);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HadoopClusterMetastores defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HadoopClusterMetastoresAmbari ambari;
        private @Nullable HadoopClusterMetastoresHive hive;
        private @Nullable HadoopClusterMetastoresOozie oozie;

        public Builder() {
    	      // Empty
        }

        public Builder(HadoopClusterMetastores defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambari = defaults.ambari;
    	      this.hive = defaults.hive;
    	      this.oozie = defaults.oozie;
        }

        public Builder ambari(@Nullable HadoopClusterMetastoresAmbari ambari) {
            this.ambari = ambari;
            return this;
        }
        public Builder hive(@Nullable HadoopClusterMetastoresHive hive) {
            this.hive = hive;
            return this;
        }
        public Builder oozie(@Nullable HadoopClusterMetastoresOozie oozie) {
            this.oozie = oozie;
            return this;
        }        public HadoopClusterMetastores build() {
            return new HadoopClusterMetastores(ambari, hive, oozie);
        }
    }
}