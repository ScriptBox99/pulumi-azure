// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetStorageProfileImageReference {
    /**
     * @return Specifies the ID of the (custom) image to use to create the virtual
     * machine scale set, as in the example below.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Specifies the offer of the image used to create the virtual machines.
     * 
     */
    private final @Nullable String offer;
    /**
     * @return Specifies the publisher of the image used to create the virtual machines.
     * 
     */
    private final @Nullable String publisher;
    /**
     * @return Specifies the SKU of the image used to create the virtual machines.
     * 
     */
    private final @Nullable String sku;
    /**
     * @return Specifies the version of the image used to create the virtual machines.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ScaleSetStorageProfileImageReference(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("offer") @Nullable String offer,
        @CustomType.Parameter("publisher") @Nullable String publisher,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("version") @Nullable String version) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    /**
     * @return Specifies the ID of the (custom) image to use to create the virtual
     * machine scale set, as in the example below.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Specifies the offer of the image used to create the virtual machines.
     * 
     */
    public Optional<String> offer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * @return Specifies the publisher of the image used to create the virtual machines.
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * @return Specifies the SKU of the image used to create the virtual machines.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Specifies the version of the image used to create the virtual machines.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetStorageProfileImageReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSetStorageProfileImageReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ScaleSetStorageProfileImageReference build() {
            return new ScaleSetStorageProfileImageReference(id, offer, publisher, sku, version);
        }
    }
}