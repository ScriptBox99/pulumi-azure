// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql
{
    /// <summary>
    /// Allows you to set a user, group or service principal as the AAD Administrator for an Azure SQL Managed Instance.
    /// 
    /// ## Import
    /// 
    /// An Azure SQL Active Directory Administrator can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator administrator /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/mymanagedinstance/administrators/activeDirectory
    /// ```
    /// </summary>
    [AzureResourceType("azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator")]
    public partial class ManagedInstanceActiveDirectoryAdministrator : Pulumi.CustomResource
    {
        /// <summary>
        /// When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users. Defaults to `false`.
        /// </summary>
        [Output("azureadAuthenticationOnly")]
        public Output<bool?> AzureadAuthenticationOnly { get; private set; } = null!;

        /// <summary>
        /// The login name of the principal to set as the Managed Instance Administrator.
        /// </summary>
        [Output("loginUsername")]
        public Output<string> LoginUsername { get; private set; } = null!;

        /// <summary>
        /// The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
        /// </summary>
        [Output("managedInstanceId")]
        public Output<string> ManagedInstanceId { get; private set; } = null!;

        /// <summary>
        /// The Object ID of the principal to set as the Managed Instance Administrator.
        /// </summary>
        [Output("objectId")]
        public Output<string> ObjectId { get; private set; } = null!;

        /// <summary>
        /// The Azure Active Directory Tenant ID.
        /// </summary>
        [Output("tenantId")]
        public Output<string> TenantId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedInstanceActiveDirectoryAdministrator resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedInstanceActiveDirectoryAdministrator(string name, ManagedInstanceActiveDirectoryAdministratorArgs args, CustomResourceOptions? options = null)
            : base("azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator", name, args ?? new ManagedInstanceActiveDirectoryAdministratorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedInstanceActiveDirectoryAdministrator(string name, Input<string> id, ManagedInstanceActiveDirectoryAdministratorState? state = null, CustomResourceOptions? options = null)
            : base("azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedInstanceActiveDirectoryAdministrator resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedInstanceActiveDirectoryAdministrator Get(string name, Input<string> id, ManagedInstanceActiveDirectoryAdministratorState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedInstanceActiveDirectoryAdministrator(name, id, state, options);
        }
    }

    public sealed class ManagedInstanceActiveDirectoryAdministratorArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users. Defaults to `false`.
        /// </summary>
        [Input("azureadAuthenticationOnly")]
        public Input<bool>? AzureadAuthenticationOnly { get; set; }

        /// <summary>
        /// The login name of the principal to set as the Managed Instance Administrator.
        /// </summary>
        [Input("loginUsername", required: true)]
        public Input<string> LoginUsername { get; set; } = null!;

        /// <summary>
        /// The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managedInstanceId", required: true)]
        public Input<string> ManagedInstanceId { get; set; } = null!;

        /// <summary>
        /// The Object ID of the principal to set as the Managed Instance Administrator.
        /// </summary>
        [Input("objectId", required: true)]
        public Input<string> ObjectId { get; set; } = null!;

        /// <summary>
        /// The Azure Active Directory Tenant ID.
        /// </summary>
        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        public ManagedInstanceActiveDirectoryAdministratorArgs()
        {
        }
    }

    public sealed class ManagedInstanceActiveDirectoryAdministratorState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users. Defaults to `false`.
        /// </summary>
        [Input("azureadAuthenticationOnly")]
        public Input<bool>? AzureadAuthenticationOnly { get; set; }

        /// <summary>
        /// The login name of the principal to set as the Managed Instance Administrator.
        /// </summary>
        [Input("loginUsername")]
        public Input<string>? LoginUsername { get; set; }

        /// <summary>
        /// The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managedInstanceId")]
        public Input<string>? ManagedInstanceId { get; set; }

        /// <summary>
        /// The Object ID of the principal to set as the Managed Instance Administrator.
        /// </summary>
        [Input("objectId")]
        public Input<string>? ObjectId { get; set; }

        /// <summary>
        /// The Azure Active Directory Tenant ID.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public ManagedInstanceActiveDirectoryAdministratorState()
        {
        }
    }
}