// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxFunctionAppSlotSiteConfigApplicationStackArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxFunctionAppSlotSiteConfigApplicationStackArgs Empty = new LinuxFunctionAppSlotSiteConfigApplicationStackArgs();

    /**
     * a `docker` block as detailed below.
     * 
     */
    @Import(name="dockers")
    private @Nullable Output<List<LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs>> dockers;

    /**
     * @return a `docker` block as detailed below.
     * 
     */
    public Optional<Output<List<LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs>>> dockers() {
        return Optional.ofNullable(this.dockers);
    }

    /**
     * The version of .Net. Possible values are `3.1` and `6.0`.
     * 
     */
    @Import(name="dotnetVersion")
    private @Nullable Output<String> dotnetVersion;

    /**
     * @return The version of .Net. Possible values are `3.1` and `6.0`.
     * 
     */
    public Optional<Output<String>> dotnetVersion() {
        return Optional.ofNullable(this.dotnetVersion);
    }

    /**
     * The version of Java to use. Possible values are `8`, and `11`.
     * 
     */
    @Import(name="javaVersion")
    private @Nullable Output<String> javaVersion;

    /**
     * @return The version of Java to use. Possible values are `8`, and `11`.
     * 
     */
    public Optional<Output<String>> javaVersion() {
        return Optional.ofNullable(this.javaVersion);
    }

    /**
     * The version of Node to use. Possible values include `12`, and `14`
     * 
     */
    @Import(name="nodeVersion")
    private @Nullable Output<String> nodeVersion;

    /**
     * @return The version of Node to use. Possible values include `12`, and `14`
     * 
     */
    public Optional<Output<String>> nodeVersion() {
        return Optional.ofNullable(this.nodeVersion);
    }

    /**
     * The version of PowerShell Core to use. Possibles values are `7` , and `7.2`.
     * 
     */
    @Import(name="powershellCoreVersion")
    private @Nullable Output<String> powershellCoreVersion;

    /**
     * @return The version of PowerShell Core to use. Possibles values are `7` , and `7.2`.
     * 
     */
    public Optional<Output<String>> powershellCoreVersion() {
        return Optional.ofNullable(this.powershellCoreVersion);
    }

    /**
     * The version of Python to use. Possible values include `3.9`, `3.8`, and `3.7`.
     * 
     */
    @Import(name="pythonVersion")
    private @Nullable Output<String> pythonVersion;

    /**
     * @return The version of Python to use. Possible values include `3.9`, `3.8`, and `3.7`.
     * 
     */
    public Optional<Output<String>> pythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }

    /**
     * Should the Linux Function App use a custom runtime?
     * 
     */
    @Import(name="useCustomRuntime")
    private @Nullable Output<Boolean> useCustomRuntime;

    /**
     * @return Should the Linux Function App use a custom runtime?
     * 
     */
    public Optional<Output<Boolean>> useCustomRuntime() {
        return Optional.ofNullable(this.useCustomRuntime);
    }

    /**
     * Should the DotNet process use an isolated runtime. Defaults to `false`.
     * 
     */
    @Import(name="useDotnetIsolatedRuntime")
    private @Nullable Output<Boolean> useDotnetIsolatedRuntime;

    /**
     * @return Should the DotNet process use an isolated runtime. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> useDotnetIsolatedRuntime() {
        return Optional.ofNullable(this.useDotnetIsolatedRuntime);
    }

    private LinuxFunctionAppSlotSiteConfigApplicationStackArgs() {}

    private LinuxFunctionAppSlotSiteConfigApplicationStackArgs(LinuxFunctionAppSlotSiteConfigApplicationStackArgs $) {
        this.dockers = $.dockers;
        this.dotnetVersion = $.dotnetVersion;
        this.javaVersion = $.javaVersion;
        this.nodeVersion = $.nodeVersion;
        this.powershellCoreVersion = $.powershellCoreVersion;
        this.pythonVersion = $.pythonVersion;
        this.useCustomRuntime = $.useCustomRuntime;
        this.useDotnetIsolatedRuntime = $.useDotnetIsolatedRuntime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxFunctionAppSlotSiteConfigApplicationStackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxFunctionAppSlotSiteConfigApplicationStackArgs $;

        public Builder() {
            $ = new LinuxFunctionAppSlotSiteConfigApplicationStackArgs();
        }

        public Builder(LinuxFunctionAppSlotSiteConfigApplicationStackArgs defaults) {
            $ = new LinuxFunctionAppSlotSiteConfigApplicationStackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dockers a `docker` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder dockers(@Nullable Output<List<LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs>> dockers) {
            $.dockers = dockers;
            return this;
        }

        /**
         * @param dockers a `docker` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder dockers(List<LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs> dockers) {
            return dockers(Output.of(dockers));
        }

        /**
         * @param dockers a `docker` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder dockers(LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs... dockers) {
            return dockers(List.of(dockers));
        }

        /**
         * @param dotnetVersion The version of .Net. Possible values are `3.1` and `6.0`.
         * 
         * @return builder
         * 
         */
        public Builder dotnetVersion(@Nullable Output<String> dotnetVersion) {
            $.dotnetVersion = dotnetVersion;
            return this;
        }

        /**
         * @param dotnetVersion The version of .Net. Possible values are `3.1` and `6.0`.
         * 
         * @return builder
         * 
         */
        public Builder dotnetVersion(String dotnetVersion) {
            return dotnetVersion(Output.of(dotnetVersion));
        }

        /**
         * @param javaVersion The version of Java to use. Possible values are `8`, and `11`.
         * 
         * @return builder
         * 
         */
        public Builder javaVersion(@Nullable Output<String> javaVersion) {
            $.javaVersion = javaVersion;
            return this;
        }

        /**
         * @param javaVersion The version of Java to use. Possible values are `8`, and `11`.
         * 
         * @return builder
         * 
         */
        public Builder javaVersion(String javaVersion) {
            return javaVersion(Output.of(javaVersion));
        }

        /**
         * @param nodeVersion The version of Node to use. Possible values include `12`, and `14`
         * 
         * @return builder
         * 
         */
        public Builder nodeVersion(@Nullable Output<String> nodeVersion) {
            $.nodeVersion = nodeVersion;
            return this;
        }

        /**
         * @param nodeVersion The version of Node to use. Possible values include `12`, and `14`
         * 
         * @return builder
         * 
         */
        public Builder nodeVersion(String nodeVersion) {
            return nodeVersion(Output.of(nodeVersion));
        }

        /**
         * @param powershellCoreVersion The version of PowerShell Core to use. Possibles values are `7` , and `7.2`.
         * 
         * @return builder
         * 
         */
        public Builder powershellCoreVersion(@Nullable Output<String> powershellCoreVersion) {
            $.powershellCoreVersion = powershellCoreVersion;
            return this;
        }

        /**
         * @param powershellCoreVersion The version of PowerShell Core to use. Possibles values are `7` , and `7.2`.
         * 
         * @return builder
         * 
         */
        public Builder powershellCoreVersion(String powershellCoreVersion) {
            return powershellCoreVersion(Output.of(powershellCoreVersion));
        }

        /**
         * @param pythonVersion The version of Python to use. Possible values include `3.9`, `3.8`, and `3.7`.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            $.pythonVersion = pythonVersion;
            return this;
        }

        /**
         * @param pythonVersion The version of Python to use. Possible values include `3.9`, `3.8`, and `3.7`.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(String pythonVersion) {
            return pythonVersion(Output.of(pythonVersion));
        }

        /**
         * @param useCustomRuntime Should the Linux Function App use a custom runtime?
         * 
         * @return builder
         * 
         */
        public Builder useCustomRuntime(@Nullable Output<Boolean> useCustomRuntime) {
            $.useCustomRuntime = useCustomRuntime;
            return this;
        }

        /**
         * @param useCustomRuntime Should the Linux Function App use a custom runtime?
         * 
         * @return builder
         * 
         */
        public Builder useCustomRuntime(Boolean useCustomRuntime) {
            return useCustomRuntime(Output.of(useCustomRuntime));
        }

        /**
         * @param useDotnetIsolatedRuntime Should the DotNet process use an isolated runtime. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder useDotnetIsolatedRuntime(@Nullable Output<Boolean> useDotnetIsolatedRuntime) {
            $.useDotnetIsolatedRuntime = useDotnetIsolatedRuntime;
            return this;
        }

        /**
         * @param useDotnetIsolatedRuntime Should the DotNet process use an isolated runtime. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder useDotnetIsolatedRuntime(Boolean useDotnetIsolatedRuntime) {
            return useDotnetIsolatedRuntime(Output.of(useDotnetIsolatedRuntime));
        }

        public LinuxFunctionAppSlotSiteConfigApplicationStackArgs build() {
            return $;
        }
    }

}