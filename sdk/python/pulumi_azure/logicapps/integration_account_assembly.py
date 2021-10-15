# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IntegrationAccountAssemblyArgs', 'IntegrationAccountAssembly']

@pulumi.input_type
class IntegrationAccountAssemblyArgs:
    def __init__(__self__, *,
                 assembly_name: pulumi.Input[str],
                 integration_account_name: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 assembly_version: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_link_uri: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IntegrationAccountAssembly resource.
        :param pulumi.Input[str] assembly_name: The name of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] integration_account_name: The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] assembly_version: The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        :param pulumi.Input[str] content: The content of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] content_link_uri: The content link URI of the Logic App Integration Account Assembly.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: The metadata of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] name: The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "assembly_name", assembly_name)
        pulumi.set(__self__, "integration_account_name", integration_account_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if assembly_version is not None:
            pulumi.set(__self__, "assembly_version", assembly_version)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if content_link_uri is not None:
            pulumi.set(__self__, "content_link_uri", content_link_uri)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="assemblyName")
    def assembly_name(self) -> pulumi.Input[str]:
        """
        The name of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "assembly_name")

    @assembly_name.setter
    def assembly_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "assembly_name", value)

    @property
    @pulumi.getter(name="integrationAccountName")
    def integration_account_name(self) -> pulumi.Input[str]:
        """
        The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "integration_account_name")

    @integration_account_name.setter
    def integration_account_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "integration_account_name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="assemblyVersion")
    def assembly_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        """
        return pulumi.get(self, "assembly_version")

    @assembly_version.setter
    def assembly_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "assembly_version", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="contentLinkUri")
    def content_link_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The content link URI of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "content_link_uri")

    @content_link_uri.setter
    def content_link_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_link_uri", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The metadata of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _IntegrationAccountAssemblyState:
    def __init__(__self__, *,
                 assembly_name: Optional[pulumi.Input[str]] = None,
                 assembly_version: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_link_uri: Optional[pulumi.Input[str]] = None,
                 integration_account_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IntegrationAccountAssembly resources.
        :param pulumi.Input[str] assembly_name: The name of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] assembly_version: The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        :param pulumi.Input[str] content: The content of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] content_link_uri: The content link URI of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] integration_account_name: The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: The metadata of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] name: The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        """
        if assembly_name is not None:
            pulumi.set(__self__, "assembly_name", assembly_name)
        if assembly_version is not None:
            pulumi.set(__self__, "assembly_version", assembly_version)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if content_link_uri is not None:
            pulumi.set(__self__, "content_link_uri", content_link_uri)
        if integration_account_name is not None:
            pulumi.set(__self__, "integration_account_name", integration_account_name)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter(name="assemblyName")
    def assembly_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "assembly_name")

    @assembly_name.setter
    def assembly_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "assembly_name", value)

    @property
    @pulumi.getter(name="assemblyVersion")
    def assembly_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        """
        return pulumi.get(self, "assembly_version")

    @assembly_version.setter
    def assembly_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "assembly_version", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="contentLinkUri")
    def content_link_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The content link URI of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "content_link_uri")

    @content_link_uri.setter
    def content_link_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_link_uri", value)

    @property
    @pulumi.getter(name="integrationAccountName")
    def integration_account_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "integration_account_name")

    @integration_account_name.setter
    def integration_account_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_account_name", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The metadata of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)


class IntegrationAccountAssembly(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assembly_name: Optional[pulumi.Input[str]] = None,
                 assembly_version: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_link_uri: Optional[pulumi.Input[str]] = None,
                 integration_account_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Logic App Integration Account Assembly.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_integration_account = azure.logicapps.IntegrationAccount("exampleIntegrationAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku_name="Basic")
        example_integration_account_assembly = azure.logicapps.IntegrationAccountAssembly("exampleIntegrationAccountAssembly",
            resource_group_name=example_resource_group.name,
            integration_account_name=example_integration_account.name,
            assembly_name="TestAssembly",
            content=(lambda path: base64.b64encode(open(path).read().encode()).decode())("testdata/log4net.dll"))
        ```

        ## Import

        Logic App Integration Account Assemblies can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:logicapps/integrationAccountAssembly:IntegrationAccountAssembly example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1/assemblies/assembly1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] assembly_name: The name of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] assembly_version: The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        :param pulumi.Input[str] content: The content of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] content_link_uri: The content link URI of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] integration_account_name: The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: The metadata of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] name: The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationAccountAssemblyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Logic App Integration Account Assembly.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_integration_account = azure.logicapps.IntegrationAccount("exampleIntegrationAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku_name="Basic")
        example_integration_account_assembly = azure.logicapps.IntegrationAccountAssembly("exampleIntegrationAccountAssembly",
            resource_group_name=example_resource_group.name,
            integration_account_name=example_integration_account.name,
            assembly_name="TestAssembly",
            content=(lambda path: base64.b64encode(open(path).read().encode()).decode())("testdata/log4net.dll"))
        ```

        ## Import

        Logic App Integration Account Assemblies can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:logicapps/integrationAccountAssembly:IntegrationAccountAssembly example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1/assemblies/assembly1
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationAccountAssemblyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationAccountAssemblyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assembly_name: Optional[pulumi.Input[str]] = None,
                 assembly_version: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_link_uri: Optional[pulumi.Input[str]] = None,
                 integration_account_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
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
            __props__ = IntegrationAccountAssemblyArgs.__new__(IntegrationAccountAssemblyArgs)

            if assembly_name is None and not opts.urn:
                raise TypeError("Missing required property 'assembly_name'")
            __props__.__dict__["assembly_name"] = assembly_name
            __props__.__dict__["assembly_version"] = assembly_version
            __props__.__dict__["content"] = content
            __props__.__dict__["content_link_uri"] = content_link_uri
            if integration_account_name is None and not opts.urn:
                raise TypeError("Missing required property 'integration_account_name'")
            __props__.__dict__["integration_account_name"] = integration_account_name
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        super(IntegrationAccountAssembly, __self__).__init__(
            'azure:logicapps/integrationAccountAssembly:IntegrationAccountAssembly',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            assembly_name: Optional[pulumi.Input[str]] = None,
            assembly_version: Optional[pulumi.Input[str]] = None,
            content: Optional[pulumi.Input[str]] = None,
            content_link_uri: Optional[pulumi.Input[str]] = None,
            integration_account_name: Optional[pulumi.Input[str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None) -> 'IntegrationAccountAssembly':
        """
        Get an existing IntegrationAccountAssembly resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] assembly_name: The name of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] assembly_version: The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        :param pulumi.Input[str] content: The content of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] content_link_uri: The content link URI of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] integration_account_name: The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: The metadata of the Logic App Integration Account Assembly.
        :param pulumi.Input[str] name: The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationAccountAssemblyState.__new__(_IntegrationAccountAssemblyState)

        __props__.__dict__["assembly_name"] = assembly_name
        __props__.__dict__["assembly_version"] = assembly_version
        __props__.__dict__["content"] = content
        __props__.__dict__["content_link_uri"] = content_link_uri
        __props__.__dict__["integration_account_name"] = integration_account_name
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        return IntegrationAccountAssembly(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="assemblyName")
    def assembly_name(self) -> pulumi.Output[str]:
        """
        The name of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "assembly_name")

    @property
    @pulumi.getter(name="assemblyVersion")
    def assembly_version(self) -> pulumi.Output[Optional[str]]:
        """
        The version of the Logic App Integration Account Assembly. Defaults to `0.0.0.0`.
        """
        return pulumi.get(self, "assembly_version")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[Optional[str]]:
        """
        The content of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="contentLinkUri")
    def content_link_uri(self) -> pulumi.Output[Optional[str]]:
        """
        The content link URI of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "content_link_uri")

    @property
    @pulumi.getter(name="integrationAccountName")
    def integration_account_name(self) -> pulumi.Output[str]:
        """
        The name of the Logic App Integration Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "integration_account_name")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        The metadata of the Logic App Integration Account Assembly.
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Logic App Integration Account Assembly Artifact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the Resource Group where the Logic App Integration Account Assembly Artifact should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")
