// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery
{
    /// <summary>
    /// Manages a Site Recovery Replication Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primaryResourceGroup = new Azure.Core.ResourceGroup("primaryResourceGroup", new()
    ///     {
    ///         Location = "West US",
    ///     });
    /// 
    ///     var secondaryResourceGroup = new Azure.Core.ResourceGroup("secondaryResourceGroup", new()
    ///     {
    ///         Location = "East US",
    ///     });
    /// 
    ///     var primaryVirtualNetwork = new Azure.Network.VirtualNetwork("primaryVirtualNetwork", new()
    ///     {
    ///         ResourceGroupName = primaryResourceGroup.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "192.168.1.0/24",
    ///         },
    ///         Location = primaryResourceGroup.Location,
    ///     });
    /// 
    ///     var primarySubnet = new Azure.Network.Subnet("primarySubnet", new()
    ///     {
    ///         ResourceGroupName = primaryResourceGroup.Name,
    ///         VirtualNetworkName = primaryVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "192.168.1.0/24",
    ///         },
    ///     });
    /// 
    ///     var primaryPublicIp = new Azure.Network.PublicIp("primaryPublicIp", new()
    ///     {
    ///         AllocationMethod = "Static",
    ///         Location = primaryResourceGroup.Location,
    ///         ResourceGroupName = primaryResourceGroup.Name,
    ///         Sku = "Basic",
    ///     });
    /// 
    ///     var vmNetworkInterface = new Azure.Network.NetworkInterface("vmNetworkInterface", new()
    ///     {
    ///         Location = primaryResourceGroup.Location,
    ///         ResourceGroupName = primaryResourceGroup.Name,
    ///         IpConfigurations = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkInterfaceIpConfigurationArgs
    ///             {
    ///                 Name = "vm",
    ///                 SubnetId = primarySubnet.Id,
    ///                 PrivateIpAddressAllocation = "Dynamic",
    ///                 PublicIpAddressId = primaryPublicIp.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var vmVirtualMachine = new Azure.Compute.VirtualMachine("vmVirtualMachine", new()
    ///     {
    ///         Location = primaryResourceGroup.Location,
    ///         ResourceGroupName = primaryResourceGroup.Name,
    ///         VmSize = "Standard_B1s",
    ///         NetworkInterfaceIds = new[]
    ///         {
    ///             vmNetworkInterface.Id,
    ///         },
    ///         StorageImageReference = new Azure.Compute.Inputs.VirtualMachineStorageImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///         StorageOsDisk = new Azure.Compute.Inputs.VirtualMachineStorageOsDiskArgs
    ///         {
    ///             Name = "vm-os-disk",
    ///             OsType = "Linux",
    ///             Caching = "ReadWrite",
    ///             CreateOption = "FromImage",
    ///             ManagedDiskType = "Premium_LRS",
    ///         },
    ///         OsProfile = new Azure.Compute.Inputs.VirtualMachineOsProfileArgs
    ///         {
    ///             AdminUsername = "test-admin-123",
    ///             AdminPassword = "test-pwd-123",
    ///             ComputerName = "vm",
    ///         },
    ///         OsProfileLinuxConfig = new Azure.Compute.Inputs.VirtualMachineOsProfileLinuxConfigArgs
    ///         {
    ///             DisablePasswordAuthentication = false,
    ///         },
    ///     });
    /// 
    ///     var vault = new Azure.RecoveryServices.Vault("vault", new()
    ///     {
    ///         Location = secondaryResourceGroup.Location,
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         Sku = "Standard",
    ///     });
    /// 
    ///     var primaryFabric = new Azure.SiteRecovery.Fabric("primaryFabric", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         Location = primaryResourceGroup.Location,
    ///     });
    /// 
    ///     var secondaryFabric = new Azure.SiteRecovery.Fabric("secondaryFabric", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         Location = secondaryResourceGroup.Location,
    ///     });
    /// 
    ///     var primaryProtectionContainer = new Azure.SiteRecovery.ProtectionContainer("primaryProtectionContainer", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         RecoveryFabricName = primaryFabric.Name,
    ///     });
    /// 
    ///     var secondaryProtectionContainer = new Azure.SiteRecovery.ProtectionContainer("secondaryProtectionContainer", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         RecoveryFabricName = secondaryFabric.Name,
    ///     });
    /// 
    ///     var policy = new Azure.SiteRecovery.ReplicationPolicy("policy", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         RecoveryPointRetentionInMinutes = 24 * 60,
    ///         ApplicationConsistentSnapshotFrequencyInMinutes = 4 * 60,
    ///     });
    /// 
    ///     var container_mapping = new Azure.SiteRecovery.ProtectionContainerMapping("container-mapping", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         RecoveryFabricName = primaryFabric.Name,
    ///         RecoverySourceProtectionContainerName = primaryProtectionContainer.Name,
    ///         RecoveryTargetProtectionContainerId = secondaryProtectionContainer.Id,
    ///         RecoveryReplicationPolicyId = policy.Id,
    ///     });
    /// 
    ///     var secondaryVirtualNetwork = new Azure.Network.VirtualNetwork("secondaryVirtualNetwork", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "192.168.2.0/24",
    ///         },
    ///         Location = secondaryResourceGroup.Location,
    ///     });
    /// 
    ///     var network_mapping = new Azure.SiteRecovery.NetworkMapping("network-mapping", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         SourceRecoveryFabricName = primaryFabric.Name,
    ///         TargetRecoveryFabricName = secondaryFabric.Name,
    ///         SourceNetworkId = primaryVirtualNetwork.Id,
    ///         TargetNetworkId = secondaryVirtualNetwork.Id,
    ///     });
    /// 
    ///     var primaryAccount = new Azure.Storage.Account("primaryAccount", new()
    ///     {
    ///         Location = primaryResourceGroup.Location,
    ///         ResourceGroupName = primaryResourceGroup.Name,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var secondarySubnet = new Azure.Network.Subnet("secondarySubnet", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         VirtualNetworkName = secondaryVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "192.168.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var secondaryPublicIp = new Azure.Network.PublicIp("secondaryPublicIp", new()
    ///     {
    ///         AllocationMethod = "Static",
    ///         Location = secondaryResourceGroup.Location,
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         Sku = "Basic",
    ///     });
    /// 
    ///     var vm_replication = new Azure.SiteRecovery.ReplicatedVM("vm-replication", new()
    ///     {
    ///         ResourceGroupName = secondaryResourceGroup.Name,
    ///         RecoveryVaultName = vault.Name,
    ///         SourceRecoveryFabricName = primaryFabric.Name,
    ///         SourceVmId = vmVirtualMachine.Id,
    ///         RecoveryReplicationPolicyId = policy.Id,
    ///         SourceRecoveryProtectionContainerName = primaryProtectionContainer.Name,
    ///         TargetResourceGroupId = secondaryResourceGroup.Id,
    ///         TargetRecoveryFabricId = secondaryFabric.Id,
    ///         TargetRecoveryProtectionContainerId = secondaryProtectionContainer.Id,
    ///         ManagedDisks = new[]
    ///         {
    ///             new Azure.SiteRecovery.Inputs.ReplicatedVMManagedDiskArgs
    ///             {
    ///                 DiskId = vmVirtualMachine.StorageOsDisk.Apply(storageOsDisk =&gt; storageOsDisk.ManagedDiskId),
    ///                 StagingStorageAccountId = primaryAccount.Id,
    ///                 TargetResourceGroupId = secondaryResourceGroup.Id,
    ///                 TargetDiskType = "Premium_LRS",
    ///                 TargetReplicaDiskType = "Premium_LRS",
    ///             },
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Azure.SiteRecovery.Inputs.ReplicatedVMNetworkInterfaceArgs
    ///             {
    ///                 SourceNetworkInterfaceId = vmNetworkInterface.Id,
    ///                 TargetSubnetName = secondarySubnet.Name,
    ///                 RecoveryPublicIpAddressId = secondaryPublicIp.Id,
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             container_mapping,
    ///             network_mapping,
    ///         },
    ///     });
    /// 
    ///     var example = new Azure.SiteRecovery.ReplicationRecoveryPlan("example", new()
    ///     {
    ///         RecoveryVaultId = vault.Id,
    ///         SourceRecoveryFabricId = primaryFabric.Id,
    ///         TargetRecoveryFabricId = secondaryFabric.Id,
    ///         ShutdownRecoveryGroup = null,
    ///         FailoverRecoveryGroup = null,
    ///         BootRecoveryGroups = new[]
    ///         {
    ///             new Azure.SiteRecovery.Inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs
    ///             {
    ///                 ReplicatedProtectedItems = new[]
    ///                 {
    ///                     vm_replication.Id,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Site Recovery Fabric can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan azurerm_site_recovery_replication_recovery_plan.example /subscriptions/00000000-0000-0000-0000-00000000000/resourceGroups/groupName/providers/Microsoft.RecoveryServices/vaults/vaultName/replicationRecoveryPlans/planName
    /// ```
    /// </summary>
    [AzureResourceType("azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan")]
    public partial class ReplicationRecoveryPlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An `azure_to_azure_settings` block defined as block.
        /// </summary>
        [Output("azureToAzureSettings")]
        public Output<Outputs.ReplicationRecoveryPlanAzureToAzureSettings?> AzureToAzureSettings { get; private set; } = null!;

        /// <summary>
        /// One or more `boot_recovery_group` blocks as defined below.
        /// 
        /// &gt; **NOTE:** At least one `boot_recovery_group` block will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Output("bootRecoveryGroups")]
        public Output<ImmutableArray<Outputs.ReplicationRecoveryPlanBootRecoveryGroup>> BootRecoveryGroups { get; private set; } = null!;

        /// <summary>
        /// One `failover_recovery_group` block as defined below.
        /// 
        /// &gt; **NOTE:** `failover_recovery_group` will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Output("failoverRecoveryGroup")]
        public Output<Outputs.ReplicationRecoveryPlanFailoverRecoveryGroup> FailoverRecoveryGroup { get; private set; } = null!;

        /// <summary>
        /// The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Three or more `recovery_group` block defined as below.
        /// 
        /// **Note:** The `recovery_group` block is deprecated in favor of `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group`. It will be removed in v4.0 of the Azure Provider.
        /// </summary>
        [Output("recoveryGroups")]
        public Output<ImmutableArray<Outputs.ReplicationRecoveryPlanRecoveryGroup>> RecoveryGroups { get; private set; } = null!;

        /// <summary>
        /// The ID of the vault that should be updated. Changing this forces a new resource to be created.
        /// </summary>
        [Output("recoveryVaultId")]
        public Output<string> RecoveryVaultId { get; private set; } = null!;

        /// <summary>
        /// One `shutdown_recovery_group` block as defined below.
        /// 
        /// &gt; **NOTE:** `shutdown_recovery_group` will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Output("shutdownRecoveryGroup")]
        public Output<Outputs.ReplicationRecoveryPlanShutdownRecoveryGroup> ShutdownRecoveryGroup { get; private set; } = null!;

        /// <summary>
        /// ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
        /// </summary>
        [Output("sourceRecoveryFabricId")]
        public Output<string> SourceRecoveryFabricId { get; private set; } = null!;

        /// <summary>
        /// ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
        /// </summary>
        [Output("targetRecoveryFabricId")]
        public Output<string> TargetRecoveryFabricId { get; private set; } = null!;


        /// <summary>
        /// Create a ReplicationRecoveryPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReplicationRecoveryPlan(string name, ReplicationRecoveryPlanArgs args, CustomResourceOptions? options = null)
            : base("azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan", name, args ?? new ReplicationRecoveryPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReplicationRecoveryPlan(string name, Input<string> id, ReplicationRecoveryPlanState? state = null, CustomResourceOptions? options = null)
            : base("azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ReplicationRecoveryPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReplicationRecoveryPlan Get(string name, Input<string> id, ReplicationRecoveryPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new ReplicationRecoveryPlan(name, id, state, options);
        }
    }

    public sealed class ReplicationRecoveryPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `azure_to_azure_settings` block defined as block.
        /// </summary>
        [Input("azureToAzureSettings")]
        public Input<Inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs>? AzureToAzureSettings { get; set; }

        [Input("bootRecoveryGroups")]
        private InputList<Inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs>? _bootRecoveryGroups;

        /// <summary>
        /// One or more `boot_recovery_group` blocks as defined below.
        /// 
        /// &gt; **NOTE:** At least one `boot_recovery_group` block will be required in the next major version of the AzureRM Provider.
        /// </summary>
        public InputList<Inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs> BootRecoveryGroups
        {
            get => _bootRecoveryGroups ?? (_bootRecoveryGroups = new InputList<Inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs>());
            set => _bootRecoveryGroups = value;
        }

        /// <summary>
        /// One `failover_recovery_group` block as defined below.
        /// 
        /// &gt; **NOTE:** `failover_recovery_group` will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Input("failoverRecoveryGroup")]
        public Input<Inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs>? FailoverRecoveryGroup { get; set; }

        /// <summary>
        /// The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("recoveryGroups")]
        private InputList<Inputs.ReplicationRecoveryPlanRecoveryGroupArgs>? _recoveryGroups;

        /// <summary>
        /// Three or more `recovery_group` block defined as below.
        /// 
        /// **Note:** The `recovery_group` block is deprecated in favor of `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group`. It will be removed in v4.0 of the Azure Provider.
        /// </summary>
        [Obsolete(@"the `recovery_group` block has been deprecated in favour of the `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group` and will be removed in version 4.0 of the provider.")]
        public InputList<Inputs.ReplicationRecoveryPlanRecoveryGroupArgs> RecoveryGroups
        {
            get => _recoveryGroups ?? (_recoveryGroups = new InputList<Inputs.ReplicationRecoveryPlanRecoveryGroupArgs>());
            set => _recoveryGroups = value;
        }

        /// <summary>
        /// The ID of the vault that should be updated. Changing this forces a new resource to be created.
        /// </summary>
        [Input("recoveryVaultId", required: true)]
        public Input<string> RecoveryVaultId { get; set; } = null!;

        /// <summary>
        /// One `shutdown_recovery_group` block as defined below.
        /// 
        /// &gt; **NOTE:** `shutdown_recovery_group` will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Input("shutdownRecoveryGroup")]
        public Input<Inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs>? ShutdownRecoveryGroup { get; set; }

        /// <summary>
        /// ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
        /// </summary>
        [Input("sourceRecoveryFabricId", required: true)]
        public Input<string> SourceRecoveryFabricId { get; set; } = null!;

        /// <summary>
        /// ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
        /// </summary>
        [Input("targetRecoveryFabricId", required: true)]
        public Input<string> TargetRecoveryFabricId { get; set; } = null!;

        public ReplicationRecoveryPlanArgs()
        {
        }
        public static new ReplicationRecoveryPlanArgs Empty => new ReplicationRecoveryPlanArgs();
    }

    public sealed class ReplicationRecoveryPlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `azure_to_azure_settings` block defined as block.
        /// </summary>
        [Input("azureToAzureSettings")]
        public Input<Inputs.ReplicationRecoveryPlanAzureToAzureSettingsGetArgs>? AzureToAzureSettings { get; set; }

        [Input("bootRecoveryGroups")]
        private InputList<Inputs.ReplicationRecoveryPlanBootRecoveryGroupGetArgs>? _bootRecoveryGroups;

        /// <summary>
        /// One or more `boot_recovery_group` blocks as defined below.
        /// 
        /// &gt; **NOTE:** At least one `boot_recovery_group` block will be required in the next major version of the AzureRM Provider.
        /// </summary>
        public InputList<Inputs.ReplicationRecoveryPlanBootRecoveryGroupGetArgs> BootRecoveryGroups
        {
            get => _bootRecoveryGroups ?? (_bootRecoveryGroups = new InputList<Inputs.ReplicationRecoveryPlanBootRecoveryGroupGetArgs>());
            set => _bootRecoveryGroups = value;
        }

        /// <summary>
        /// One `failover_recovery_group` block as defined below.
        /// 
        /// &gt; **NOTE:** `failover_recovery_group` will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Input("failoverRecoveryGroup")]
        public Input<Inputs.ReplicationRecoveryPlanFailoverRecoveryGroupGetArgs>? FailoverRecoveryGroup { get; set; }

        /// <summary>
        /// The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("recoveryGroups")]
        private InputList<Inputs.ReplicationRecoveryPlanRecoveryGroupGetArgs>? _recoveryGroups;

        /// <summary>
        /// Three or more `recovery_group` block defined as below.
        /// 
        /// **Note:** The `recovery_group` block is deprecated in favor of `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group`. It will be removed in v4.0 of the Azure Provider.
        /// </summary>
        [Obsolete(@"the `recovery_group` block has been deprecated in favour of the `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group` and will be removed in version 4.0 of the provider.")]
        public InputList<Inputs.ReplicationRecoveryPlanRecoveryGroupGetArgs> RecoveryGroups
        {
            get => _recoveryGroups ?? (_recoveryGroups = new InputList<Inputs.ReplicationRecoveryPlanRecoveryGroupGetArgs>());
            set => _recoveryGroups = value;
        }

        /// <summary>
        /// The ID of the vault that should be updated. Changing this forces a new resource to be created.
        /// </summary>
        [Input("recoveryVaultId")]
        public Input<string>? RecoveryVaultId { get; set; }

        /// <summary>
        /// One `shutdown_recovery_group` block as defined below.
        /// 
        /// &gt; **NOTE:** `shutdown_recovery_group` will be required in the next major version of the AzureRM Provider.
        /// </summary>
        [Input("shutdownRecoveryGroup")]
        public Input<Inputs.ReplicationRecoveryPlanShutdownRecoveryGroupGetArgs>? ShutdownRecoveryGroup { get; set; }

        /// <summary>
        /// ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
        /// </summary>
        [Input("sourceRecoveryFabricId")]
        public Input<string>? SourceRecoveryFabricId { get; set; }

        /// <summary>
        /// ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
        /// </summary>
        [Input("targetRecoveryFabricId")]
        public Input<string>? TargetRecoveryFabricId { get; set; }

        public ReplicationRecoveryPlanState()
        {
        }
        public static new ReplicationRecoveryPlanState Empty => new ReplicationRecoveryPlanState();
    }
}
