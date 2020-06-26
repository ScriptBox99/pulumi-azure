// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package blueprint

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to access information about an existing Azure Blueprint Published Version
//
// > **NOTE:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/blueprint"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/core"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		current, err := core.GetSubscription(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err := blueprint.GetPublishedVersion(ctx, &blueprint.GetPublishedVersionArgs{
// 			ScopeId:       current.Id,
// 			BlueprintName: "exampleBluePrint",
// 			Version:       "dev_v2.3",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetPublishedVersion(ctx *pulumi.Context, args *GetPublishedVersionArgs, opts ...pulumi.InvokeOption) (*GetPublishedVersionResult, error) {
	var rv GetPublishedVersionResult
	err := ctx.Invoke("azure:blueprint/getPublishedVersion:getPublishedVersion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPublishedVersion.
type GetPublishedVersionArgs struct {
	// The name of the Blueprint Definition
	BlueprintName string `pulumi:"blueprintName"`
	// The Resource ID of the scope where the Blueprint Definition is stored. This will be with either a Subscription ID or Management Group ID.
	ScopeId string `pulumi:"scopeId"`
	// The Version name of the Published Version of the Blueprint Definition
	Version string `pulumi:"version"`
}

// A collection of values returned by getPublishedVersion.
type GetPublishedVersionResult struct {
	BlueprintName string `pulumi:"blueprintName"`
	// The description of the Blueprint Published Version
	Description string `pulumi:"description"`
	// The display name of the Blueprint Published Version
	DisplayName string `pulumi:"displayName"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	LastModified string `pulumi:"lastModified"`
	ScopeId      string `pulumi:"scopeId"`
	// The target scope
	TargetScope string `pulumi:"targetScope"`
	TimeCreated string `pulumi:"timeCreated"`
	// The type of the Blueprint
	Type    string `pulumi:"type"`
	Version string `pulumi:"version"`
}