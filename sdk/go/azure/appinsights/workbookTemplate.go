// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appinsights

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Application Insights Workbook Template.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"encoding/json"
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/appinsights"
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
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
// 		tmpJSON0, err := json.Marshal(map[string]string{
// 			"version": "Notebook/1.0",
// 			"items": []map[string]interface{}{
// 				map[string]interface{}{
// 					"type": 1,
// 					"content": map[string]interface{}{
// 						"json": "## New workbook\n---\n\nWelcome to your new workbook.",
// 					},
// 					"name": "text - 2",
// 				},
// 			},
// 			"styleSettings":        nil,
// 			fmt.Sprintf("$schema"): "https://github.com/Microsoft/Application-Insights-Workbooks/blob/master/schema/workbook.json",
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json0 := string(tmpJSON0)
// 		tmpJSON1, err := json.Marshal(map[string]interface{}{
// 			"ar": []map[string]interface{}{
// 				map[string]interface{}{
// 					"galleries": []map[string]interface{}{
// 						map[string]interface{}{
// 							"name":         "test",
// 							"category":     "Failures",
// 							"type":         "tsg",
// 							"resourceType": "microsoft.insights/components",
// 							"order":        100,
// 						},
// 					},
// 					"templateData": map[string]string{
// 						"version": "Notebook/1.0",
// 						"items": []map[string]interface{}{
// 							map[string]interface{}{
// 								"type": 1,
// 								"content": map[string]interface{}{
// 									"json": "## New workbook\n---\n\nWelcome to your new workbook.",
// 								},
// 								"name": "text - 2",
// 							},
// 						},
// 						"styleSettings":        nil,
// 						fmt.Sprintf("$schema"): "https://github.com/Microsoft/Application-Insights-Workbooks/blob/master/schema/workbook.json",
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json1 := string(tmpJSON1)
// 		_, err = appinsights.NewWorkbookTemplate(ctx, "exampleWorkbookTemplate", &appinsights.WorkbookTemplateArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          pulumi.String("West Europe"),
// 			Author:            pulumi.String("test author"),
// 			Priority:          pulumi.Int(1),
// 			Galleries: appinsights.WorkbookTemplateGalleryArray{
// 				&appinsights.WorkbookTemplateGalleryArgs{
// 					Category:     pulumi.String("workbook"),
// 					Name:         pulumi.String("test"),
// 					Order:        pulumi.Int(100),
// 					ResourceType: pulumi.String("microsoft.insights/components"),
// 					Type:         pulumi.String("tsg"),
// 				},
// 			},
// 			TemplateData: pulumi.String(json0),
// 			Localized:    pulumi.String(json1),
// 			Tags: pulumi.StringMap{
// 				"key": pulumi.String("value"),
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
// Application Insights Workbook Template can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:appinsights/workbookTemplate:WorkbookTemplate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Insights/workbooktemplates/resource1
// ```
type WorkbookTemplate struct {
	pulumi.CustomResourceState

	// Information about the author of the workbook template.
	Author pulumi.StringPtrOutput `pulumi:"author"`
	// A `galleries` block as defined below.
	Galleries WorkbookTemplateGalleryArrayOutput `pulumi:"galleries"`
	// Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
	Localized pulumi.StringPtrOutput `pulumi:"localized"`
	// Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Application Insights Workbook Template.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Valid JSON object containing workbook template payload.
	TemplateData pulumi.StringOutput `pulumi:"templateData"`
}

