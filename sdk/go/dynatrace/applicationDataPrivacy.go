// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ApplicationDataPrivacy struct {
	pulumi.CustomResourceState

	// (Field has overlap with `DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
	DataCaptureOptIn pulumi.BoolPtrOutput `pulumi:"dataCaptureOptIn"`
	// (Field has overlap with `DataPrivacy`) How to handle the "Do Not Track" header:
	DoNotTrackBehaviour pulumi.StringOutput `pulumi:"doNotTrackBehaviour"`
	// (Field has overlap with `DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
	PersistentCookieForUserTracking pulumi.BoolPtrOutput `pulumi:"persistentCookieForUserTracking"`
	// (Field has overlap with `SessionReplayWebPrivacy`) Data privacy settings for Session Replay
	SessionReplayDataPrivacy ApplicationDataPrivacySessionReplayDataPrivacyOutput `pulumi:"sessionReplayDataPrivacy"`
	// Dynatrace entity ID of the web application
	WebApplicationId pulumi.StringOutput `pulumi:"webApplicationId"`
}

// NewApplicationDataPrivacy registers a new resource with the given unique name, arguments, and options.
func NewApplicationDataPrivacy(ctx *pulumi.Context,
	name string, args *ApplicationDataPrivacyArgs, opts ...pulumi.ResourceOption) (*ApplicationDataPrivacy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DoNotTrackBehaviour == nil {
		return nil, errors.New("invalid value for required argument 'DoNotTrackBehaviour'")
	}
	if args.SessionReplayDataPrivacy == nil {
		return nil, errors.New("invalid value for required argument 'SessionReplayDataPrivacy'")
	}
	if args.WebApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'WebApplicationId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ApplicationDataPrivacy
	err := ctx.RegisterResource("dynatrace:index/applicationDataPrivacy:ApplicationDataPrivacy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationDataPrivacy gets an existing ApplicationDataPrivacy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationDataPrivacy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationDataPrivacyState, opts ...pulumi.ResourceOption) (*ApplicationDataPrivacy, error) {
	var resource ApplicationDataPrivacy
	err := ctx.ReadResource("dynatrace:index/applicationDataPrivacy:ApplicationDataPrivacy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationDataPrivacy resources.
type applicationDataPrivacyState struct {
	// (Field has overlap with `DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
	DataCaptureOptIn *bool `pulumi:"dataCaptureOptIn"`
	// (Field has overlap with `DataPrivacy`) How to handle the "Do Not Track" header:
	DoNotTrackBehaviour *string `pulumi:"doNotTrackBehaviour"`
	// (Field has overlap with `DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
	PersistentCookieForUserTracking *bool `pulumi:"persistentCookieForUserTracking"`
	// (Field has overlap with `SessionReplayWebPrivacy`) Data privacy settings for Session Replay
	SessionReplayDataPrivacy *ApplicationDataPrivacySessionReplayDataPrivacy `pulumi:"sessionReplayDataPrivacy"`
	// Dynatrace entity ID of the web application
	WebApplicationId *string `pulumi:"webApplicationId"`
}

type ApplicationDataPrivacyState struct {
	// (Field has overlap with `DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
	DataCaptureOptIn pulumi.BoolPtrInput
	// (Field has overlap with `DataPrivacy`) How to handle the "Do Not Track" header:
	DoNotTrackBehaviour pulumi.StringPtrInput
	// (Field has overlap with `DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
	PersistentCookieForUserTracking pulumi.BoolPtrInput
	// (Field has overlap with `SessionReplayWebPrivacy`) Data privacy settings for Session Replay
	SessionReplayDataPrivacy ApplicationDataPrivacySessionReplayDataPrivacyPtrInput
	// Dynatrace entity ID of the web application
	WebApplicationId pulumi.StringPtrInput
}

func (ApplicationDataPrivacyState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationDataPrivacyState)(nil)).Elem()
}

type applicationDataPrivacyArgs struct {
	// (Field has overlap with `DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
	DataCaptureOptIn *bool `pulumi:"dataCaptureOptIn"`
	// (Field has overlap with `DataPrivacy`) How to handle the "Do Not Track" header:
	DoNotTrackBehaviour string `pulumi:"doNotTrackBehaviour"`
	// (Field has overlap with `DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
	PersistentCookieForUserTracking *bool `pulumi:"persistentCookieForUserTracking"`
	// (Field has overlap with `SessionReplayWebPrivacy`) Data privacy settings for Session Replay
	SessionReplayDataPrivacy ApplicationDataPrivacySessionReplayDataPrivacy `pulumi:"sessionReplayDataPrivacy"`
	// Dynatrace entity ID of the web application
	WebApplicationId string `pulumi:"webApplicationId"`
}

// The set of arguments for constructing a ApplicationDataPrivacy resource.
type ApplicationDataPrivacyArgs struct {
	// (Field has overlap with `DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
	DataCaptureOptIn pulumi.BoolPtrInput
	// (Field has overlap with `DataPrivacy`) How to handle the "Do Not Track" header:
	DoNotTrackBehaviour pulumi.StringInput
	// (Field has overlap with `DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
	PersistentCookieForUserTracking pulumi.BoolPtrInput
	// (Field has overlap with `SessionReplayWebPrivacy`) Data privacy settings for Session Replay
	SessionReplayDataPrivacy ApplicationDataPrivacySessionReplayDataPrivacyInput
	// Dynatrace entity ID of the web application
	WebApplicationId pulumi.StringInput
}

func (ApplicationDataPrivacyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationDataPrivacyArgs)(nil)).Elem()
}

