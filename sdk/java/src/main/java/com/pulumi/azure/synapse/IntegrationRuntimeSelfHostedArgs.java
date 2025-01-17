// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationRuntimeSelfHostedArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeSelfHostedArgs Empty = new IntegrationRuntimeSelfHostedArgs();

    /**
     * Integration runtime description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Integration runtime description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    @Import(name="synapseWorkspaceId", required=true)
    private Output<String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }

    private IntegrationRuntimeSelfHostedArgs() {}

    private IntegrationRuntimeSelfHostedArgs(IntegrationRuntimeSelfHostedArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.synapseWorkspaceId = $.synapseWorkspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeSelfHostedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeSelfHostedArgs $;

        public Builder() {
            $ = new IntegrationRuntimeSelfHostedArgs();
        }

        public Builder(IntegrationRuntimeSelfHostedArgs defaults) {
            $ = new IntegrationRuntimeSelfHostedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(Output<String> synapseWorkspaceId) {
            $.synapseWorkspaceId = synapseWorkspaceId;
            return this;
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(String synapseWorkspaceId) {
            return synapseWorkspaceId(Output.of(synapseWorkspaceId));
        }

        public IntegrationRuntimeSelfHostedArgs build() {
            $.synapseWorkspaceId = Objects.requireNonNull($.synapseWorkspaceId, "expected parameter 'synapseWorkspaceId' to be non-null");
            return $;
        }
    }

}
