// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventEncoding {
    /**
     * @return Use an `ISO 8601` time value between 0.5 to 20 seconds to specify the output fragment length for the video and audio tracks of an encoding live event. For example, use `PT2S` to indicate 2 seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures). If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value cannot be set for pass-through live events.
     * 
     */
    private final @Nullable String keyFrameInterval;
    /**
     * @return The optional encoding preset name, used when `type` is not `None`. If the `type` is set to `Standard`, then the default preset name is `Default720p`. Else if the `type` is set to `Premium1080p`, the default preset is `Default1080p`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String presetName;
    /**
     * @return Specifies how the input video will be resized to fit the desired output resolution(s). Allowed values are `None`, `AutoFit` or `AutoSize`. Default is `None`.
     * 
     */
    private final @Nullable String stretchMode;
    /**
     * @return Live event type. Allowed values are `None`, `Premium1080p` or `Standard`. When set to `None`, the service simply passes through the incoming video and audio layer(s) to the output. When `type` is set to `Standard` or `Premium1080p`, a live encoder transcodes the incoming stream into multiple bitrates or layers. Defaults to `None`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private LiveEventEncoding(
        @CustomType.Parameter("keyFrameInterval") @Nullable String keyFrameInterval,
        @CustomType.Parameter("presetName") @Nullable String presetName,
        @CustomType.Parameter("stretchMode") @Nullable String stretchMode,
        @CustomType.Parameter("type") @Nullable String type) {
        this.keyFrameInterval = keyFrameInterval;
        this.presetName = presetName;
        this.stretchMode = stretchMode;
        this.type = type;
    }

    /**
     * @return Use an `ISO 8601` time value between 0.5 to 20 seconds to specify the output fragment length for the video and audio tracks of an encoding live event. For example, use `PT2S` to indicate 2 seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures). If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value cannot be set for pass-through live events.
     * 
     */
    public Optional<String> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }
    /**
     * @return The optional encoding preset name, used when `type` is not `None`. If the `type` is set to `Standard`, then the default preset name is `Default720p`. Else if the `type` is set to `Premium1080p`, the default preset is `Default1080p`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> presetName() {
        return Optional.ofNullable(this.presetName);
    }
    /**
     * @return Specifies how the input video will be resized to fit the desired output resolution(s). Allowed values are `None`, `AutoFit` or `AutoSize`. Default is `None`.
     * 
     */
    public Optional<String> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }
    /**
     * @return Live event type. Allowed values are `None`, `Premium1080p` or `Standard`. When set to `None`, the service simply passes through the incoming video and audio layer(s) to the output. When `type` is set to `Standard` or `Premium1080p`, a live encoder transcodes the incoming stream into multiple bitrates or layers. Defaults to `None`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventEncoding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String presetName;
        private @Nullable String stretchMode;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventEncoding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.presetName = defaults.presetName;
    	      this.stretchMode = defaults.stretchMode;
    	      this.type = defaults.type;
        }

        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        public Builder presetName(@Nullable String presetName) {
            this.presetName = presetName;
            return this;
        }
        public Builder stretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public LiveEventEncoding build() {
            return new LiveEventEncoding(keyFrameInterval, presetName, stretchMode, type);
        }
    }
}