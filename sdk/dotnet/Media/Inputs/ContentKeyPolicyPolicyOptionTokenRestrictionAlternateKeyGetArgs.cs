// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKeyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("rsaTokenKeyExponent")]
        private Input<string>? _rsaTokenKeyExponent;

        /// <summary>
        /// The RSA parameter exponent.
        /// </summary>
        public Input<string>? RsaTokenKeyExponent
        {
            get => _rsaTokenKeyExponent;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rsaTokenKeyExponent = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("rsaTokenKeyModulus")]
        private Input<string>? _rsaTokenKeyModulus;

        /// <summary>
        /// The RSA parameter modulus.
        /// </summary>
        public Input<string>? RsaTokenKeyModulus
        {
            get => _rsaTokenKeyModulus;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rsaTokenKeyModulus = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("symmetricTokenKey")]
        private Input<string>? _symmetricTokenKey;

        /// <summary>
        /// The key value of the key. Specifies a symmetric key for token validation.
        /// </summary>
        public Input<string>? SymmetricTokenKey
        {
            get => _symmetricTokenKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _symmetricTokenKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("x509TokenKeyRaw")]
        private Input<string>? _x509TokenKeyRaw;

        /// <summary>
        /// The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET). Specifies a certificate for token validation.
        /// 
        /// &gt; **NOTE:** Each `alternate_key` block can only have one type of primary verification key: if you want to use RSA you must provide `rsa_token_key_exponent` and `rsa_token_key_modulus`, if you want to use symmetric you need to provide `symmetric_token_key` and for x509 you must provide `x509_token_key_raw`.
        /// </summary>
        public Input<string>? X509TokenKeyRaw
        {
            get => _x509TokenKeyRaw;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _x509TokenKeyRaw = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKeyGetArgs()
        {
        }
        public static new ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKeyGetArgs Empty => new ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKeyGetArgs();
    }
}
