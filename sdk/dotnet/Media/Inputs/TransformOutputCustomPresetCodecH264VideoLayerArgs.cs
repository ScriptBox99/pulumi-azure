// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputCustomPresetCodecH264VideoLayerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether adaptive B-frames are used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use. Default to `true`.
        /// </summary>
        [Input("adaptiveBFrameEnabled")]
        public Input<bool>? AdaptiveBFrameEnabled { get; set; }

        /// <summary>
        /// The number of B-frames to use when encoding this layer. If not specified, the encoder chooses an appropriate number based on the video profile and level.
        /// </summary>
        [Input("bFrames")]
        public Input<int>? BFrames { get; set; }

        /// <summary>
        /// The average bitrate in bits per second at which to encode the input video when generating this layer.
        /// </summary>
        [Input("bitrate", required: true)]
        public Input<int> Bitrate { get; set; } = null!;

        /// <summary>
        /// Specifies the maximum amount of time that the encoder should buffer frames before encoding. The value should be in ISO 8601 format. The value should be in the range `0.1` to `100` seconds. The default is `5` seconds (`PT5S`).
        /// </summary>
        [Input("bufferWindow")]
        public Input<string>? BufferWindow { get; set; }

        /// <summary>
        /// The value of CRF to be used when encoding this layer. This setting takes effect when `rate_control_mode` is set `CRF`. The range of CRF value is between `0` and `51`, where lower values would result in better quality, at the expense of higher file sizes. Higher values mean more compression, but at some point quality degradation will be noticed. Default to `28`.
        /// </summary>
        [Input("crf")]
        public Input<double>? Crf { get; set; }

        /// <summary>
        /// The entropy mode to be used for this layer. Possible values are `Cabac` or `Cavlc`. If not specified, the encoder chooses the mode that is appropriate for the profile and level.
        /// </summary>
        [Input("entropyMode")]
        public Input<string>? EntropyMode { get; set; }

        /// <summary>
        /// The frame rate (in frames per second) at which to encode this layer. The value can be in the form of `M/N` where `M` and `N` are integers (For example, `30000/1001`), or in the form of a number (For example, `30`, or `29.97`). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
        /// </summary>
        [Input("frameRate")]
        public Input<string>? FrameRate { get; set; }

        /// <summary>
        /// The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in height as the input.
        /// </summary>
        [Input("height")]
        public Input<string>? Height { get; set; }

        /// <summary>
        /// The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The H.264 levels. Currently, the resource support Level up to `6.2`. The value can be `auto`, or a number that matches the H.264 profile. If not specified, the default is `auto`, which lets the encoder choose the Level that is appropriate for this layer.
        /// </summary>
        [Input("level")]
        public Input<string>? Level { get; set; }

        /// <summary>
        /// The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
        /// </summary>
        [Input("maxBitrate")]
        public Input<int>? MaxBitrate { get; set; }

        /// <summary>
        /// The H.264 profile. Possible values are `Auto`, `Baseline`, `High`, `High422`, `High444`,or `Main`. Default to `Auto`.
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        /// <summary>
        /// The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
        /// </summary>
        [Input("referenceFrames")]
        public Input<int>? ReferenceFrames { get; set; }

        /// <summary>
        /// The number of slices to be used when encoding this layer. If not specified, default is `1`, which means that encoder will use a single slice for each frame.
        /// </summary>
        [Input("slices")]
        public Input<int>? Slices { get; set; }

        /// <summary>
        /// The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in width as the input.
        /// </summary>
        [Input("width")]
        public Input<string>? Width { get; set; }

        public TransformOutputCustomPresetCodecH264VideoLayerArgs()
        {
        }
        public static new TransformOutputCustomPresetCodecH264VideoLayerArgs Empty => new TransformOutputCustomPresetCodecH264VideoLayerArgs();
    }
}