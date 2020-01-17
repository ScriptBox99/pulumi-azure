// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventgrid

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to access information about an existing EventGrid Topic
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/d/eventgrid_topic.html.markdown.
func LookupTopic(ctx *pulumi.Context, args *GetTopicArgs) (*GetTopicResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["name"] = args.Name
		inputs["resourceGroupName"] = args.ResourceGroupName
		inputs["tags"] = args.Tags
	}
	outputs, err := ctx.Invoke("azure:eventgrid/getTopic:getTopic", inputs)
	if err != nil {
		return nil, err
	}
	return &GetTopicResult{
		Endpoint: outputs["endpoint"],
		Location: outputs["location"],
		Name: outputs["name"],
		PrimaryAccessKey: outputs["primaryAccessKey"],
		ResourceGroupName: outputs["resourceGroupName"],
		SecondaryAccessKey: outputs["secondaryAccessKey"],
		Tags: outputs["tags"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getTopic.
type GetTopicArgs struct {
	// The name of the EventGrid Topic resource.
	Name interface{}
	// The name of the resource group in which the EventGrid Topic exists.
	ResourceGroupName interface{}
	Tags interface{}
}

// A collection of values returned by getTopic.
type GetTopicResult struct {
	// The Endpoint associated with the EventGrid Topic.
	Endpoint interface{}
	Location interface{}
	Name interface{}
	// The Primary Shared Access Key associated with the EventGrid Topic.
	PrimaryAccessKey interface{}
	ResourceGroupName interface{}
	// The Secondary Shared Access Key associated with the EventGrid Topic.
	SecondaryAccessKey interface{}
	Tags interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}