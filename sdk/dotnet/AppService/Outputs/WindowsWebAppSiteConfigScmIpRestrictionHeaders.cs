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
    public sealed class WindowsWebAppSiteConfigScmIpRestrictionHeaders
    {
        /// <summary>
        /// Specifies a list of Azure Front Door IDs.
        /// </summary>
        public readonly ImmutableArray<string> XAzureFdids;
        /// <summary>
        /// Specifies if a Front Door Health Probe should be expected.
        /// </summary>
        public readonly string? XFdHealthProbe;
        /// <summary>
        /// Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
        /// </summary>
        public readonly ImmutableArray<string> XForwardedFors;
        /// <summary>
        /// Specifies a list of Hosts for which matching should be applied.
        /// </summary>
        public readonly ImmutableArray<string> XForwardedHosts;

        [OutputConstructor]
        private WindowsWebAppSiteConfigScmIpRestrictionHeaders(
            ImmutableArray<string> xAzureFdids,

            string? xFdHealthProbe,

            ImmutableArray<string> xForwardedFors,

            ImmutableArray<string> xForwardedHosts)
        {
            XAzureFdids = xAzureFdids;
            XFdHealthProbe = xFdHealthProbe;
            XForwardedFors = xForwardedFors;
            XForwardedHosts = xForwardedHosts;
        }
    }
}