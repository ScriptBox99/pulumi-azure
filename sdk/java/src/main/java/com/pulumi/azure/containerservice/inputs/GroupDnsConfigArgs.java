// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupDnsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupDnsConfigArgs Empty = new GroupDnsConfigArgs();

    /**
     * A list of nameservers the containers will search out to resolve requests.
     * 
     */
    @Import(name="nameservers", required=true)
    private Output<List<String>> nameservers;

    /**
     * @return A list of nameservers the containers will search out to resolve requests.
     * 
     */
    public Output<List<String>> nameservers() {
        return this.nameservers;
    }

    /**
     * A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<String>> options;

    /**
     * @return A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
     * 
     */
    public Optional<Output<List<String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * A list of search domains that DNS requests will search along.
     * 
     */
    @Import(name="searchDomains")
    private @Nullable Output<List<String>> searchDomains;

    /**
     * @return A list of search domains that DNS requests will search along.
     * 
     */
    public Optional<Output<List<String>>> searchDomains() {
        return Optional.ofNullable(this.searchDomains);
    }

    private GroupDnsConfigArgs() {}

    private GroupDnsConfigArgs(GroupDnsConfigArgs $) {
        this.nameservers = $.nameservers;
        this.options = $.options;
        this.searchDomains = $.searchDomains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupDnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupDnsConfigArgs $;

        public Builder() {
            $ = new GroupDnsConfigArgs();
        }

        public Builder(GroupDnsConfigArgs defaults) {
            $ = new GroupDnsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameservers A list of nameservers the containers will search out to resolve requests.
         * 
         * @return builder
         * 
         */
        public Builder nameservers(Output<List<String>> nameservers) {
            $.nameservers = nameservers;
            return this;
        }

        /**
         * @param nameservers A list of nameservers the containers will search out to resolve requests.
         * 
         * @return builder
         * 
         */
        public Builder nameservers(List<String> nameservers) {
            return nameservers(Output.of(nameservers));
        }

        /**
         * @param nameservers A list of nameservers the containers will search out to resolve requests.
         * 
         * @return builder
         * 
         */
        public Builder nameservers(String... nameservers) {
            return nameservers(List.of(nameservers));
        }

        /**
         * @param options A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<List<String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
         * 
         * @return builder
         * 
         */
        public Builder options(List<String> options) {
            return options(Output.of(options));
        }

        /**
         * @param options A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
         * 
         * @return builder
         * 
         */
        public Builder options(String... options) {
            return options(List.of(options));
        }

        /**
         * @param searchDomains A list of search domains that DNS requests will search along.
         * 
         * @return builder
         * 
         */
        public Builder searchDomains(@Nullable Output<List<String>> searchDomains) {
            $.searchDomains = searchDomains;
            return this;
        }

        /**
         * @param searchDomains A list of search domains that DNS requests will search along.
         * 
         * @return builder
         * 
         */
        public Builder searchDomains(List<String> searchDomains) {
            return searchDomains(Output.of(searchDomains));
        }

        /**
         * @param searchDomains A list of search domains that DNS requests will search along.
         * 
         * @return builder
         * 
         */
        public Builder searchDomains(String... searchDomains) {
            return searchDomains(List.of(searchDomains));
        }

        public GroupDnsConfigArgs build() {
            $.nameservers = Objects.requireNonNull($.nameservers, "expected parameter 'nameservers' to be non-null");
            return $;
        }
    }

}