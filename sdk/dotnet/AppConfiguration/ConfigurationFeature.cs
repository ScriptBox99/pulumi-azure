// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration
{
    /// <summary>
    /// Manages an Azure App Configuration Feature.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var rg = new Azure.Core.ResourceGroup("rg", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var appconf = new Azure.AppConfiguration.ConfigurationStore("appconf", new Azure.AppConfiguration.ConfigurationStoreArgs
    ///         {
    ///             ResourceGroupName = rg.Name,
    ///             Location = rg.Location,
    ///         });
    ///         var test = new Azure.AppConfiguration.ConfigurationFeature("test", new Azure.AppConfiguration.ConfigurationFeatureArgs
    ///         {
    ///             ConfigurationStoreId = appconf.Id,
    ///             Description = "test description",
    ///             Label = "acctest-ackeylabel-%d",
    ///             Enabled = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// App Configuration Features can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:appconfiguration/configurationFeature:ConfigurationFeature test /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resourceGroup1/providers/Microsoft.AppConfiguration/configurationStores/appConf1/AppConfigurationFeature/appConfFeature1/Label/label1
    /// ```
    /// 
    ///  If you wish to import a key with an empty label then sustitute the label's name with `%00`, like this
    /// 
    /// ```sh
    ///  $ pulumi import azure:appconfiguration/configurationFeature:ConfigurationFeature test /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resourceGroup1/providers/Microsoft.AppConfiguration/configurationStores/appConf1/AppConfigurationFeature/appConfFeature1/Label/%00
    /// ```
    /// </summary>
    [AzureResourceType("azure:appconfiguration/configurationFeature:ConfigurationFeature")]
    public partial class ConfigurationFeature : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the id of the App Configuration. Changing this forces a new resource to be created.
        /// </summary>
        [Output("configurationStoreId")]
        public Output<string> ConfigurationStoreId { get; private set; } = null!;

        /// <summary>
        /// The description of the App Configuration Feature.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The status of the App Configuration Feature. By default, this is set to false.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The label of the App Configuration Feature.  Changing this forces a new resource to be created.
        /// </summary>
        [Output("label")]
        public Output<string?> Label { get; private set; } = null!;

        /// <summary>
        /// Should this App Configuration Feature be Locked to prevent changes?
        /// </summary>
        [Output("locked")]
        public Output<bool?> Locked { get; private set; } = null!;

        /// <summary>
        /// The name of the App Configuration Feature. Changing this foces a new resource to be crearted.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of one or more numbers representing the value of the percentage required to enable this feature.
        /// </summary>
        [Output("percentageFilterValue")]
        public Output<int?> PercentageFilterValue { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A `targeting_filter` block as defined below.
        /// </summary>
        [Output("targetingFilters")]
        public Output<ImmutableArray<Outputs.ConfigurationFeatureTargetingFilter>> TargetingFilters { get; private set; } = null!;

        /// <summary>
        /// A `targeting_filter` block `timewindow_filter` as defined below.
        /// </summary>
        [Output("timewindowFilters")]
        public Output<ImmutableArray<Outputs.ConfigurationFeatureTimewindowFilter>> TimewindowFilters { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigurationFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigurationFeature(string name, ConfigurationFeatureArgs args, CustomResourceOptions? options = null)
            : base("azure:appconfiguration/configurationFeature:ConfigurationFeature", name, args ?? new ConfigurationFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigurationFeature(string name, Input<string> id, ConfigurationFeatureState? state = null, CustomResourceOptions? options = null)
            : base("azure:appconfiguration/configurationFeature:ConfigurationFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfigurationFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigurationFeature Get(string name, Input<string> id, ConfigurationFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigurationFeature(name, id, state, options);
        }
    }

    public sealed class ConfigurationFeatureArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the id of the App Configuration. Changing this forces a new resource to be created.
        /// </summary>
        [Input("configurationStoreId", required: true)]
        public Input<string> ConfigurationStoreId { get; set; } = null!;

        /// <summary>
        /// The description of the App Configuration Feature.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The status of the App Configuration Feature. By default, this is set to false.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The label of the App Configuration Feature.  Changing this forces a new resource to be created.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Should this App Configuration Feature be Locked to prevent changes?
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// The name of the App Configuration Feature. Changing this foces a new resource to be crearted.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A list of one or more numbers representing the value of the percentage required to enable this feature.
        /// </summary>
        [Input("percentageFilterValue")]
        public Input<int>? PercentageFilterValue { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("targetingFilters")]
        private InputList<Inputs.ConfigurationFeatureTargetingFilterArgs>? _targetingFilters;

        /// <summary>
        /// A `targeting_filter` block as defined below.
        /// </summary>
        public InputList<Inputs.ConfigurationFeatureTargetingFilterArgs> TargetingFilters
        {
            get => _targetingFilters ?? (_targetingFilters = new InputList<Inputs.ConfigurationFeatureTargetingFilterArgs>());
            set => _targetingFilters = value;
        }

        [Input("timewindowFilters")]
        private InputList<Inputs.ConfigurationFeatureTimewindowFilterArgs>? _timewindowFilters;

        /// <summary>
        /// A `targeting_filter` block `timewindow_filter` as defined below.
        /// </summary>
        public InputList<Inputs.ConfigurationFeatureTimewindowFilterArgs> TimewindowFilters
        {
            get => _timewindowFilters ?? (_timewindowFilters = new InputList<Inputs.ConfigurationFeatureTimewindowFilterArgs>());
            set => _timewindowFilters = value;
        }

        public ConfigurationFeatureArgs()
        {
        }
    }

    public sealed class ConfigurationFeatureState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the id of the App Configuration. Changing this forces a new resource to be created.
        /// </summary>
        [Input("configurationStoreId")]
        public Input<string>? ConfigurationStoreId { get; set; }

        /// <summary>
        /// The description of the App Configuration Feature.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The status of the App Configuration Feature. By default, this is set to false.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The label of the App Configuration Feature.  Changing this forces a new resource to be created.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Should this App Configuration Feature be Locked to prevent changes?
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// The name of the App Configuration Feature. Changing this foces a new resource to be crearted.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A list of one or more numbers representing the value of the percentage required to enable this feature.
        /// </summary>
        [Input("percentageFilterValue")]
        public Input<int>? PercentageFilterValue { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("targetingFilters")]
        private InputList<Inputs.ConfigurationFeatureTargetingFilterGetArgs>? _targetingFilters;

        /// <summary>
        /// A `targeting_filter` block as defined below.
        /// </summary>
        public InputList<Inputs.ConfigurationFeatureTargetingFilterGetArgs> TargetingFilters
        {
            get => _targetingFilters ?? (_targetingFilters = new InputList<Inputs.ConfigurationFeatureTargetingFilterGetArgs>());
            set => _targetingFilters = value;
        }

        [Input("timewindowFilters")]
        private InputList<Inputs.ConfigurationFeatureTimewindowFilterGetArgs>? _timewindowFilters;

        /// <summary>
        /// A `targeting_filter` block `timewindow_filter` as defined below.
        /// </summary>
        public InputList<Inputs.ConfigurationFeatureTimewindowFilterGetArgs> TimewindowFilters
        {
            get => _timewindowFilters ?? (_timewindowFilters = new InputList<Inputs.ConfigurationFeatureTimewindowFilterGetArgs>());
            set => _timewindowFilters = value;
        }

        public ConfigurationFeatureState()
        {
        }
    }
}