// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an iSCSI Target.
//
// !> **Note:** Each Disk Pool can have a maximum of 1 iSCSI Target.
//
// ## Import
//
// iSCSI Targets can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StoragePool/diskPools/pool1/iscsiTargets/iscsiTarget1
// ```
type DiskPoolIscsiTarget struct {
	pulumi.CustomResourceState

	// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
	AclMode pulumi.StringOutput `pulumi:"aclMode"`
	// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
	DisksPoolId pulumi.StringOutput `pulumi:"disksPoolId"`
	// List of private IPv4 addresses to connect to the iSCSI Target.
	Endpoints pulumi.StringArrayOutput `pulumi:"endpoints"`
	// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The port used by iSCSI Target portal group.
	Port pulumi.IntOutput `pulumi:"port"`
	// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
	TargetIqn pulumi.StringPtrOutput `pulumi:"targetIqn"`
}

// NewDiskPoolIscsiTarget registers a new resource with the given unique name, arguments, and options.
func NewDiskPoolIscsiTarget(ctx *pulumi.Context,
	name string, args *DiskPoolIscsiTargetArgs, opts ...pulumi.ResourceOption) (*DiskPoolIscsiTarget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AclMode == nil {
		return nil, errors.New("invalid value for required argument 'AclMode'")
	}
	if args.DisksPoolId == nil {
		return nil, errors.New("invalid value for required argument 'DisksPoolId'")
	}
	var resource DiskPoolIscsiTarget
	err := ctx.RegisterResource("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskPoolIscsiTarget gets an existing DiskPoolIscsiTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskPoolIscsiTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskPoolIscsiTargetState, opts ...pulumi.ResourceOption) (*DiskPoolIscsiTarget, error) {
	var resource DiskPoolIscsiTarget
	err := ctx.ReadResource("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskPoolIscsiTarget resources.
type diskPoolIscsiTargetState struct {
	// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
	AclMode *string `pulumi:"aclMode"`
	// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
	DisksPoolId *string `pulumi:"disksPoolId"`
	// List of private IPv4 addresses to connect to the iSCSI Target.
	Endpoints []string `pulumi:"endpoints"`
	// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
	Name *string `pulumi:"name"`
	// The port used by iSCSI Target portal group.
	Port *int `pulumi:"port"`
	// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
	TargetIqn *string `pulumi:"targetIqn"`
}

type DiskPoolIscsiTargetState struct {
	// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
	AclMode pulumi.StringPtrInput
	// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
	DisksPoolId pulumi.StringPtrInput
	// List of private IPv4 addresses to connect to the iSCSI Target.
	Endpoints pulumi.StringArrayInput
	// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
	Name pulumi.StringPtrInput
	// The port used by iSCSI Target portal group.
	Port pulumi.IntPtrInput
	// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
	TargetIqn pulumi.StringPtrInput
}

func (DiskPoolIscsiTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskPoolIscsiTargetState)(nil)).Elem()
}

type diskPoolIscsiTargetArgs struct {
	// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
	AclMode string `pulumi:"aclMode"`
	// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
	DisksPoolId string `pulumi:"disksPoolId"`
	// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
	Name *string `pulumi:"name"`
	// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
	TargetIqn *string `pulumi:"targetIqn"`
}

// The set of arguments for constructing a DiskPoolIscsiTarget resource.
type DiskPoolIscsiTargetArgs struct {
	// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
	AclMode pulumi.StringInput
	// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
	DisksPoolId pulumi.StringInput
	// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
	Name pulumi.StringPtrInput
	// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
	TargetIqn pulumi.StringPtrInput
}

func (DiskPoolIscsiTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskPoolIscsiTargetArgs)(nil)).Elem()
}

type DiskPoolIscsiTargetInput interface {
	pulumi.Input

	ToDiskPoolIscsiTargetOutput() DiskPoolIscsiTargetOutput
	ToDiskPoolIscsiTargetOutputWithContext(ctx context.Context) DiskPoolIscsiTargetOutput
}

func (*DiskPoolIscsiTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskPoolIscsiTarget)(nil)).Elem()
}

func (i *DiskPoolIscsiTarget) ToDiskPoolIscsiTargetOutput() DiskPoolIscsiTargetOutput {
	return i.ToDiskPoolIscsiTargetOutputWithContext(context.Background())
}

func (i *DiskPoolIscsiTarget) ToDiskPoolIscsiTargetOutputWithContext(ctx context.Context) DiskPoolIscsiTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolIscsiTargetOutput)
}

// DiskPoolIscsiTargetArrayInput is an input type that accepts DiskPoolIscsiTargetArray and DiskPoolIscsiTargetArrayOutput values.
// You can construct a concrete instance of `DiskPoolIscsiTargetArrayInput` via:
//
//          DiskPoolIscsiTargetArray{ DiskPoolIscsiTargetArgs{...} }
type DiskPoolIscsiTargetArrayInput interface {
	pulumi.Input

	ToDiskPoolIscsiTargetArrayOutput() DiskPoolIscsiTargetArrayOutput
	ToDiskPoolIscsiTargetArrayOutputWithContext(context.Context) DiskPoolIscsiTargetArrayOutput
}

type DiskPoolIscsiTargetArray []DiskPoolIscsiTargetInput

func (DiskPoolIscsiTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskPoolIscsiTarget)(nil)).Elem()
}

func (i DiskPoolIscsiTargetArray) ToDiskPoolIscsiTargetArrayOutput() DiskPoolIscsiTargetArrayOutput {
	return i.ToDiskPoolIscsiTargetArrayOutputWithContext(context.Background())
}

