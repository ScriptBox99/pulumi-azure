// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.AccountAzureFilesAuthenticationActiveDirectory;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountAzureFilesAuthentication {
    /**
     * @return A `active_directory` block as defined below. Required when `directory_type` is `AD`.
     * 
     */
    private final @Nullable AccountAzureFilesAuthenticationActiveDirectory activeDirectory;
    /**
     * @return Specifies the directory service used. Possible values are `AADDS` and `AD`.
     * 
     */
    private final String directoryType;

    @CustomType.Constructor
    private AccountAzureFilesAuthentication(
        @CustomType.Parameter("activeDirectory") @Nullable AccountAzureFilesAuthenticationActiveDirectory activeDirectory,
        @CustomType.Parameter("directoryType") String directoryType) {
        this.activeDirectory = activeDirectory;
        this.directoryType = directoryType;
    }

    /**
     * @return A `active_directory` block as defined below. Required when `directory_type` is `AD`.
     * 
     */
    public Optional<AccountAzureFilesAuthenticationActiveDirectory> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }
    /**
     * @return Specifies the directory service used. Possible values are `AADDS` and `AD`.
     * 
     */
    public String directoryType() {
        return this.directoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAzureFilesAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccountAzureFilesAuthenticationActiveDirectory activeDirectory;
        private String directoryType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAzureFilesAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectory = defaults.activeDirectory;
    	      this.directoryType = defaults.directoryType;
        }

        public Builder activeDirectory(@Nullable AccountAzureFilesAuthenticationActiveDirectory activeDirectory) {
            this.activeDirectory = activeDirectory;
            return this;
        }
        public Builder directoryType(String directoryType) {
            this.directoryType = Objects.requireNonNull(directoryType);
            return this;
        }        public AccountAzureFilesAuthentication build() {
            return new AccountAzureFilesAuthentication(activeDirectory, directoryType);
        }
    }
}