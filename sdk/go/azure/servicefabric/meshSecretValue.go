// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicefabric

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Service Fabric Mesh Secret Value.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/servicefabric"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 		_, err = servicefabric.NewMeshSecret(ctx, "exampleMeshSecret", &servicefabric.MeshSecretArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = servicefabric.NewMeshSecretValue(ctx, "exampleMeshSecretValue", &servicefabric.MeshSecretValueArgs{
// 			ServiceFabricMeshSecretId: pulumi.Any(azurerm_service_fabric_mesh_secret_inline.Test.Id),
// 			Location:                  pulumi.Any(azurerm_resource_group.Test.Location),
// 			Value:                     pulumi.String("testValue"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type MeshSecretValue struct {
	pulumi.CustomResourceState

	// Specifies the Azure Region where the Service Fabric Mesh Secret Value should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Service Fabric Mesh Secret Value. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The id of the Service Fabric Mesh Secret in which the value will be applied to. Changing this forces a new resource to be created.
	ServiceFabricMeshSecretId pulumi.StringOutput `pulumi:"serviceFabricMeshSecretId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies the value that will be applied to the Service Fabric Mesh Secret. Changing this forces a new resource to be created.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewMeshSecretValue registers a new resource with the given unique name, arguments, and options.
func NewMeshSecretValue(ctx *pulumi.Context,
	name string, args *MeshSecretValueArgs, opts ...pulumi.ResourceOption) (*MeshSecretValue, error) {
	if args == nil || args.ServiceFabricMeshSecretId == nil {
		return nil, errors.New("missing required argument 'ServiceFabricMeshSecretId'")
	}
	if args == nil || args.Value == nil {
		return nil, errors.New("missing required argument 'Value'")
	}
	if args == nil {
		args = &MeshSecretValueArgs{}
	}
	var resource MeshSecretValue
	err := ctx.RegisterResource("azure:servicefabric/meshSecretValue:MeshSecretValue", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMeshSecretValue gets an existing MeshSecretValue resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMeshSecretValue(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MeshSecretValueState, opts ...pulumi.ResourceOption) (*MeshSecretValue, error) {
	var resource MeshSecretValue
	err := ctx.ReadResource("azure:servicefabric/meshSecretValue:MeshSecretValue", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MeshSecretValue resources.
type meshSecretValueState struct {
	// Specifies the Azure Region where the Service Fabric Mesh Secret Value should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Service Fabric Mesh Secret Value. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The id of the Service Fabric Mesh Secret in which the value will be applied to. Changing this forces a new resource to be created.
	ServiceFabricMeshSecretId *string `pulumi:"serviceFabricMeshSecretId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the value that will be applied to the Service Fabric Mesh Secret. Changing this forces a new resource to be created.
	Value *string `pulumi:"value"`
}

type MeshSecretValueState struct {
	// Specifies the Azure Region where the Service Fabric Mesh Secret Value should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Service Fabric Mesh Secret Value. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The id of the Service Fabric Mesh Secret in which the value will be applied to. Changing this forces a new resource to be created.
	ServiceFabricMeshSecretId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Specifies the value that will be applied to the Service Fabric Mesh Secret. Changing this forces a new resource to be created.
	Value pulumi.StringPtrInput
}

func (MeshSecretValueState) ElementType() reflect.Type {
	return reflect.TypeOf((*meshSecretValueState)(nil)).Elem()
}

type meshSecretValueArgs struct {
	// Specifies the Azure Region where the Service Fabric Mesh Secret Value should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Service Fabric Mesh Secret Value. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The id of the Service Fabric Mesh Secret in which the value will be applied to. Changing this forces a new resource to be created.
	ServiceFabricMeshSecretId string `pulumi:"serviceFabricMeshSecretId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the value that will be applied to the Service Fabric Mesh Secret. Changing this forces a new resource to be created.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a MeshSecretValue resource.
type MeshSecretValueArgs struct {
	// Specifies the Azure Region where the Service Fabric Mesh Secret Value should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Service Fabric Mesh Secret Value. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The id of the Service Fabric Mesh Secret in which the value will be applied to. Changing this forces a new resource to be created.
	ServiceFabricMeshSecretId pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Specifies the value that will be applied to the Service Fabric Mesh Secret. Changing this forces a new resource to be created.
	Value pulumi.StringInput
}

func (MeshSecretValueArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*meshSecretValueArgs)(nil)).Elem()
}