// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.PoolStartTaskResourceFile;
import com.pulumi.azure.batch.outputs.PoolStartTaskUserIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoolStartTask {
    /**
     * @return The command line executed by the start task.
     * 
     */
    private final String commandLine;
    /**
     * @return A map of strings (key,value) that represents the environment variables to set in the start task.
     * 
     */
    private final @Nullable Map<String,String> commonEnvironmentProperties;
    /**
     * @return One or more `resource_file` blocks that describe the files to be downloaded to a compute node.
     * 
     */
    private final @Nullable List<PoolStartTaskResourceFile> resourceFiles;
    /**
     * @return The number of retry count. Defaults to `1`.
     * 
     */
    private final @Nullable Integer taskRetryMaximum;
    /**
     * @return A `user_identity` block that describes the user identity under which the start task runs.
     * 
     */
    private final PoolStartTaskUserIdentity userIdentity;
    /**
     * @return A flag that indicates if the Batch pool should wait for the start task to be completed. Default to `false`.
     * 
     */
    private final @Nullable Boolean waitForSuccess;

    @CustomType.Constructor
    private PoolStartTask(
        @CustomType.Parameter("commandLine") String commandLine,
        @CustomType.Parameter("commonEnvironmentProperties") @Nullable Map<String,String> commonEnvironmentProperties,
        @CustomType.Parameter("resourceFiles") @Nullable List<PoolStartTaskResourceFile> resourceFiles,
        @CustomType.Parameter("taskRetryMaximum") @Nullable Integer taskRetryMaximum,
        @CustomType.Parameter("userIdentity") PoolStartTaskUserIdentity userIdentity,
        @CustomType.Parameter("waitForSuccess") @Nullable Boolean waitForSuccess) {
        this.commandLine = commandLine;
        this.commonEnvironmentProperties = commonEnvironmentProperties;
        this.resourceFiles = resourceFiles;
        this.taskRetryMaximum = taskRetryMaximum;
        this.userIdentity = userIdentity;
        this.waitForSuccess = waitForSuccess;
    }

    /**
     * @return The command line executed by the start task.
     * 
     */
    public String commandLine() {
        return this.commandLine;
    }
    /**
     * @return A map of strings (key,value) that represents the environment variables to set in the start task.
     * 
     */
    public Map<String,String> commonEnvironmentProperties() {
        return this.commonEnvironmentProperties == null ? Map.of() : this.commonEnvironmentProperties;
    }
    /**
     * @return One or more `resource_file` blocks that describe the files to be downloaded to a compute node.
     * 
     */
    public List<PoolStartTaskResourceFile> resourceFiles() {
        return this.resourceFiles == null ? List.of() : this.resourceFiles;
    }
    /**
     * @return The number of retry count. Defaults to `1`.
     * 
     */
    public Optional<Integer> taskRetryMaximum() {
        return Optional.ofNullable(this.taskRetryMaximum);
    }
    /**
     * @return A `user_identity` block that describes the user identity under which the start task runs.
     * 
     */
    public PoolStartTaskUserIdentity userIdentity() {
        return this.userIdentity;
    }
    /**
     * @return A flag that indicates if the Batch pool should wait for the start task to be completed. Default to `false`.
     * 
     */
    public Optional<Boolean> waitForSuccess() {
        return Optional.ofNullable(this.waitForSuccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolStartTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commandLine;
        private @Nullable Map<String,String> commonEnvironmentProperties;
        private @Nullable List<PoolStartTaskResourceFile> resourceFiles;
        private @Nullable Integer taskRetryMaximum;
        private PoolStartTaskUserIdentity userIdentity;
        private @Nullable Boolean waitForSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolStartTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLine = defaults.commandLine;
    	      this.commonEnvironmentProperties = defaults.commonEnvironmentProperties;
    	      this.resourceFiles = defaults.resourceFiles;
    	      this.taskRetryMaximum = defaults.taskRetryMaximum;
    	      this.userIdentity = defaults.userIdentity;
    	      this.waitForSuccess = defaults.waitForSuccess;
        }

        public Builder commandLine(String commandLine) {
            this.commandLine = Objects.requireNonNull(commandLine);
            return this;
        }
        public Builder commonEnvironmentProperties(@Nullable Map<String,String> commonEnvironmentProperties) {
            this.commonEnvironmentProperties = commonEnvironmentProperties;
            return this;
        }
        public Builder resourceFiles(@Nullable List<PoolStartTaskResourceFile> resourceFiles) {
            this.resourceFiles = resourceFiles;
            return this;
        }
        public Builder resourceFiles(PoolStartTaskResourceFile... resourceFiles) {
            return resourceFiles(List.of(resourceFiles));
        }
        public Builder taskRetryMaximum(@Nullable Integer taskRetryMaximum) {
            this.taskRetryMaximum = taskRetryMaximum;
            return this;
        }
        public Builder userIdentity(PoolStartTaskUserIdentity userIdentity) {
            this.userIdentity = Objects.requireNonNull(userIdentity);
            return this;
        }
        public Builder waitForSuccess(@Nullable Boolean waitForSuccess) {
            this.waitForSuccess = waitForSuccess;
            return this;
        }        public PoolStartTask build() {
            return new PoolStartTask(commandLine, commonEnvironmentProperties, resourceFiles, taskRetryMaximum, userIdentity, waitForSuccess);
        }
    }
}