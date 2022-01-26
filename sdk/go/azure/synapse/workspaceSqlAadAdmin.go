// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synapse

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Active Directory Sql Administrator setting for a Synapse Workspace
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/keyvault"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/storage"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/synapse"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			Location:               exampleResourceGroup.Location,
// 			AccountTier:            pulumi.String("Standard"),
// 			AccountReplicationType: pulumi.String("LRS"),
// 			AccountKind:            pulumi.String("StorageV2"),
// 			IsHnsEnabled:           pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleDataLakeGen2Filesystem, err := storage.NewDataLakeGen2Filesystem(ctx, "exampleDataLakeGen2Filesystem", &storage.DataLakeGen2FilesystemArgs{
// 			StorageAccountId: exampleAccount.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		current, err := core.GetClientConfig(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleKeyVault, err := keyvault.NewKeyVault(ctx, "exampleKeyVault", &keyvault.KeyVaultArgs{
// 			Location:               pulumi.Any(azurerm_resource_group.Exampl.Location),
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			TenantId:               pulumi.String(current.TenantId),
// 			SkuName:                pulumi.String("standard"),
// 			PurgeProtectionEnabled: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		deployer, err := keyvault.NewAccessPolicy(ctx, "deployer", &keyvault.AccessPolicyArgs{
// 			KeyVaultId: exampleKeyVault.ID(),
// 			TenantId:   pulumi.String(current.TenantId),
// 			ObjectId:   pulumi.String(current.ObjectId),
// 			KeyPermissions: pulumi.StringArray{
// 				pulumi.String("create"),
// 				pulumi.String("get"),
// 				pulumi.String("delete"),
// 				pulumi.String("purge"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = keyvault.NewKey(ctx, "exampleKey", &keyvault.KeyArgs{
// 			KeyVaultId: exampleKeyVault.ID(),
// 			KeyType:    pulumi.String("RSA"),
// 			KeySize:    pulumi.Int(2048),
// 			KeyOpts: pulumi.StringArray{
// 				pulumi.String("unwrapKey"),
// 				pulumi.String("wrapKey"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			deployer,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		_, err = synapse.NewWorkspace(ctx, "exampleWorkspace", &synapse.WorkspaceArgs{
// 			ResourceGroupName:               exampleResourceGroup.Name,
// 			Location:                        exampleResourceGroup.Location,
// 			StorageDataLakeGen2FilesystemId: exampleDataLakeGen2Filesystem.ID(),
// 			SqlAdministratorLogin:           pulumi.String("sqladminuser"),
// 			SqlAdministratorLoginPassword:   pulumi.String("H@Sh1CoR3!"),
// 			Tags: pulumi.StringMap{
// 				"Env": pulumi.String("production"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = synapse.NewWorkspaceSqlAadAdmin(ctx, "test", &synapse.WorkspaceSqlAadAdminArgs{
// 			SynapseWorkspaceId: pulumi.Any(azurerm_synapse_workspace.Test.Id),
// 			Login:              pulumi.String("AzureAD Admin"),
// 			ObjectId:           pulumi.String(current.ObjectId),
// 			TenantId:           pulumi.String(current.TenantId),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Synapse Workspace Azure AD Administrator can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Synapse/workspaces/workspace1/sqlAdministrators/activeDirectory
// ```
type WorkspaceSqlAadAdmin struct {
	pulumi.CustomResourceState

	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login pulumi.StringOutput `pulumi:"login"`
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId pulumi.StringOutput `pulumi:"objectId"`
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId pulumi.StringOutput `pulumi:"synapseWorkspaceId"`
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
}

// NewWorkspaceSqlAadAdmin registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceSqlAadAdmin(ctx *pulumi.Context,
	name string, args *WorkspaceSqlAadAdminArgs, opts ...pulumi.ResourceOption) (*WorkspaceSqlAadAdmin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Login == nil {
		return nil, errors.New("invalid value for required argument 'Login'")
	}
	if args.ObjectId == nil {
		return nil, errors.New("invalid value for required argument 'ObjectId'")
	}
	if args.SynapseWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'SynapseWorkspaceId'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	var resource WorkspaceSqlAadAdmin
	err := ctx.RegisterResource("azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceSqlAadAdmin gets an existing WorkspaceSqlAadAdmin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceSqlAadAdmin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceSqlAadAdminState, opts ...pulumi.ResourceOption) (*WorkspaceSqlAadAdmin, error) {
	var resource WorkspaceSqlAadAdmin
	err := ctx.ReadResource("azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceSqlAadAdmin resources.
type workspaceSqlAadAdminState struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login *string `pulumi:"login"`
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId *string `pulumi:"objectId"`
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId *string `pulumi:"synapseWorkspaceId"`
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId *string `pulumi:"tenantId"`
}

type WorkspaceSqlAadAdminState struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login pulumi.StringPtrInput
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId pulumi.StringPtrInput
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId pulumi.StringPtrInput
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId pulumi.StringPtrInput
}

func (WorkspaceSqlAadAdminState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceSqlAadAdminState)(nil)).Elem()
}

