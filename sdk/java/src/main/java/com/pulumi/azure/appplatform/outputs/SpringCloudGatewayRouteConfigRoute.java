// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudGatewayRouteConfigRoute {
    /**
     * @return Specifies the classification tags which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private final @Nullable List<String> classificationTags;
    /**
     * @return Specifies the description which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Specifies a list of filters which are used to modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    private final @Nullable List<String> filters;
    /**
     * @return Specifies the route processing order.
     * 
     */
    private final @Nullable Integer order;
    /**
     * @return Specifies a list of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    private final @Nullable List<String> predicates;
    /**
     * @return Should the sso validation be enabled?
     * 
     */
    private final @Nullable Boolean ssoValidationEnabled;
    /**
     * @return Specifies the title which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private final @Nullable String title;
    /**
     * @return Should pass currently-authenticated user&#39;s identity token to application service?
     * 
     */
    private final @Nullable Boolean tokenRelay;
    /**
     * @return Specifies the full uri which will override `appName`.
     * 
     */
    private final @Nullable String uri;

    @CustomType.Constructor
    private SpringCloudGatewayRouteConfigRoute(
        @CustomType.Parameter("classificationTags") @Nullable List<String> classificationTags,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("filters") @Nullable List<String> filters,
        @CustomType.Parameter("order") @Nullable Integer order,
        @CustomType.Parameter("predicates") @Nullable List<String> predicates,
        @CustomType.Parameter("ssoValidationEnabled") @Nullable Boolean ssoValidationEnabled,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("tokenRelay") @Nullable Boolean tokenRelay,
        @CustomType.Parameter("uri") @Nullable String uri) {
        this.classificationTags = classificationTags;
        this.description = description;
        this.filters = filters;
        this.order = order;
        this.predicates = predicates;
        this.ssoValidationEnabled = ssoValidationEnabled;
        this.title = title;
        this.tokenRelay = tokenRelay;
        this.uri = uri;
    }

    /**
     * @return Specifies the classification tags which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public List<String> classificationTags() {
        return this.classificationTags == null ? List.of() : this.classificationTags;
    }
    /**
     * @return Specifies the description which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Specifies a list of filters which are used to modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    public List<String> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Specifies the route processing order.
     * 
     */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return Specifies a list of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    public List<String> predicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * @return Should the sso validation be enabled?
     * 
     */
    public Optional<Boolean> ssoValidationEnabled() {
        return Optional.ofNullable(this.ssoValidationEnabled);
    }
    /**
     * @return Specifies the title which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return Should pass currently-authenticated user&#39;s identity token to application service?
     * 
     */
    public Optional<Boolean> tokenRelay() {
        return Optional.ofNullable(this.tokenRelay);
    }
    /**
     * @return Specifies the full uri which will override `appName`.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudGatewayRouteConfigRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> classificationTags;
        private @Nullable String description;
        private @Nullable List<String> filters;
        private @Nullable Integer order;
        private @Nullable List<String> predicates;
        private @Nullable Boolean ssoValidationEnabled;
        private @Nullable String title;
        private @Nullable Boolean tokenRelay;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(SpringCloudGatewayRouteConfigRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationTags = defaults.classificationTags;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.order = defaults.order;
    	      this.predicates = defaults.predicates;
    	      this.ssoValidationEnabled = defaults.ssoValidationEnabled;
    	      this.title = defaults.title;
    	      this.tokenRelay = defaults.tokenRelay;
    	      this.uri = defaults.uri;
        }

        public Builder classificationTags(@Nullable List<String> classificationTags) {
            this.classificationTags = classificationTags;
            return this;
        }
        public Builder classificationTags(String... classificationTags) {
            return classificationTags(List.of(classificationTags));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder filters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public Builder predicates(@Nullable List<String> predicates) {
            this.predicates = predicates;
            return this;
        }
        public Builder predicates(String... predicates) {
            return predicates(List.of(predicates));
        }
        public Builder ssoValidationEnabled(@Nullable Boolean ssoValidationEnabled) {
            this.ssoValidationEnabled = ssoValidationEnabled;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder tokenRelay(@Nullable Boolean tokenRelay) {
            this.tokenRelay = tokenRelay;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public SpringCloudGatewayRouteConfigRoute build() {
            return new SpringCloudGatewayRouteConfigRoute(classificationTags, description, filters, order, predicates, ssoValidationEnabled, title, tokenRelay, uri);
        }
    }
}