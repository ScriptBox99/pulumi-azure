// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pim

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Pim Eligible Role Assignment.
//
// ## Example Usage
// ### Subscription)
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/pim"
//	"github.com/pulumi/pulumi-time/sdk/go/time"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			primary, err := core.LookupSubscription(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			exampleClientConfig, err := core.GetClientConfig(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			exampleRoleDefinition, err := authorization.LookupRoleDefinition(ctx, &authorization.LookupRoleDefinitionArgs{
//				Name: pulumi.StringRef("Reader"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleStatic, err := time.NewStatic(ctx, "exampleStatic", nil)
//			if err != nil {
//				return err
//			}
//			_, err = pim.NewEligibleRoleAssignment(ctx, "exampleEligibleRoleAssignment", &pim.EligibleRoleAssignmentArgs{
//				Scope:            *pulumi.String(primary.Id),
//				RoleDefinitionId: pulumi.String(fmt.Sprintf("%v%v", primary.Id, exampleRoleDefinition.Id)),
//				PrincipalId:      *pulumi.String(exampleClientConfig.ObjectId),
//				Schedule: &pim.EligibleRoleAssignmentScheduleArgs{
//					StartDateTime: exampleStatic.Rfc3339,
//					Expiration: &pim.EligibleRoleAssignmentScheduleExpirationArgs{
//						DurationHours: pulumi.Int(8),
//					},
//				},
//				Justification: pulumi.String("Expiration Duration Set"),
//				Ticket: &pim.EligibleRoleAssignmentTicketArgs{
//					Number: pulumi.String("1"),
//					System: pulumi.String("example ticket system"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Management Group)
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/management"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/pim"
//	"github.com/pulumi/pulumi-time/sdk/go/time"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleClientConfig, err := core.GetClientConfig(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			exampleRoleDefinition, err := authorization.LookupRoleDefinition(ctx, &authorization.LookupRoleDefinitionArgs{
//				Name: pulumi.StringRef("Reader"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGroup, err := management.NewGroup(ctx, "exampleGroup", nil)
//			if err != nil {
//				return err
//			}
//			exampleStatic, err := time.NewStatic(ctx, "exampleStatic", nil)
//			if err != nil {
//				return err
//			}
//			_, err = pim.NewEligibleRoleAssignment(ctx, "exampleEligibleRoleAssignment", &pim.EligibleRoleAssignmentArgs{
//				Scope:            exampleGroup.ID(),
//				RoleDefinitionId: *pulumi.String(exampleRoleDefinition.Id),
//				PrincipalId:      *pulumi.String(exampleClientConfig.ObjectId),
//				Schedule: &pim.EligibleRoleAssignmentScheduleArgs{
//					StartDateTime: exampleStatic.Rfc3339,
//					Expiration: &pim.EligibleRoleAssignmentScheduleExpirationArgs{
//						DurationHours: pulumi.Int(8),
//					},
//				},
//				Justification: pulumi.String("Expiration Duration Set"),
//				Ticket: &pim.EligibleRoleAssignmentTicketArgs{
//					Number: pulumi.String("1"),
//					System: pulumi.String("example ticket system"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Pim Eligible Role Assignments can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:pim/eligibleRoleAssignment:EligibleRoleAssignment example /subscriptions/00000000-0000-0000-0000-000000000000|/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/roleDefinitions/00000000-0000-0000-0000-000000000000|00000000-0000-0000-0000-000000000000
//
// ```
type EligibleRoleAssignment struct {
	pulumi.CustomResourceState

	// The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
	Justification pulumi.StringPtrOutput `pulumi:"justification"`
	// The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalId pulumi.StringOutput `pulumi:"principalId"`
	// The type of principal. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalType pulumi.StringOutput `pulumi:"principalType"`
	// The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
	RoleDefinitionId pulumi.StringOutput `pulumi:"roleDefinitionId"`
	// A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Schedule EligibleRoleAssignmentSchedulePtrOutput `pulumi:"schedule"`
	// The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
	Scope pulumi.StringOutput `pulumi:"scope"`
	// A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Ticket EligibleRoleAssignmentTicketPtrOutput `pulumi:"ticket"`
}

