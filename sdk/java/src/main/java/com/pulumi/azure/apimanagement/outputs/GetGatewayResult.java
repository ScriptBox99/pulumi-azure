// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.GetGatewayLocationData;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayResult {
    private final String apiManagementId;
    /**
     * @return The description of the API Management Gateway.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A `location_data` block as documented below.
     * 
     */
    private final List<GetGatewayLocationData> locationDatas;
    /**
     * @return A canonical name for the geographic or physical location.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetGatewayResult(
        @CustomType.Parameter("apiManagementId") String apiManagementId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("locationDatas") List<GetGatewayLocationData> locationDatas,
        @CustomType.Parameter("name") String name) {
        this.apiManagementId = apiManagementId;
        this.description = description;
        this.id = id;
        this.locationDatas = locationDatas;
        this.name = name;
    }

    public String apiManagementId() {
        return this.apiManagementId;
    }
    /**
     * @return The description of the API Management Gateway.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `location_data` block as documented below.
     * 
     */
    public List<GetGatewayLocationData> locationDatas() {
        return this.locationDatas;
    }
    /**
     * @return A canonical name for the geographic or physical location.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiManagementId;
        private String description;
        private String id;
        private List<GetGatewayLocationData> locationDatas;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiManagementId = defaults.apiManagementId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.locationDatas = defaults.locationDatas;
    	      this.name = defaults.name;
        }

        public Builder apiManagementId(String apiManagementId) {
            this.apiManagementId = Objects.requireNonNull(apiManagementId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder locationDatas(List<GetGatewayLocationData> locationDatas) {
            this.locationDatas = Objects.requireNonNull(locationDatas);
            return this;
        }
        public Builder locationDatas(GetGatewayLocationData... locationDatas) {
            return locationDatas(List.of(locationDatas));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetGatewayResult build() {
            return new GetGatewayResult(apiManagementId, description, id, locationDatas, name);
        }
    }
}