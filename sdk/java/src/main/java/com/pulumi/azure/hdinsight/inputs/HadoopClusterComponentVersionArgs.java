// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class HadoopClusterComponentVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HadoopClusterComponentVersionArgs Empty = new HadoopClusterComponentVersionArgs();

    /**
     * The version of Hadoop which should be used for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="hadoop", required=true)
    private Output<String> hadoop;

    /**
     * @return The version of Hadoop which should be used for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> hadoop() {
        return this.hadoop;
    }

    private HadoopClusterComponentVersionArgs() {}

    private HadoopClusterComponentVersionArgs(HadoopClusterComponentVersionArgs $) {
        this.hadoop = $.hadoop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HadoopClusterComponentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopClusterComponentVersionArgs $;

        public Builder() {
            $ = new HadoopClusterComponentVersionArgs();
        }

        public Builder(HadoopClusterComponentVersionArgs defaults) {
            $ = new HadoopClusterComponentVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hadoop The version of Hadoop which should be used for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hadoop(Output<String> hadoop) {
            $.hadoop = hadoop;
            return this;
        }

        /**
         * @param hadoop The version of Hadoop which should be used for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hadoop(String hadoop) {
            return hadoop(Output.of(hadoop));
        }

        public HadoopClusterComponentVersionArgs build() {
            $.hadoop = Objects.requireNonNull($.hadoop, "expected parameter 'hadoop' to be non-null");
            return $;
        }
    }

}