# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetGroupResult',
    'AwaitableGetGroupResult',
    'get_group',
    'get_group_output',
]

@pulumi.output_type
class GetGroupResult:
    """
    A collection of values returned by getGroup.
    """
    def __init__(__self__, fqdn=None, id=None, ip_address=None, location=None, name=None, resource_group_name=None, tags=None):
        if fqdn and not isinstance(fqdn, str):
            raise TypeError("Expected argument 'fqdn' to be a str")
        pulumi.set(__self__, "fqdn", fqdn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def fqdn(self) -> str:
        """
        The FQDN of the Container Group instance derived from `dns_name_label`.
        """
        return pulumi.get(self, "fqdn")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> str:
        """
        The IP address allocated to the Container Group instance.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        The Azure Region where the Container Group instance exists.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A mapping of tags assigned to the Container Group instance.
        """
        return pulumi.get(self, "tags")


class AwaitableGetGroupResult(GetGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupResult(
            fqdn=self.fqdn,
            id=self.id,
            ip_address=self.ip_address,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            tags=self.tags)


def get_group(name: Optional[str] = None,
              resource_group_name: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupResult:
    """
    Use this data source to access information about an existing Container Group instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerservice.get_group(name="existing",
        resource_group_name="existing")
    pulumi.export("id", example.id)
    pulumi.export("ipAddress", example.ip_address)
    pulumi.export("fqdn", example.fqdn)
    ```


    :param str name: The name of this Container Group instance.
    :param str resource_group_name: The name of the Resource Group where the Container Group instance exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('azure:containerservice/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult).value

    return AwaitableGetGroupResult(
        fqdn=__ret__.fqdn,
        id=__ret__.id,
        ip_address=__ret__.ip_address,
        location=__ret__.location,
        name=__ret__.name,
        resource_group_name=__ret__.resource_group_name,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_group)
def get_group_output(name: Optional[pulumi.Input[str]] = None,
                     resource_group_name: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGroupResult]:
    """
    Use this data source to access information about an existing Container Group instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerservice.get_group(name="existing",
        resource_group_name="existing")
    pulumi.export("id", example.id)
    pulumi.export("ipAddress", example.ip_address)
    pulumi.export("fqdn", example.fqdn)
    ```


    :param str name: The name of this Container Group instance.
    :param str resource_group_name: The name of the Resource Group where the Container Group instance exists.
    """
    ...