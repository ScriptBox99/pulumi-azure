# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'AccountCostManagementExportExportDataOptionsArgs',
    'AccountCostManagementExportExportDataStorageLocationArgs',
]

@pulumi.input_type
class AccountCostManagementExportExportDataOptionsArgs:
    def __init__(__self__, *,
                 time_frame: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] time_frame: The time frame for pulling data for the query. If custom, then a specific time period must be provided. Possible values include: `WeekToDate`, `MonthToDate`, `BillingMonthToDate`, `TheLastWeek`, `TheLastMonth`, `TheLastBillingMonth`, `Custom`.
        :param pulumi.Input[str] type: The type of the query. Possible values are `ActualCost`, `AmortizedCost` and `Usage`.
        """
        pulumi.set(__self__, "time_frame", time_frame)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> pulumi.Input[str]:
        """
        The time frame for pulling data for the query. If custom, then a specific time period must be provided. Possible values include: `WeekToDate`, `MonthToDate`, `BillingMonthToDate`, `TheLastWeek`, `TheLastMonth`, `TheLastBillingMonth`, `Custom`.
        """
        return pulumi.get(self, "time_frame")

    @time_frame.setter
    def time_frame(self, value: pulumi.Input[str]):
        pulumi.set(self, "time_frame", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the query. Possible values are `ActualCost`, `AmortizedCost` and `Usage`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class AccountCostManagementExportExportDataStorageLocationArgs:
    def __init__(__self__, *,
                 container_id: pulumi.Input[str],
                 root_folder_path: pulumi.Input[str]):
        """
        :param pulumi.Input[str] container_id: The Resource Manager ID of the container where exports will be uploaded. Changing this forces a new resource to be created.
        :param pulumi.Input[str] root_folder_path: The path of the directory where exports will be uploaded. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "container_id", container_id)
        pulumi.set(__self__, "root_folder_path", root_folder_path)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> pulumi.Input[str]:
        """
        The Resource Manager ID of the container where exports will be uploaded. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter(name="rootFolderPath")
    def root_folder_path(self) -> pulumi.Input[str]:
        """
        The path of the directory where exports will be uploaded. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "root_folder_path")

    @root_folder_path.setter
    def root_folder_path(self, value: pulumi.Input[str]):
        pulumi.set(self, "root_folder_path", value)

