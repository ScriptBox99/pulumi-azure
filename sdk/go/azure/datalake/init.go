// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datalake

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "azure:datalake/analyticsAccount:AnalyticsAccount":
		r, err = NewAnalyticsAccount(ctx, name, nil, pulumi.URN_(urn))
	case "azure:datalake/analyticsFirewallRule:AnalyticsFirewallRule":
		r, err = NewAnalyticsFirewallRule(ctx, name, nil, pulumi.URN_(urn))
	case "azure:datalake/store:Store":
		r, err = NewStore(ctx, name, nil, pulumi.URN_(urn))
	case "azure:datalake/storeFile:StoreFile":
		r, err = NewStoreFile(ctx, name, nil, pulumi.URN_(urn))
	case "azure:datalake/storeFirewallRule:StoreFirewallRule":
		r, err = NewStoreFirewallRule(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

func init() {
	version, err := azure.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"azure",
		"datalake/analyticsAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"datalake/analyticsFirewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"datalake/store",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"datalake/storeFile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"datalake/storeFirewallRule",
		&module{version},
	)
}