type workspaceSqlAadAdminArgs struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login string `pulumi:"login"`
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId string `pulumi:"objectId"`
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId string `pulumi:"synapseWorkspaceId"`
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId string `pulumi:"tenantId"`
}

// The set of arguments for constructing a WorkspaceSqlAadAdmin resource.
type WorkspaceSqlAadAdminArgs struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login pulumi.StringInput
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId pulumi.StringInput
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId pulumi.StringInput
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId pulumi.StringInput
}

func (WorkspaceSqlAadAdminArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceSqlAadAdminArgs)(nil)).Elem()
}

type WorkspaceSqlAadAdminInput interface {
	pulumi.Input

	ToWorkspaceSqlAadAdminOutput() WorkspaceSqlAadAdminOutput
	ToWorkspaceSqlAadAdminOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminOutput
}

func (*WorkspaceSqlAadAdmin) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceSqlAadAdmin)(nil))
}

func (i *WorkspaceSqlAadAdmin) ToWorkspaceSqlAadAdminOutput() WorkspaceSqlAadAdminOutput {
	return i.ToWorkspaceSqlAadAdminOutputWithContext(context.Background())
}

func (i *WorkspaceSqlAadAdmin) ToWorkspaceSqlAadAdminOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceSqlAadAdminOutput)
}

func (i *WorkspaceSqlAadAdmin) ToWorkspaceSqlAadAdminPtrOutput() WorkspaceSqlAadAdminPtrOutput {
	return i.ToWorkspaceSqlAadAdminPtrOutputWithContext(context.Background())
}

func (i *WorkspaceSqlAadAdmin) ToWorkspaceSqlAadAdminPtrOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceSqlAadAdminPtrOutput)
}

type WorkspaceSqlAadAdminPtrInput interface {
	pulumi.Input

	ToWorkspaceSqlAadAdminPtrOutput() WorkspaceSqlAadAdminPtrOutput
	ToWorkspaceSqlAadAdminPtrOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminPtrOutput
}

type workspaceSqlAadAdminPtrType WorkspaceSqlAadAdminArgs

func (*workspaceSqlAadAdminPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceSqlAadAdmin)(nil))
}

func (i *workspaceSqlAadAdminPtrType) ToWorkspaceSqlAadAdminPtrOutput() WorkspaceSqlAadAdminPtrOutput {
	return i.ToWorkspaceSqlAadAdminPtrOutputWithContext(context.Background())
}

func (i *workspaceSqlAadAdminPtrType) ToWorkspaceSqlAadAdminPtrOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceSqlAadAdminPtrOutput)
}

// WorkspaceSqlAadAdminArrayInput is an input type that accepts WorkspaceSqlAadAdminArray and WorkspaceSqlAadAdminArrayOutput values.
// You can construct a concrete instance of `WorkspaceSqlAadAdminArrayInput` via:
//
//          WorkspaceSqlAadAdminArray{ WorkspaceSqlAadAdminArgs{...} }
type WorkspaceSqlAadAdminArrayInput interface {
	pulumi.Input

	ToWorkspaceSqlAadAdminArrayOutput() WorkspaceSqlAadAdminArrayOutput
	ToWorkspaceSqlAadAdminArrayOutputWithContext(context.Context) WorkspaceSqlAadAdminArrayOutput
}

type WorkspaceSqlAadAdminArray []WorkspaceSqlAadAdminInput

func (WorkspaceSqlAadAdminArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceSqlAadAdmin)(nil)).Elem()
}

func (i WorkspaceSqlAadAdminArray) ToWorkspaceSqlAadAdminArrayOutput() WorkspaceSqlAadAdminArrayOutput {
	return i.ToWorkspaceSqlAadAdminArrayOutputWithContext(context.Background())
}

func (i WorkspaceSqlAadAdminArray) ToWorkspaceSqlAadAdminArrayOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceSqlAadAdminArrayOutput)
}

// WorkspaceSqlAadAdminMapInput is an input type that accepts WorkspaceSqlAadAdminMap and WorkspaceSqlAadAdminMapOutput values.
// You can construct a concrete instance of `WorkspaceSqlAadAdminMapInput` via:
//
//          WorkspaceSqlAadAdminMap{ "key": WorkspaceSqlAadAdminArgs{...} }
type WorkspaceSqlAadAdminMapInput interface {
	pulumi.Input

	ToWorkspaceSqlAadAdminMapOutput() WorkspaceSqlAadAdminMapOutput
	ToWorkspaceSqlAadAdminMapOutputWithContext(context.Context) WorkspaceSqlAadAdminMapOutput
}

type WorkspaceSqlAadAdminMap map[string]WorkspaceSqlAadAdminInput

func (WorkspaceSqlAadAdminMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceSqlAadAdmin)(nil)).Elem()
}

func (i WorkspaceSqlAadAdminMap) ToWorkspaceSqlAadAdminMapOutput() WorkspaceSqlAadAdminMapOutput {
	return i.ToWorkspaceSqlAadAdminMapOutputWithContext(context.Background())
}

func (i WorkspaceSqlAadAdminMap) ToWorkspaceSqlAadAdminMapOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceSqlAadAdminMapOutput)
}

type WorkspaceSqlAadAdminOutput struct{ *pulumi.OutputState }

func (WorkspaceSqlAadAdminOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceSqlAadAdmin)(nil))
}

func (o WorkspaceSqlAadAdminOutput) ToWorkspaceSqlAadAdminOutput() WorkspaceSqlAadAdminOutput {
	return o
}

func (o WorkspaceSqlAadAdminOutput) ToWorkspaceSqlAadAdminOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminOutput {
	return o
}

func (o WorkspaceSqlAadAdminOutput) ToWorkspaceSqlAadAdminPtrOutput() WorkspaceSqlAadAdminPtrOutput {
	return o.ToWorkspaceSqlAadAdminPtrOutputWithContext(context.Background())
}

func (o WorkspaceSqlAadAdminOutput) ToWorkspaceSqlAadAdminPtrOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v WorkspaceSqlAadAdmin) *WorkspaceSqlAadAdmin {
		return &v
	}).(WorkspaceSqlAadAdminPtrOutput)
}

type WorkspaceSqlAadAdminPtrOutput struct{ *pulumi.OutputState }

func (WorkspaceSqlAadAdminPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceSqlAadAdmin)(nil))
}

func (o WorkspaceSqlAadAdminPtrOutput) ToWorkspaceSqlAadAdminPtrOutput() WorkspaceSqlAadAdminPtrOutput {
	return o
}

func (o WorkspaceSqlAadAdminPtrOutput) ToWorkspaceSqlAadAdminPtrOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminPtrOutput {
	return o
}

func (o WorkspaceSqlAadAdminPtrOutput) Elem() WorkspaceSqlAadAdminOutput {
	return o.ApplyT(func(v *WorkspaceSqlAadAdmin) WorkspaceSqlAadAdmin {
		if v != nil {
			return *v
		}
		var ret WorkspaceSqlAadAdmin
		return ret
	}).(WorkspaceSqlAadAdminOutput)
}

type WorkspaceSqlAadAdminArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceSqlAadAdminArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceSqlAadAdmin)(nil))
}

func (o WorkspaceSqlAadAdminArrayOutput) ToWorkspaceSqlAadAdminArrayOutput() WorkspaceSqlAadAdminArrayOutput {
	return o
}

func (o WorkspaceSqlAadAdminArrayOutput) ToWorkspaceSqlAadAdminArrayOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminArrayOutput {
	return o
}

func (o WorkspaceSqlAadAdminArrayOutput) Index(i pulumi.IntInput) WorkspaceSqlAadAdminOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WorkspaceSqlAadAdmin {
		return vs[0].([]WorkspaceSqlAadAdmin)[vs[1].(int)]
	}).(WorkspaceSqlAadAdminOutput)
}

type WorkspaceSqlAadAdminMapOutput struct{ *pulumi.OutputState }

func (WorkspaceSqlAadAdminMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]WorkspaceSqlAadAdmin)(nil))
}

func (o WorkspaceSqlAadAdminMapOutput) ToWorkspaceSqlAadAdminMapOutput() WorkspaceSqlAadAdminMapOutput {
	return o
}

func (o WorkspaceSqlAadAdminMapOutput) ToWorkspaceSqlAadAdminMapOutputWithContext(ctx context.Context) WorkspaceSqlAadAdminMapOutput {
	return o
}

func (o WorkspaceSqlAadAdminMapOutput) MapIndex(k pulumi.StringInput) WorkspaceSqlAadAdminOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) WorkspaceSqlAadAdmin {
		return vs[0].(map[string]WorkspaceSqlAadAdmin)[vs[1].(string)]
	}).(WorkspaceSqlAadAdminOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceSqlAadAdminInput)(nil)).Elem(), &WorkspaceSqlAadAdmin{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceSqlAadAdminPtrInput)(nil)).Elem(), &WorkspaceSqlAadAdmin{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceSqlAadAdminArrayInput)(nil)).Elem(), WorkspaceSqlAadAdminArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceSqlAadAdminMapInput)(nil)).Elem(), WorkspaceSqlAadAdminMap{})
	pulumi.RegisterOutputType(WorkspaceSqlAadAdminOutput{})
	pulumi.RegisterOutputType(WorkspaceSqlAadAdminPtrOutput{})
	pulumi.RegisterOutputType(WorkspaceSqlAadAdminArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceSqlAadAdminMapOutput{})
}