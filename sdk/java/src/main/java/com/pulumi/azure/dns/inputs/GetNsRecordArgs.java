// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNsRecordArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNsRecordArgs Empty = new GetNsRecordArgs();

    /**
     * The name of the DNS NS Record.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the DNS NS Record.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the resource group where the DNS Zone (parent resource) exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the DNS Zone (parent resource) exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the DNS Zone where the resource exists.
     * 
     */
    @Import(name="zoneName", required=true)
    private Output<String> zoneName;

    /**
     * @return Specifies the DNS Zone where the resource exists.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    private GetNsRecordArgs() {}

    private GetNsRecordArgs(GetNsRecordArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNsRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNsRecordArgs $;

        public Builder() {
            $ = new GetNsRecordArgs();
        }

        public Builder(GetNsRecordArgs defaults) {
            $ = new GetNsRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the DNS NS Record.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the DNS NS Record.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the resource group where the DNS Zone (parent resource) exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the resource group where the DNS Zone (parent resource) exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param zoneName Specifies the DNS Zone where the resource exists.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(Output<String> zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        /**
         * @param zoneName Specifies the DNS Zone where the resource exists.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            return zoneName(Output.of(zoneName));
        }

        public GetNsRecordArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.zoneName = Objects.requireNonNull($.zoneName, "expected parameter 'zoneName' to be non-null");
            return $;
        }
    }

}