// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package relay

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Relay Namespace Authorization Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/relay"
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
// 		exampleNamespace, err := relay.NewNamespace(ctx, "exampleNamespace", &relay.NamespaceArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			SkuName:           pulumi.String("Standard"),
// 			Tags: pulumi.StringMap{
// 				"source": pulumi.String("terraform"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = relay.NewNamespaceAuthorizationRule(ctx, "exampleNamespaceAuthorizationRule", &relay.NamespaceAuthorizationRuleArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			NamespaceName:     exampleNamespace.Name,
// 			Listen:            pulumi.Bool(true),
// 			Send:              pulumi.Bool(true),
// 			Manage:            pulumi.Bool(false),
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
// Azure Relay Namespace Authorization Rules can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:relay/namespaceAuthorizationRule:NamespaceAuthorizationRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Relay/namespaces/namespace1/authorizationRules/rule1
// ```
type NamespaceAuthorizationRule struct {
	pulumi.CustomResourceState

	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrOutput `pulumi:"listen"`
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage pulumi.BoolPtrOutput `pulumi:"manage"`
	// The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// The Primary Connection String for the Azure Relay Namespace Authorization Rule.
	PrimaryConnectionString pulumi.StringOutput `pulumi:"primaryConnectionString"`
	// The Primary Key for the Azure Relay Namespace Authorization Rule.
	PrimaryKey pulumi.StringOutput `pulumi:"primaryKey"`
	// The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
	SecondaryConnectionString pulumi.StringOutput `pulumi:"secondaryConnectionString"`
	// The Secondary Key for the Azure Relay Namespace Authorization Rule.
	SecondaryKey pulumi.StringOutput `pulumi:"secondaryKey"`
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrOutput `pulumi:"send"`
}

// NewNamespaceAuthorizationRule registers a new resource with the given unique name, arguments, and options.
func NewNamespaceAuthorizationRule(ctx *pulumi.Context,
	name string, args *NamespaceAuthorizationRuleArgs, opts ...pulumi.ResourceOption) (*NamespaceAuthorizationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	var resource NamespaceAuthorizationRule
	err := ctx.RegisterResource("azure:relay/namespaceAuthorizationRule:NamespaceAuthorizationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNamespaceAuthorizationRule gets an existing NamespaceAuthorizationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNamespaceAuthorizationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NamespaceAuthorizationRuleState, opts ...pulumi.ResourceOption) (*NamespaceAuthorizationRule, error) {
	var resource NamespaceAuthorizationRule
	err := ctx.ReadResource("azure:relay/namespaceAuthorizationRule:NamespaceAuthorizationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NamespaceAuthorizationRule resources.
type namespaceAuthorizationRuleState struct {
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	Name *string `pulumi:"name"`
	// Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	NamespaceName *string `pulumi:"namespaceName"`
	// The Primary Connection String for the Azure Relay Namespace Authorization Rule.
	PrimaryConnectionString *string `pulumi:"primaryConnectionString"`
	// The Primary Key for the Azure Relay Namespace Authorization Rule.
	PrimaryKey *string `pulumi:"primaryKey"`
	// The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
	SecondaryConnectionString *string `pulumi:"secondaryConnectionString"`
	// The Secondary Key for the Azure Relay Namespace Authorization Rule.
	SecondaryKey *string `pulumi:"secondaryKey"`
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
}

type NamespaceAuthorizationRuleState struct {
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	Name pulumi.StringPtrInput
	// Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	NamespaceName pulumi.StringPtrInput
	// The Primary Connection String for the Azure Relay Namespace Authorization Rule.
	PrimaryConnectionString pulumi.StringPtrInput
	// The Primary Key for the Azure Relay Namespace Authorization Rule.
	PrimaryKey pulumi.StringPtrInput
	// The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
	SecondaryConnectionString pulumi.StringPtrInput
	// The Secondary Key for the Azure Relay Namespace Authorization Rule.
	SecondaryKey pulumi.StringPtrInput
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
}

func (NamespaceAuthorizationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceAuthorizationRuleState)(nil)).Elem()
}

type namespaceAuthorizationRuleArgs struct {
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	Name *string `pulumi:"name"`
	// Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	NamespaceName string `pulumi:"namespaceName"`
	// The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
}

// The set of arguments for constructing a NamespaceAuthorizationRule resource.
type NamespaceAuthorizationRuleArgs struct {
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	Name pulumi.StringPtrInput
	// Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	NamespaceName pulumi.StringInput
	// The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
	ResourceGroupName pulumi.StringInput
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
}

func (NamespaceAuthorizationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceAuthorizationRuleArgs)(nil)).Elem()
}

