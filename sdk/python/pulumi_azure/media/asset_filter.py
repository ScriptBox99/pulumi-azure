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

__all__ = ['AssetFilterArgs', 'AssetFilter']

@pulumi.input_type
class AssetFilterArgs:
    def __init__(__self__, *,
                 asset_id: pulumi.Input[str],
                 first_quality_bitrate: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 presentation_time_range: Optional[pulumi.Input['AssetFilterPresentationTimeRangeArgs']] = None,
                 track_selections: Optional[pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]]] = None):
        """
        The set of arguments for constructing a AssetFilter resource.
        :param pulumi.Input[str] asset_id: The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input[int] first_quality_bitrate: The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        :param pulumi.Input[str] name: The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input['AssetFilterPresentationTimeRangeArgs'] presentation_time_range: A `presentation_time_range` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]] track_selections: One or more `track_selection` blocks as defined below.
        """
        pulumi.set(__self__, "asset_id", asset_id)
        if first_quality_bitrate is not None:
            pulumi.set(__self__, "first_quality_bitrate", first_quality_bitrate)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if presentation_time_range is not None:
            pulumi.set(__self__, "presentation_time_range", presentation_time_range)
        if track_selections is not None:
            pulumi.set(__self__, "track_selections", track_selections)

    @property
    @pulumi.getter(name="assetId")
    def asset_id(self) -> pulumi.Input[str]:
        """
        The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        """
        return pulumi.get(self, "asset_id")

    @asset_id.setter
    def asset_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "asset_id", value)

    @property
    @pulumi.getter(name="firstQualityBitrate")
    def first_quality_bitrate(self) -> Optional[pulumi.Input[int]]:
        """
        The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        """
        return pulumi.get(self, "first_quality_bitrate")

    @first_quality_bitrate.setter
    def first_quality_bitrate(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "first_quality_bitrate", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="presentationTimeRange")
    def presentation_time_range(self) -> Optional[pulumi.Input['AssetFilterPresentationTimeRangeArgs']]:
        """
        A `presentation_time_range` block as defined below.
        """
        return pulumi.get(self, "presentation_time_range")

    @presentation_time_range.setter
    def presentation_time_range(self, value: Optional[pulumi.Input['AssetFilterPresentationTimeRangeArgs']]):
        pulumi.set(self, "presentation_time_range", value)

    @property
    @pulumi.getter(name="trackSelections")
    def track_selections(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]]]:
        """
        One or more `track_selection` blocks as defined below.
        """
        return pulumi.get(self, "track_selections")

    @track_selections.setter
    def track_selections(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]]]):
        pulumi.set(self, "track_selections", value)


