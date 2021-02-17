// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package lb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Backend Address within a Backend Address Pool.
//
// > **Note:** Backend Addresses can only be added to a `Standard` SKU Load Balancer.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/lb"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/network"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleVirtualNetwork, err := network.LookupVirtualNetwork(ctx, &network.LookupVirtualNetworkArgs{
// 			Name:              "example-network",
// 			ResourceGroupName: "example-resources",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleLB, err := lb.GetLB(ctx, &lb.GetLBArgs{
// 			Name:              "example-lb",
// 			ResourceGroupName: "example-resources",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleBackendAddressPool, err := lb.LookupBackendAddressPool(ctx, &lb.LookupBackendAddressPoolArgs{
// 			Name:           "first",
// 			LoadbalancerId: exampleLB.Id,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = lb.NewBackendAddressPoolAddress(ctx, "exampleBackendAddressPoolAddress", &lb.BackendAddressPoolAddressArgs{
// 			BackendAddressPoolId: pulumi.String(exampleBackendAddressPool.Id),
// 			VirtualNetworkId:     pulumi.String(exampleVirtualNetwork.Id),
// 			IpAddress:            pulumi.String("10.0.0.1"),
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
// Backend Address Pool Addresses can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:lb/backendAddressPoolAddress:BackendAddressPoolAddress example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/loadBalancers/loadBalancer1/backendAddressPools/backendAddressPool1/addresses/address1
// ```
type BackendAddressPoolAddress struct {
	pulumi.CustomResourceState

	// The ID of the Backend Address Pool. Changing this forces a new Backend Address Pool Address to be created.
	BackendAddressPoolId pulumi.StringOutput `pulumi:"backendAddressPoolId"`
	// The Static IP Address which should be allocated to this Backend Address Pool.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The name which should be used for this Backend Address Pool Address. Changing this forces a new Backend Address Pool Address to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Virtual Network within which the Backend Address Pool should exist.
	VirtualNetworkId pulumi.StringOutput `pulumi:"virtualNetworkId"`
}

// NewBackendAddressPoolAddress registers a new resource with the given unique name, arguments, and options.
func NewBackendAddressPoolAddress(ctx *pulumi.Context,
	name string, args *BackendAddressPoolAddressArgs, opts ...pulumi.ResourceOption) (*BackendAddressPoolAddress, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackendAddressPoolId == nil {
		return nil, errors.New("invalid value for required argument 'BackendAddressPoolId'")
	}
	if args.IpAddress == nil {
		return nil, errors.New("invalid value for required argument 'IpAddress'")
	}
	if args.VirtualNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualNetworkId'")
	}
	var resource BackendAddressPoolAddress
	err := ctx.RegisterResource("azure:lb/backendAddressPoolAddress:BackendAddressPoolAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBackendAddressPoolAddress gets an existing BackendAddressPoolAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBackendAddressPoolAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BackendAddressPoolAddressState, opts ...pulumi.ResourceOption) (*BackendAddressPoolAddress, error) {
	var resource BackendAddressPoolAddress
	err := ctx.ReadResource("azure:lb/backendAddressPoolAddress:BackendAddressPoolAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BackendAddressPoolAddress resources.
type backendAddressPoolAddressState struct {
	// The ID of the Backend Address Pool. Changing this forces a new Backend Address Pool Address to be created.
	BackendAddressPoolId *string `pulumi:"backendAddressPoolId"`
	// The Static IP Address which should be allocated to this Backend Address Pool.
	IpAddress *string `pulumi:"ipAddress"`
	// The name which should be used for this Backend Address Pool Address. Changing this forces a new Backend Address Pool Address to be created.
	Name *string `pulumi:"name"`
	// The ID of the Virtual Network within which the Backend Address Pool should exist.
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
}

type BackendAddressPoolAddressState struct {
	// The ID of the Backend Address Pool. Changing this forces a new Backend Address Pool Address to be created.
	BackendAddressPoolId pulumi.StringPtrInput
	// The Static IP Address which should be allocated to this Backend Address Pool.
	IpAddress pulumi.StringPtrInput
	// The name which should be used for this Backend Address Pool Address. Changing this forces a new Backend Address Pool Address to be created.
	Name pulumi.StringPtrInput
	// The ID of the Virtual Network within which the Backend Address Pool should exist.
	VirtualNetworkId pulumi.StringPtrInput
}

func (BackendAddressPoolAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*backendAddressPoolAddressState)(nil)).Elem()
}

type backendAddressPoolAddressArgs struct {
	// The ID of the Backend Address Pool. Changing this forces a new Backend Address Pool Address to be created.
	BackendAddressPoolId string `pulumi:"backendAddressPoolId"`
	// The Static IP Address which should be allocated to this Backend Address Pool.
	IpAddress string `pulumi:"ipAddress"`
	// The name which should be used for this Backend Address Pool Address. Changing this forces a new Backend Address Pool Address to be created.
	Name *string `pulumi:"name"`
	// The ID of the Virtual Network within which the Backend Address Pool should exist.
	VirtualNetworkId string `pulumi:"virtualNetworkId"`
}

