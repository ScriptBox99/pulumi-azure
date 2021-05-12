// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package management

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Management Group Subscription Association.
//
// !> **Note:** When using this resource, configuring `subscriptionIds` on the `management.Group` resource is not supported.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/management"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "exampleManagementGroup"
// 		exampleGroup, err := management.LookupGroup(ctx, &management.LookupGroupArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := "12345678-1234-1234-1234-123456789012"
// 		exampleSubscription, err := core.LookupSubscription(ctx, &core.LookupSubscriptionArgs{
// 			SubscriptionId: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = management.NewGroupSubscriptionAssociate(ctx, "exampleGroupSubscriptionAssociate", &management.GroupSubscriptionAssociateArgs{
// 			ManagementGroupId: pulumi.String(exampleGroup.Id),
// 			SubscriptionId:    pulumi.String(exampleSubscription.Id),
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
// Managements can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:management/groupSubscriptionAssociate:GroupSubscriptionAssociate example /managementGroup/MyManagementGroup/subscription/12345678-1234-1234-1234-123456789012
// ```
type GroupSubscriptionAssociate struct {
	pulumi.CustomResourceState

	// The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
	ManagementGroupId pulumi.StringOutput `pulumi:"managementGroupId"`
	// The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
	SubscriptionId pulumi.StringOutput `pulumi:"subscriptionId"`
}

// NewGroupSubscriptionAssociate registers a new resource with the given unique name, arguments, and options.
func NewGroupSubscriptionAssociate(ctx *pulumi.Context,
	name string, args *GroupSubscriptionAssociateArgs, opts ...pulumi.ResourceOption) (*GroupSubscriptionAssociate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ManagementGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ManagementGroupId'")
	}
	if args.SubscriptionId == nil {
		return nil, errors.New("invalid value for required argument 'SubscriptionId'")
	}
	var resource GroupSubscriptionAssociate
	err := ctx.RegisterResource("azure:management/groupSubscriptionAssociate:GroupSubscriptionAssociate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupSubscriptionAssociate gets an existing GroupSubscriptionAssociate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupSubscriptionAssociate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupSubscriptionAssociateState, opts ...pulumi.ResourceOption) (*GroupSubscriptionAssociate, error) {
	var resource GroupSubscriptionAssociate
	err := ctx.ReadResource("azure:management/groupSubscriptionAssociate:GroupSubscriptionAssociate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupSubscriptionAssociate resources.
type groupSubscriptionAssociateState struct {
	// The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
	ManagementGroupId *string `pulumi:"managementGroupId"`
	// The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
	SubscriptionId *string `pulumi:"subscriptionId"`
}

type GroupSubscriptionAssociateState struct {
	// The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
	ManagementGroupId pulumi.StringPtrInput
	// The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
	SubscriptionId pulumi.StringPtrInput
}

func (GroupSubscriptionAssociateState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupSubscriptionAssociateState)(nil)).Elem()
}

type groupSubscriptionAssociateArgs struct {
	// The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
	ManagementGroupId string `pulumi:"managementGroupId"`
	// The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
	SubscriptionId string `pulumi:"subscriptionId"`
}

// The set of arguments for constructing a GroupSubscriptionAssociate resource.
type GroupSubscriptionAssociateArgs struct {
	// The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
	ManagementGroupId pulumi.StringInput
	// The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
	SubscriptionId pulumi.StringInput
}

func (GroupSubscriptionAssociateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupSubscriptionAssociateArgs)(nil)).Elem()
}

type GroupSubscriptionAssociateInput interface {
	pulumi.Input

	ToGroupSubscriptionAssociateOutput() GroupSubscriptionAssociateOutput
	ToGroupSubscriptionAssociateOutputWithContext(ctx context.Context) GroupSubscriptionAssociateOutput
}

func (*GroupSubscriptionAssociate) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupSubscriptionAssociate)(nil))
}

func (i *GroupSubscriptionAssociate) ToGroupSubscriptionAssociateOutput() GroupSubscriptionAssociateOutput {
	return i.ToGroupSubscriptionAssociateOutputWithContext(context.Background())
}

