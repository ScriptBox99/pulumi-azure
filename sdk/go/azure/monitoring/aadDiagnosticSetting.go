// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Active Directory Diagnostic Setting for Azure Monitor.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/monitoring"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/storage"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("west europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			Location:               exampleResourceGroup.Location,
// 			AccountTier:            pulumi.String("Standard"),
// 			AccountKind:            pulumi.String("StorageV2"),
// 			AccountReplicationType: pulumi.String("LRS"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = monitoring.NewAadDiagnosticSetting(ctx, "exampleAadDiagnosticSetting", &monitoring.AadDiagnosticSettingArgs{
// 			StorageAccountId: exampleAccount.ID(),
// 			Logs: monitoring.AadDiagnosticSettingLogArray{
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category: pulumi.String("SignInLogs"),
// 					Enabled:  pulumi.Bool(true),
// 					RetentionPolicy: &monitoring.AadDiagnosticSettingLogRetentionPolicyArgs{
// 						Enabled: pulumi.Bool(true),
// 						Days:    pulumi.Int(1),
// 					},
// 				},
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category: pulumi.String("AuditLogs"),
// 					Enabled:  pulumi.Bool(true),
// 					RetentionPolicy: &monitoring.AadDiagnosticSettingLogRetentionPolicyArgs{
// 						Enabled: pulumi.Bool(true),
// 						Days:    pulumi.Int(1),
// 					},
// 				},
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category: pulumi.String("NonInteractiveUserSignInLogs"),
// 					Enabled:  pulumi.Bool(true),
// 					RetentionPolicy: &monitoring.AadDiagnosticSettingLogRetentionPolicyArgs{
// 						Enabled: pulumi.Bool(true),
// 						Days:    pulumi.Int(1),
// 					},
// 				},
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category: pulumi.String("ServicePrincipalSignInLogs"),
// 					Enabled:  pulumi.Bool(true),
// 					RetentionPolicy: &monitoring.AadDiagnosticSettingLogRetentionPolicyArgs{
// 						Enabled: pulumi.Bool(true),
// 						Days:    pulumi.Int(1),
// 					},
// 				},
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category:        pulumi.String("ManagedIdentitySignInLogs"),
// 					Enabled:         pulumi.Bool(false),
// 					RetentionPolicy: nil,
// 				},
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category:        pulumi.String("ProvisioningLogs"),
// 					Enabled:         pulumi.Bool(false),
// 					RetentionPolicy: nil,
// 				},
// 				&monitoring.AadDiagnosticSettingLogArgs{
// 					Category:        pulumi.String("ADFSSignInLogs"),
// 					Enabled:         pulumi.Bool(false),
// 					RetentionPolicy: nil,
// 				},
// 			},
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
// Monitor Azure Active Directory Diagnostic Settings can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting example /providers/Microsoft.AADIAM/diagnosticSettings/setting1
// ```
type AadDiagnosticSetting struct {
	pulumi.CustomResourceState

	// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
	EventhubAuthorizationRuleId pulumi.StringPtrOutput `pulumi:"eventhubAuthorizationRuleId"`
	// Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
	EventhubName pulumi.StringPtrOutput `pulumi:"eventhubName"`
	// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
	LogAnalyticsWorkspaceId pulumi.StringPtrOutput `pulumi:"logAnalyticsWorkspaceId"`
	// One or more `log` blocks as defined below.
	Logs AadDiagnosticSettingLogArrayOutput `pulumi:"logs"`
	// The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
	StorageAccountId pulumi.StringPtrOutput `pulumi:"storageAccountId"`
}

