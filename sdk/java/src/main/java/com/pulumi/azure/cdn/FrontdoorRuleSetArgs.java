// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorRuleSetArgs Empty = new FrontdoorRuleSetArgs();

    /**
     * The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
     * 
     */
    @Import(name="cdnFrontdoorProfileId", required=true)
    private Output<String> cdnFrontdoorProfileId;

    /**
     * @return The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
     * 
     */
    public Output<String> cdnFrontdoorProfileId() {
        return this.cdnFrontdoorProfileId;
    }

    /**
     * The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FrontdoorRuleSetArgs() {}

    private FrontdoorRuleSetArgs(FrontdoorRuleSetArgs $) {
        this.cdnFrontdoorProfileId = $.cdnFrontdoorProfileId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorRuleSetArgs $;

        public Builder() {
            $ = new FrontdoorRuleSetArgs();
        }

        public Builder(FrontdoorRuleSetArgs defaults) {
            $ = new FrontdoorRuleSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdnFrontdoorProfileId The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileId(Output<String> cdnFrontdoorProfileId) {
            $.cdnFrontdoorProfileId = cdnFrontdoorProfileId;
            return this;
        }

        /**
         * @param cdnFrontdoorProfileId The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileId(String cdnFrontdoorProfileId) {
            return cdnFrontdoorProfileId(Output.of(cdnFrontdoorProfileId));
        }

        /**
         * @param name The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FrontdoorRuleSetArgs build() {
            $.cdnFrontdoorProfileId = Objects.requireNonNull($.cdnFrontdoorProfileId, "expected parameter 'cdnFrontdoorProfileId' to be non-null");
            return $;
        }
    }

}