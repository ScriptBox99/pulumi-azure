// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticcloud.outputs;

import com.pulumi.azure.elasticcloud.outputs.GetElasticsearchLog;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetElasticsearchResult {
    /**
     * @return The ID of the Deployment within Elastic Cloud.
     * 
     */
    private final String elasticCloudDeploymentId;
    /**
     * @return The Email Address which is associated with this Elasticsearch account.
     * 
     */
    private final String elasticCloudEmailAddress;
    /**
     * @return The Default URL used for Single Sign On (SSO) to Elastic Cloud.
     * 
     */
    private final String elasticCloudSsoDefaultUrl;
    /**
     * @return The ID of the User Account within Elastic Cloud.
     * 
     */
    private final String elasticCloudUserId;
    /**
     * @return The URL to the Elasticsearch Service associated with this Elasticsearch.
     * 
     */
    private final String elasticsearchServiceUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The URL to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    private final String kibanaServiceUrl;
    /**
     * @return The URI used for SSO to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    private final String kibanaSsoUri;
    /**
     * @return The Azure Region in which this Elasticsearch exists.
     * 
     */
    private final String location;
    /**
     * @return A `logs` block as defined below.
     * 
     */
    private final List<GetElasticsearchLog> logs;
    /**
     * @return Specifies if monitoring is enabled on this Elasticsearch or not.
     * 
     */
    private final Boolean monitoringEnabled;
    /**
     * @return The name (key) of the Tag which should be filtered.
     * 
     */
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The name of the SKU used for this Elasticsearch.
     * 
     */
    private final String skuName;
    /**
     * @return A mapping of tags assigned to the Elasticsearch.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetElasticsearchResult(
        @CustomType.Parameter("elasticCloudDeploymentId") String elasticCloudDeploymentId,
        @CustomType.Parameter("elasticCloudEmailAddress") String elasticCloudEmailAddress,
        @CustomType.Parameter("elasticCloudSsoDefaultUrl") String elasticCloudSsoDefaultUrl,
        @CustomType.Parameter("elasticCloudUserId") String elasticCloudUserId,
        @CustomType.Parameter("elasticsearchServiceUrl") String elasticsearchServiceUrl,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kibanaServiceUrl") String kibanaServiceUrl,
        @CustomType.Parameter("kibanaSsoUri") String kibanaSsoUri,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("logs") List<GetElasticsearchLog> logs,
        @CustomType.Parameter("monitoringEnabled") Boolean monitoringEnabled,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.elasticCloudDeploymentId = elasticCloudDeploymentId;
        this.elasticCloudEmailAddress = elasticCloudEmailAddress;
        this.elasticCloudSsoDefaultUrl = elasticCloudSsoDefaultUrl;
        this.elasticCloudUserId = elasticCloudUserId;
        this.elasticsearchServiceUrl = elasticsearchServiceUrl;
        this.id = id;
        this.kibanaServiceUrl = kibanaServiceUrl;
        this.kibanaSsoUri = kibanaSsoUri;
        this.location = location;
        this.logs = logs;
        this.monitoringEnabled = monitoringEnabled;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.skuName = skuName;
        this.tags = tags;
    }

    /**
     * @return The ID of the Deployment within Elastic Cloud.
     * 
     */
    public String elasticCloudDeploymentId() {
        return this.elasticCloudDeploymentId;
    }
    /**
     * @return The Email Address which is associated with this Elasticsearch account.
     * 
     */
    public String elasticCloudEmailAddress() {
        return this.elasticCloudEmailAddress;
    }
    /**
     * @return The Default URL used for Single Sign On (SSO) to Elastic Cloud.
     * 
     */
    public String elasticCloudSsoDefaultUrl() {
        return this.elasticCloudSsoDefaultUrl;
    }
    /**
     * @return The ID of the User Account within Elastic Cloud.
     * 
     */
    public String elasticCloudUserId() {
        return this.elasticCloudUserId;
    }
    /**
     * @return The URL to the Elasticsearch Service associated with this Elasticsearch.
     * 
     */
    public String elasticsearchServiceUrl() {
        return this.elasticsearchServiceUrl;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The URL to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    public String kibanaServiceUrl() {
        return this.kibanaServiceUrl;
    }
    /**
     * @return The URI used for SSO to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    public String kibanaSsoUri() {
        return this.kibanaSsoUri;
    }
    /**
     * @return The Azure Region in which this Elasticsearch exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A `logs` block as defined below.
     * 
     */
    public List<GetElasticsearchLog> logs() {
        return this.logs;
    }
    /**
     * @return Specifies if monitoring is enabled on this Elasticsearch or not.
     * 
     */
    public Boolean monitoringEnabled() {
        return this.monitoringEnabled;
    }
    /**
     * @return The name (key) of the Tag which should be filtered.
     * 
     */
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The name of the SKU used for this Elasticsearch.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return A mapping of tags assigned to the Elasticsearch.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticsearchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String elasticCloudDeploymentId;
        private String elasticCloudEmailAddress;
        private String elasticCloudSsoDefaultUrl;
        private String elasticCloudUserId;
        private String elasticsearchServiceUrl;
        private String id;
        private String kibanaServiceUrl;
        private String kibanaSsoUri;
        private String location;
        private List<GetElasticsearchLog> logs;
        private Boolean monitoringEnabled;
        private String name;
        private String resourceGroupName;
        private String skuName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticsearchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticCloudDeploymentId = defaults.elasticCloudDeploymentId;
    	      this.elasticCloudEmailAddress = defaults.elasticCloudEmailAddress;
    	      this.elasticCloudSsoDefaultUrl = defaults.elasticCloudSsoDefaultUrl;
    	      this.elasticCloudUserId = defaults.elasticCloudUserId;
    	      this.elasticsearchServiceUrl = defaults.elasticsearchServiceUrl;
    	      this.id = defaults.id;
    	      this.kibanaServiceUrl = defaults.kibanaServiceUrl;
    	      this.kibanaSsoUri = defaults.kibanaSsoUri;
    	      this.location = defaults.location;
    	      this.logs = defaults.logs;
    	      this.monitoringEnabled = defaults.monitoringEnabled;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.tags = defaults.tags;
        }

        public Builder elasticCloudDeploymentId(String elasticCloudDeploymentId) {
            this.elasticCloudDeploymentId = Objects.requireNonNull(elasticCloudDeploymentId);
            return this;
        }
        public Builder elasticCloudEmailAddress(String elasticCloudEmailAddress) {
            this.elasticCloudEmailAddress = Objects.requireNonNull(elasticCloudEmailAddress);
            return this;
        }
        public Builder elasticCloudSsoDefaultUrl(String elasticCloudSsoDefaultUrl) {
            this.elasticCloudSsoDefaultUrl = Objects.requireNonNull(elasticCloudSsoDefaultUrl);
            return this;
        }
        public Builder elasticCloudUserId(String elasticCloudUserId) {
            this.elasticCloudUserId = Objects.requireNonNull(elasticCloudUserId);
            return this;
        }
        public Builder elasticsearchServiceUrl(String elasticsearchServiceUrl) {
            this.elasticsearchServiceUrl = Objects.requireNonNull(elasticsearchServiceUrl);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kibanaServiceUrl(String kibanaServiceUrl) {
            this.kibanaServiceUrl = Objects.requireNonNull(kibanaServiceUrl);
            return this;
        }
        public Builder kibanaSsoUri(String kibanaSsoUri) {
            this.kibanaSsoUri = Objects.requireNonNull(kibanaSsoUri);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder logs(List<GetElasticsearchLog> logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }
        public Builder logs(GetElasticsearchLog... logs) {
            return logs(List.of(logs));
        }
        public Builder monitoringEnabled(Boolean monitoringEnabled) {
            this.monitoringEnabled = Objects.requireNonNull(monitoringEnabled);
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
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetElasticsearchResult build() {
            return new GetElasticsearchResult(elasticCloudDeploymentId, elasticCloudEmailAddress, elasticCloudSsoDefaultUrl, elasticCloudUserId, elasticsearchServiceUrl, id, kibanaServiceUrl, kibanaSsoUri, location, logs, monitoringEnabled, name, resourceGroupName, skuName, tags);
        }
    }
}