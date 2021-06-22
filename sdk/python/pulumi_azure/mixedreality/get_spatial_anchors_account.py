# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSpatialAnchorsAccountResult',
    'AwaitableGetSpatialAnchorsAccountResult',
    'get_spatial_anchors_account',
]

@pulumi.output_type
class GetSpatialAnchorsAccountResult:
    """
    A collection of values returned by getSpatialAnchorsAccount.
    """
    def __init__(__self__, account_domain=None, account_id=None, id=None, location=None, name=None, resource_group_name=None):
        if account_domain and not isinstance(account_domain, str):
            raise TypeError("Expected argument 'account_domain' to be a str")
        pulumi.set(__self__, "account_domain", account_domain)
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter(name="accountDomain")
    def account_domain(self) -> str:
        """
        The domain of the Spatial Anchors Account.
        """
        return pulumi.get(self, "account_domain")

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account ID of the Spatial Anchors Account.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def location(self) -> str:
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")


class AwaitableGetSpatialAnchorsAccountResult(GetSpatialAnchorsAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSpatialAnchorsAccountResult(
            account_domain=self.account_domain,
            account_id=self.account_id,
            id=self.id,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name)


def get_spatial_anchors_account(name: Optional[str] = None,
                                resource_group_name: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSpatialAnchorsAccountResult:
    """
    Get information about an Azure Spatial Anchors Account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.mixedreality.get_spatial_anchors_account(name="example",
        resource_group_name=azurerm_resource_group["example"]["name"])
    pulumi.export("accountDomain", data["azurerm_spatial_anchors_account"]["account_domain"])
    ```


    :param str name: Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
    :param str resource_group_name: The name of the resource group in which to create the Spatial Anchors Account.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('azure:mixedreality/getSpatialAnchorsAccount:getSpatialAnchorsAccount', __args__, opts=opts, typ=GetSpatialAnchorsAccountResult).value

    return AwaitableGetSpatialAnchorsAccountResult(
        account_domain=__ret__.account_domain,
        account_id=__ret__.account_id,
        id=__ret__.id,
        location=__ret__.location,
        name=__ret__.name,
        resource_group_name=__ret__.resource_group_name)