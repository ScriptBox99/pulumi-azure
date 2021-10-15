# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FailoverGroupArgs', 'FailoverGroup']

@pulumi.input_type
class FailoverGroupArgs:
    def __init__(__self__, *,
                 partner_servers: pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]],
                 read_write_endpoint_failover_policy: pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs'],
                 server_id: pulumi.Input[str],
                 databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 readonly_endpoint_failover_policy_enabled: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a FailoverGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]] partner_servers: A `partner_server` block as defined below.
        :param pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs'] read_write_endpoint_failover_policy: A `read_write_endpoint_failover_policy` block as defined below.
        :param pulumi.Input[str] server_id: The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] databases: A set of database names to include in the failover group.
        :param pulumi.Input[str] name: The name of the Failover Group. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] readonly_endpoint_failover_policy_enabled: Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "partner_servers", partner_servers)
        pulumi.set(__self__, "read_write_endpoint_failover_policy", read_write_endpoint_failover_policy)
        pulumi.set(__self__, "server_id", server_id)
        if databases is not None:
            pulumi.set(__self__, "databases", databases)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if readonly_endpoint_failover_policy_enabled is not None:
            pulumi.set(__self__, "readonly_endpoint_failover_policy_enabled", readonly_endpoint_failover_policy_enabled)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="partnerServers")
    def partner_servers(self) -> pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]]:
        """
        A `partner_server` block as defined below.
        """
        return pulumi.get(self, "partner_servers")

    @partner_servers.setter
    def partner_servers(self, value: pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]]):
        pulumi.set(self, "partner_servers", value)

    @property
    @pulumi.getter(name="readWriteEndpointFailoverPolicy")
    def read_write_endpoint_failover_policy(self) -> pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs']:
        """
        A `read_write_endpoint_failover_policy` block as defined below.
        """
        return pulumi.get(self, "read_write_endpoint_failover_policy")

    @read_write_endpoint_failover_policy.setter
    def read_write_endpoint_failover_policy(self, value: pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs']):
        pulumi.set(self, "read_write_endpoint_failover_policy", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[str]:
        """
        The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter
    def databases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A set of database names to include in the failover group.
        """
        return pulumi.get(self, "databases")

    @databases.setter
    def databases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "databases", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Failover Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="readonlyEndpointFailoverPolicyEnabled")
    def readonly_endpoint_failover_policy_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        """
        return pulumi.get(self, "readonly_endpoint_failover_policy_enabled")

    @readonly_endpoint_failover_policy_enabled.setter
    def readonly_endpoint_failover_policy_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "readonly_endpoint_failover_policy_enabled", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _FailoverGroupState:
    def __init__(__self__, *,
                 databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partner_servers: Optional[pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]]] = None,
                 read_write_endpoint_failover_policy: Optional[pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs']] = None,
                 readonly_endpoint_failover_policy_enabled: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering FailoverGroup resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] databases: A set of database names to include in the failover group.
        :param pulumi.Input[str] name: The name of the Failover Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]] partner_servers: A `partner_server` block as defined below.
        :param pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs'] read_write_endpoint_failover_policy: A `read_write_endpoint_failover_policy` block as defined below.
        :param pulumi.Input[bool] readonly_endpoint_failover_policy_enabled: Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        :param pulumi.Input[str] server_id: The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        """
        if databases is not None:
            pulumi.set(__self__, "databases", databases)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if partner_servers is not None:
            pulumi.set(__self__, "partner_servers", partner_servers)
        if read_write_endpoint_failover_policy is not None:
            pulumi.set(__self__, "read_write_endpoint_failover_policy", read_write_endpoint_failover_policy)
        if readonly_endpoint_failover_policy_enabled is not None:
            pulumi.set(__self__, "readonly_endpoint_failover_policy_enabled", readonly_endpoint_failover_policy_enabled)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def databases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A set of database names to include in the failover group.
        """
        return pulumi.get(self, "databases")

    @databases.setter
    def databases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "databases", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Failover Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="partnerServers")
    def partner_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]]]:
        """
        A `partner_server` block as defined below.
        """
        return pulumi.get(self, "partner_servers")

    @partner_servers.setter
    def partner_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FailoverGroupPartnerServerArgs']]]]):
        pulumi.set(self, "partner_servers", value)

    @property
    @pulumi.getter(name="readWriteEndpointFailoverPolicy")
    def read_write_endpoint_failover_policy(self) -> Optional[pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs']]:
        """
        A `read_write_endpoint_failover_policy` block as defined below.
        """
        return pulumi.get(self, "read_write_endpoint_failover_policy")

    @read_write_endpoint_failover_policy.setter
    def read_write_endpoint_failover_policy(self, value: Optional[pulumi.Input['FailoverGroupReadWriteEndpointFailoverPolicyArgs']]):
        pulumi.set(self, "read_write_endpoint_failover_policy", value)

    @property
    @pulumi.getter(name="readonlyEndpointFailoverPolicyEnabled")
    def readonly_endpoint_failover_policy_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        """
        return pulumi.get(self, "readonly_endpoint_failover_policy_enabled")

    @readonly_endpoint_failover_policy_enabled.setter
    def readonly_endpoint_failover_policy_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "readonly_endpoint_failover_policy_enabled", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class FailoverGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partner_servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FailoverGroupPartnerServerArgs']]]]] = None,
                 read_write_endpoint_failover_policy: Optional[pulumi.Input[pulumi.InputType['FailoverGroupReadWriteEndpointFailoverPolicyArgs']]] = None,
                 readonly_endpoint_failover_policy_enabled: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages a Microsoft Azure SQL Failover Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        primary = azure.mssql.Server("primary",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            version="12.0",
            administrator_login="missadministrator",
            administrator_login_password="thisIsKat11")
        secondary = azure.mssql.Server("secondary",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            version="12.0",
            administrator_login="missadministrator",
            administrator_login_password="thisIsKat12")
        example_database = azure.mssql.Database("exampleDatabase",
            server_id=primary.id,
            sku_name="S1",
            collation="SQL_Latin1_General_CP1_CI_AS",
            max_size_gb=200)
        example_failover_group = azure.mssql.FailoverGroup("exampleFailoverGroup",
            server_id=primary.id,
            databases=[example_database.id],
            partner_servers=[azure.mssql.FailoverGroupPartnerServerArgs(
                id=secondary.id,
            )],
            read_write_endpoint_failover_policy=azure.mssql.FailoverGroupReadWriteEndpointFailoverPolicyArgs(
                mode="Automatic",
                grace_minutes=80,
            ),
            tags={
                "environment": "prod",
                "database": "example",
            })
        ```

        ## Import

        Failover Groups can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mssql/failoverGroup:FailoverGroup example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Sql/servers/server1/failoverGroups/failoverGroup1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] databases: A set of database names to include in the failover group.
        :param pulumi.Input[str] name: The name of the Failover Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FailoverGroupPartnerServerArgs']]]] partner_servers: A `partner_server` block as defined below.
        :param pulumi.Input[pulumi.InputType['FailoverGroupReadWriteEndpointFailoverPolicyArgs']] read_write_endpoint_failover_policy: A `read_write_endpoint_failover_policy` block as defined below.
        :param pulumi.Input[bool] readonly_endpoint_failover_policy_enabled: Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        :param pulumi.Input[str] server_id: The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FailoverGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Microsoft Azure SQL Failover Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        primary = azure.mssql.Server("primary",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            version="12.0",
            administrator_login="missadministrator",
            administrator_login_password="thisIsKat11")
        secondary = azure.mssql.Server("secondary",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            version="12.0",
            administrator_login="missadministrator",
            administrator_login_password="thisIsKat12")
        example_database = azure.mssql.Database("exampleDatabase",
            server_id=primary.id,
            sku_name="S1",
            collation="SQL_Latin1_General_CP1_CI_AS",
            max_size_gb=200)
        example_failover_group = azure.mssql.FailoverGroup("exampleFailoverGroup",
            server_id=primary.id,
            databases=[example_database.id],
            partner_servers=[azure.mssql.FailoverGroupPartnerServerArgs(
                id=secondary.id,
            )],
            read_write_endpoint_failover_policy=azure.mssql.FailoverGroupReadWriteEndpointFailoverPolicyArgs(
                mode="Automatic",
                grace_minutes=80,
            ),
            tags={
                "environment": "prod",
                "database": "example",
            })
        ```

        ## Import

        Failover Groups can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mssql/failoverGroup:FailoverGroup example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Sql/servers/server1/failoverGroups/failoverGroup1
        ```

        :param str resource_name: The name of the resource.
        :param FailoverGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FailoverGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partner_servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FailoverGroupPartnerServerArgs']]]]] = None,
                 read_write_endpoint_failover_policy: Optional[pulumi.Input[pulumi.InputType['FailoverGroupReadWriteEndpointFailoverPolicyArgs']]] = None,
                 readonly_endpoint_failover_policy_enabled: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
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
            __props__ = FailoverGroupArgs.__new__(FailoverGroupArgs)

            __props__.__dict__["databases"] = databases
            __props__.__dict__["name"] = name
            if partner_servers is None and not opts.urn:
                raise TypeError("Missing required property 'partner_servers'")
            __props__.__dict__["partner_servers"] = partner_servers
            if read_write_endpoint_failover_policy is None and not opts.urn:
                raise TypeError("Missing required property 'read_write_endpoint_failover_policy'")
            __props__.__dict__["read_write_endpoint_failover_policy"] = read_write_endpoint_failover_policy
            __props__.__dict__["readonly_endpoint_failover_policy_enabled"] = readonly_endpoint_failover_policy_enabled
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
            __props__.__dict__["tags"] = tags
        super(FailoverGroup, __self__).__init__(
            'azure:mssql/failoverGroup:FailoverGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            partner_servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FailoverGroupPartnerServerArgs']]]]] = None,
            read_write_endpoint_failover_policy: Optional[pulumi.Input[pulumi.InputType['FailoverGroupReadWriteEndpointFailoverPolicyArgs']]] = None,
            readonly_endpoint_failover_policy_enabled: Optional[pulumi.Input[bool]] = None,
            server_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'FailoverGroup':
        """
        Get an existing FailoverGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] databases: A set of database names to include in the failover group.
        :param pulumi.Input[str] name: The name of the Failover Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FailoverGroupPartnerServerArgs']]]] partner_servers: A `partner_server` block as defined below.
        :param pulumi.Input[pulumi.InputType['FailoverGroupReadWriteEndpointFailoverPolicyArgs']] read_write_endpoint_failover_policy: A `read_write_endpoint_failover_policy` block as defined below.
        :param pulumi.Input[bool] readonly_endpoint_failover_policy_enabled: Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        :param pulumi.Input[str] server_id: The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FailoverGroupState.__new__(_FailoverGroupState)

        __props__.__dict__["databases"] = databases
        __props__.__dict__["name"] = name
        __props__.__dict__["partner_servers"] = partner_servers
        __props__.__dict__["read_write_endpoint_failover_policy"] = read_write_endpoint_failover_policy
        __props__.__dict__["readonly_endpoint_failover_policy_enabled"] = readonly_endpoint_failover_policy_enabled
        __props__.__dict__["server_id"] = server_id
        __props__.__dict__["tags"] = tags
        return FailoverGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def databases(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A set of database names to include in the failover group.
        """
        return pulumi.get(self, "databases")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Failover Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="partnerServers")
    def partner_servers(self) -> pulumi.Output[Sequence['outputs.FailoverGroupPartnerServer']]:
        """
        A `partner_server` block as defined below.
        """
        return pulumi.get(self, "partner_servers")

    @property
    @pulumi.getter(name="readWriteEndpointFailoverPolicy")
    def read_write_endpoint_failover_policy(self) -> pulumi.Output['outputs.FailoverGroupReadWriteEndpointFailoverPolicy']:
        """
        A `read_write_endpoint_failover_policy` block as defined below.
        """
        return pulumi.get(self, "read_write_endpoint_failover_policy")

    @property
    @pulumi.getter(name="readonlyEndpointFailoverPolicyEnabled")
    def readonly_endpoint_failover_policy_enabled(self) -> pulumi.Output[bool]:
        """
        Whether failover is enabled for the readonly endpoint. Defaults to `false`.
        """
        return pulumi.get(self, "readonly_endpoint_failover_policy_enabled")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[str]:
        """
        The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")
