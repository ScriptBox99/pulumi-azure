// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package containerservice

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Container Group instance.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/containerservice"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := containerservice.LookupGroup(ctx, &containerservice.LookupGroupArgs{
// 			Name:              "existing",
// 			ResourceGroupName: "existing",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("id", example.Id)
// 		ctx.Export("ipAddress", example.IpAddress)
// 		ctx.Export("fqdn", example.Fqdn)
// 		return nil
// 	})
// }
// ```
func LookupGroup(ctx *pulumi.Context, args *LookupGroupArgs, opts ...pulumi.InvokeOption) (*LookupGroupResult, error) {
	var rv LookupGroupResult
	err := ctx.Invoke("azure:containerservice/getGroup:getGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGroup.
type LookupGroupArgs struct {
	// The name of this Container Group instance.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Container Group instance exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getGroup.
type LookupGroupResult struct {
	// The FQDN of the Container Group instance derived from `dnsNameLabel`.
	Fqdn string `pulumi:"fqdn"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The IP address allocated to the Container Group instance.
	IpAddress string `pulumi:"ipAddress"`
	// The Azure Region where the Container Group instance exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the Container Group instance.
	Tags map[string]string `pulumi:"tags"`
}

func LookupGroupOutput(ctx *pulumi.Context, args LookupGroupOutputArgs, opts ...pulumi.InvokeOption) LookupGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGroupResult, error) {
			args := v.(LookupGroupArgs)
			r, err := LookupGroup(ctx, &args, opts...)
			var s LookupGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGroupResultOutput)
}

// A collection of arguments for invoking getGroup.
type LookupGroupOutputArgs struct {
	// The name of this Container Group instance.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Container Group instance exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupArgs)(nil)).Elem()
}

// A collection of values returned by getGroup.
type LookupGroupResultOutput struct{ *pulumi.OutputState }

func (LookupGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupResult)(nil)).Elem()
}

func (o LookupGroupResultOutput) ToLookupGroupResultOutput() LookupGroupResultOutput {
	return o
}

func (o LookupGroupResultOutput) ToLookupGroupResultOutputWithContext(ctx context.Context) LookupGroupResultOutput {
	return o
}

// The FQDN of the Container Group instance derived from `dnsNameLabel`.
func (o LookupGroupResultOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Fqdn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// The IP address allocated to the Container Group instance.
func (o LookupGroupResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

// The Azure Region where the Container Group instance exists.
func (o LookupGroupResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupGroupResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the Container Group instance.
func (o LookupGroupResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupGroupResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGroupResultOutput{})
}