// NewEligibleRoleAssignment registers a new resource with the given unique name, arguments, and options.
func NewEligibleRoleAssignment(ctx *pulumi.Context,
	name string, args *EligibleRoleAssignmentArgs, opts ...pulumi.ResourceOption) (*EligibleRoleAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalId'")
	}
	if args.RoleDefinitionId == nil {
		return nil, errors.New("invalid value for required argument 'RoleDefinitionId'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EligibleRoleAssignment
	err := ctx.RegisterResource("azure:pim/eligibleRoleAssignment:EligibleRoleAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEligibleRoleAssignment gets an existing EligibleRoleAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEligibleRoleAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EligibleRoleAssignmentState, opts ...pulumi.ResourceOption) (*EligibleRoleAssignment, error) {
	var resource EligibleRoleAssignment
	err := ctx.ReadResource("azure:pim/eligibleRoleAssignment:EligibleRoleAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EligibleRoleAssignment resources.
type eligibleRoleAssignmentState struct {
	// The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
	Justification *string `pulumi:"justification"`
	// The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalId *string `pulumi:"principalId"`
	// The type of principal. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalType *string `pulumi:"principalType"`
	// The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
	RoleDefinitionId *string `pulumi:"roleDefinitionId"`
	// A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Schedule *EligibleRoleAssignmentSchedule `pulumi:"schedule"`
	// The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
	Scope *string `pulumi:"scope"`
	// A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Ticket *EligibleRoleAssignmentTicket `pulumi:"ticket"`
}

type EligibleRoleAssignmentState struct {
	// The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
	Justification pulumi.StringPtrInput
	// The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalId pulumi.StringPtrInput
	// The type of principal. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalType pulumi.StringPtrInput
	// The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
	RoleDefinitionId pulumi.StringPtrInput
	// A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Schedule EligibleRoleAssignmentSchedulePtrInput
	// The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
	Scope pulumi.StringPtrInput
	// A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Ticket EligibleRoleAssignmentTicketPtrInput
}

func (EligibleRoleAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*eligibleRoleAssignmentState)(nil)).Elem()
}

type eligibleRoleAssignmentArgs struct {
	// The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
	Justification *string `pulumi:"justification"`
	// The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalId string `pulumi:"principalId"`
	// The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
	RoleDefinitionId string `pulumi:"roleDefinitionId"`
	// A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Schedule *EligibleRoleAssignmentSchedule `pulumi:"schedule"`
	// The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
	Scope string `pulumi:"scope"`
	// A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Ticket *EligibleRoleAssignmentTicket `pulumi:"ticket"`
}

// The set of arguments for constructing a EligibleRoleAssignment resource.
type EligibleRoleAssignmentArgs struct {
	// The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
	Justification pulumi.StringPtrInput
	// The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
	PrincipalId pulumi.StringInput
	// The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
	RoleDefinitionId pulumi.StringInput
	// A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Schedule EligibleRoleAssignmentSchedulePtrInput
	// The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
	Scope pulumi.StringInput
	// A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
	Ticket EligibleRoleAssignmentTicketPtrInput
}

func (EligibleRoleAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eligibleRoleAssignmentArgs)(nil)).Elem()
}

type EligibleRoleAssignmentInput interface {
	pulumi.Input

	ToEligibleRoleAssignmentOutput() EligibleRoleAssignmentOutput
	ToEligibleRoleAssignmentOutputWithContext(ctx context.Context) EligibleRoleAssignmentOutput
}

func (*EligibleRoleAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**EligibleRoleAssignment)(nil)).Elem()
}

func (i *EligibleRoleAssignment) ToEligibleRoleAssignmentOutput() EligibleRoleAssignmentOutput {
	return i.ToEligibleRoleAssignmentOutputWithContext(context.Background())
}

func (i *EligibleRoleAssignment) ToEligibleRoleAssignmentOutputWithContext(ctx context.Context) EligibleRoleAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EligibleRoleAssignmentOutput)
}

// EligibleRoleAssignmentArrayInput is an input type that accepts EligibleRoleAssignmentArray and EligibleRoleAssignmentArrayOutput values.
// You can construct a concrete instance of `EligibleRoleAssignmentArrayInput` via:
//
//	EligibleRoleAssignmentArray{ EligibleRoleAssignmentArgs{...} }
type EligibleRoleAssignmentArrayInput interface {
	pulumi.Input

	ToEligibleRoleAssignmentArrayOutput() EligibleRoleAssignmentArrayOutput
	ToEligibleRoleAssignmentArrayOutputWithContext(context.Context) EligibleRoleAssignmentArrayOutput
}

type EligibleRoleAssignmentArray []EligibleRoleAssignmentInput

func (EligibleRoleAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EligibleRoleAssignment)(nil)).Elem()
}

func (i EligibleRoleAssignmentArray) ToEligibleRoleAssignmentArrayOutput() EligibleRoleAssignmentArrayOutput {
	return i.ToEligibleRoleAssignmentArrayOutputWithContext(context.Background())
}

func (i EligibleRoleAssignmentArray) ToEligibleRoleAssignmentArrayOutputWithContext(ctx context.Context) EligibleRoleAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EligibleRoleAssignmentArrayOutput)
}

