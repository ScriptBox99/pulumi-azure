// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mobile.NetworkAttachedDataNetworkArgs;
import com.pulumi.azure.mobile.inputs.NetworkAttachedDataNetworkState;
import com.pulumi.azure.mobile.outputs.NetworkAttachedDataNetworkNetworkAddressPortTranslation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Mobile Network Attached Data Network.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.databoxedge.Device;
 * import com.pulumi.azure.databoxedge.DeviceArgs;
 * import com.pulumi.azure.mobile.Network;
 * import com.pulumi.azure.mobile.NetworkArgs;
 * import com.pulumi.azure.mobile.NetworkPacketCoreControlPlane;
 * import com.pulumi.azure.mobile.NetworkPacketCoreControlPlaneArgs;
 * import com.pulumi.azure.mobile.inputs.NetworkPacketCoreControlPlanePlatformArgs;
 * import com.pulumi.azure.mobile.NetworkPacketCoreDataPlane;
 * import com.pulumi.azure.mobile.NetworkPacketCoreDataPlaneArgs;
 * import com.pulumi.azure.mobile.NetworkDataNetwork;
 * import com.pulumi.azure.mobile.NetworkDataNetworkArgs;
 * import com.pulumi.azure.mobile.NetworkAttachedDataNetwork;
 * import com.pulumi.azure.mobile.NetworkAttachedDataNetworkArgs;
 * import com.pulumi.azure.mobile.inputs.NetworkAttachedDataNetworkNetworkAddressPortTranslationArgs;
 * import com.pulumi.azure.mobile.inputs.NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleDevice = new Device(&#34;exampleDevice&#34;, DeviceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .skuName(&#34;EdgeP_Base-Standard&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .mobileCountryCode(&#34;001&#34;)
 *             .mobileNetworkCode(&#34;01&#34;)
 *             .build());
 * 
 *         var exampleNetworkPacketCoreControlPlane = new NetworkPacketCoreControlPlane(&#34;exampleNetworkPacketCoreControlPlane&#34;, NetworkPacketCoreControlPlaneArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(&#34;West Europe&#34;)
 *             .sku(&#34;G0&#34;)
 *             .mobileNetworkId(exampleNetwork.id())
 *             .controlPlaneAccessName(&#34;default-interface&#34;)
 *             .controlPlaneAccessIpv4Address(&#34;192.168.1.199&#34;)
 *             .controlPlaneAccessIpv4Gateway(&#34;192.168.1.1&#34;)
 *             .controlPlaneAccessIpv4Subnet(&#34;192.168.1.0/25&#34;)
 *             .platform(NetworkPacketCoreControlPlanePlatformArgs.builder()
 *                 .type(&#34;AKS-HCI&#34;)
 *                 .edgeDeviceId(exampleDevice.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleNetworkPacketCoreDataPlane = new NetworkPacketCoreDataPlane(&#34;exampleNetworkPacketCoreDataPlane&#34;, NetworkPacketCoreDataPlaneArgs.builder()        
 *             .mobileNetworkPacketCoreControlPlaneId(exampleNetworkPacketCoreControlPlane.id())
 *             .location(exampleResourceGroup.location())
 *             .userPlaneAccessName(&#34;default-interface&#34;)
 *             .userPlaneAccessIpv4Address(&#34;192.168.1.199&#34;)
 *             .userPlaneAccessIpv4Gateway(&#34;192.168.1.1&#34;)
 *             .userPlaneAccessIpv4Subnet(&#34;192.168.1.0/25&#34;)
 *             .build());
 * 
 *         var exampleNetworkDataNetwork = new NetworkDataNetwork(&#34;exampleNetworkDataNetwork&#34;, NetworkDataNetworkArgs.builder()        
 *             .mobileNetworkId(exampleNetwork.id())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleNetworkAttachedDataNetwork = new NetworkAttachedDataNetwork(&#34;exampleNetworkAttachedDataNetwork&#34;, NetworkAttachedDataNetworkArgs.builder()        
 *             .mobileNetworkDataNetworkName(exampleNetworkDataNetwork.name())
 *             .mobileNetworkPacketCoreDataPlaneId(exampleNetworkPacketCoreDataPlane.id())
 *             .location(exampleResourceGroup.location())
 *             .dnsAddresses(&#34;1.1.1.1&#34;)
 *             .userEquipmentAddressPoolPrefixes(&#34;2.4.1.0/24&#34;)
 *             .userEquipmentStaticAddressPoolPrefixes(&#34;2.4.2.0/24&#34;)
 *             .userPlaneAccessName(&#34;test&#34;)
 *             .userPlaneAccessIpv4Address(&#34;10.204.141.4&#34;)
 *             .userPlaneAccessIpv4Gateway(&#34;10.204.141.1&#34;)
 *             .userPlaneAccessIpv4Subnet(&#34;10.204.141.0/24&#34;)
 *             .networkAddressPortTranslation(NetworkAttachedDataNetworkNetworkAddressPortTranslationArgs.builder()
 *                 .pinholeMaximumNumber(65536)
 *                 .icmpPinholeTimeoutInSeconds(30)
 *                 .tcpPinholeTimeoutInSeconds(100)
 *                 .udpPinholeTimeoutInSeconds(39)
 *                 .portRange(NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs.builder()
 *                     .maximum(49999)
 *                     .minimum(1024)
 *                     .build())
 *                 .tcpPortReuseMinimumHoldTimeInSeconds(120)
 *                 .udpTcpPortReuseMinimumHoldTimeInSeconds(60)
 *                 .build())
 *             .tags(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Mobile Network Attached Data Network can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mobile/networkAttachedDataNetwork:NetworkAttachedDataNetwork example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/packetCoreControlPlanes/packetCoreControlPlane1/packetCoreDataPlanes/packetCoreDataPlane1/attachedDataNetworks/attachedDataNetwork1
 * ```
 * 
 */
@ResourceType(type="azure:mobile/networkAttachedDataNetwork:NetworkAttachedDataNetwork")
public class NetworkAttachedDataNetwork extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the DNS servers to signal to UEs to use for this attached data network.
     * 
     */
    @Export(name="dnsAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dnsAddresses;

    /**
     * @return Specifies the DNS servers to signal to UEs to use for this attached data network.
     * 
     */
    public Output<List<String>> dnsAddresses() {
        return this.dnsAddresses;
    }
    /**
     * Specifies the Azure Region where the Mobile Network Attached Data Network should exist. Changing this forces a new Mobile Network Attached Data Network to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Mobile Network Attached Data Network should exist. Changing this forces a new Mobile Network Attached Data Network to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the `azure.mobile.NetworkDataNetwork` which the Attached Data Network belongs to, Changing this forces a new Mobile Network Attached Data Network to be created.
     * 
     */
    @Export(name="mobileNetworkDataNetworkName", refs={String.class}, tree="[0]")
    private Output<String> mobileNetworkDataNetworkName;

    /**
     * @return Specifies the name of the `azure.mobile.NetworkDataNetwork` which the Attached Data Network belongs to, Changing this forces a new Mobile Network Attached Data Network to be created.
     * 
     */
    public Output<String> mobileNetworkDataNetworkName() {
        return this.mobileNetworkDataNetworkName;
    }
    /**
     * Specifies the ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to. Changing this forces a new Mobile Network Attached Data Network to be created.
     * 
     */
    @Export(name="mobileNetworkPacketCoreDataPlaneId", refs={String.class}, tree="[0]")
    private Output<String> mobileNetworkPacketCoreDataPlaneId;

    /**
     * @return Specifies the ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to. Changing this forces a new Mobile Network Attached Data Network to be created.
     * 
     */
    public Output<String> mobileNetworkPacketCoreDataPlaneId() {
        return this.mobileNetworkPacketCoreDataPlaneId;
    }
    /**
     * A `network_address_port_translation` block as defined below.
     * 
     */
    @Export(name="networkAddressPortTranslation", refs={NetworkAttachedDataNetworkNetworkAddressPortTranslation.class}, tree="[0]")
    private Output</* @Nullable */ NetworkAttachedDataNetworkNetworkAddressPortTranslation> networkAddressPortTranslation;

    /**
     * @return A `network_address_port_translation` block as defined below.
     * 
     */
    public Output<Optional<NetworkAttachedDataNetworkNetworkAddressPortTranslation>> networkAddressPortTranslation() {
        return Codegen.optional(this.networkAddressPortTranslation);
    }
    /**
     * A mapping of tags which should be assigned to the Mobile Network Attached Data Network.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Attached Data Network.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="userEquipmentAddressPoolPrefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userEquipmentAddressPoolPrefixes;

    public Output<Optional<List<String>>> userEquipmentAddressPoolPrefixes() {
        return Codegen.optional(this.userEquipmentAddressPoolPrefixes);
    }
    @Export(name="userEquipmentStaticAddressPoolPrefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userEquipmentStaticAddressPoolPrefixes;

    public Output<Optional<List<String>>> userEquipmentStaticAddressPoolPrefixes() {
        return Codegen.optional(this.userEquipmentStaticAddressPoolPrefixes);
    }
    /**
     * The IPv4 address for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Export(name="userPlaneAccessIpv4Address", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userPlaneAccessIpv4Address;

    /**
     * @return The IPv4 address for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Output<Optional<String>> userPlaneAccessIpv4Address() {
        return Codegen.optional(this.userPlaneAccessIpv4Address);
    }
    /**
     * The default IPv4 gateway for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Export(name="userPlaneAccessIpv4Gateway", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userPlaneAccessIpv4Gateway;

    /**
     * @return The default IPv4 gateway for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Output<Optional<String>> userPlaneAccessIpv4Gateway() {
        return Codegen.optional(this.userPlaneAccessIpv4Gateway);
    }
    /**
     * The IPv4 subnet for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Export(name="userPlaneAccessIpv4Subnet", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userPlaneAccessIpv4Subnet;

    /**
     * @return The IPv4 subnet for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Output<Optional<String>> userPlaneAccessIpv4Subnet() {
        return Codegen.optional(this.userPlaneAccessIpv4Subnet);
    }
    /**
     * Specifies the logical name for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Export(name="userPlaneAccessName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userPlaneAccessName;

    /**
     * @return Specifies the logical name for the user data plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Output<Optional<String>> userPlaneAccessName() {
        return Codegen.optional(this.userPlaneAccessName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAttachedDataNetwork(String name) {
        this(name, NetworkAttachedDataNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAttachedDataNetwork(String name, NetworkAttachedDataNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAttachedDataNetwork(String name, NetworkAttachedDataNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mobile/networkAttachedDataNetwork:NetworkAttachedDataNetwork", name, args == null ? NetworkAttachedDataNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAttachedDataNetwork(String name, Output<String> id, @Nullable NetworkAttachedDataNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mobile/networkAttachedDataNetwork:NetworkAttachedDataNetwork", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkAttachedDataNetwork get(String name, Output<String> id, @Nullable NetworkAttachedDataNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAttachedDataNetwork(name, id, state, options);
    }
}