// NewAadDiagnosticSetting registers a new resource with the given unique name, arguments, and options.
func NewAadDiagnosticSetting(ctx *pulumi.Context,
	name string, args *AadDiagnosticSettingArgs, opts ...pulumi.ResourceOption) (*AadDiagnosticSetting, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Logs == nil {
		return nil, errors.New("invalid value for required argument 'Logs'")
	}
	var resource AadDiagnosticSetting
	err := ctx.RegisterResource("azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAadDiagnosticSetting gets an existing AadDiagnosticSetting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAadDiagnosticSetting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AadDiagnosticSettingState, opts ...pulumi.ResourceOption) (*AadDiagnosticSetting, error) {
	var resource AadDiagnosticSetting
	err := ctx.ReadResource("azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AadDiagnosticSetting resources.
type aadDiagnosticSettingState struct {
	// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
	EventhubAuthorizationRuleId *string `pulumi:"eventhubAuthorizationRuleId"`
	// Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
	EventhubName *string `pulumi:"eventhubName"`
	// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// One or more `log` blocks as defined below.
	Logs []AadDiagnosticSettingLog `pulumi:"logs"`
	// The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
	Name *string `pulumi:"name"`
	// The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
	StorageAccountId *string `pulumi:"storageAccountId"`
}

type AadDiagnosticSettingState struct {
	// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
	EventhubAuthorizationRuleId pulumi.StringPtrInput
	// Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
	EventhubName pulumi.StringPtrInput
	// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// One or more `log` blocks as defined below.
	Logs AadDiagnosticSettingLogArrayInput
	// The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
	Name pulumi.StringPtrInput
	// The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
	StorageAccountId pulumi.StringPtrInput
}

func (AadDiagnosticSettingState) ElementType() reflect.Type {
	return reflect.TypeOf((*aadDiagnosticSettingState)(nil)).Elem()
}

type aadDiagnosticSettingArgs struct {
	// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
	EventhubAuthorizationRuleId *string `pulumi:"eventhubAuthorizationRuleId"`
	// Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
	EventhubName *string `pulumi:"eventhubName"`
	// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// One or more `log` blocks as defined below.
	Logs []AadDiagnosticSettingLog `pulumi:"logs"`
	// The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
	Name *string `pulumi:"name"`
	// The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
	StorageAccountId *string `pulumi:"storageAccountId"`
}

// The set of arguments for constructing a AadDiagnosticSetting resource.
type AadDiagnosticSettingArgs struct {
	// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
	EventhubAuthorizationRuleId pulumi.StringPtrInput
	// Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
	EventhubName pulumi.StringPtrInput
	// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// One or more `log` blocks as defined below.
	Logs AadDiagnosticSettingLogArrayInput
	// The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
	Name pulumi.StringPtrInput
	// The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
	StorageAccountId pulumi.StringPtrInput
}

func (AadDiagnosticSettingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aadDiagnosticSettingArgs)(nil)).Elem()
}

type AadDiagnosticSettingInput interface {
	pulumi.Input

	ToAadDiagnosticSettingOutput() AadDiagnosticSettingOutput
	ToAadDiagnosticSettingOutputWithContext(ctx context.Context) AadDiagnosticSettingOutput
}

func (*AadDiagnosticSetting) ElementType() reflect.Type {
	return reflect.TypeOf((*AadDiagnosticSetting)(nil))
}

func (i *AadDiagnosticSetting) ToAadDiagnosticSettingOutput() AadDiagnosticSettingOutput {
	return i.ToAadDiagnosticSettingOutputWithContext(context.Background())
}

func (i *AadDiagnosticSetting) ToAadDiagnosticSettingOutputWithContext(ctx context.Context) AadDiagnosticSettingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AadDiagnosticSettingOutput)
}

func (i *AadDiagnosticSetting) ToAadDiagnosticSettingPtrOutput() AadDiagnosticSettingPtrOutput {
	return i.ToAadDiagnosticSettingPtrOutputWithContext(context.Background())
}

func (i *AadDiagnosticSetting) ToAadDiagnosticSettingPtrOutputWithContext(ctx context.Context) AadDiagnosticSettingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AadDiagnosticSettingPtrOutput)
}

type AadDiagnosticSettingPtrInput interface {
	pulumi.Input

	ToAadDiagnosticSettingPtrOutput() AadDiagnosticSettingPtrOutput
	ToAadDiagnosticSettingPtrOutputWithContext(ctx context.Context) AadDiagnosticSettingPtrOutput
}

type aadDiagnosticSettingPtrType AadDiagnosticSettingArgs

func (*aadDiagnosticSettingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AadDiagnosticSetting)(nil))
}

func (i *aadDiagnosticSettingPtrType) ToAadDiagnosticSettingPtrOutput() AadDiagnosticSettingPtrOutput {
	return i.ToAadDiagnosticSettingPtrOutputWithContext(context.Background())
}

func (i *aadDiagnosticSettingPtrType) ToAadDiagnosticSettingPtrOutputWithContext(ctx context.Context) AadDiagnosticSettingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AadDiagnosticSettingPtrOutput)
}

// AadDiagnosticSettingArrayInput is an input type that accepts AadDiagnosticSettingArray and AadDiagnosticSettingArrayOutput values.
// You can construct a concrete instance of `AadDiagnosticSettingArrayInput` via:
//
//          AadDiagnosticSettingArray{ AadDiagnosticSettingArgs{...} }
type AadDiagnosticSettingArrayInput interface {
	pulumi.Input

	ToAadDiagnosticSettingArrayOutput() AadDiagnosticSettingArrayOutput
	ToAadDiagnosticSettingArrayOutputWithContext(context.Context) AadDiagnosticSettingArrayOutput
}

type AadDiagnosticSettingArray []AadDiagnosticSettingInput

func (AadDiagnosticSettingArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AadDiagnosticSetting)(nil))
}

func (i AadDiagnosticSettingArray) ToAadDiagnosticSettingArrayOutput() AadDiagnosticSettingArrayOutput {
	return i.ToAadDiagnosticSettingArrayOutputWithContext(context.Background())
}

func (i AadDiagnosticSettingArray) ToAadDiagnosticSettingArrayOutputWithContext(ctx context.Context) AadDiagnosticSettingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AadDiagnosticSettingArrayOutput)
}

