// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs Empty = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs();

    /**
     * The action to take for the application rules in this collection. Possible values are `Allow` and `Deny`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to take for the application rules in this collection. Possible values are `Allow` and `Deny`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The name which should be used for this application rule collection.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this application rule collection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The priority of the application rule collection. The range is `100` - `65000`.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return The priority of the application rule collection. The range is `100` - `65000`.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * One or more `rule` (application rule) blocks as defined below.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs>> rules;

    /**
     * @return One or more `rule` (application rule) blocks as defined below.
     * 
     */
    public Output<List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs>> rules() {
        return this.rules;
    }

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs() {}

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.priority = $.priority;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs();
        }

        public Builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs defaults) {
            $ = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take for the application rules in this collection. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to take for the application rules in this collection. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param name The name which should be used for this application rule collection.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this application rule collection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority of the application rule collection. The range is `100` - `65000`.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the application rule collection. The range is `100` - `65000`.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rules One or more `rule` (application rule) blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules One or more `rule` (application rule) blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules One or more `rule` (application rule) blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}