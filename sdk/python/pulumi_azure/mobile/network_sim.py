# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkSimArgs', 'NetworkSim']

@pulumi.input_type
class NetworkSimArgs:
    def __init__(__self__, *,
                 authentication_key: pulumi.Input[str],
                 integrated_circuit_card_identifier: pulumi.Input[str],
                 international_mobile_subscriber_identity: pulumi.Input[str],
                 mobile_network_sim_group_id: pulumi.Input[str],
                 operator_key_code: pulumi.Input[str],
                 device_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sim_policy_id: Optional[pulumi.Input[str]] = None,
                 static_ip_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]]] = None):
        """
        The set of arguments for constructing a NetworkSim resource.
        :param pulumi.Input[str] authentication_key: The Ki value for the SIM.
        :param pulumi.Input[str] integrated_circuit_card_identifier: The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] international_mobile_subscriber_identity: The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] mobile_network_sim_group_id: The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] operator_key_code: The Opc value for the SIM.
        :param pulumi.Input[str] device_type: An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        :param pulumi.Input[str] name: The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] sim_policy_id: The ID of SIM policy used by this SIM.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]] static_ip_configurations: A `static_ip_configuration` block as defined below.
        """
        pulumi.set(__self__, "authentication_key", authentication_key)
        pulumi.set(__self__, "integrated_circuit_card_identifier", integrated_circuit_card_identifier)
        pulumi.set(__self__, "international_mobile_subscriber_identity", international_mobile_subscriber_identity)
        pulumi.set(__self__, "mobile_network_sim_group_id", mobile_network_sim_group_id)
        pulumi.set(__self__, "operator_key_code", operator_key_code)
        if device_type is not None:
            pulumi.set(__self__, "device_type", device_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sim_policy_id is not None:
            pulumi.set(__self__, "sim_policy_id", sim_policy_id)
        if static_ip_configurations is not None:
            pulumi.set(__self__, "static_ip_configurations", static_ip_configurations)

    @property
    @pulumi.getter(name="authenticationKey")
    def authentication_key(self) -> pulumi.Input[str]:
        """
        The Ki value for the SIM.
        """
        return pulumi.get(self, "authentication_key")

    @authentication_key.setter
    def authentication_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "authentication_key", value)

    @property
    @pulumi.getter(name="integratedCircuitCardIdentifier")
    def integrated_circuit_card_identifier(self) -> pulumi.Input[str]:
        """
        The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "integrated_circuit_card_identifier")

    @integrated_circuit_card_identifier.setter
    def integrated_circuit_card_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "integrated_circuit_card_identifier", value)

    @property
    @pulumi.getter(name="internationalMobileSubscriberIdentity")
    def international_mobile_subscriber_identity(self) -> pulumi.Input[str]:
        """
        The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "international_mobile_subscriber_identity")

    @international_mobile_subscriber_identity.setter
    def international_mobile_subscriber_identity(self, value: pulumi.Input[str]):
        pulumi.set(self, "international_mobile_subscriber_identity", value)

    @property
    @pulumi.getter(name="mobileNetworkSimGroupId")
    def mobile_network_sim_group_id(self) -> pulumi.Input[str]:
        """
        The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "mobile_network_sim_group_id")

    @mobile_network_sim_group_id.setter
    def mobile_network_sim_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "mobile_network_sim_group_id", value)

    @property
    @pulumi.getter(name="operatorKeyCode")
    def operator_key_code(self) -> pulumi.Input[str]:
        """
        The Opc value for the SIM.
        """
        return pulumi.get(self, "operator_key_code")

    @operator_key_code.setter
    def operator_key_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "operator_key_code", value)

    @property
    @pulumi.getter(name="deviceType")
    def device_type(self) -> Optional[pulumi.Input[str]]:
        """
        An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        """
        return pulumi.get(self, "device_type")

    @device_type.setter
    def device_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="simPolicyId")
    def sim_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of SIM policy used by this SIM.
        """
        return pulumi.get(self, "sim_policy_id")

    @sim_policy_id.setter
    def sim_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sim_policy_id", value)

    @property
    @pulumi.getter(name="staticIpConfigurations")
    def static_ip_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]]]:
        """
        A `static_ip_configuration` block as defined below.
        """
        return pulumi.get(self, "static_ip_configurations")

    @static_ip_configurations.setter
    def static_ip_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]]]):
        pulumi.set(self, "static_ip_configurations", value)


