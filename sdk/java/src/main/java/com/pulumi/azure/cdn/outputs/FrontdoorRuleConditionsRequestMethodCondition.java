// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorRuleConditionsRequestMethodCondition {
    /**
     * @return A list of one or more HTTP methods. Possible values include `GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS` or `TRACE`. If multiple values are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    private List<String> matchValues;
    /**
     * @return If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    private @Nullable Boolean negateCondition;
    /**
     * @return Possible value `Equal`. Defaults to `Equal`.
     * 
     */
    private @Nullable String operator;

    private FrontdoorRuleConditionsRequestMethodCondition() {}
    /**
     * @return A list of one or more HTTP methods. Possible values include `GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS` or `TRACE`. If multiple values are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    public List<String> matchValues() {
        return this.matchValues;
    }
    /**
     * @return If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * @return Possible value `Equal`. Defaults to `Equal`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorRuleConditionsRequestMethodCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private @Nullable String operator;
        public Builder() {}
        public Builder(FrontdoorRuleConditionsRequestMethodCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
        }

        @CustomType.Setter
        public Builder matchValues(List<String> matchValues) {
            this.matchValues = Objects.requireNonNull(matchValues);
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        @CustomType.Setter
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public FrontdoorRuleConditionsRequestMethodCondition build() {
            final var o = new FrontdoorRuleConditionsRequestMethodCondition();
            o.matchValues = matchValues;
            o.negateCondition = negateCondition;
            o.operator = operator;
            return o;
        }
    }
}