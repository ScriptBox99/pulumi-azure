// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.VirtualNetworkSwiftConnectionArgs;
import com.pulumi.azure.appservice.inputs.VirtualNetworkSwiftConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an App Service Virtual Network Association (this is for the [Regional VNet Integration](https://docs.microsoft.com/azure/app-service/web-sites-integrate-with-vnet#regional-vnet-integration)).
 * 
 * &gt; **Note:** This resource can be used for both `azure.appservice.AppService` and `azure.appservice.FunctionApp`.
 * 
 * &gt; **Note:** There is a hard limit of [one VNet integration per App Service Plan](https://docs.microsoft.com/azure/app-service/web-sites-integrate-with-vnet#regional-vnet-integration).
 * Multiple apps in the same App Service plan can use the same VNet.
 * 
 * ## Example Usage
 * ### With App Service)
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
 *                 .name(&#34;example-delegation&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.Web/serverFarms&#34;)
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/subnets/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var examplePlan = new Plan(&#34;examplePlan&#34;, PlanArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(PlanSkuArgs.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .size(&#34;S1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAppService = new AppService(&#34;exampleAppService&#34;, AppServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .appServicePlanId(examplePlan.id())
 *             .build());
 * 
 *         var exampleVirtualNetworkSwiftConnection = new VirtualNetworkSwiftConnection(&#34;exampleVirtualNetworkSwiftConnection&#34;, VirtualNetworkSwiftConnectionArgs.builder()        
 *             .appServiceId(exampleAppService.id())
 *             .subnetId(exampleSubnet.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With Function App)
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
 *                 .name(&#34;example-delegation&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.Web/serverFarms&#34;)
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/subnets/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var examplePlan = new Plan(&#34;examplePlan&#34;, PlanArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(PlanSkuArgs.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .size(&#34;S1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleFunctionApp = new FunctionApp(&#34;exampleFunctionApp&#34;, FunctionAppArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .appServicePlanId(examplePlan.id())
 *             .storageAccountName(exampleAccount.name())
 *             .storageAccountAccessKey(exampleAccount.primaryAccessKey())
 *             .build());
 * 
 *         var exampleVirtualNetworkSwiftConnection = new VirtualNetworkSwiftConnection(&#34;exampleVirtualNetworkSwiftConnection&#34;, VirtualNetworkSwiftConnectionArgs.builder()        
 *             .appServiceId(exampleFunctionApp.id())
 *             .subnetId(exampleSubnet.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Service Virtual Network Associations can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/virtualNetworkSwiftConnection:VirtualNetworkSwiftConnection myassociation /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Web/sites/instance1/config/virtualNetwork
 * ```
 * 
 */
@ResourceType(type="azure:appservice/virtualNetworkSwiftConnection:VirtualNetworkSwiftConnection")
public class VirtualNetworkSwiftConnection extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the App Service or Function App to associate to the VNet. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="appServiceId", type=String.class, parameters={})
    private Output<String> appServiceId;

    /**
     * @return The ID of the App Service or Function App to associate to the VNet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceId() {
        return this.appServiceId;
    }
    /**
     * The ID of the subnet the app service will be associated to (the subnet must have a `service_delegation` configured for `Microsoft.Web/serverFarms`).
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet the app service will be associated to (the subnet must have a `service_delegation` configured for `Microsoft.Web/serverFarms`).
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkSwiftConnection(String name) {
        this(name, VirtualNetworkSwiftConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkSwiftConnection(String name, VirtualNetworkSwiftConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkSwiftConnection(String name, VirtualNetworkSwiftConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/virtualNetworkSwiftConnection:VirtualNetworkSwiftConnection", name, args == null ? VirtualNetworkSwiftConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetworkSwiftConnection(String name, Output<String> id, @Nullable VirtualNetworkSwiftConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/virtualNetworkSwiftConnection:VirtualNetworkSwiftConnection", name, state, makeResourceOptions(options, id));
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
    public static VirtualNetworkSwiftConnection get(String name, Output<String> id, @Nullable VirtualNetworkSwiftConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkSwiftConnection(name, id, state, options);
    }
}