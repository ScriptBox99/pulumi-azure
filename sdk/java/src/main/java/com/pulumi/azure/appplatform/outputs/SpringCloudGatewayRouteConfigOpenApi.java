// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudGatewayRouteConfigOpenApi {
    /**
     * @return The URI of OpenAPI specification.
     * 
     */
    private @Nullable String uri;

    private SpringCloudGatewayRouteConfigOpenApi() {}
    /**
     * @return The URI of OpenAPI specification.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudGatewayRouteConfigOpenApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String uri;
        public Builder() {}
        public Builder(SpringCloudGatewayRouteConfigOpenApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public SpringCloudGatewayRouteConfigOpenApi build() {
            final var o = new SpringCloudGatewayRouteConfigOpenApi();
            o.uri = uri;
            return o;
        }
    }
}