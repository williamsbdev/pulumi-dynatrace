// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type WebhookNotification struct {
	pulumi.CustomResourceState

	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolOutput `pulumi:"active"`
	// A list of the additional HTTP headers
	Headers WebhookNotificationHeadersPtrOutput `pulumi:"headers"`
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
	Insecure pulumi.BoolPtrOutput `pulumi:"insecure"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringOutput `pulumi:"legacyId"`
	// The name of the notification configuration
	Name pulumi.StringOutput `pulumi:"name"`
	// Send email if problem is closed
	NotifyClosedProblems pulumi.BoolPtrOutput `pulumi:"notifyClosedProblems"`
	// Call webhook if new events merge into existing problems
	NotifyEventMerges pulumi.BoolPtrOutput `pulumi:"notifyEventMerges"`
	// The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Payload pulumi.StringOutput `pulumi:"payload"`
	// The ID of the associated alerting profile
	Profile pulumi.StringOutput `pulumi:"profile"`
	// The URL of the WebHook endpoint
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewWebhookNotification registers a new resource with the given unique name, arguments, and options.
func NewWebhookNotification(ctx *pulumi.Context,
	name string, args *WebhookNotificationArgs, opts ...pulumi.ResourceOption) (*WebhookNotification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Active == nil {
		return nil, errors.New("invalid value for required argument 'Active'")
	}
	if args.Payload == nil {
		return nil, errors.New("invalid value for required argument 'Payload'")
	}
	if args.Profile == nil {
		return nil, errors.New("invalid value for required argument 'Profile'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource WebhookNotification
	err := ctx.RegisterResource("dynatrace:index/webhookNotification:WebhookNotification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebhookNotification gets an existing WebhookNotification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebhookNotification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebhookNotificationState, opts ...pulumi.ResourceOption) (*WebhookNotification, error) {
	var resource WebhookNotification
	err := ctx.ReadResource("dynatrace:index/webhookNotification:WebhookNotification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebhookNotification resources.
type webhookNotificationState struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active *bool `pulumi:"active"`
	// A list of the additional HTTP headers
	Headers *WebhookNotificationHeaders `pulumi:"headers"`
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
	Insecure *bool `pulumi:"insecure"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// Send email if problem is closed
	NotifyClosedProblems *bool `pulumi:"notifyClosedProblems"`
	// Call webhook if new events merge into existing problems
	NotifyEventMerges *bool `pulumi:"notifyEventMerges"`
	// The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Payload *string `pulumi:"payload"`
	// The ID of the associated alerting profile
	Profile *string `pulumi:"profile"`
	// The URL of the WebHook endpoint
	Url *string `pulumi:"url"`
}

type WebhookNotificationState struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolPtrInput
	// A list of the additional HTTP headers
	Headers WebhookNotificationHeadersPtrInput
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
	Insecure pulumi.BoolPtrInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// Send email if problem is closed
	NotifyClosedProblems pulumi.BoolPtrInput
	// Call webhook if new events merge into existing problems
	NotifyEventMerges pulumi.BoolPtrInput
	// The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Payload pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringPtrInput
	// The URL of the WebHook endpoint
	Url pulumi.StringPtrInput
}

func (WebhookNotificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookNotificationState)(nil)).Elem()
}

