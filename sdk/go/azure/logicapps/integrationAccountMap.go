// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package logicapps

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Logic App Integration Account Map.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"io/ioutil"
//
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/logicapps"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func readFileOrPanic(path string) pulumi.StringPtrInput {
// 	data, err := ioutil.ReadFile(path)
// 	if err != nil {
// 		panic(err.Error())
// 	}
// 	return pulumi.String(string(data))
// }
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleIntegrationAccount, err := logicapps.NewIntegrationAccount(ctx, "exampleIntegrationAccount", &logicapps.IntegrationAccountArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			SkuName:           pulumi.String("Standard"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = logicapps.NewIntegrationAccountMap(ctx, "exampleIntegrationAccountMap", &logicapps.IntegrationAccountMapArgs{
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			IntegrationAccountName: exampleIntegrationAccount.Name,
// 			MapType:                pulumi.String("Xslt"),
// 			Content:                readFileOrPanic("testdata/integration_account_map_content.xsd"),
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
// Logic App Integration Account Maps can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:logicapps/integrationAccountMap:IntegrationAccountMap example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1/maps/map1
// ```
type IntegrationAccountMap struct {
	pulumi.CustomResourceState

	// The content of the Logic App Integration Account Map.
	Content pulumi.StringOutput `pulumi:"content"`
	// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
	IntegrationAccountName pulumi.StringOutput `pulumi:"integrationAccountName"`
	// The type of the Logic App Integration Account Map.
	MapType pulumi.StringOutput `pulumi:"mapType"`
	// The metadata of the Logic App Integration Account Map.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
}

// NewIntegrationAccountMap registers a new resource with the given unique name, arguments, and options.
func NewIntegrationAccountMap(ctx *pulumi.Context,
	name string, args *IntegrationAccountMapArgs, opts ...pulumi.ResourceOption) (*IntegrationAccountMap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.IntegrationAccountName == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationAccountName'")
	}
	if args.MapType == nil {
		return nil, errors.New("invalid value for required argument 'MapType'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	var resource IntegrationAccountMap
	err := ctx.RegisterResource("azure:logicapps/integrationAccountMap:IntegrationAccountMap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegrationAccountMap gets an existing IntegrationAccountMap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegrationAccountMap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationAccountMapState, opts ...pulumi.ResourceOption) (*IntegrationAccountMap, error) {
	var resource IntegrationAccountMap
	err := ctx.ReadResource("azure:logicapps/integrationAccountMap:IntegrationAccountMap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IntegrationAccountMap resources.
type integrationAccountMapState struct {
	// The content of the Logic App Integration Account Map.
	Content *string `pulumi:"content"`
	// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
	IntegrationAccountName *string `pulumi:"integrationAccountName"`
	// The type of the Logic App Integration Account Map.
	MapType *string `pulumi:"mapType"`
	// The metadata of the Logic App Integration Account Map.
	Metadata map[string]string `pulumi:"metadata"`
	// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
}

type IntegrationAccountMapState struct {
	// The content of the Logic App Integration Account Map.
	Content pulumi.StringPtrInput
	// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
	IntegrationAccountName pulumi.StringPtrInput
	// The type of the Logic App Integration Account Map.
	MapType pulumi.StringPtrInput
	// The metadata of the Logic App Integration Account Map.
	Metadata pulumi.StringMapInput
	// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
	ResourceGroupName pulumi.StringPtrInput
}

func (IntegrationAccountMapState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationAccountMapState)(nil)).Elem()
}

type integrationAccountMapArgs struct {
	// The content of the Logic App Integration Account Map.
	Content string `pulumi:"content"`
	// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
	IntegrationAccountName string `pulumi:"integrationAccountName"`
	// The type of the Logic App Integration Account Map.
	MapType string `pulumi:"mapType"`
	// The metadata of the Logic App Integration Account Map.
	Metadata map[string]string `pulumi:"metadata"`
	// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a IntegrationAccountMap resource.
type IntegrationAccountMapArgs struct {
	// The content of the Logic App Integration Account Map.
	Content pulumi.StringInput
	// The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
	IntegrationAccountName pulumi.StringInput
	// The type of the Logic App Integration Account Map.
	MapType pulumi.StringInput
	// The metadata of the Logic App Integration Account Map.
	Metadata pulumi.StringMapInput
	// The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
	ResourceGroupName pulumi.StringInput
}

func (IntegrationAccountMapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationAccountMapArgs)(nil)).Elem()
}

type IntegrationAccountMapInput interface {
	pulumi.Input

	ToIntegrationAccountMapOutput() IntegrationAccountMapOutput
	ToIntegrationAccountMapOutputWithContext(ctx context.Context) IntegrationAccountMapOutput
}

func (*IntegrationAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*IntegrationAccountMap)(nil))
}

func (i *IntegrationAccountMap) ToIntegrationAccountMapOutput() IntegrationAccountMapOutput {
	return i.ToIntegrationAccountMapOutputWithContext(context.Background())
}

func (i *IntegrationAccountMap) ToIntegrationAccountMapOutputWithContext(ctx context.Context) IntegrationAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountMapOutput)
}

func (i *IntegrationAccountMap) ToIntegrationAccountMapPtrOutput() IntegrationAccountMapPtrOutput {
	return i.ToIntegrationAccountMapPtrOutputWithContext(context.Background())
}

func (i *IntegrationAccountMap) ToIntegrationAccountMapPtrOutputWithContext(ctx context.Context) IntegrationAccountMapPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountMapPtrOutput)
}

