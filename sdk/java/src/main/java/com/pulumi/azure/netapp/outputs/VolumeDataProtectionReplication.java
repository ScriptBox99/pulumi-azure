// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeDataProtectionReplication {
    /**
     * @return The endpoint type, default value is `dst` for destination.
     * 
     */
    private final @Nullable String endpointType;
    /**
     * @return Location of the primary volume.
     * 
     */
    private final String remoteVolumeLocation;
    /**
     * @return Resource ID of the primary volume.
     * 
     */
    private final String remoteVolumeResourceId;
    /**
     * @return Replication frequency, supported values are &#39;10minutes&#39;, &#39;hourly&#39;, &#39;daily&#39;, values are case sensitive.
     * 
     */
    private final String replicationFrequency;

    @CustomType.Constructor
    private VolumeDataProtectionReplication(
        @CustomType.Parameter("endpointType") @Nullable String endpointType,
        @CustomType.Parameter("remoteVolumeLocation") String remoteVolumeLocation,
        @CustomType.Parameter("remoteVolumeResourceId") String remoteVolumeResourceId,
        @CustomType.Parameter("replicationFrequency") String replicationFrequency) {
        this.endpointType = endpointType;
        this.remoteVolumeLocation = remoteVolumeLocation;
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        this.replicationFrequency = replicationFrequency;
    }

    /**
     * @return The endpoint type, default value is `dst` for destination.
     * 
     */
    public Optional<String> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }
    /**
     * @return Location of the primary volume.
     * 
     */
    public String remoteVolumeLocation() {
        return this.remoteVolumeLocation;
    }
    /**
     * @return Resource ID of the primary volume.
     * 
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }
    /**
     * @return Replication frequency, supported values are &#39;10minutes&#39;, &#39;hourly&#39;, &#39;daily&#39;, values are case sensitive.
     * 
     */
    public String replicationFrequency() {
        return this.replicationFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeDataProtectionReplication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointType;
        private String remoteVolumeLocation;
        private String remoteVolumeResourceId;
        private String replicationFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeDataProtectionReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.remoteVolumeLocation = defaults.remoteVolumeLocation;
    	      this.remoteVolumeResourceId = defaults.remoteVolumeResourceId;
    	      this.replicationFrequency = defaults.replicationFrequency;
        }

        public Builder endpointType(@Nullable String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public Builder remoteVolumeLocation(String remoteVolumeLocation) {
            this.remoteVolumeLocation = Objects.requireNonNull(remoteVolumeLocation);
            return this;
        }
        public Builder remoteVolumeResourceId(String remoteVolumeResourceId) {
            this.remoteVolumeResourceId = Objects.requireNonNull(remoteVolumeResourceId);
            return this;
        }
        public Builder replicationFrequency(String replicationFrequency) {
            this.replicationFrequency = Objects.requireNonNull(replicationFrequency);
            return this;
        }        public VolumeDataProtectionReplication build() {
            return new VolumeDataProtectionReplication(endpointType, remoteVolumeLocation, remoteVolumeResourceId, replicationFrequency);
        }
    }
}