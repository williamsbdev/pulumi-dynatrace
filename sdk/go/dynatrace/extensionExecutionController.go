// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ExtensionExecutionController struct {
	pulumi.CustomResourceState

	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Enable local PIPE/HTTP metric and Log Ingest API
	IngestActive pulumi.BoolPtrOutput `pulumi:"ingestActive"`
	// Possible Values: `DEFAULT`, `HIGH`
	PerformanceProfile pulumi.StringPtrOutput `pulumi:"performanceProfile"`
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope pulumi.StringPtrOutput `pulumi:"scope"`
	// Enable Dynatrace StatsD
	StatsdActive pulumi.BoolPtrOutput `pulumi:"statsdActive"`
}

// NewExtensionExecutionController registers a new resource with the given unique name, arguments, and options.
func NewExtensionExecutionController(ctx *pulumi.Context,
	name string, args *ExtensionExecutionControllerArgs, opts ...pulumi.ResourceOption) (*ExtensionExecutionController, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ExtensionExecutionController
	err := ctx.RegisterResource("dynatrace:index/extensionExecutionController:ExtensionExecutionController", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExtensionExecutionController gets an existing ExtensionExecutionController resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExtensionExecutionController(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExtensionExecutionControllerState, opts ...pulumi.ResourceOption) (*ExtensionExecutionController, error) {
	var resource ExtensionExecutionController
	err := ctx.ReadResource("dynatrace:index/extensionExecutionController:ExtensionExecutionController", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExtensionExecutionController resources.
type extensionExecutionControllerState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Enable local PIPE/HTTP metric and Log Ingest API
	IngestActive *bool `pulumi:"ingestActive"`
	// Possible Values: `DEFAULT`, `HIGH`
	PerformanceProfile *string `pulumi:"performanceProfile"`
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope *string `pulumi:"scope"`
	// Enable Dynatrace StatsD
	StatsdActive *bool `pulumi:"statsdActive"`
}

type ExtensionExecutionControllerState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Enable local PIPE/HTTP metric and Log Ingest API
	IngestActive pulumi.BoolPtrInput
	// Possible Values: `DEFAULT`, `HIGH`
	PerformanceProfile pulumi.StringPtrInput
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope pulumi.StringPtrInput
	// Enable Dynatrace StatsD
	StatsdActive pulumi.BoolPtrInput
}

func (ExtensionExecutionControllerState) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionExecutionControllerState)(nil)).Elem()
}

type extensionExecutionControllerArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Enable local PIPE/HTTP metric and Log Ingest API
	IngestActive *bool `pulumi:"ingestActive"`
	// Possible Values: `DEFAULT`, `HIGH`
	PerformanceProfile *string `pulumi:"performanceProfile"`
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope *string `pulumi:"scope"`
	// Enable Dynatrace StatsD
	StatsdActive *bool `pulumi:"statsdActive"`
}

// The set of arguments for constructing a ExtensionExecutionController resource.
type ExtensionExecutionControllerArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Enable local PIPE/HTTP metric and Log Ingest API
	IngestActive pulumi.BoolPtrInput
	// Possible Values: `DEFAULT`, `HIGH`
	PerformanceProfile pulumi.StringPtrInput
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope pulumi.StringPtrInput
	// Enable Dynatrace StatsD
	StatsdActive pulumi.BoolPtrInput
}

func (ExtensionExecutionControllerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionExecutionControllerArgs)(nil)).Elem()
}

type ExtensionExecutionControllerInput interface {
	pulumi.Input

	ToExtensionExecutionControllerOutput() ExtensionExecutionControllerOutput
	ToExtensionExecutionControllerOutputWithContext(ctx context.Context) ExtensionExecutionControllerOutput
}

func (*ExtensionExecutionController) ElementType() reflect.Type {
	return reflect.TypeOf((**ExtensionExecutionController)(nil)).Elem()
}

func (i *ExtensionExecutionController) ToExtensionExecutionControllerOutput() ExtensionExecutionControllerOutput {
	return i.ToExtensionExecutionControllerOutputWithContext(context.Background())
}

func (i *ExtensionExecutionController) ToExtensionExecutionControllerOutputWithContext(ctx context.Context) ExtensionExecutionControllerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionExecutionControllerOutput)
}

// ExtensionExecutionControllerArrayInput is an input type that accepts ExtensionExecutionControllerArray and ExtensionExecutionControllerArrayOutput values.
// You can construct a concrete instance of `ExtensionExecutionControllerArrayInput` via:
//
//	ExtensionExecutionControllerArray{ ExtensionExecutionControllerArgs{...} }
type ExtensionExecutionControllerArrayInput interface {
	pulumi.Input

	ToExtensionExecutionControllerArrayOutput() ExtensionExecutionControllerArrayOutput
	ToExtensionExecutionControllerArrayOutputWithContext(context.Context) ExtensionExecutionControllerArrayOutput
}

type ExtensionExecutionControllerArray []ExtensionExecutionControllerInput

func (ExtensionExecutionControllerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExtensionExecutionController)(nil)).Elem()
}

func (i ExtensionExecutionControllerArray) ToExtensionExecutionControllerArrayOutput() ExtensionExecutionControllerArrayOutput {
	return i.ToExtensionExecutionControllerArrayOutputWithContext(context.Background())
}