@pulumi.input_type
class _NetworkSimState:
    def __init__(__self__, *,
                 authentication_key: Optional[pulumi.Input[str]] = None,
                 device_type: Optional[pulumi.Input[str]] = None,
                 integrated_circuit_card_identifier: Optional[pulumi.Input[str]] = None,
                 international_mobile_subscriber_identity: Optional[pulumi.Input[str]] = None,
                 mobile_network_sim_group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 operator_key_code: Optional[pulumi.Input[str]] = None,
                 sim_policy_id: Optional[pulumi.Input[str]] = None,
                 sim_state: Optional[pulumi.Input[str]] = None,
                 static_ip_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]]] = None,
                 vendor_key_fingerprint: Optional[pulumi.Input[str]] = None,
                 vendor_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkSim resources.
        :param pulumi.Input[str] authentication_key: The Ki value for the SIM.
        :param pulumi.Input[str] device_type: An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        :param pulumi.Input[str] integrated_circuit_card_identifier: The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] international_mobile_subscriber_identity: The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] mobile_network_sim_group_id: The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] name: The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] operator_key_code: The Opc value for the SIM.
        :param pulumi.Input[str] sim_policy_id: The ID of SIM policy used by this SIM.
        :param pulumi.Input[str] sim_state: The state of the SIM resource.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]] static_ip_configurations: A `static_ip_configuration` block as defined below.
        :param pulumi.Input[str] vendor_key_fingerprint: The public key fingerprint of the SIM vendor who provided this SIM, if any.
        :param pulumi.Input[str] vendor_name: The name of the SIM vendor who provided this SIM, if any.
        """
        if authentication_key is not None:
            pulumi.set(__self__, "authentication_key", authentication_key)
        if device_type is not None:
            pulumi.set(__self__, "device_type", device_type)
        if integrated_circuit_card_identifier is not None:
            pulumi.set(__self__, "integrated_circuit_card_identifier", integrated_circuit_card_identifier)
        if international_mobile_subscriber_identity is not None:
            pulumi.set(__self__, "international_mobile_subscriber_identity", international_mobile_subscriber_identity)
        if mobile_network_sim_group_id is not None:
            pulumi.set(__self__, "mobile_network_sim_group_id", mobile_network_sim_group_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if operator_key_code is not None:
            pulumi.set(__self__, "operator_key_code", operator_key_code)
        if sim_policy_id is not None:
            pulumi.set(__self__, "sim_policy_id", sim_policy_id)
        if sim_state is not None:
            pulumi.set(__self__, "sim_state", sim_state)
        if static_ip_configurations is not None:
            pulumi.set(__self__, "static_ip_configurations", static_ip_configurations)
        if vendor_key_fingerprint is not None:
            pulumi.set(__self__, "vendor_key_fingerprint", vendor_key_fingerprint)
        if vendor_name is not None:
            pulumi.set(__self__, "vendor_name", vendor_name)

    @property
    @pulumi.getter(name="authenticationKey")
    def authentication_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Ki value for the SIM.
        """
        return pulumi.get(self, "authentication_key")

    @authentication_key.setter
    def authentication_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authentication_key", value)

    @property
    @pulumi.getter(name="deviceType")
    def device_type(self) -> Optional[pulumi.Input[str]]:
        """
        An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        """
        return pulumi.get(self, "device_type")

    @device_type.setter
    def device_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type", value)

    @property
    @pulumi.getter(name="integratedCircuitCardIdentifier")
    def integrated_circuit_card_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "integrated_circuit_card_identifier")

    @integrated_circuit_card_identifier.setter
    def integrated_circuit_card_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integrated_circuit_card_identifier", value)

    @property
    @pulumi.getter(name="internationalMobileSubscriberIdentity")
    def international_mobile_subscriber_identity(self) -> Optional[pulumi.Input[str]]:
        """
        The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "international_mobile_subscriber_identity")

    @international_mobile_subscriber_identity.setter
    def international_mobile_subscriber_identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "international_mobile_subscriber_identity", value)

    @property
    @pulumi.getter(name="mobileNetworkSimGroupId")
    def mobile_network_sim_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "mobile_network_sim_group_id")

    @mobile_network_sim_group_id.setter
    def mobile_network_sim_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mobile_network_sim_group_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="operatorKeyCode")
    def operator_key_code(self) -> Optional[pulumi.Input[str]]:
        """
        The Opc value for the SIM.
        """
        return pulumi.get(self, "operator_key_code")

    @operator_key_code.setter
    def operator_key_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operator_key_code", value)

    @property
    @pulumi.getter(name="simPolicyId")
    def sim_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of SIM policy used by this SIM.
        """
        return pulumi.get(self, "sim_policy_id")

    @sim_policy_id.setter
    def sim_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sim_policy_id", value)

    @property
    @pulumi.getter(name="simState")
    def sim_state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the SIM resource.
        """
        return pulumi.get(self, "sim_state")

    @sim_state.setter
    def sim_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sim_state", value)

    @property
    @pulumi.getter(name="staticIpConfigurations")
    def static_ip_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]]]:
        """
        A `static_ip_configuration` block as defined below.
        """
        return pulumi.get(self, "static_ip_configurations")

    @static_ip_configurations.setter
    def static_ip_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkSimStaticIpConfigurationArgs']]]]):
        pulumi.set(self, "static_ip_configurations", value)

    @property
    @pulumi.getter(name="vendorKeyFingerprint")
    def vendor_key_fingerprint(self) -> Optional[pulumi.Input[str]]:
        """
        The public key fingerprint of the SIM vendor who provided this SIM, if any.
        """
        return pulumi.get(self, "vendor_key_fingerprint")

    @vendor_key_fingerprint.setter
    def vendor_key_fingerprint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vendor_key_fingerprint", value)

    @property
    @pulumi.getter(name="vendorName")
    def vendor_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SIM vendor who provided this SIM, if any.
        """
        return pulumi.get(self, "vendor_name")

    @vendor_name.setter
    def vendor_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vendor_name", value)


