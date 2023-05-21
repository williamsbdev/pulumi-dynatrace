// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class AutotagV2 extends pulumi.CustomResource {
    /**
     * Get an existing AutotagV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AutotagV2State, opts?: pulumi.CustomResourceOptions): AutotagV2 {
        return new AutotagV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/autotagV2:AutotagV2';

    /**
     * Returns true if the given object is an instance of AutotagV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AutotagV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AutotagV2.__pulumiType;
    }

    /**
     * Description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Tag name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Rules
     */
    public readonly rules!: pulumi.Output<outputs.AutotagV2Rules | undefined>;

    /**
     * Create a AutotagV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AutotagV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AutotagV2Args | AutotagV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AutotagV2State | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as AutotagV2Args | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AutotagV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AutotagV2 resources.
 */
export interface AutotagV2State {
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * Tag name
     */
    name?: pulumi.Input<string>;
    /**
     * Rules
     */
    rules?: pulumi.Input<inputs.AutotagV2Rules>;
}

/**
 * The set of arguments for constructing a AutotagV2 resource.
 */
export interface AutotagV2Args {
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * Tag name
     */
    name?: pulumi.Input<string>;
    /**
     * Rules
     */
    rules?: pulumi.Input<inputs.AutotagV2Rules>;
}