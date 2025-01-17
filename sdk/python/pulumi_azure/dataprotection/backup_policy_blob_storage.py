# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BackupPolicyBlobStorageArgs', 'BackupPolicyBlobStorage']

@pulumi.input_type
class BackupPolicyBlobStorageArgs:
    def __init__(__self__, *,
                 retention_duration: pulumi.Input[str],
                 vault_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BackupPolicyBlobStorage resource.
        :param pulumi.Input[str] retention_duration: Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] vault_id: The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] name: The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        pulumi.set(__self__, "retention_duration", retention_duration)
        pulumi.set(__self__, "vault_id", vault_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="retentionDuration")
    def retention_duration(self) -> pulumi.Input[str]:
        """
        Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "retention_duration")

    @retention_duration.setter
    def retention_duration(self, value: pulumi.Input[str]):
        pulumi.set(self, "retention_duration", value)

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Input[str]:
        """
        The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vault_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _BackupPolicyBlobStorageState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 retention_duration: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BackupPolicyBlobStorage resources.
        :param pulumi.Input[str] name: The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] retention_duration: Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] vault_id: The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if retention_duration is not None:
            pulumi.set(__self__, "retention_duration", retention_duration)
        if vault_id is not None:
            pulumi.set(__self__, "vault_id", vault_id)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="retentionDuration")
    def retention_duration(self) -> Optional[pulumi.Input[str]]:
        """
        Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "retention_duration")

    @retention_duration.setter
    def retention_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "retention_duration", value)

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vault_id", value)


class BackupPolicyBlobStorage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 retention_duration: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Backup Policy Blob Storage.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_backup_vault = azure.dataprotection.BackupVault("exampleBackupVault",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            datastore_type="VaultStore",
            redundancy="LocallyRedundant")
        example_backup_policy_blob_storage = azure.dataprotection.BackupPolicyBlobStorage("exampleBackupPolicyBlobStorage",
            vault_id=example_backup_vault.id,
            retention_duration="P30D")
        ```

        ## Import

        Backup Policy Blob Storages can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:dataprotection/backupPolicyBlobStorage:BackupPolicyBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupPolicies/backupPolicy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] retention_duration: Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] vault_id: The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyBlobStorageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Backup Policy Blob Storage.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_backup_vault = azure.dataprotection.BackupVault("exampleBackupVault",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            datastore_type="VaultStore",
            redundancy="LocallyRedundant")
        example_backup_policy_blob_storage = azure.dataprotection.BackupPolicyBlobStorage("exampleBackupPolicyBlobStorage",
            vault_id=example_backup_vault.id,
            retention_duration="P30D")
        ```

        ## Import

        Backup Policy Blob Storages can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:dataprotection/backupPolicyBlobStorage:BackupPolicyBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupPolicies/backupPolicy1
        ```

        :param str resource_name: The name of the resource.
        :param BackupPolicyBlobStorageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupPolicyBlobStorageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 retention_duration: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPolicyBlobStorageArgs.__new__(BackupPolicyBlobStorageArgs)

            __props__.__dict__["name"] = name
            if retention_duration is None and not opts.urn:
                raise TypeError("Missing required property 'retention_duration'")
            __props__.__dict__["retention_duration"] = retention_duration
            if vault_id is None and not opts.urn:
                raise TypeError("Missing required property 'vault_id'")
            __props__.__dict__["vault_id"] = vault_id
        super(BackupPolicyBlobStorage, __self__).__init__(
            'azure:dataprotection/backupPolicyBlobStorage:BackupPolicyBlobStorage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            retention_duration: Optional[pulumi.Input[str]] = None,
            vault_id: Optional[pulumi.Input[str]] = None) -> 'BackupPolicyBlobStorage':
        """
        Get an existing BackupPolicyBlobStorage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] retention_duration: Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        :param pulumi.Input[str] vault_id: The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPolicyBlobStorageState.__new__(_BackupPolicyBlobStorageState)

        __props__.__dict__["name"] = name
        __props__.__dict__["retention_duration"] = retention_duration
        __props__.__dict__["vault_id"] = vault_id
        return BackupPolicyBlobStorage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="retentionDuration")
    def retention_duration(self) -> pulumi.Output[str]:
        """
        Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "retention_duration")

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Output[str]:
        """
        The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
        """
        return pulumi.get(self, "vault_id")

