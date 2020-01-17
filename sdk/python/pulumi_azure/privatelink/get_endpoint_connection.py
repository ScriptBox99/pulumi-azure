# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetEndpointConnectionResult:
    """
    A collection of values returned by getEndpointConnection.
    """
    def __init__(__self__, location=None, name=None, private_service_connections=None, resource_group_name=None, id=None):
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        __self__.location = location
        """
        The supported Azure location where the resource exists.
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        """
        The name of the private endpoint.
        """
        if private_service_connections and not isinstance(private_service_connections, list):
            raise TypeError("Expected argument 'private_service_connections' to be a list")
        __self__.private_service_connections = private_service_connections
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        __self__.resource_group_name = resource_group_name
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetEndpointConnectionResult(GetEndpointConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEndpointConnectionResult(
            location=self.location,
            name=self.name,
            private_service_connections=self.private_service_connections,
            resource_group_name=self.resource_group_name,
            id=self.id)

def get_endpoint_connection(name=None,resource_group_name=None,opts=None):
    """
    Use this data source to access the connection status information about an existing Private Endpoint.
    
    > **NOTE** Private Endpoint is currently in Public Preview.
    
    :param str name: Specifies the Name of the private endpoint.
    :param str resource_group_name: Specifies the Name of the Resource Group within which the private endpoint exists.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/d/private_endpoint_connection.html.markdown.
    """
    __args__ = dict()

    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('azure:privatelink/getEndpointConnection:getEndpointConnection', __args__, opts=opts).value

    return AwaitableGetEndpointConnectionResult(
        location=__ret__.get('location'),
        name=__ret__.get('name'),
        private_service_connections=__ret__.get('privateServiceConnections'),
        resource_group_name=__ret__.get('resourceGroupName'),
        id=__ret__.get('id'))