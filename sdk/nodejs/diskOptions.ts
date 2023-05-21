// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class DiskOptions extends pulumi.CustomResource {
    /**
     * Get an existing DiskOptions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiskOptionsState, opts?: pulumi.CustomResourceOptions): DiskOptions {
        return new DiskOptions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/diskOptions:DiskOptions';

    /**
     * Returns true if the given object is an instance of DiskOptions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DiskOptions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DiskOptions.__pulumiType;
    }

    /**
     * OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
     * disks from the monitoring list.
     */
    public readonly exclusions!: pulumi.Output<outputs.DiskOptionsExclusions | undefined>;
    /**
     * When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
     * Requires OneAgent 1.209 or later
     */
    public readonly nfsShowAll!: pulumi.Output<boolean>;
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     */
    public readonly scope!: pulumi.Output<string | undefined>;

    /**
     * Create a DiskOptions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DiskOptionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DiskOptionsArgs | DiskOptionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DiskOptionsState | undefined;
            resourceInputs["exclusions"] = state ? state.exclusions : undefined;
            resourceInputs["nfsShowAll"] = state ? state.nfsShowAll : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
        } else {
            const args = argsOrState as DiskOptionsArgs | undefined;
            if ((!args || args.nfsShowAll === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nfsShowAll'");
            }
            resourceInputs["exclusions"] = args ? args.exclusions : undefined;
            resourceInputs["nfsShowAll"] = args ? args.nfsShowAll : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DiskOptions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DiskOptions resources.
 */
export interface DiskOptionsState {
    /**
     * OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
     * disks from the monitoring list.
     */
    exclusions?: pulumi.Input<inputs.DiskOptionsExclusions>;
    /**
     * When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
     * Requires OneAgent 1.209 or later
     */
    nfsShowAll?: pulumi.Input<boolean>;
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     */
    scope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DiskOptions resource.
 */
export interface DiskOptionsArgs {
    /**
     * OneAgent automatically detects and monitors all your mount points, however you can create exception rules to remove
     * disks from the monitoring list.
     */
    exclusions?: pulumi.Input<inputs.DiskOptionsExclusions>;
    /**
     * When disabled OneAgent will try to deduplicate some of nfs disks. Disabled by default, applies only to Linux hosts.
     * Requires OneAgent 1.209 or later
     */
    nfsShowAll: pulumi.Input<boolean>;
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     */
    scope?: pulumi.Input<string>;
}