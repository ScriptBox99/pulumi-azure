// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalUserPermissionScopePermissionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalUserPermissionScopePermissionsArgs Empty = new LocalUserPermissionScopePermissionsArgs();

    /**
     * Specifies if the Local User has the create permission for this scope. Defaults to `false`.
     * 
     */
    @Import(name="create")
    private @Nullable Output<Boolean> create;

    /**
     * @return Specifies if the Local User has the create permission for this scope. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> create() {
        return Optional.ofNullable(this.create);
    }

    /**
     * Specifies if the Local User has the delete permission for this scope. Defaults to `false`.
     * 
     */
    @Import(name="delete")
    private @Nullable Output<Boolean> delete;

    /**
     * @return Specifies if the Local User has the delete permission for this scope. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * Specifies if the Local User has the list permission for this scope. Defaults to `false`.
     * 
     */
    @Import(name="list")
    private @Nullable Output<Boolean> list;

    /**
     * @return Specifies if the Local User has the list permission for this scope. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> list() {
        return Optional.ofNullable(this.list);
    }

    /**
     * Specifies if the Local User has the read permission for this scope. Defaults to `false`.
     * 
     */
    @Import(name="read")
    private @Nullable Output<Boolean> read;

    /**
     * @return Specifies if the Local User has the read permission for this scope. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> read() {
        return Optional.ofNullable(this.read);
    }

    /**
     * Specifies if the Local User has the write permission for this scope. Defaults to `false`.
     * 
     */
    @Import(name="write")
    private @Nullable Output<Boolean> write;

    /**
     * @return Specifies if the Local User has the write permission for this scope. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> write() {
        return Optional.ofNullable(this.write);
    }

    private LocalUserPermissionScopePermissionsArgs() {}

    private LocalUserPermissionScopePermissionsArgs(LocalUserPermissionScopePermissionsArgs $) {
        this.create = $.create;
        this.delete = $.delete;
        this.list = $.list;
        this.read = $.read;
        this.write = $.write;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalUserPermissionScopePermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalUserPermissionScopePermissionsArgs $;

        public Builder() {
            $ = new LocalUserPermissionScopePermissionsArgs();
        }

        public Builder(LocalUserPermissionScopePermissionsArgs defaults) {
            $ = new LocalUserPermissionScopePermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param create Specifies if the Local User has the create permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder create(@Nullable Output<Boolean> create) {
            $.create = create;
            return this;
        }

        /**
         * @param create Specifies if the Local User has the create permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder create(Boolean create) {
            return create(Output.of(create));
        }

        /**
         * @param delete Specifies if the Local User has the delete permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder delete(@Nullable Output<Boolean> delete) {
            $.delete = delete;
            return this;
        }

        /**
         * @param delete Specifies if the Local User has the delete permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder delete(Boolean delete) {
            return delete(Output.of(delete));
        }

        /**
         * @param list Specifies if the Local User has the list permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder list(@Nullable Output<Boolean> list) {
            $.list = list;
            return this;
        }

        /**
         * @param list Specifies if the Local User has the list permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder list(Boolean list) {
            return list(Output.of(list));
        }

        /**
         * @param read Specifies if the Local User has the read permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder read(@Nullable Output<Boolean> read) {
            $.read = read;
            return this;
        }

        /**
         * @param read Specifies if the Local User has the read permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder read(Boolean read) {
            return read(Output.of(read));
        }

        /**
         * @param write Specifies if the Local User has the write permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder write(@Nullable Output<Boolean> write) {
            $.write = write;
            return this;
        }

        /**
         * @param write Specifies if the Local User has the write permission for this scope. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder write(Boolean write) {
            return write(Output.of(write));
        }

        public LocalUserPermissionScopePermissionsArgs build() {
            return $;
        }
    }

}