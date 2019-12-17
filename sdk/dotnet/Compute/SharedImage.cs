// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    /// <summary>
    /// Manages a Shared Image within a Shared Image Gallery.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/shared_image.html.markdown.
    /// </summary>
    public partial class SharedImage : Pulumi.CustomResource
    {
        /// <summary>
        /// A description of this Shared Image.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The End User Licence Agreement for the Shared Image.
        /// </summary>
        [Output("eula")]
        public Output<string?> Eula { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Shared Image Gallery in which this Shared Image should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("galleryName")]
        public Output<string> GalleryName { get; private set; } = null!;

        /// <summary>
        /// An `identifier` block as defined below.
        /// </summary>
        [Output("identifier")]
        public Output<Outputs.SharedImageIdentifier> Identifier { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the Shared Image Gallery exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Shared Image. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of Operating System present in this Shared Image. Possible values are `Linux` and `Windows`.
        /// </summary>
        [Output("osType")]
        public Output<string> OsType { get; private set; } = null!;

        /// <summary>
        /// The URI containing the Privacy Statement associated with this Shared Image.
        /// </summary>
        [Output("privacyStatementUri")]
        public Output<string?> PrivacyStatementUri { get; private set; } = null!;

        /// <summary>
        /// The URI containing the Release Notes associated with this Shared Image.
        /// </summary>
        [Output("releaseNoteUri")]
        public Output<string?> ReleaseNoteUri { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the Shared Image.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SharedImage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SharedImage(string name, SharedImageArgs args, CustomResourceOptions? options = null)
            : base("azure:compute/sharedImage:SharedImage", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private SharedImage(string name, Input<string> id, SharedImageState? state = null, CustomResourceOptions? options = null)
            : base("azure:compute/sharedImage:SharedImage", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SharedImage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SharedImage Get(string name, Input<string> id, SharedImageState? state = null, CustomResourceOptions? options = null)
        {
            return new SharedImage(name, id, state, options);
        }
    }

    public sealed class SharedImageArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description of this Shared Image.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The End User Licence Agreement for the Shared Image.
        /// </summary>
        [Input("eula")]
        public Input<string>? Eula { get; set; }

        /// <summary>
        /// Specifies the name of the Shared Image Gallery in which this Shared Image should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("galleryName", required: true)]
        public Input<string> GalleryName { get; set; } = null!;

        /// <summary>
        /// An `identifier` block as defined below.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<Inputs.SharedImageIdentifierArgs> Identifier { get; set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the Shared Image Gallery exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Shared Image. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of Operating System present in this Shared Image. Possible values are `Linux` and `Windows`.
        /// </summary>
        [Input("osType", required: true)]
        public Input<string> OsType { get; set; } = null!;

        /// <summary>
        /// The URI containing the Privacy Statement associated with this Shared Image.
        /// </summary>
        [Input("privacyStatementUri")]
        public Input<string>? PrivacyStatementUri { get; set; }

        /// <summary>
        /// The URI containing the Release Notes associated with this Shared Image.
        /// </summary>
        [Input("releaseNoteUri")]
        public Input<string>? ReleaseNoteUri { get; set; }

        /// <summary>
        /// The name of the resource group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the Shared Image.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public SharedImageArgs()
        {
        }
    }

    public sealed class SharedImageState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description of this Shared Image.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The End User Licence Agreement for the Shared Image.
        /// </summary>
        [Input("eula")]
        public Input<string>? Eula { get; set; }

        /// <summary>
        /// Specifies the name of the Shared Image Gallery in which this Shared Image should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("galleryName")]
        public Input<string>? GalleryName { get; set; }

        /// <summary>
        /// An `identifier` block as defined below.
        /// </summary>
        [Input("identifier")]
        public Input<Inputs.SharedImageIdentifierGetArgs>? Identifier { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the Shared Image Gallery exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Shared Image. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of Operating System present in this Shared Image. Possible values are `Linux` and `Windows`.
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        /// <summary>
        /// The URI containing the Privacy Statement associated with this Shared Image.
        /// </summary>
        [Input("privacyStatementUri")]
        public Input<string>? PrivacyStatementUri { get; set; }

        /// <summary>
        /// The URI containing the Release Notes associated with this Shared Image.
        /// </summary>
        [Input("releaseNoteUri")]
        public Input<string>? ReleaseNoteUri { get; set; }

        /// <summary>
        /// The name of the resource group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the Shared Image.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public SharedImageState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class SharedImageIdentifierArgs : Pulumi.ResourceArgs
    {
        [Input("offer", required: true)]
        public Input<string> Offer { get; set; } = null!;

        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        [Input("sku", required: true)]
        public Input<string> Sku { get; set; } = null!;

        public SharedImageIdentifierArgs()
        {
        }
    }

    public sealed class SharedImageIdentifierGetArgs : Pulumi.ResourceArgs
    {
        [Input("offer", required: true)]
        public Input<string> Offer { get; set; } = null!;

        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        [Input("sku", required: true)]
        public Input<string> Sku { get; set; } = null!;

        public SharedImageIdentifierGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class SharedImageIdentifier
    {
        public readonly string Offer;
        public readonly string Publisher;
        public readonly string Sku;

        [OutputConstructor]
        private SharedImageIdentifier(
            string offer,
            string publisher,
            string sku)
        {
            Offer = offer;
            Publisher = publisher;
            Sku = sku;
        }
    }
    }
}