type ApplicationDataPrivacyInput interface {
	pulumi.Input

	ToApplicationDataPrivacyOutput() ApplicationDataPrivacyOutput
	ToApplicationDataPrivacyOutputWithContext(ctx context.Context) ApplicationDataPrivacyOutput
}

func (*ApplicationDataPrivacy) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationDataPrivacy)(nil)).Elem()
}

func (i *ApplicationDataPrivacy) ToApplicationDataPrivacyOutput() ApplicationDataPrivacyOutput {
	return i.ToApplicationDataPrivacyOutputWithContext(context.Background())
}

func (i *ApplicationDataPrivacy) ToApplicationDataPrivacyOutputWithContext(ctx context.Context) ApplicationDataPrivacyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationDataPrivacyOutput)
}

// ApplicationDataPrivacyArrayInput is an input type that accepts ApplicationDataPrivacyArray and ApplicationDataPrivacyArrayOutput values.
// You can construct a concrete instance of `ApplicationDataPrivacyArrayInput` via:
//
//	ApplicationDataPrivacyArray{ ApplicationDataPrivacyArgs{...} }
type ApplicationDataPrivacyArrayInput interface {
	pulumi.Input

	ToApplicationDataPrivacyArrayOutput() ApplicationDataPrivacyArrayOutput
	ToApplicationDataPrivacyArrayOutputWithContext(context.Context) ApplicationDataPrivacyArrayOutput
}

type ApplicationDataPrivacyArray []ApplicationDataPrivacyInput

func (ApplicationDataPrivacyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationDataPrivacy)(nil)).Elem()
}

func (i ApplicationDataPrivacyArray) ToApplicationDataPrivacyArrayOutput() ApplicationDataPrivacyArrayOutput {
	return i.ToApplicationDataPrivacyArrayOutputWithContext(context.Background())
}

func (i ApplicationDataPrivacyArray) ToApplicationDataPrivacyArrayOutputWithContext(ctx context.Context) ApplicationDataPrivacyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationDataPrivacyArrayOutput)
}

// ApplicationDataPrivacyMapInput is an input type that accepts ApplicationDataPrivacyMap and ApplicationDataPrivacyMapOutput values.
// You can construct a concrete instance of `ApplicationDataPrivacyMapInput` via:
//
//	ApplicationDataPrivacyMap{ "key": ApplicationDataPrivacyArgs{...} }
type ApplicationDataPrivacyMapInput interface {
	pulumi.Input

	ToApplicationDataPrivacyMapOutput() ApplicationDataPrivacyMapOutput
	ToApplicationDataPrivacyMapOutputWithContext(context.Context) ApplicationDataPrivacyMapOutput
}

type ApplicationDataPrivacyMap map[string]ApplicationDataPrivacyInput

func (ApplicationDataPrivacyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationDataPrivacy)(nil)).Elem()
}

func (i ApplicationDataPrivacyMap) ToApplicationDataPrivacyMapOutput() ApplicationDataPrivacyMapOutput {
	return i.ToApplicationDataPrivacyMapOutputWithContext(context.Background())
}

func (i ApplicationDataPrivacyMap) ToApplicationDataPrivacyMapOutputWithContext(ctx context.Context) ApplicationDataPrivacyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationDataPrivacyMapOutput)
}

type ApplicationDataPrivacyOutput struct{ *pulumi.OutputState }

