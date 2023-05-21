// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class PgAnomalies extends pulumi.CustomResource {
    /**
     * Get an existing PgAnomalies resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PgAnomaliesState, opts?: pulumi.CustomResourceOptions): PgAnomalies {
        return new PgAnomalies(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/pgAnomalies:PgAnomalies';

    /**
     * Returns true if the given object is an instance of PgAnomalies.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PgAnomalies {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PgAnomalies.__pulumiType;
    }

    /**
     * Configuration of the availability monitoring for the process group.
     */
    public readonly availability!: pulumi.Output<outputs.PgAnomaliesAvailability | undefined>;
    /**
     * The ID of the process group
     */
    public readonly pgId!: pulumi.Output<string>;

    /**
     * Create a PgAnomalies resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PgAnomaliesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PgAnomaliesArgs | PgAnomaliesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PgAnomaliesState | undefined;
            resourceInputs["availability"] = state ? state.availability : undefined;
            resourceInputs["pgId"] = state ? state.pgId : undefined;
        } else {
            const args = argsOrState as PgAnomaliesArgs | undefined;
            if ((!args || args.pgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pgId'");
            }
            resourceInputs["availability"] = args ? args.availability : undefined;
            resourceInputs["pgId"] = args ? args.pgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PgAnomalies.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PgAnomalies resources.
 */
export interface PgAnomaliesState {
    /**
     * Configuration of the availability monitoring for the process group.
     */
    availability?: pulumi.Input<inputs.PgAnomaliesAvailability>;
    /**
     * The ID of the process group
     */
    pgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PgAnomalies resource.
 */
export interface PgAnomaliesArgs {
    /**
     * Configuration of the availability monitoring for the process group.
     */
    availability?: pulumi.Input<inputs.PgAnomaliesAvailability>;
    /**
     * The ID of the process group
     */
    pgId: pulumi.Input<string>;
}