func (i DiskPoolIscsiTargetArray) ToDiskPoolIscsiTargetArrayOutputWithContext(ctx context.Context) DiskPoolIscsiTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolIscsiTargetArrayOutput)
}

// DiskPoolIscsiTargetMapInput is an input type that accepts DiskPoolIscsiTargetMap and DiskPoolIscsiTargetMapOutput values.
// You can construct a concrete instance of `DiskPoolIscsiTargetMapInput` via:
//
//          DiskPoolIscsiTargetMap{ "key": DiskPoolIscsiTargetArgs{...} }
type DiskPoolIscsiTargetMapInput interface {
	pulumi.Input

	ToDiskPoolIscsiTargetMapOutput() DiskPoolIscsiTargetMapOutput
	ToDiskPoolIscsiTargetMapOutputWithContext(context.Context) DiskPoolIscsiTargetMapOutput
}

type DiskPoolIscsiTargetMap map[string]DiskPoolIscsiTargetInput

func (DiskPoolIscsiTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskPoolIscsiTarget)(nil)).Elem()
}

func (i DiskPoolIscsiTargetMap) ToDiskPoolIscsiTargetMapOutput() DiskPoolIscsiTargetMapOutput {
	return i.ToDiskPoolIscsiTargetMapOutputWithContext(context.Background())
}

func (i DiskPoolIscsiTargetMap) ToDiskPoolIscsiTargetMapOutputWithContext(ctx context.Context) DiskPoolIscsiTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolIscsiTargetMapOutput)
}

type DiskPoolIscsiTargetOutput struct{ *pulumi.OutputState }

func (DiskPoolIscsiTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskPoolIscsiTarget)(nil)).Elem()
}

func (o DiskPoolIscsiTargetOutput) ToDiskPoolIscsiTargetOutput() DiskPoolIscsiTargetOutput {
	return o
}

func (o DiskPoolIscsiTargetOutput) ToDiskPoolIscsiTargetOutputWithContext(ctx context.Context) DiskPoolIscsiTargetOutput {
	return o
}

// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
func (o DiskPoolIscsiTargetOutput) AclMode() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskPoolIscsiTarget) pulumi.StringOutput { return v.AclMode }).(pulumi.StringOutput)
}

// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
func (o DiskPoolIscsiTargetOutput) DisksPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskPoolIscsiTarget) pulumi.StringOutput { return v.DisksPoolId }).(pulumi.StringOutput)
}

// List of private IPv4 addresses to connect to the iSCSI Target.
func (o DiskPoolIscsiTargetOutput) Endpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DiskPoolIscsiTarget) pulumi.StringArrayOutput { return v.Endpoints }).(pulumi.StringArrayOutput)
}

// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
func (o DiskPoolIscsiTargetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskPoolIscsiTarget) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The port used by iSCSI Target portal group.
func (o DiskPoolIscsiTargetOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *DiskPoolIscsiTarget) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
func (o DiskPoolIscsiTargetOutput) TargetIqn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskPoolIscsiTarget) pulumi.StringPtrOutput { return v.TargetIqn }).(pulumi.StringPtrOutput)
}

type DiskPoolIscsiTargetArrayOutput struct{ *pulumi.OutputState }

func (DiskPoolIscsiTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskPoolIscsiTarget)(nil)).Elem()
}

func (o DiskPoolIscsiTargetArrayOutput) ToDiskPoolIscsiTargetArrayOutput() DiskPoolIscsiTargetArrayOutput {
	return o
}

func (o DiskPoolIscsiTargetArrayOutput) ToDiskPoolIscsiTargetArrayOutputWithContext(ctx context.Context) DiskPoolIscsiTargetArrayOutput {
	return o
}

func (o DiskPoolIscsiTargetArrayOutput) Index(i pulumi.IntInput) DiskPoolIscsiTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiskPoolIscsiTarget {
		return vs[0].([]*DiskPoolIscsiTarget)[vs[1].(int)]
	}).(DiskPoolIscsiTargetOutput)
}

type DiskPoolIscsiTargetMapOutput struct{ *pulumi.OutputState }

func (DiskPoolIscsiTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskPoolIscsiTarget)(nil)).Elem()
}

func (o DiskPoolIscsiTargetMapOutput) ToDiskPoolIscsiTargetMapOutput() DiskPoolIscsiTargetMapOutput {
	return o
}

func (o DiskPoolIscsiTargetMapOutput) ToDiskPoolIscsiTargetMapOutputWithContext(ctx context.Context) DiskPoolIscsiTargetMapOutput {
	return o
}

func (o DiskPoolIscsiTargetMapOutput) MapIndex(k pulumi.StringInput) DiskPoolIscsiTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiskPoolIscsiTarget {
		return vs[0].(map[string]*DiskPoolIscsiTarget)[vs[1].(string)]
	}).(DiskPoolIscsiTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolIscsiTargetInput)(nil)).Elem(), &DiskPoolIscsiTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolIscsiTargetArrayInput)(nil)).Elem(), DiskPoolIscsiTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolIscsiTargetMapInput)(nil)).Elem(), DiskPoolIscsiTargetMap{})
	pulumi.RegisterOutputType(DiskPoolIscsiTargetOutput{})
	pulumi.RegisterOutputType(DiskPoolIscsiTargetArrayOutput{})
	pulumi.RegisterOutputType(DiskPoolIscsiTargetMapOutput{})
}