// NewWorkbookTemplate registers a new resource with the given unique name, arguments, and options.
func NewWorkbookTemplate(ctx *pulumi.Context,
	name string, args *WorkbookTemplateArgs, opts ...pulumi.ResourceOption) (*WorkbookTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Galleries == nil {
		return nil, errors.New("invalid value for required argument 'Galleries'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.TemplateData == nil {
		return nil, errors.New("invalid value for required argument 'TemplateData'")
	}
	var resource WorkbookTemplate
	err := ctx.RegisterResource("azure:appinsights/workbookTemplate:WorkbookTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkbookTemplate gets an existing WorkbookTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkbookTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkbookTemplateState, opts ...pulumi.ResourceOption) (*WorkbookTemplate, error) {
	var resource WorkbookTemplate
	err := ctx.ReadResource("azure:appinsights/workbookTemplate:WorkbookTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkbookTemplate resources.
type workbookTemplateState struct {
	// Information about the author of the workbook template.
	Author *string `pulumi:"author"`
	// A `galleries` block as defined below.
	Galleries []WorkbookTemplateGallery `pulumi:"galleries"`
	// Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
	Localized *string `pulumi:"localized"`
	// Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
	Name *string `pulumi:"name"`
	// Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
	Priority *int `pulumi:"priority"`
	// Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Application Insights Workbook Template.
	Tags map[string]string `pulumi:"tags"`
	// Valid JSON object containing workbook template payload.
	TemplateData *string `pulumi:"templateData"`
}

type WorkbookTemplateState struct {
	// Information about the author of the workbook template.
	Author pulumi.StringPtrInput
	// A `galleries` block as defined below.
	Galleries WorkbookTemplateGalleryArrayInput
	// Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
	Localized pulumi.StringPtrInput
	// Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
	Name pulumi.StringPtrInput
	// Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
	Priority pulumi.IntPtrInput
	// Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Application Insights Workbook Template.
	Tags pulumi.StringMapInput
	// Valid JSON object containing workbook template payload.
	TemplateData pulumi.StringPtrInput
}

func (WorkbookTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*workbookTemplateState)(nil)).Elem()
}

type workbookTemplateArgs struct {
	// Information about the author of the workbook template.
	Author *string `pulumi:"author"`
	// A `galleries` block as defined below.
	Galleries []WorkbookTemplateGallery `pulumi:"galleries"`
	// Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
	Localized *string `pulumi:"localized"`
	// Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
	Name *string `pulumi:"name"`
	// Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
	Priority *int `pulumi:"priority"`
	// Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Application Insights Workbook Template.
	Tags map[string]string `pulumi:"tags"`
	// Valid JSON object containing workbook template payload.
	TemplateData string `pulumi:"templateData"`
}

// The set of arguments for constructing a WorkbookTemplate resource.
type WorkbookTemplateArgs struct {
	// Information about the author of the workbook template.
	Author pulumi.StringPtrInput
	// A `galleries` block as defined below.
	Galleries WorkbookTemplateGalleryArrayInput
	// Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
	Localized pulumi.StringPtrInput
	// Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
	Name pulumi.StringPtrInput
	// Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
	Priority pulumi.IntPtrInput
	// Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Application Insights Workbook Template.
	Tags pulumi.StringMapInput
	// Valid JSON object containing workbook template payload.
	TemplateData pulumi.StringInput
}

func (WorkbookTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workbookTemplateArgs)(nil)).Elem()
}

type WorkbookTemplateInput interface {
	pulumi.Input

	ToWorkbookTemplateOutput() WorkbookTemplateOutput
	ToWorkbookTemplateOutputWithContext(ctx context.Context) WorkbookTemplateOutput
}

func (*WorkbookTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkbookTemplate)(nil)).Elem()
}

func (i *WorkbookTemplate) ToWorkbookTemplateOutput() WorkbookTemplateOutput {
	return i.ToWorkbookTemplateOutputWithContext(context.Background())
}

func (i *WorkbookTemplate) ToWorkbookTemplateOutputWithContext(ctx context.Context) WorkbookTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkbookTemplateOutput)
}

// WorkbookTemplateArrayInput is an input type that accepts WorkbookTemplateArray and WorkbookTemplateArrayOutput values.
// You can construct a concrete instance of `WorkbookTemplateArrayInput` via:
//
//          WorkbookTemplateArray{ WorkbookTemplateArgs{...} }
type WorkbookTemplateArrayInput interface {
	pulumi.Input

	ToWorkbookTemplateArrayOutput() WorkbookTemplateArrayOutput
	ToWorkbookTemplateArrayOutputWithContext(context.Context) WorkbookTemplateArrayOutput
}

type WorkbookTemplateArray []WorkbookTemplateInput

func (WorkbookTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkbookTemplate)(nil)).Elem()
}

func (i WorkbookTemplateArray) ToWorkbookTemplateArrayOutput() WorkbookTemplateArrayOutput {
	return i.ToWorkbookTemplateArrayOutputWithContext(context.Background())
}

func (i WorkbookTemplateArray) ToWorkbookTemplateArrayOutputWithContext(ctx context.Context) WorkbookTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkbookTemplateArrayOutput)
}