// EligibleRoleAssignmentMapInput is an input type that accepts EligibleRoleAssignmentMap and EligibleRoleAssignmentMapOutput values.
// You can construct a concrete instance of `EligibleRoleAssignmentMapInput` via:
//
//	EligibleRoleAssignmentMap{ "key": EligibleRoleAssignmentArgs{...} }
type EligibleRoleAssignmentMapInput interface {
	pulumi.Input

	ToEligibleRoleAssignmentMapOutput() EligibleRoleAssignmentMapOutput
	ToEligibleRoleAssignmentMapOutputWithContext(context.Context) EligibleRoleAssignmentMapOutput
}

type EligibleRoleAssignmentMap map[string]EligibleRoleAssignmentInput

func (EligibleRoleAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EligibleRoleAssignment)(nil)).Elem()
}

func (i EligibleRoleAssignmentMap) ToEligibleRoleAssignmentMapOutput() EligibleRoleAssignmentMapOutput {
	return i.ToEligibleRoleAssignmentMapOutputWithContext(context.Background())
}

func (i EligibleRoleAssignmentMap) ToEligibleRoleAssignmentMapOutputWithContext(ctx context.Context) EligibleRoleAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EligibleRoleAssignmentMapOutput)
}

type EligibleRoleAssignmentOutput struct{ *pulumi.OutputState }

func (EligibleRoleAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EligibleRoleAssignment)(nil)).Elem()
}

func (o EligibleRoleAssignmentOutput) ToEligibleRoleAssignmentOutput() EligibleRoleAssignmentOutput {
	return o
}

func (o EligibleRoleAssignmentOutput) ToEligibleRoleAssignmentOutputWithContext(ctx context.Context) EligibleRoleAssignmentOutput {
	return o
}

// The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) Justification() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) pulumi.StringPtrOutput { return v.Justification }).(pulumi.StringPtrOutput)
}

// The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) PrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) pulumi.StringOutput { return v.PrincipalId }).(pulumi.StringOutput)
}

// The type of principal. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) PrincipalType() pulumi.StringOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) pulumi.StringOutput { return v.PrincipalType }).(pulumi.StringOutput)
}

// The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) RoleDefinitionId() pulumi.StringOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) pulumi.StringOutput { return v.RoleDefinitionId }).(pulumi.StringOutput)
}

// A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) Schedule() EligibleRoleAssignmentSchedulePtrOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) EligibleRoleAssignmentSchedulePtrOutput { return v.Schedule }).(EligibleRoleAssignmentSchedulePtrOutput)
}

// The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
func (o EligibleRoleAssignmentOutput) Ticket() EligibleRoleAssignmentTicketPtrOutput {
	return o.ApplyT(func(v *EligibleRoleAssignment) EligibleRoleAssignmentTicketPtrOutput { return v.Ticket }).(EligibleRoleAssignmentTicketPtrOutput)
}

type EligibleRoleAssignmentArrayOutput struct{ *pulumi.OutputState }

func (EligibleRoleAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EligibleRoleAssignment)(nil)).Elem()
}

func (o EligibleRoleAssignmentArrayOutput) ToEligibleRoleAssignmentArrayOutput() EligibleRoleAssignmentArrayOutput {
	return o
}

func (o EligibleRoleAssignmentArrayOutput) ToEligibleRoleAssignmentArrayOutputWithContext(ctx context.Context) EligibleRoleAssignmentArrayOutput {
	return o
}

func (o EligibleRoleAssignmentArrayOutput) Index(i pulumi.IntInput) EligibleRoleAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EligibleRoleAssignment {
		return vs[0].([]*EligibleRoleAssignment)[vs[1].(int)]
	}).(EligibleRoleAssignmentOutput)
}

type EligibleRoleAssignmentMapOutput struct{ *pulumi.OutputState }

func (EligibleRoleAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EligibleRoleAssignment)(nil)).Elem()
}

func (o EligibleRoleAssignmentMapOutput) ToEligibleRoleAssignmentMapOutput() EligibleRoleAssignmentMapOutput {
	return o
}

func (o EligibleRoleAssignmentMapOutput) ToEligibleRoleAssignmentMapOutputWithContext(ctx context.Context) EligibleRoleAssignmentMapOutput {
	return o
}

func (o EligibleRoleAssignmentMapOutput) MapIndex(k pulumi.StringInput) EligibleRoleAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EligibleRoleAssignment {
		return vs[0].(map[string]*EligibleRoleAssignment)[vs[1].(string)]
	}).(EligibleRoleAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EligibleRoleAssignmentInput)(nil)).Elem(), &EligibleRoleAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*EligibleRoleAssignmentArrayInput)(nil)).Elem(), EligibleRoleAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EligibleRoleAssignmentMapInput)(nil)).Elem(), EligibleRoleAssignmentMap{})
	pulumi.RegisterOutputType(EligibleRoleAssignmentOutput{})
	pulumi.RegisterOutputType(EligibleRoleAssignmentArrayOutput{})
	pulumi.RegisterOutputType(EligibleRoleAssignmentMapOutput{})
}