// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package automanage

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Automanage Configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/automanage"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = automanage.NewConfiguration(ctx, "exampleConfiguration", &automanage.ConfigurationArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Antimalware: &automanage.ConfigurationAntimalwareArgs{
//					Exclusions: &automanage.ConfigurationAntimalwareExclusionsArgs{
//						Extensions: pulumi.String("exe;dll"),
//						Paths:      pulumi.String("C:\\Windows\\Temp;D:\\Temp"),
//						Processes:  pulumi.String("svchost.exe;notepad.exe"),
//					},
//					RealTimeProtectionEnabled:  pulumi.Bool(true),
//					ScheduledScanEnabled:       pulumi.Bool(true),
//					ScheduledScanType:          pulumi.String("Quick"),
//					ScheduledScanDay:           pulumi.Int(1),
//					ScheduledScanTimeInMinutes: pulumi.Int(1339),
//				},
//				AzureSecurityBaseline: &automanage.ConfigurationAzureSecurityBaselineArgs{
//					AssignmentType: pulumi.String("ApplyAndAutoCorrect"),
//				},
//				AutomationAccountEnabled: pulumi.Bool(true),
//				Backup: &automanage.ConfigurationBackupArgs{
//					PolicyName:                    pulumi.String("acctest-backup-policy-%d"),
//					TimeZone:                      pulumi.String("UTC"),
//					InstantRpRetentionRangeInDays: pulumi.Int(2),
//					SchedulePolicy: &automanage.ConfigurationBackupSchedulePolicyArgs{
//						ScheduleRunFrequency: pulumi.String("Daily"),
//						ScheduleRunDays: pulumi.StringArray{
//							pulumi.String("Monday"),
//							pulumi.String("Tuesday"),
//						},
//						ScheduleRunTimes: pulumi.StringArray{
//							pulumi.String("12:00"),
//						},
//						SchedulePolicyType: pulumi.String("SimpleSchedulePolicy"),
//					},
//					RetentionPolicy: &automanage.ConfigurationBackupRetentionPolicyArgs{
//						RetentionPolicyType: pulumi.String("LongTermRetentionPolicy"),
//						DailySchedule: &automanage.ConfigurationBackupRetentionPolicyDailyScheduleArgs{
//							RetentionTimes: pulumi.StringArray{
//								pulumi.String("12:00"),
//							},
//							RetentionDuration: &automanage.ConfigurationBackupRetentionPolicyDailyScheduleRetentionDurationArgs{
//								Count:        pulumi.Int(7),
//								DurationType: pulumi.String("Days"),
//							},
//						},
//						WeeklySchedule: &automanage.ConfigurationBackupRetentionPolicyWeeklyScheduleArgs{
//							RetentionTimes: pulumi.StringArray{
//								pulumi.String("14:00"),
//							},
//							RetentionDuration: &automanage.ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs{
//								Count:        pulumi.Int(4),
//								DurationType: pulumi.String("Weeks"),
//							},
//						},
//					},
//				},
//				BootDiagnosticsEnabled:    pulumi.Bool(true),
//				DefenderForCloudEnabled:   pulumi.Bool(true),
//				GuestConfigurationEnabled: pulumi.Bool(true),
//				LogAnalyticsEnabled:       pulumi.Bool(true),
//				StatusChangeAlertEnabled:  pulumi.Bool(true),
//				Tags: pulumi.StringMap{
//					"env": pulumi.String("test"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Automanage Configuration can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:automanage/configuration:Configuration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automanage/configurationProfiles/configurationProfile1
//
// ```
type Configuration struct {
	pulumi.CustomResourceState

	// A `antimalware` block as defined below.
	Antimalware ConfigurationAntimalwarePtrOutput `pulumi:"antimalware"`
	// Whether the automation account is enabled. Defaults to `false`.
	AutomationAccountEnabled pulumi.BoolPtrOutput `pulumi:"automationAccountEnabled"`
	// A `azureSecurityBaseline` block as defined below.
	AzureSecurityBaseline ConfigurationAzureSecurityBaselinePtrOutput `pulumi:"azureSecurityBaseline"`
	// A `backup` block as defined below.
	Backup ConfigurationBackupPtrOutput `pulumi:"backup"`
	// Whether the boot diagnostics are enabled. Defaults to `false`.
	BootDiagnosticsEnabled pulumi.BoolPtrOutput `pulumi:"bootDiagnosticsEnabled"`
	// Whether the defender for cloud is enabled. Defaults to `false`.
	DefenderForCloudEnabled pulumi.BoolPtrOutput `pulumi:"defenderForCloudEnabled"`
	// Whether the guest configuration is enabled. Defaults to `false`.
	GuestConfigurationEnabled pulumi.BoolPtrOutput `pulumi:"guestConfigurationEnabled"`
	// The Azure Region where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Whether log analytics are enabled. Defaults to `false`.
	LogAnalyticsEnabled pulumi.BoolPtrOutput `pulumi:"logAnalyticsEnabled"`
	// The name which should be used for this Automanage Configuration. Changing this forces a new Automanage Configuration to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// Whether the status change alert is enabled. Defaults to `false`.
	StatusChangeAlertEnabled pulumi.BoolPtrOutput `pulumi:"statusChangeAlertEnabled"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewConfiguration registers a new resource with the given unique name, arguments, and options.
func NewConfiguration(ctx *pulumi.Context,
	name string, args *ConfigurationArgs, opts ...pulumi.ResourceOption) (*Configuration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Configuration
	err := ctx.RegisterResource("azure:automanage/configuration:Configuration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConfiguration gets an existing Configuration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConfigurationState, opts ...pulumi.ResourceOption) (*Configuration, error) {
	var resource Configuration
	err := ctx.ReadResource("azure:automanage/configuration:Configuration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Configuration resources.
type configurationState struct {
	// A `antimalware` block as defined below.
	Antimalware *ConfigurationAntimalware `pulumi:"antimalware"`
	// Whether the automation account is enabled. Defaults to `false`.
	AutomationAccountEnabled *bool `pulumi:"automationAccountEnabled"`
	// A `azureSecurityBaseline` block as defined below.
	AzureSecurityBaseline *ConfigurationAzureSecurityBaseline `pulumi:"azureSecurityBaseline"`
	// A `backup` block as defined below.
	Backup *ConfigurationBackup `pulumi:"backup"`
	// Whether the boot diagnostics are enabled. Defaults to `false`.
	BootDiagnosticsEnabled *bool `pulumi:"bootDiagnosticsEnabled"`
	// Whether the defender for cloud is enabled. Defaults to `false`.
	DefenderForCloudEnabled *bool `pulumi:"defenderForCloudEnabled"`
	// Whether the guest configuration is enabled. Defaults to `false`.
	GuestConfigurationEnabled *bool `pulumi:"guestConfigurationEnabled"`
	// The Azure Region where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	Location *string `pulumi:"location"`
	// Whether log analytics are enabled. Defaults to `false`.
	LogAnalyticsEnabled *bool `pulumi:"logAnalyticsEnabled"`
	// The name which should be used for this Automanage Configuration. Changing this forces a new Automanage Configuration to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// Whether the status change alert is enabled. Defaults to `false`.
	StatusChangeAlertEnabled *bool `pulumi:"statusChangeAlertEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type ConfigurationState struct {
	// A `antimalware` block as defined below.
	Antimalware ConfigurationAntimalwarePtrInput
	// Whether the automation account is enabled. Defaults to `false`.
	AutomationAccountEnabled pulumi.BoolPtrInput
	// A `azureSecurityBaseline` block as defined below.
	AzureSecurityBaseline ConfigurationAzureSecurityBaselinePtrInput
	// A `backup` block as defined below.
	Backup ConfigurationBackupPtrInput
	// Whether the boot diagnostics are enabled. Defaults to `false`.
	BootDiagnosticsEnabled pulumi.BoolPtrInput
	// Whether the defender for cloud is enabled. Defaults to `false`.
	DefenderForCloudEnabled pulumi.BoolPtrInput
	// Whether the guest configuration is enabled. Defaults to `false`.
	GuestConfigurationEnabled pulumi.BoolPtrInput
	// The Azure Region where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	Location pulumi.StringPtrInput
	// Whether log analytics are enabled. Defaults to `false`.
	LogAnalyticsEnabled pulumi.BoolPtrInput
	// The name which should be used for this Automanage Configuration. Changing this forces a new Automanage Configuration to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	ResourceGroupName pulumi.StringPtrInput
	// Whether the status change alert is enabled. Defaults to `false`.
	StatusChangeAlertEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*configurationState)(nil)).Elem()
}

