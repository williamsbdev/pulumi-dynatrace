// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type JiraNotification struct {
	pulumi.CustomResourceState

	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolOutput `pulumi:"active"`
	// The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
	ApiToken pulumi.StringPtrOutput `pulumi:"apiToken"`
	// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
	Description pulumi.StringOutput `pulumi:"description"`
	// The type of the Jira issue to be created by this notification
	IssueType pulumi.StringOutput `pulumi:"issueType"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringOutput `pulumi:"legacyId"`
	// The name of the notification configuration
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile pulumi.StringOutput `pulumi:"profile"`
	// The project key of the Jira issue to be created by this notification
	ProjectKey pulumi.StringOutput `pulumi:"projectKey"`
	// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Summary pulumi.StringOutput `pulumi:"summary"`
	// The URL of the Jira API endpoint
	Url pulumi.StringOutput `pulumi:"url"`
	// The username of the Jira profile
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewJiraNotification registers a new resource with the given unique name, arguments, and options.
func NewJiraNotification(ctx *pulumi.Context,
	name string, args *JiraNotificationArgs, opts ...pulumi.ResourceOption) (*JiraNotification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Active == nil {
		return nil, errors.New("invalid value for required argument 'Active'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.IssueType == nil {
		return nil, errors.New("invalid value for required argument 'IssueType'")
	}
	if args.Profile == nil {
		return nil, errors.New("invalid value for required argument 'Profile'")
	}
	if args.ProjectKey == nil {
		return nil, errors.New("invalid value for required argument 'ProjectKey'")
	}
	if args.Summary == nil {
		return nil, errors.New("invalid value for required argument 'Summary'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.ApiToken != nil {
		args.ApiToken = pulumi.ToSecret(args.ApiToken).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiToken",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource JiraNotification
	err := ctx.RegisterResource("dynatrace:index/jiraNotification:JiraNotification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJiraNotification gets an existing JiraNotification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJiraNotification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JiraNotificationState, opts ...pulumi.ResourceOption) (*JiraNotification, error) {
	var resource JiraNotification
	err := ctx.ReadResource("dynatrace:index/jiraNotification:JiraNotification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JiraNotification resources.
type jiraNotificationState struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active *bool `pulumi:"active"`
	// The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
	ApiToken *string `pulumi:"apiToken"`
	// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
	Description *string `pulumi:"description"`
	// The type of the Jira issue to be created by this notification
	IssueType *string `pulumi:"issueType"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile *string `pulumi:"profile"`
	// The project key of the Jira issue to be created by this notification
	ProjectKey *string `pulumi:"projectKey"`
	// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Summary *string `pulumi:"summary"`
	// The URL of the Jira API endpoint
	Url *string `pulumi:"url"`
	// The username of the Jira profile
	Username *string `pulumi:"username"`
}

type JiraNotificationState struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolPtrInput
	// The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
	ApiToken pulumi.StringPtrInput
	// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
	Description pulumi.StringPtrInput
	// The type of the Jira issue to be created by this notification
	IssueType pulumi.StringPtrInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringPtrInput
	// The project key of the Jira issue to be created by this notification
	ProjectKey pulumi.StringPtrInput
	// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Summary pulumi.StringPtrInput
	// The URL of the Jira API endpoint
	Url pulumi.StringPtrInput
	// The username of the Jira profile
	Username pulumi.StringPtrInput
}

func (JiraNotificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*jiraNotificationState)(nil)).Elem()
}

