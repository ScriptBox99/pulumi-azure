// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
import com.pulumi.azure.sentinel.inputs.LogAnalyticsWorkspaceOnboardingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Security Insights Sentinel Onboarding.
 * 
 * ## Import
 * 
 * Security Insights Sentinel Onboarding States can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/onboardingStates/defaults
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding")
public class LogAnalyticsWorkspaceOnboarding extends com.pulumi.resources.CustomResource {
    /**
     * Specifies if the Workspace is using Customer managed key. Defaults to `false`.
     * 
     */
    @Export(name="customerManagedKeyEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> customerManagedKeyEnabled;

    /**
     * @return Specifies if the Workspace is using Customer managed key. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> customerManagedKeyEnabled() {
        return Codegen.optional(this.customerManagedKeyEnabled);
    }
    /**
     * Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
     * 
     */
    @Export(name="workspaceName", type=String.class, parameters={})
    private Output<String> workspaceName;

    /**
     * @return Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogAnalyticsWorkspaceOnboarding(String name) {
        this(name, LogAnalyticsWorkspaceOnboardingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogAnalyticsWorkspaceOnboarding(String name, LogAnalyticsWorkspaceOnboardingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogAnalyticsWorkspaceOnboarding(String name, LogAnalyticsWorkspaceOnboardingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding", name, args == null ? LogAnalyticsWorkspaceOnboardingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogAnalyticsWorkspaceOnboarding(String name, Output<String> id, @Nullable LogAnalyticsWorkspaceOnboardingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LogAnalyticsWorkspaceOnboarding get(String name, Output<String> id, @Nullable LogAnalyticsWorkspaceOnboardingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogAnalyticsWorkspaceOnboarding(name, id, state, options);
    }
}