type configurationArgs struct {
	// A `antimalware` block as defined below.
	Antimalware *ConfigurationAntimalware `pulumi:"antimalware"`
	// Whether the automation account is enabled. Defaults to `false`.
	AutomationAccountEnabled *bool `pulumi:"automationAccountEnabled"`
	// A `azureSecurityBaseline` block as defined below.
	AzureSecurityBaseline *ConfigurationAzureSecurityBaseline `pulumi:"azureSecurityBaseline"`
	// A `backup` block as defined below.
	Backup *ConfigurationBackup `pulumi:"backup"`
	// Whether the boot diagnostics are enabled. Defaults to `false`.
	BootDiagnosticsEnabled *bool `pulumi:"bootDiagnosticsEnabled"`
	// Whether the defender for cloud is enabled. Defaults to `false`.
	DefenderForCloudEnabled *bool `pulumi:"defenderForCloudEnabled"`
	// Whether the guest configuration is enabled. Defaults to `false`.
	GuestConfigurationEnabled *bool `pulumi:"guestConfigurationEnabled"`
	// The Azure Region where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	Location *string `pulumi:"location"`
	// Whether log analytics are enabled. Defaults to `false`.
	LogAnalyticsEnabled *bool `pulumi:"logAnalyticsEnabled"`
	// The name which should be used for this Automanage Configuration. Changing this forces a new Automanage Configuration to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Whether the status change alert is enabled. Defaults to `false`.
	StatusChangeAlertEnabled *bool `pulumi:"statusChangeAlertEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Configuration resource.
type ConfigurationArgs struct {
	// A `antimalware` block as defined below.
	Antimalware ConfigurationAntimalwarePtrInput
	// Whether the automation account is enabled. Defaults to `false`.
	AutomationAccountEnabled pulumi.BoolPtrInput
	// A `azureSecurityBaseline` block as defined below.
	AzureSecurityBaseline ConfigurationAzureSecurityBaselinePtrInput
	// A `backup` block as defined below.
	Backup ConfigurationBackupPtrInput
	// Whether the boot diagnostics are enabled. Defaults to `false`.
	BootDiagnosticsEnabled pulumi.BoolPtrInput
	// Whether the defender for cloud is enabled. Defaults to `false`.
	DefenderForCloudEnabled pulumi.BoolPtrInput
	// Whether the guest configuration is enabled. Defaults to `false`.
	GuestConfigurationEnabled pulumi.BoolPtrInput
	// The Azure Region where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	Location pulumi.StringPtrInput
	// Whether log analytics are enabled. Defaults to `false`.
	LogAnalyticsEnabled pulumi.BoolPtrInput
	// The name which should be used for this Automanage Configuration. Changing this forces a new Automanage Configuration to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
	ResourceGroupName pulumi.StringInput
	// Whether the status change alert is enabled. Defaults to `false`.
	StatusChangeAlertEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*configurationArgs)(nil)).Elem()
}

type ConfigurationInput interface {
	pulumi.Input

	ToConfigurationOutput() ConfigurationOutput
	ToConfigurationOutputWithContext(ctx context.Context) ConfigurationOutput
}

func (*Configuration) ElementType() reflect.Type {
	return reflect.TypeOf((**Configuration)(nil)).Elem()
}

func (i *Configuration) ToConfigurationOutput() ConfigurationOutput {
	return i.ToConfigurationOutputWithContext(context.Background())
}

func (i *Configuration) ToConfigurationOutputWithContext(ctx context.Context) ConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigurationOutput)
}

// ConfigurationArrayInput is an input type that accepts ConfigurationArray and ConfigurationArrayOutput values.
// You can construct a concrete instance of `ConfigurationArrayInput` via:
//
//	ConfigurationArray{ ConfigurationArgs{...} }
type ConfigurationArrayInput interface {
	pulumi.Input

	ToConfigurationArrayOutput() ConfigurationArrayOutput
	ToConfigurationArrayOutputWithContext(context.Context) ConfigurationArrayOutput
}

type ConfigurationArray []ConfigurationInput

func (ConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Configuration)(nil)).Elem()
}

func (i ConfigurationArray) ToConfigurationArrayOutput() ConfigurationArrayOutput {
	return i.ToConfigurationArrayOutputWithContext(context.Background())
}

func (i ConfigurationArray) ToConfigurationArrayOutputWithContext(ctx context.Context) ConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigurationArrayOutput)
}

// ConfigurationMapInput is an input type that accepts ConfigurationMap and ConfigurationMapOutput values.
// You can construct a concrete instance of `ConfigurationMapInput` via:
//
//	ConfigurationMap{ "key": ConfigurationArgs{...} }
type ConfigurationMapInput interface {
	pulumi.Input

	ToConfigurationMapOutput() ConfigurationMapOutput
	ToConfigurationMapOutputWithContext(context.Context) ConfigurationMapOutput
}

type ConfigurationMap map[string]ConfigurationInput

func (ConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Configuration)(nil)).Elem()
}

func (i ConfigurationMap) ToConfigurationMapOutput() ConfigurationMapOutput {
	return i.ToConfigurationMapOutputWithContext(context.Background())
}

func (i ConfigurationMap) ToConfigurationMapOutputWithContext(ctx context.Context) ConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigurationMapOutput)
}

type ConfigurationOutput struct{ *pulumi.OutputState }

func (ConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Configuration)(nil)).Elem()
}

func (o ConfigurationOutput) ToConfigurationOutput() ConfigurationOutput {
	return o
}

func (o ConfigurationOutput) ToConfigurationOutputWithContext(ctx context.Context) ConfigurationOutput {
	return o
}

// A `antimalware` block as defined below.
func (o ConfigurationOutput) Antimalware() ConfigurationAntimalwarePtrOutput {
	return o.ApplyT(func(v *Configuration) ConfigurationAntimalwarePtrOutput { return v.Antimalware }).(ConfigurationAntimalwarePtrOutput)
}

// Whether the automation account is enabled. Defaults to `false`.
func (o ConfigurationOutput) AutomationAccountEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Configuration) pulumi.BoolPtrOutput { return v.AutomationAccountEnabled }).(pulumi.BoolPtrOutput)
}

// A `azureSecurityBaseline` block as defined below.
func (o ConfigurationOutput) AzureSecurityBaseline() ConfigurationAzureSecurityBaselinePtrOutput {
	return o.ApplyT(func(v *Configuration) ConfigurationAzureSecurityBaselinePtrOutput { return v.AzureSecurityBaseline }).(ConfigurationAzureSecurityBaselinePtrOutput)
}

// A `backup` block as defined below.
func (o ConfigurationOutput) Backup() ConfigurationBackupPtrOutput {
	return o.ApplyT(func(v *Configuration) ConfigurationBackupPtrOutput { return v.Backup }).(ConfigurationBackupPtrOutput)
}

// Whether the boot diagnostics are enabled. Defaults to `false`.
func (o ConfigurationOutput) BootDiagnosticsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Configuration) pulumi.BoolPtrOutput { return v.BootDiagnosticsEnabled }).(pulumi.BoolPtrOutput)
}

// Whether the defender for cloud is enabled. Defaults to `false`.
func (o ConfigurationOutput) DefenderForCloudEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Configuration) pulumi.BoolPtrOutput { return v.DefenderForCloudEnabled }).(pulumi.BoolPtrOutput)
}

// Whether the guest configuration is enabled. Defaults to `false`.
func (o ConfigurationOutput) GuestConfigurationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Configuration) pulumi.BoolPtrOutput { return v.GuestConfigurationEnabled }).(pulumi.BoolPtrOutput)
}

// The Azure Region where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
func (o ConfigurationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Configuration) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Whether log analytics are enabled. Defaults to `false`.
func (o ConfigurationOutput) LogAnalyticsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Configuration) pulumi.BoolPtrOutput { return v.LogAnalyticsEnabled }).(pulumi.BoolPtrOutput)
}

// The name which should be used for this Automanage Configuration. Changing this forces a new Automanage Configuration to be created.
func (o ConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Configuration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Automanage Configuration should exist. Changing this forces a new Automanage Configuration to be created.
func (o ConfigurationOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Configuration) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Whether the status change alert is enabled. Defaults to `false`.
func (o ConfigurationOutput) StatusChangeAlertEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Configuration) pulumi.BoolPtrOutput { return v.StatusChangeAlertEnabled }).(pulumi.BoolPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o ConfigurationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Configuration) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ConfigurationArrayOutput struct{ *pulumi.OutputState }

func (ConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Configuration)(nil)).Elem()
}

func (o ConfigurationArrayOutput) ToConfigurationArrayOutput() ConfigurationArrayOutput {
	return o
}

func (o ConfigurationArrayOutput) ToConfigurationArrayOutputWithContext(ctx context.Context) ConfigurationArrayOutput {
	return o
}

func (o ConfigurationArrayOutput) Index(i pulumi.IntInput) ConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Configuration {
		return vs[0].([]*Configuration)[vs[1].(int)]
	}).(ConfigurationOutput)
}

type ConfigurationMapOutput struct{ *pulumi.OutputState }

func (ConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Configuration)(nil)).Elem()
}

func (o ConfigurationMapOutput) ToConfigurationMapOutput() ConfigurationMapOutput {
	return o
}

func (o ConfigurationMapOutput) ToConfigurationMapOutputWithContext(ctx context.Context) ConfigurationMapOutput {
	return o
}

func (o ConfigurationMapOutput) MapIndex(k pulumi.StringInput) ConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Configuration {
		return vs[0].(map[string]*Configuration)[vs[1].(string)]
	}).(ConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigurationInput)(nil)).Elem(), &Configuration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigurationArrayInput)(nil)).Elem(), ConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigurationMapInput)(nil)).Elem(), ConfigurationMap{})
	pulumi.RegisterOutputType(ConfigurationOutput{})
	pulumi.RegisterOutputType(ConfigurationArrayOutput{})
	pulumi.RegisterOutputType(ConfigurationMapOutput{})
}