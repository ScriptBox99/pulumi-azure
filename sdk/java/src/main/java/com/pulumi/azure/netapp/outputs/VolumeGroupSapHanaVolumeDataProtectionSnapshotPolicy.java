// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicy {
    /**
     * @return Resource ID of the snapshot policy to apply to the volume.
     * 
     */
    private String snapshotPolicyId;

    private VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicy() {}
    /**
     * @return Resource ID of the snapshot policy to apply to the volume.
     * 
     */
    public String snapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String snapshotPolicyId;
        public Builder() {}
        public Builder(VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotPolicyId = defaults.snapshotPolicyId;
        }

        @CustomType.Setter
        public Builder snapshotPolicyId(String snapshotPolicyId) {
            this.snapshotPolicyId = Objects.requireNonNull(snapshotPolicyId);
            return this;
        }
        public VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicy build() {
            final var o = new VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicy();
            o.snapshotPolicyId = snapshotPolicyId;
            return o;
        }
    }
}