// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AlertRuleScheduledSentinelEntityMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleScheduledSentinelEntityMappingArgs Empty = new AlertRuleScheduledSentinelEntityMappingArgs();

    /**
     * The column name to be mapped to the identifier.
     * 
     */
    @Import(name="columnName", required=true)
    private Output<String> columnName;

    /**
     * @return The column name to be mapped to the identifier.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }

    private AlertRuleScheduledSentinelEntityMappingArgs() {}

    private AlertRuleScheduledSentinelEntityMappingArgs(AlertRuleScheduledSentinelEntityMappingArgs $) {
        this.columnName = $.columnName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleScheduledSentinelEntityMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleScheduledSentinelEntityMappingArgs $;

        public Builder() {
            $ = new AlertRuleScheduledSentinelEntityMappingArgs();
        }

        public Builder(AlertRuleScheduledSentinelEntityMappingArgs defaults) {
            $ = new AlertRuleScheduledSentinelEntityMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName The column name to be mapped to the identifier.
         * 
         * @return builder
         * 
         */
        public Builder columnName(Output<String> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName The column name to be mapped to the identifier.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            return columnName(Output.of(columnName));
        }

        public AlertRuleScheduledSentinelEntityMappingArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            return $;
        }
    }

}