// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBlobResult {
    /**
     * @return The access tier of the storage blob.
     * 
     */
    private final String accessTier;
    /**
     * @return The MD5 sum of the blob contents.
     * 
     */
    private final String contentMd5;
    /**
     * @return The content type of the storage blob.
     * 
     */
    private final String contentType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A map of custom blob metadata.
     * 
     */
    private final Map<String,String> metadata;
    private final String name;
    private final String storageAccountName;
    private final String storageContainerName;
    /**
     * @return The type of the storage blob
     * 
     */
    private final String type;
    /**
     * @return The URL of the storage blob.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetBlobResult(
        @CustomType.Parameter("accessTier") String accessTier,
        @CustomType.Parameter("contentMd5") String contentMd5,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("storageContainerName") String storageContainerName,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") String url) {
        this.accessTier = accessTier;
        this.contentMd5 = contentMd5;
        this.contentType = contentType;
        this.id = id;
        this.metadata = metadata;
        this.name = name;
        this.storageAccountName = storageAccountName;
        this.storageContainerName = storageContainerName;
        this.type = type;
        this.url = url;
    }

    /**
     * @return The access tier of the storage blob.
     * 
     */
    public String accessTier() {
        return this.accessTier;
    }
    /**
     * @return The MD5 sum of the blob contents.
     * 
     */
    public String contentMd5() {
        return this.contentMd5;
    }
    /**
     * @return The content type of the storage blob.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A map of custom blob metadata.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    public String name() {
        return this.name;
    }
    public String storageAccountName() {
        return this.storageAccountName;
    }
    public String storageContainerName() {
        return this.storageContainerName;
    }
    /**
     * @return The type of the storage blob
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The URL of the storage blob.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessTier;
        private String contentMd5;
        private String contentType;
        private String id;
        private Map<String,String> metadata;
        private String name;
        private String storageAccountName;
        private String storageContainerName;
        private String type;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.contentMd5 = defaults.contentMd5;
    	      this.contentType = defaults.contentType;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageContainerName = defaults.storageContainerName;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder accessTier(String accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = Objects.requireNonNull(contentMd5);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder storageContainerName(String storageContainerName) {
            this.storageContainerName = Objects.requireNonNull(storageContainerName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetBlobResult build() {
            return new GetBlobResult(accessTier, contentMd5, contentType, id, metadata, name, storageAccountName, storageContainerName, type, url);
        }
    }
}