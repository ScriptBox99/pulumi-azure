// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.apimanagement.inputs.LoggerApplicationInsightsArgs;
import com.pulumi.azure.apimanagement.inputs.LoggerEventhubArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggerArgs Empty = new LoggerArgs();

    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * An `application_insights` block as documented below.
     * 
     */
    @Import(name="applicationInsights")
    private @Nullable Output<LoggerApplicationInsightsArgs> applicationInsights;

    /**
     * @return An `application_insights` block as documented below.
     * 
     */
    public Optional<Output<LoggerApplicationInsightsArgs>> applicationInsights() {
        return Optional.ofNullable(this.applicationInsights);
    }

    /**
     * Specifies whether records should be buffered in the Logger prior to publishing. Defaults to `true`.
     * 
     */
    @Import(name="buffered")
    private @Nullable Output<Boolean> buffered;

    /**
     * @return Specifies whether records should be buffered in the Logger prior to publishing. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> buffered() {
        return Optional.ofNullable(this.buffered);
    }

    /**
     * A description of this Logger.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this Logger.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An `eventhub` block as documented below.
     * 
     */
    @Import(name="eventhub")
    private @Nullable Output<LoggerEventhubArgs> eventhub;

    /**
     * @return An `eventhub` block as documented below.
     * 
     */
    public Optional<Output<LoggerEventhubArgs>> eventhub() {
        return Optional.ofNullable(this.eventhub);
    }

    /**
     * The name of this Logger, which must be unique within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this Logger, which must be unique within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The target resource id which will be linked in the API-Management portal page.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The target resource id which will be linked in the API-Management portal page.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private LoggerArgs() {}

    private LoggerArgs(LoggerArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.applicationInsights = $.applicationInsights;
        this.buffered = $.buffered;
        this.description = $.description;
        this.eventhub = $.eventhub;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggerArgs $;

        public Builder() {
            $ = new LoggerArgs();
        }

        public Builder(LoggerArgs defaults) {
            $ = new LoggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param applicationInsights An `application_insights` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder applicationInsights(@Nullable Output<LoggerApplicationInsightsArgs> applicationInsights) {
            $.applicationInsights = applicationInsights;
            return this;
        }

        /**
         * @param applicationInsights An `application_insights` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder applicationInsights(LoggerApplicationInsightsArgs applicationInsights) {
            return applicationInsights(Output.of(applicationInsights));
        }

        /**
         * @param buffered Specifies whether records should be buffered in the Logger prior to publishing. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder buffered(@Nullable Output<Boolean> buffered) {
            $.buffered = buffered;
            return this;
        }

        /**
         * @param buffered Specifies whether records should be buffered in the Logger prior to publishing. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder buffered(Boolean buffered) {
            return buffered(Output.of(buffered));
        }

        /**
         * @param description A description of this Logger.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this Logger.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eventhub An `eventhub` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder eventhub(@Nullable Output<LoggerEventhubArgs> eventhub) {
            $.eventhub = eventhub;
            return this;
        }

        /**
         * @param eventhub An `eventhub` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder eventhub(LoggerEventhubArgs eventhub) {
            return eventhub(Output.of(eventhub));
        }

        /**
         * @param name The name of this Logger, which must be unique within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Logger, which must be unique within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceId The target resource id which will be linked in the API-Management portal page.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The target resource id which will be linked in the API-Management portal page.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public LoggerArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}