func (i ExtensionExecutionControllerArray) ToExtensionExecutionControllerArrayOutputWithContext(ctx context.Context) ExtensionExecutionControllerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionExecutionControllerArrayOutput)
}

// ExtensionExecutionControllerMapInput is an input type that accepts ExtensionExecutionControllerMap and ExtensionExecutionControllerMapOutput values.
// You can construct a concrete instance of `ExtensionExecutionControllerMapInput` via:
//
//	ExtensionExecutionControllerMap{ "key": ExtensionExecutionControllerArgs{...} }
type ExtensionExecutionControllerMapInput interface {
	pulumi.Input

	ToExtensionExecutionControllerMapOutput() ExtensionExecutionControllerMapOutput
	ToExtensionExecutionControllerMapOutputWithContext(context.Context) ExtensionExecutionControllerMapOutput
}

type ExtensionExecutionControllerMap map[string]ExtensionExecutionControllerInput

func (ExtensionExecutionControllerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExtensionExecutionController)(nil)).Elem()
}

func (i ExtensionExecutionControllerMap) ToExtensionExecutionControllerMapOutput() ExtensionExecutionControllerMapOutput {
	return i.ToExtensionExecutionControllerMapOutputWithContext(context.Background())
}

func (i ExtensionExecutionControllerMap) ToExtensionExecutionControllerMapOutputWithContext(ctx context.Context) ExtensionExecutionControllerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionExecutionControllerMapOutput)
}

type ExtensionExecutionControllerOutput struct{ *pulumi.OutputState }

func (ExtensionExecutionControllerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExtensionExecutionController)(nil)).Elem()
}

func (o ExtensionExecutionControllerOutput) ToExtensionExecutionControllerOutput() ExtensionExecutionControllerOutput {
	return o
}

func (o ExtensionExecutionControllerOutput) ToExtensionExecutionControllerOutputWithContext(ctx context.Context) ExtensionExecutionControllerOutput {
	return o
}

// This setting is enabled (`true`) or disabled (`false`)
func (o ExtensionExecutionControllerOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ExtensionExecutionController) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Enable local PIPE/HTTP metric and Log Ingest API
func (o ExtensionExecutionControllerOutput) IngestActive() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExtensionExecutionController) pulumi.BoolPtrOutput { return v.IngestActive }).(pulumi.BoolPtrOutput)
}

// Possible Values: `DEFAULT`, `HIGH`
func (o ExtensionExecutionControllerOutput) PerformanceProfile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExtensionExecutionController) pulumi.StringPtrOutput { return v.PerformanceProfile }).(pulumi.StringPtrOutput)
}

// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
func (o ExtensionExecutionControllerOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExtensionExecutionController) pulumi.StringPtrOutput { return v.Scope }).(pulumi.StringPtrOutput)
}

// Enable Dynatrace StatsD
func (o ExtensionExecutionControllerOutput) StatsdActive() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExtensionExecutionController) pulumi.BoolPtrOutput { return v.StatsdActive }).(pulumi.BoolPtrOutput)
}

type ExtensionExecutionControllerArrayOutput struct{ *pulumi.OutputState }

func (ExtensionExecutionControllerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExtensionExecutionController)(nil)).Elem()
}

func (o ExtensionExecutionControllerArrayOutput) ToExtensionExecutionControllerArrayOutput() ExtensionExecutionControllerArrayOutput {
	return o
}

func (o ExtensionExecutionControllerArrayOutput) ToExtensionExecutionControllerArrayOutputWithContext(ctx context.Context) ExtensionExecutionControllerArrayOutput {
	return o
}

func (o ExtensionExecutionControllerArrayOutput) Index(i pulumi.IntInput) ExtensionExecutionControllerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExtensionExecutionController {
		return vs[0].([]*ExtensionExecutionController)[vs[1].(int)]
	}).(ExtensionExecutionControllerOutput)
}

type ExtensionExecutionControllerMapOutput struct{ *pulumi.OutputState }

func (ExtensionExecutionControllerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExtensionExecutionController)(nil)).Elem()
}

func (o ExtensionExecutionControllerMapOutput) ToExtensionExecutionControllerMapOutput() ExtensionExecutionControllerMapOutput {
	return o
}

func (o ExtensionExecutionControllerMapOutput) ToExtensionExecutionControllerMapOutputWithContext(ctx context.Context) ExtensionExecutionControllerMapOutput {
	return o
}

func (o ExtensionExecutionControllerMapOutput) MapIndex(k pulumi.StringInput) ExtensionExecutionControllerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExtensionExecutionController {
		return vs[0].(map[string]*ExtensionExecutionController)[vs[1].(string)]
	}).(ExtensionExecutionControllerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionExecutionControllerInput)(nil)).Elem(), &ExtensionExecutionController{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionExecutionControllerArrayInput)(nil)).Elem(), ExtensionExecutionControllerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionExecutionControllerMapInput)(nil)).Elem(), ExtensionExecutionControllerMap{})
	pulumi.RegisterOutputType(ExtensionExecutionControllerOutput{})
	pulumi.RegisterOutputType(ExtensionExecutionControllerArrayOutput{})
	pulumi.RegisterOutputType(ExtensionExecutionControllerMapOutput{})
}