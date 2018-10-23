// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type MetricAlert struct {
	s *pulumi.ResourceState
}

// NewMetricAlert registers a new resource with the given unique name, arguments, and options.
func NewMetricAlert(ctx *pulumi.Context,
	name string, args *MetricAlertArgs, opts ...pulumi.ResourceOpt) (*MetricAlert, error) {
	if args == nil || args.Criterias == nil {
		return nil, errors.New("missing required argument 'Criterias'")
	}
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	if args == nil || args.Scopes == nil {
		return nil, errors.New("missing required argument 'Scopes'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["actions"] = nil
		inputs["autoMitigate"] = nil
		inputs["criterias"] = nil
		inputs["description"] = nil
		inputs["enabled"] = nil
		inputs["frequency"] = nil
		inputs["name"] = nil
		inputs["resourceGroupName"] = nil
		inputs["scopes"] = nil
		inputs["severity"] = nil
		inputs["tags"] = nil
		inputs["windowSize"] = nil
	} else {
		inputs["actions"] = args.Actions
		inputs["autoMitigate"] = args.AutoMitigate
		inputs["criterias"] = args.Criterias
		inputs["description"] = args.Description
		inputs["enabled"] = args.Enabled
		inputs["frequency"] = args.Frequency
		inputs["name"] = args.Name
		inputs["resourceGroupName"] = args.ResourceGroupName
		inputs["scopes"] = args.Scopes
		inputs["severity"] = args.Severity
		inputs["tags"] = args.Tags
		inputs["windowSize"] = args.WindowSize
	}
	s, err := ctx.RegisterResource("azure:monitoring/metricAlert:MetricAlert", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &MetricAlert{s: s}, nil
}

// GetMetricAlert gets an existing MetricAlert resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetricAlert(ctx *pulumi.Context,
	name string, id pulumi.ID, state *MetricAlertState, opts ...pulumi.ResourceOpt) (*MetricAlert, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["actions"] = state.Actions
		inputs["autoMitigate"] = state.AutoMitigate
		inputs["criterias"] = state.Criterias
		inputs["description"] = state.Description
		inputs["enabled"] = state.Enabled
		inputs["frequency"] = state.Frequency
		inputs["name"] = state.Name
		inputs["resourceGroupName"] = state.ResourceGroupName
		inputs["scopes"] = state.Scopes
		inputs["severity"] = state.Severity
		inputs["tags"] = state.Tags
		inputs["windowSize"] = state.WindowSize
	}
	s, err := ctx.ReadResource("azure:monitoring/metricAlert:MetricAlert", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &MetricAlert{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *MetricAlert) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *MetricAlert) ID() *pulumi.IDOutput {
	return r.s.ID
}

func (r *MetricAlert) Actions() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["actions"])
}

func (r *MetricAlert) AutoMitigate() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["autoMitigate"])
}

func (r *MetricAlert) Criterias() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["criterias"])
}

func (r *MetricAlert) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

func (r *MetricAlert) Enabled() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enabled"])
}

func (r *MetricAlert) Frequency() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["frequency"])
}

func (r *MetricAlert) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

func (r *MetricAlert) ResourceGroupName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["resourceGroupName"])
}

func (r *MetricAlert) Scopes() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["scopes"])
}

func (r *MetricAlert) Severity() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["severity"])
}

func (r *MetricAlert) Tags() *pulumi.MapOutput {
	return (*pulumi.MapOutput)(r.s.State["tags"])
}

func (r *MetricAlert) WindowSize() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["windowSize"])
}

// Input properties used for looking up and filtering MetricAlert resources.
type MetricAlertState struct {
	Actions interface{}
	AutoMitigate interface{}
	Criterias interface{}
	Description interface{}
	Enabled interface{}
	Frequency interface{}
	Name interface{}
	ResourceGroupName interface{}
	Scopes interface{}
	Severity interface{}
	Tags interface{}
	WindowSize interface{}
}

// The set of arguments for constructing a MetricAlert resource.
type MetricAlertArgs struct {
	Actions interface{}
	AutoMitigate interface{}
	Criterias interface{}
	Description interface{}
	Enabled interface{}
	Frequency interface{}
	Name interface{}
	ResourceGroupName interface{}
	Scopes interface{}
	Severity interface{}
	Tags interface{}
	WindowSize interface{}
}