// WorkbookTemplateMapInput is an input type that accepts WorkbookTemplateMap and WorkbookTemplateMapOutput values.
// You can construct a concrete instance of `WorkbookTemplateMapInput` via:
//
//          WorkbookTemplateMap{ "key": WorkbookTemplateArgs{...} }
type WorkbookTemplateMapInput interface {
	pulumi.Input

	ToWorkbookTemplateMapOutput() WorkbookTemplateMapOutput
	ToWorkbookTemplateMapOutputWithContext(context.Context) WorkbookTemplateMapOutput
}

type WorkbookTemplateMap map[string]WorkbookTemplateInput

func (WorkbookTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkbookTemplate)(nil)).Elem()
}

func (i WorkbookTemplateMap) ToWorkbookTemplateMapOutput() WorkbookTemplateMapOutput {
	return i.ToWorkbookTemplateMapOutputWithContext(context.Background())
}

func (i WorkbookTemplateMap) ToWorkbookTemplateMapOutputWithContext(ctx context.Context) WorkbookTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkbookTemplateMapOutput)
}

type WorkbookTemplateOutput struct{ *pulumi.OutputState }

func (WorkbookTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkbookTemplate)(nil)).Elem()
}

func (o WorkbookTemplateOutput) ToWorkbookTemplateOutput() WorkbookTemplateOutput {
	return o
}

func (o WorkbookTemplateOutput) ToWorkbookTemplateOutputWithContext(ctx context.Context) WorkbookTemplateOutput {
	return o
}

// Information about the author of the workbook template.
func (o WorkbookTemplateOutput) Author() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringPtrOutput { return v.Author }).(pulumi.StringPtrOutput)
}

// A `galleries` block as defined below.
func (o WorkbookTemplateOutput) Galleries() WorkbookTemplateGalleryArrayOutput {
	return o.ApplyT(func(v *WorkbookTemplate) WorkbookTemplateGalleryArrayOutput { return v.Galleries }).(WorkbookTemplateGalleryArrayOutput)
}

// Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
func (o WorkbookTemplateOutput) Localized() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringPtrOutput { return v.Localized }).(pulumi.StringPtrOutput)
}

// Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
func (o WorkbookTemplateOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
func (o WorkbookTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
func (o WorkbookTemplateOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
func (o WorkbookTemplateOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Application Insights Workbook Template.
func (o WorkbookTemplateOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Valid JSON object containing workbook template payload.
func (o WorkbookTemplateOutput) TemplateData() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkbookTemplate) pulumi.StringOutput { return v.TemplateData }).(pulumi.StringOutput)
}

type WorkbookTemplateArrayOutput struct{ *pulumi.OutputState }

func (WorkbookTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkbookTemplate)(nil)).Elem()
}

func (o WorkbookTemplateArrayOutput) ToWorkbookTemplateArrayOutput() WorkbookTemplateArrayOutput {
	return o
}

func (o WorkbookTemplateArrayOutput) ToWorkbookTemplateArrayOutputWithContext(ctx context.Context) WorkbookTemplateArrayOutput {
	return o
}

func (o WorkbookTemplateArrayOutput) Index(i pulumi.IntInput) WorkbookTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkbookTemplate {
		return vs[0].([]*WorkbookTemplate)[vs[1].(int)]
	}).(WorkbookTemplateOutput)
}

type WorkbookTemplateMapOutput struct{ *pulumi.OutputState }

func (WorkbookTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkbookTemplate)(nil)).Elem()
}

func (o WorkbookTemplateMapOutput) ToWorkbookTemplateMapOutput() WorkbookTemplateMapOutput {
	return o
}

func (o WorkbookTemplateMapOutput) ToWorkbookTemplateMapOutputWithContext(ctx context.Context) WorkbookTemplateMapOutput {
	return o
}

func (o WorkbookTemplateMapOutput) MapIndex(k pulumi.StringInput) WorkbookTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkbookTemplate {
		return vs[0].(map[string]*WorkbookTemplate)[vs[1].(string)]
	}).(WorkbookTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkbookTemplateInput)(nil)).Elem(), &WorkbookTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkbookTemplateArrayInput)(nil)).Elem(), WorkbookTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkbookTemplateMapInput)(nil)).Elem(), WorkbookTemplateMap{})
	pulumi.RegisterOutputType(WorkbookTemplateOutput{})
	pulumi.RegisterOutputType(WorkbookTemplateArrayOutput{})
	pulumi.RegisterOutputType(WorkbookTemplateMapOutput{})
}