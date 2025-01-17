// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfigApplicationStack {
    /**
     * @return The Current Stack value of the Windows Web App.
     * 
     */
    private String currentStack;
    private String dockerContainerName;
    private String dockerContainerRegistry;
    private String dockerContainerTag;
    /**
     * @return The docker image, including tag, used by this Windows Web App.
     * 
     */
    private String dockerImageName;
    /**
     * @return The User Name to use for authentication against the registry to pull the image.
     * 
     */
    private String dockerRegistryPassword;
    /**
     * @return The URL of the container registry where the `docker_image_name` is located.
     * 
     */
    private String dockerRegistryUrl;
    /**
     * @return The User Name to use for authentication against the registry to pull the image.
     * 
     */
    private String dockerRegistryUsername;
    private String dotnetCoreVersion;
    /**
     * @return The version of .NET in use.
     * 
     */
    private String dotnetVersion;
    /**
     * @return The Java Container in use.
     * 
     */
    private String javaContainer;
    /**
     * @return The Version of the Java Container in use.
     * 
     */
    private String javaContainerVersion;
    private Boolean javaEmbeddedServerEnabled;
    /**
     * @return The Version of Java in use.
     * 
     */
    private String javaVersion;
    /**
     * @return The Version of Node in use.
     * 
     */
    private String nodeVersion;
    /**
     * @return The Version of the PHP in use.
     * 
     */
    private String phpVersion;
    private Boolean python;
    /**
     * @return The Version of Python in use.
     * 
     */
    private String pythonVersion;
    private String tomcatVersion;

    private GetWindowsWebAppSiteConfigApplicationStack() {}
    /**
     * @return The Current Stack value of the Windows Web App.
     * 
     */
    public String currentStack() {
        return this.currentStack;
    }
    public String dockerContainerName() {
        return this.dockerContainerName;
    }
    public String dockerContainerRegistry() {
        return this.dockerContainerRegistry;
    }
    public String dockerContainerTag() {
        return this.dockerContainerTag;
    }
    /**
     * @return The docker image, including tag, used by this Windows Web App.
     * 
     */
    public String dockerImageName() {
        return this.dockerImageName;
    }
    /**
     * @return The User Name to use for authentication against the registry to pull the image.
     * 
     */
    public String dockerRegistryPassword() {
        return this.dockerRegistryPassword;
    }
    /**
     * @return The URL of the container registry where the `docker_image_name` is located.
     * 
     */
    public String dockerRegistryUrl() {
        return this.dockerRegistryUrl;
    }
    /**
     * @return The User Name to use for authentication against the registry to pull the image.
     * 
     */
    public String dockerRegistryUsername() {
        return this.dockerRegistryUsername;
    }
    public String dotnetCoreVersion() {
        return this.dotnetCoreVersion;
    }
    /**
     * @return The version of .NET in use.
     * 
     */
    public String dotnetVersion() {
        return this.dotnetVersion;
    }
    /**
     * @return The Java Container in use.
     * 
     */
    public String javaContainer() {
        return this.javaContainer;
    }
    /**
     * @return The Version of the Java Container in use.
     * 
     */
    public String javaContainerVersion() {
        return this.javaContainerVersion;
    }
    public Boolean javaEmbeddedServerEnabled() {
        return this.javaEmbeddedServerEnabled;
    }
    /**
     * @return The Version of Java in use.
     * 
     */
    public String javaVersion() {
        return this.javaVersion;
    }
    /**
     * @return The Version of Node in use.
     * 
     */
    public String nodeVersion() {
        return this.nodeVersion;
    }
    /**
     * @return The Version of the PHP in use.
     * 
     */
    public String phpVersion() {
        return this.phpVersion;
    }
    public Boolean python() {
        return this.python;
    }
    /**
     * @return The Version of Python in use.
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    public String tomcatVersion() {
        return this.tomcatVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfigApplicationStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String currentStack;
        private String dockerContainerName;
        private String dockerContainerRegistry;
        private String dockerContainerTag;
        private String dockerImageName;
        private String dockerRegistryPassword;
        private String dockerRegistryUrl;
        private String dockerRegistryUsername;
        private String dotnetCoreVersion;
        private String dotnetVersion;
        private String javaContainer;
        private String javaContainerVersion;
        private Boolean javaEmbeddedServerEnabled;
        private String javaVersion;
        private String nodeVersion;
        private String phpVersion;
        private Boolean python;
        private String pythonVersion;
        private String tomcatVersion;
        public Builder() {}
        public Builder(GetWindowsWebAppSiteConfigApplicationStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentStack = defaults.currentStack;
    	      this.dockerContainerName = defaults.dockerContainerName;
    	      this.dockerContainerRegistry = defaults.dockerContainerRegistry;
    	      this.dockerContainerTag = defaults.dockerContainerTag;
    	      this.dockerImageName = defaults.dockerImageName;
    	      this.dockerRegistryPassword = defaults.dockerRegistryPassword;
    	      this.dockerRegistryUrl = defaults.dockerRegistryUrl;
    	      this.dockerRegistryUsername = defaults.dockerRegistryUsername;
    	      this.dotnetCoreVersion = defaults.dotnetCoreVersion;
    	      this.dotnetVersion = defaults.dotnetVersion;
    	      this.javaContainer = defaults.javaContainer;
    	      this.javaContainerVersion = defaults.javaContainerVersion;
    	      this.javaEmbeddedServerEnabled = defaults.javaEmbeddedServerEnabled;
    	      this.javaVersion = defaults.javaVersion;
    	      this.nodeVersion = defaults.nodeVersion;
    	      this.phpVersion = defaults.phpVersion;
    	      this.python = defaults.python;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.tomcatVersion = defaults.tomcatVersion;
        }

        @CustomType.Setter
        public Builder currentStack(String currentStack) {
            this.currentStack = Objects.requireNonNull(currentStack);
            return this;
        }
        @CustomType.Setter
        public Builder dockerContainerName(String dockerContainerName) {
            this.dockerContainerName = Objects.requireNonNull(dockerContainerName);
            return this;
        }
        @CustomType.Setter
        public Builder dockerContainerRegistry(String dockerContainerRegistry) {
            this.dockerContainerRegistry = Objects.requireNonNull(dockerContainerRegistry);
            return this;
        }
        @CustomType.Setter
        public Builder dockerContainerTag(String dockerContainerTag) {
            this.dockerContainerTag = Objects.requireNonNull(dockerContainerTag);
            return this;
        }
        @CustomType.Setter
        public Builder dockerImageName(String dockerImageName) {
            this.dockerImageName = Objects.requireNonNull(dockerImageName);
            return this;
        }
        @CustomType.Setter
        public Builder dockerRegistryPassword(String dockerRegistryPassword) {
            this.dockerRegistryPassword = Objects.requireNonNull(dockerRegistryPassword);
            return this;
        }
        @CustomType.Setter
        public Builder dockerRegistryUrl(String dockerRegistryUrl) {
            this.dockerRegistryUrl = Objects.requireNonNull(dockerRegistryUrl);
            return this;
        }
        @CustomType.Setter
        public Builder dockerRegistryUsername(String dockerRegistryUsername) {
            this.dockerRegistryUsername = Objects.requireNonNull(dockerRegistryUsername);
            return this;
        }
        @CustomType.Setter
        public Builder dotnetCoreVersion(String dotnetCoreVersion) {
            this.dotnetCoreVersion = Objects.requireNonNull(dotnetCoreVersion);
            return this;
        }
        @CustomType.Setter
        public Builder dotnetVersion(String dotnetVersion) {
            this.dotnetVersion = Objects.requireNonNull(dotnetVersion);
            return this;
        }
        @CustomType.Setter
        public Builder javaContainer(String javaContainer) {
            this.javaContainer = Objects.requireNonNull(javaContainer);
            return this;
        }
        @CustomType.Setter
        public Builder javaContainerVersion(String javaContainerVersion) {
            this.javaContainerVersion = Objects.requireNonNull(javaContainerVersion);
            return this;
        }
        @CustomType.Setter
        public Builder javaEmbeddedServerEnabled(Boolean javaEmbeddedServerEnabled) {
            this.javaEmbeddedServerEnabled = Objects.requireNonNull(javaEmbeddedServerEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = Objects.requireNonNull(javaVersion);
            return this;
        }
        @CustomType.Setter
        public Builder nodeVersion(String nodeVersion) {
            this.nodeVersion = Objects.requireNonNull(nodeVersion);
            return this;
        }
        @CustomType.Setter
        public Builder phpVersion(String phpVersion) {
            this.phpVersion = Objects.requireNonNull(phpVersion);
            return this;
        }
        @CustomType.Setter
        public Builder python(Boolean python) {
            this.python = Objects.requireNonNull(python);
            return this;
        }
        @CustomType.Setter
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        @CustomType.Setter
        public Builder tomcatVersion(String tomcatVersion) {
            this.tomcatVersion = Objects.requireNonNull(tomcatVersion);
            return this;
        }
        public GetWindowsWebAppSiteConfigApplicationStack build() {
            final var _resultValue = new GetWindowsWebAppSiteConfigApplicationStack();
            _resultValue.currentStack = currentStack;
            _resultValue.dockerContainerName = dockerContainerName;
            _resultValue.dockerContainerRegistry = dockerContainerRegistry;
            _resultValue.dockerContainerTag = dockerContainerTag;
            _resultValue.dockerImageName = dockerImageName;
            _resultValue.dockerRegistryPassword = dockerRegistryPassword;
            _resultValue.dockerRegistryUrl = dockerRegistryUrl;
            _resultValue.dockerRegistryUsername = dockerRegistryUsername;
            _resultValue.dotnetCoreVersion = dotnetCoreVersion;
            _resultValue.dotnetVersion = dotnetVersion;
            _resultValue.javaContainer = javaContainer;
            _resultValue.javaContainerVersion = javaContainerVersion;
            _resultValue.javaEmbeddedServerEnabled = javaEmbeddedServerEnabled;
            _resultValue.javaVersion = javaVersion;
            _resultValue.nodeVersion = nodeVersion;
            _resultValue.phpVersion = phpVersion;
            _resultValue.python = python;
            _resultValue.pythonVersion = pythonVersion;
            _resultValue.tomcatVersion = tomcatVersion;
            return _resultValue;
        }
    }
}