type IntegrationAccountMapPtrInput interface {
	pulumi.Input

	ToIntegrationAccountMapPtrOutput() IntegrationAccountMapPtrOutput
	ToIntegrationAccountMapPtrOutputWithContext(ctx context.Context) IntegrationAccountMapPtrOutput
}

type integrationAccountMapPtrType IntegrationAccountMapArgs

func (*integrationAccountMapPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationAccountMap)(nil))
}

func (i *integrationAccountMapPtrType) ToIntegrationAccountMapPtrOutput() IntegrationAccountMapPtrOutput {
	return i.ToIntegrationAccountMapPtrOutputWithContext(context.Background())
}

func (i *integrationAccountMapPtrType) ToIntegrationAccountMapPtrOutputWithContext(ctx context.Context) IntegrationAccountMapPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountMapPtrOutput)
}

// IntegrationAccountMapArrayInput is an input type that accepts IntegrationAccountMapArray and IntegrationAccountMapArrayOutput values.
// You can construct a concrete instance of `IntegrationAccountMapArrayInput` via:
//
//          IntegrationAccountMapArray{ IntegrationAccountMapArgs{...} }
type IntegrationAccountMapArrayInput interface {
	pulumi.Input

	ToIntegrationAccountMapArrayOutput() IntegrationAccountMapArrayOutput
	ToIntegrationAccountMapArrayOutputWithContext(context.Context) IntegrationAccountMapArrayOutput
}

type IntegrationAccountMapArray []IntegrationAccountMapInput

func (IntegrationAccountMapArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationAccountMap)(nil)).Elem()
}

func (i IntegrationAccountMapArray) ToIntegrationAccountMapArrayOutput() IntegrationAccountMapArrayOutput {
	return i.ToIntegrationAccountMapArrayOutputWithContext(context.Background())
}

func (i IntegrationAccountMapArray) ToIntegrationAccountMapArrayOutputWithContext(ctx context.Context) IntegrationAccountMapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountMapArrayOutput)
}

// IntegrationAccountMapMapInput is an input type that accepts IntegrationAccountMapMap and IntegrationAccountMapMapOutput values.
// You can construct a concrete instance of `IntegrationAccountMapMapInput` via:
//
//          IntegrationAccountMapMap{ "key": IntegrationAccountMapArgs{...} }
type IntegrationAccountMapMapInput interface {
	pulumi.Input

	ToIntegrationAccountMapMapOutput() IntegrationAccountMapMapOutput
	ToIntegrationAccountMapMapOutputWithContext(context.Context) IntegrationAccountMapMapOutput
}

type IntegrationAccountMapMap map[string]IntegrationAccountMapInput

func (IntegrationAccountMapMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationAccountMap)(nil)).Elem()
}

