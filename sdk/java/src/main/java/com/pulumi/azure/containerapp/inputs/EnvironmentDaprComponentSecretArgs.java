// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentDaprComponentSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentDaprComponentSecretArgs Empty = new EnvironmentDaprComponentSecretArgs();

    /**
     * The Secret name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Secret name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value for this secret.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value for this secret.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EnvironmentDaprComponentSecretArgs() {}

    private EnvironmentDaprComponentSecretArgs(EnvironmentDaprComponentSecretArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentDaprComponentSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentDaprComponentSecretArgs $;

        public Builder() {
            $ = new EnvironmentDaprComponentSecretArgs();
        }

        public Builder(EnvironmentDaprComponentSecretArgs defaults) {
            $ = new EnvironmentDaprComponentSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Secret name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Secret name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value for this secret.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for this secret.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnvironmentDaprComponentSecretArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}