# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HyperVReplicationPolicyAssociationArgs', 'HyperVReplicationPolicyAssociation']

@pulumi.input_type
class HyperVReplicationPolicyAssociationArgs:
    def __init__(__self__, *,
                 hyperv_site_id: pulumi.Input[str],
                 policy_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HyperVReplicationPolicyAssociation resource.
        :param pulumi.Input[str] hyperv_site_id: The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        :param pulumi.Input[str] policy_id: The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        :param pulumi.Input[str] name: The name of the replication policy association. Changing this forces a new association to be created.
        """
        pulumi.set(__self__, "hyperv_site_id", hyperv_site_id)
        pulumi.set(__self__, "policy_id", policy_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="hypervSiteId")
    def hyperv_site_id(self) -> pulumi.Input[str]:
        """
        The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "hyperv_site_id")

    @hyperv_site_id.setter
    def hyperv_site_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "hyperv_site_id", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the replication policy association. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _HyperVReplicationPolicyAssociationState:
    def __init__(__self__, *,
                 hyperv_site_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HyperVReplicationPolicyAssociation resources.
        :param pulumi.Input[str] hyperv_site_id: The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        :param pulumi.Input[str] name: The name of the replication policy association. Changing this forces a new association to be created.
        :param pulumi.Input[str] policy_id: The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        """
        if hyperv_site_id is not None:
            pulumi.set(__self__, "hyperv_site_id", hyperv_site_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)

    @property
    @pulumi.getter(name="hypervSiteId")
    def hyperv_site_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "hyperv_site_id")

    @hyperv_site_id.setter
    def hyperv_site_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hyperv_site_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the replication policy association. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)


class HyperVReplicationPolicyAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hyperv_site_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Azure Site Recovery replication policy for HyperV within a Recovery Vault.

        ## Import

        Site Recovery Replication Policies can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation azurerm_site_recovery_hyperv_replication_policy_association.mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hyperv_site_id: The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        :param pulumi.Input[str] name: The name of the replication policy association. Changing this forces a new association to be created.
        :param pulumi.Input[str] policy_id: The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HyperVReplicationPolicyAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure Site Recovery replication policy for HyperV within a Recovery Vault.

        ## Import

        Site Recovery Replication Policies can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation azurerm_site_recovery_hyperv_replication_policy_association.mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
        ```

        :param str resource_name: The name of the resource.
        :param HyperVReplicationPolicyAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HyperVReplicationPolicyAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hyperv_site_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HyperVReplicationPolicyAssociationArgs.__new__(HyperVReplicationPolicyAssociationArgs)

            if hyperv_site_id is None and not opts.urn:
                raise TypeError("Missing required property 'hyperv_site_id'")
            __props__.__dict__["hyperv_site_id"] = hyperv_site_id
            __props__.__dict__["name"] = name
            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
        super(HyperVReplicationPolicyAssociation, __self__).__init__(
            'azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            hyperv_site_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[str]] = None) -> 'HyperVReplicationPolicyAssociation':
        """
        Get an existing HyperVReplicationPolicyAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hyperv_site_id: The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        :param pulumi.Input[str] name: The name of the replication policy association. Changing this forces a new association to be created.
        :param pulumi.Input[str] policy_id: The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HyperVReplicationPolicyAssociationState.__new__(_HyperVReplicationPolicyAssociationState)

        __props__.__dict__["hyperv_site_id"] = hyperv_site_id
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_id"] = policy_id
        return HyperVReplicationPolicyAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="hypervSiteId")
    def hyperv_site_id(self) -> pulumi.Output[str]:
        """
        The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "hyperv_site_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the replication policy association. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[str]:
        """
        The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "policy_id")
