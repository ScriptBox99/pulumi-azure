// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetPolicyRuleActionSnapshot {
    /**
     * @return The age in days after creation to tier blob version to archive storage.
     * 
     */
    private Integer changeTierToArchiveAfterDaysSinceCreation;
    /**
     * @return The age in days after creation to tier blob version to cool storage.
     * 
     */
    private Integer changeTierToCoolAfterDaysSinceCreation;
    /**
     * @return The age in days after creation to delete the blob snapshot.
     * 
     */
    private Integer deleteAfterDaysSinceCreationGreaterThan;
    /**
     * @return The age in days after last tier change to the blobs to skip to be archived.
     * 
     */
    private Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
    /**
     * @return Optional The age in days after creation to cold storage. Supports blob currently at Hot tier.
     * 
     */
    private Integer tierToColdAfterDaysSinceCreationGreaterThan;

    private GetPolicyRuleActionSnapshot() {}
    /**
     * @return The age in days after creation to tier blob version to archive storage.
     * 
     */
    public Integer changeTierToArchiveAfterDaysSinceCreation() {
        return this.changeTierToArchiveAfterDaysSinceCreation;
    }
    /**
     * @return The age in days after creation to tier blob version to cool storage.
     * 
     */
    public Integer changeTierToCoolAfterDaysSinceCreation() {
        return this.changeTierToCoolAfterDaysSinceCreation;
    }
    /**
     * @return The age in days after creation to delete the blob snapshot.
     * 
     */
    public Integer deleteAfterDaysSinceCreationGreaterThan() {
        return this.deleteAfterDaysSinceCreationGreaterThan;
    }
    /**
     * @return The age in days after last tier change to the blobs to skip to be archived.
     * 
     */
    public Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan() {
        return this.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
    }
    /**
     * @return Optional The age in days after creation to cold storage. Supports blob currently at Hot tier.
     * 
     */
    public Integer tierToColdAfterDaysSinceCreationGreaterThan() {
        return this.tierToColdAfterDaysSinceCreationGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyRuleActionSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer changeTierToArchiveAfterDaysSinceCreation;
        private Integer changeTierToCoolAfterDaysSinceCreation;
        private Integer deleteAfterDaysSinceCreationGreaterThan;
        private Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
        private Integer tierToColdAfterDaysSinceCreationGreaterThan;
        public Builder() {}
        public Builder(GetPolicyRuleActionSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeTierToArchiveAfterDaysSinceCreation = defaults.changeTierToArchiveAfterDaysSinceCreation;
    	      this.changeTierToCoolAfterDaysSinceCreation = defaults.changeTierToCoolAfterDaysSinceCreation;
    	      this.deleteAfterDaysSinceCreationGreaterThan = defaults.deleteAfterDaysSinceCreationGreaterThan;
    	      this.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan = defaults.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
    	      this.tierToColdAfterDaysSinceCreationGreaterThan = defaults.tierToColdAfterDaysSinceCreationGreaterThan;
        }

        @CustomType.Setter
        public Builder changeTierToArchiveAfterDaysSinceCreation(Integer changeTierToArchiveAfterDaysSinceCreation) {
            this.changeTierToArchiveAfterDaysSinceCreation = Objects.requireNonNull(changeTierToArchiveAfterDaysSinceCreation);
            return this;
        }
        @CustomType.Setter
        public Builder changeTierToCoolAfterDaysSinceCreation(Integer changeTierToCoolAfterDaysSinceCreation) {
            this.changeTierToCoolAfterDaysSinceCreation = Objects.requireNonNull(changeTierToCoolAfterDaysSinceCreation);
            return this;
        }
        @CustomType.Setter
        public Builder deleteAfterDaysSinceCreationGreaterThan(Integer deleteAfterDaysSinceCreationGreaterThan) {
            this.deleteAfterDaysSinceCreationGreaterThan = Objects.requireNonNull(deleteAfterDaysSinceCreationGreaterThan);
            return this;
        }
        @CustomType.Setter
        public Builder tierToArchiveAfterDaysSinceLastTierChangeGreaterThan(Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan) {
            this.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan = Objects.requireNonNull(tierToArchiveAfterDaysSinceLastTierChangeGreaterThan);
            return this;
        }
        @CustomType.Setter
        public Builder tierToColdAfterDaysSinceCreationGreaterThan(Integer tierToColdAfterDaysSinceCreationGreaterThan) {
            this.tierToColdAfterDaysSinceCreationGreaterThan = Objects.requireNonNull(tierToColdAfterDaysSinceCreationGreaterThan);
            return this;
        }
        public GetPolicyRuleActionSnapshot build() {
            final var _resultValue = new GetPolicyRuleActionSnapshot();
            _resultValue.changeTierToArchiveAfterDaysSinceCreation = changeTierToArchiveAfterDaysSinceCreation;
            _resultValue.changeTierToCoolAfterDaysSinceCreation = changeTierToCoolAfterDaysSinceCreation;
            _resultValue.deleteAfterDaysSinceCreationGreaterThan = deleteAfterDaysSinceCreationGreaterThan;
            _resultValue.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan = tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
            _resultValue.tierToColdAfterDaysSinceCreationGreaterThan = tierToColdAfterDaysSinceCreationGreaterThan;
            return _resultValue;
        }
    }
}
