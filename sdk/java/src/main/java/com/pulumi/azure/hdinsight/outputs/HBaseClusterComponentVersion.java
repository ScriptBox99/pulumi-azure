// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HBaseClusterComponentVersion {
    /**
     * @return The version of HBase which should be used for this HDInsight HBase Cluster. Changing this forces a new resource to be created.
     * 
     */
    private final String hbase;

    @CustomType.Constructor
    private HBaseClusterComponentVersion(@CustomType.Parameter("hbase") String hbase) {
        this.hbase = hbase;
    }

    /**
     * @return The version of HBase which should be used for this HDInsight HBase Cluster. Changing this forces a new resource to be created.
     * 
     */
    public String hbase() {
        return this.hbase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HBaseClusterComponentVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hbase;

        public Builder() {
    	      // Empty
        }

        public Builder(HBaseClusterComponentVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hbase = defaults.hbase;
        }

        public Builder hbase(String hbase) {
            this.hbase = Objects.requireNonNull(hbase);
            return this;
        }        public HBaseClusterComponentVersion build() {
            return new HBaseClusterComponentVersion(hbase);
        }
    }
}