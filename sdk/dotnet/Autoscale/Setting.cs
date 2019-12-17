// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Autoscale
{
    /// <summary>
    /// Manages an AutoScale Setting which can be applied to Virtual Machine Scale Sets, App Services and other scalable resources.
    /// 
    /// &gt; **NOTE:** This resource has been deprecated in favour of the `azure.monitoring.AutoscaleSetting` resource and will be removed in the next major version of the AzureRM Provider. The new resource shares the same fields as this one, and information on migrating across can be found in this guide.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/autoscale_setting.html.markdown.
    /// </summary>
    public partial class Setting : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the AutoScale Setting. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies a `notification` block as defined below.
        /// </summary>
        [Output("notification")]
        public Output<Outputs.SettingNotification?> Notification { get; private set; } = null!;

        /// <summary>
        /// Specifies one or more (up to 20) `profile` blocks as defined below.
        /// </summary>
        [Output("profiles")]
        public Output<ImmutableArray<Outputs.SettingProfiles>> Profiles { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>> Tags { get; private set; } = null!;

        /// <summary>
        /// Specifies the resource ID of the resource that the autoscale setting should be added to.
        /// </summary>
        [Output("targetResourceId")]
        public Output<string> TargetResourceId { get; private set; } = null!;


        /// <summary>
        /// Create a Setting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Setting(string name, SettingArgs args, CustomResourceOptions? options = null)
            : base("azure:autoscale/setting:Setting", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Setting(string name, Input<string> id, SettingState? state = null, CustomResourceOptions? options = null)
            : base("azure:autoscale/setting:Setting", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Setting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Setting Get(string name, Input<string> id, SettingState? state = null, CustomResourceOptions? options = null)
        {
            return new Setting(name, id, state, options);
        }
    }

    public sealed class SettingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the AutoScale Setting. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies a `notification` block as defined below.
        /// </summary>
        [Input("notification")]
        public Input<Inputs.SettingNotificationArgs>? Notification { get; set; }

        [Input("profiles", required: true)]
        private InputList<Inputs.SettingProfilesArgs>? _profiles;

        /// <summary>
        /// Specifies one or more (up to 20) `profile` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SettingProfilesArgs> Profiles
        {
            get => _profiles ?? (_profiles = new InputList<Inputs.SettingProfilesArgs>());
            set => _profiles = value;
        }

        /// <summary>
        /// The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the resource ID of the resource that the autoscale setting should be added to.
        /// </summary>
        [Input("targetResourceId", required: true)]
        public Input<string> TargetResourceId { get; set; } = null!;

        public SettingArgs()
        {
        }
    }

    public sealed class SettingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the AutoScale Setting. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies a `notification` block as defined below.
        /// </summary>
        [Input("notification")]
        public Input<Inputs.SettingNotificationGetArgs>? Notification { get; set; }

        [Input("profiles")]
        private InputList<Inputs.SettingProfilesGetArgs>? _profiles;

        /// <summary>
        /// Specifies one or more (up to 20) `profile` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SettingProfilesGetArgs> Profiles
        {
            get => _profiles ?? (_profiles = new InputList<Inputs.SettingProfilesGetArgs>());
            set => _profiles = value;
        }

        /// <summary>
        /// The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the resource ID of the resource that the autoscale setting should be added to.
        /// </summary>
        [Input("targetResourceId")]
        public Input<string>? TargetResourceId { get; set; }

        public SettingState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class SettingNotificationArgs : Pulumi.ResourceArgs
    {
        [Input("email")]
        public Input<SettingNotificationEmailArgs>? Email { get; set; }

        [Input("webhooks")]
        private InputList<SettingNotificationWebhooksArgs>? _webhooks;
        public InputList<SettingNotificationWebhooksArgs> Webhooks
        {
            get => _webhooks ?? (_webhooks = new InputList<SettingNotificationWebhooksArgs>());
            set => _webhooks = value;
        }

        public SettingNotificationArgs()
        {
        }
    }

    public sealed class SettingNotificationEmailArgs : Pulumi.ResourceArgs
    {
        [Input("customEmails")]
        private InputList<string>? _customEmails;
        public InputList<string> CustomEmails
        {
            get => _customEmails ?? (_customEmails = new InputList<string>());
            set => _customEmails = value;
        }

        [Input("sendToSubscriptionAdministrator")]
        public Input<bool>? SendToSubscriptionAdministrator { get; set; }

        [Input("sendToSubscriptionCoAdministrator")]
        public Input<bool>? SendToSubscriptionCoAdministrator { get; set; }

        public SettingNotificationEmailArgs()
        {
        }
    }

    public sealed class SettingNotificationEmailGetArgs : Pulumi.ResourceArgs
    {
        [Input("customEmails")]
        private InputList<string>? _customEmails;
        public InputList<string> CustomEmails
        {
            get => _customEmails ?? (_customEmails = new InputList<string>());
            set => _customEmails = value;
        }

        [Input("sendToSubscriptionAdministrator")]
        public Input<bool>? SendToSubscriptionAdministrator { get; set; }

        [Input("sendToSubscriptionCoAdministrator")]
        public Input<bool>? SendToSubscriptionCoAdministrator { get; set; }

        public SettingNotificationEmailGetArgs()
        {
        }
    }

    public sealed class SettingNotificationGetArgs : Pulumi.ResourceArgs
    {
        [Input("email")]
        public Input<SettingNotificationEmailGetArgs>? Email { get; set; }

        [Input("webhooks")]
        private InputList<SettingNotificationWebhooksGetArgs>? _webhooks;
        public InputList<SettingNotificationWebhooksGetArgs> Webhooks
        {
            get => _webhooks ?? (_webhooks = new InputList<SettingNotificationWebhooksGetArgs>());
            set => _webhooks = value;
        }

        public SettingNotificationGetArgs()
        {
        }
    }

    public sealed class SettingNotificationWebhooksArgs : Pulumi.ResourceArgs
    {
        [Input("properties")]
        private InputMap<string>? _properties;
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("serviceUri", required: true)]
        public Input<string> ServiceUri { get; set; } = null!;

        public SettingNotificationWebhooksArgs()
        {
        }
    }

    public sealed class SettingNotificationWebhooksGetArgs : Pulumi.ResourceArgs
    {
        [Input("properties")]
        private InputMap<string>? _properties;
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("serviceUri", required: true)]
        public Input<string> ServiceUri { get; set; } = null!;

        public SettingNotificationWebhooksGetArgs()
        {
        }
    }

    public sealed class SettingProfilesArgs : Pulumi.ResourceArgs
    {
        [Input("capacity", required: true)]
        public Input<SettingProfilesCapacityArgs> Capacity { get; set; } = null!;

        [Input("fixedDate")]
        public Input<SettingProfilesFixedDateArgs>? FixedDate { get; set; }

        /// <summary>
        /// The name of the AutoScale Setting. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("recurrence")]
        public Input<SettingProfilesRecurrenceArgs>? Recurrence { get; set; }

        [Input("rules")]
        private InputList<SettingProfilesRulesArgs>? _rules;
        public InputList<SettingProfilesRulesArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<SettingProfilesRulesArgs>());
            set => _rules = value;
        }

        public SettingProfilesArgs()
        {
        }
    }

    public sealed class SettingProfilesCapacityArgs : Pulumi.ResourceArgs
    {
        [Input("default", required: true)]
        public Input<int> Default { get; set; } = null!;

        [Input("maximum", required: true)]
        public Input<int> Maximum { get; set; } = null!;

        [Input("minimum", required: true)]
        public Input<int> Minimum { get; set; } = null!;

        public SettingProfilesCapacityArgs()
        {
        }
    }

    public sealed class SettingProfilesCapacityGetArgs : Pulumi.ResourceArgs
    {
        [Input("default", required: true)]
        public Input<int> Default { get; set; } = null!;

        [Input("maximum", required: true)]
        public Input<int> Maximum { get; set; } = null!;

        [Input("minimum", required: true)]
        public Input<int> Minimum { get; set; } = null!;

        public SettingProfilesCapacityGetArgs()
        {
        }
    }

    public sealed class SettingProfilesFixedDateArgs : Pulumi.ResourceArgs
    {
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public SettingProfilesFixedDateArgs()
        {
        }
    }

    public sealed class SettingProfilesFixedDateGetArgs : Pulumi.ResourceArgs
    {
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public SettingProfilesFixedDateGetArgs()
        {
        }
    }

    public sealed class SettingProfilesGetArgs : Pulumi.ResourceArgs
    {
        [Input("capacity", required: true)]
        public Input<SettingProfilesCapacityGetArgs> Capacity { get; set; } = null!;

        [Input("fixedDate")]
        public Input<SettingProfilesFixedDateGetArgs>? FixedDate { get; set; }

        /// <summary>
        /// The name of the AutoScale Setting. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("recurrence")]
        public Input<SettingProfilesRecurrenceGetArgs>? Recurrence { get; set; }

        [Input("rules")]
        private InputList<SettingProfilesRulesGetArgs>? _rules;
        public InputList<SettingProfilesRulesGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<SettingProfilesRulesGetArgs>());
            set => _rules = value;
        }

        public SettingProfilesGetArgs()
        {
        }
    }

    public sealed class SettingProfilesRecurrenceArgs : Pulumi.ResourceArgs
    {
        [Input("days", required: true)]
        private InputList<string>? _days;
        public InputList<string> Days
        {
            get => _days ?? (_days = new InputList<string>());
            set => _days = value;
        }

        [Input("hours", required: true)]
        public Input<int> Hours { get; set; } = null!;

        [Input("minutes", required: true)]
        public Input<int> Minutes { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public SettingProfilesRecurrenceArgs()
        {
        }
    }

    public sealed class SettingProfilesRecurrenceGetArgs : Pulumi.ResourceArgs
    {
        [Input("days", required: true)]
        private InputList<string>? _days;
        public InputList<string> Days
        {
            get => _days ?? (_days = new InputList<string>());
            set => _days = value;
        }

        [Input("hours", required: true)]
        public Input<int> Hours { get; set; } = null!;

        [Input("minutes", required: true)]
        public Input<int> Minutes { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public SettingProfilesRecurrenceGetArgs()
        {
        }
    }

    public sealed class SettingProfilesRulesArgs : Pulumi.ResourceArgs
    {
        [Input("metricTrigger", required: true)]
        public Input<SettingProfilesRulesMetricTriggerArgs> MetricTrigger { get; set; } = null!;

        [Input("scaleAction", required: true)]
        public Input<SettingProfilesRulesScaleActionArgs> ScaleAction { get; set; } = null!;

        public SettingProfilesRulesArgs()
        {
        }
    }

    public sealed class SettingProfilesRulesGetArgs : Pulumi.ResourceArgs
    {
        [Input("metricTrigger", required: true)]
        public Input<SettingProfilesRulesMetricTriggerGetArgs> MetricTrigger { get; set; } = null!;

        [Input("scaleAction", required: true)]
        public Input<SettingProfilesRulesScaleActionGetArgs> ScaleAction { get; set; } = null!;

        public SettingProfilesRulesGetArgs()
        {
        }
    }

    public sealed class SettingProfilesRulesMetricTriggerArgs : Pulumi.ResourceArgs
    {
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("metricResourceId", required: true)]
        public Input<string> MetricResourceId { get; set; } = null!;

        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("statistic", required: true)]
        public Input<string> Statistic { get; set; } = null!;

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        [Input("timeAggregation", required: true)]
        public Input<string> TimeAggregation { get; set; } = null!;

        [Input("timeGrain", required: true)]
        public Input<string> TimeGrain { get; set; } = null!;

        [Input("timeWindow", required: true)]
        public Input<string> TimeWindow { get; set; } = null!;

        public SettingProfilesRulesMetricTriggerArgs()
        {
        }
    }

    public sealed class SettingProfilesRulesMetricTriggerGetArgs : Pulumi.ResourceArgs
    {
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("metricResourceId", required: true)]
        public Input<string> MetricResourceId { get; set; } = null!;

        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("statistic", required: true)]
        public Input<string> Statistic { get; set; } = null!;

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        [Input("timeAggregation", required: true)]
        public Input<string> TimeAggregation { get; set; } = null!;

        [Input("timeGrain", required: true)]
        public Input<string> TimeGrain { get; set; } = null!;

        [Input("timeWindow", required: true)]
        public Input<string> TimeWindow { get; set; } = null!;

        public SettingProfilesRulesMetricTriggerGetArgs()
        {
        }
    }

    public sealed class SettingProfilesRulesScaleActionArgs : Pulumi.ResourceArgs
    {
        [Input("cooldown", required: true)]
        public Input<string> Cooldown { get; set; } = null!;

        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public SettingProfilesRulesScaleActionArgs()
        {
        }
    }

    public sealed class SettingProfilesRulesScaleActionGetArgs : Pulumi.ResourceArgs
    {
        [Input("cooldown", required: true)]
        public Input<string> Cooldown { get; set; } = null!;

        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public SettingProfilesRulesScaleActionGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class SettingNotification
    {
        public readonly SettingNotificationEmail? Email;
        public readonly ImmutableArray<SettingNotificationWebhooks> Webhooks;

        [OutputConstructor]
        private SettingNotification(
            SettingNotificationEmail? email,
            ImmutableArray<SettingNotificationWebhooks> webhooks)
        {
            Email = email;
            Webhooks = webhooks;
        }
    }

    [OutputType]
    public sealed class SettingNotificationEmail
    {
        public readonly ImmutableArray<string> CustomEmails;
        public readonly bool? SendToSubscriptionAdministrator;
        public readonly bool? SendToSubscriptionCoAdministrator;

        [OutputConstructor]
        private SettingNotificationEmail(
            ImmutableArray<string> customEmails,
            bool? sendToSubscriptionAdministrator,
            bool? sendToSubscriptionCoAdministrator)
        {
            CustomEmails = customEmails;
            SendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
            SendToSubscriptionCoAdministrator = sendToSubscriptionCoAdministrator;
        }
    }

    [OutputType]
    public sealed class SettingNotificationWebhooks
    {
        public readonly ImmutableDictionary<string, string>? Properties;
        public readonly string ServiceUri;

        [OutputConstructor]
        private SettingNotificationWebhooks(
            ImmutableDictionary<string, string>? properties,
            string serviceUri)
        {
            Properties = properties;
            ServiceUri = serviceUri;
        }
    }

    [OutputType]
    public sealed class SettingProfiles
    {
        public readonly SettingProfilesCapacity Capacity;
        public readonly SettingProfilesFixedDate? FixedDate;
        /// <summary>
        /// The name of the AutoScale Setting. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Name;
        public readonly SettingProfilesRecurrence? Recurrence;
        public readonly ImmutableArray<SettingProfilesRules> Rules;

        [OutputConstructor]
        private SettingProfiles(
            SettingProfilesCapacity capacity,
            SettingProfilesFixedDate? fixedDate,
            string name,
            SettingProfilesRecurrence? recurrence,
            ImmutableArray<SettingProfilesRules> rules)
        {
            Capacity = capacity;
            FixedDate = fixedDate;
            Name = name;
            Recurrence = recurrence;
            Rules = rules;
        }
    }

    [OutputType]
    public sealed class SettingProfilesCapacity
    {
        public readonly int Default;
        public readonly int Maximum;
        public readonly int Minimum;

        [OutputConstructor]
        private SettingProfilesCapacity(
            int @default,
            int maximum,
            int minimum)
        {
            Default = @default;
            Maximum = maximum;
            Minimum = minimum;
        }
    }

    [OutputType]
    public sealed class SettingProfilesFixedDate
    {
        public readonly string End;
        public readonly string Start;
        public readonly string? Timezone;

        [OutputConstructor]
        private SettingProfilesFixedDate(
            string end,
            string start,
            string? timezone)
        {
            End = end;
            Start = start;
            Timezone = timezone;
        }
    }

    [OutputType]
    public sealed class SettingProfilesRecurrence
    {
        public readonly ImmutableArray<string> Days;
        public readonly int Hours;
        public readonly int Minutes;
        public readonly string? Timezone;

        [OutputConstructor]
        private SettingProfilesRecurrence(
            ImmutableArray<string> days,
            int hours,
            int minutes,
            string? timezone)
        {
            Days = days;
            Hours = hours;
            Minutes = minutes;
            Timezone = timezone;
        }
    }

    [OutputType]
    public sealed class SettingProfilesRules
    {
        public readonly SettingProfilesRulesMetricTrigger MetricTrigger;
        public readonly SettingProfilesRulesScaleAction ScaleAction;

        [OutputConstructor]
        private SettingProfilesRules(
            SettingProfilesRulesMetricTrigger metricTrigger,
            SettingProfilesRulesScaleAction scaleAction)
        {
            MetricTrigger = metricTrigger;
            ScaleAction = scaleAction;
        }
    }

    [OutputType]
    public sealed class SettingProfilesRulesMetricTrigger
    {
        public readonly string MetricName;
        public readonly string MetricResourceId;
        public readonly string Operator;
        public readonly string Statistic;
        public readonly double Threshold;
        public readonly string TimeAggregation;
        public readonly string TimeGrain;
        public readonly string TimeWindow;

        [OutputConstructor]
        private SettingProfilesRulesMetricTrigger(
            string metricName,
            string metricResourceId,
            string @operator,
            string statistic,
            double threshold,
            string timeAggregation,
            string timeGrain,
            string timeWindow)
        {
            MetricName = metricName;
            MetricResourceId = metricResourceId;
            Operator = @operator;
            Statistic = statistic;
            Threshold = threshold;
            TimeAggregation = timeAggregation;
            TimeGrain = timeGrain;
            TimeWindow = timeWindow;
        }
    }

    [OutputType]
    public sealed class SettingProfilesRulesScaleAction
    {
        public readonly string Cooldown;
        public readonly string Direction;
        public readonly string Type;
        public readonly int Value;

        [OutputConstructor]
        private SettingProfilesRulesScaleAction(
            string cooldown,
            string direction,
            string type,
            int value)
        {
            Cooldown = cooldown;
            Direction = direction;
            Type = type;
            Value = value;
        }
    }
    }
}