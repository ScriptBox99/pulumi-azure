# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VnpGatewayNatRuleArgs', 'VnpGatewayNatRule']

@pulumi.input_type
class VnpGatewayNatRuleArgs:
    def __init__(__self__, *,
                 external_address_space_mappings: pulumi.Input[Sequence[pulumi.Input[str]]],
                 internal_address_space_mappings: pulumi.Input[Sequence[pulumi.Input[str]]],
                 resource_group_name: pulumi.Input[str],
                 vpn_gateway_id: pulumi.Input[str],
                 ip_configuration_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VnpGatewayNatRule resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_address_space_mappings: A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] internal_address_space_mappings: A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[str] resource_group_name: The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] ip_configuration_id: The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        :param pulumi.Input[str] mode: The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] type: The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "external_address_space_mappings", external_address_space_mappings)
        pulumi.set(__self__, "internal_address_space_mappings", internal_address_space_mappings)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)
        if ip_configuration_id is not None:
            pulumi.set(__self__, "ip_configuration_id", ip_configuration_id)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="externalAddressSpaceMappings")
    def external_address_space_mappings(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        """
        return pulumi.get(self, "external_address_space_mappings")

    @external_address_space_mappings.setter
    def external_address_space_mappings(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "external_address_space_mappings", value)

    @property
    @pulumi.getter(name="internalAddressSpaceMappings")
    def internal_address_space_mappings(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        """
        return pulumi.get(self, "internal_address_space_mappings")

    @internal_address_space_mappings.setter
    def internal_address_space_mappings(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "internal_address_space_mappings", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_gateway_id", value)

    @property
    @pulumi.getter(name="ipConfigurationId")
    def ip_configuration_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        """
        return pulumi.get(self, "ip_configuration_id")

    @ip_configuration_id.setter
    def ip_configuration_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_configuration_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _VnpGatewayNatRuleState:
    def __init__(__self__, *,
                 external_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 internal_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip_configuration_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VnpGatewayNatRule resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_address_space_mappings: A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] internal_address_space_mappings: A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[str] ip_configuration_id: The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        :param pulumi.Input[str] mode: The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] type: The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        """
        if external_address_space_mappings is not None:
            pulumi.set(__self__, "external_address_space_mappings", external_address_space_mappings)
        if internal_address_space_mappings is not None:
            pulumi.set(__self__, "internal_address_space_mappings", internal_address_space_mappings)
        if ip_configuration_id is not None:
            pulumi.set(__self__, "ip_configuration_id", ip_configuration_id)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vpn_gateway_id is not None:
            pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter(name="externalAddressSpaceMappings")
    def external_address_space_mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        """
        return pulumi.get(self, "external_address_space_mappings")

    @external_address_space_mappings.setter
    def external_address_space_mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "external_address_space_mappings", value)

    @property
    @pulumi.getter(name="internalAddressSpaceMappings")
    def internal_address_space_mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        """
        return pulumi.get(self, "internal_address_space_mappings")

    @internal_address_space_mappings.setter
    def internal_address_space_mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "internal_address_space_mappings", value)

    @property
    @pulumi.getter(name="ipConfigurationId")
    def ip_configuration_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        """
        return pulumi.get(self, "ip_configuration_id")

    @ip_configuration_id.setter
    def ip_configuration_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_configuration_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_gateway_id", value)


class VnpGatewayNatRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 external_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 internal_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip_configuration_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a VPN Gateway Nat Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_virtual_wan = azure.network.VirtualWan("exampleVirtualWan",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_virtual_hub = azure.network.VirtualHub("exampleVirtualHub",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            address_prefix="10.0.1.0/24",
            virtual_wan_id=example_virtual_wan.id)
        example_vpn_gateway = azure.network.VpnGateway("exampleVpnGateway",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            virtual_hub_id=example_virtual_hub.id)
        example_vnp_gateway_nat_rule = azure.network.VnpGatewayNatRule("exampleVnpGatewayNatRule",
            resource_group_name=example_resource_group.name,
            vpn_gateway_id=example_vpn_gateway.id,
            external_address_space_mappings=["192.168.21.0/26"],
            internal_address_space_mappings=["10.4.0.0/26"])
        ```

        ## Import

        VPN Gateway Nat Rules can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:network/vnpGatewayNatRule:VnpGatewayNatRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/vpnGateways/vpnGateway1/natRules/natRule1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_address_space_mappings: A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] internal_address_space_mappings: A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[str] ip_configuration_id: The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        :param pulumi.Input[str] mode: The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] type: The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VnpGatewayNatRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a VPN Gateway Nat Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_virtual_wan = azure.network.VirtualWan("exampleVirtualWan",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_virtual_hub = azure.network.VirtualHub("exampleVirtualHub",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            address_prefix="10.0.1.0/24",
            virtual_wan_id=example_virtual_wan.id)
        example_vpn_gateway = azure.network.VpnGateway("exampleVpnGateway",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            virtual_hub_id=example_virtual_hub.id)
        example_vnp_gateway_nat_rule = azure.network.VnpGatewayNatRule("exampleVnpGatewayNatRule",
            resource_group_name=example_resource_group.name,
            vpn_gateway_id=example_vpn_gateway.id,
            external_address_space_mappings=["192.168.21.0/26"],
            internal_address_space_mappings=["10.4.0.0/26"])
        ```

        ## Import

        VPN Gateway Nat Rules can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:network/vnpGatewayNatRule:VnpGatewayNatRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/vpnGateways/vpnGateway1/natRules/natRule1
        ```

        :param str resource_name: The name of the resource.
        :param VnpGatewayNatRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VnpGatewayNatRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 external_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 internal_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip_configuration_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VnpGatewayNatRuleArgs.__new__(VnpGatewayNatRuleArgs)

            if external_address_space_mappings is None and not opts.urn:
                raise TypeError("Missing required property 'external_address_space_mappings'")
            __props__.__dict__["external_address_space_mappings"] = external_address_space_mappings
            if internal_address_space_mappings is None and not opts.urn:
                raise TypeError("Missing required property 'internal_address_space_mappings'")
            __props__.__dict__["internal_address_space_mappings"] = internal_address_space_mappings
            __props__.__dict__["ip_configuration_id"] = ip_configuration_id
            __props__.__dict__["mode"] = mode
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["type"] = type
            if vpn_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_gateway_id'")
            __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        super(VnpGatewayNatRule, __self__).__init__(
            'azure:network/vnpGatewayNatRule:VnpGatewayNatRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            external_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            internal_address_space_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ip_configuration_id: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            vpn_gateway_id: Optional[pulumi.Input[str]] = None) -> 'VnpGatewayNatRule':
        """
        Get an existing VnpGatewayNatRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_address_space_mappings: A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] internal_address_space_mappings: A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        :param pulumi.Input[str] ip_configuration_id: The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        :param pulumi.Input[str] mode: The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] type: The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VnpGatewayNatRuleState.__new__(_VnpGatewayNatRuleState)

        __props__.__dict__["external_address_space_mappings"] = external_address_space_mappings
        __props__.__dict__["internal_address_space_mappings"] = internal_address_space_mappings
        __props__.__dict__["ip_configuration_id"] = ip_configuration_id
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["type"] = type
        __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        return VnpGatewayNatRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="externalAddressSpaceMappings")
    def external_address_space_mappings(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of CIDR Ranges which are used for external mapping of the VPN Gateway Nat Rule.
        """
        return pulumi.get(self, "external_address_space_mappings")

    @property
    @pulumi.getter(name="internalAddressSpaceMappings")
    def internal_address_space_mappings(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of CIDR Ranges which are used for internal mapping of the VPN Gateway Nat Rule.
        """
        return pulumi.get(self, "internal_address_space_mappings")

    @property
    @pulumi.getter(name="ipConfigurationId")
    def ip_configuration_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the IP Configuration this VPN Gateway Nat Rule applies to. Possible values are `Instance0` and `Instance1`.
        """
        return pulumi.get(self, "ip_configuration_id")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[Optional[str]]:
        """
        The source Nat direction of the VPN Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this VPN Gateway Nat Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The Name of the Resource Group in which this VPN Gateway Nat Rule should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of the VPN Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPN Gateway that this VPN Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vpn_gateway_id")
