// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyArgs Empty = new GetAccessPolicyArgs();

    /**
     * Specifies the name of the Management Template. Possible values are: `Key Management`,
     * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
     * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Management Template. Possible values are: `Key Management`,
     * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
     * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetAccessPolicyArgs() {}

    private GetAccessPolicyArgs(GetAccessPolicyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPolicyArgs $;

        public Builder() {
            $ = new GetAccessPolicyArgs();
        }

        public Builder(GetAccessPolicyArgs defaults) {
            $ = new GetAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Management Template. Possible values are: `Key Management`,
         * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
         * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Management Template. Possible values are: `Key Management`,
         * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
         * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAccessPolicyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}