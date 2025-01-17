// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkSimPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkSimPolicyPlainArgs Empty = new GetNetworkSimPolicyPlainArgs();

    /**
     * The ID of the Mobile Network which the Sim Policy belongs to.
     * 
     */
    @Import(name="mobileNetworkId", required=true)
    private String mobileNetworkId;

    /**
     * @return The ID of the Mobile Network which the Sim Policy belongs to.
     * 
     */
    public String mobileNetworkId() {
        return this.mobileNetworkId;
    }

    /**
     * The name which should be used for this Mobile Network Sim Policies.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name which should be used for this Mobile Network Sim Policies.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetNetworkSimPolicyPlainArgs() {}

    private GetNetworkSimPolicyPlainArgs(GetNetworkSimPolicyPlainArgs $) {
        this.mobileNetworkId = $.mobileNetworkId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkSimPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkSimPolicyPlainArgs $;

        public Builder() {
            $ = new GetNetworkSimPolicyPlainArgs();
        }

        public Builder(GetNetworkSimPolicyPlainArgs defaults) {
            $ = new GetNetworkSimPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkId The ID of the Mobile Network which the Sim Policy belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(String mobileNetworkId) {
            $.mobileNetworkId = mobileNetworkId;
            return this;
        }

        /**
         * @param name The name which should be used for this Mobile Network Sim Policies.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetNetworkSimPolicyPlainArgs build() {
            $.mobileNetworkId = Objects.requireNonNull($.mobileNetworkId, "expected parameter 'mobileNetworkId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
