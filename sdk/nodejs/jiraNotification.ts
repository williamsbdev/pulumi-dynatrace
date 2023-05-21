// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class JiraNotification extends pulumi.CustomResource {
    /**
     * Get an existing JiraNotification resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JiraNotificationState, opts?: pulumi.CustomResourceOptions): JiraNotification {
        return new JiraNotification(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/jiraNotification:JiraNotification';

    /**
     * Returns true if the given object is an instance of JiraNotification.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is JiraNotification {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === JiraNotification.__pulumiType;
    }

    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     */
    public readonly active!: pulumi.Output<boolean>;
    /**
     * The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
     */
    public readonly apiToken!: pulumi.Output<string | undefined>;
    /**
     * The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The type of the Jira issue to be created by this notification
     */
    public readonly issueType!: pulumi.Output<string>;
    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     */
    public readonly legacyId!: pulumi.Output<string>;
    /**
     * The name of the notification configuration
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the associated alerting profile
     */
    public readonly profile!: pulumi.Output<string>;
    /**
     * The project key of the Jira issue to be created by this notification
     */
    public readonly projectKey!: pulumi.Output<string>;
    /**
     * The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     */
    public readonly summary!: pulumi.Output<string>;
    /**
     * The URL of the Jira API endpoint
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * The username of the Jira profile
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a JiraNotification resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JiraNotificationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JiraNotificationArgs | JiraNotificationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JiraNotificationState | undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["apiToken"] = state ? state.apiToken : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["issueType"] = state ? state.issueType : undefined;
            resourceInputs["legacyId"] = state ? state.legacyId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["profile"] = state ? state.profile : undefined;
            resourceInputs["projectKey"] = state ? state.projectKey : undefined;
            resourceInputs["summary"] = state ? state.summary : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as JiraNotificationArgs | undefined;
            if ((!args || args.active === undefined) && !opts.urn) {
                throw new Error("Missing required property 'active'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.issueType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'issueType'");
            }
            if ((!args || args.profile === undefined) && !opts.urn) {
                throw new Error("Missing required property 'profile'");
            }
            if ((!args || args.projectKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectKey'");
            }
            if ((!args || args.summary === undefined) && !opts.urn) {
                throw new Error("Missing required property 'summary'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["active"] = args ? args.active : undefined;
            resourceInputs["apiToken"] = args?.apiToken ? pulumi.secret(args.apiToken) : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["issueType"] = args ? args.issueType : undefined;
            resourceInputs["legacyId"] = args ? args.legacyId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["profile"] = args ? args.profile : undefined;
            resourceInputs["projectKey"] = args ? args.projectKey : undefined;
            resourceInputs["summary"] = args ? args.summary : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(JiraNotification.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering JiraNotification resources.
 */
export interface JiraNotificationState {
    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     */
    active?: pulumi.Input<boolean>;
    /**
     * The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
     */
    apiToken?: pulumi.Input<string>;
    /**
     * The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
     */
    description?: pulumi.Input<string>;
    /**
     * The type of the Jira issue to be created by this notification
     */
    issueType?: pulumi.Input<string>;
    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     */
    legacyId?: pulumi.Input<string>;
    /**
     * The name of the notification configuration
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the associated alerting profile
     */
    profile?: pulumi.Input<string>;
    /**
     * The project key of the Jira issue to be created by this notification
     */
    projectKey?: pulumi.Input<string>;
    /**
     * The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     */
    summary?: pulumi.Input<string>;
    /**
     * The URL of the Jira API endpoint
     */
    url?: pulumi.Input<string>;
    /**
     * The username of the Jira profile
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a JiraNotification resource.
 */
export interface JiraNotificationArgs {
    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     */
    active: pulumi.Input<boolean>;
    /**
     * The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
     */
    apiToken?: pulumi.Input<string>;
    /**
     * The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
     */
    description: pulumi.Input<string>;
    /**
     * The type of the Jira issue to be created by this notification
     */
    issueType: pulumi.Input<string>;
    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     */
    legacyId?: pulumi.Input<string>;
    /**
     * The name of the notification configuration
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the associated alerting profile
     */
    profile: pulumi.Input<string>;
    /**
     * The project key of the Jira issue to be created by this notification
     */
    projectKey: pulumi.Input<string>;
    /**
     * The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     */
    summary: pulumi.Input<string>;
    /**
     * The URL of the Jira API endpoint
     */
    url: pulumi.Input<string>;
    /**
     * The username of the Jira profile
     */
    username: pulumi.Input<string>;
}
