// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AnsibleTowerNotification struct {
	pulumi.CustomResourceState

	// The notification is active (`true`) or inactive (`false`). Default is `false`.
	Active pulumi.BoolPtrOutput `pulumi:"active"`
	// The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	CustomMessage pulumi.StringOutput `pulumi:"customMessage"`
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
	Insecure pulumi.BoolPtrOutput `pulumi:"insecure"`
	// The URL of the target Ansible Tower job template
	JobTemplateUrl pulumi.StringOutput `pulumi:"jobTemplateUrl"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringOutput `pulumi:"legacyId"`
	// The display name within the Dynatrace WebUI.
	Name pulumi.StringOutput `pulumi:"name"`
	// The password for the Ansible Tower account
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The ID of the associated alerting profile.
	Profile pulumi.StringOutput `pulumi:"profile"`
	// The username of the Ansible Tower account
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewAnsibleTowerNotification registers a new resource with the given unique name, arguments, and options.
func NewAnsibleTowerNotification(ctx *pulumi.Context,
	name string, args *AnsibleTowerNotificationArgs, opts ...pulumi.ResourceOption) (*AnsibleTowerNotification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomMessage == nil {
		return nil, errors.New("invalid value for required argument 'CustomMessage'")
	}
	if args.JobTemplateUrl == nil {
		return nil, errors.New("invalid value for required argument 'JobTemplateUrl'")
	}
	if args.Profile == nil {
		return nil, errors.New("invalid value for required argument 'Profile'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource AnsibleTowerNotification
	err := ctx.RegisterResource("dynatrace:index/ansibleTowerNotification:AnsibleTowerNotification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAnsibleTowerNotification gets an existing AnsibleTowerNotification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAnsibleTowerNotification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AnsibleTowerNotificationState, opts ...pulumi.ResourceOption) (*AnsibleTowerNotification, error) {
	var resource AnsibleTowerNotification
	err := ctx.ReadResource("dynatrace:index/ansibleTowerNotification:AnsibleTowerNotification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AnsibleTowerNotification resources.
type ansibleTowerNotificationState struct {
	// The notification is active (`true`) or inactive (`false`). Default is `false`.
	Active *bool `pulumi:"active"`
	// The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	CustomMessage *string `pulumi:"customMessage"`
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
	Insecure *bool `pulumi:"insecure"`
	// The URL of the target Ansible Tower job template
	JobTemplateUrl *string `pulumi:"jobTemplateUrl"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The display name within the Dynatrace WebUI.
	Name *string `pulumi:"name"`
	// The password for the Ansible Tower account
	Password *string `pulumi:"password"`
	// The ID of the associated alerting profile.
	Profile *string `pulumi:"profile"`
	// The username of the Ansible Tower account
	Username *string `pulumi:"username"`
}

type AnsibleTowerNotificationState struct {
	// The notification is active (`true`) or inactive (`false`). Default is `false`.
	Active pulumi.BoolPtrInput
	// The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	CustomMessage pulumi.StringPtrInput
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
	Insecure pulumi.BoolPtrInput
	// The URL of the target Ansible Tower job template
	JobTemplateUrl pulumi.StringPtrInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The display name within the Dynatrace WebUI.
	Name pulumi.StringPtrInput
	// The password for the Ansible Tower account
	Password pulumi.StringPtrInput
	// The ID of the associated alerting profile.
	Profile pulumi.StringPtrInput
	// The username of the Ansible Tower account
	Username pulumi.StringPtrInput
}

func (AnsibleTowerNotificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*ansibleTowerNotificationState)(nil)).Elem()
}

