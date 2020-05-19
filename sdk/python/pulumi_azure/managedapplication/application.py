# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Application(pulumi.CustomResource):
    application_definition_id: pulumi.Output[str]
    """
    The application definition ID to deploy.
    """
    kind: pulumi.Output[str]
    """
    The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
    """
    location: pulumi.Output[str]
    """
    Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
    """
    managed_resource_group_name: pulumi.Output[str]
    """
    The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
    """
    name: pulumi.Output[str]
    """
    Specifies the name of the Managed Application. Changing this forces a new resource to be created.
    """
    outputs: pulumi.Output[dict]
    """
    The name and value pairs that define the managed application outputs.
    """
    parameters: pulumi.Output[dict]
    """
    A mapping of name and value pairs to pass to the managed application as parameters.
    """
    plan: pulumi.Output[dict]
    """
    One `plan` block as defined below.

      * `name` (`str`) - Specifies the name of the plan from the marketplace.
      * `product` (`str`) - Specifies the product of the plan from the marketplace.
      * `promotionCode` (`str`) - Specifies the promotion code to use with the plan.
      * `publisher` (`str`) - Specifies the publisher of the plan.
      * `version` (`str`) - Specifies the version of the plan from the marketplace.
    """
    resource_group_name: pulumi.Output[str]
    """
    The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
    """
    tags: pulumi.Output[dict]
    """
    A mapping of tags to assign to the resource.
    """
    def __init__(__self__, resource_name, opts=None, application_definition_id=None, kind=None, location=None, managed_resource_group_name=None, name=None, parameters=None, plan=None, resource_group_name=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Manages a Managed Application.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        builtin = azure.authorization.get_role_definition(name="Contributor")
        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_definition = azure.managedapplication.Definition("exampleDefinition",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            lock_level="ReadOnly",
            package_file_uri="https://github.com/Azure/azure-managedapp-samples/raw/master/Managed Application Sample Packages/201-managed-storage-account/managedstorage.zip",
            display_name="TestManagedAppDefinition",
            description="Test Managed App Definition",
            authorization=[{
                "servicePrincipalId": current.object_id,
                "roleDefinitionId": builtin.id.split("/")[len(builtin.id.split("/")) - 1],
            }])
        example_application = azure.managedapplication.Application("exampleApplication",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            kind="ServiceCatalog",
            managed_resource_group_name="infrastructureGroup",
            application_definition_id=example_definition.id,
            parameters={
                "location": example_resource_group.location,
                "storageAccountNamePrefix": "storeNamePrefix",
                "storageAccountType": "Standard_LRS",
            })
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_definition_id: The application definition ID to deploy.
        :param pulumi.Input[str] kind: The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] managed_resource_group_name: The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        :param pulumi.Input[dict] parameters: A mapping of name and value pairs to pass to the managed application as parameters.
        :param pulumi.Input[dict] plan: One `plan` block as defined below.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.

        The **plan** object supports the following:

          * `name` (`pulumi.Input[str]`) - Specifies the name of the plan from the marketplace.
          * `product` (`pulumi.Input[str]`) - Specifies the product of the plan from the marketplace.
          * `promotionCode` (`pulumi.Input[str]`) - Specifies the promotion code to use with the plan.
          * `publisher` (`pulumi.Input[str]`) - Specifies the publisher of the plan.
          * `version` (`pulumi.Input[str]`) - Specifies the version of the plan from the marketplace.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['application_definition_id'] = application_definition_id
            if kind is None:
                raise TypeError("Missing required property 'kind'")
            __props__['kind'] = kind
            __props__['location'] = location
            if managed_resource_group_name is None:
                raise TypeError("Missing required property 'managed_resource_group_name'")
            __props__['managed_resource_group_name'] = managed_resource_group_name
            __props__['name'] = name
            __props__['parameters'] = parameters
            __props__['plan'] = plan
            if resource_group_name is None:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__['resource_group_name'] = resource_group_name
            __props__['tags'] = tags
            __props__['outputs'] = None
        super(Application, __self__).__init__(
            'azure:managedapplication/application:Application',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, application_definition_id=None, kind=None, location=None, managed_resource_group_name=None, name=None, outputs=None, parameters=None, plan=None, resource_group_name=None, tags=None):
        """
        Get an existing Application resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_definition_id: The application definition ID to deploy.
        :param pulumi.Input[str] kind: The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] managed_resource_group_name: The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        :param pulumi.Input[dict] outputs: The name and value pairs that define the managed application outputs.
        :param pulumi.Input[dict] parameters: A mapping of name and value pairs to pass to the managed application as parameters.
        :param pulumi.Input[dict] plan: One `plan` block as defined below.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.

        The **plan** object supports the following:

          * `name` (`pulumi.Input[str]`) - Specifies the name of the plan from the marketplace.
          * `product` (`pulumi.Input[str]`) - Specifies the product of the plan from the marketplace.
          * `promotionCode` (`pulumi.Input[str]`) - Specifies the promotion code to use with the plan.
          * `publisher` (`pulumi.Input[str]`) - Specifies the publisher of the plan.
          * `version` (`pulumi.Input[str]`) - Specifies the version of the plan from the marketplace.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["application_definition_id"] = application_definition_id
        __props__["kind"] = kind
        __props__["location"] = location
        __props__["managed_resource_group_name"] = managed_resource_group_name
        __props__["name"] = name
        __props__["outputs"] = outputs
        __props__["parameters"] = parameters
        __props__["plan"] = plan
        __props__["resource_group_name"] = resource_group_name
        __props__["tags"] = tags
        return Application(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
