// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an Alert Processing Rule which suppress notifications.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleAlertProcessingRuleSuppression = new azure.monitoring.AlertProcessingRuleSuppression("exampleAlertProcessingRuleSuppression", {
 *     resourceGroupName: "example",
 *     scopes: [exampleResourceGroup.id],
 *     condition: {
 *         targetResourceType: {
 *             operator: "Equals",
 *             values: ["Microsoft.Compute/VirtualMachines"],
 *         },
 *         severity: {
 *             operator: "Equals",
 *             values: [
 *                 "Sev0",
 *                 "Sev1",
 *                 "Sev2",
 *             ],
 *         },
 *     },
 *     schedule: {
 *         effectiveFrom: "2022-01-01T01:02:03",
 *         effectiveUntil: "2022-02-02T01:02:03",
 *         timeZone: "Pacific Standard Time",
 *         recurrence: {
 *             dailies: [{
 *                 startTime: "17:00:00",
 *                 endTime: "09:00:00",
 *             }],
 *             weeklies: [{
 *                 daysOfWeeks: [
 *                     "Saturday",
 *                     "Sunday",
 *                 ],
 *             }],
 *         },
 *     },
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Alert Processing Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:monitoring/alertProcessingRuleSuppression:AlertProcessingRuleSuppression example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.AlertsManagement/actionRules/actionRule1
 * ```
 */
export class AlertProcessingRuleSuppression extends pulumi.CustomResource {
    /**
     * Get an existing AlertProcessingRuleSuppression resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertProcessingRuleSuppressionState, opts?: pulumi.CustomResourceOptions): AlertProcessingRuleSuppression {
        return new AlertProcessingRuleSuppression(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:monitoring/alertProcessingRuleSuppression:AlertProcessingRuleSuppression';

    /**
     * Returns true if the given object is an instance of AlertProcessingRuleSuppression.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertProcessingRuleSuppression {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertProcessingRuleSuppression.__pulumiType;
    }

    /**
     * A `condition` block as defined below.
     */
    public readonly condition!: pulumi.Output<outputs.monitoring.AlertProcessingRuleSuppressionCondition | undefined>;
    /**
     * Specifies a description for the Alert Processing Rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Should the Alert Processing Rule be enabled? Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name which should be used for this Alert Processing Rule. Changing this forces a new Alert Processing Rule to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Alert Processing Rule should exist. Changing this forces a new Alert Processing Rule to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `schedule` block as defined below.
     */
    public readonly schedule!: pulumi.Output<outputs.monitoring.AlertProcessingRuleSuppressionSchedule | undefined>;
    /**
     * A list of resource IDs which will be the target of Alert Processing Rule.
     */
    public readonly scopes!: pulumi.Output<string[]>;
    /**
     * A mapping of tags which should be assigned to the Alert Processing Rule.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a AlertProcessingRuleSuppression resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertProcessingRuleSuppressionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertProcessingRuleSuppressionArgs | AlertProcessingRuleSuppressionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertProcessingRuleSuppressionState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["scopes"] = state ? state.scopes : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as AlertProcessingRuleSuppressionArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.scopes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scopes'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["scopes"] = args ? args.scopes : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertProcessingRuleSuppression.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertProcessingRuleSuppression resources.
 */
export interface AlertProcessingRuleSuppressionState {
    /**
     * A `condition` block as defined below.
     */
    condition?: pulumi.Input<inputs.monitoring.AlertProcessingRuleSuppressionCondition>;
    /**
     * Specifies a description for the Alert Processing Rule.
     */
    description?: pulumi.Input<string>;
    /**
     * Should the Alert Processing Rule be enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name which should be used for this Alert Processing Rule. Changing this forces a new Alert Processing Rule to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Alert Processing Rule should exist. Changing this forces a new Alert Processing Rule to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `schedule` block as defined below.
     */
    schedule?: pulumi.Input<inputs.monitoring.AlertProcessingRuleSuppressionSchedule>;
    /**
     * A list of resource IDs which will be the target of Alert Processing Rule.
     */
    scopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags which should be assigned to the Alert Processing Rule.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a AlertProcessingRuleSuppression resource.
 */
export interface AlertProcessingRuleSuppressionArgs {
    /**
     * A `condition` block as defined below.
     */
    condition?: pulumi.Input<inputs.monitoring.AlertProcessingRuleSuppressionCondition>;
    /**
     * Specifies a description for the Alert Processing Rule.
     */
    description?: pulumi.Input<string>;
    /**
     * Should the Alert Processing Rule be enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name which should be used for this Alert Processing Rule. Changing this forces a new Alert Processing Rule to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Alert Processing Rule should exist. Changing this forces a new Alert Processing Rule to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `schedule` block as defined below.
     */
    schedule?: pulumi.Input<inputs.monitoring.AlertProcessingRuleSuppressionSchedule>;
    /**
     * A list of resource IDs which will be the target of Alert Processing Rule.
     */
    scopes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags which should be assigned to the Alert Processing Rule.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}