// The set of arguments for constructing a BackendAddressPoolAddress resource.
type BackendAddressPoolAddressArgs struct {
	// The ID of the Backend Address Pool. Changing this forces a new Backend Address Pool Address to be created.
	BackendAddressPoolId pulumi.StringInput
	// The Static IP Address which should be allocated to this Backend Address Pool.
	IpAddress pulumi.StringInput
	// The name which should be used for this Backend Address Pool Address. Changing this forces a new Backend Address Pool Address to be created.
	Name pulumi.StringPtrInput
	// The ID of the Virtual Network within which the Backend Address Pool should exist.
	VirtualNetworkId pulumi.StringInput
}

func (BackendAddressPoolAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*backendAddressPoolAddressArgs)(nil)).Elem()
}

type BackendAddressPoolAddressInput interface {
	pulumi.Input

	ToBackendAddressPoolAddressOutput() BackendAddressPoolAddressOutput
	ToBackendAddressPoolAddressOutputWithContext(ctx context.Context) BackendAddressPoolAddressOutput
}

func (*BackendAddressPoolAddress) ElementType() reflect.Type {
	return reflect.TypeOf((*BackendAddressPoolAddress)(nil))
}

func (i *BackendAddressPoolAddress) ToBackendAddressPoolAddressOutput() BackendAddressPoolAddressOutput {
	return i.ToBackendAddressPoolAddressOutputWithContext(context.Background())
}

func (i *BackendAddressPoolAddress) ToBackendAddressPoolAddressOutputWithContext(ctx context.Context) BackendAddressPoolAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackendAddressPoolAddressOutput)
}

func (i *BackendAddressPoolAddress) ToBackendAddressPoolAddressPtrOutput() BackendAddressPoolAddressPtrOutput {
	return i.ToBackendAddressPoolAddressPtrOutputWithContext(context.Background())
}

func (i *BackendAddressPoolAddress) ToBackendAddressPoolAddressPtrOutputWithContext(ctx context.Context) BackendAddressPoolAddressPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackendAddressPoolAddressPtrOutput)
}

type BackendAddressPoolAddressPtrInput interface {
	pulumi.Input

	ToBackendAddressPoolAddressPtrOutput() BackendAddressPoolAddressPtrOutput
	ToBackendAddressPoolAddressPtrOutputWithContext(ctx context.Context) BackendAddressPoolAddressPtrOutput
}

type backendAddressPoolAddressPtrType BackendAddressPoolAddressArgs

func (*backendAddressPoolAddressPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**BackendAddressPoolAddress)(nil))
}

func (i *backendAddressPoolAddressPtrType) ToBackendAddressPoolAddressPtrOutput() BackendAddressPoolAddressPtrOutput {
	return i.ToBackendAddressPoolAddressPtrOutputWithContext(context.Background())
}

func (i *backendAddressPoolAddressPtrType) ToBackendAddressPoolAddressPtrOutputWithContext(ctx context.Context) BackendAddressPoolAddressPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackendAddressPoolAddressPtrOutput)
}

// BackendAddressPoolAddressArrayInput is an input type that accepts BackendAddressPoolAddressArray and BackendAddressPoolAddressArrayOutput values.
// You can construct a concrete instance of `BackendAddressPoolAddressArrayInput` via:
//
//          BackendAddressPoolAddressArray{ BackendAddressPoolAddressArgs{...} }
type BackendAddressPoolAddressArrayInput interface {
	pulumi.Input

	ToBackendAddressPoolAddressArrayOutput() BackendAddressPoolAddressArrayOutput
	ToBackendAddressPoolAddressArrayOutputWithContext(context.Context) BackendAddressPoolAddressArrayOutput
}

type BackendAddressPoolAddressArray []BackendAddressPoolAddressInput

func (BackendAddressPoolAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*BackendAddressPoolAddress)(nil))
}

func (i BackendAddressPoolAddressArray) ToBackendAddressPoolAddressArrayOutput() BackendAddressPoolAddressArrayOutput {
	return i.ToBackendAddressPoolAddressArrayOutputWithContext(context.Background())
}

func (i BackendAddressPoolAddressArray) ToBackendAddressPoolAddressArrayOutputWithContext(ctx context.Context) BackendAddressPoolAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackendAddressPoolAddressArrayOutput)
}

