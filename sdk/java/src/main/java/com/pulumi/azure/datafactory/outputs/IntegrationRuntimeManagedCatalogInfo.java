// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeManagedCatalogInfo {
    /**
     * @return Administrator login name for the SQL Server.
     * 
     */
    private final @Nullable String administratorLogin;
    /**
     * @return Administrator login password for the SQL Server.
     * 
     */
    private final @Nullable String administratorPassword;
    /**
     * @return Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `Standard`, `Premium` and `PremiumRS`.
     * 
     */
    private final @Nullable String pricingTier;
    /**
     * @return The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
     * 
     */
    private final String serverEndpoint;

    @CustomType.Constructor
    private IntegrationRuntimeManagedCatalogInfo(
        @CustomType.Parameter("administratorLogin") @Nullable String administratorLogin,
        @CustomType.Parameter("administratorPassword") @Nullable String administratorPassword,
        @CustomType.Parameter("pricingTier") @Nullable String pricingTier,
        @CustomType.Parameter("serverEndpoint") String serverEndpoint) {
        this.administratorLogin = administratorLogin;
        this.administratorPassword = administratorPassword;
        this.pricingTier = pricingTier;
        this.serverEndpoint = serverEndpoint;
    }

    /**
     * @return Administrator login name for the SQL Server.
     * 
     */
    public Optional<String> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }
    /**
     * @return Administrator login password for the SQL Server.
     * 
     */
    public Optional<String> administratorPassword() {
        return Optional.ofNullable(this.administratorPassword);
    }
    /**
     * @return Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `Standard`, `Premium` and `PremiumRS`.
     * 
     */
    public Optional<String> pricingTier() {
        return Optional.ofNullable(this.pricingTier);
    }
    /**
     * @return The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
     * 
     */
    public String serverEndpoint() {
        return this.serverEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeManagedCatalogInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorLogin;
        private @Nullable String administratorPassword;
        private @Nullable String pricingTier;
        private String serverEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeManagedCatalogInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorPassword = defaults.administratorPassword;
    	      this.pricingTier = defaults.pricingTier;
    	      this.serverEndpoint = defaults.serverEndpoint;
        }

        public Builder administratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }
        public Builder administratorPassword(@Nullable String administratorPassword) {
            this.administratorPassword = administratorPassword;
            return this;
        }
        public Builder pricingTier(@Nullable String pricingTier) {
            this.pricingTier = pricingTier;
            return this;
        }
        public Builder serverEndpoint(String serverEndpoint) {
            this.serverEndpoint = Objects.requireNonNull(serverEndpoint);
            return this;
        }        public IntegrationRuntimeManagedCatalogInfo build() {
            return new IntegrationRuntimeManagedCatalogInfo(administratorLogin, administratorPassword, pricingTier, serverEndpoint);
        }
    }
}