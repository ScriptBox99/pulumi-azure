// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.storage.inputs.TableAclArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * One or more `acl` blocks as defined below.
     * 
     */
    @Import(name="acls")
    private @Nullable Output<List<TableAclArgs>> acls;

    /**
     * @return One or more `acl` blocks as defined below.
     * 
     */
    public Optional<Output<List<TableAclArgs>>> acls() {
        return Optional.ofNullable(this.acls);
    }

    /**
     * The name of the storage table. Must be unique within the storage account the table is located.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the storage table. Must be unique within the storage account the table is located.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the storage account in which to create the storage table.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return Specifies the storage account in which to create the storage table.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    private TableArgs() {}

    private TableArgs(TableArgs $) {
        this.acls = $.acls;
        this.name = $.name;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableArgs $;

        public Builder() {
            $ = new TableArgs();
        }

        public Builder(TableArgs defaults) {
            $ = new TableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls One or more `acl` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable Output<List<TableAclArgs>> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls One or more `acl` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder acls(List<TableAclArgs> acls) {
            return acls(Output.of(acls));
        }

        /**
         * @param acls One or more `acl` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder acls(TableAclArgs... acls) {
            return acls(List.of(acls));
        }

        /**
         * @param name The name of the storage table. Must be unique within the storage account the table is located.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the storage table. Must be unique within the storage account the table is located.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountName Specifies the storage account in which to create the storage table.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName Specifies the storage account in which to create the storage table.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public TableArgs build() {
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            return $;
        }
    }

}