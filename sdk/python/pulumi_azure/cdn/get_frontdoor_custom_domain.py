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

__all__ = [
    'GetFrontdoorCustomDomainResult',
    'AwaitableGetFrontdoorCustomDomainResult',
    'get_frontdoor_custom_domain',
    'get_frontdoor_custom_domain_output',
]

@pulumi.output_type
class GetFrontdoorCustomDomainResult:
    """
    A collection of values returned by getFrontdoorCustomDomain.
    """
    def __init__(__self__, cdn_frontdoor_profile_id=None, dns_zone_id=None, expiration_date=None, host_name=None, id=None, name=None, profile_name=None, resource_group_name=None, tls=None, validation_token=None):
        if cdn_frontdoor_profile_id and not isinstance(cdn_frontdoor_profile_id, str):
            raise TypeError("Expected argument 'cdn_frontdoor_profile_id' to be a str")
        pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        if dns_zone_id and not isinstance(dns_zone_id, str):
            raise TypeError("Expected argument 'dns_zone_id' to be a str")
        pulumi.set(__self__, "dns_zone_id", dns_zone_id)
        if expiration_date and not isinstance(expiration_date, str):
            raise TypeError("Expected argument 'expiration_date' to be a str")
        pulumi.set(__self__, "expiration_date", expiration_date)
        if host_name and not isinstance(host_name, str):
            raise TypeError("Expected argument 'host_name' to be a str")
        pulumi.set(__self__, "host_name", host_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if profile_name and not isinstance(profile_name, str):
            raise TypeError("Expected argument 'profile_name' to be a str")
        pulumi.set(__self__, "profile_name", profile_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tls and not isinstance(tls, list):
            raise TypeError("Expected argument 'tls' to be a list")
        pulumi.set(__self__, "tls", tls)
        if validation_token and not isinstance(validation_token, str):
            raise TypeError("Expected argument 'validation_token' to be a str")
        pulumi.set(__self__, "validation_token", validation_token)

    @property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> str:
        """
        The ID of the Front Door Profile which the Front Door Custom Domain is bound to.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @property
    @pulumi.getter(name="dnsZoneId")
    def dns_zone_id(self) -> str:
        return pulumi.get(self, "dns_zone_id")

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> str:
        """
        The date time that the token expires.
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> str:
        """
        The host name of the domain.
        """
        return pulumi.get(self, "host_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> str:
        return pulumi.get(self, "profile_name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tls(self) -> Sequence['outputs.GetFrontdoorCustomDomainTlResult']:
        """
        A `tls` block as defined below.
        """
        return pulumi.get(self, "tls")

    @property
    @pulumi.getter(name="validationToken")
    def validation_token(self) -> str:
        """
        The challenge used for DNS TXT record or file based validation.
        """
        return pulumi.get(self, "validation_token")


class AwaitableGetFrontdoorCustomDomainResult(GetFrontdoorCustomDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFrontdoorCustomDomainResult(
            cdn_frontdoor_profile_id=self.cdn_frontdoor_profile_id,
            dns_zone_id=self.dns_zone_id,
            expiration_date=self.expiration_date,
            host_name=self.host_name,
            id=self.id,
            name=self.name,
            profile_name=self.profile_name,
            resource_group_name=self.resource_group_name,
            tls=self.tls,
            validation_token=self.validation_token)


def get_frontdoor_custom_domain(name: Optional[str] = None,
                                profile_name: Optional[str] = None,
                                resource_group_name: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFrontdoorCustomDomainResult:
    """
    Use this data source to access information about an existing Front Door (standard/premium) Custom Domain.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.cdn.get_frontdoor_custom_domain(name=azurerm_cdn_frontdoor_custom_domain["example"]["name"],
        profile_name=azurerm_cdn_frontdoor_profile["example"]["name"],
        resource_group_name=azurerm_cdn_frontdoor_profile["example"]["resource_group_name"])
    ```


    :param str name: The name of the Front Door Custom Domain.
    :param str profile_name: The name of the Front Door Profile which the Front Door Custom Domain is bound to.
    :param str resource_group_name: The name of the Resource Group where the Front Door Profile exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['profileName'] = profile_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:cdn/getFrontdoorCustomDomain:getFrontdoorCustomDomain', __args__, opts=opts, typ=GetFrontdoorCustomDomainResult).value

    return AwaitableGetFrontdoorCustomDomainResult(
        cdn_frontdoor_profile_id=__ret__.cdn_frontdoor_profile_id,
        dns_zone_id=__ret__.dns_zone_id,
        expiration_date=__ret__.expiration_date,
        host_name=__ret__.host_name,
        id=__ret__.id,
        name=__ret__.name,
        profile_name=__ret__.profile_name,
        resource_group_name=__ret__.resource_group_name,
        tls=__ret__.tls,
        validation_token=__ret__.validation_token)


@_utilities.lift_output_func(get_frontdoor_custom_domain)
def get_frontdoor_custom_domain_output(name: Optional[pulumi.Input[str]] = None,
                                       profile_name: Optional[pulumi.Input[str]] = None,
                                       resource_group_name: Optional[pulumi.Input[str]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFrontdoorCustomDomainResult]:
    """
    Use this data source to access information about an existing Front Door (standard/premium) Custom Domain.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.cdn.get_frontdoor_custom_domain(name=azurerm_cdn_frontdoor_custom_domain["example"]["name"],
        profile_name=azurerm_cdn_frontdoor_profile["example"]["name"],
        resource_group_name=azurerm_cdn_frontdoor_profile["example"]["resource_group_name"])
    ```


    :param str name: The name of the Front Door Custom Domain.
    :param str profile_name: The name of the Front Door Profile which the Front Door Custom Domain is bound to.
    :param str resource_group_name: The name of the Resource Group where the Front Door Profile exists.
    """
    ...