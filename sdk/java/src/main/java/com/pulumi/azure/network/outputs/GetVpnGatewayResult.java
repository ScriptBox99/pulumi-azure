// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetVpnGatewayBgpSetting;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVpnGatewayResult {
    /**
     * @return A `bgp_settings` block as defined below.
     * 
     */
    private final List<GetVpnGatewayBgpSetting> bgpSettings;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure location where the VPN Gateway exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The Scale Unit of this VPN Gateway.
     * 
     */
    private final Integer scaleUnit;
    /**
     * @return A mapping of tags assigned to the VPN Gateway.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The ID of the Virtual Hub within which this VPN Gateway has been created.
     * 
     */
    private final String virtualHubId;

    @CustomType.Constructor
    private GetVpnGatewayResult(
        @CustomType.Parameter("bgpSettings") List<GetVpnGatewayBgpSetting> bgpSettings,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("scaleUnit") Integer scaleUnit,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("virtualHubId") String virtualHubId) {
        this.bgpSettings = bgpSettings;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.scaleUnit = scaleUnit;
        this.tags = tags;
        this.virtualHubId = virtualHubId;
    }

    /**
     * @return A `bgp_settings` block as defined below.
     * 
     */
    public List<GetVpnGatewayBgpSetting> bgpSettings() {
        return this.bgpSettings;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure location where the VPN Gateway exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Scale Unit of this VPN Gateway.
     * 
     */
    public Integer scaleUnit() {
        return this.scaleUnit;
    }
    /**
     * @return A mapping of tags assigned to the VPN Gateway.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the Virtual Hub within which this VPN Gateway has been created.
     * 
     */
    public String virtualHubId() {
        return this.virtualHubId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetVpnGatewayBgpSetting> bgpSettings;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private Integer scaleUnit;
        private Map<String,String> tags;
        private String virtualHubId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scaleUnit = defaults.scaleUnit;
    	      this.tags = defaults.tags;
    	      this.virtualHubId = defaults.virtualHubId;
        }

        public Builder bgpSettings(List<GetVpnGatewayBgpSetting> bgpSettings) {
            this.bgpSettings = Objects.requireNonNull(bgpSettings);
            return this;
        }
        public Builder bgpSettings(GetVpnGatewayBgpSetting... bgpSettings) {
            return bgpSettings(List.of(bgpSettings));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder scaleUnit(Integer scaleUnit) {
            this.scaleUnit = Objects.requireNonNull(scaleUnit);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder virtualHubId(String virtualHubId) {
            this.virtualHubId = Objects.requireNonNull(virtualHubId);
            return this;
        }        public GetVpnGatewayResult build() {
            return new GetVpnGatewayResult(bgpSettings, id, location, name, resourceGroupName, scaleUnit, tags, virtualHubId);
        }
    }
}