class NetworkSim(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_key: Optional[pulumi.Input[str]] = None,
                 device_type: Optional[pulumi.Input[str]] = None,
                 integrated_circuit_card_identifier: Optional[pulumi.Input[str]] = None,
                 international_mobile_subscriber_identity: Optional[pulumi.Input[str]] = None,
                 mobile_network_sim_group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 operator_key_code: Optional[pulumi.Input[str]] = None,
                 sim_policy_id: Optional[pulumi.Input[str]] = None,
                 static_ip_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkSimStaticIpConfigurationArgs']]]]] = None,
                 __props__=None):
        """
        Manages a Mobile Network Sim.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_network = azure.mobile.Network("exampleNetwork",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            mobile_country_code="001",
            mobile_network_code="01")
        example_network_sim_group = azure.mobile.NetworkSimGroup("exampleNetworkSimGroup",
            location=example_resource_group.location,
            mobile_network_id=example_network.id)
        example_network_slice = azure.mobile.NetworkSlice("exampleNetworkSlice",
            mobile_network_id=example_network.id,
            location=example_resource_group.location,
            single_network_slice_selection_assistance_information=azure.mobile.NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs(
                slice_service_type=1,
            ))
        example_network_attached_data_network = azure.mobile.NetworkAttachedDataNetwork("exampleNetworkAttachedDataNetwork",
            mobile_network_data_network_name=azurerm_mobile_network_data_network["example"]["name"],
            mobile_network_packet_core_data_plane_id=azurerm_mobile_network_packet_core_data_plane["example"]["id"],
            location=example_resource_group.location,
            dns_addresses=["1.1.1.1"],
            user_equipment_address_pool_prefixes=["2.4.0.0/24"],
            user_equipment_static_address_pool_prefixes=["2.4.1.0/24"],
            user_plane_access_name="test",
            user_plane_access_ipv4_address="10.204.141.4",
            user_plane_access_ipv4_gateway="10.204.141.1",
            user_plane_access_ipv4_subnet="10.204.141.0/24")
        example_network_sim = azure.mobile.NetworkSim("exampleNetworkSim",
            mobile_network_sim_group_id=example_network_sim_group.id,
            authentication_key="00000000000000000000000000000000",
            integrated_circuit_card_identifier="8900000000000000000",
            international_mobile_subscriber_identity="000000000000000",
            operator_key_code="00000000000000000000000000000000",
            static_ip_configurations=[azure.mobile.NetworkSimStaticIpConfigurationArgs(
                attached_data_network_id=data["azurerm_mobile_network_attached_data_network"]["test"]["id"],
                slice_id=azurerm_mobile_network_slice["test"]["id"],
                static_ipv4_address="2.4.0.1",
            )])
        ```

        ## Import

        Mobile Network Sim can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mobile/networkSim:NetworkSim example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/simGroups/simGroup1/sims/sim1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authentication_key: The Ki value for the SIM.
        :param pulumi.Input[str] device_type: An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        :param pulumi.Input[str] integrated_circuit_card_identifier: The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] international_mobile_subscriber_identity: The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] mobile_network_sim_group_id: The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] name: The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] operator_key_code: The Opc value for the SIM.
        :param pulumi.Input[str] sim_policy_id: The ID of SIM policy used by this SIM.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkSimStaticIpConfigurationArgs']]]] static_ip_configurations: A `static_ip_configuration` block as defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkSimArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Mobile Network Sim.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_network = azure.mobile.Network("exampleNetwork",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            mobile_country_code="001",
            mobile_network_code="01")
        example_network_sim_group = azure.mobile.NetworkSimGroup("exampleNetworkSimGroup",
            location=example_resource_group.location,
            mobile_network_id=example_network.id)
        example_network_slice = azure.mobile.NetworkSlice("exampleNetworkSlice",
            mobile_network_id=example_network.id,
            location=example_resource_group.location,
            single_network_slice_selection_assistance_information=azure.mobile.NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs(
                slice_service_type=1,
            ))
        example_network_attached_data_network = azure.mobile.NetworkAttachedDataNetwork("exampleNetworkAttachedDataNetwork",
            mobile_network_data_network_name=azurerm_mobile_network_data_network["example"]["name"],
            mobile_network_packet_core_data_plane_id=azurerm_mobile_network_packet_core_data_plane["example"]["id"],
            location=example_resource_group.location,
            dns_addresses=["1.1.1.1"],
            user_equipment_address_pool_prefixes=["2.4.0.0/24"],
            user_equipment_static_address_pool_prefixes=["2.4.1.0/24"],
            user_plane_access_name="test",
            user_plane_access_ipv4_address="10.204.141.4",
            user_plane_access_ipv4_gateway="10.204.141.1",
            user_plane_access_ipv4_subnet="10.204.141.0/24")
        example_network_sim = azure.mobile.NetworkSim("exampleNetworkSim",
            mobile_network_sim_group_id=example_network_sim_group.id,
            authentication_key="00000000000000000000000000000000",
            integrated_circuit_card_identifier="8900000000000000000",
            international_mobile_subscriber_identity="000000000000000",
            operator_key_code="00000000000000000000000000000000",
            static_ip_configurations=[azure.mobile.NetworkSimStaticIpConfigurationArgs(
                attached_data_network_id=data["azurerm_mobile_network_attached_data_network"]["test"]["id"],
                slice_id=azurerm_mobile_network_slice["test"]["id"],
                static_ipv4_address="2.4.0.1",
            )])
        ```

        ## Import

        Mobile Network Sim can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mobile/networkSim:NetworkSim example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/simGroups/simGroup1/sims/sim1
        ```

        :param str resource_name: The name of the resource.
        :param NetworkSimArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkSimArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_key: Optional[pulumi.Input[str]] = None,
                 device_type: Optional[pulumi.Input[str]] = None,
                 integrated_circuit_card_identifier: Optional[pulumi.Input[str]] = None,
                 international_mobile_subscriber_identity: Optional[pulumi.Input[str]] = None,
                 mobile_network_sim_group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 operator_key_code: Optional[pulumi.Input[str]] = None,
                 sim_policy_id: Optional[pulumi.Input[str]] = None,
                 static_ip_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkSimStaticIpConfigurationArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkSimArgs.__new__(NetworkSimArgs)

            if authentication_key is None and not opts.urn:
                raise TypeError("Missing required property 'authentication_key'")
            __props__.__dict__["authentication_key"] = None if authentication_key is None else pulumi.Output.secret(authentication_key)
            __props__.__dict__["device_type"] = device_type
            if integrated_circuit_card_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'integrated_circuit_card_identifier'")
            __props__.__dict__["integrated_circuit_card_identifier"] = integrated_circuit_card_identifier
            if international_mobile_subscriber_identity is None and not opts.urn:
                raise TypeError("Missing required property 'international_mobile_subscriber_identity'")
            __props__.__dict__["international_mobile_subscriber_identity"] = international_mobile_subscriber_identity
            if mobile_network_sim_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'mobile_network_sim_group_id'")
            __props__.__dict__["mobile_network_sim_group_id"] = mobile_network_sim_group_id
            __props__.__dict__["name"] = name
            if operator_key_code is None and not opts.urn:
                raise TypeError("Missing required property 'operator_key_code'")
            __props__.__dict__["operator_key_code"] = None if operator_key_code is None else pulumi.Output.secret(operator_key_code)
            __props__.__dict__["sim_policy_id"] = sim_policy_id
            __props__.__dict__["static_ip_configurations"] = static_ip_configurations
            __props__.__dict__["sim_state"] = None
            __props__.__dict__["vendor_key_fingerprint"] = None
            __props__.__dict__["vendor_name"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["authenticationKey", "operatorKeyCode"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(NetworkSim, __self__).__init__(
            'azure:mobile/networkSim:NetworkSim',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_key: Optional[pulumi.Input[str]] = None,
            device_type: Optional[pulumi.Input[str]] = None,
            integrated_circuit_card_identifier: Optional[pulumi.Input[str]] = None,
            international_mobile_subscriber_identity: Optional[pulumi.Input[str]] = None,
            mobile_network_sim_group_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            operator_key_code: Optional[pulumi.Input[str]] = None,
            sim_policy_id: Optional[pulumi.Input[str]] = None,
            sim_state: Optional[pulumi.Input[str]] = None,
            static_ip_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkSimStaticIpConfigurationArgs']]]]] = None,
            vendor_key_fingerprint: Optional[pulumi.Input[str]] = None,
            vendor_name: Optional[pulumi.Input[str]] = None) -> 'NetworkSim':
        """
        Get an existing NetworkSim resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authentication_key: The Ki value for the SIM.
        :param pulumi.Input[str] device_type: An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        :param pulumi.Input[str] integrated_circuit_card_identifier: The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] international_mobile_subscriber_identity: The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] mobile_network_sim_group_id: The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] name: The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        :param pulumi.Input[str] operator_key_code: The Opc value for the SIM.
        :param pulumi.Input[str] sim_policy_id: The ID of SIM policy used by this SIM.
        :param pulumi.Input[str] sim_state: The state of the SIM resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkSimStaticIpConfigurationArgs']]]] static_ip_configurations: A `static_ip_configuration` block as defined below.
        :param pulumi.Input[str] vendor_key_fingerprint: The public key fingerprint of the SIM vendor who provided this SIM, if any.
        :param pulumi.Input[str] vendor_name: The name of the SIM vendor who provided this SIM, if any.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkSimState.__new__(_NetworkSimState)

        __props__.__dict__["authentication_key"] = authentication_key
        __props__.__dict__["device_type"] = device_type
        __props__.__dict__["integrated_circuit_card_identifier"] = integrated_circuit_card_identifier
        __props__.__dict__["international_mobile_subscriber_identity"] = international_mobile_subscriber_identity
        __props__.__dict__["mobile_network_sim_group_id"] = mobile_network_sim_group_id
        __props__.__dict__["name"] = name
        __props__.__dict__["operator_key_code"] = operator_key_code
        __props__.__dict__["sim_policy_id"] = sim_policy_id
        __props__.__dict__["sim_state"] = sim_state
        __props__.__dict__["static_ip_configurations"] = static_ip_configurations
        __props__.__dict__["vendor_key_fingerprint"] = vendor_key_fingerprint
        __props__.__dict__["vendor_name"] = vendor_name
        return NetworkSim(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authenticationKey")
    def authentication_key(self) -> pulumi.Output[str]:
        """
        The Ki value for the SIM.
        """
        return pulumi.get(self, "authentication_key")

    @property
    @pulumi.getter(name="deviceType")
    def device_type(self) -> pulumi.Output[Optional[str]]:
        """
        An optional free-form text field that can be used to record the device type this SIM is associated with, for example `Video camera`. The Azure portal allows SIMs to be grouped and filtered based on this value.
        """
        return pulumi.get(self, "device_type")

    @property
    @pulumi.getter(name="integratedCircuitCardIdentifier")
    def integrated_circuit_card_identifier(self) -> pulumi.Output[str]:
        """
        The integrated circuit card ID (ICCID) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "integrated_circuit_card_identifier")

    @property
    @pulumi.getter(name="internationalMobileSubscriberIdentity")
    def international_mobile_subscriber_identity(self) -> pulumi.Output[str]:
        """
        The international mobile subscriber identity (IMSI) for the SIM. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "international_mobile_subscriber_identity")

    @property
    @pulumi.getter(name="mobileNetworkSimGroupId")
    def mobile_network_sim_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the Mobile Network which the Mobile Network Sim belongs to. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "mobile_network_sim_group_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Mobile Network Sim. Changing this forces a new Mobile Network Sim to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="operatorKeyCode")
    def operator_key_code(self) -> pulumi.Output[str]:
        """
        The Opc value for the SIM.
        """
        return pulumi.get(self, "operator_key_code")

    @property
    @pulumi.getter(name="simPolicyId")
    def sim_policy_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of SIM policy used by this SIM.
        """
        return pulumi.get(self, "sim_policy_id")

    @property
    @pulumi.getter(name="simState")
    def sim_state(self) -> pulumi.Output[str]:
        """
        The state of the SIM resource.
        """
        return pulumi.get(self, "sim_state")

    @property
    @pulumi.getter(name="staticIpConfigurations")
    def static_ip_configurations(self) -> pulumi.Output[Optional[Sequence['outputs.NetworkSimStaticIpConfiguration']]]:
        """
        A `static_ip_configuration` block as defined below.
        """
        return pulumi.get(self, "static_ip_configurations")

    @property
    @pulumi.getter(name="vendorKeyFingerprint")
    def vendor_key_fingerprint(self) -> pulumi.Output[str]:
        """
        The public key fingerprint of the SIM vendor who provided this SIM, if any.
        """
        return pulumi.get(self, "vendor_key_fingerprint")

    @property
    @pulumi.getter(name="vendorName")
    def vendor_name(self) -> pulumi.Output[str]:
        """
        The name of the SIM vendor who provided this SIM, if any.
        """
        return pulumi.get(self, "vendor_name")
