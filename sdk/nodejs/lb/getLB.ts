// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Load Balancer
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * 
 * const test = pulumi.output(azure.lb.getLB({
 *     name: "example-lb",
 *     resourceGroupName: "example-resources",
 * }));
 * 
 * export const loadbalancerId = test.apply(test => test.id);
 * ```
 */
export function getLB(args: GetLBArgs, opts?: pulumi.InvokeOptions): Promise<GetLBResult> {
    return pulumi.runtime.invoke("azure:lb/getLB:getLB", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getLB.
 */
export interface GetLBArgs {
    /**
     * Specifies the name of the Load Balancer.
     */
    readonly name: string;
    /**
     * The name of the Resource Group in which the Load Balancer exists.
     */
    readonly resourceGroupName: string;
}

/**
 * A collection of values returned by getLB.
 */
export interface GetLBResult {
    /**
     * (Optional) A `frontend_ip_configuration` block as documented below.
     */
    readonly frontendIpConfigurations: { name: string, privateIpAddress: string, privateIpAddressAllocation: string, publicIpAddressId: string, subnetId: string, zones: string[] }[];
    /**
     * The Azure location where the Load Balancer exists.
     */
    readonly location: string;
    /**
     * Private IP Address to assign to the Load Balancer.
     */
    readonly privateIpAddress: string;
    /**
     * The list of private IP address assigned to the load balancer in `frontend_ip_configuration` blocks, if any.
     */
    readonly privateIpAddresses: string[];
    /**
     * The SKU of the Load Balancer.
     */
    readonly sku: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    readonly tags: {[key: string]: any};
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}