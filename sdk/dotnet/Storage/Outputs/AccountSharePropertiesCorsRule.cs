// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class AccountSharePropertiesCorsRule
    {
        /// <summary>
        /// A list of headers that are allowed to be a part of the cross-origin request.
        /// </summary>
        public readonly ImmutableArray<string> AllowedHeaders;
        /// <summary>
        /// A list of http headers that are allowed to be executed by the origin. Valid options are
        /// `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
        /// </summary>
        public readonly ImmutableArray<string> AllowedMethods;
        /// <summary>
        /// A list of origin domains that will be allowed by CORS.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;
        /// <summary>
        /// A list of response headers that are exposed to CORS clients.
        /// </summary>
        public readonly ImmutableArray<string> ExposedHeaders;
        /// <summary>
        /// The number of seconds the client should cache a preflight response.
        /// </summary>
        public readonly int MaxAgeInSeconds;

        [OutputConstructor]
        private AccountSharePropertiesCorsRule(
            ImmutableArray<string> allowedHeaders,

            ImmutableArray<string> allowedMethods,

            ImmutableArray<string> allowedOrigins,

            ImmutableArray<string> exposedHeaders,

            int maxAgeInSeconds)
        {
            AllowedHeaders = allowedHeaders;
            AllowedMethods = allowedMethods;
            AllowedOrigins = allowedOrigins;
            ExposedHeaders = exposedHeaders;
            MaxAgeInSeconds = maxAgeInSeconds;
        }
    }
}