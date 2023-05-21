// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The process group data source allows the process group ID to be retrieved by its name and optionally tags / tag-value pairs.
 *
 * - `name` queries for all process groups with the specified name
 * - `tags` (optional) refers to the tags that need to be present for the process group (inclusive)
 *
 * If multiple process groups match the given criteria, the first result will be retrieved.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dynatrace from "@lbrlabs/pulumi-dynatrace";
 * import * as dynatrace from "@pulumi/dynatrace";
 *
 * const test = dynatrace.getProcessGroup({
 *     name: "Example",
 *     tags: [
 *         "TerraformKeyTest",
 *         "TerraformKeyValueTest=TestValue",
 *     ],
 * });
 * const _name_ = new dynatrace.ManagementZone("#name#", {entitySelectorBasedRules: [{
 *     enabled: true,
 *     selector: test.then(test => `type("process_group"),entityId("${test.id}")`),
 * }]});
 * ```
 */
export function getProcessGroup(args: GetProcessGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetProcessGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dynatrace:index/getProcessGroup:getProcessGroup", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getProcessGroup.
 */
export interface GetProcessGroupArgs {
    name: string;
    /**
     * Required tags of the process group to find
     */
    tags?: string[];
}

/**
 * A collection of values returned by getProcessGroup.
 */
export interface GetProcessGroupResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Required tags of the process group to find
     */
    readonly tags?: string[];
}
/**
 * The process group data source allows the process group ID to be retrieved by its name and optionally tags / tag-value pairs.
 *
 * - `name` queries for all process groups with the specified name
 * - `tags` (optional) refers to the tags that need to be present for the process group (inclusive)
 *
 * If multiple process groups match the given criteria, the first result will be retrieved.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dynatrace from "@lbrlabs/pulumi-dynatrace";
 * import * as dynatrace from "@pulumi/dynatrace";
 *
 * const test = dynatrace.getProcessGroup({
 *     name: "Example",
 *     tags: [
 *         "TerraformKeyTest",
 *         "TerraformKeyValueTest=TestValue",
 *     ],
 * });
 * const _name_ = new dynatrace.ManagementZone("#name#", {entitySelectorBasedRules: [{
 *     enabled: true,
 *     selector: test.then(test => `type("process_group"),entityId("${test.id}")`),
 * }]});
 * ```
 */
export function getProcessGroupOutput(args: GetProcessGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProcessGroupResult> {
    return pulumi.output(args).apply((a: any) => getProcessGroup(a, opts))
}

/**
 * A collection of arguments for invoking getProcessGroup.
 */
export interface GetProcessGroupOutputArgs {
    name: pulumi.Input<string>;
    /**
     * Required tags of the process group to find
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
