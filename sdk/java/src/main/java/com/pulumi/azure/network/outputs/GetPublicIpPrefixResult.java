// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPublicIpPrefixResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String ipPrefix;
    /**
     * @return The supported Azure location where the resource exists.
     * 
     */
    private final String location;
    /**
     * @return The name of the Public IP prefix resource.
     * 
     */
    private final String name;
    /**
     * @return The number of bits of the prefix.
     * 
     */
    private final Integer prefixLength;
    /**
     * @return The name of the resource group in which to create the public IP.
     * 
     */
    private final String resourceGroupName;
    /**
     * @return The SKU of the Public IP Prefix.
     * 
     */
    private final String sku;
    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return A list of Availability Zones in which this Public IP Prefix is located.
     * 
     */
    private final List<String> zones;

    @CustomType.Constructor
    private GetPublicIpPrefixResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipPrefix") String ipPrefix,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("prefixLength") Integer prefixLength,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("sku") String sku,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("zones") List<String> zones) {
        this.id = id;
        this.ipPrefix = ipPrefix;
        this.location = location;
        this.name = name;
        this.prefixLength = prefixLength;
        this.resourceGroupName = resourceGroupName;
        this.sku = sku;
        this.tags = tags;
        this.zones = zones;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipPrefix() {
        return this.ipPrefix;
    }
    /**
     * @return The supported Azure location where the resource exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the Public IP prefix resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The number of bits of the prefix.
     * 
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }
    /**
     * @return The name of the resource group in which to create the public IP.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU of the Public IP Prefix.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return A list of Availability Zones in which this Public IP Prefix is located.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIpPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String ipPrefix;
        private String location;
        private String name;
        private Integer prefixLength;
        private String resourceGroupName;
        private String sku;
        private Map<String,String> tags;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicIpPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipPrefix = defaults.ipPrefix;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.prefixLength = defaults.prefixLength;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipPrefix(String ipPrefix) {
            this.ipPrefix = Objects.requireNonNull(ipPrefix);
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
        public Builder prefixLength(Integer prefixLength) {
            this.prefixLength = Objects.requireNonNull(prefixLength);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetPublicIpPrefixResult build() {
            return new GetPublicIpPrefixResult(id, ipPrefix, location, name, prefixLength, resourceGroupName, sku, tags, zones);
        }
    }
}