// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Gets information about an existing CDN FrontDoor Rule Set.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = pulumi.output(azure.cdn.getFrontdoorRuleSet({
 *     name: "existing-rule-set",
 *     profileName: "existing-profile",
 *     resourceGroupName: "existing-resources",
 * }));
 * ```
 */
export function getFrontdoorRuleSet(args: GetFrontdoorRuleSetArgs, opts?: pulumi.InvokeOptions): Promise<GetFrontdoorRuleSetResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("azure:cdn/getFrontdoorRuleSet:getFrontdoorRuleSet", {
        "name": args.name,
        "profileName": args.profileName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFrontdoorRuleSet.
 */
export interface GetFrontdoorRuleSetArgs {
    /**
     * Specifies the name of the CDN FrontDoor Rule Set to retrieve.
     */
    name: string;
    /**
     * Specifies the name of the CDN FrontDoor Profile where this CDN FrontDoor Rule Set exists.
     */
    profileName: string;
    /**
     * Specifies the name of the Resource Group where the CDN FrontDoor Profile exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getFrontdoorRuleSet.
 */
export interface GetFrontdoorRuleSetResult {
    /**
     * The ID of the CDN FrontDoor Profile within which this CDN FrontDoor Rule Set exists.
     */
    readonly cdnFrontdoorProfileId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly profileName: string;
    readonly resourceGroupName: string;
}

export function getFrontdoorRuleSetOutput(args: GetFrontdoorRuleSetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFrontdoorRuleSetResult> {
    return pulumi.output(args).apply(a => getFrontdoorRuleSet(a, opts))
}

/**
 * A collection of arguments for invoking getFrontdoorRuleSet.
 */
export interface GetFrontdoorRuleSetOutputArgs {
    /**
     * Specifies the name of the CDN FrontDoor Rule Set to retrieve.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the CDN FrontDoor Profile where this CDN FrontDoor Rule Set exists.
     */
    profileName: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group where the CDN FrontDoor Profile exists.
     */
    resourceGroupName: pulumi.Input<string>;
}