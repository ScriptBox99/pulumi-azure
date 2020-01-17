// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages an API Management Microsoft Identity Provider.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/api_management_identity_provider_microsoft.html.markdown.
type IdentityProviderMicrosoft struct {
	s *pulumi.ResourceState
}

// NewIdentityProviderMicrosoft registers a new resource with the given unique name, arguments, and options.
func NewIdentityProviderMicrosoft(ctx *pulumi.Context,
	name string, args *IdentityProviderMicrosoftArgs, opts ...pulumi.ResourceOpt) (*IdentityProviderMicrosoft, error) {
	if args == nil || args.ApiManagementName == nil {
		return nil, errors.New("missing required argument 'ApiManagementName'")
	}
	if args == nil || args.ClientId == nil {
		return nil, errors.New("missing required argument 'ClientId'")
	}
	if args == nil || args.ClientSecret == nil {
		return nil, errors.New("missing required argument 'ClientSecret'")
	}
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["apiManagementName"] = nil
		inputs["clientId"] = nil
		inputs["clientSecret"] = nil
		inputs["resourceGroupName"] = nil
	} else {
		inputs["apiManagementName"] = args.ApiManagementName
		inputs["clientId"] = args.ClientId
		inputs["clientSecret"] = args.ClientSecret
		inputs["resourceGroupName"] = args.ResourceGroupName
	}
	s, err := ctx.RegisterResource("azure:apimanagement/identityProviderMicrosoft:IdentityProviderMicrosoft", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &IdentityProviderMicrosoft{s: s}, nil
}

// GetIdentityProviderMicrosoft gets an existing IdentityProviderMicrosoft resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityProviderMicrosoft(ctx *pulumi.Context,
	name string, id pulumi.ID, state *IdentityProviderMicrosoftState, opts ...pulumi.ResourceOpt) (*IdentityProviderMicrosoft, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["apiManagementName"] = state.ApiManagementName
		inputs["clientId"] = state.ClientId
		inputs["clientSecret"] = state.ClientSecret
		inputs["resourceGroupName"] = state.ResourceGroupName
	}
	s, err := ctx.ReadResource("azure:apimanagement/identityProviderMicrosoft:IdentityProviderMicrosoft", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &IdentityProviderMicrosoft{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *IdentityProviderMicrosoft) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *IdentityProviderMicrosoft) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
func (r *IdentityProviderMicrosoft) ApiManagementName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["apiManagementName"])
}

// Client Id of the Azure AD Application.
func (r *IdentityProviderMicrosoft) ClientId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["clientId"])
}

// Client secret of the Azure AD Application.
func (r *IdentityProviderMicrosoft) ClientSecret() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["clientSecret"])
}

// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
func (r *IdentityProviderMicrosoft) ResourceGroupName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["resourceGroupName"])
}

// Input properties used for looking up and filtering IdentityProviderMicrosoft resources.
type IdentityProviderMicrosoftState struct {
	// The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
	ApiManagementName interface{}
	// Client Id of the Azure AD Application.
	ClientId interface{}
	// Client secret of the Azure AD Application.
	ClientSecret interface{}
	// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName interface{}
}

// The set of arguments for constructing a IdentityProviderMicrosoft resource.
type IdentityProviderMicrosoftArgs struct {
	// The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
	ApiManagementName interface{}
	// Client Id of the Azure AD Application.
	ClientId interface{}
	// Client secret of the Azure AD Application.
	ClientSecret interface{}
	// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName interface{}
}