type NamespaceAuthorizationRuleInput interface {
	pulumi.Input

	ToNamespaceAuthorizationRuleOutput() NamespaceAuthorizationRuleOutput
	ToNamespaceAuthorizationRuleOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleOutput
}

func (*NamespaceAuthorizationRule) ElementType() reflect.Type {
	return reflect.TypeOf((*NamespaceAuthorizationRule)(nil))
}

func (i *NamespaceAuthorizationRule) ToNamespaceAuthorizationRuleOutput() NamespaceAuthorizationRuleOutput {
	return i.ToNamespaceAuthorizationRuleOutputWithContext(context.Background())
}

func (i *NamespaceAuthorizationRule) ToNamespaceAuthorizationRuleOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceAuthorizationRuleOutput)
}

func (i *NamespaceAuthorizationRule) ToNamespaceAuthorizationRulePtrOutput() NamespaceAuthorizationRulePtrOutput {
	return i.ToNamespaceAuthorizationRulePtrOutputWithContext(context.Background())
}

func (i *NamespaceAuthorizationRule) ToNamespaceAuthorizationRulePtrOutputWithContext(ctx context.Context) NamespaceAuthorizationRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceAuthorizationRulePtrOutput)
}

type NamespaceAuthorizationRulePtrInput interface {
	pulumi.Input

	ToNamespaceAuthorizationRulePtrOutput() NamespaceAuthorizationRulePtrOutput
	ToNamespaceAuthorizationRulePtrOutputWithContext(ctx context.Context) NamespaceAuthorizationRulePtrOutput
}

type namespaceAuthorizationRulePtrType NamespaceAuthorizationRuleArgs

func (*namespaceAuthorizationRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NamespaceAuthorizationRule)(nil))
}

func (i *namespaceAuthorizationRulePtrType) ToNamespaceAuthorizationRulePtrOutput() NamespaceAuthorizationRulePtrOutput {
	return i.ToNamespaceAuthorizationRulePtrOutputWithContext(context.Background())
}

func (i *namespaceAuthorizationRulePtrType) ToNamespaceAuthorizationRulePtrOutputWithContext(ctx context.Context) NamespaceAuthorizationRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceAuthorizationRulePtrOutput)
}

// NamespaceAuthorizationRuleArrayInput is an input type that accepts NamespaceAuthorizationRuleArray and NamespaceAuthorizationRuleArrayOutput values.
// You can construct a concrete instance of `NamespaceAuthorizationRuleArrayInput` via:
//
//          NamespaceAuthorizationRuleArray{ NamespaceAuthorizationRuleArgs{...} }
type NamespaceAuthorizationRuleArrayInput interface {
	pulumi.Input

	ToNamespaceAuthorizationRuleArrayOutput() NamespaceAuthorizationRuleArrayOutput
	ToNamespaceAuthorizationRuleArrayOutputWithContext(context.Context) NamespaceAuthorizationRuleArrayOutput
}

type NamespaceAuthorizationRuleArray []NamespaceAuthorizationRuleInput

func (NamespaceAuthorizationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NamespaceAuthorizationRule)(nil)).Elem()
}

func (i NamespaceAuthorizationRuleArray) ToNamespaceAuthorizationRuleArrayOutput() NamespaceAuthorizationRuleArrayOutput {
	return i.ToNamespaceAuthorizationRuleArrayOutputWithContext(context.Background())
}

func (i NamespaceAuthorizationRuleArray) ToNamespaceAuthorizationRuleArrayOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceAuthorizationRuleArrayOutput)
}

// NamespaceAuthorizationRuleMapInput is an input type that accepts NamespaceAuthorizationRuleMap and NamespaceAuthorizationRuleMapOutput values.
// You can construct a concrete instance of `NamespaceAuthorizationRuleMapInput` via:
//
//          NamespaceAuthorizationRuleMap{ "key": NamespaceAuthorizationRuleArgs{...} }
type NamespaceAuthorizationRuleMapInput interface {
	pulumi.Input

	ToNamespaceAuthorizationRuleMapOutput() NamespaceAuthorizationRuleMapOutput
	ToNamespaceAuthorizationRuleMapOutputWithContext(context.Context) NamespaceAuthorizationRuleMapOutput
}

type NamespaceAuthorizationRuleMap map[string]NamespaceAuthorizationRuleInput

func (NamespaceAuthorizationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NamespaceAuthorizationRule)(nil)).Elem()
}