func (i *GroupSubscriptionAssociate) ToGroupSubscriptionAssociateOutputWithContext(ctx context.Context) GroupSubscriptionAssociateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupSubscriptionAssociateOutput)
}

func (i *GroupSubscriptionAssociate) ToGroupSubscriptionAssociatePtrOutput() GroupSubscriptionAssociatePtrOutput {
	return i.ToGroupSubscriptionAssociatePtrOutputWithContext(context.Background())
}

func (i *GroupSubscriptionAssociate) ToGroupSubscriptionAssociatePtrOutputWithContext(ctx context.Context) GroupSubscriptionAssociatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupSubscriptionAssociatePtrOutput)
}

type GroupSubscriptionAssociatePtrInput interface {
	pulumi.Input

	ToGroupSubscriptionAssociatePtrOutput() GroupSubscriptionAssociatePtrOutput
	ToGroupSubscriptionAssociatePtrOutputWithContext(ctx context.Context) GroupSubscriptionAssociatePtrOutput
}

type groupSubscriptionAssociatePtrType GroupSubscriptionAssociateArgs

func (*groupSubscriptionAssociatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupSubscriptionAssociate)(nil))
}

func (i *groupSubscriptionAssociatePtrType) ToGroupSubscriptionAssociatePtrOutput() GroupSubscriptionAssociatePtrOutput {
	return i.ToGroupSubscriptionAssociatePtrOutputWithContext(context.Background())
}

func (i *groupSubscriptionAssociatePtrType) ToGroupSubscriptionAssociatePtrOutputWithContext(ctx context.Context) GroupSubscriptionAssociatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupSubscriptionAssociatePtrOutput)
}

// GroupSubscriptionAssociateArrayInput is an input type that accepts GroupSubscriptionAssociateArray and GroupSubscriptionAssociateArrayOutput values.
// You can construct a concrete instance of `GroupSubscriptionAssociateArrayInput` via:
//
//          GroupSubscriptionAssociateArray{ GroupSubscriptionAssociateArgs{...} }
type GroupSubscriptionAssociateArrayInput interface {
	pulumi.Input

	ToGroupSubscriptionAssociateArrayOutput() GroupSubscriptionAssociateArrayOutput
	ToGroupSubscriptionAssociateArrayOutputWithContext(context.Context) GroupSubscriptionAssociateArrayOutput
}

type GroupSubscriptionAssociateArray []GroupSubscriptionAssociateInput

func (GroupSubscriptionAssociateArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*GroupSubscriptionAssociate)(nil))
}

func (i GroupSubscriptionAssociateArray) ToGroupSubscriptionAssociateArrayOutput() GroupSubscriptionAssociateArrayOutput {
	return i.ToGroupSubscriptionAssociateArrayOutputWithContext(context.Background())
}

func (i GroupSubscriptionAssociateArray) ToGroupSubscriptionAssociateArrayOutputWithContext(ctx context.Context) GroupSubscriptionAssociateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupSubscriptionAssociateArrayOutput)
}

// GroupSubscriptionAssociateMapInput is an input type that accepts GroupSubscriptionAssociateMap and GroupSubscriptionAssociateMapOutput values.
// You can construct a concrete instance of `GroupSubscriptionAssociateMapInput` via:
//
//          GroupSubscriptionAssociateMap{ "key": GroupSubscriptionAssociateArgs{...} }
type GroupSubscriptionAssociateMapInput interface {
	pulumi.Input

	ToGroupSubscriptionAssociateMapOutput() GroupSubscriptionAssociateMapOutput
	ToGroupSubscriptionAssociateMapOutputWithContext(context.Context) GroupSubscriptionAssociateMapOutput
}

type GroupSubscriptionAssociateMap map[string]GroupSubscriptionAssociateInput

func (GroupSubscriptionAssociateMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*GroupSubscriptionAssociate)(nil))
}

func (i GroupSubscriptionAssociateMap) ToGroupSubscriptionAssociateMapOutput() GroupSubscriptionAssociateMapOutput {
	return i.ToGroupSubscriptionAssociateMapOutputWithContext(context.Background())
}

