// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps;

import com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionHttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionHttpArgs Empty = new ActionHttpArgs();

    /**
     * Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="logicAppId", required=true)
    private Output<String> logicAppId;

    /**
     * @return Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> logicAppId() {
        return this.logicAppId;
    }

    /**
     * Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
     * 
     */
    @Import(name="method", required=true)
    private Output<String> method;

    /**
     * @return Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
     * 
     */
    public Output<String> method() {
        return this.method;
    }

    /**
     * Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
     * 
     */
    @Import(name="runAfters")
    private @Nullable Output<List<ActionHttpRunAfterArgs>> runAfters;

    /**
     * @return Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
     * 
     */
    public Optional<Output<List<ActionHttpRunAfterArgs>>> runAfters() {
        return Optional.ofNullable(this.runAfters);
    }

    /**
     * Specifies the URI which will be called when this HTTP Action is triggered.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return Specifies the URI which will be called when this HTTP Action is triggered.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private ActionHttpArgs() {}

    private ActionHttpArgs(ActionHttpArgs $) {
        this.body = $.body;
        this.headers = $.headers;
        this.logicAppId = $.logicAppId;
        this.method = $.method;
        this.name = $.name;
        this.runAfters = $.runAfters;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionHttpArgs $;

        public Builder() {
            $ = new ActionHttpArgs();
        }

        public Builder(ActionHttpArgs defaults) {
            $ = new ActionHttpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param headers Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param logicAppId Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(Output<String> logicAppId) {
            $.logicAppId = logicAppId;
            return this;
        }

        /**
         * @param logicAppId Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(String logicAppId) {
            return logicAppId(Output.of(logicAppId));
        }

        /**
         * @param method Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
         * 
         * @return builder
         * 
         */
        public Builder method(Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param name Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
         * 
         * @return builder
         * 
         */
        public Builder runAfters(@Nullable Output<List<ActionHttpRunAfterArgs>> runAfters) {
            $.runAfters = runAfters;
            return this;
        }

        /**
         * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
         * 
         * @return builder
         * 
         */
        public Builder runAfters(List<ActionHttpRunAfterArgs> runAfters) {
            return runAfters(Output.of(runAfters));
        }

        /**
         * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
         * 
         * @return builder
         * 
         */
        public Builder runAfters(ActionHttpRunAfterArgs... runAfters) {
            return runAfters(List.of(runAfters));
        }

        /**
         * @param uri Specifies the URI which will be called when this HTTP Action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri Specifies the URI which will be called when this HTTP Action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public ActionHttpArgs build() {
            $.logicAppId = Objects.requireNonNull($.logicAppId, "expected parameter 'logicAppId' to be non-null");
            $.method = Objects.requireNonNull($.method, "expected parameter 'method' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}