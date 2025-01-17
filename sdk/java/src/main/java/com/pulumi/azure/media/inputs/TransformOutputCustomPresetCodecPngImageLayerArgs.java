// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransformOutputCustomPresetCodecPngImageLayerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransformOutputCustomPresetCodecPngImageLayerArgs Empty = new TransformOutputCustomPresetCodecPngImageLayerArgs();

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in height as the input.
     * 
     */
    @Import(name="height")
    private @Nullable Output<String> height;

    /**
     * @return The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in height as the input.
     * 
     */
    public Optional<Output<String>> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in width as the input.
     * 
     */
    @Import(name="width")
    private @Nullable Output<String> width;

    /**
     * @return The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in width as the input.
     * 
     */
    public Optional<Output<String>> width() {
        return Optional.ofNullable(this.width);
    }

    private TransformOutputCustomPresetCodecPngImageLayerArgs() {}

    private TransformOutputCustomPresetCodecPngImageLayerArgs(TransformOutputCustomPresetCodecPngImageLayerArgs $) {
        this.height = $.height;
        this.label = $.label;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransformOutputCustomPresetCodecPngImageLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransformOutputCustomPresetCodecPngImageLayerArgs $;

        public Builder() {
            $ = new TransformOutputCustomPresetCodecPngImageLayerArgs();
        }

        public Builder(TransformOutputCustomPresetCodecPngImageLayerArgs defaults) {
            $ = new TransformOutputCustomPresetCodecPngImageLayerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param height The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in height as the input.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<String> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in height as the input.
         * 
         * @return builder
         * 
         */
        public Builder height(String height) {
            return height(Output.of(height));
        }

        /**
         * @param label The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param width The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in width as the input.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable Output<String> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example `50%` means the output video has half as many pixels in width as the input.
         * 
         * @return builder
         * 
         */
        public Builder width(String width) {
            return width(Output.of(width));
        }

        public TransformOutputCustomPresetCodecPngImageLayerArgs build() {
            return $;
        }
    }

}
