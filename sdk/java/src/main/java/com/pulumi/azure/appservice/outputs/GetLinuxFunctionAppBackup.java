// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetLinuxFunctionAppBackupSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppBackup {
    /**
     * @return Is this backup job enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return The name which should be used for this Linux Function App.
     * 
     */
    private final String name;
    /**
     * @return A `schedule` block as defined below.
     * 
     */
    private final List<GetLinuxFunctionAppBackupSchedule> schedules;
    /**
     * @return The SAS URL to the container.
     * 
     */
    private final String storageAccountUrl;

    @CustomType.Constructor
    private GetLinuxFunctionAppBackup(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedules") List<GetLinuxFunctionAppBackupSchedule> schedules,
        @CustomType.Parameter("storageAccountUrl") String storageAccountUrl) {
        this.enabled = enabled;
        this.name = name;
        this.schedules = schedules;
        this.storageAccountUrl = storageAccountUrl;
    }

    /**
     * @return Is this backup job enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The name which should be used for this Linux Function App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `schedule` block as defined below.
     * 
     */
    public List<GetLinuxFunctionAppBackupSchedule> schedules() {
        return this.schedules;
    }
    /**
     * @return The SAS URL to the container.
     * 
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppBackup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String name;
        private List<GetLinuxFunctionAppBackupSchedule> schedules;
        private String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxFunctionAppBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedules(List<GetLinuxFunctionAppBackupSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetLinuxFunctionAppBackupSchedule... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }        public GetLinuxFunctionAppBackup build() {
            return new GetLinuxFunctionAppBackup(enabled, name, schedules, storageAccountUrl);
        }
    }
}