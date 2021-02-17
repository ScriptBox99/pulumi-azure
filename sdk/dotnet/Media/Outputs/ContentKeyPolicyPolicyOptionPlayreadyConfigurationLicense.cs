// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense
    {
        /// <summary>
        /// A flag indicating whether test devices can use the license.
        /// </summary>
        public readonly bool? AllowTestDevices;
        /// <summary>
        /// The begin date of license.
        /// </summary>
        public readonly string? BeginDate;
        /// <summary>
        /// Specifies that the content key ID is in the PlayReady header.
        /// </summary>
        public readonly bool? ContentKeyLocationFromHeaderEnabled;
        /// <summary>
        /// The content key ID. Specifies that the content key ID is specified in the PlayReady configuration.
        /// </summary>
        public readonly string? ContentKeyLocationFromKeyId;
        /// <summary>
        /// The PlayReady content type. Supported values are `UltraVioletDownload`, `UltraVioletStreaming` or `Unspecified`.
        /// </summary>
        public readonly string? ContentType;
        /// <summary>
        /// The expiration date of license.
        /// </summary>
        public readonly string? ExpirationDate;
        /// <summary>
        /// The grace period of license.
        /// </summary>
        public readonly string? GracePeriod;
        /// <summary>
        /// The license type. Supported values are `NonPersistent` or `Persistent`.
        /// </summary>
        public readonly string? LicenseType;
        /// <summary>
        /// A `play_right` block as defined above.
        /// </summary>
        public readonly Outputs.ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight? PlayRight;
        /// <summary>
        /// The relative begin date of license.
        /// </summary>
        public readonly string? RelativeBeginDate;
        /// <summary>
        /// The relative expiration date of license.
        /// </summary>
        public readonly string? RelativeExpirationDate;

        [OutputConstructor]
        private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense(
            bool? allowTestDevices,

            string? beginDate,

            bool? contentKeyLocationFromHeaderEnabled,

            string? contentKeyLocationFromKeyId,

            string? contentType,

            string? expirationDate,

            string? gracePeriod,

            string? licenseType,

            Outputs.ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight? playRight,

            string? relativeBeginDate,

            string? relativeExpirationDate)
        {
            AllowTestDevices = allowTestDevices;
            BeginDate = beginDate;
            ContentKeyLocationFromHeaderEnabled = contentKeyLocationFromHeaderEnabled;
            ContentKeyLocationFromKeyId = contentKeyLocationFromKeyId;
            ContentType = contentType;
            ExpirationDate = expirationDate;
            GracePeriod = gracePeriod;
            LicenseType = licenseType;
            PlayRight = playRight;
            RelativeBeginDate = relativeBeginDate;
            RelativeExpirationDate = relativeExpirationDate;
        }
    }
}