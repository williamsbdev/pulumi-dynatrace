// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class WebAppResourceCleanup extends pulumi.CustomResource {
    /**
     * Get an existing WebAppResourceCleanup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebAppResourceCleanupState, opts?: pulumi.CustomResourceOptions): WebAppResourceCleanup {
        return new WebAppResourceCleanup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/webAppResourceCleanup:WebAppResourceCleanup';

    /**
     * Returns true if the given object is an instance of WebAppResourceCleanup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WebAppResourceCleanup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WebAppResourceCleanup.__pulumiType;
    }

    /**
     * For example: *Mask journeyId*
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * For example: `(.*)(journeyId=)-?\d+(.*)`
     */
    public readonly regularExpression!: pulumi.Output<string>;
    /**
     * For example: `$1$2\*$3`
     */
    public readonly replaceWith!: pulumi.Output<string>;

    /**
     * Create a WebAppResourceCleanup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebAppResourceCleanupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebAppResourceCleanupArgs | WebAppResourceCleanupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebAppResourceCleanupState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["regularExpression"] = state ? state.regularExpression : undefined;
            resourceInputs["replaceWith"] = state ? state.replaceWith : undefined;
        } else {
            const args = argsOrState as WebAppResourceCleanupArgs | undefined;
            if ((!args || args.regularExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regularExpression'");
            }
            if ((!args || args.replaceWith === undefined) && !opts.urn) {
                throw new Error("Missing required property 'replaceWith'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["regularExpression"] = args ? args.regularExpression : undefined;
            resourceInputs["replaceWith"] = args ? args.replaceWith : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WebAppResourceCleanup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WebAppResourceCleanup resources.
 */
export interface WebAppResourceCleanupState {
    /**
     * For example: *Mask journeyId*
     */
    name?: pulumi.Input<string>;
    /**
     * For example: `(.*)(journeyId=)-?\d+(.*)`
     */
    regularExpression?: pulumi.Input<string>;
    /**
     * For example: `$1$2\*$3`
     */
    replaceWith?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WebAppResourceCleanup resource.
 */
export interface WebAppResourceCleanupArgs {
    /**
     * For example: *Mask journeyId*
     */
    name?: pulumi.Input<string>;
    /**
     * For example: `(.*)(journeyId=)-?\d+(.*)`
     */
    regularExpression: pulumi.Input<string>;
    /**
     * For example: `$1$2\*$3`
     */
    replaceWith: pulumi.Input<string>;
}
