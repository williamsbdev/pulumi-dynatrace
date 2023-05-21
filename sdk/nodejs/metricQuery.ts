// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class MetricQuery extends pulumi.CustomResource {
    /**
     * Get an existing MetricQuery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MetricQueryState, opts?: pulumi.CustomResourceOptions): MetricQuery {
        return new MetricQuery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/metricQuery:MetricQuery';

    /**
     * Returns true if the given object is an instance of MetricQuery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MetricQuery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MetricQuery.__pulumiType;
    }

    /**
     * The scope of this setting (metric)
     */
    public readonly metricId!: pulumi.Output<string>;
    /**
     * Query
     */
    public readonly metricSelector!: pulumi.Output<string>;

    /**
     * Create a MetricQuery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MetricQueryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MetricQueryArgs | MetricQueryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MetricQueryState | undefined;
            resourceInputs["metricId"] = state ? state.metricId : undefined;
            resourceInputs["metricSelector"] = state ? state.metricSelector : undefined;
        } else {
            const args = argsOrState as MetricQueryArgs | undefined;
            if ((!args || args.metricId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricId'");
            }
            if ((!args || args.metricSelector === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricSelector'");
            }
            resourceInputs["metricId"] = args ? args.metricId : undefined;
            resourceInputs["metricSelector"] = args ? args.metricSelector : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MetricQuery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MetricQuery resources.
 */
export interface MetricQueryState {
    /**
     * The scope of this setting (metric)
     */
    metricId?: pulumi.Input<string>;
    /**
     * Query
     */
    metricSelector?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MetricQuery resource.
 */
export interface MetricQueryArgs {
    /**
     * The scope of this setting (metric)
     */
    metricId: pulumi.Input<string>;
    /**
     * Query
     */
    metricSelector: pulumi.Input<string>;
}
