// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages an Application Insights Workbook Template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleWorkbookTemplate = new azure.appinsights.WorkbookTemplate("exampleWorkbookTemplate", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: "West Europe",
 *     author: "test author",
 *     priority: 1,
 *     galleries: [{
 *         category: "workbook",
 *         name: "test",
 *         order: 100,
 *         resourceType: "microsoft.insights/components",
 *         type: "tsg",
 *     }],
 *     templateData: JSON.stringify({
 *         version: "Notebook/1.0",
 *         items: [{
 *             type: 1,
 *             content: {
 *                 json: `## New workbook
 * ---
 *
 * Welcome to your new workbook.`,
 *             },
 *             name: "text - 2",
 *         }],
 *         styleSettings: {},
 *         `$schema`: "https://github.com/Microsoft/Application-Insights-Workbooks/blob/master/schema/workbook.json",
 *     }),
 *     localized: JSON.stringify({
 *         ar: [{
 *             galleries: [{
 *                 name: "test",
 *                 category: "Failures",
 *                 type: "tsg",
 *                 resourceType: "microsoft.insights/components",
 *                 order: 100,
 *             }],
 *             templateData: {
 *                 version: "Notebook/1.0",
 *                 items: [{
 *                     type: 1,
 *                     content: {
 *                         json: `## New workbook
 * ---
 *
 * Welcome to your new workbook.`,
 *                     },
 *                     name: "text - 2",
 *                 }],
 *                 styleSettings: {},
 *                 `$schema`: "https://github.com/Microsoft/Application-Insights-Workbooks/blob/master/schema/workbook.json",
 *             },
 *         }],
 *     }),
 *     tags: {
 *         key: "value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Application Insights Workbook Template can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:appinsights/workbookTemplate:WorkbookTemplate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Insights/workbooktemplates/resource1
 * ```
 */
export class WorkbookTemplate extends pulumi.CustomResource {
    /**
     * Get an existing WorkbookTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkbookTemplateState, opts?: pulumi.CustomResourceOptions): WorkbookTemplate {
        return new WorkbookTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appinsights/workbookTemplate:WorkbookTemplate';

    /**
     * Returns true if the given object is an instance of WorkbookTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkbookTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkbookTemplate.__pulumiType;
    }

    /**
     * Information about the author of the workbook template.
     */
    public readonly author!: pulumi.Output<string | undefined>;
    /**
     * A `galleries` block as defined below.
     */
    public readonly galleries!: pulumi.Output<outputs.appinsights.WorkbookTemplateGallery[]>;
    /**
     * Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     */
    public readonly localized!: pulumi.Output<string | undefined>;
    /**
     * Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Application Insights Workbook Template.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Valid JSON object containing workbook template payload.
     */
    public readonly templateData!: pulumi.Output<string>;

    /**
     * Create a WorkbookTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkbookTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkbookTemplateArgs | WorkbookTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkbookTemplateState | undefined;
            resourceInputs["author"] = state ? state.author : undefined;
            resourceInputs["galleries"] = state ? state.galleries : undefined;
            resourceInputs["localized"] = state ? state.localized : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["templateData"] = state ? state.templateData : undefined;
        } else {
            const args = argsOrState as WorkbookTemplateArgs | undefined;
            if ((!args || args.galleries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'galleries'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.templateData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateData'");
            }
            resourceInputs["author"] = args ? args.author : undefined;
            resourceInputs["galleries"] = args ? args.galleries : undefined;
            resourceInputs["localized"] = args ? args.localized : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["templateData"] = args ? args.templateData : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkbookTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkbookTemplate resources.
 */
export interface WorkbookTemplateState {
    /**
     * Information about the author of the workbook template.
     */
    author?: pulumi.Input<string>;
    /**
     * A `galleries` block as defined below.
     */
    galleries?: pulumi.Input<pulumi.Input<inputs.appinsights.WorkbookTemplateGallery>[]>;
    /**
     * Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     */
    localized?: pulumi.Input<string>;
    /**
     * Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
     */
    priority?: pulumi.Input<number>;
    /**
     * Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Application Insights Workbook Template.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Valid JSON object containing workbook template payload.
     */
    templateData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkbookTemplate resource.
 */
export interface WorkbookTemplateArgs {
    /**
     * Information about the author of the workbook template.
     */
    author?: pulumi.Input<string>;
    /**
     * A `galleries` block as defined below.
     */
    galleries: pulumi.Input<pulumi.Input<inputs.appinsights.WorkbookTemplateGallery>[]>;
    /**
     * Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     */
    localized?: pulumi.Input<string>;
    /**
     * Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
     */
    priority?: pulumi.Input<number>;
    /**
     * Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Application Insights Workbook Template.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Valid JSON object containing workbook template payload.
     */
    templateData: pulumi.Input<string>;
}