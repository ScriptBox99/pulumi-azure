// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.azure.media.inputs.AssetFilterTrackSelectionConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class AssetFilterTrackSelectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetFilterTrackSelectionArgs Empty = new AssetFilterTrackSelectionArgs();

    /**
     * One or more `condition` blocks as defined above.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<AssetFilterTrackSelectionConditionArgs>> conditions;

    /**
     * @return One or more `condition` blocks as defined above.
     * 
     */
    public Output<List<AssetFilterTrackSelectionConditionArgs>> conditions() {
        return this.conditions;
    }

    private AssetFilterTrackSelectionArgs() {}

    private AssetFilterTrackSelectionArgs(AssetFilterTrackSelectionArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetFilterTrackSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetFilterTrackSelectionArgs $;

        public Builder() {
            $ = new AssetFilterTrackSelectionArgs();
        }

        public Builder(AssetFilterTrackSelectionArgs defaults) {
            $ = new AssetFilterTrackSelectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions One or more `condition` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<List<AssetFilterTrackSelectionConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions One or more `condition` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<AssetFilterTrackSelectionConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions One or more `condition` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder conditions(AssetFilterTrackSelectionConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public AssetFilterTrackSelectionArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}