// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePlainArgs Empty = new GetImagePlainArgs();

    /**
     * The name of the Image.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the Image.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Regex pattern of the image to match.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return Regex pattern of the image to match.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The Name of the Resource Group where this Image exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where this Image exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * By default when matching by regex, images are sorted by name in ascending order and the first match is chosen, to sort descending, set this flag.
     * 
     */
    @Import(name="sortDescending")
    private @Nullable Boolean sortDescending;

    /**
     * @return By default when matching by regex, images are sorted by name in ascending order and the first match is chosen, to sort descending, set this flag.
     * 
     */
    public Optional<Boolean> sortDescending() {
        return Optional.ofNullable(this.sortDescending);
    }

    private GetImagePlainArgs() {}

    private GetImagePlainArgs(GetImagePlainArgs $) {
        this.name = $.name;
        this.nameRegex = $.nameRegex;
        this.resourceGroupName = $.resourceGroupName;
        this.sortDescending = $.sortDescending;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePlainArgs $;

        public Builder() {
            $ = new GetImagePlainArgs();
        }

        public Builder(GetImagePlainArgs defaults) {
            $ = new GetImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Image.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param nameRegex Regex pattern of the image to match.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where this Image exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sortDescending By default when matching by regex, images are sorted by name in ascending order and the first match is chosen, to sort descending, set this flag.
         * 
         * @return builder
         * 
         */
        public Builder sortDescending(@Nullable Boolean sortDescending) {
            $.sortDescending = sortDescending;
            return this;
        }

        public GetImagePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}