@pulumi.input_type
class _AssetFilterState:
    def __init__(__self__, *,
                 asset_id: Optional[pulumi.Input[str]] = None,
                 first_quality_bitrate: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 presentation_time_range: Optional[pulumi.Input['AssetFilterPresentationTimeRangeArgs']] = None,
                 track_selections: Optional[pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]]] = None):
        """
        Input properties used for looking up and filtering AssetFilter resources.
        :param pulumi.Input[str] asset_id: The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input[int] first_quality_bitrate: The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        :param pulumi.Input[str] name: The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input['AssetFilterPresentationTimeRangeArgs'] presentation_time_range: A `presentation_time_range` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]] track_selections: One or more `track_selection` blocks as defined below.
        """
        if asset_id is not None:
            pulumi.set(__self__, "asset_id", asset_id)
        if first_quality_bitrate is not None:
            pulumi.set(__self__, "first_quality_bitrate", first_quality_bitrate)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if presentation_time_range is not None:
            pulumi.set(__self__, "presentation_time_range", presentation_time_range)
        if track_selections is not None:
            pulumi.set(__self__, "track_selections", track_selections)

    @property
    @pulumi.getter(name="assetId")
    def asset_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        """
        return pulumi.get(self, "asset_id")

    @asset_id.setter
    def asset_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "asset_id", value)

    @property
    @pulumi.getter(name="firstQualityBitrate")
    def first_quality_bitrate(self) -> Optional[pulumi.Input[int]]:
        """
        The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        """
        return pulumi.get(self, "first_quality_bitrate")

    @first_quality_bitrate.setter
    def first_quality_bitrate(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "first_quality_bitrate", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="presentationTimeRange")
    def presentation_time_range(self) -> Optional[pulumi.Input['AssetFilterPresentationTimeRangeArgs']]:
        """
        A `presentation_time_range` block as defined below.
        """
        return pulumi.get(self, "presentation_time_range")

    @presentation_time_range.setter
    def presentation_time_range(self, value: Optional[pulumi.Input['AssetFilterPresentationTimeRangeArgs']]):
        pulumi.set(self, "presentation_time_range", value)

    @property
    @pulumi.getter(name="trackSelections")
    def track_selections(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]]]:
        """
        One or more `track_selection` blocks as defined below.
        """
        return pulumi.get(self, "track_selections")

    @track_selections.setter
    def track_selections(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AssetFilterTrackSelectionArgs']]]]):
        pulumi.set(self, "track_selections", value)


class AssetFilter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 asset_id: Optional[pulumi.Input[str]] = None,
                 first_quality_bitrate: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 presentation_time_range: Optional[pulumi.Input[pulumi.InputType['AssetFilterPresentationTimeRangeArgs']]] = None,
                 track_selections: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssetFilterTrackSelectionArgs']]]]] = None,
                 __props__=None):
        """
        Manages an Azure Media Asset Filter.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="GRS")
        example_service_account = azure.media.ServiceAccount("exampleServiceAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_accounts=[azure.media.ServiceAccountStorageAccountArgs(
                id=example_account.id,
                is_primary=True,
            )])
        example_asset = azure.media.Asset("exampleAsset",
            resource_group_name=example_resource_group.name,
            media_services_account_name=example_service_account.name,
            description="Asset description")
        example_asset_filter = azure.media.AssetFilter("exampleAssetFilter",
            asset_id=example_asset.id,
            first_quality_bitrate=128000,
            presentation_time_range=azure.media.AssetFilterPresentationTimeRangeArgs(
                start_in_units=0,
                end_in_units=15,
                presentation_window_in_units=90,
                live_backoff_in_units=0,
                unit_timescale_in_miliseconds=1000,
                force_end=False,
            ),
            track_selections=[
                azure.media.AssetFilterTrackSelectionArgs(
                    conditions=[
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Type",
                            operation="Equal",
                            value="Audio",
                        ),
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Language",
                            operation="NotEqual",
                            value="en",
                        ),
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="FourCC",
                            operation="NotEqual",
                            value="EC-3",
                        ),
                    ],
                ),
                azure.media.AssetFilterTrackSelectionArgs(
                    conditions=[
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Type",
                            operation="Equal",
                            value="Video",
                        ),
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Bitrate",
                            operation="Equal",
                            value="3000000-5000000",
                        ),
                    ],
                ),
            ])
        ```

        ## Import

        Asset Filters can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:media/assetFilter:AssetFilter example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Media/mediaServices/account1/assets/asset1/assetFilters/filter1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] asset_id: The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input[int] first_quality_bitrate: The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        :param pulumi.Input[str] name: The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input[pulumi.InputType['AssetFilterPresentationTimeRangeArgs']] presentation_time_range: A `presentation_time_range` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssetFilterTrackSelectionArgs']]]] track_selections: One or more `track_selection` blocks as defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AssetFilterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure Media Asset Filter.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="GRS")
        example_service_account = azure.media.ServiceAccount("exampleServiceAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_accounts=[azure.media.ServiceAccountStorageAccountArgs(
                id=example_account.id,
                is_primary=True,
            )])
        example_asset = azure.media.Asset("exampleAsset",
            resource_group_name=example_resource_group.name,
            media_services_account_name=example_service_account.name,
            description="Asset description")
        example_asset_filter = azure.media.AssetFilter("exampleAssetFilter",
            asset_id=example_asset.id,
            first_quality_bitrate=128000,
            presentation_time_range=azure.media.AssetFilterPresentationTimeRangeArgs(
                start_in_units=0,
                end_in_units=15,
                presentation_window_in_units=90,
                live_backoff_in_units=0,
                unit_timescale_in_miliseconds=1000,
                force_end=False,
            ),
            track_selections=[
                azure.media.AssetFilterTrackSelectionArgs(
                    conditions=[
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Type",
                            operation="Equal",
                            value="Audio",
                        ),
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Language",
                            operation="NotEqual",
                            value="en",
                        ),
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="FourCC",
                            operation="NotEqual",
                            value="EC-3",
                        ),
                    ],
                ),
                azure.media.AssetFilterTrackSelectionArgs(
                    conditions=[
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Type",
                            operation="Equal",
                            value="Video",
                        ),
                        azure.media.AssetFilterTrackSelectionConditionArgs(
                            property="Bitrate",
                            operation="Equal",
                            value="3000000-5000000",
                        ),
                    ],
                ),
            ])
        ```

        ## Import

        Asset Filters can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:media/assetFilter:AssetFilter example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Media/mediaServices/account1/assets/asset1/assetFilters/filter1
        ```

        :param str resource_name: The name of the resource.
        :param AssetFilterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AssetFilterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 asset_id: Optional[pulumi.Input[str]] = None,
                 first_quality_bitrate: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 presentation_time_range: Optional[pulumi.Input[pulumi.InputType['AssetFilterPresentationTimeRangeArgs']]] = None,
                 track_selections: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssetFilterTrackSelectionArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AssetFilterArgs.__new__(AssetFilterArgs)

            if asset_id is None and not opts.urn:
                raise TypeError("Missing required property 'asset_id'")
            __props__.__dict__["asset_id"] = asset_id
            __props__.__dict__["first_quality_bitrate"] = first_quality_bitrate
            __props__.__dict__["name"] = name
            __props__.__dict__["presentation_time_range"] = presentation_time_range
            __props__.__dict__["track_selections"] = track_selections
        super(AssetFilter, __self__).__init__(
            'azure:media/assetFilter:AssetFilter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            asset_id: Optional[pulumi.Input[str]] = None,
            first_quality_bitrate: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            presentation_time_range: Optional[pulumi.Input[pulumi.InputType['AssetFilterPresentationTimeRangeArgs']]] = None,
            track_selections: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssetFilterTrackSelectionArgs']]]]] = None) -> 'AssetFilter':
        """
        Get an existing AssetFilter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] asset_id: The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input[int] first_quality_bitrate: The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        :param pulumi.Input[str] name: The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        :param pulumi.Input[pulumi.InputType['AssetFilterPresentationTimeRangeArgs']] presentation_time_range: A `presentation_time_range` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssetFilterTrackSelectionArgs']]]] track_selections: One or more `track_selection` blocks as defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AssetFilterState.__new__(_AssetFilterState)

        __props__.__dict__["asset_id"] = asset_id
        __props__.__dict__["first_quality_bitrate"] = first_quality_bitrate
        __props__.__dict__["name"] = name
        __props__.__dict__["presentation_time_range"] = presentation_time_range
        __props__.__dict__["track_selections"] = track_selections
        return AssetFilter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="assetId")
    def asset_id(self) -> pulumi.Output[str]:
        """
        The Asset ID for which the Asset Filter should be created. Changing this forces a new Asset Filter to be created.
        """
        return pulumi.get(self, "asset_id")

    @property
    @pulumi.getter(name="firstQualityBitrate")
    def first_quality_bitrate(self) -> pulumi.Output[Optional[int]]:
        """
        The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        """
        return pulumi.get(self, "first_quality_bitrate")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Asset Filter. Changing this forces a new Asset Filter to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="presentationTimeRange")
    def presentation_time_range(self) -> pulumi.Output[Optional['outputs.AssetFilterPresentationTimeRange']]:
        """
        A `presentation_time_range` block as defined below.
        """
        return pulumi.get(self, "presentation_time_range")

    @property
    @pulumi.getter(name="trackSelections")
    def track_selections(self) -> pulumi.Output[Optional[Sequence['outputs.AssetFilterTrackSelection']]]:
        """
        One or more `track_selection` blocks as defined below.
        """
        return pulumi.get(self, "track_selections")