func (i IntegrationAccountMapMap) ToIntegrationAccountMapMapOutput() IntegrationAccountMapMapOutput {
	return i.ToIntegrationAccountMapMapOutputWithContext(context.Background())
}

func (i IntegrationAccountMapMap) ToIntegrationAccountMapMapOutputWithContext(ctx context.Context) IntegrationAccountMapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountMapMapOutput)
}

type IntegrationAccountMapOutput struct{ *pulumi.OutputState }

func (IntegrationAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*IntegrationAccountMap)(nil))
}

func (o IntegrationAccountMapOutput) ToIntegrationAccountMapOutput() IntegrationAccountMapOutput {
	return o
}

func (o IntegrationAccountMapOutput) ToIntegrationAccountMapOutputWithContext(ctx context.Context) IntegrationAccountMapOutput {
	return o
}

func (o IntegrationAccountMapOutput) ToIntegrationAccountMapPtrOutput() IntegrationAccountMapPtrOutput {
	return o.ToIntegrationAccountMapPtrOutputWithContext(context.Background())
}

func (o IntegrationAccountMapOutput) ToIntegrationAccountMapPtrOutputWithContext(ctx context.Context) IntegrationAccountMapPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v IntegrationAccountMap) *IntegrationAccountMap {
		return &v
	}).(IntegrationAccountMapPtrOutput)
}

type IntegrationAccountMapPtrOutput struct{ *pulumi.OutputState }

func (IntegrationAccountMapPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationAccountMap)(nil))
}

func (o IntegrationAccountMapPtrOutput) ToIntegrationAccountMapPtrOutput() IntegrationAccountMapPtrOutput {
	return o
}

func (o IntegrationAccountMapPtrOutput) ToIntegrationAccountMapPtrOutputWithContext(ctx context.Context) IntegrationAccountMapPtrOutput {
	return o
}

func (o IntegrationAccountMapPtrOutput) Elem() IntegrationAccountMapOutput {
	return o.ApplyT(func(v *IntegrationAccountMap) IntegrationAccountMap {
		if v != nil {
			return *v
		}
		var ret IntegrationAccountMap
		return ret
	}).(IntegrationAccountMapOutput)
}

type IntegrationAccountMapArrayOutput struct{ *pulumi.OutputState }

func (IntegrationAccountMapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]IntegrationAccountMap)(nil))
}

func (o IntegrationAccountMapArrayOutput) ToIntegrationAccountMapArrayOutput() IntegrationAccountMapArrayOutput {
	return o
}

func (o IntegrationAccountMapArrayOutput) ToIntegrationAccountMapArrayOutputWithContext(ctx context.Context) IntegrationAccountMapArrayOutput {
	return o
}

func (o IntegrationAccountMapArrayOutput) Index(i pulumi.IntInput) IntegrationAccountMapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) IntegrationAccountMap {
		return vs[0].([]IntegrationAccountMap)[vs[1].(int)]
	}).(IntegrationAccountMapOutput)
}

type IntegrationAccountMapMapOutput struct{ *pulumi.OutputState }

func (IntegrationAccountMapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]IntegrationAccountMap)(nil))
}

func (o IntegrationAccountMapMapOutput) ToIntegrationAccountMapMapOutput() IntegrationAccountMapMapOutput {
	return o
}

func (o IntegrationAccountMapMapOutput) ToIntegrationAccountMapMapOutputWithContext(ctx context.Context) IntegrationAccountMapMapOutput {
	return o
}

func (o IntegrationAccountMapMapOutput) MapIndex(k pulumi.StringInput) IntegrationAccountMapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) IntegrationAccountMap {
		return vs[0].(map[string]IntegrationAccountMap)[vs[1].(string)]
	}).(IntegrationAccountMapOutput)
}

func init() {
	pulumi.RegisterOutputType(IntegrationAccountMapOutput{})
	pulumi.RegisterOutputType(IntegrationAccountMapPtrOutput{})
	pulumi.RegisterOutputType(IntegrationAccountMapArrayOutput{})
	pulumi.RegisterOutputType(IntegrationAccountMapMapOutput{})
}