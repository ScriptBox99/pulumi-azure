// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorSecretArgs Empty = new FrontdoorSecretArgs();

    /**
     * The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="cdnFrontdoorProfileId", required=true)
    private Output<String> cdnFrontdoorProfileId;

    /**
     * @return The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Output<String> cdnFrontdoorProfileId() {
        return this.cdnFrontdoorProfileId;
    }

    /**
     * The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="secret", required=true)
    private Output<FrontdoorSecretSecretArgs> secret;

    /**
     * @return A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Output<FrontdoorSecretSecretArgs> secret() {
        return this.secret;
    }

    private FrontdoorSecretArgs() {}

    private FrontdoorSecretArgs(FrontdoorSecretArgs $) {
        this.cdnFrontdoorProfileId = $.cdnFrontdoorProfileId;
        this.name = $.name;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorSecretArgs $;

        public Builder() {
            $ = new FrontdoorSecretArgs();
        }

        public Builder(FrontdoorSecretArgs defaults) {
            $ = new FrontdoorSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdnFrontdoorProfileId The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileId(Output<String> cdnFrontdoorProfileId) {
            $.cdnFrontdoorProfileId = cdnFrontdoorProfileId;
            return this;
        }

        /**
         * @param cdnFrontdoorProfileId The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileId(String cdnFrontdoorProfileId) {
            return cdnFrontdoorProfileId(Output.of(cdnFrontdoorProfileId));
        }

        /**
         * @param name The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<FrontdoorSecretSecretArgs> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder secret(FrontdoorSecretSecretArgs secret) {
            return secret(Output.of(secret));
        }

        public FrontdoorSecretArgs build() {
            $.cdnFrontdoorProfileId = Objects.requireNonNull($.cdnFrontdoorProfileId, "expected parameter 'cdnFrontdoorProfileId' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}