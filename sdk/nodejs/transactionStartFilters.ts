// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class TransactionStartFilters extends pulumi.CustomResource {
    /**
     * Get an existing TransactionStartFilters resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransactionStartFiltersState, opts?: pulumi.CustomResourceOptions): TransactionStartFilters {
        return new TransactionStartFilters(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/transactionStartFilters:TransactionStartFilters';

    /**
     * Returns true if the given object is an instance of TransactionStartFilters.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransactionStartFilters {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransactionStartFilters.__pulumiType;
    }

    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    public readonly cicsTerminalTransactionIds!: pulumi.Output<string[] | undefined>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    public readonly cicsTransactionIds!: pulumi.Output<string[] | undefined>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    public readonly imsTerminalTransactionIds!: pulumi.Output<string[] | undefined>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    public readonly imsTransactionIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a TransactionStartFilters resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TransactionStartFiltersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransactionStartFiltersArgs | TransactionStartFiltersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransactionStartFiltersState | undefined;
            resourceInputs["cicsTerminalTransactionIds"] = state ? state.cicsTerminalTransactionIds : undefined;
            resourceInputs["cicsTransactionIds"] = state ? state.cicsTransactionIds : undefined;
            resourceInputs["imsTerminalTransactionIds"] = state ? state.imsTerminalTransactionIds : undefined;
            resourceInputs["imsTransactionIds"] = state ? state.imsTransactionIds : undefined;
        } else {
            const args = argsOrState as TransactionStartFiltersArgs | undefined;
            resourceInputs["cicsTerminalTransactionIds"] = args ? args.cicsTerminalTransactionIds : undefined;
            resourceInputs["cicsTransactionIds"] = args ? args.cicsTransactionIds : undefined;
            resourceInputs["imsTerminalTransactionIds"] = args ? args.imsTerminalTransactionIds : undefined;
            resourceInputs["imsTransactionIds"] = args ? args.imsTransactionIds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransactionStartFilters.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransactionStartFilters resources.
 */
export interface TransactionStartFiltersState {
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    cicsTerminalTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    cicsTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    imsTerminalTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    imsTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a TransactionStartFilters resource.
 */
export interface TransactionStartFiltersArgs {
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    cicsTerminalTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    cicsTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    imsTerminalTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     */
    imsTransactionIds?: pulumi.Input<pulumi.Input<string>[]>;
}