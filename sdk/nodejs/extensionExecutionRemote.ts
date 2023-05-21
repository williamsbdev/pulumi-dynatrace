// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class ExtensionExecutionRemote extends pulumi.CustomResource {
    /**
     * Get an existing ExtensionExecutionRemote resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExtensionExecutionRemoteState, opts?: pulumi.CustomResourceOptions): ExtensionExecutionRemote {
        return new ExtensionExecutionRemote(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/extensionExecutionRemote:ExtensionExecutionRemote';

    /**
     * Returns true if the given object is an instance of ExtensionExecutionRemote.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExtensionExecutionRemote {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExtensionExecutionRemote.__pulumiType;
    }

    /**
     * Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     */
    public readonly performanceProfile!: pulumi.Output<string>;
    /**
     * The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     */
    public readonly scope!: pulumi.Output<string>;

    /**
     * Create a ExtensionExecutionRemote resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExtensionExecutionRemoteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExtensionExecutionRemoteArgs | ExtensionExecutionRemoteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExtensionExecutionRemoteState | undefined;
            resourceInputs["performanceProfile"] = state ? state.performanceProfile : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
        } else {
            const args = argsOrState as ExtensionExecutionRemoteArgs | undefined;
            if ((!args || args.performanceProfile === undefined) && !opts.urn) {
                throw new Error("Missing required property 'performanceProfile'");
            }
            if ((!args || args.scope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scope'");
            }
            resourceInputs["performanceProfile"] = args ? args.performanceProfile : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ExtensionExecutionRemote.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExtensionExecutionRemote resources.
 */
export interface ExtensionExecutionRemoteState {
    /**
     * Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     */
    performanceProfile?: pulumi.Input<string>;
    /**
     * The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     */
    scope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExtensionExecutionRemote resource.
 */
export interface ExtensionExecutionRemoteArgs {
    /**
     * Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     */
    performanceProfile: pulumi.Input<string>;
    /**
     * The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     */
    scope: pulumi.Input<string>;
}
