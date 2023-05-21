// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type HostMonitoring struct {
	pulumi.CustomResourceState

	// An auto-injection disabled with [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
	AutoInjection pulumi.BoolOutput `pulumi:"autoInjection"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Dynatrace uses full-stack monitoring by default, to monitor every aspect of your environment, including all processes, services, and applications detected on your hosts.
	FullStack pulumi.BoolOutput `pulumi:"fullStack"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringOutput `pulumi:"hostId"`
}

// NewHostMonitoring registers a new resource with the given unique name, arguments, and options.
func NewHostMonitoring(ctx *pulumi.Context,
	name string, args *HostMonitoringArgs, opts ...pulumi.ResourceOption) (*HostMonitoring, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutoInjection == nil {
		return nil, errors.New("invalid value for required argument 'AutoInjection'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.FullStack == nil {
		return nil, errors.New("invalid value for required argument 'FullStack'")
	}
	if args.HostId == nil {
		return nil, errors.New("invalid value for required argument 'HostId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource HostMonitoring
	err := ctx.RegisterResource("dynatrace:index/hostMonitoring:HostMonitoring", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostMonitoring gets an existing HostMonitoring resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostMonitoring(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostMonitoringState, opts ...pulumi.ResourceOption) (*HostMonitoring, error) {
	var resource HostMonitoring
	err := ctx.ReadResource("dynatrace:index/hostMonitoring:HostMonitoring", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostMonitoring resources.
type hostMonitoringState struct {
	// An auto-injection disabled with [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
	AutoInjection *bool `pulumi:"autoInjection"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Dynatrace uses full-stack monitoring by default, to monitor every aspect of your environment, including all processes, services, and applications detected on your hosts.
	FullStack *bool `pulumi:"fullStack"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

type HostMonitoringState struct {
	// An auto-injection disabled with [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
	AutoInjection pulumi.BoolPtrInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Dynatrace uses full-stack monitoring by default, to monitor every aspect of your environment, including all processes, services, and applications detected on your hosts.
	FullStack pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (HostMonitoringState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostMonitoringState)(nil)).Elem()
}

type hostMonitoringArgs struct {
	// An auto-injection disabled with [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
	AutoInjection bool `pulumi:"autoInjection"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Dynatrace uses full-stack monitoring by default, to monitor every aspect of your environment, including all processes, services, and applications detected on your hosts.
	FullStack bool `pulumi:"fullStack"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId string `pulumi:"hostId"`
}

// The set of arguments for constructing a HostMonitoring resource.
type HostMonitoringArgs struct {
	// An auto-injection disabled with [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
	AutoInjection pulumi.BoolInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Dynatrace uses full-stack monitoring by default, to monitor every aspect of your environment, including all processes, services, and applications detected on your hosts.
	FullStack pulumi.BoolInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringInput
}

func (HostMonitoringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostMonitoringArgs)(nil)).Elem()
}

type HostMonitoringInput interface {
	pulumi.Input

	ToHostMonitoringOutput() HostMonitoringOutput
	ToHostMonitoringOutputWithContext(ctx context.Context) HostMonitoringOutput
}

func (*HostMonitoring) ElementType() reflect.Type {
	return reflect.TypeOf((**HostMonitoring)(nil)).Elem()
}

func (i *HostMonitoring) ToHostMonitoringOutput() HostMonitoringOutput {
	return i.ToHostMonitoringOutputWithContext(context.Background())
}

func (i *HostMonitoring) ToHostMonitoringOutputWithContext(ctx context.Context) HostMonitoringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostMonitoringOutput)
}

// HostMonitoringArrayInput is an input type that accepts HostMonitoringArray and HostMonitoringArrayOutput values.
// You can construct a concrete instance of `HostMonitoringArrayInput` via:
//
//	HostMonitoringArray{ HostMonitoringArgs{...} }
type HostMonitoringArrayInput interface {
	pulumi.Input

	ToHostMonitoringArrayOutput() HostMonitoringArrayOutput
	ToHostMonitoringArrayOutputWithContext(context.Context) HostMonitoringArrayOutput
}

type HostMonitoringArray []HostMonitoringInput

func (HostMonitoringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostMonitoring)(nil)).Elem()
}

func (i HostMonitoringArray) ToHostMonitoringArrayOutput() HostMonitoringArrayOutput {
	return i.ToHostMonitoringArrayOutputWithContext(context.Background())
}

func (i HostMonitoringArray) ToHostMonitoringArrayOutputWithContext(ctx context.Context) HostMonitoringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostMonitoringArrayOutput)
}

