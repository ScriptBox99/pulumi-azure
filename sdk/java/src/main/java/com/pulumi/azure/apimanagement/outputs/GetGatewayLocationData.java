// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayLocationData {
    /**
     * @return The city or locality where the resource is located.
     * 
     */
    private final String city;
    /**
     * @return The district, state, or province where the resource is located.
     * 
     */
    private final String district;
    /**
     * @return The name of the API Management Gateway.
     * 
     */
    private final String name;
    private final String region;

    @CustomType.Constructor
    private GetGatewayLocationData(
        @CustomType.Parameter("city") String city,
        @CustomType.Parameter("district") String district,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("region") String region) {
        this.city = city;
        this.district = district;
        this.name = name;
        this.region = region;
    }

    /**
     * @return The city or locality where the resource is located.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return The district, state, or province where the resource is located.
     * 
     */
    public String district() {
        return this.district;
    }
    /**
     * @return The name of the API Management Gateway.
     * 
     */
    public String name() {
        return this.name;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayLocationData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String city;
        private String district;
        private String name;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayLocationData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        public Builder district(String district) {
            this.district = Objects.requireNonNull(district);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetGatewayLocationData build() {
            return new GetGatewayLocationData(city, district, name, region);
        }
    }
}