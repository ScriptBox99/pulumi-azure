// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.ImageArgs;
import com.pulumi.azure.compute.inputs.ImageState;
import com.pulumi.azure.compute.outputs.ImageDataDisk;
import com.pulumi.azure.compute.outputs.ImageOsDisk;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a custom virtual machine image that can be used to create virtual machines.
 * 
 * ## Example Usage
 * ### Creating From VHD
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
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
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name(&#34;testconfiguration1&#34;)
 *                 .privateIpAddressAllocation(&#34;Static&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualMachine = new VirtualMachine(&#34;exampleVirtualMachine&#34;, VirtualMachineArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .vmSize(&#34;Standard_D1_v2&#34;)
 *             .storageOsDisk(VirtualMachineStorageOsDiskArgs.builder()
 *                 .name(&#34;myosdisk1&#34;)
 *                 .createOption(&#34;FromImage&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleImage = new Image(&#34;exampleImage&#34;, ImageArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .osDisk(ImageOsDiskArgs.builder()
 *                 .osType(&#34;Linux&#34;)
 *                 .osState(&#34;Generalized&#34;)
 *                 .blobUri(exampleVirtualMachine.storageOsDisk().apply(storageOsDisk -&gt; storageOsDisk.vhdUri()))
 *                 .sizeGb(30)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Creating From Virtual Machine (VM Must Be Generalized Beforehand)
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
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
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name(&#34;testconfiguration1&#34;)
 *                 .privateIpAddressAllocation(&#34;Static&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualMachine = new VirtualMachine(&#34;exampleVirtualMachine&#34;, VirtualMachineArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .vmSize(&#34;Standard_D1_v2&#34;)
 *             .storageOsDisk(VirtualMachineStorageOsDiskArgs.builder()
 *                 .name(&#34;myosdisk1&#34;)
 *                 .createOption(&#34;FromImage&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleImage = new Image(&#34;exampleImage&#34;, ImageArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sourceVirtualMachineId(exampleVirtualMachine.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Images can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/image:Image example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/microsoft.compute/images/image1
 * ```
 * 
 */
@ResourceType(type="azure:compute/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    /**
     * One or more `data_disk` elements as defined below.
     * 
     */
    @Export(name="dataDisks", type=List.class, parameters={ImageDataDisk.class})
    private Output</* @Nullable */ List<ImageDataDisk>> dataDisks;

    /**
     * @return One or more `data_disk` elements as defined below.
     * 
     */
    public Output<Optional<List<ImageDataDisk>>> dataDisks() {
        return Codegen.optional(this.dataDisks);
    }
    /**
     * The HyperVGenerationType of the VirtualMachine created from the image as `V1`, `V2`. The default is `V1`.
     * 
     */
    @Export(name="hyperVGeneration", type=String.class, parameters={})
    private Output</* @Nullable */ String> hyperVGeneration;

    /**
     * @return The HyperVGenerationType of the VirtualMachine created from the image as `V1`, `V2`. The default is `V1`.
     * 
     */
    public Output<Optional<String>> hyperVGeneration() {
        return Codegen.optional(this.hyperVGeneration);
    }
    /**
     * Specified the supported Azure location where the resource exists.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specified the supported Azure location where the resource exists.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the image. Changing this forces a
     * new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the image. Changing this forces a
     * new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `os_disk` elements as defined below.
     * 
     */
    @Export(name="osDisk", type=ImageOsDisk.class, parameters={})
    private Output</* @Nullable */ ImageOsDisk> osDisk;

    /**
     * @return One or more `os_disk` elements as defined below.
     * 
     */
    public Output<Optional<ImageOsDisk>> osDisk() {
        return Codegen.optional(this.osDisk);
    }
    /**
     * The name of the resource group in which to create
     * the image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create
     * the image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Virtual Machine ID from which to create the image.
     * 
     */
    @Export(name="sourceVirtualMachineId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceVirtualMachineId;

    /**
     * @return The Virtual Machine ID from which to create the image.
     * 
     */
    public Output<Optional<String>> sourceVirtualMachineId() {
        return Codegen.optional(this.sourceVirtualMachineId);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Is zone resiliency enabled?  Defaults to `false`.  Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneResilient", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneResilient;

    /**
     * @return Is zone resiliency enabled?  Defaults to `false`.  Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> zoneResilient() {
        return Codegen.optional(this.zoneResilient);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}