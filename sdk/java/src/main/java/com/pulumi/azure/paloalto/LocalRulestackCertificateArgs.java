// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalRulestackCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalRulestackCertificateArgs Empty = new LocalRulestackCertificateArgs();

    /**
     * The comment for Audit purposes.
     * 
     */
    @Import(name="auditComment")
    private @Nullable Output<String> auditComment;

    /**
     * @return The comment for Audit purposes.
     * 
     */
    public Optional<Output<String>> auditComment() {
        return Optional.ofNullable(this.auditComment);
    }

    /**
     * The description for the Certificate.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Certificate.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The `versionles_id` of the Key Vault Certificate to use. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
     * 
     */
    @Import(name="keyVaultCertificateId")
    private @Nullable Output<String> keyVaultCertificateId;

    /**
     * @return The `versionles_id` of the Key Vault Certificate to use. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
     * 
     */
    public Optional<Output<String>> keyVaultCertificateId() {
        return Optional.ofNullable(this.keyVaultCertificateId);
    }

    /**
     * The name which should be used for this Palo Alto Networks Rulestack Certificate.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Palo Alto Networks Rulestack Certificate.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the TODO. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
     * 
     */
    @Import(name="rulestackId", required=true)
    private Output<String> rulestackId;

    /**
     * @return The ID of the TODO. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
     * 
     */
    public Output<String> rulestackId() {
        return this.rulestackId;
    }

    /**
     * Should a Self Signed Certificate be used. Defaults to `false`. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
     * 
     * &gt; **Note:** One and only one of `self_signed` or `key_vault_certificate_id` must be specified.
     * 
     */
    @Import(name="selfSigned")
    private @Nullable Output<Boolean> selfSigned;

    /**
     * @return Should a Self Signed Certificate be used. Defaults to `false`. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
     * 
     * &gt; **Note:** One and only one of `self_signed` or `key_vault_certificate_id` must be specified.
     * 
     */
    public Optional<Output<Boolean>> selfSigned() {
        return Optional.ofNullable(this.selfSigned);
    }

    private LocalRulestackCertificateArgs() {}

    private LocalRulestackCertificateArgs(LocalRulestackCertificateArgs $) {
        this.auditComment = $.auditComment;
        this.description = $.description;
        this.keyVaultCertificateId = $.keyVaultCertificateId;
        this.name = $.name;
        this.rulestackId = $.rulestackId;
        this.selfSigned = $.selfSigned;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalRulestackCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalRulestackCertificateArgs $;

        public Builder() {
            $ = new LocalRulestackCertificateArgs();
        }

        public Builder(LocalRulestackCertificateArgs defaults) {
            $ = new LocalRulestackCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditComment The comment for Audit purposes.
         * 
         * @return builder
         * 
         */
        public Builder auditComment(@Nullable Output<String> auditComment) {
            $.auditComment = auditComment;
            return this;
        }

        /**
         * @param auditComment The comment for Audit purposes.
         * 
         * @return builder
         * 
         */
        public Builder auditComment(String auditComment) {
            return auditComment(Output.of(auditComment));
        }

        /**
         * @param description The description for the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param keyVaultCertificateId The `versionles_id` of the Key Vault Certificate to use. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultCertificateId(@Nullable Output<String> keyVaultCertificateId) {
            $.keyVaultCertificateId = keyVaultCertificateId;
            return this;
        }

        /**
         * @param keyVaultCertificateId The `versionles_id` of the Key Vault Certificate to use. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultCertificateId(String keyVaultCertificateId) {
            return keyVaultCertificateId(Output.of(keyVaultCertificateId));
        }

        /**
         * @param name The name which should be used for this Palo Alto Networks Rulestack Certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Palo Alto Networks Rulestack Certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rulestackId The ID of the TODO. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
         * 
         * @return builder
         * 
         */
        public Builder rulestackId(Output<String> rulestackId) {
            $.rulestackId = rulestackId;
            return this;
        }

        /**
         * @param rulestackId The ID of the TODO. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
         * 
         * @return builder
         * 
         */
        public Builder rulestackId(String rulestackId) {
            return rulestackId(Output.of(rulestackId));
        }

        /**
         * @param selfSigned Should a Self Signed Certificate be used. Defaults to `false`. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
         * 
         * &gt; **Note:** One and only one of `self_signed` or `key_vault_certificate_id` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder selfSigned(@Nullable Output<Boolean> selfSigned) {
            $.selfSigned = selfSigned;
            return this;
        }

        /**
         * @param selfSigned Should a Self Signed Certificate be used. Defaults to `false`. Changing this forces a new Palo Alto Networks Rulestack Certificate to be created.
         * 
         * &gt; **Note:** One and only one of `self_signed` or `key_vault_certificate_id` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder selfSigned(Boolean selfSigned) {
            return selfSigned(Output.of(selfSigned));
        }

        public LocalRulestackCertificateArgs build() {
            $.rulestackId = Objects.requireNonNull($.rulestackId, "expected parameter 'rulestackId' to be non-null");
            return $;
        }
    }

}