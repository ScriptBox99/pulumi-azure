// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.TransformOutputCustomPresetCodecPngImageLayer;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransformOutputCustomPresetCodecPngImage {
    /**
     * @return The distance between two key frames. The value should be non-zero in the range `0.5` to `20` seconds, specified in ISO 8601 format. The default is `2` seconds (`PT2S`). Note that this setting is ignored if `sync_mode` is set to `Passthrough`, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    private @Nullable String keyFrameInterval;
    /**
     * @return Specifies the label for the codec. The label can be used to control muxing behavior.
     * 
     */
    private @Nullable String label;
    /**
     * @return One or more `layer` blocks as defined below.
     * 
     */
    private @Nullable List<TransformOutputCustomPresetCodecPngImageLayer> layers;
    /**
     * @return The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, `PT5M30S` to stop at `5` minutes and `30` seconds from start time), or a frame count (For example, `300` to stop at the 300th frame from the frame at start time. If this value is `1`, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, `50%` to stop at half of stream duration from start time). The default value is `100%`, which means to stop at the end of the stream.
     * 
     */
    private @Nullable String range;
    /**
     * @return The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, `PT05S` to start at 5 seconds), or a frame count (For example, `10` to start at the 10th frame), or a relative value to stream duration (For example, `10%` to start at 10% of stream duration). Also supports a macro `{Best}`, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for `step` and `range`.
     * 
     */
    private String start;
    /**
     * @return The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, `PT05S` for one image every 5 seconds), or a frame count (For example, `30` for one image every 30 frames), or a relative value to stream duration (For example, `10%` for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is `10%`, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at `1` if only one thumbnail is needed at start time.
     * 
     */
    private @Nullable String step;
    /**
     * @return The resizing mode, which indicates how the input video will be resized to fit the desired output resolution(s). Possible values are `AutoFit`, `AutoSize` or `None`. Default to `AutoSize`.
     * 
     */
    private @Nullable String stretchMode;
    /**
     * @return Specifies the synchronization mode for the video. Possible values are `Auto`, `Cfr`, `Passthrough` or `Vfr`. Default to `Auto`.
     * 
     */
    private @Nullable String syncMode;

    private TransformOutputCustomPresetCodecPngImage() {}
    /**
     * @return The distance between two key frames. The value should be non-zero in the range `0.5` to `20` seconds, specified in ISO 8601 format. The default is `2` seconds (`PT2S`). Note that this setting is ignored if `sync_mode` is set to `Passthrough`, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    public Optional<String> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }
    /**
     * @return Specifies the label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return One or more `layer` blocks as defined below.
     * 
     */
    public List<TransformOutputCustomPresetCodecPngImageLayer> layers() {
        return this.layers == null ? List.of() : this.layers;
    }
    /**
     * @return The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, `PT5M30S` to stop at `5` minutes and `30` seconds from start time), or a frame count (For example, `300` to stop at the 300th frame from the frame at start time. If this value is `1`, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, `50%` to stop at half of stream duration from start time). The default value is `100%`, which means to stop at the end of the stream.
     * 
     */
    public Optional<String> range() {
        return Optional.ofNullable(this.range);
    }
    /**
     * @return The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, `PT05S` to start at 5 seconds), or a frame count (For example, `10` to start at the 10th frame), or a relative value to stream duration (For example, `10%` to start at 10% of stream duration). Also supports a macro `{Best}`, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for `step` and `range`.
     * 
     */
    public String start() {
        return this.start;
    }
    /**
     * @return The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, `PT05S` for one image every 5 seconds), or a frame count (For example, `30` for one image every 30 frames), or a relative value to stream duration (For example, `10%` for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is `10%`, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at `1` if only one thumbnail is needed at start time.
     * 
     */
    public Optional<String> step() {
        return Optional.ofNullable(this.step);
    }
    /**
     * @return The resizing mode, which indicates how the input video will be resized to fit the desired output resolution(s). Possible values are `AutoFit`, `AutoSize` or `None`. Default to `AutoSize`.
     * 
     */
    public Optional<String> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }
    /**
     * @return Specifies the synchronization mode for the video. Possible values are `Auto`, `Cfr`, `Passthrough` or `Vfr`. Default to `Auto`.
     * 
     */
    public Optional<String> syncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputCustomPresetCodecPngImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private @Nullable List<TransformOutputCustomPresetCodecPngImageLayer> layers;
        private @Nullable String range;
        private String start;
        private @Nullable String step;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;
        public Builder() {}
        public Builder(TransformOutputCustomPresetCodecPngImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.range = defaults.range;
    	      this.start = defaults.start;
    	      this.step = defaults.step;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        @CustomType.Setter
        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder layers(@Nullable List<TransformOutputCustomPresetCodecPngImageLayer> layers) {
            this.layers = layers;
            return this;
        }
        public Builder layers(TransformOutputCustomPresetCodecPngImageLayer... layers) {
            return layers(List.of(layers));
        }
        @CustomType.Setter
        public Builder range(@Nullable String range) {
            this.range = range;
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        @CustomType.Setter
        public Builder step(@Nullable String step) {
            this.step = step;
            return this;
        }
        @CustomType.Setter
        public Builder stretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }
        @CustomType.Setter
        public Builder syncMode(@Nullable String syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public TransformOutputCustomPresetCodecPngImage build() {
            final var o = new TransformOutputCustomPresetCodecPngImage();
            o.keyFrameInterval = keyFrameInterval;
            o.label = label;
            o.layers = layers;
            o.range = range;
            o.start = start;
            o.step = step;
            o.stretchMode = stretchMode;
            o.syncMode = syncMode;
            return o;
        }
    }
}