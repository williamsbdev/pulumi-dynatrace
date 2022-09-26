// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This is a minimal example for creating a Mobile Application.
 * If the property `applicationId` is not specified during creating it will get generated by Dynatrace. In that case you'll have to ammend your initial `.tf` file with the generated `applicationId`.
 * Session- and UserAction-Properties are expected to be sorted by their `key`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dynatrace from "@pulumi/dynatrace";
 *
 * const sIXTHASDFGHIJK = new dynatrace.MobileApplication("SIXTH_ASDFGHIJK", {
 *     apdex: {
 *         frustrated: 12000,
 *         frustratedOnError: true,
 *         tolerable: 3000,
 *     },
 *     // application_id          = "6aa7a5a0-0bdd-41fa-b888-7293f1871d5c"
 *     beaconEndpointType: "INSTRUMENTED_WEB_SERVER",
 *     beaconEndpointUrl: "http://some.server.com/dtmb",
 *     properties: {
 *         apiValues: [
 *             {
 *                 aggregation: "LAST",
 *                 displayName: "valueA",
 *                 key: "apivaluea",
 *                 name: "valueA",
 *                 storeAsSessionProperty: true,
 *                 storeAsUserActionProperty: true,
 *                 type: "STRING",
 *             },
 *             {
 *                 aggregation: "LAST",
 *                 displayName: "valueA",
 *                 key: "apivalueb",
 *                 name: "valueB",
 *                 storeAsUserActionProperty: true,
 *                 type: "STRING",
 *             },
 *             {
 *                 aggregation: "LAST",
 *                 displayName: "valueC",
 *                 key: "apivaluec",
 *                 name: "valueC",
 *                 storeAsUserActionProperty: true,
 *                 type: "STRING",
 *             },
 *         ],
 *         requestAttributes: [
 *             {
 *                 aggregation: "FIRST",
 *                 displayName: "string",
 *                 id: "7950a7ad-c735-4efc-b896-159a3f645516",
 *                 key: "str2",
 *                 storeAsSessionProperty: true,
 *                 type: "STRING",
 *             },
 *             {
 *                 aggregation: "FIRST",
 *                 displayName: "string",
 *                 id: "7950a7ad-c735-4efc-b896-159a3f645516",
 *                 key: "string",
 *                 storeAsSessionProperty: true,
 *                 storeAsUserActionProperty: true,
 *                 type: "STRING",
 *             },
 *         ],
 *     },
 *     userSessionPercentage: 100,
 * });
 * ```
 */
export class MobileApplication extends pulumi.CustomResource {
    /**
     * Get an existing MobileApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MobileApplicationState, opts?: pulumi.CustomResourceOptions): MobileApplication {
        return new MobileApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/mobileApplication:MobileApplication';

    /**
     * Returns true if the given object is an instance of MobileApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MobileApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MobileApplication.__pulumiType;
    }

    /**
     * Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
     */
    public readonly apdex!: pulumi.Output<outputs.MobileApplicationApdex>;
    /**
     * The UUID of the application.
     */
    public readonly applicationId!: pulumi.Output<string | undefined>;
    /**
     * The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
     */
    public readonly beaconEndpointType!: pulumi.Output<string>;
    /**
     * The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
     * `INSTRUMENTED_WEB_SERVER`
     */
    public readonly beaconEndpointUrl!: pulumi.Output<string | undefined>;
    /**
     * User Action names to be flagged as Key User Actions
     */
    public readonly keyUserActions!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the application
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The opt-in mode is enabled (`true`) or disabled (`false`)
     */
    public readonly optInMode!: pulumi.Output<boolean | undefined>;
    /**
     * User Action and Session Properties
     */
    public readonly properties!: pulumi.Output<outputs.MobileApplicationProperties | undefined>;
    /**
     * The session replay is enabled (`true`) or disabled (`false`).
     */
    public readonly sessionReplay!: pulumi.Output<boolean | undefined>;
    /**
     * The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
     * and **optInModeEnabled** values set to `true`.
     */
    public readonly sessionReplayOnCrash!: pulumi.Output<boolean | undefined>;
    /**
     * The percentage of user sessions to be analyzed
     */
    public readonly userSessionPercentage!: pulumi.Output<number | undefined>;

    /**
     * Create a MobileApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MobileApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MobileApplicationArgs | MobileApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MobileApplicationState | undefined;
            resourceInputs["apdex"] = state ? state.apdex : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["beaconEndpointType"] = state ? state.beaconEndpointType : undefined;
            resourceInputs["beaconEndpointUrl"] = state ? state.beaconEndpointUrl : undefined;
            resourceInputs["keyUserActions"] = state ? state.keyUserActions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["optInMode"] = state ? state.optInMode : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["sessionReplay"] = state ? state.sessionReplay : undefined;
            resourceInputs["sessionReplayOnCrash"] = state ? state.sessionReplayOnCrash : undefined;
            resourceInputs["userSessionPercentage"] = state ? state.userSessionPercentage : undefined;
        } else {
            const args = argsOrState as MobileApplicationArgs | undefined;
            if ((!args || args.apdex === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apdex'");
            }
            if ((!args || args.beaconEndpointType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'beaconEndpointType'");
            }
            resourceInputs["apdex"] = args ? args.apdex : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["beaconEndpointType"] = args ? args.beaconEndpointType : undefined;
            resourceInputs["beaconEndpointUrl"] = args ? args.beaconEndpointUrl : undefined;
            resourceInputs["keyUserActions"] = args ? args.keyUserActions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["optInMode"] = args ? args.optInMode : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["sessionReplay"] = args ? args.sessionReplay : undefined;
            resourceInputs["sessionReplayOnCrash"] = args ? args.sessionReplayOnCrash : undefined;
            resourceInputs["userSessionPercentage"] = args ? args.userSessionPercentage : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MobileApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MobileApplication resources.
 */
export interface MobileApplicationState {
    /**
     * Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
     */
    apdex?: pulumi.Input<inputs.MobileApplicationApdex>;
    /**
     * The UUID of the application.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
     */
    beaconEndpointType?: pulumi.Input<string>;
    /**
     * The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
     * `INSTRUMENTED_WEB_SERVER`
     */
    beaconEndpointUrl?: pulumi.Input<string>;
    /**
     * User Action names to be flagged as Key User Actions
     */
    keyUserActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the application
     */
    name?: pulumi.Input<string>;
    /**
     * The opt-in mode is enabled (`true`) or disabled (`false`)
     */
    optInMode?: pulumi.Input<boolean>;
    /**
     * User Action and Session Properties
     */
    properties?: pulumi.Input<inputs.MobileApplicationProperties>;
    /**
     * The session replay is enabled (`true`) or disabled (`false`).
     */
    sessionReplay?: pulumi.Input<boolean>;
    /**
     * The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
     * and **optInModeEnabled** values set to `true`.
     */
    sessionReplayOnCrash?: pulumi.Input<boolean>;
    /**
     * The percentage of user sessions to be analyzed
     */
    userSessionPercentage?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MobileApplication resource.
 */
export interface MobileApplicationArgs {
    /**
     * Apdex configuration of a mobile application. A duration less than the **tolerable** threshold is considered satisfied
     */
    apdex: pulumi.Input<inputs.MobileApplicationApdex>;
    /**
     * The UUID of the application.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * The type of the beacon endpoint. Possible values are `CLUSTER_ACTIVE_GATE`, `ENVIRONMENT_ACTIVE_GATE` and `INSTRUMENTED_WEB_SERVER`.
     */
    beaconEndpointType: pulumi.Input<string>;
    /**
     * The URL of the beacon endpoint. Only applicable when the **beacon_endpoint_type** is set to `ENVIRONMENT_ACTIVE_GATE` or
     * `INSTRUMENTED_WEB_SERVER`
     */
    beaconEndpointUrl?: pulumi.Input<string>;
    /**
     * User Action names to be flagged as Key User Actions
     */
    keyUserActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the application
     */
    name?: pulumi.Input<string>;
    /**
     * The opt-in mode is enabled (`true`) or disabled (`false`)
     */
    optInMode?: pulumi.Input<boolean>;
    /**
     * User Action and Session Properties
     */
    properties?: pulumi.Input<inputs.MobileApplicationProperties>;
    /**
     * The session replay is enabled (`true`) or disabled (`false`).
     */
    sessionReplay?: pulumi.Input<boolean>;
    /**
     * The session replay on crash is enabled (`true`) or disabled (`false`). Enabling requires both **sessionReplayEnabled**
     * and **optInModeEnabled** values set to `true`.
     */
    sessionReplayOnCrash?: pulumi.Input<boolean>;
    /**
     * The percentage of user sessions to be analyzed
     */
    userSessionPercentage?: pulumi.Input<number>;
}
