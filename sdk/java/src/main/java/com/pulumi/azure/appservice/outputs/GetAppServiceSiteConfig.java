// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetAppServiceSiteConfigCor;
import com.pulumi.azure.appservice.outputs.GetAppServiceSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.GetAppServiceSiteConfigScmIpRestriction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppServiceSiteConfig {
    /**
     * @return Are Managed Identity Credentials used for Azure Container Registry pull.
     * 
     */
    private final Boolean acrUseManagedIdentityCredentials;
    /**
     * @return The User Managed Identity Client Id.
     * 
     */
    private final String acrUserManagedIdentityClientId;
    /**
     * @return Is the app loaded at all times?
     * 
     */
    private final Boolean alwaysOn;
    /**
     * @return App command line to launch.
     * 
     */
    private final String appCommandLine;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private final List<GetAppServiceSiteConfigCor> cors;
    /**
     * @return The ordering of default documents to load, if an address isn&#39;t specified.
     * 
     */
    private final List<String> defaultDocuments;
    /**
     * @return The version of the .NET framework&#39;s CLR used in this App Service.
     * 
     */
    private final String dotnetFrameworkVersion;
    /**
     * @return State of FTP / FTPS service for this AppService.
     * 
     */
    private final String ftpsState;
    /**
     * @return The health check path to be pinged by App Service.
     * 
     */
    private final String healthCheckPath;
    /**
     * @return Is HTTP2 Enabled on this App Service?
     * 
     */
    private final Boolean http2Enabled;
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    private final List<GetAppServiceSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return The Java Container in use.
     * 
     */
    private final String javaContainer;
    /**
     * @return The version of the Java Container in use.
     * 
     */
    private final String javaContainerVersion;
    /**
     * @return The version of Java in use.
     * 
     */
    private final String javaVersion;
    /**
     * @return Linux App Framework and version for the AppService.
     * 
     */
    private final String linuxFxVersion;
    /**
     * @return Is &#34;MySQL In App&#34; Enabled? This runs a local MySQL instance with your app and shares resources from the App Service plan.
     * 
     */
    private final Boolean localMysqlEnabled;
    /**
     * @return The Managed Pipeline Mode used in this App Service.
     * 
     */
    private final String managedPipelineMode;
    /**
     * @return The minimum supported TLS version for this App Service.
     * 
     */
    private final String minTlsVersion;
    /**
     * @return The scaled number of workers (for per site scaling) of this App Service.
     * 
     */
    private final Integer numberOfWorkers;
    /**
     * @return The version of PHP used in this App Service.
     * 
     */
    private final String phpVersion;
    /**
     * @return The version of Python used in this App Service.
     * 
     */
    private final String pythonVersion;
    /**
     * @return Is Remote Debugging Enabled in this App Service?
     * 
     */
    private final Boolean remoteDebuggingEnabled;
    /**
     * @return Which version of Visual Studio is the Remote Debugger compatible with?
     * 
     */
    private final String remoteDebuggingVersion;
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    private final List<GetAppServiceSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return The type of Source Control enabled for this App Service.
     * 
     */
    private final String scmType;
    /**
     * @return IP security restrictions for scm to use main.
     * 
     */
    private final Boolean scmUseMainIpRestriction;
    /**
     * @return Does the App Service run in 32 bit mode, rather than 64 bit mode?
     * 
     */
    private final Boolean use32BitWorkerProcess;
    /**
     * @return (Optional) Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied?
     * 
     */
    private final Boolean vnetRouteAllEnabled;
    /**
     * @return Are WebSockets enabled for this App Service?
     * 
     */
    private final Boolean websocketsEnabled;
    /**
     * @return Windows Container Docker Image for the AppService.
     * 
     */
    private final String windowsFxVersion;

    @CustomType.Constructor
    private GetAppServiceSiteConfig(
        @CustomType.Parameter("acrUseManagedIdentityCredentials") Boolean acrUseManagedIdentityCredentials,
        @CustomType.Parameter("acrUserManagedIdentityClientId") String acrUserManagedIdentityClientId,
        @CustomType.Parameter("alwaysOn") Boolean alwaysOn,
        @CustomType.Parameter("appCommandLine") String appCommandLine,
        @CustomType.Parameter("cors") List<GetAppServiceSiteConfigCor> cors,
        @CustomType.Parameter("defaultDocuments") List<String> defaultDocuments,
        @CustomType.Parameter("dotnetFrameworkVersion") String dotnetFrameworkVersion,
        @CustomType.Parameter("ftpsState") String ftpsState,
        @CustomType.Parameter("healthCheckPath") String healthCheckPath,
        @CustomType.Parameter("http2Enabled") Boolean http2Enabled,
        @CustomType.Parameter("ipRestrictions") List<GetAppServiceSiteConfigIpRestriction> ipRestrictions,
        @CustomType.Parameter("javaContainer") String javaContainer,
        @CustomType.Parameter("javaContainerVersion") String javaContainerVersion,
        @CustomType.Parameter("javaVersion") String javaVersion,
        @CustomType.Parameter("linuxFxVersion") String linuxFxVersion,
        @CustomType.Parameter("localMysqlEnabled") Boolean localMysqlEnabled,
        @CustomType.Parameter("managedPipelineMode") String managedPipelineMode,
        @CustomType.Parameter("minTlsVersion") String minTlsVersion,
        @CustomType.Parameter("numberOfWorkers") Integer numberOfWorkers,
        @CustomType.Parameter("phpVersion") String phpVersion,
        @CustomType.Parameter("pythonVersion") String pythonVersion,
        @CustomType.Parameter("remoteDebuggingEnabled") Boolean remoteDebuggingEnabled,
        @CustomType.Parameter("remoteDebuggingVersion") String remoteDebuggingVersion,
        @CustomType.Parameter("scmIpRestrictions") List<GetAppServiceSiteConfigScmIpRestriction> scmIpRestrictions,
        @CustomType.Parameter("scmType") String scmType,
        @CustomType.Parameter("scmUseMainIpRestriction") Boolean scmUseMainIpRestriction,
        @CustomType.Parameter("use32BitWorkerProcess") Boolean use32BitWorkerProcess,
        @CustomType.Parameter("vnetRouteAllEnabled") Boolean vnetRouteAllEnabled,
        @CustomType.Parameter("websocketsEnabled") Boolean websocketsEnabled,
        @CustomType.Parameter("windowsFxVersion") String windowsFxVersion) {
        this.acrUseManagedIdentityCredentials = acrUseManagedIdentityCredentials;
        this.acrUserManagedIdentityClientId = acrUserManagedIdentityClientId;
        this.alwaysOn = alwaysOn;
        this.appCommandLine = appCommandLine;
        this.cors = cors;
        this.defaultDocuments = defaultDocuments;
        this.dotnetFrameworkVersion = dotnetFrameworkVersion;
        this.ftpsState = ftpsState;
        this.healthCheckPath = healthCheckPath;
        this.http2Enabled = http2Enabled;
        this.ipRestrictions = ipRestrictions;
        this.javaContainer = javaContainer;
        this.javaContainerVersion = javaContainerVersion;
        this.javaVersion = javaVersion;
        this.linuxFxVersion = linuxFxVersion;
        this.localMysqlEnabled = localMysqlEnabled;
        this.managedPipelineMode = managedPipelineMode;
        this.minTlsVersion = minTlsVersion;
        this.numberOfWorkers = numberOfWorkers;
        this.phpVersion = phpVersion;
        this.pythonVersion = pythonVersion;
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
        this.remoteDebuggingVersion = remoteDebuggingVersion;
        this.scmIpRestrictions = scmIpRestrictions;
        this.scmType = scmType;
        this.scmUseMainIpRestriction = scmUseMainIpRestriction;
        this.use32BitWorkerProcess = use32BitWorkerProcess;
        this.vnetRouteAllEnabled = vnetRouteAllEnabled;
        this.websocketsEnabled = websocketsEnabled;
        this.windowsFxVersion = windowsFxVersion;
    }

    /**
     * @return Are Managed Identity Credentials used for Azure Container Registry pull.
     * 
     */
    public Boolean acrUseManagedIdentityCredentials() {
        return this.acrUseManagedIdentityCredentials;
    }
    /**
     * @return The User Managed Identity Client Id.
     * 
     */
    public String acrUserManagedIdentityClientId() {
        return this.acrUserManagedIdentityClientId;
    }
    /**
     * @return Is the app loaded at all times?
     * 
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }
    /**
     * @return App command line to launch.
     * 
     */
    public String appCommandLine() {
        return this.appCommandLine;
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public List<GetAppServiceSiteConfigCor> cors() {
        return this.cors;
    }
    /**
     * @return The ordering of default documents to load, if an address isn&#39;t specified.
     * 
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments;
    }
    /**
     * @return The version of the .NET framework&#39;s CLR used in this App Service.
     * 
     */
    public String dotnetFrameworkVersion() {
        return this.dotnetFrameworkVersion;
    }
    /**
     * @return State of FTP / FTPS service for this AppService.
     * 
     */
    public String ftpsState() {
        return this.ftpsState;
    }
    /**
     * @return The health check path to be pinged by App Service.
     * 
     */
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * @return Is HTTP2 Enabled on this App Service?
     * 
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    public List<GetAppServiceSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions;
    }
    /**
     * @return The Java Container in use.
     * 
     */
    public String javaContainer() {
        return this.javaContainer;
    }
    /**
     * @return The version of the Java Container in use.
     * 
     */
    public String javaContainerVersion() {
        return this.javaContainerVersion;
    }
    /**
     * @return The version of Java in use.
     * 
     */
    public String javaVersion() {
        return this.javaVersion;
    }
    /**
     * @return Linux App Framework and version for the AppService.
     * 
     */
    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }
    /**
     * @return Is &#34;MySQL In App&#34; Enabled? This runs a local MySQL instance with your app and shares resources from the App Service plan.
     * 
     */
    public Boolean localMysqlEnabled() {
        return this.localMysqlEnabled;
    }
    /**
     * @return The Managed Pipeline Mode used in this App Service.
     * 
     */
    public String managedPipelineMode() {
        return this.managedPipelineMode;
    }
    /**
     * @return The minimum supported TLS version for this App Service.
     * 
     */
    public String minTlsVersion() {
        return this.minTlsVersion;
    }
    /**
     * @return The scaled number of workers (for per site scaling) of this App Service.
     * 
     */
    public Integer numberOfWorkers() {
        return this.numberOfWorkers;
    }
    /**
     * @return The version of PHP used in this App Service.
     * 
     */
    public String phpVersion() {
        return this.phpVersion;
    }
    /**
     * @return The version of Python used in this App Service.
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * @return Is Remote Debugging Enabled in this App Service?
     * 
     */
    public Boolean remoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    /**
     * @return Which version of Visual Studio is the Remote Debugger compatible with?
     * 
     */
    public String remoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    public List<GetAppServiceSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions;
    }
    /**
     * @return The type of Source Control enabled for this App Service.
     * 
     */
    public String scmType() {
        return this.scmType;
    }
    /**
     * @return IP security restrictions for scm to use main.
     * 
     */
    public Boolean scmUseMainIpRestriction() {
        return this.scmUseMainIpRestriction;
    }
    /**
     * @return Does the App Service run in 32 bit mode, rather than 64 bit mode?
     * 
     */
    public Boolean use32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }
    /**
     * @return (Optional) Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied?
     * 
     */
    public Boolean vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }
    /**
     * @return Are WebSockets enabled for this App Service?
     * 
     */
    public Boolean websocketsEnabled() {
        return this.websocketsEnabled;
    }
    /**
     * @return Windows Container Docker Image for the AppService.
     * 
     */
    public String windowsFxVersion() {
        return this.windowsFxVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceSiteConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean acrUseManagedIdentityCredentials;
        private String acrUserManagedIdentityClientId;
        private Boolean alwaysOn;
        private String appCommandLine;
        private List<GetAppServiceSiteConfigCor> cors;
        private List<String> defaultDocuments;
        private String dotnetFrameworkVersion;
        private String ftpsState;
        private String healthCheckPath;
        private Boolean http2Enabled;
        private List<GetAppServiceSiteConfigIpRestriction> ipRestrictions;
        private String javaContainer;
        private String javaContainerVersion;
        private String javaVersion;
        private String linuxFxVersion;
        private Boolean localMysqlEnabled;
        private String managedPipelineMode;
        private String minTlsVersion;
        private Integer numberOfWorkers;
        private String phpVersion;
        private String pythonVersion;
        private Boolean remoteDebuggingEnabled;
        private String remoteDebuggingVersion;
        private List<GetAppServiceSiteConfigScmIpRestriction> scmIpRestrictions;
        private String scmType;
        private Boolean scmUseMainIpRestriction;
        private Boolean use32BitWorkerProcess;
        private Boolean vnetRouteAllEnabled;
        private Boolean websocketsEnabled;
        private String windowsFxVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acrUseManagedIdentityCredentials = defaults.acrUseManagedIdentityCredentials;
    	      this.acrUserManagedIdentityClientId = defaults.acrUserManagedIdentityClientId;
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.appCommandLine = defaults.appCommandLine;
    	      this.cors = defaults.cors;
    	      this.defaultDocuments = defaults.defaultDocuments;
    	      this.dotnetFrameworkVersion = defaults.dotnetFrameworkVersion;
    	      this.ftpsState = defaults.ftpsState;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.javaContainer = defaults.javaContainer;
    	      this.javaContainerVersion = defaults.javaContainerVersion;
    	      this.javaVersion = defaults.javaVersion;
    	      this.linuxFxVersion = defaults.linuxFxVersion;
    	      this.localMysqlEnabled = defaults.localMysqlEnabled;
    	      this.managedPipelineMode = defaults.managedPipelineMode;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.numberOfWorkers = defaults.numberOfWorkers;
    	      this.phpVersion = defaults.phpVersion;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.remoteDebuggingEnabled = defaults.remoteDebuggingEnabled;
    	      this.remoteDebuggingVersion = defaults.remoteDebuggingVersion;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorkerProcess = defaults.use32BitWorkerProcess;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
    	      this.windowsFxVersion = defaults.windowsFxVersion;
        }

        public Builder acrUseManagedIdentityCredentials(Boolean acrUseManagedIdentityCredentials) {
            this.acrUseManagedIdentityCredentials = Objects.requireNonNull(acrUseManagedIdentityCredentials);
            return this;
        }
        public Builder acrUserManagedIdentityClientId(String acrUserManagedIdentityClientId) {
            this.acrUserManagedIdentityClientId = Objects.requireNonNull(acrUserManagedIdentityClientId);
            return this;
        }
        public Builder alwaysOn(Boolean alwaysOn) {
            this.alwaysOn = Objects.requireNonNull(alwaysOn);
            return this;
        }
        public Builder appCommandLine(String appCommandLine) {
            this.appCommandLine = Objects.requireNonNull(appCommandLine);
            return this;
        }
        public Builder cors(List<GetAppServiceSiteConfigCor> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(GetAppServiceSiteConfigCor... cors) {
            return cors(List.of(cors));
        }
        public Builder defaultDocuments(List<String> defaultDocuments) {
            this.defaultDocuments = Objects.requireNonNull(defaultDocuments);
            return this;
        }
        public Builder defaultDocuments(String... defaultDocuments) {
            return defaultDocuments(List.of(defaultDocuments));
        }
        public Builder dotnetFrameworkVersion(String dotnetFrameworkVersion) {
            this.dotnetFrameworkVersion = Objects.requireNonNull(dotnetFrameworkVersion);
            return this;
        }
        public Builder ftpsState(String ftpsState) {
            this.ftpsState = Objects.requireNonNull(ftpsState);
            return this;
        }
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = Objects.requireNonNull(healthCheckPath);
            return this;
        }
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = Objects.requireNonNull(http2Enabled);
            return this;
        }
        public Builder ipRestrictions(List<GetAppServiceSiteConfigIpRestriction> ipRestrictions) {
            this.ipRestrictions = Objects.requireNonNull(ipRestrictions);
            return this;
        }
        public Builder ipRestrictions(GetAppServiceSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        public Builder javaContainer(String javaContainer) {
            this.javaContainer = Objects.requireNonNull(javaContainer);
            return this;
        }
        public Builder javaContainerVersion(String javaContainerVersion) {
            this.javaContainerVersion = Objects.requireNonNull(javaContainerVersion);
            return this;
        }
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = Objects.requireNonNull(javaVersion);
            return this;
        }
        public Builder linuxFxVersion(String linuxFxVersion) {
            this.linuxFxVersion = Objects.requireNonNull(linuxFxVersion);
            return this;
        }
        public Builder localMysqlEnabled(Boolean localMysqlEnabled) {
            this.localMysqlEnabled = Objects.requireNonNull(localMysqlEnabled);
            return this;
        }
        public Builder managedPipelineMode(String managedPipelineMode) {
            this.managedPipelineMode = Objects.requireNonNull(managedPipelineMode);
            return this;
        }
        public Builder minTlsVersion(String minTlsVersion) {
            this.minTlsVersion = Objects.requireNonNull(minTlsVersion);
            return this;
        }
        public Builder numberOfWorkers(Integer numberOfWorkers) {
            this.numberOfWorkers = Objects.requireNonNull(numberOfWorkers);
            return this;
        }
        public Builder phpVersion(String phpVersion) {
            this.phpVersion = Objects.requireNonNull(phpVersion);
            return this;
        }
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        public Builder remoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
            this.remoteDebuggingEnabled = Objects.requireNonNull(remoteDebuggingEnabled);
            return this;
        }
        public Builder remoteDebuggingVersion(String remoteDebuggingVersion) {
            this.remoteDebuggingVersion = Objects.requireNonNull(remoteDebuggingVersion);
            return this;
        }
        public Builder scmIpRestrictions(List<GetAppServiceSiteConfigScmIpRestriction> scmIpRestrictions) {
            this.scmIpRestrictions = Objects.requireNonNull(scmIpRestrictions);
            return this;
        }
        public Builder scmIpRestrictions(GetAppServiceSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        public Builder scmType(String scmType) {
            this.scmType = Objects.requireNonNull(scmType);
            return this;
        }
        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            this.scmUseMainIpRestriction = Objects.requireNonNull(scmUseMainIpRestriction);
            return this;
        }
        public Builder use32BitWorkerProcess(Boolean use32BitWorkerProcess) {
            this.use32BitWorkerProcess = Objects.requireNonNull(use32BitWorkerProcess);
            return this;
        }
        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            this.vnetRouteAllEnabled = Objects.requireNonNull(vnetRouteAllEnabled);
            return this;
        }
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            this.websocketsEnabled = Objects.requireNonNull(websocketsEnabled);
            return this;
        }
        public Builder windowsFxVersion(String windowsFxVersion) {
            this.windowsFxVersion = Objects.requireNonNull(windowsFxVersion);
            return this;
        }        public GetAppServiceSiteConfig build() {
            return new GetAppServiceSiteConfig(acrUseManagedIdentityCredentials, acrUserManagedIdentityClientId, alwaysOn, appCommandLine, cors, defaultDocuments, dotnetFrameworkVersion, ftpsState, healthCheckPath, http2Enabled, ipRestrictions, javaContainer, javaContainerVersion, javaVersion, linuxFxVersion, localMysqlEnabled, managedPipelineMode, minTlsVersion, numberOfWorkers, phpVersion, pythonVersion, remoteDebuggingEnabled, remoteDebuggingVersion, scmIpRestrictions, scmType, scmUseMainIpRestriction, use32BitWorkerProcess, vnetRouteAllEnabled, websocketsEnabled, windowsFxVersion);
        }
    }
}