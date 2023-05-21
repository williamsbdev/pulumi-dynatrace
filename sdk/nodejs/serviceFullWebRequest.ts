// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ServiceFullWebRequest extends pulumi.CustomResource {
    /**
     * Get an existing ServiceFullWebRequest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceFullWebRequestState, opts?: pulumi.CustomResourceOptions): ServiceFullWebRequest {
        return new ServiceFullWebRequest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/serviceFullWebRequest:ServiceFullWebRequest';

    /**
     * Returns true if the given object is an instance of ServiceFullWebRequest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceFullWebRequest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceFullWebRequest.__pulumiType;
    }

    /**
     * A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     */
    public readonly conditions!: pulumi.Output<outputs.ServiceFullWebRequestConditions | undefined>;
    /**
     * Description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     */
    public readonly idContributors!: pulumi.Output<outputs.ServiceFullWebRequestIdContributors>;
    /**
     * Define a management zone filter for this service detection rule.
     */
    public readonly managementZones!: pulumi.Output<string[] | undefined>;
    /**
     * Rule name
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ServiceFullWebRequest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceFullWebRequestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceFullWebRequestArgs | ServiceFullWebRequestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceFullWebRequestState | undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["idContributors"] = state ? state.idContributors : undefined;
            resourceInputs["managementZones"] = state ? state.managementZones : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ServiceFullWebRequestArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.idContributors === undefined) && !opts.urn) {
                throw new Error("Missing required property 'idContributors'");
            }
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["idContributors"] = args ? args.idContributors : undefined;
            resourceInputs["managementZones"] = args ? args.managementZones : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceFullWebRequest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceFullWebRequest resources.
 */
export interface ServiceFullWebRequestState {
    /**
     * A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     */
    conditions?: pulumi.Input<inputs.ServiceFullWebRequestConditions>;
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     */
    idContributors?: pulumi.Input<inputs.ServiceFullWebRequestIdContributors>;
    /**
     * Define a management zone filter for this service detection rule.
     */
    managementZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Rule name
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceFullWebRequest resource.
 */
export interface ServiceFullWebRequestArgs {
    /**
     * A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     */
    conditions?: pulumi.Input<inputs.ServiceFullWebRequestConditions>;
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     */
    idContributors: pulumi.Input<inputs.ServiceFullWebRequestIdContributors>;
    /**
     * Define a management zone filter for this service detection rule.
     */
    managementZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Rule name
     */
    name?: pulumi.Input<string>;
}