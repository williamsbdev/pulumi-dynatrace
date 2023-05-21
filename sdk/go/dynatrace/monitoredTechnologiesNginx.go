// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type MonitoredTechnologiesNginx struct {
	pulumi.CustomResourceState

	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrOutput `pulumi:"hostId"`
}

// NewMonitoredTechnologiesNginx registers a new resource with the given unique name, arguments, and options.
func NewMonitoredTechnologiesNginx(ctx *pulumi.Context,
	name string, args *MonitoredTechnologiesNginxArgs, opts ...pulumi.ResourceOption) (*MonitoredTechnologiesNginx, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource MonitoredTechnologiesNginx
	err := ctx.RegisterResource("dynatrace:index/monitoredTechnologiesNginx:MonitoredTechnologiesNginx", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitoredTechnologiesNginx gets an existing MonitoredTechnologiesNginx resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitoredTechnologiesNginx(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitoredTechnologiesNginxState, opts ...pulumi.ResourceOption) (*MonitoredTechnologiesNginx, error) {
	var resource MonitoredTechnologiesNginx
	err := ctx.ReadResource("dynatrace:index/monitoredTechnologiesNginx:MonitoredTechnologiesNginx", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitoredTechnologiesNginx resources.
type monitoredTechnologiesNginxState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

type MonitoredTechnologiesNginxState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (MonitoredTechnologiesNginxState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredTechnologiesNginxState)(nil)).Elem()
}

type monitoredTechnologiesNginxArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

// The set of arguments for constructing a MonitoredTechnologiesNginx resource.
type MonitoredTechnologiesNginxArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (MonitoredTechnologiesNginxArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredTechnologiesNginxArgs)(nil)).Elem()
}

type MonitoredTechnologiesNginxInput interface {
	pulumi.Input

	ToMonitoredTechnologiesNginxOutput() MonitoredTechnologiesNginxOutput
	ToMonitoredTechnologiesNginxOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxOutput
}

func (*MonitoredTechnologiesNginx) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredTechnologiesNginx)(nil)).Elem()
}

func (i *MonitoredTechnologiesNginx) ToMonitoredTechnologiesNginxOutput() MonitoredTechnologiesNginxOutput {
	return i.ToMonitoredTechnologiesNginxOutputWithContext(context.Background())
}

func (i *MonitoredTechnologiesNginx) ToMonitoredTechnologiesNginxOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesNginxOutput)
}

// MonitoredTechnologiesNginxArrayInput is an input type that accepts MonitoredTechnologiesNginxArray and MonitoredTechnologiesNginxArrayOutput values.
// You can construct a concrete instance of `MonitoredTechnologiesNginxArrayInput` via:
//
//	MonitoredTechnologiesNginxArray{ MonitoredTechnologiesNginxArgs{...} }
type MonitoredTechnologiesNginxArrayInput interface {
	pulumi.Input

	ToMonitoredTechnologiesNginxArrayOutput() MonitoredTechnologiesNginxArrayOutput
	ToMonitoredTechnologiesNginxArrayOutputWithContext(context.Context) MonitoredTechnologiesNginxArrayOutput
}

type MonitoredTechnologiesNginxArray []MonitoredTechnologiesNginxInput

func (MonitoredTechnologiesNginxArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredTechnologiesNginx)(nil)).Elem()
}

func (i MonitoredTechnologiesNginxArray) ToMonitoredTechnologiesNginxArrayOutput() MonitoredTechnologiesNginxArrayOutput {
	return i.ToMonitoredTechnologiesNginxArrayOutputWithContext(context.Background())
}

func (i MonitoredTechnologiesNginxArray) ToMonitoredTechnologiesNginxArrayOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesNginxArrayOutput)
}

