// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InteractiveQueryClusterComputeIsolationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InteractiveQueryClusterComputeIsolationArgs Empty = new InteractiveQueryClusterComputeIsolationArgs();

    /**
     * This field indicates whether enable compute isolation or not. Possible values are `true` or `false`.
     * 
     */
    @Import(name="computeIsolationEnabled")
    private @Nullable Output<Boolean> computeIsolationEnabled;

    /**
     * @return This field indicates whether enable compute isolation or not. Possible values are `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> computeIsolationEnabled() {
        return Optional.ofNullable(this.computeIsolationEnabled);
    }

    /**
     * The name of the host SKU.
     * 
     */
    @Import(name="hostSku")
    private @Nullable Output<String> hostSku;

    /**
     * @return The name of the host SKU.
     * 
     */
    public Optional<Output<String>> hostSku() {
        return Optional.ofNullable(this.hostSku);
    }

    private InteractiveQueryClusterComputeIsolationArgs() {}

    private InteractiveQueryClusterComputeIsolationArgs(InteractiveQueryClusterComputeIsolationArgs $) {
        this.computeIsolationEnabled = $.computeIsolationEnabled;
        this.hostSku = $.hostSku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InteractiveQueryClusterComputeIsolationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InteractiveQueryClusterComputeIsolationArgs $;

        public Builder() {
            $ = new InteractiveQueryClusterComputeIsolationArgs();
        }

        public Builder(InteractiveQueryClusterComputeIsolationArgs defaults) {
            $ = new InteractiveQueryClusterComputeIsolationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeIsolationEnabled This field indicates whether enable compute isolation or not. Possible values are `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder computeIsolationEnabled(@Nullable Output<Boolean> computeIsolationEnabled) {
            $.computeIsolationEnabled = computeIsolationEnabled;
            return this;
        }

        /**
         * @param computeIsolationEnabled This field indicates whether enable compute isolation or not. Possible values are `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder computeIsolationEnabled(Boolean computeIsolationEnabled) {
            return computeIsolationEnabled(Output.of(computeIsolationEnabled));
        }

        /**
         * @param hostSku The name of the host SKU.
         * 
         * @return builder
         * 
         */
        public Builder hostSku(@Nullable Output<String> hostSku) {
            $.hostSku = hostSku;
            return this;
        }

        /**
         * @param hostSku The name of the host SKU.
         * 
         * @return builder
         * 
         */
        public Builder hostSku(String hostSku) {
            return hostSku(Output.of(hostSku));
        }

        public InteractiveQueryClusterComputeIsolationArgs build() {
            return $;
        }
    }

}