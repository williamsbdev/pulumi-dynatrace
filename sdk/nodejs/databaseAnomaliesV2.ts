// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class DatabaseAnomaliesV2 extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseAnomaliesV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseAnomaliesV2State, opts?: pulumi.CustomResourceOptions): DatabaseAnomaliesV2 {
        return new DatabaseAnomaliesV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/databaseAnomaliesV2:DatabaseAnomaliesV2';

    /**
     * Returns true if the given object is an instance of DatabaseAnomaliesV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseAnomaliesV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseAnomaliesV2.__pulumiType;
    }

    /**
     * Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
     */
    public readonly databaseConnections!: pulumi.Output<outputs.DatabaseAnomaliesV2DatabaseConnections>;
    /**
     * Failure rate
     */
    public readonly failureRate!: pulumi.Output<outputs.DatabaseAnomaliesV2FailureRate>;
    /**
     * Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
     */
    public readonly loadDrops!: pulumi.Output<outputs.DatabaseAnomaliesV2LoadDrops>;
    /**
     * Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
     */
    public readonly loadSpikes!: pulumi.Output<outputs.DatabaseAnomaliesV2LoadSpikes>;
    /**
     * Response time
     */
    public readonly responseTime!: pulumi.Output<outputs.DatabaseAnomaliesV2ResponseTime>;
    /**
     * The scope for the database anomaly detection
     */
    public readonly scope!: pulumi.Output<string>;

    /**
     * Create a DatabaseAnomaliesV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseAnomaliesV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseAnomaliesV2Args | DatabaseAnomaliesV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseAnomaliesV2State | undefined;
            resourceInputs["databaseConnections"] = state ? state.databaseConnections : undefined;
            resourceInputs["failureRate"] = state ? state.failureRate : undefined;
            resourceInputs["loadDrops"] = state ? state.loadDrops : undefined;
            resourceInputs["loadSpikes"] = state ? state.loadSpikes : undefined;
            resourceInputs["responseTime"] = state ? state.responseTime : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
        } else {
            const args = argsOrState as DatabaseAnomaliesV2Args | undefined;
            if ((!args || args.databaseConnections === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseConnections'");
            }
            if ((!args || args.failureRate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'failureRate'");
            }
            if ((!args || args.loadDrops === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadDrops'");
            }
            if ((!args || args.loadSpikes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadSpikes'");
            }
            if ((!args || args.responseTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'responseTime'");
            }
            if ((!args || args.scope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scope'");
            }
            resourceInputs["databaseConnections"] = args ? args.databaseConnections : undefined;
            resourceInputs["failureRate"] = args ? args.failureRate : undefined;
            resourceInputs["loadDrops"] = args ? args.loadDrops : undefined;
            resourceInputs["loadSpikes"] = args ? args.loadSpikes : undefined;
            resourceInputs["responseTime"] = args ? args.responseTime : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseAnomaliesV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseAnomaliesV2 resources.
 */
export interface DatabaseAnomaliesV2State {
    /**
     * Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
     */
    databaseConnections?: pulumi.Input<inputs.DatabaseAnomaliesV2DatabaseConnections>;
    /**
     * Failure rate
     */
    failureRate?: pulumi.Input<inputs.DatabaseAnomaliesV2FailureRate>;
    /**
     * Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
     */
    loadDrops?: pulumi.Input<inputs.DatabaseAnomaliesV2LoadDrops>;
    /**
     * Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
     */
    loadSpikes?: pulumi.Input<inputs.DatabaseAnomaliesV2LoadSpikes>;
    /**
     * Response time
     */
    responseTime?: pulumi.Input<inputs.DatabaseAnomaliesV2ResponseTime>;
    /**
     * The scope for the database anomaly detection
     */
    scope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseAnomaliesV2 resource.
 */
export interface DatabaseAnomaliesV2Args {
    /**
     * Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
     */
    databaseConnections: pulumi.Input<inputs.DatabaseAnomaliesV2DatabaseConnections>;
    /**
     * Failure rate
     */
    failureRate: pulumi.Input<inputs.DatabaseAnomaliesV2FailureRate>;
    /**
     * Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
     */
    loadDrops: pulumi.Input<inputs.DatabaseAnomaliesV2LoadDrops>;
    /**
     * Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
     */
    loadSpikes: pulumi.Input<inputs.DatabaseAnomaliesV2LoadSpikes>;
    /**
     * Response time
     */
    responseTime: pulumi.Input<inputs.DatabaseAnomaliesV2ResponseTime>;
    /**
     * The scope for the database anomaly detection
     */
    scope: pulumi.Input<string>;
}
