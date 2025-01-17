// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigIpRestrictionHeadersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStandardSiteConfigIpRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetStandardSiteConfigIpRestrictionArgs Empty = new GetStandardSiteConfigIpRestrictionArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="headers", required=true)
    private Output<GetStandardSiteConfigIpRestrictionHeadersArgs> headers;

    public Output<GetStandardSiteConfigIpRestrictionHeadersArgs> headers() {
        return this.headers;
    }

    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The name of this Logic App.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Logic App.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="serviceTag")
    private @Nullable Output<String> serviceTag;

    public Optional<Output<String>> serviceTag() {
        return Optional.ofNullable(this.serviceTag);
    }

    @Import(name="virtualNetworkSubnetId")
    private @Nullable Output<String> virtualNetworkSubnetId;

    public Optional<Output<String>> virtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    private GetStandardSiteConfigIpRestrictionArgs() {}

    private GetStandardSiteConfigIpRestrictionArgs(GetStandardSiteConfigIpRestrictionArgs $) {
        this.action = $.action;
        this.headers = $.headers;
        this.ipAddress = $.ipAddress;
        this.name = $.name;
        this.priority = $.priority;
        this.serviceTag = $.serviceTag;
        this.virtualNetworkSubnetId = $.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardSiteConfigIpRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardSiteConfigIpRestrictionArgs $;

        public Builder() {
            $ = new GetStandardSiteConfigIpRestrictionArgs();
        }

        public Builder(GetStandardSiteConfigIpRestrictionArgs defaults) {
            $ = new GetStandardSiteConfigIpRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder headers(Output<GetStandardSiteConfigIpRestrictionHeadersArgs> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(GetStandardSiteConfigIpRestrictionHeadersArgs headers) {
            return headers(Output.of(headers));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param name The name of this Logic App.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Logic App.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder serviceTag(@Nullable Output<String> serviceTag) {
            $.serviceTag = serviceTag;
            return this;
        }

        public Builder serviceTag(String serviceTag) {
            return serviceTag(Output.of(serviceTag));
        }

        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            $.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            return virtualNetworkSubnetId(Output.of(virtualNetworkSubnetId));
        }

        public GetStandardSiteConfigIpRestrictionArgs build() {
            $.headers = Objects.requireNonNull($.headers, "expected parameter 'headers' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
