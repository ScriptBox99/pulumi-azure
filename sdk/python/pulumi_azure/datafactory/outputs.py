# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'DatasetAzureBlobSchemaColumn',
    'DatasetCosmosDBApiSchemaColumn',
    'DatasetDelimitedTextAzureBlobStorageLocation',
    'DatasetDelimitedTextHttpServerLocation',
    'DatasetDelimitedTextSchemaColumn',
    'DatasetHttpSchemaColumn',
    'DatasetJsonAzureBlobStorageLocation',
    'DatasetJsonHttpServerLocation',
    'DatasetJsonSchemaColumn',
    'DatasetMysqlSchemaColumn',
    'DatasetPostgresqlSchemaColumn',
    'DatasetSqlServerTableSchemaColumn',
    'FactoryGithubConfiguration',
    'FactoryIdentity',
    'FactoryVstsConfiguration',
    'IntegrationRuntimeManagedCatalogInfo',
    'IntegrationRuntimeManagedCustomSetupScript',
    'IntegrationRuntimeManagedVnetIntegration',
    'IntegrationRuntimeSelfHostedRbacAuthorization',
    'GetFactoryGithubConfigurationResult',
    'GetFactoryIdentityResult',
    'GetFactoryVstsConfigurationResult',
]

@pulumi.output_type
class DatasetAzureBlobSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetCosmosDBApiSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetDelimitedTextAzureBlobStorageLocation(dict):
    def __init__(__self__, *,
                 container: str,
                 filename: str,
                 path: str):
        """
        :param str container: The container on the Azure Blob Storage Account hosting the file.
        :param str filename: The filename of the file on the web server.
        :param str path: The folder path to the file on the web server.
        """
        pulumi.set(__self__, "container", container)
        pulumi.set(__self__, "filename", filename)
        pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def container(self) -> str:
        """
        The container on the Azure Blob Storage Account hosting the file.
        """
        return pulumi.get(self, "container")

    @property
    @pulumi.getter
    def filename(self) -> str:
        """
        The filename of the file on the web server.
        """
        return pulumi.get(self, "filename")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The folder path to the file on the web server.
        """
        return pulumi.get(self, "path")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetDelimitedTextHttpServerLocation(dict):
    def __init__(__self__, *,
                 filename: str,
                 path: str,
                 relative_url: str):
        """
        :param str filename: The filename of the file on the web server.
        :param str path: The folder path to the file on the web server.
        :param str relative_url: The base URL to the web server hosting the file.
        """
        pulumi.set(__self__, "filename", filename)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "relative_url", relative_url)

    @property
    @pulumi.getter
    def filename(self) -> str:
        """
        The filename of the file on the web server.
        """
        return pulumi.get(self, "filename")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The folder path to the file on the web server.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="relativeUrl")
    def relative_url(self) -> str:
        """
        The base URL to the web server hosting the file.
        """
        return pulumi.get(self, "relative_url")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetDelimitedTextSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetHttpSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetJsonAzureBlobStorageLocation(dict):
    def __init__(__self__, *,
                 container: str,
                 filename: str,
                 path: str):
        """
        :param str container: The container on the Azure Blob Storage Account hosting the file.
        :param str filename: The filename of the file on the web server.
        :param str path: The folder path to the file on the web server.
        """
        pulumi.set(__self__, "container", container)
        pulumi.set(__self__, "filename", filename)
        pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def container(self) -> str:
        """
        The container on the Azure Blob Storage Account hosting the file.
        """
        return pulumi.get(self, "container")

    @property
    @pulumi.getter
    def filename(self) -> str:
        """
        The filename of the file on the web server.
        """
        return pulumi.get(self, "filename")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The folder path to the file on the web server.
        """
        return pulumi.get(self, "path")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetJsonHttpServerLocation(dict):
    def __init__(__self__, *,
                 filename: str,
                 path: str,
                 relative_url: str):
        """
        :param str filename: The filename of the file on the web server.
        :param str path: The folder path to the file on the web server.
        :param str relative_url: The base URL to the web server hosting the file.
        """
        pulumi.set(__self__, "filename", filename)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "relative_url", relative_url)

    @property
    @pulumi.getter
    def filename(self) -> str:
        """
        The filename of the file on the web server.
        """
        return pulumi.get(self, "filename")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The folder path to the file on the web server.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="relativeUrl")
    def relative_url(self) -> str:
        """
        The base URL to the web server hosting the file.
        """
        return pulumi.get(self, "relative_url")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetJsonSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetMysqlSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetPostgresqlSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DatasetSqlServerTableSchemaColumn(dict):
    def __init__(__self__, *,
                 name: str,
                 description: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name of the column.
        :param str description: The description of the column.
        :param str type: Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the column.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the column. Valid values are `Byte`, `Byte[]`, `Boolean`, `Date`, `DateTime`,`DateTimeOffset`, `Decimal`, `Double`, `Guid`, `Int16`, `Int32`, `Int64`, `Single`, `String`, `TimeSpan`. Please note these values are case sensitive.
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class FactoryGithubConfiguration(dict):
    def __init__(__self__, *,
                 account_name: str,
                 branch_name: str,
                 git_url: str,
                 repository_name: str,
                 root_folder: str):
        """
        :param str account_name: Specifies the GitHub account name.
        :param str branch_name: Specifies the branch of the repository to get code from.
        :param str git_url: Specifies the GitHub Enterprise host name. For example: https://github.mydomain.com. Use https://github.com for open source repositories.
        :param str repository_name: Specifies the name of the git repository.
        :param str root_folder: Specifies the root folder within the repository. Set to `/` for the top level.
        """
        pulumi.set(__self__, "account_name", account_name)
        pulumi.set(__self__, "branch_name", branch_name)
        pulumi.set(__self__, "git_url", git_url)
        pulumi.set(__self__, "repository_name", repository_name)
        pulumi.set(__self__, "root_folder", root_folder)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        Specifies the GitHub account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> str:
        """
        Specifies the branch of the repository to get code from.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter(name="gitUrl")
    def git_url(self) -> str:
        """
        Specifies the GitHub Enterprise host name. For example: https://github.mydomain.com. Use https://github.com for open source repositories.
        """
        return pulumi.get(self, "git_url")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> str:
        """
        Specifies the name of the git repository.
        """
        return pulumi.get(self, "repository_name")

    @property
    @pulumi.getter(name="rootFolder")
    def root_folder(self) -> str:
        """
        Specifies the root folder within the repository. Set to `/` for the top level.
        """
        return pulumi.get(self, "root_folder")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class FactoryIdentity(dict):
    def __init__(__self__, *,
                 type: str,
                 principal_id: Optional[str] = None,
                 tenant_id: Optional[str] = None):
        """
        :param str type: Specifies the identity type of the Data Factory. At this time the only allowed value is `SystemAssigned`.
        :param str principal_id: The ID of the Principal (Client) in Azure Active Directory
        :param str tenant_id: Specifies the Tenant ID associated with the VSTS account.
        """
        pulumi.set(__self__, "type", type)
        if principal_id is not None:
            pulumi.set(__self__, "principal_id", principal_id)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Specifies the identity type of the Data Factory. At this time the only allowed value is `SystemAssigned`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[str]:
        """
        The ID of the Principal (Client) in Azure Active Directory
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[str]:
        """
        Specifies the Tenant ID associated with the VSTS account.
        """
        return pulumi.get(self, "tenant_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class FactoryVstsConfiguration(dict):
    def __init__(__self__, *,
                 account_name: str,
                 branch_name: str,
                 project_name: str,
                 repository_name: str,
                 root_folder: str,
                 tenant_id: str):
        """
        :param str account_name: Specifies the VSTS account name.
        :param str branch_name: Specifies the branch of the repository to get code from.
        :param str project_name: Specifies the name of the VSTS project.
        :param str repository_name: Specifies the name of the git repository.
        :param str root_folder: Specifies the root folder within the repository. Set to `/` for the top level.
        :param str tenant_id: Specifies the Tenant ID associated with the VSTS account.
        """
        pulumi.set(__self__, "account_name", account_name)
        pulumi.set(__self__, "branch_name", branch_name)
        pulumi.set(__self__, "project_name", project_name)
        pulumi.set(__self__, "repository_name", repository_name)
        pulumi.set(__self__, "root_folder", root_folder)
        pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        Specifies the VSTS account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> str:
        """
        Specifies the branch of the repository to get code from.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> str:
        """
        Specifies the name of the VSTS project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> str:
        """
        Specifies the name of the git repository.
        """
        return pulumi.get(self, "repository_name")

    @property
    @pulumi.getter(name="rootFolder")
    def root_folder(self) -> str:
        """
        Specifies the root folder within the repository. Set to `/` for the top level.
        """
        return pulumi.get(self, "root_folder")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        Specifies the Tenant ID associated with the VSTS account.
        """
        return pulumi.get(self, "tenant_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class IntegrationRuntimeManagedCatalogInfo(dict):
    def __init__(__self__, *,
                 administrator_login: str,
                 administrator_password: str,
                 server_endpoint: str,
                 pricing_tier: Optional[str] = None):
        """
        :param str administrator_login: Administrator login name for the SQL Server.
        :param str administrator_password: Administrator login password for the SQL Server.
        :param str server_endpoint: The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
        :param str pricing_tier: Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `Standard`, `Premium` and `PremiumRS`.
        """
        pulumi.set(__self__, "administrator_login", administrator_login)
        pulumi.set(__self__, "administrator_password", administrator_password)
        pulumi.set(__self__, "server_endpoint", server_endpoint)
        if pricing_tier is not None:
            pulumi.set(__self__, "pricing_tier", pricing_tier)

    @property
    @pulumi.getter(name="administratorLogin")
    def administrator_login(self) -> str:
        """
        Administrator login name for the SQL Server.
        """
        return pulumi.get(self, "administrator_login")

    @property
    @pulumi.getter(name="administratorPassword")
    def administrator_password(self) -> str:
        """
        Administrator login password for the SQL Server.
        """
        return pulumi.get(self, "administrator_password")

    @property
    @pulumi.getter(name="serverEndpoint")
    def server_endpoint(self) -> str:
        """
        The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
        """
        return pulumi.get(self, "server_endpoint")

    @property
    @pulumi.getter(name="pricingTier")
    def pricing_tier(self) -> Optional[str]:
        """
        Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `Standard`, `Premium` and `PremiumRS`.
        """
        return pulumi.get(self, "pricing_tier")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class IntegrationRuntimeManagedCustomSetupScript(dict):
    def __init__(__self__, *,
                 blob_container_uri: str,
                 sas_token: str):
        """
        :param str blob_container_uri: The blob endpoint for the container which contains a custom setup script that will be run on every node on startup. See [https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
        :param str sas_token: A container SAS token that gives access to the files. See [https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
        """
        pulumi.set(__self__, "blob_container_uri", blob_container_uri)
        pulumi.set(__self__, "sas_token", sas_token)

    @property
    @pulumi.getter(name="blobContainerUri")
    def blob_container_uri(self) -> str:
        """
        The blob endpoint for the container which contains a custom setup script that will be run on every node on startup. See [https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
        """
        return pulumi.get(self, "blob_container_uri")

    @property
    @pulumi.getter(name="sasToken")
    def sas_token(self) -> str:
        """
        A container SAS token that gives access to the files. See [https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/en-us/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
        """
        return pulumi.get(self, "sas_token")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class IntegrationRuntimeManagedVnetIntegration(dict):
    def __init__(__self__, *,
                 subnet_name: str,
                 vnet_id: str):
        """
        :param str subnet_name: Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
        :param str vnet_id: ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
        """
        pulumi.set(__self__, "subnet_name", subnet_name)
        pulumi.set(__self__, "vnet_id", vnet_id)

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> str:
        """
        Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
        """
        return pulumi.get(self, "subnet_name")

    @property
    @pulumi.getter(name="vnetId")
    def vnet_id(self) -> str:
        """
        ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
        """
        return pulumi.get(self, "vnet_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class IntegrationRuntimeSelfHostedRbacAuthorization(dict):
    def __init__(__self__, *,
                 resource_id: str):
        """
        :param str resource_id: The resource identifier of the integration runtime to be shared. Changing this forces a new Data Factory to be created.
        """
        pulumi.set(__self__, "resource_id", resource_id)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> str:
        """
        The resource identifier of the integration runtime to be shared. Changing this forces a new Data Factory to be created.
        """
        return pulumi.get(self, "resource_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetFactoryGithubConfigurationResult(dict):
    def __init__(__self__, *,
                 account_name: str,
                 branch_name: str,
                 git_url: str,
                 repository_name: str,
                 root_folder: str):
        """
        :param str account_name: The VSTS account name.
        :param str branch_name: The branch of the repository to get code from.
        :param str git_url: The GitHub Enterprise host name.
        :param str repository_name: The name of the git repository.
        :param str root_folder: The root folder within the repository.
        """
        pulumi.set(__self__, "account_name", account_name)
        pulumi.set(__self__, "branch_name", branch_name)
        pulumi.set(__self__, "git_url", git_url)
        pulumi.set(__self__, "repository_name", repository_name)
        pulumi.set(__self__, "root_folder", root_folder)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        The VSTS account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> str:
        """
        The branch of the repository to get code from.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter(name="gitUrl")
    def git_url(self) -> str:
        """
        The GitHub Enterprise host name.
        """
        return pulumi.get(self, "git_url")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> str:
        """
        The name of the git repository.
        """
        return pulumi.get(self, "repository_name")

    @property
    @pulumi.getter(name="rootFolder")
    def root_folder(self) -> str:
        """
        The root folder within the repository.
        """
        return pulumi.get(self, "root_folder")


@pulumi.output_type
class GetFactoryIdentityResult(dict):
    def __init__(__self__, *,
                 principal_id: str,
                 tenant_id: str,
                 type: str):
        """
        :param str principal_id: The ID of the Principal (Client) in Azure Active Directory.
        :param str tenant_id: The Tenant ID associated with the VSTS account.
        :param str type: The identity type of the Data Factory.
        """
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> str:
        """
        The ID of the Principal (Client) in Azure Active Directory.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        The Tenant ID associated with the VSTS account.
        """
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The identity type of the Data Factory.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetFactoryVstsConfigurationResult(dict):
    def __init__(__self__, *,
                 account_name: str,
                 branch_name: str,
                 project_name: str,
                 repository_name: str,
                 root_folder: str,
                 tenant_id: str):
        """
        :param str account_name: The VSTS account name.
        :param str branch_name: The branch of the repository to get code from.
        :param str project_name: The name of the VSTS project.
        :param str repository_name: The name of the git repository.
        :param str root_folder: The root folder within the repository.
        :param str tenant_id: The Tenant ID associated with the VSTS account.
        """
        pulumi.set(__self__, "account_name", account_name)
        pulumi.set(__self__, "branch_name", branch_name)
        pulumi.set(__self__, "project_name", project_name)
        pulumi.set(__self__, "repository_name", repository_name)
        pulumi.set(__self__, "root_folder", root_folder)
        pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        The VSTS account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> str:
        """
        The branch of the repository to get code from.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> str:
        """
        The name of the VSTS project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> str:
        """
        The name of the git repository.
        """
        return pulumi.get(self, "repository_name")

    @property
    @pulumi.getter(name="rootFolder")
    def root_folder(self) -> str:
        """
        The root folder within the repository.
        """
        return pulumi.get(self, "root_folder")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        The Tenant ID associated with the VSTS account.
        """
        return pulumi.get(self, "tenant_id")

