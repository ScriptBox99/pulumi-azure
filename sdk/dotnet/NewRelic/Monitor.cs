// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NewRelic
{
    /// <summary>
    /// Manages an Azure Native New Relic Monitor.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "East US",
    ///     });
    /// 
    ///     var exampleMonitor = new Azure.NewRelic.Monitor("exampleMonitor", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Plan = new Azure.NewRelic.Inputs.MonitorPlanArgs
    ///         {
    ///             EffectiveDate = "2023-06-06T00:00:00Z",
    ///         },
    ///         User = new Azure.NewRelic.Inputs.MonitorUserArgs
    ///         {
    ///             Email = "user@example.com",
    ///             FirstName = "Example",
    ///             LastName = "User",
    ///             PhoneNumber = "+12313803556",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Azure Native New Relic Monitor can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:newrelic/monitor:Monitor example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/NewRelic.Observability/monitors/monitor1
    /// ```
    /// </summary>
    [AzureResourceType("azure:newrelic/monitor:Monitor")]
    public partial class Monitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the source of account creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("accountCreationSource")]
        public Output<string?> AccountCreationSource { get; private set; } = null!;

        /// <summary>
        /// Specifies the account id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Specifies the ingestion key of account. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("ingestionKey")]
        public Output<string?> IngestionKey { get; private set; } = null!;

        /// <summary>
        /// Specifies the Azure Region where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Azure Native New Relic Monitor. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the source of org creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("orgCreationSource")]
        public Output<string?> OrgCreationSource { get; private set; } = null!;

        /// <summary>
        /// Specifies the organization id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("plan")]
        public Output<Outputs.MonitorPlan> Plan { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("user")]
        public Output<Outputs.MonitorUser> User { get; private set; } = null!;

        /// <summary>
        /// Specifies the user id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("userId")]
        public Output<string?> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a Monitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Monitor(string name, MonitorArgs args, CustomResourceOptions? options = null)
            : base("azure:newrelic/monitor:Monitor", name, args ?? new MonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Monitor(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
            : base("azure:newrelic/monitor:Monitor", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "ingestionKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Monitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Monitor Get(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new Monitor(name, id, state, options);
        }
    }

    public sealed class MonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the source of account creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("accountCreationSource")]
        public Input<string>? AccountCreationSource { get; set; }

        /// <summary>
        /// Specifies the account id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("ingestionKey")]
        private Input<string>? _ingestionKey;

        /// <summary>
        /// Specifies the ingestion key of account. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public Input<string>? IngestionKey
        {
            get => _ingestionKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _ingestionKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the Azure Region where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Azure Native New Relic Monitor. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the source of org creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("orgCreationSource")]
        public Input<string>? OrgCreationSource { get; set; }

        /// <summary>
        /// Specifies the organization id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("plan", required: true)]
        public Input<Inputs.MonitorPlanArgs> Plan { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("user", required: true)]
        public Input<Inputs.MonitorUserArgs> User { get; set; } = null!;

        /// <summary>
        /// Specifies the user id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public MonitorArgs()
        {
        }
        public static new MonitorArgs Empty => new MonitorArgs();
    }

    public sealed class MonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the source of account creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("accountCreationSource")]
        public Input<string>? AccountCreationSource { get; set; }

        /// <summary>
        /// Specifies the account id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("ingestionKey")]
        private Input<string>? _ingestionKey;

        /// <summary>
        /// Specifies the ingestion key of account. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public Input<string>? IngestionKey
        {
            get => _ingestionKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _ingestionKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the Azure Region where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Azure Native New Relic Monitor. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the source of org creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("orgCreationSource")]
        public Input<string>? OrgCreationSource { get; set; }

        /// <summary>
        /// Specifies the organization id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("plan")]
        public Input<Inputs.MonitorPlanGetArgs>? Plan { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("user")]
        public Input<Inputs.MonitorUserGetArgs>? User { get; set; }

        /// <summary>
        /// Specifies the user id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public MonitorState()
        {
        }
        public static new MonitorState Empty => new MonitorState();
    }
}