type ansibleTowerNotificationArgs struct {
	// The notification is active (`true`) or inactive (`false`). Default is `false`.
	Active *bool `pulumi:"active"`
	// The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	CustomMessage string `pulumi:"customMessage"`
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
	Insecure *bool `pulumi:"insecure"`
	// The URL of the target Ansible Tower job template
	JobTemplateUrl string `pulumi:"jobTemplateUrl"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The display name within the Dynatrace WebUI.
	Name *string `pulumi:"name"`
	// The password for the Ansible Tower account
	Password *string `pulumi:"password"`
	// The ID of the associated alerting profile.
	Profile string `pulumi:"profile"`
	// The username of the Ansible Tower account
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a AnsibleTowerNotification resource.
type AnsibleTowerNotificationArgs struct {
	// The notification is active (`true`) or inactive (`false`). Default is `false`.
	Active pulumi.BoolPtrInput
	// The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
	CustomMessage pulumi.StringInput
	// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
	Insecure pulumi.BoolPtrInput
	// The URL of the target Ansible Tower job template
	JobTemplateUrl pulumi.StringInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The display name within the Dynatrace WebUI.
	Name pulumi.StringPtrInput
	// The password for the Ansible Tower account
	Password pulumi.StringPtrInput
	// The ID of the associated alerting profile.
	Profile pulumi.StringInput
	// The username of the Ansible Tower account
	Username pulumi.StringInput
}

func (AnsibleTowerNotificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ansibleTowerNotificationArgs)(nil)).Elem()
}

type AnsibleTowerNotificationInput interface {
	pulumi.Input

	ToAnsibleTowerNotificationOutput() AnsibleTowerNotificationOutput
	ToAnsibleTowerNotificationOutputWithContext(ctx context.Context) AnsibleTowerNotificationOutput
}

func (*AnsibleTowerNotification) ElementType() reflect.Type {
	return reflect.TypeOf((**AnsibleTowerNotification)(nil)).Elem()
}

func (i *AnsibleTowerNotification) ToAnsibleTowerNotificationOutput() AnsibleTowerNotificationOutput {
	return i.ToAnsibleTowerNotificationOutputWithContext(context.Background())
}

func (i *AnsibleTowerNotification) ToAnsibleTowerNotificationOutputWithContext(ctx context.Context) AnsibleTowerNotificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnsibleTowerNotificationOutput)
}

// AnsibleTowerNotificationArrayInput is an input type that accepts AnsibleTowerNotificationArray and AnsibleTowerNotificationArrayOutput values.
// You can construct a concrete instance of `AnsibleTowerNotificationArrayInput` via:
//
//	AnsibleTowerNotificationArray{ AnsibleTowerNotificationArgs{...} }
type AnsibleTowerNotificationArrayInput interface {
	pulumi.Input

	ToAnsibleTowerNotificationArrayOutput() AnsibleTowerNotificationArrayOutput
	ToAnsibleTowerNotificationArrayOutputWithContext(context.Context) AnsibleTowerNotificationArrayOutput
}

type AnsibleTowerNotificationArray []AnsibleTowerNotificationInput

func (AnsibleTowerNotificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AnsibleTowerNotification)(nil)).Elem()
}

func (i AnsibleTowerNotificationArray) ToAnsibleTowerNotificationArrayOutput() AnsibleTowerNotificationArrayOutput {
	return i.ToAnsibleTowerNotificationArrayOutputWithContext(context.Background())
}

func (i AnsibleTowerNotificationArray) ToAnsibleTowerNotificationArrayOutputWithContext(ctx context.Context) AnsibleTowerNotificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnsibleTowerNotificationArrayOutput)
}

// AnsibleTowerNotificationMapInput is an input type that accepts AnsibleTowerNotificationMap and AnsibleTowerNotificationMapOutput values.
// You can construct a concrete instance of `AnsibleTowerNotificationMapInput` via:
//
//	AnsibleTowerNotificationMap{ "key": AnsibleTowerNotificationArgs{...} }
type AnsibleTowerNotificationMapInput interface {
	pulumi.Input

	ToAnsibleTowerNotificationMapOutput() AnsibleTowerNotificationMapOutput
	ToAnsibleTowerNotificationMapOutputWithContext(context.Context) AnsibleTowerNotificationMapOutput
}

type AnsibleTowerNotificationMap map[string]AnsibleTowerNotificationInput

func (AnsibleTowerNotificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AnsibleTowerNotification)(nil)).Elem()
}

func (i AnsibleTowerNotificationMap) ToAnsibleTowerNotificationMapOutput() AnsibleTowerNotificationMapOutput {
	return i.ToAnsibleTowerNotificationMapOutputWithContext(context.Background())
}

func (i AnsibleTowerNotificationMap) ToAnsibleTowerNotificationMapOutputWithContext(ctx context.Context) AnsibleTowerNotificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnsibleTowerNotificationMapOutput)
}

type AnsibleTowerNotificationOutput struct{ *pulumi.OutputState }

func (AnsibleTowerNotificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AnsibleTowerNotification)(nil)).Elem()
}

func (o AnsibleTowerNotificationOutput) ToAnsibleTowerNotificationOutput() AnsibleTowerNotificationOutput {
	return o
}

func (o AnsibleTowerNotificationOutput) ToAnsibleTowerNotificationOutputWithContext(ctx context.Context) AnsibleTowerNotificationOutput {
	return o
}

// The notification is active (`true`) or inactive (`false`). Default is `false`.
func (o AnsibleTowerNotificationOutput) Active() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.BoolPtrOutput { return v.Active }).(pulumi.BoolPtrOutput)
}

// The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
func (o AnsibleTowerNotificationOutput) CustomMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringOutput { return v.CustomMessage }).(pulumi.StringOutput)
}

// Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
func (o AnsibleTowerNotificationOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.BoolPtrOutput { return v.Insecure }).(pulumi.BoolPtrOutput)
}

// The URL of the target Ansible Tower job template
func (o AnsibleTowerNotificationOutput) JobTemplateUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringOutput { return v.JobTemplateUrl }).(pulumi.StringOutput)
}

// The ID of these settings when referred to from resources requiring the REST API V1 keys
func (o AnsibleTowerNotificationOutput) LegacyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringOutput { return v.LegacyId }).(pulumi.StringOutput)
}

// The display name within the Dynatrace WebUI.
func (o AnsibleTowerNotificationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password for the Ansible Tower account
func (o AnsibleTowerNotificationOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The ID of the associated alerting profile.
func (o AnsibleTowerNotificationOutput) Profile() pulumi.StringOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringOutput { return v.Profile }).(pulumi.StringOutput)
}

// The username of the Ansible Tower account
func (o AnsibleTowerNotificationOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *AnsibleTowerNotification) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type AnsibleTowerNotificationArrayOutput struct{ *pulumi.OutputState }

func (AnsibleTowerNotificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AnsibleTowerNotification)(nil)).Elem()
}

func (o AnsibleTowerNotificationArrayOutput) ToAnsibleTowerNotificationArrayOutput() AnsibleTowerNotificationArrayOutput {
	return o
}

func (o AnsibleTowerNotificationArrayOutput) ToAnsibleTowerNotificationArrayOutputWithContext(ctx context.Context) AnsibleTowerNotificationArrayOutput {
	return o
}

func (o AnsibleTowerNotificationArrayOutput) Index(i pulumi.IntInput) AnsibleTowerNotificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AnsibleTowerNotification {
		return vs[0].([]*AnsibleTowerNotification)[vs[1].(int)]
	}).(AnsibleTowerNotificationOutput)
}

type AnsibleTowerNotificationMapOutput struct{ *pulumi.OutputState }

func (AnsibleTowerNotificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AnsibleTowerNotification)(nil)).Elem()
}

func (o AnsibleTowerNotificationMapOutput) ToAnsibleTowerNotificationMapOutput() AnsibleTowerNotificationMapOutput {
	return o
}

func (o AnsibleTowerNotificationMapOutput) ToAnsibleTowerNotificationMapOutputWithContext(ctx context.Context) AnsibleTowerNotificationMapOutput {
	return o
}

func (o AnsibleTowerNotificationMapOutput) MapIndex(k pulumi.StringInput) AnsibleTowerNotificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AnsibleTowerNotification {
		return vs[0].(map[string]*AnsibleTowerNotification)[vs[1].(string)]
	}).(AnsibleTowerNotificationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AnsibleTowerNotificationInput)(nil)).Elem(), &AnsibleTowerNotification{})
	pulumi.RegisterInputType(reflect.TypeOf((*AnsibleTowerNotificationArrayInput)(nil)).Elem(), AnsibleTowerNotificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AnsibleTowerNotificationMapInput)(nil)).Elem(), AnsibleTowerNotificationMap{})
	pulumi.RegisterOutputType(AnsibleTowerNotificationOutput{})
	pulumi.RegisterOutputType(AnsibleTowerNotificationArrayOutput{})
	pulumi.RegisterOutputType(AnsibleTowerNotificationMapOutput{})
}