func (i NamespaceAuthorizationRuleMap) ToNamespaceAuthorizationRuleMapOutput() NamespaceAuthorizationRuleMapOutput {
	return i.ToNamespaceAuthorizationRuleMapOutputWithContext(context.Background())
}

func (i NamespaceAuthorizationRuleMap) ToNamespaceAuthorizationRuleMapOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceAuthorizationRuleMapOutput)
}

type NamespaceAuthorizationRuleOutput struct{ *pulumi.OutputState }

func (NamespaceAuthorizationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NamespaceAuthorizationRule)(nil))
}

func (o NamespaceAuthorizationRuleOutput) ToNamespaceAuthorizationRuleOutput() NamespaceAuthorizationRuleOutput {
	return o
}

func (o NamespaceAuthorizationRuleOutput) ToNamespaceAuthorizationRuleOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleOutput {
	return o
}

func (o NamespaceAuthorizationRuleOutput) ToNamespaceAuthorizationRulePtrOutput() NamespaceAuthorizationRulePtrOutput {
	return o.ToNamespaceAuthorizationRulePtrOutputWithContext(context.Background())
}

func (o NamespaceAuthorizationRuleOutput) ToNamespaceAuthorizationRulePtrOutputWithContext(ctx context.Context) NamespaceAuthorizationRulePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v NamespaceAuthorizationRule) *NamespaceAuthorizationRule {
		return &v
	}).(NamespaceAuthorizationRulePtrOutput)
}

type NamespaceAuthorizationRulePtrOutput struct{ *pulumi.OutputState }

func (NamespaceAuthorizationRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NamespaceAuthorizationRule)(nil))
}

func (o NamespaceAuthorizationRulePtrOutput) ToNamespaceAuthorizationRulePtrOutput() NamespaceAuthorizationRulePtrOutput {
	return o
}

func (o NamespaceAuthorizationRulePtrOutput) ToNamespaceAuthorizationRulePtrOutputWithContext(ctx context.Context) NamespaceAuthorizationRulePtrOutput {
	return o
}

func (o NamespaceAuthorizationRulePtrOutput) Elem() NamespaceAuthorizationRuleOutput {
	return o.ApplyT(func(v *NamespaceAuthorizationRule) NamespaceAuthorizationRule {
		if v != nil {
			return *v
		}
		var ret NamespaceAuthorizationRule
		return ret
	}).(NamespaceAuthorizationRuleOutput)
}

type NamespaceAuthorizationRuleArrayOutput struct{ *pulumi.OutputState }

func (NamespaceAuthorizationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NamespaceAuthorizationRule)(nil))
}

func (o NamespaceAuthorizationRuleArrayOutput) ToNamespaceAuthorizationRuleArrayOutput() NamespaceAuthorizationRuleArrayOutput {
	return o
}

func (o NamespaceAuthorizationRuleArrayOutput) ToNamespaceAuthorizationRuleArrayOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleArrayOutput {
	return o
}

func (o NamespaceAuthorizationRuleArrayOutput) Index(i pulumi.IntInput) NamespaceAuthorizationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NamespaceAuthorizationRule {
		return vs[0].([]NamespaceAuthorizationRule)[vs[1].(int)]
	}).(NamespaceAuthorizationRuleOutput)
}

type NamespaceAuthorizationRuleMapOutput struct{ *pulumi.OutputState }

func (NamespaceAuthorizationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NamespaceAuthorizationRule)(nil))
}

func (o NamespaceAuthorizationRuleMapOutput) ToNamespaceAuthorizationRuleMapOutput() NamespaceAuthorizationRuleMapOutput {
	return o
}

func (o NamespaceAuthorizationRuleMapOutput) ToNamespaceAuthorizationRuleMapOutputWithContext(ctx context.Context) NamespaceAuthorizationRuleMapOutput {
	return o
}

func (o NamespaceAuthorizationRuleMapOutput) MapIndex(k pulumi.StringInput) NamespaceAuthorizationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NamespaceAuthorizationRule {
		return vs[0].(map[string]NamespaceAuthorizationRule)[vs[1].(string)]
	}).(NamespaceAuthorizationRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(NamespaceAuthorizationRuleOutput{})
	pulumi.RegisterOutputType(NamespaceAuthorizationRulePtrOutput{})
	pulumi.RegisterOutputType(NamespaceAuthorizationRuleArrayOutput{})
	pulumi.RegisterOutputType(NamespaceAuthorizationRuleMapOutput{})
}