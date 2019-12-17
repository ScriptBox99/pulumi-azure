// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core
{
    /// <summary>
    /// Manages a template deployment of resources
    /// 
    /// &gt; **Note on ARM Template Deployments:** Due to the way the underlying Azure API is designed, this provider can only manage the deployment of the ARM Template - and not any resources which are created by it.
    /// This means that when deleting the `azure.core.TemplateDeployment` resource, this provider will only remove the reference to the deployment, whilst leaving any resources created by that ARM Template Deployment.
    /// One workaround for this is to use a unique Resource Group for each ARM Template Deployment, which means deleting the Resource Group would contain any resources created within it - however this isn't ideal. [More information](https://docs.microsoft.com/en-us/rest/api/resources/deployments#Deployments_Delete).
    /// 
    /// ## Note
    /// 
    /// This provider does not know about the individual resources created by Azure using a deployment template and therefore cannot delete these resources during a destroy. Destroying a template deployment removes the associated deployment operations, but will not delete the Azure resources created by the deployment. In order to delete these resources, the containing resource group must also be destroyed. [More information](https://docs.microsoft.com/en-us/rest/api/resources/deployments#Deployments_Delete).
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/template_deployment.html.markdown.
    /// </summary>
    public partial class TemplateDeployment : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
        /// Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
        /// specified within the template, and this provider will not be aware of this.
        /// </summary>
        [Output("deploymentMode")]
        public Output<string> DeploymentMode { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the template deployment. Changing this forces a
        /// new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of supported scalar output types returned from the deployment (currently, Azure Template Deployment outputs of type String, Int and Bool are supported, and are converted to strings - others will be ignored) and can be accessed using `.outputs["name"]`.
        /// </summary>
        [Output("outputs")]
        public Output<ImmutableDictionary<string, string>> Outputs { get; private set; } = null!;

        /// <summary>
        /// Specifies the name and value pairs that define the deployment parameters for the template.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
        /// </summary>
        [Output("parametersBody")]
        public Output<string?> ParametersBody { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to
        /// create the template deployment.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Specifies the JSON definition for the template.
        /// </summary>
        [Output("templateBody")]
        public Output<string> TemplateBody { get; private set; } = null!;


        /// <summary>
        /// Create a TemplateDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TemplateDeployment(string name, TemplateDeploymentArgs args, CustomResourceOptions? options = null)
            : base("azure:core/templateDeployment:TemplateDeployment", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private TemplateDeployment(string name, Input<string> id, TemplateDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("azure:core/templateDeployment:TemplateDeployment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TemplateDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TemplateDeployment Get(string name, Input<string> id, TemplateDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new TemplateDeployment(name, id, state, options);
        }
    }

    public sealed class TemplateDeploymentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
        /// Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
        /// specified within the template, and this provider will not be aware of this.
        /// </summary>
        [Input("deploymentMode", required: true)]
        public Input<string> DeploymentMode { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the template deployment. Changing this forces a
        /// new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Specifies the name and value pairs that define the deployment parameters for the template.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
        /// </summary>
        [Input("parametersBody")]
        public Input<string>? ParametersBody { get; set; }

        /// <summary>
        /// The name of the resource group in which to
        /// create the template deployment.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the JSON definition for the template.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        public TemplateDeploymentArgs()
        {
        }
    }

    public sealed class TemplateDeploymentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
        /// Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
        /// specified within the template, and this provider will not be aware of this.
        /// </summary>
        [Input("deploymentMode")]
        public Input<string>? DeploymentMode { get; set; }

        /// <summary>
        /// Specifies the name of the template deployment. Changing this forces a
        /// new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputs")]
        private InputMap<string>? _outputs;

        /// <summary>
        /// A map of supported scalar output types returned from the deployment (currently, Azure Template Deployment outputs of type String, Int and Bool are supported, and are converted to strings - others will be ignored) and can be accessed using `.outputs["name"]`.
        /// </summary>
        public InputMap<string> Outputs
        {
            get => _outputs ?? (_outputs = new InputMap<string>());
            set => _outputs = value;
        }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Specifies the name and value pairs that define the deployment parameters for the template.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
        /// </summary>
        [Input("parametersBody")]
        public Input<string>? ParametersBody { get; set; }

        /// <summary>
        /// The name of the resource group in which to
        /// create the template deployment.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Specifies the JSON definition for the template.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        public TemplateDeploymentState()
        {
        }
    }
}