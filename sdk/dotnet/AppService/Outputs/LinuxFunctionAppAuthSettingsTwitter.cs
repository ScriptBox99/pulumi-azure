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
    public sealed class LinuxFunctionAppAuthSettingsTwitter
    {
        /// <summary>
        /// The OAuth 1.0a consumer key of the Twitter application used for sign-in.
        /// </summary>
        public readonly string ConsumerKey;
        /// <summary>
        /// The OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret_setting_name`.
        /// </summary>
        public readonly string? ConsumerSecret;
        /// <summary>
        /// The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret`.
        /// </summary>
        public readonly string? ConsumerSecretSettingName;

        [OutputConstructor]
        private LinuxFunctionAppAuthSettingsTwitter(
            string consumerKey,

            string? consumerSecret,

            string? consumerSecretSettingName)
        {
            ConsumerKey = consumerKey;
            ConsumerSecret = consumerSecret;
            ConsumerSecretSettingName = consumerSecretSettingName;
        }
    }
}