func (ApplicationDataPrivacyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationDataPrivacy)(nil)).Elem()
}

func (o ApplicationDataPrivacyOutput) ToApplicationDataPrivacyOutput() ApplicationDataPrivacyOutput {
	return o
}

func (o ApplicationDataPrivacyOutput) ToApplicationDataPrivacyOutputWithContext(ctx context.Context) ApplicationDataPrivacyOutput {
	return o
}

// (Field has overlap with `DataPrivacy`) Set to `true` to disable data capture and cookies until JavaScriptAPI `dtrum.enable()` is called
func (o ApplicationDataPrivacyOutput) DataCaptureOptIn() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApplicationDataPrivacy) pulumi.BoolPtrOutput { return v.DataCaptureOptIn }).(pulumi.BoolPtrOutput)
}

// (Field has overlap with `DataPrivacy`) How to handle the "Do Not Track" header:
func (o ApplicationDataPrivacyOutput) DoNotTrackBehaviour() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationDataPrivacy) pulumi.StringOutput { return v.DoNotTrackBehaviour }).(pulumi.StringOutput)
}

// (Field has overlap with `DataPrivacy`) Set to `true` to set persistent cookie in order to recognize returning devices
func (o ApplicationDataPrivacyOutput) PersistentCookieForUserTracking() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApplicationDataPrivacy) pulumi.BoolPtrOutput { return v.PersistentCookieForUserTracking }).(pulumi.BoolPtrOutput)
}

// (Field has overlap with `SessionReplayWebPrivacy`) Data privacy settings for Session Replay
func (o ApplicationDataPrivacyOutput) SessionReplayDataPrivacy() ApplicationDataPrivacySessionReplayDataPrivacyOutput {
	return o.ApplyT(func(v *ApplicationDataPrivacy) ApplicationDataPrivacySessionReplayDataPrivacyOutput {
		return v.SessionReplayDataPrivacy
	}).(ApplicationDataPrivacySessionReplayDataPrivacyOutput)
}

// Dynatrace entity ID of the web application
func (o ApplicationDataPrivacyOutput) WebApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationDataPrivacy) pulumi.StringOutput { return v.WebApplicationId }).(pulumi.StringOutput)
}

type ApplicationDataPrivacyArrayOutput struct{ *pulumi.OutputState }

func (ApplicationDataPrivacyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationDataPrivacy)(nil)).Elem()
}

func (o ApplicationDataPrivacyArrayOutput) ToApplicationDataPrivacyArrayOutput() ApplicationDataPrivacyArrayOutput {
	return o
}

func (o ApplicationDataPrivacyArrayOutput) ToApplicationDataPrivacyArrayOutputWithContext(ctx context.Context) ApplicationDataPrivacyArrayOutput {
	return o
}

func (o ApplicationDataPrivacyArrayOutput) Index(i pulumi.IntInput) ApplicationDataPrivacyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationDataPrivacy {
		return vs[0].([]*ApplicationDataPrivacy)[vs[1].(int)]
	}).(ApplicationDataPrivacyOutput)
}

type ApplicationDataPrivacyMapOutput struct{ *pulumi.OutputState }

func (ApplicationDataPrivacyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationDataPrivacy)(nil)).Elem()
}

func (o ApplicationDataPrivacyMapOutput) ToApplicationDataPrivacyMapOutput() ApplicationDataPrivacyMapOutput {
	return o
}

func (o ApplicationDataPrivacyMapOutput) ToApplicationDataPrivacyMapOutputWithContext(ctx context.Context) ApplicationDataPrivacyMapOutput {
	return o
}

func (o ApplicationDataPrivacyMapOutput) MapIndex(k pulumi.StringInput) ApplicationDataPrivacyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationDataPrivacy {
		return vs[0].(map[string]*ApplicationDataPrivacy)[vs[1].(string)]
	}).(ApplicationDataPrivacyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationDataPrivacyInput)(nil)).Elem(), &ApplicationDataPrivacy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationDataPrivacyArrayInput)(nil)).Elem(), ApplicationDataPrivacyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationDataPrivacyMapInput)(nil)).Elem(), ApplicationDataPrivacyMap{})
	pulumi.RegisterOutputType(ApplicationDataPrivacyOutput{})
	pulumi.RegisterOutputType(ApplicationDataPrivacyArrayOutput{})
	pulumi.RegisterOutputType(ApplicationDataPrivacyMapOutput{})
}