// AadDiagnosticSettingMapInput is an input type that accepts AadDiagnosticSettingMap and AadDiagnosticSettingMapOutput values.
// You can construct a concrete instance of `AadDiagnosticSettingMapInput` via:
//
//          AadDiagnosticSettingMap{ "key": AadDiagnosticSettingArgs{...} }
type AadDiagnosticSettingMapInput interface {
	pulumi.Input

	ToAadDiagnosticSettingMapOutput() AadDiagnosticSettingMapOutput
	ToAadDiagnosticSettingMapOutputWithContext(context.Context) AadDiagnosticSettingMapOutput
}

type AadDiagnosticSettingMap map[string]AadDiagnosticSettingInput

func (AadDiagnosticSettingMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AadDiagnosticSetting)(nil))
}

func (i AadDiagnosticSettingMap) ToAadDiagnosticSettingMapOutput() AadDiagnosticSettingMapOutput {
	return i.ToAadDiagnosticSettingMapOutputWithContext(context.Background())
}

func (i AadDiagnosticSettingMap) ToAadDiagnosticSettingMapOutputWithContext(ctx context.Context) AadDiagnosticSettingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AadDiagnosticSettingMapOutput)
}

type AadDiagnosticSettingOutput struct {
	*pulumi.OutputState
}

func (AadDiagnosticSettingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AadDiagnosticSetting)(nil))
}

func (o AadDiagnosticSettingOutput) ToAadDiagnosticSettingOutput() AadDiagnosticSettingOutput {
	return o
}

func (o AadDiagnosticSettingOutput) ToAadDiagnosticSettingOutputWithContext(ctx context.Context) AadDiagnosticSettingOutput {
	return o
}

func (o AadDiagnosticSettingOutput) ToAadDiagnosticSettingPtrOutput() AadDiagnosticSettingPtrOutput {
	return o.ToAadDiagnosticSettingPtrOutputWithContext(context.Background())
}

func (o AadDiagnosticSettingOutput) ToAadDiagnosticSettingPtrOutputWithContext(ctx context.Context) AadDiagnosticSettingPtrOutput {
	return o.ApplyT(func(v AadDiagnosticSetting) *AadDiagnosticSetting {
		return &v
	}).(AadDiagnosticSettingPtrOutput)
}

type AadDiagnosticSettingPtrOutput struct {
	*pulumi.OutputState
}

func (AadDiagnosticSettingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AadDiagnosticSetting)(nil))
}

func (o AadDiagnosticSettingPtrOutput) ToAadDiagnosticSettingPtrOutput() AadDiagnosticSettingPtrOutput {
	return o
}

func (o AadDiagnosticSettingPtrOutput) ToAadDiagnosticSettingPtrOutputWithContext(ctx context.Context) AadDiagnosticSettingPtrOutput {
	return o
}

type AadDiagnosticSettingArrayOutput struct{ *pulumi.OutputState }

func (AadDiagnosticSettingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AadDiagnosticSetting)(nil))
}

func (o AadDiagnosticSettingArrayOutput) ToAadDiagnosticSettingArrayOutput() AadDiagnosticSettingArrayOutput {
	return o
}

func (o AadDiagnosticSettingArrayOutput) ToAadDiagnosticSettingArrayOutputWithContext(ctx context.Context) AadDiagnosticSettingArrayOutput {
	return o
}

func (o AadDiagnosticSettingArrayOutput) Index(i pulumi.IntInput) AadDiagnosticSettingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AadDiagnosticSetting {
		return vs[0].([]AadDiagnosticSetting)[vs[1].(int)]
	}).(AadDiagnosticSettingOutput)
}

type AadDiagnosticSettingMapOutput struct{ *pulumi.OutputState }

func (AadDiagnosticSettingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AadDiagnosticSetting)(nil))
}

func (o AadDiagnosticSettingMapOutput) ToAadDiagnosticSettingMapOutput() AadDiagnosticSettingMapOutput {
	return o
}

func (o AadDiagnosticSettingMapOutput) ToAadDiagnosticSettingMapOutputWithContext(ctx context.Context) AadDiagnosticSettingMapOutput {
	return o
}

func (o AadDiagnosticSettingMapOutput) MapIndex(k pulumi.StringInput) AadDiagnosticSettingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AadDiagnosticSetting {
		return vs[0].(map[string]AadDiagnosticSetting)[vs[1].(string)]
	}).(AadDiagnosticSettingOutput)
}

func init() {
	pulumi.RegisterOutputType(AadDiagnosticSettingOutput{})
	pulumi.RegisterOutputType(AadDiagnosticSettingPtrOutput{})
	pulumi.RegisterOutputType(AadDiagnosticSettingArrayOutput{})
	pulumi.RegisterOutputType(AadDiagnosticSettingMapOutput{})
}