type webhookNotificationArgs struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active bool `pulumi:"active"`
	// A list of the additional HTTP headers
	Headers *WebhookNotificationHeaders `pulumi:"headers"`
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
	Insecure *bool `pulumi:"insecure"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// Send email if problem is closed
	NotifyClosedProblems *bool `pulumi:"notifyClosedProblems"`
	// Call webhook if new events merge into existing problems
	NotifyEventMerges *bool `pulumi:"notifyEventMerges"`
	// The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Payload string `pulumi:"payload"`
	// The ID of the associated alerting profile
	Profile string `pulumi:"profile"`
	// The URL of the WebHook endpoint
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a WebhookNotification resource.
type WebhookNotificationArgs struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolInput
	// A list of the additional HTTP headers
	Headers WebhookNotificationHeadersPtrInput
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
	Insecure pulumi.BoolPtrInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// Send email if problem is closed
	NotifyClosedProblems pulumi.BoolPtrInput
	// Call webhook if new events merge into existing problems
	NotifyEventMerges pulumi.BoolPtrInput
	// The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	Payload pulumi.StringInput
	// The ID of the associated alerting profile
	Profile pulumi.StringInput
	// The URL of the WebHook endpoint
	Url pulumi.StringInput
}

func (WebhookNotificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookNotificationArgs)(nil)).Elem()
}

type WebhookNotificationInput interface {
	pulumi.Input

	ToWebhookNotificationOutput() WebhookNotificationOutput
	ToWebhookNotificationOutputWithContext(ctx context.Context) WebhookNotificationOutput
}

func (*WebhookNotification) ElementType() reflect.Type {
	return reflect.TypeOf((**WebhookNotification)(nil)).Elem()
}

func (i *WebhookNotification) ToWebhookNotificationOutput() WebhookNotificationOutput {
	return i.ToWebhookNotificationOutputWithContext(context.Background())
}

func (i *WebhookNotification) ToWebhookNotificationOutputWithContext(ctx context.Context) WebhookNotificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookNotificationOutput)
}

// WebhookNotificationArrayInput is an input type that accepts WebhookNotificationArray and WebhookNotificationArrayOutput values.
// You can construct a concrete instance of `WebhookNotificationArrayInput` via:
//
//	WebhookNotificationArray{ WebhookNotificationArgs{...} }
type WebhookNotificationArrayInput interface {
	pulumi.Input

	ToWebhookNotificationArrayOutput() WebhookNotificationArrayOutput
	ToWebhookNotificationArrayOutputWithContext(context.Context) WebhookNotificationArrayOutput
}

type WebhookNotificationArray []WebhookNotificationInput

func (WebhookNotificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebhookNotification)(nil)).Elem()
}

func (i WebhookNotificationArray) ToWebhookNotificationArrayOutput() WebhookNotificationArrayOutput {
	return i.ToWebhookNotificationArrayOutputWithContext(context.Background())
}

func (i WebhookNotificationArray) ToWebhookNotificationArrayOutputWithContext(ctx context.Context) WebhookNotificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookNotificationArrayOutput)
}

// WebhookNotificationMapInput is an input type that accepts WebhookNotificationMap and WebhookNotificationMapOutput values.
// You can construct a concrete instance of `WebhookNotificationMapInput` via:
//
//	WebhookNotificationMap{ "key": WebhookNotificationArgs{...} }
type WebhookNotificationMapInput interface {
	pulumi.Input

	ToWebhookNotificationMapOutput() WebhookNotificationMapOutput
	ToWebhookNotificationMapOutputWithContext(context.Context) WebhookNotificationMapOutput
}

type WebhookNotificationMap map[string]WebhookNotificationInput

func (WebhookNotificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebhookNotification)(nil)).Elem()
}

func (i WebhookNotificationMap) ToWebhookNotificationMapOutput() WebhookNotificationMapOutput {
	return i.ToWebhookNotificationMapOutputWithContext(context.Background())
}

func (i WebhookNotificationMap) ToWebhookNotificationMapOutputWithContext(ctx context.Context) WebhookNotificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookNotificationMapOutput)
}

type WebhookNotificationOutput struct{ *pulumi.OutputState }

func (WebhookNotificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebhookNotification)(nil)).Elem()
}

func (o WebhookNotificationOutput) ToWebhookNotificationOutput() WebhookNotificationOutput {
	return o
}

func (o WebhookNotificationOutput) ToWebhookNotificationOutputWithContext(ctx context.Context) WebhookNotificationOutput {
	return o
}

// The configuration is enabled (`true`) or disabled (`false`)
func (o WebhookNotificationOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// A list of the additional HTTP headers
func (o WebhookNotificationOutput) Headers() WebhookNotificationHeadersPtrOutput {
	return o.ApplyT(func(v *WebhookNotification) WebhookNotificationHeadersPtrOutput { return v.Headers }).(WebhookNotificationHeadersPtrOutput)
}

// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
func (o WebhookNotificationOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.BoolPtrOutput { return v.Insecure }).(pulumi.BoolPtrOutput)
}

// The ID of these settings when referred to from resources requiring the REST API V1 keys
func (o WebhookNotificationOutput) LegacyId() pulumi.StringOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.StringOutput { return v.LegacyId }).(pulumi.StringOutput)
}

// The name of the notification configuration
func (o WebhookNotificationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Send email if problem is closed
func (o WebhookNotificationOutput) NotifyClosedProblems() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.BoolPtrOutput { return v.NotifyClosedProblems }).(pulumi.BoolPtrOutput)
}

// Call webhook if new events merge into existing problems
func (o WebhookNotificationOutput) NotifyEventMerges() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.BoolPtrOutput { return v.NotifyEventMerges }).(pulumi.BoolPtrOutput)
}

// The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
func (o WebhookNotificationOutput) Payload() pulumi.StringOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.StringOutput { return v.Payload }).(pulumi.StringOutput)
}

// The ID of the associated alerting profile
func (o WebhookNotificationOutput) Profile() pulumi.StringOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.StringOutput { return v.Profile }).(pulumi.StringOutput)
}

// The URL of the WebHook endpoint
func (o WebhookNotificationOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *WebhookNotification) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type WebhookNotificationArrayOutput struct{ *pulumi.OutputState }

func (WebhookNotificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebhookNotification)(nil)).Elem()
}

func (o WebhookNotificationArrayOutput) ToWebhookNotificationArrayOutput() WebhookNotificationArrayOutput {
	return o
}

func (o WebhookNotificationArrayOutput) ToWebhookNotificationArrayOutputWithContext(ctx context.Context) WebhookNotificationArrayOutput {
	return o
}

func (o WebhookNotificationArrayOutput) Index(i pulumi.IntInput) WebhookNotificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebhookNotification {
		return vs[0].([]*WebhookNotification)[vs[1].(int)]
	}).(WebhookNotificationOutput)
}

type WebhookNotificationMapOutput struct{ *pulumi.OutputState }

func (WebhookNotificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebhookNotification)(nil)).Elem()
}

func (o WebhookNotificationMapOutput) ToWebhookNotificationMapOutput() WebhookNotificationMapOutput {
	return o
}

func (o WebhookNotificationMapOutput) ToWebhookNotificationMapOutputWithContext(ctx context.Context) WebhookNotificationMapOutput {
	return o
}

func (o WebhookNotificationMapOutput) MapIndex(k pulumi.StringInput) WebhookNotificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebhookNotification {
		return vs[0].(map[string]*WebhookNotification)[vs[1].(string)]
	}).(WebhookNotificationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookNotificationInput)(nil)).Elem(), &WebhookNotification{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookNotificationArrayInput)(nil)).Elem(), WebhookNotificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookNotificationMapInput)(nil)).Elem(), WebhookNotificationMap{})
	pulumi.RegisterOutputType(WebhookNotificationOutput{})
	pulumi.RegisterOutputType(WebhookNotificationArrayOutput{})
	pulumi.RegisterOutputType(WebhookNotificationMapOutput{})
}
