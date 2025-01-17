// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorDatadogOrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorDatadogOrganizationArgs Empty = new MonitorDatadogOrganizationArgs();

    /**
     * Api key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return Api key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * Application key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="applicationKey", required=true)
    private Output<String> applicationKey;

    /**
     * @return Application key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Output<String> applicationKey() {
        return this.applicationKey;
    }

    /**
     * The ID of the enterprise_app. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="enterpriseAppId")
    private @Nullable Output<String> enterpriseAppId;

    /**
     * @return The ID of the enterprise_app. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> enterpriseAppId() {
        return Optional.ofNullable(this.enterpriseAppId);
    }

    /**
     * The ID of the Datadog Monitor.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Datadog Monitor.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The auth code used to linking to an existing Datadog organization. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="linkingAuthCode")
    private @Nullable Output<String> linkingAuthCode;

    /**
     * @return The auth code used to linking to an existing Datadog organization. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Optional<Output<String>> linkingAuthCode() {
        return Optional.ofNullable(this.linkingAuthCode);
    }

    /**
     * The ID of the linking_client. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="linkingClientId")
    private @Nullable Output<String> linkingClientId;

    /**
     * @return The ID of the linking_client. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Optional<Output<String>> linkingClientId() {
        return Optional.ofNullable(this.linkingClientId);
    }

    /**
     * The name of the user that will be associated with the Datadog Monitor. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user that will be associated with the Datadog Monitor. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The redirect uri for linking. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="redirectUri")
    private @Nullable Output<String> redirectUri;

    /**
     * @return The redirect uri for linking. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Optional<Output<String>> redirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    private MonitorDatadogOrganizationArgs() {}

    private MonitorDatadogOrganizationArgs(MonitorDatadogOrganizationArgs $) {
        this.apiKey = $.apiKey;
        this.applicationKey = $.applicationKey;
        this.enterpriseAppId = $.enterpriseAppId;
        this.id = $.id;
        this.linkingAuthCode = $.linkingAuthCode;
        this.linkingClientId = $.linkingClientId;
        this.name = $.name;
        this.redirectUri = $.redirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorDatadogOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorDatadogOrganizationArgs $;

        public Builder() {
            $ = new MonitorDatadogOrganizationArgs();
        }

        public Builder(MonitorDatadogOrganizationArgs defaults) {
            $ = new MonitorDatadogOrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey Api key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey Api key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param applicationKey Application key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationKey(Output<String> applicationKey) {
            $.applicationKey = applicationKey;
            return this;
        }

        /**
         * @param applicationKey Application key associated to the Datadog organization. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationKey(String applicationKey) {
            return applicationKey(Output.of(applicationKey));
        }

        /**
         * @param enterpriseAppId The ID of the enterprise_app. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseAppId(@Nullable Output<String> enterpriseAppId) {
            $.enterpriseAppId = enterpriseAppId;
            return this;
        }

        /**
         * @param enterpriseAppId The ID of the enterprise_app. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseAppId(String enterpriseAppId) {
            return enterpriseAppId(Output.of(enterpriseAppId));
        }

        /**
         * @param id The ID of the Datadog Monitor.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Datadog Monitor.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param linkingAuthCode The auth code used to linking to an existing Datadog organization. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkingAuthCode(@Nullable Output<String> linkingAuthCode) {
            $.linkingAuthCode = linkingAuthCode;
            return this;
        }

        /**
         * @param linkingAuthCode The auth code used to linking to an existing Datadog organization. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkingAuthCode(String linkingAuthCode) {
            return linkingAuthCode(Output.of(linkingAuthCode));
        }

        /**
         * @param linkingClientId The ID of the linking_client. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkingClientId(@Nullable Output<String> linkingClientId) {
            $.linkingClientId = linkingClientId;
            return this;
        }

        /**
         * @param linkingClientId The ID of the linking_client. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkingClientId(String linkingClientId) {
            return linkingClientId(Output.of(linkingClientId));
        }

        /**
         * @param name The name of the user that will be associated with the Datadog Monitor. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user that will be associated with the Datadog Monitor. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectUri The redirect uri for linking. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder redirectUri(@Nullable Output<String> redirectUri) {
            $.redirectUri = redirectUri;
            return this;
        }

        /**
         * @param redirectUri The redirect uri for linking. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder redirectUri(String redirectUri) {
            return redirectUri(Output.of(redirectUri));
        }

        public MonitorDatadogOrganizationArgs build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            $.applicationKey = Objects.requireNonNull($.applicationKey, "expected parameter 'applicationKey' to be non-null");
            return $;
        }
    }

}
