// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetSharedImageVersionsImage;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSharedImageVersionsResult {
    private final String galleryName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String imageName;
    /**
     * @return An `images` block as defined below:
     * 
     */
    private final List<GetSharedImageVersionsImage> images;
    private final String resourceGroupName;
    private final @Nullable Map<String,String> tagsFilter;

    @CustomType.Constructor
    private GetSharedImageVersionsResult(
        @CustomType.Parameter("galleryName") String galleryName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageName") String imageName,
        @CustomType.Parameter("images") List<GetSharedImageVersionsImage> images,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tagsFilter") @Nullable Map<String,String> tagsFilter) {
        this.galleryName = galleryName;
        this.id = id;
        this.imageName = imageName;
        this.images = images;
        this.resourceGroupName = resourceGroupName;
        this.tagsFilter = tagsFilter;
    }

    public String galleryName() {
        return this.galleryName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String imageName() {
        return this.imageName;
    }
    /**
     * @return An `images` block as defined below:
     * 
     */
    public List<GetSharedImageVersionsImage> images() {
        return this.images;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Map<String,String> tagsFilter() {
        return this.tagsFilter == null ? Map.of() : this.tagsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedImageVersionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String galleryName;
        private String id;
        private String imageName;
        private List<GetSharedImageVersionsImage> images;
        private String resourceGroupName;
        private @Nullable Map<String,String> tagsFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSharedImageVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleryName = defaults.galleryName;
    	      this.id = defaults.id;
    	      this.imageName = defaults.imageName;
    	      this.images = defaults.images;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tagsFilter = defaults.tagsFilter;
        }

        public Builder galleryName(String galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder images(List<GetSharedImageVersionsImage> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(GetSharedImageVersionsImage... images) {
            return images(List.of(images));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tagsFilter(@Nullable Map<String,String> tagsFilter) {
            this.tagsFilter = tagsFilter;
            return this;
        }        public GetSharedImageVersionsResult build() {
            return new GetSharedImageVersionsResult(galleryName, id, imageName, images, resourceGroupName, tagsFilter);
        }
    }
}