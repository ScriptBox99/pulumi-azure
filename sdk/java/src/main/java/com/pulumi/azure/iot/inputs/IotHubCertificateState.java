// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotHubCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final IotHubCertificateState Empty = new IotHubCertificateState();

    /**
     * The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
     * 
     */
    @Import(name="certificateContent")
    private @Nullable Output<String> certificateContent;

    /**
     * @return The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
     * 
     */
    public Optional<Output<String>> certificateContent() {
        return Optional.ofNullable(this.certificateContent);
    }

    /**
     * The name of the IoT Device Provisioning Service that this certificate will be attached to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="iotDpsName")
    private @Nullable Output<String> iotDpsName;

    /**
     * @return The name of the IoT Device Provisioning Service that this certificate will be attached to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> iotDpsName() {
        return Optional.ofNullable(this.iotDpsName);
    }

    /**
     * Specifies the name of the Iot Device Provisioning Service Certificate resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Iot Device Provisioning Service Certificate resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group under which the Iot Device Provisioning Service Certificate resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the Iot Device Provisioning Service Certificate resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private IotHubCertificateState() {}

    private IotHubCertificateState(IotHubCertificateState $) {
        this.certificateContent = $.certificateContent;
        this.iotDpsName = $.iotDpsName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubCertificateState $;

        public Builder() {
            $ = new IotHubCertificateState();
        }

        public Builder(IotHubCertificateState defaults) {
            $ = new IotHubCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateContent The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
         * 
         * @return builder
         * 
         */
        public Builder certificateContent(@Nullable Output<String> certificateContent) {
            $.certificateContent = certificateContent;
            return this;
        }

        /**
         * @param certificateContent The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
         * 
         * @return builder
         * 
         */
        public Builder certificateContent(String certificateContent) {
            return certificateContent(Output.of(certificateContent));
        }

        /**
         * @param iotDpsName The name of the IoT Device Provisioning Service that this certificate will be attached to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iotDpsName(@Nullable Output<String> iotDpsName) {
            $.iotDpsName = iotDpsName;
            return this;
        }

        /**
         * @param iotDpsName The name of the IoT Device Provisioning Service that this certificate will be attached to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iotDpsName(String iotDpsName) {
            return iotDpsName(Output.of(iotDpsName));
        }

        /**
         * @param name Specifies the name of the Iot Device Provisioning Service Certificate resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Iot Device Provisioning Service Certificate resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Iot Device Provisioning Service Certificate resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Iot Device Provisioning Service Certificate resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IotHubCertificateState build() {
            return $;
        }
    }

}