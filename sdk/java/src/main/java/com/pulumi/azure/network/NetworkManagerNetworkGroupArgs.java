// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerNetworkGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkManagerNetworkGroupArgs Empty = new NetworkManagerNetworkGroupArgs();

    /**
     * A description of the Network Manager Network Group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Network Manager Network Group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name which should be used for this Network Manager Network Group. Changing this forces a new Network Manager Network Group to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Manager Network Group. Changing this forces a new Network Manager Network Group to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the Network Manager. Changing this forces a new Network Manager Network Group to be created.
     * 
     */
    @Import(name="networkManagerId", required=true)
    private Output<String> networkManagerId;

    /**
     * @return Specifies the ID of the Network Manager. Changing this forces a new Network Manager Network Group to be created.
     * 
     */
    public Output<String> networkManagerId() {
        return this.networkManagerId;
    }

    private NetworkManagerNetworkGroupArgs() {}

    private NetworkManagerNetworkGroupArgs(NetworkManagerNetworkGroupArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.networkManagerId = $.networkManagerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerNetworkGroupArgs $;

        public Builder() {
            $ = new NetworkManagerNetworkGroupArgs();
        }

        public Builder(NetworkManagerNetworkGroupArgs defaults) {
            $ = new NetworkManagerNetworkGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the Network Manager Network Group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Network Manager Network Group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager Network Group. Changing this forces a new Network Manager Network Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager Network Group. Changing this forces a new Network Manager Network Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager. Changing this forces a new Network Manager Network Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(Output<String> networkManagerId) {
            $.networkManagerId = networkManagerId;
            return this;
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager. Changing this forces a new Network Manager Network Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(String networkManagerId) {
            return networkManagerId(Output.of(networkManagerId));
        }

        public NetworkManagerNetworkGroupArgs build() {
            $.networkManagerId = Objects.requireNonNull($.networkManagerId, "expected parameter 'networkManagerId' to be non-null");
            return $;
        }
    }

}