// MonitoredTechnologiesNginxMapInput is an input type that accepts MonitoredTechnologiesNginxMap and MonitoredTechnologiesNginxMapOutput values.
// You can construct a concrete instance of `MonitoredTechnologiesNginxMapInput` via:
//
//	MonitoredTechnologiesNginxMap{ "key": MonitoredTechnologiesNginxArgs{...} }
type MonitoredTechnologiesNginxMapInput interface {
	pulumi.Input

	ToMonitoredTechnologiesNginxMapOutput() MonitoredTechnologiesNginxMapOutput
	ToMonitoredTechnologiesNginxMapOutputWithContext(context.Context) MonitoredTechnologiesNginxMapOutput
}

type MonitoredTechnologiesNginxMap map[string]MonitoredTechnologiesNginxInput

func (MonitoredTechnologiesNginxMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredTechnologiesNginx)(nil)).Elem()
}

func (i MonitoredTechnologiesNginxMap) ToMonitoredTechnologiesNginxMapOutput() MonitoredTechnologiesNginxMapOutput {
	return i.ToMonitoredTechnologiesNginxMapOutputWithContext(context.Background())
}

func (i MonitoredTechnologiesNginxMap) ToMonitoredTechnologiesNginxMapOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesNginxMapOutput)
}

type MonitoredTechnologiesNginxOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesNginxOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredTechnologiesNginx)(nil)).Elem()
}

func (o MonitoredTechnologiesNginxOutput) ToMonitoredTechnologiesNginxOutput() MonitoredTechnologiesNginxOutput {
	return o
}

func (o MonitoredTechnologiesNginxOutput) ToMonitoredTechnologiesNginxOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxOutput {
	return o
}

// This setting is enabled (`true`) or disabled (`false`)
func (o MonitoredTechnologiesNginxOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesNginx) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o MonitoredTechnologiesNginxOutput) HostId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesNginx) pulumi.StringPtrOutput { return v.HostId }).(pulumi.StringPtrOutput)
}

type MonitoredTechnologiesNginxArrayOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesNginxArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredTechnologiesNginx)(nil)).Elem()
}

func (o MonitoredTechnologiesNginxArrayOutput) ToMonitoredTechnologiesNginxArrayOutput() MonitoredTechnologiesNginxArrayOutput {
	return o
}

func (o MonitoredTechnologiesNginxArrayOutput) ToMonitoredTechnologiesNginxArrayOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxArrayOutput {
	return o
}

func (o MonitoredTechnologiesNginxArrayOutput) Index(i pulumi.IntInput) MonitoredTechnologiesNginxOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitoredTechnologiesNginx {
		return vs[0].([]*MonitoredTechnologiesNginx)[vs[1].(int)]
	}).(MonitoredTechnologiesNginxOutput)
}

type MonitoredTechnologiesNginxMapOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesNginxMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredTechnologiesNginx)(nil)).Elem()
}

func (o MonitoredTechnologiesNginxMapOutput) ToMonitoredTechnologiesNginxMapOutput() MonitoredTechnologiesNginxMapOutput {
	return o
}

func (o MonitoredTechnologiesNginxMapOutput) ToMonitoredTechnologiesNginxMapOutputWithContext(ctx context.Context) MonitoredTechnologiesNginxMapOutput {
	return o
}

func (o MonitoredTechnologiesNginxMapOutput) MapIndex(k pulumi.StringInput) MonitoredTechnologiesNginxOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitoredTechnologiesNginx {
		return vs[0].(map[string]*MonitoredTechnologiesNginx)[vs[1].(string)]
	}).(MonitoredTechnologiesNginxOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesNginxInput)(nil)).Elem(), &MonitoredTechnologiesNginx{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesNginxArrayInput)(nil)).Elem(), MonitoredTechnologiesNginxArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesNginxMapInput)(nil)).Elem(), MonitoredTechnologiesNginxMap{})
	pulumi.RegisterOutputType(MonitoredTechnologiesNginxOutput{})
	pulumi.RegisterOutputType(MonitoredTechnologiesNginxArrayOutput{})
	pulumi.RegisterOutputType(MonitoredTechnologiesNginxMapOutput{})
}
