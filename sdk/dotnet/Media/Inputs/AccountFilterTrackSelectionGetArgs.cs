// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class AccountFilterTrackSelectionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions", required: true)]
        private InputList<Inputs.AccountFilterTrackSelectionConditionGetArgs>? _conditions;

        /// <summary>
        /// One or more `condition` blocks as defined above.
        /// </summary>
        public InputList<Inputs.AccountFilterTrackSelectionConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AccountFilterTrackSelectionConditionGetArgs>());
            set => _conditions = value;
        }

        public AccountFilterTrackSelectionGetArgs()
        {
        }
        public static new AccountFilterTrackSelectionGetArgs Empty => new AccountFilterTrackSelectionGetArgs();
    }
}