type jiraNotificationArgs struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active bool `pulumi:"active"`
	// The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
	ApiToken *string `pulumi:"apiToken"`
	// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
	Description string `pulumi:"description"`
	// The type of the Jira issue to be created by this notification
	IssueType string `pulumi:"issueType"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile string `pulumi:"profile"`
	// The project key of the Jira issue to be created by this notification
	ProjectKey string `pulumi:"projectKey"`
	// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Summary string `pulumi:"summary"`
	// The URL of the Jira API endpoint
	Url string `pulumi:"url"`
	// The username of the Jira profile
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a JiraNotification resource.
type JiraNotificationArgs struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolInput
	// The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
	ApiToken pulumi.StringPtrInput
	// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
	Description pulumi.StringInput
	// The type of the Jira issue to be created by this notification
	IssueType pulumi.StringInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringInput
	// The project key of the Jira issue to be created by this notification
	ProjectKey pulumi.StringInput
	// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Summary pulumi.StringInput
	// The URL of the Jira API endpoint
	Url pulumi.StringInput
	// The username of the Jira profile
	Username pulumi.StringInput
}

func (JiraNotificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jiraNotificationArgs)(nil)).Elem()
}

type JiraNotificationInput interface {
	pulumi.Input

	ToJiraNotificationOutput() JiraNotificationOutput
	ToJiraNotificationOutputWithContext(ctx context.Context) JiraNotificationOutput
}

func (*JiraNotification) ElementType() reflect.Type {
	return reflect.TypeOf((**JiraNotification)(nil)).Elem()
}

func (i *JiraNotification) ToJiraNotificationOutput() JiraNotificationOutput {
	return i.ToJiraNotificationOutputWithContext(context.Background())
}

func (i *JiraNotification) ToJiraNotificationOutputWithContext(ctx context.Context) JiraNotificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JiraNotificationOutput)
}

// JiraNotificationArrayInput is an input type that accepts JiraNotificationArray and JiraNotificationArrayOutput values.
// You can construct a concrete instance of `JiraNotificationArrayInput` via:
//
//	JiraNotificationArray{ JiraNotificationArgs{...} }
type JiraNotificationArrayInput interface {
	pulumi.Input

	ToJiraNotificationArrayOutput() JiraNotificationArrayOutput
	ToJiraNotificationArrayOutputWithContext(context.Context) JiraNotificationArrayOutput
}

type JiraNotificationArray []JiraNotificationInput

func (JiraNotificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JiraNotification)(nil)).Elem()
}

func (i JiraNotificationArray) ToJiraNotificationArrayOutput() JiraNotificationArrayOutput {
	return i.ToJiraNotificationArrayOutputWithContext(context.Background())
}

func (i JiraNotificationArray) ToJiraNotificationArrayOutputWithContext(ctx context.Context) JiraNotificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JiraNotificationArrayOutput)
}

// JiraNotificationMapInput is an input type that accepts JiraNotificationMap and JiraNotificationMapOutput values.
// You can construct a concrete instance of `JiraNotificationMapInput` via:
//
//	JiraNotificationMap{ "key": JiraNotificationArgs{...} }
type JiraNotificationMapInput interface {
	pulumi.Input

	ToJiraNotificationMapOutput() JiraNotificationMapOutput
	ToJiraNotificationMapOutputWithContext(context.Context) JiraNotificationMapOutput
}

type JiraNotificationMap map[string]JiraNotificationInput

func (JiraNotificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JiraNotification)(nil)).Elem()
}

func (i JiraNotificationMap) ToJiraNotificationMapOutput() JiraNotificationMapOutput {
	return i.ToJiraNotificationMapOutputWithContext(context.Background())
}

func (i JiraNotificationMap) ToJiraNotificationMapOutputWithContext(ctx context.Context) JiraNotificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JiraNotificationMapOutput)
}

type JiraNotificationOutput struct{ *pulumi.OutputState }

func (JiraNotificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JiraNotification)(nil)).Elem()
}

func (o JiraNotificationOutput) ToJiraNotificationOutput() JiraNotificationOutput {
	return o
}

func (o JiraNotificationOutput) ToJiraNotificationOutputWithContext(ctx context.Context) JiraNotificationOutput {
	return o
}

// The configuration is enabled (`true`) or disabled (`false`)
func (o JiraNotificationOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// The API token for the Jira profile. Using password authentication [was deprecated by Jira](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-basic-auth-and-cookie-based-auth/)
func (o JiraNotificationOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
func (o JiraNotificationOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The type of the Jira issue to be created by this notification
func (o JiraNotificationOutput) IssueType() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.IssueType }).(pulumi.StringOutput)
}

// The ID of these settings when referred to from resources requiring the REST API V1 keys
func (o JiraNotificationOutput) LegacyId() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.LegacyId }).(pulumi.StringOutput)
}

// The name of the notification configuration
func (o JiraNotificationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the associated alerting profile
func (o JiraNotificationOutput) Profile() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.Profile }).(pulumi.StringOutput)
}

// The project key of the Jira issue to be created by this notification
func (o JiraNotificationOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.ProjectKey }).(pulumi.StringOutput)
}

// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
func (o JiraNotificationOutput) Summary() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.Summary }).(pulumi.StringOutput)
}

// The URL of the Jira API endpoint
func (o JiraNotificationOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// The username of the Jira profile
func (o JiraNotificationOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraNotification) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type JiraNotificationArrayOutput struct{ *pulumi.OutputState }

func (JiraNotificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JiraNotification)(nil)).Elem()
}

func (o JiraNotificationArrayOutput) ToJiraNotificationArrayOutput() JiraNotificationArrayOutput {
	return o
}

func (o JiraNotificationArrayOutput) ToJiraNotificationArrayOutputWithContext(ctx context.Context) JiraNotificationArrayOutput {
	return o
}

func (o JiraNotificationArrayOutput) Index(i pulumi.IntInput) JiraNotificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JiraNotification {
		return vs[0].([]*JiraNotification)[vs[1].(int)]
	}).(JiraNotificationOutput)
}

type JiraNotificationMapOutput struct{ *pulumi.OutputState }

func (JiraNotificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JiraNotification)(nil)).Elem()
}

func (o JiraNotificationMapOutput) ToJiraNotificationMapOutput() JiraNotificationMapOutput {
	return o
}

func (o JiraNotificationMapOutput) ToJiraNotificationMapOutputWithContext(ctx context.Context) JiraNotificationMapOutput {
	return o
}

func (o JiraNotificationMapOutput) MapIndex(k pulumi.StringInput) JiraNotificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JiraNotification {
		return vs[0].(map[string]*JiraNotification)[vs[1].(string)]
	}).(JiraNotificationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JiraNotificationInput)(nil)).Elem(), &JiraNotification{})
	pulumi.RegisterInputType(reflect.TypeOf((*JiraNotificationArrayInput)(nil)).Elem(), JiraNotificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JiraNotificationMapInput)(nil)).Elem(), JiraNotificationMap{})
	pulumi.RegisterOutputType(JiraNotificationOutput{})
	pulumi.RegisterOutputType(JiraNotificationArrayOutput{})
	pulumi.RegisterOutputType(JiraNotificationMapOutput{})
}
