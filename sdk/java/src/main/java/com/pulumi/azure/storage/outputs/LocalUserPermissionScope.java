// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.LocalUserPermissionScopePermissions;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocalUserPermissionScope {
    /**
     * @return A `permissions` block as defined below.
     * 
     */
    private LocalUserPermissionScopePermissions permissions;
    /**
     * @return The container name (when `service` is set to `blob`) or the file share name (when `service` is set to `file`), used by the Storage Account Local User.
     * 
     */
    private String resourceName;
    /**
     * @return The storage service used by this Storage Account Local User. Possible values are `blob` and `file`.
     * 
     */
    private String service;

    private LocalUserPermissionScope() {}
    /**
     * @return A `permissions` block as defined below.
     * 
     */
    public LocalUserPermissionScopePermissions permissions() {
        return this.permissions;
    }
    /**
     * @return The container name (when `service` is set to `blob`) or the file share name (when `service` is set to `file`), used by the Storage Account Local User.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return The storage service used by this Storage Account Local User. Possible values are `blob` and `file`.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalUserPermissionScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private LocalUserPermissionScopePermissions permissions;
        private String resourceName;
        private String service;
        public Builder() {}
        public Builder(LocalUserPermissionScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.resourceName = defaults.resourceName;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder permissions(LocalUserPermissionScopePermissions permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public LocalUserPermissionScope build() {
            final var o = new LocalUserPermissionScope();
            o.permissions = permissions;
            o.resourceName = resourceName;
            o.service = service;
            return o;
        }
    }
}