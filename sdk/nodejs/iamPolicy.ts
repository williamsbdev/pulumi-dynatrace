// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class IamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing IamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IamPolicyState, opts?: pulumi.CustomResourceOptions): IamPolicy {
        return new IamPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/iamPolicy:IamPolicy';

    /**
     * Returns true if the given object is an instance of IamPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IamPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IamPolicy.__pulumiType;
    }

    /**
     * The UUID of the account (`urn:dtaccount:<account-uuid>`) in case the policy should be applied to all environments of this account. The prefix `urn:dtaccount:` MUST be omitted here.
     */
    public readonly account!: pulumi.Output<string | undefined>;
    /**
     * An optional description text for the policy
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the environment (https://\n\n.live.dynatrace.com) if the policy should be applied to a specific environment
     */
    public readonly environment!: pulumi.Output<string | undefined>;
    /**
     * The name of the policy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Statement Query of the policy
     */
    public readonly statementQuery!: pulumi.Output<string>;
    /**
     * Tags for this policy
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a IamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IamPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IamPolicyArgs | IamPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IamPolicyState | undefined;
            resourceInputs["account"] = state ? state.account : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["statementQuery"] = state ? state.statementQuery : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IamPolicyArgs | undefined;
            if ((!args || args.statementQuery === undefined) && !opts.urn) {
                throw new Error("Missing required property 'statementQuery'");
            }
            resourceInputs["account"] = args ? args.account : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["statementQuery"] = args ? args.statementQuery : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IamPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IamPolicy resources.
 */
export interface IamPolicyState {
    /**
     * The UUID of the account (`urn:dtaccount:<account-uuid>`) in case the policy should be applied to all environments of this account. The prefix `urn:dtaccount:` MUST be omitted here.
     */
    account?: pulumi.Input<string>;
    /**
     * An optional description text for the policy
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the environment (https://\n\n.live.dynatrace.com) if the policy should be applied to a specific environment
     */
    environment?: pulumi.Input<string>;
    /**
     * The name of the policy
     */
    name?: pulumi.Input<string>;
    /**
     * The Statement Query of the policy
     */
    statementQuery?: pulumi.Input<string>;
    /**
     * Tags for this policy
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a IamPolicy resource.
 */
export interface IamPolicyArgs {
    /**
     * The UUID of the account (`urn:dtaccount:<account-uuid>`) in case the policy should be applied to all environments of this account. The prefix `urn:dtaccount:` MUST be omitted here.
     */
    account?: pulumi.Input<string>;
    /**
     * An optional description text for the policy
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the environment (https://\n\n.live.dynatrace.com) if the policy should be applied to a specific environment
     */
    environment?: pulumi.Input<string>;
    /**
     * The name of the policy
     */
    name?: pulumi.Input<string>;
    /**
     * The Statement Query of the policy
     */
    statementQuery: pulumi.Input<string>;
    /**
     * Tags for this policy
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}