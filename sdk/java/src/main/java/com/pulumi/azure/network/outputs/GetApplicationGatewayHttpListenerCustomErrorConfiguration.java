// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewayHttpListenerCustomErrorConfiguration {
    /**
     * @return Error page URL of the application gateway custom error.
     * 
     */
    private String customErrorPageUrl;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private String id;
    /**
     * @return Status code of the application gateway custom error.
     * 
     */
    private String statusCode;

    private GetApplicationGatewayHttpListenerCustomErrorConfiguration() {}
    /**
     * @return Error page URL of the application gateway custom error.
     * 
     */
    public String customErrorPageUrl() {
        return this.customErrorPageUrl;
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Status code of the application gateway custom error.
     * 
     */
    public String statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewayHttpListenerCustomErrorConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customErrorPageUrl;
        private String id;
        private String statusCode;
        public Builder() {}
        public Builder(GetApplicationGatewayHttpListenerCustomErrorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customErrorPageUrl = defaults.customErrorPageUrl;
    	      this.id = defaults.id;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder customErrorPageUrl(String customErrorPageUrl) {
            this.customErrorPageUrl = Objects.requireNonNull(customErrorPageUrl);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public GetApplicationGatewayHttpListenerCustomErrorConfiguration build() {
            final var _resultValue = new GetApplicationGatewayHttpListenerCustomErrorConfiguration();
            _resultValue.customErrorPageUrl = customErrorPageUrl;
            _resultValue.id = id;
            _resultValue.statusCode = statusCode;
            return _resultValue;
        }
    }
}
