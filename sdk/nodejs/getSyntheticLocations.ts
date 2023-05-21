// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The synthetic locations data source allows the location IDs to be retrieved based off of provided parameters.
 */
export function getSyntheticLocations(args?: GetSyntheticLocationsArgs, opts?: pulumi.InvokeOptions): Promise<GetSyntheticLocationsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dynatrace:index/getSyntheticLocations:getSyntheticLocations", {
        "id": args.id,
        "locations": args.locations,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSyntheticLocations.
 */
export interface GetSyntheticLocationsArgs {
    /**
     * The ID of this resource.
     */
    id?: string;
    locations?: inputs.GetSyntheticLocationsLocations;
    name?: string;
}

/**
 * A collection of values returned by getSyntheticLocations.
 */
export interface GetSyntheticLocationsResult {
    /**
     * The ID of this resource.
     */
    readonly id?: string;
    readonly locations: outputs.GetSyntheticLocationsLocations;
    readonly name?: string;
}
/**
 * The synthetic locations data source allows the location IDs to be retrieved based off of provided parameters.
 */
export function getSyntheticLocationsOutput(args?: GetSyntheticLocationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSyntheticLocationsResult> {
    return pulumi.output(args).apply((a: any) => getSyntheticLocations(a, opts))
}

/**
 * A collection of arguments for invoking getSyntheticLocations.
 */
export interface GetSyntheticLocationsOutputArgs {
    /**
     * The ID of this resource.
     */
    id?: pulumi.Input<string>;
    locations?: pulumi.Input<inputs.GetSyntheticLocationsLocationsArgs>;
    name?: pulumi.Input<string>;
}
