// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppServiceSourceControl {
    /**
     * @return The branch of the remote repository in use.
     * 
     */
    private final String branch;
    /**
     * @return Limits to manual integration.
     * 
     */
    private final Boolean manualIntegration;
    /**
     * @return The URL of the source code repository.
     * 
     */
    private final String repoUrl;
    /**
     * @return Is roll-back enabled for the repository.
     * 
     */
    private final Boolean rollbackEnabled;
    /**
     * @return Uses Mercurial if `true`, otherwise uses Git.
     * 
     */
    private final Boolean useMercurial;

    @CustomType.Constructor
    private GetAppServiceSourceControl(
        @CustomType.Parameter("branch") String branch,
        @CustomType.Parameter("manualIntegration") Boolean manualIntegration,
        @CustomType.Parameter("repoUrl") String repoUrl,
        @CustomType.Parameter("rollbackEnabled") Boolean rollbackEnabled,
        @CustomType.Parameter("useMercurial") Boolean useMercurial) {
        this.branch = branch;
        this.manualIntegration = manualIntegration;
        this.repoUrl = repoUrl;
        this.rollbackEnabled = rollbackEnabled;
        this.useMercurial = useMercurial;
    }

    /**
     * @return The branch of the remote repository in use.
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return Limits to manual integration.
     * 
     */
    public Boolean manualIntegration() {
        return this.manualIntegration;
    }
    /**
     * @return The URL of the source code repository.
     * 
     */
    public String repoUrl() {
        return this.repoUrl;
    }
    /**
     * @return Is roll-back enabled for the repository.
     * 
     */
    public Boolean rollbackEnabled() {
        return this.rollbackEnabled;
    }
    /**
     * @return Uses Mercurial if `true`, otherwise uses Git.
     * 
     */
    public Boolean useMercurial() {
        return this.useMercurial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceSourceControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private Boolean manualIntegration;
        private String repoUrl;
        private Boolean rollbackEnabled;
        private Boolean useMercurial;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceSourceControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.manualIntegration = defaults.manualIntegration;
    	      this.repoUrl = defaults.repoUrl;
    	      this.rollbackEnabled = defaults.rollbackEnabled;
    	      this.useMercurial = defaults.useMercurial;
        }

        public Builder branch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder manualIntegration(Boolean manualIntegration) {
            this.manualIntegration = Objects.requireNonNull(manualIntegration);
            return this;
        }
        public Builder repoUrl(String repoUrl) {
            this.repoUrl = Objects.requireNonNull(repoUrl);
            return this;
        }
        public Builder rollbackEnabled(Boolean rollbackEnabled) {
            this.rollbackEnabled = Objects.requireNonNull(rollbackEnabled);
            return this;
        }
        public Builder useMercurial(Boolean useMercurial) {
            this.useMercurial = Objects.requireNonNull(useMercurial);
            return this;
        }        public GetAppServiceSourceControl build() {
            return new GetAppServiceSourceControl(branch, manualIntegration, repoUrl, rollbackEnabled, useMercurial);
        }
    }
}