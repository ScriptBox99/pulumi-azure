// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare
{
    /// <summary>
    /// Manages a Healthcare Med Tech Service.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Azure.Healthcare.MedtechService("test", new()
    ///     {
    ///         DeviceMappingJson = @"{
    ///     ""templateType"": ""CollectionContent"",
    ///     ""template"": [
    ///                 {
    ///                   ""templateType"": ""JsonPathContent"",
    ///                   ""template"": {
    ///                     ""typeName"": ""heartrate"",
    ///                     ""typeMatchExpression"": ""$..[?(@heartrate)]"",
    ///                     ""deviceIdExpression"": ""$.deviceid"",
    ///                     ""timestampExpression"": ""$.measurementdatetime"",
    ///                     ""values"": [
    ///                       {
    ///                         ""required"": ""true"",
    ///                         ""valueExpression"": ""$.heartrate"",
    ///                         ""valueName"": ""hr""
    ///                       }
    ///                     ]
    ///                   }
    ///                 }
    ///               ]
    /// }
    /// 
    /// ",
    ///         EventhubConsumerGroupName = "tfex-eventhub-consumer-group.name",
    ///         EventhubName = "tfex-eventhub.name",
    ///         EventhubNamespaceName = "tfex-eventhub-namespace.name",
    ///         Identity = new Azure.Healthcare.Inputs.MedtechServiceIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///         Location = "east us",
    ///         WorkspaceId = "tfex-workspace_id",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Healthcare Med Tech Service can be imported using the resource`id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:healthcare/medtechService:MedtechService example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.HealthcareApis/workspaces/workspace1/iotConnectors/iotconnector1
    /// ```
    /// </summary>
    [AzureResourceType("azure:healthcare/medtechService:MedtechService")]
    public partial class MedtechService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the Device Mappings of the Med Tech Service.
        /// </summary>
        [Output("deviceMappingJson")]
        public Output<string> DeviceMappingJson { get; private set; } = null!;

        /// <summary>
        /// Specifies the Consumer Group of the Event Hub to connect to.
        /// </summary>
        [Output("eventhubConsumerGroupName")]
        public Output<string> EventhubConsumerGroupName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Event Hub to connect to.
        /// </summary>
        [Output("eventhubName")]
        public Output<string> EventhubName { get; private set; } = null!;

        /// <summary>
        /// Specifies the namespace name of the Event Hub to connect to.
        /// </summary>
        [Output("eventhubNamespaceName")]
        public Output<string> EventhubNamespaceName { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.MedtechServiceIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// Specifies the Azure Region where the Healthcare Med Tech Service should be created. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Healthcare Med Tech Service. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Specifies the id of the Healthcare Workspace where the Healthcare Med Tech Service should exist. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a MedtechService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MedtechService(string name, MedtechServiceArgs args, CustomResourceOptions? options = null)
            : base("azure:healthcare/medtechService:MedtechService", name, args ?? new MedtechServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MedtechService(string name, Input<string> id, MedtechServiceState? state = null, CustomResourceOptions? options = null)
            : base("azure:healthcare/medtechService:MedtechService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MedtechService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MedtechService Get(string name, Input<string> id, MedtechServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new MedtechService(name, id, state, options);
        }
    }

    public sealed class MedtechServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Device Mappings of the Med Tech Service.
        /// </summary>
        [Input("deviceMappingJson", required: true)]
        public Input<string> DeviceMappingJson { get; set; } = null!;

        /// <summary>
        /// Specifies the Consumer Group of the Event Hub to connect to.
        /// </summary>
        [Input("eventhubConsumerGroupName", required: true)]
        public Input<string> EventhubConsumerGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Event Hub to connect to.
        /// </summary>
        [Input("eventhubName", required: true)]
        public Input<string> EventhubName { get; set; } = null!;

        /// <summary>
        /// Specifies the namespace name of the Event Hub to connect to.
        /// </summary>
        [Input("eventhubNamespaceName", required: true)]
        public Input<string> EventhubNamespaceName { get; set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.MedtechServiceIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// Specifies the Azure Region where the Healthcare Med Tech Service should be created. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Healthcare Med Tech Service. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the id of the Healthcare Workspace where the Healthcare Med Tech Service should exist. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public MedtechServiceArgs()
        {
        }
        public static new MedtechServiceArgs Empty => new MedtechServiceArgs();
    }

    public sealed class MedtechServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Device Mappings of the Med Tech Service.
        /// </summary>
        [Input("deviceMappingJson")]
        public Input<string>? DeviceMappingJson { get; set; }

        /// <summary>
        /// Specifies the Consumer Group of the Event Hub to connect to.
        /// </summary>
        [Input("eventhubConsumerGroupName")]
        public Input<string>? EventhubConsumerGroupName { get; set; }

        /// <summary>
        /// Specifies the name of the Event Hub to connect to.
        /// </summary>
        [Input("eventhubName")]
        public Input<string>? EventhubName { get; set; }

        /// <summary>
        /// Specifies the namespace name of the Event Hub to connect to.
        /// </summary>
        [Input("eventhubNamespaceName")]
        public Input<string>? EventhubNamespaceName { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.MedtechServiceIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// Specifies the Azure Region where the Healthcare Med Tech Service should be created. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Healthcare Med Tech Service. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the id of the Healthcare Workspace where the Healthcare Med Tech Service should exist. Changing this forces a new Healthcare Med Tech Service to be created.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public MedtechServiceState()
        {
        }
        public static new MedtechServiceState Empty => new MedtechServiceState();
    }
}