// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeGroupSapHanaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeGroupSapHanaPlainArgs Empty = new GetVolumeGroupSapHanaPlainArgs();

    /**
     * Name of the account where the application volume group belong to.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Name of the account where the application volume group belong to.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of this Application Volume Group for SAP HANA application.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Application Volume Group for SAP HANA application.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Application Volume Group exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Application Volume Group exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVolumeGroupSapHanaPlainArgs() {}

    private GetVolumeGroupSapHanaPlainArgs(GetVolumeGroupSapHanaPlainArgs $) {
        this.accountName = $.accountName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeGroupSapHanaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeGroupSapHanaPlainArgs $;

        public Builder() {
            $ = new GetVolumeGroupSapHanaPlainArgs();
        }

        public Builder(GetVolumeGroupSapHanaPlainArgs defaults) {
            $ = new GetVolumeGroupSapHanaPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Name of the account where the application volume group belong to.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param name The name of this Application Volume Group for SAP HANA application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Application Volume Group exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetVolumeGroupSapHanaPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