// HostMonitoringMapInput is an input type that accepts HostMonitoringMap and HostMonitoringMapOutput values.
// You can construct a concrete instance of `HostMonitoringMapInput` via:
//
//	HostMonitoringMap{ "key": HostMonitoringArgs{...} }
type HostMonitoringMapInput interface {
	pulumi.Input

	ToHostMonitoringMapOutput() HostMonitoringMapOutput
	ToHostMonitoringMapOutputWithContext(context.Context) HostMonitoringMapOutput
}

type HostMonitoringMap map[string]HostMonitoringInput

func (HostMonitoringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostMonitoring)(nil)).Elem()
}

func (i HostMonitoringMap) ToHostMonitoringMapOutput() HostMonitoringMapOutput {
	return i.ToHostMonitoringMapOutputWithContext(context.Background())
}

func (i HostMonitoringMap) ToHostMonitoringMapOutputWithContext(ctx context.Context) HostMonitoringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostMonitoringMapOutput)
}

type HostMonitoringOutput struct{ *pulumi.OutputState }

func (HostMonitoringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostMonitoring)(nil)).Elem()
}

func (o HostMonitoringOutput) ToHostMonitoringOutput() HostMonitoringOutput {
	return o
}

func (o HostMonitoringOutput) ToHostMonitoringOutputWithContext(ctx context.Context) HostMonitoringOutput {
	return o
}

// An auto-injection disabled with [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
func (o HostMonitoringOutput) AutoInjection() pulumi.BoolOutput {
	return o.ApplyT(func(v *HostMonitoring) pulumi.BoolOutput { return v.AutoInjection }).(pulumi.BoolOutput)
}

// This setting is enabled (`true`) or disabled (`false`)
func (o HostMonitoringOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *HostMonitoring) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Dynatrace uses full-stack monitoring by default, to monitor every aspect of your environment, including all processes, services, and applications detected on your hosts.
func (o HostMonitoringOutput) FullStack() pulumi.BoolOutput {
	return o.ApplyT(func(v *HostMonitoring) pulumi.BoolOutput { return v.FullStack }).(pulumi.BoolOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o HostMonitoringOutput) HostId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostMonitoring) pulumi.StringOutput { return v.HostId }).(pulumi.StringOutput)
}

type HostMonitoringArrayOutput struct{ *pulumi.OutputState }

func (HostMonitoringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostMonitoring)(nil)).Elem()
}

func (o HostMonitoringArrayOutput) ToHostMonitoringArrayOutput() HostMonitoringArrayOutput {
	return o
}

func (o HostMonitoringArrayOutput) ToHostMonitoringArrayOutputWithContext(ctx context.Context) HostMonitoringArrayOutput {
	return o
}

func (o HostMonitoringArrayOutput) Index(i pulumi.IntInput) HostMonitoringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostMonitoring {
		return vs[0].([]*HostMonitoring)[vs[1].(int)]
	}).(HostMonitoringOutput)
}

type HostMonitoringMapOutput struct{ *pulumi.OutputState }

func (HostMonitoringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostMonitoring)(nil)).Elem()
}

func (o HostMonitoringMapOutput) ToHostMonitoringMapOutput() HostMonitoringMapOutput {
	return o
}

func (o HostMonitoringMapOutput) ToHostMonitoringMapOutputWithContext(ctx context.Context) HostMonitoringMapOutput {
	return o
}

func (o HostMonitoringMapOutput) MapIndex(k pulumi.StringInput) HostMonitoringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostMonitoring {
		return vs[0].(map[string]*HostMonitoring)[vs[1].(string)]
	}).(HostMonitoringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostMonitoringInput)(nil)).Elem(), &HostMonitoring{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostMonitoringArrayInput)(nil)).Elem(), HostMonitoringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostMonitoringMapInput)(nil)).Elem(), HostMonitoringMap{})
	pulumi.RegisterOutputType(HostMonitoringOutput{})
	pulumi.RegisterOutputType(HostMonitoringArrayOutput{})
	pulumi.RegisterOutputType(HostMonitoringMapOutput{})
}