func (i GroupSubscriptionAssociateMap) ToGroupSubscriptionAssociateMapOutputWithContext(ctx context.Context) GroupSubscriptionAssociateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupSubscriptionAssociateMapOutput)
}

type GroupSubscriptionAssociateOutput struct {
	*pulumi.OutputState
}

func (GroupSubscriptionAssociateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupSubscriptionAssociate)(nil))
}

func (o GroupSubscriptionAssociateOutput) ToGroupSubscriptionAssociateOutput() GroupSubscriptionAssociateOutput {
	return o
}

func (o GroupSubscriptionAssociateOutput) ToGroupSubscriptionAssociateOutputWithContext(ctx context.Context) GroupSubscriptionAssociateOutput {
	return o
}

func (o GroupSubscriptionAssociateOutput) ToGroupSubscriptionAssociatePtrOutput() GroupSubscriptionAssociatePtrOutput {
	return o.ToGroupSubscriptionAssociatePtrOutputWithContext(context.Background())
}

func (o GroupSubscriptionAssociateOutput) ToGroupSubscriptionAssociatePtrOutputWithContext(ctx context.Context) GroupSubscriptionAssociatePtrOutput {
	return o.ApplyT(func(v GroupSubscriptionAssociate) *GroupSubscriptionAssociate {
		return &v
	}).(GroupSubscriptionAssociatePtrOutput)
}

type GroupSubscriptionAssociatePtrOutput struct {
	*pulumi.OutputState
}

func (GroupSubscriptionAssociatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupSubscriptionAssociate)(nil))
}

func (o GroupSubscriptionAssociatePtrOutput) ToGroupSubscriptionAssociatePtrOutput() GroupSubscriptionAssociatePtrOutput {
	return o
}

func (o GroupSubscriptionAssociatePtrOutput) ToGroupSubscriptionAssociatePtrOutputWithContext(ctx context.Context) GroupSubscriptionAssociatePtrOutput {
	return o
}

type GroupSubscriptionAssociateArrayOutput struct{ *pulumi.OutputState }

func (GroupSubscriptionAssociateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GroupSubscriptionAssociate)(nil))
}

func (o GroupSubscriptionAssociateArrayOutput) ToGroupSubscriptionAssociateArrayOutput() GroupSubscriptionAssociateArrayOutput {
	return o
}

func (o GroupSubscriptionAssociateArrayOutput) ToGroupSubscriptionAssociateArrayOutputWithContext(ctx context.Context) GroupSubscriptionAssociateArrayOutput {
	return o
}

func (o GroupSubscriptionAssociateArrayOutput) Index(i pulumi.IntInput) GroupSubscriptionAssociateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GroupSubscriptionAssociate {
		return vs[0].([]GroupSubscriptionAssociate)[vs[1].(int)]
	}).(GroupSubscriptionAssociateOutput)
}

type GroupSubscriptionAssociateMapOutput struct{ *pulumi.OutputState }

func (GroupSubscriptionAssociateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]GroupSubscriptionAssociate)(nil))
}

func (o GroupSubscriptionAssociateMapOutput) ToGroupSubscriptionAssociateMapOutput() GroupSubscriptionAssociateMapOutput {
	return o
}

func (o GroupSubscriptionAssociateMapOutput) ToGroupSubscriptionAssociateMapOutputWithContext(ctx context.Context) GroupSubscriptionAssociateMapOutput {
	return o
}

func (o GroupSubscriptionAssociateMapOutput) MapIndex(k pulumi.StringInput) GroupSubscriptionAssociateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) GroupSubscriptionAssociate {
		return vs[0].(map[string]GroupSubscriptionAssociate)[vs[1].(string)]
	}).(GroupSubscriptionAssociateOutput)
}

func init() {
	pulumi.RegisterOutputType(GroupSubscriptionAssociateOutput{})
	pulumi.RegisterOutputType(GroupSubscriptionAssociatePtrOutput{})
	pulumi.RegisterOutputType(GroupSubscriptionAssociateArrayOutput{})
	pulumi.RegisterOutputType(GroupSubscriptionAssociateMapOutput{})
}