// BackendAddressPoolAddressMapInput is an input type that accepts BackendAddressPoolAddressMap and BackendAddressPoolAddressMapOutput values.
// You can construct a concrete instance of `BackendAddressPoolAddressMapInput` via:
//
//          BackendAddressPoolAddressMap{ "key": BackendAddressPoolAddressArgs{...} }
type BackendAddressPoolAddressMapInput interface {
	pulumi.Input

	ToBackendAddressPoolAddressMapOutput() BackendAddressPoolAddressMapOutput
	ToBackendAddressPoolAddressMapOutputWithContext(context.Context) BackendAddressPoolAddressMapOutput
}

type BackendAddressPoolAddressMap map[string]BackendAddressPoolAddressInput

func (BackendAddressPoolAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*BackendAddressPoolAddress)(nil))
}

func (i BackendAddressPoolAddressMap) ToBackendAddressPoolAddressMapOutput() BackendAddressPoolAddressMapOutput {
	return i.ToBackendAddressPoolAddressMapOutputWithContext(context.Background())
}

func (i BackendAddressPoolAddressMap) ToBackendAddressPoolAddressMapOutputWithContext(ctx context.Context) BackendAddressPoolAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackendAddressPoolAddressMapOutput)
}

type BackendAddressPoolAddressOutput struct {
	*pulumi.OutputState
}

func (BackendAddressPoolAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BackendAddressPoolAddress)(nil))
}

func (o BackendAddressPoolAddressOutput) ToBackendAddressPoolAddressOutput() BackendAddressPoolAddressOutput {
	return o
}

func (o BackendAddressPoolAddressOutput) ToBackendAddressPoolAddressOutputWithContext(ctx context.Context) BackendAddressPoolAddressOutput {
	return o
}

func (o BackendAddressPoolAddressOutput) ToBackendAddressPoolAddressPtrOutput() BackendAddressPoolAddressPtrOutput {
	return o.ToBackendAddressPoolAddressPtrOutputWithContext(context.Background())
}

func (o BackendAddressPoolAddressOutput) ToBackendAddressPoolAddressPtrOutputWithContext(ctx context.Context) BackendAddressPoolAddressPtrOutput {
	return o.ApplyT(func(v BackendAddressPoolAddress) *BackendAddressPoolAddress {
		return &v
	}).(BackendAddressPoolAddressPtrOutput)
}

type BackendAddressPoolAddressPtrOutput struct {
	*pulumi.OutputState
}

func (BackendAddressPoolAddressPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BackendAddressPoolAddress)(nil))
}

func (o BackendAddressPoolAddressPtrOutput) ToBackendAddressPoolAddressPtrOutput() BackendAddressPoolAddressPtrOutput {
	return o
}

func (o BackendAddressPoolAddressPtrOutput) ToBackendAddressPoolAddressPtrOutputWithContext(ctx context.Context) BackendAddressPoolAddressPtrOutput {
	return o
}

type BackendAddressPoolAddressArrayOutput struct{ *pulumi.OutputState }

func (BackendAddressPoolAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]BackendAddressPoolAddress)(nil))
}

func (o BackendAddressPoolAddressArrayOutput) ToBackendAddressPoolAddressArrayOutput() BackendAddressPoolAddressArrayOutput {
	return o
}

func (o BackendAddressPoolAddressArrayOutput) ToBackendAddressPoolAddressArrayOutputWithContext(ctx context.Context) BackendAddressPoolAddressArrayOutput {
	return o
}

func (o BackendAddressPoolAddressArrayOutput) Index(i pulumi.IntInput) BackendAddressPoolAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) BackendAddressPoolAddress {
		return vs[0].([]BackendAddressPoolAddress)[vs[1].(int)]
	}).(BackendAddressPoolAddressOutput)
}

type BackendAddressPoolAddressMapOutput struct{ *pulumi.OutputState }

func (BackendAddressPoolAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]BackendAddressPoolAddress)(nil))
}

func (o BackendAddressPoolAddressMapOutput) ToBackendAddressPoolAddressMapOutput() BackendAddressPoolAddressMapOutput {
	return o
}

func (o BackendAddressPoolAddressMapOutput) ToBackendAddressPoolAddressMapOutputWithContext(ctx context.Context) BackendAddressPoolAddressMapOutput {
	return o
}

func (o BackendAddressPoolAddressMapOutput) MapIndex(k pulumi.StringInput) BackendAddressPoolAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) BackendAddressPoolAddress {
		return vs[0].(map[string]BackendAddressPoolAddress)[vs[1].(string)]
	}).(BackendAddressPoolAddressOutput)
}

func init() {
	pulumi.RegisterOutputType(BackendAddressPoolAddressOutput{})
	pulumi.RegisterOutputType(BackendAddressPoolAddressPtrOutput{})
	pulumi.RegisterOutputType(BackendAddressPoolAddressArrayOutput{})
	pulumi.RegisterOutputType(BackendAddressPoolAddressMapOutput{})
}