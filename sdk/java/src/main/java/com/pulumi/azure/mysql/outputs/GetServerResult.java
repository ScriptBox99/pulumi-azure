// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.outputs;

import com.pulumi.azure.mysql.outputs.GetServerIdentity;
import com.pulumi.azure.mysql.outputs.GetServerThreatDetectionPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServerResult {
    /**
     * @return The Administrator login for the MySQL Server.
     * 
     */
    private final String administratorLogin;
    /**
     * @return The auto grow setting for this MySQL Server.
     * 
     */
    private final Boolean autoGrowEnabled;
    /**
     * @return The backup retention days for this MySQL server.
     * 
     */
    private final Integer backupRetentionDays;
    /**
     * @return The FQDN of the MySQL Server.
     * 
     */
    private final String fqdn;
    /**
     * @return The geo redundant backup setting for this MySQL Server.
     * 
     */
    private final Boolean geoRedundantBackupEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return An `identity` block as defined below.
     * 
     */
    private final List<GetServerIdentity> identities;
    /**
     * @return Whether or not infrastructure is encrypted for this MySQL Server.
     * 
     */
    private final Boolean infrastructureEncryptionEnabled;
    /**
     * @return The Azure location where the resource exists.
     * 
     */
    private final String location;
    private final String name;
    /**
     * @return Whether or not public network access is allowed for this MySQL Server.
     * 
     */
    private final Boolean publicNetworkAccessEnabled;
    private final String resourceGroupName;
    private final String restorePointInTime;
    /**
     * @return The SKU Name for this MySQL Server.
     * 
     */
    private final String skuName;
    /**
     * @return Specifies if SSL should be enforced on connections for this MySQL Server.
     * 
     */
    private final Boolean sslEnforcementEnabled;
    /**
     * @return The minimum TLS version to support for this MySQL Server.
     * 
     */
    private final String sslMinimalTlsVersionEnforced;
    /**
     * @return Max storage allowed for this MySQL Server.
     * 
     */
    private final Integer storageMb;
    /**
     * @return A mapping of tags to assign to the resource.
     * ---
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block exports fields documented below.
     * 
     */
    private final List<GetServerThreatDetectionPolicy> threatDetectionPolicies;
    /**
     * @return The version of this MySQL Server.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetServerResult(
        @CustomType.Parameter("administratorLogin") String administratorLogin,
        @CustomType.Parameter("autoGrowEnabled") Boolean autoGrowEnabled,
        @CustomType.Parameter("backupRetentionDays") Integer backupRetentionDays,
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("geoRedundantBackupEnabled") Boolean geoRedundantBackupEnabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") List<GetServerIdentity> identities,
        @CustomType.Parameter("infrastructureEncryptionEnabled") Boolean infrastructureEncryptionEnabled,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicNetworkAccessEnabled") Boolean publicNetworkAccessEnabled,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("restorePointInTime") String restorePointInTime,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("sslEnforcementEnabled") Boolean sslEnforcementEnabled,
        @CustomType.Parameter("sslMinimalTlsVersionEnforced") String sslMinimalTlsVersionEnforced,
        @CustomType.Parameter("storageMb") Integer storageMb,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("threatDetectionPolicies") List<GetServerThreatDetectionPolicy> threatDetectionPolicies,
        @CustomType.Parameter("version") String version) {
        this.administratorLogin = administratorLogin;
        this.autoGrowEnabled = autoGrowEnabled;
        this.backupRetentionDays = backupRetentionDays;
        this.fqdn = fqdn;
        this.geoRedundantBackupEnabled = geoRedundantBackupEnabled;
        this.id = id;
        this.identities = identities;
        this.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
        this.location = location;
        this.name = name;
        this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
        this.resourceGroupName = resourceGroupName;
        this.restorePointInTime = restorePointInTime;
        this.skuName = skuName;
        this.sslEnforcementEnabled = sslEnforcementEnabled;
        this.sslMinimalTlsVersionEnforced = sslMinimalTlsVersionEnforced;
        this.storageMb = storageMb;
        this.tags = tags;
        this.threatDetectionPolicies = threatDetectionPolicies;
        this.version = version;
    }

    /**
     * @return The Administrator login for the MySQL Server.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return The auto grow setting for this MySQL Server.
     * 
     */
    public Boolean autoGrowEnabled() {
        return this.autoGrowEnabled;
    }
    /**
     * @return The backup retention days for this MySQL server.
     * 
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }
    /**
     * @return The FQDN of the MySQL Server.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return The geo redundant backup setting for this MySQL Server.
     * 
     */
    public Boolean geoRedundantBackupEnabled() {
        return this.geoRedundantBackupEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An `identity` block as defined below.
     * 
     */
    public List<GetServerIdentity> identities() {
        return this.identities;
    }
    /**
     * @return Whether or not infrastructure is encrypted for this MySQL Server.
     * 
     */
    public Boolean infrastructureEncryptionEnabled() {
        return this.infrastructureEncryptionEnabled;
    }
    /**
     * @return The Azure location where the resource exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Whether or not public network access is allowed for this MySQL Server.
     * 
     */
    public Boolean publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String restorePointInTime() {
        return this.restorePointInTime;
    }
    /**
     * @return The SKU Name for this MySQL Server.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return Specifies if SSL should be enforced on connections for this MySQL Server.
     * 
     */
    public Boolean sslEnforcementEnabled() {
        return this.sslEnforcementEnabled;
    }
    /**
     * @return The minimum TLS version to support for this MySQL Server.
     * 
     */
    public String sslMinimalTlsVersionEnforced() {
        return this.sslMinimalTlsVersionEnforced;
    }
    /**
     * @return Max storage allowed for this MySQL Server.
     * 
     */
    public Integer storageMb() {
        return this.storageMb;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * ---
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block exports fields documented below.
     * 
     */
    public List<GetServerThreatDetectionPolicy> threatDetectionPolicies() {
        return this.threatDetectionPolicies;
    }
    /**
     * @return The version of this MySQL Server.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorLogin;
        private Boolean autoGrowEnabled;
        private Integer backupRetentionDays;
        private String fqdn;
        private Boolean geoRedundantBackupEnabled;
        private String id;
        private List<GetServerIdentity> identities;
        private Boolean infrastructureEncryptionEnabled;
        private String location;
        private String name;
        private Boolean publicNetworkAccessEnabled;
        private String resourceGroupName;
        private String restorePointInTime;
        private String skuName;
        private Boolean sslEnforcementEnabled;
        private String sslMinimalTlsVersionEnforced;
        private Integer storageMb;
        private Map<String,String> tags;
        private List<GetServerThreatDetectionPolicy> threatDetectionPolicies;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.autoGrowEnabled = defaults.autoGrowEnabled;
    	      this.backupRetentionDays = defaults.backupRetentionDays;
    	      this.fqdn = defaults.fqdn;
    	      this.geoRedundantBackupEnabled = defaults.geoRedundantBackupEnabled;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.infrastructureEncryptionEnabled = defaults.infrastructureEncryptionEnabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.skuName = defaults.skuName;
    	      this.sslEnforcementEnabled = defaults.sslEnforcementEnabled;
    	      this.sslMinimalTlsVersionEnforced = defaults.sslMinimalTlsVersionEnforced;
    	      this.storageMb = defaults.storageMb;
    	      this.tags = defaults.tags;
    	      this.threatDetectionPolicies = defaults.threatDetectionPolicies;
    	      this.version = defaults.version;
        }

        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        public Builder autoGrowEnabled(Boolean autoGrowEnabled) {
            this.autoGrowEnabled = Objects.requireNonNull(autoGrowEnabled);
            return this;
        }
        public Builder backupRetentionDays(Integer backupRetentionDays) {
            this.backupRetentionDays = Objects.requireNonNull(backupRetentionDays);
            return this;
        }
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder geoRedundantBackupEnabled(Boolean geoRedundantBackupEnabled) {
            this.geoRedundantBackupEnabled = Objects.requireNonNull(geoRedundantBackupEnabled);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(List<GetServerIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetServerIdentity... identities) {
            return identities(List.of(identities));
        }
        public Builder infrastructureEncryptionEnabled(Boolean infrastructureEncryptionEnabled) {
            this.infrastructureEncryptionEnabled = Objects.requireNonNull(infrastructureEncryptionEnabled);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            this.publicNetworkAccessEnabled = Objects.requireNonNull(publicNetworkAccessEnabled);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder restorePointInTime(String restorePointInTime) {
            this.restorePointInTime = Objects.requireNonNull(restorePointInTime);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder sslEnforcementEnabled(Boolean sslEnforcementEnabled) {
            this.sslEnforcementEnabled = Objects.requireNonNull(sslEnforcementEnabled);
            return this;
        }
        public Builder sslMinimalTlsVersionEnforced(String sslMinimalTlsVersionEnforced) {
            this.sslMinimalTlsVersionEnforced = Objects.requireNonNull(sslMinimalTlsVersionEnforced);
            return this;
        }
        public Builder storageMb(Integer storageMb) {
            this.storageMb = Objects.requireNonNull(storageMb);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder threatDetectionPolicies(List<GetServerThreatDetectionPolicy> threatDetectionPolicies) {
            this.threatDetectionPolicies = Objects.requireNonNull(threatDetectionPolicies);
            return this;
        }
        public Builder threatDetectionPolicies(GetServerThreatDetectionPolicy... threatDetectionPolicies) {
            return threatDetectionPolicies(List.of(threatDetectionPolicies));
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetServerResult build() {
            return new GetServerResult(administratorLogin, autoGrowEnabled, backupRetentionDays, fqdn, geoRedundantBackupEnabled, id, identities, infrastructureEncryptionEnabled, location, name, publicNetworkAccessEnabled, resourceGroupName, restorePointInTime, skuName, sslEnforcementEnabled, sslMinimalTlsVersionEnforced, storageMb, tags, threatDetectionPolicies, version);
        }
    }
}