// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.orbital;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.orbital.ContactArgs;
import com.pulumi.azure.orbital.inputs.ContactState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an orbital contact.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.orbital.Spacecraft;
 * import com.pulumi.azure.orbital.SpacecraftArgs;
 * import com.pulumi.azure.orbital.inputs.SpacecraftLinkArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.orbital.ContactProfile;
 * import com.pulumi.azure.orbital.ContactProfileArgs;
 * import com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs;
 * import com.pulumi.azure.orbital.Contact;
 * import com.pulumi.azure.orbital.ContactArgs;
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
 *         var exampleSpacecraft = new Spacecraft(&#34;exampleSpacecraft&#34;, SpacecraftArgs.builder()        
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .location(&#34;westeurope&#34;)
 *             .noradId(&#34;12345&#34;)
 *             .links(SpacecraftLinkArgs.builder()
 *                 .bandwidthMhz(100)
 *                 .centerFrequencyMhz(101)
 *                 .direction(&#34;Uplink&#34;)
 *                 .polarization(&#34;LHCP&#34;)
 *                 .name(&#34;examplename&#34;)
 *                 .build())
 *             .twoLineElements(            
 *                 &#34;1 23455U 94089A   97320.90946019  .00000140  00000-0  10191-3 0  2621&#34;,
 *                 &#34;2 23455  99.0090 272.6745 0008546 223.1686 136.8816 14.11711747148495&#34;)
 *             .titleLine(&#34;AQUA&#34;)
 *             .tags(Map.of(&#34;aks-managed-cluster-name&#34;, &#34;9a57225d-a405-4d40-aa46-f13d2342abef&#34;))
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;orbitalgateway&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.Orbital/orbitalGateways&#34;)
 *                     .actions(                    
 *                         &#34;Microsoft.Network/publicIPAddresses/join/action&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/read&#34;,
 *                         &#34;Microsoft.Network/publicIPAddresses/read&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleContactProfile = new ContactProfile(&#34;exampleContactProfile&#34;, ContactProfileArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .minimumVariableContactDuration(&#34;PT1M&#34;)
 *             .autoTracking(&#34;disabled&#34;)
 *             .links(ContactProfileLinkArgs.builder()
 *                 .channels(ContactProfileLinkChannelArgs.builder()
 *                     .name(&#34;channelname&#34;)
 *                     .bandwidthMhz(100)
 *                     .centerFrequencyMhz(101)
 *                     .endPoints(ContactProfileLinkChannelEndPointArgs.builder()
 *                         .endPointName(&#34;AQUA_command&#34;)
 *                         .ipAddress(&#34;10.0.1.0&#34;)
 *                         .port(&#34;49153&#34;)
 *                         .protocol(&#34;TCP&#34;)
 *                         .build())
 *                     .build())
 *                 .direction(&#34;Uplink&#34;)
 *                 .name(&#34;RHCP_UL&#34;)
 *                 .polarization(&#34;RHCP&#34;)
 *                 .build())
 *             .networkConfigurationSubnetId(exampleSubnet.id())
 *             .build());
 * 
 *         var exampleContact = new Contact(&#34;exampleContact&#34;, ContactArgs.builder()        
 *             .spacecraftId(exampleSpacecraft.id())
 *             .reservationStartTime(&#34;2020-07-16T20:35:00.00Z&#34;)
 *             .reservationEndTime(&#34;2020-07-16T20:55:00.00Z&#34;)
 *             .groundStationName(&#34;WESTUS2_0&#34;)
 *             .contactProfileId(exampleContactProfile.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spacecraft can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:orbital/contact:Contact example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/spacecrafts/spacecraft1/contacts/contact1
 * ```
 * 
 */
@ResourceType(type="azure:orbital/contact:Contact")
public class Contact extends com.pulumi.resources.CustomResource {
    /**
     * ID of the orbital contact profile. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="contactProfileId", refs={String.class}, tree="[0]")
    private Output<String> contactProfileId;

    /**
     * @return ID of the orbital contact profile. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> contactProfileId() {
        return this.contactProfileId;
    }
    /**
     * Name of the Azure ground station. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="groundStationName", refs={String.class}, tree="[0]")
    private Output<String> groundStationName;

    /**
     * @return Name of the Azure ground station. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> groundStationName() {
        return this.groundStationName;
    }
    /**
     * The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Reservation end time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="reservationEndTime", refs={String.class}, tree="[0]")
    private Output<String> reservationEndTime;

    /**
     * @return Reservation end time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> reservationEndTime() {
        return this.reservationEndTime;
    }
    /**
     * Reservation start time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="reservationStartTime", refs={String.class}, tree="[0]")
    private Output<String> reservationStartTime;

    /**
     * @return Reservation start time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> reservationStartTime() {
        return this.reservationStartTime;
    }
    /**
     * The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="spacecraftId", refs={String.class}, tree="[0]")
    private Output<String> spacecraftId;

    /**
     * @return The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> spacecraftId() {
        return this.spacecraftId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Contact(String name) {
        this(name, ContactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Contact(String name, ContactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Contact(String name, ContactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:orbital/contact:Contact", name, args == null ? ContactArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Contact(String name, Output<String> id, @Nullable ContactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:orbital/contact:Contact", name, state, makeResourceOptions(options, id));
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
    public static Contact get(String name, Output<String> id, @Nullable ContactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Contact(name, id, state, options);
    }
}