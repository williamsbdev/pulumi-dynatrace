// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class WebAppEnablement extends pulumi.CustomResource {
    /**
     * Get an existing WebAppEnablement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebAppEnablementState, opts?: pulumi.CustomResourceOptions): WebAppEnablement {
        return new WebAppEnablement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/webAppEnablement:WebAppEnablement';

    /**
     * Returns true if the given object is an instance of WebAppEnablement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WebAppEnablement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WebAppEnablement.__pulumiType;
    }

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    public readonly applicationId!: pulumi.Output<string | undefined>;
    /**
     * Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
     */
    public readonly rum!: pulumi.Output<outputs.WebAppEnablementRum>;
    /**
     * [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     */
    public readonly sessionReplay!: pulumi.Output<outputs.WebAppEnablementSessionReplay>;

    /**
     * Create a WebAppEnablement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebAppEnablementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebAppEnablementArgs | WebAppEnablementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebAppEnablementState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["rum"] = state ? state.rum : undefined;
            resourceInputs["sessionReplay"] = state ? state.sessionReplay : undefined;
        } else {
            const args = argsOrState as WebAppEnablementArgs | undefined;
            if ((!args || args.rum === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rum'");
            }
            if ((!args || args.sessionReplay === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sessionReplay'");
            }
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["rum"] = args ? args.rum : undefined;
            resourceInputs["sessionReplay"] = args ? args.sessionReplay : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WebAppEnablement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WebAppEnablement resources.
 */
export interface WebAppEnablementState {
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
     */
    rum?: pulumi.Input<inputs.WebAppEnablementRum>;
    /**
     * [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     */
    sessionReplay?: pulumi.Input<inputs.WebAppEnablementSessionReplay>;
}

/**
 * The set of arguments for constructing a WebAppEnablement resource.
 */
export interface WebAppEnablementArgs {
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
     */
    rum: pulumi.Input<inputs.WebAppEnablementRum>;
    /**
     * [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     */
    sessionReplay: pulumi.Input<inputs.WebAppEnablementSessionReplay>;
}
