// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class LinuxFunctionAppSlotSiteConfigApplicationStack
    {
        /// <summary>
        /// a `docker` block as detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.LinuxFunctionAppSlotSiteConfigApplicationStackDocker> Dockers;
        /// <summary>
        /// The version of .Net. Possible values are `3.1` and `6.0`.
        /// </summary>
        public readonly string? DotnetVersion;
        /// <summary>
        /// The version of Java to use. Possible values are `8`, and `11`.
        /// </summary>
        public readonly string? JavaVersion;
        /// <summary>
        /// The version of Node to use. Possible values include `12`, and `14`
        /// </summary>
        public readonly string? NodeVersion;
        /// <summary>
        /// The version of PowerShell Core to use. Possibles values are `7` , and `7.2`.
        /// </summary>
        public readonly string? PowershellCoreVersion;
        /// <summary>
        /// The version of Python to use. Possible values include `3.9`, `3.8`, and `3.7`.
        /// </summary>
        public readonly string? PythonVersion;
        /// <summary>
        /// Should the Linux Function App use a custom runtime?
        /// </summary>
        public readonly bool? UseCustomRuntime;
        /// <summary>
        /// Should the DotNet process use an isolated runtime. Defaults to `false`.
        /// </summary>
        public readonly bool? UseDotnetIsolatedRuntime;

        [OutputConstructor]
        private LinuxFunctionAppSlotSiteConfigApplicationStack(
            ImmutableArray<Outputs.LinuxFunctionAppSlotSiteConfigApplicationStackDocker> dockers,

            string? dotnetVersion,

            string? javaVersion,

            string? nodeVersion,

            string? powershellCoreVersion,

            string? pythonVersion,

            bool? useCustomRuntime,

            bool? useDotnetIsolatedRuntime)
        {
            Dockers = dockers;
            DotnetVersion = dotnetVersion;
            JavaVersion = javaVersion;
            NodeVersion = nodeVersion;
            PowershellCoreVersion = powershellCoreVersion;
            PythonVersion = pythonVersion;
            UseCustomRuntime = useCustomRuntime;
            UseDotnetIsolatedRuntime = useDotnetIsolatedRuntime;
        }
    }
}