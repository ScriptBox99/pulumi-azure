// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SparkClusterDiskEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkClusterDiskEncryptionArgs Empty = new SparkClusterDiskEncryptionArgs();

    /**
     * This is an algorithm identifier for encryption. Possible values are `RSA1_5`, `RSA-OAEP`, `RSA-OAEP-256`.
     * 
     */
    @Import(name="encryptionAlgorithm")
    private @Nullable Output<String> encryptionAlgorithm;

    /**
     * @return This is an algorithm identifier for encryption. Possible values are `RSA1_5`, `RSA-OAEP`, `RSA-OAEP-256`.
     * 
     */
    public Optional<Output<String>> encryptionAlgorithm() {
        return Optional.ofNullable(this.encryptionAlgorithm);
    }

    /**
     * This is indicator to show whether resource disk encryption is enabled.
     * 
     */
    @Import(name="encryptionAtHostEnabled")
    private @Nullable Output<Boolean> encryptionAtHostEnabled;

    /**
     * @return This is indicator to show whether resource disk encryption is enabled.
     * 
     */
    public Optional<Output<Boolean>> encryptionAtHostEnabled() {
        return Optional.ofNullable(this.encryptionAtHostEnabled);
    }

    /**
     * The ID of the key vault key.
     * 
     */
    @Import(name="keyVaultKeyId")
    private @Nullable Output<String> keyVaultKeyId;

    /**
     * @return The ID of the key vault key.
     * 
     */
    public Optional<Output<String>> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }

    /**
     * This is the resource ID of Managed Identity used to access the key vault.
     * 
     */
    @Import(name="keyVaultManagedIdentityId")
    private @Nullable Output<String> keyVaultManagedIdentityId;

    /**
     * @return This is the resource ID of Managed Identity used to access the key vault.
     * 
     */
    public Optional<Output<String>> keyVaultManagedIdentityId() {
        return Optional.ofNullable(this.keyVaultManagedIdentityId);
    }

    private SparkClusterDiskEncryptionArgs() {}

    private SparkClusterDiskEncryptionArgs(SparkClusterDiskEncryptionArgs $) {
        this.encryptionAlgorithm = $.encryptionAlgorithm;
        this.encryptionAtHostEnabled = $.encryptionAtHostEnabled;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.keyVaultManagedIdentityId = $.keyVaultManagedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkClusterDiskEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkClusterDiskEncryptionArgs $;

        public Builder() {
            $ = new SparkClusterDiskEncryptionArgs();
        }

        public Builder(SparkClusterDiskEncryptionArgs defaults) {
            $ = new SparkClusterDiskEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionAlgorithm This is an algorithm identifier for encryption. Possible values are `RSA1_5`, `RSA-OAEP`, `RSA-OAEP-256`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(@Nullable Output<String> encryptionAlgorithm) {
            $.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * @param encryptionAlgorithm This is an algorithm identifier for encryption. Possible values are `RSA1_5`, `RSA-OAEP`, `RSA-OAEP-256`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            return encryptionAlgorithm(Output.of(encryptionAlgorithm));
        }

        /**
         * @param encryptionAtHostEnabled This is indicator to show whether resource disk encryption is enabled.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtHostEnabled(@Nullable Output<Boolean> encryptionAtHostEnabled) {
            $.encryptionAtHostEnabled = encryptionAtHostEnabled;
            return this;
        }

        /**
         * @param encryptionAtHostEnabled This is indicator to show whether resource disk encryption is enabled.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtHostEnabled(Boolean encryptionAtHostEnabled) {
            return encryptionAtHostEnabled(Output.of(encryptionAtHostEnabled));
        }

        /**
         * @param keyVaultKeyId The ID of the key vault key.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(@Nullable Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the key vault key.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param keyVaultManagedIdentityId This is the resource ID of Managed Identity used to access the key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultManagedIdentityId(@Nullable Output<String> keyVaultManagedIdentityId) {
            $.keyVaultManagedIdentityId = keyVaultManagedIdentityId;
            return this;
        }

        /**
         * @param keyVaultManagedIdentityId This is the resource ID of Managed Identity used to access the key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultManagedIdentityId(String keyVaultManagedIdentityId) {
            return keyVaultManagedIdentityId(Output.of(keyVaultManagedIdentityId));
        }

        public SparkClusterDiskEncryptionArgs build() {
            return $;
        }
    }

}