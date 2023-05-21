// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ProcessGroupMonitoring struct {
	pulumi.CustomResourceState

	// Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
	MonitoringState pulumi.StringOutput `pulumi:"monitoringState"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ProcessGroupId pulumi.StringOutput `pulumi:"processGroupId"`
}

// NewProcessGroupMonitoring registers a new resource with the given unique name, arguments, and options.
func NewProcessGroupMonitoring(ctx *pulumi.Context,
	name string, args *ProcessGroupMonitoringArgs, opts ...pulumi.ResourceOption) (*ProcessGroupMonitoring, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MonitoringState == nil {
		return nil, errors.New("invalid value for required argument 'MonitoringState'")
	}
	if args.ProcessGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ProcessGroupId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ProcessGroupMonitoring
	err := ctx.RegisterResource("dynatrace:index/processGroupMonitoring:ProcessGroupMonitoring", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProcessGroupMonitoring gets an existing ProcessGroupMonitoring resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProcessGroupMonitoring(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProcessGroupMonitoringState, opts ...pulumi.ResourceOption) (*ProcessGroupMonitoring, error) {
	var resource ProcessGroupMonitoring
	err := ctx.ReadResource("dynatrace:index/processGroupMonitoring:ProcessGroupMonitoring", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProcessGroupMonitoring resources.
type processGroupMonitoringState struct {
	// Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
	MonitoringState *string `pulumi:"monitoringState"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ProcessGroupId *string `pulumi:"processGroupId"`
}

type ProcessGroupMonitoringState struct {
	// Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
	MonitoringState pulumi.StringPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ProcessGroupId pulumi.StringPtrInput
}

func (ProcessGroupMonitoringState) ElementType() reflect.Type {
	return reflect.TypeOf((*processGroupMonitoringState)(nil)).Elem()
}

type processGroupMonitoringArgs struct {
	// Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
	MonitoringState string `pulumi:"monitoringState"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ProcessGroupId string `pulumi:"processGroupId"`
}

// The set of arguments for constructing a ProcessGroupMonitoring resource.
type ProcessGroupMonitoringArgs struct {
	// Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
	MonitoringState pulumi.StringInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ProcessGroupId pulumi.StringInput
}

func (ProcessGroupMonitoringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*processGroupMonitoringArgs)(nil)).Elem()
}

type ProcessGroupMonitoringInput interface {
	pulumi.Input

	ToProcessGroupMonitoringOutput() ProcessGroupMonitoringOutput
	ToProcessGroupMonitoringOutputWithContext(ctx context.Context) ProcessGroupMonitoringOutput
}

func (*ProcessGroupMonitoring) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcessGroupMonitoring)(nil)).Elem()
}

func (i *ProcessGroupMonitoring) ToProcessGroupMonitoringOutput() ProcessGroupMonitoringOutput {
	return i.ToProcessGroupMonitoringOutputWithContext(context.Background())
}

func (i *ProcessGroupMonitoring) ToProcessGroupMonitoringOutputWithContext(ctx context.Context) ProcessGroupMonitoringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcessGroupMonitoringOutput)
}

// ProcessGroupMonitoringArrayInput is an input type that accepts ProcessGroupMonitoringArray and ProcessGroupMonitoringArrayOutput values.
// You can construct a concrete instance of `ProcessGroupMonitoringArrayInput` via:
//
//	ProcessGroupMonitoringArray{ ProcessGroupMonitoringArgs{...} }
type ProcessGroupMonitoringArrayInput interface {
	pulumi.Input

	ToProcessGroupMonitoringArrayOutput() ProcessGroupMonitoringArrayOutput
	ToProcessGroupMonitoringArrayOutputWithContext(context.Context) ProcessGroupMonitoringArrayOutput
}

type ProcessGroupMonitoringArray []ProcessGroupMonitoringInput

func (ProcessGroupMonitoringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProcessGroupMonitoring)(nil)).Elem()
}

func (i ProcessGroupMonitoringArray) ToProcessGroupMonitoringArrayOutput() ProcessGroupMonitoringArrayOutput {
	return i.ToProcessGroupMonitoringArrayOutputWithContext(context.Background())
}

func (i ProcessGroupMonitoringArray) ToProcessGroupMonitoringArrayOutputWithContext(ctx context.Context) ProcessGroupMonitoringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcessGroupMonitoringArrayOutput)
}

// ProcessGroupMonitoringMapInput is an input type that accepts ProcessGroupMonitoringMap and ProcessGroupMonitoringMapOutput values.
// You can construct a concrete instance of `ProcessGroupMonitoringMapInput` via:
//
//	ProcessGroupMonitoringMap{ "key": ProcessGroupMonitoringArgs{...} }
type ProcessGroupMonitoringMapInput interface {
	pulumi.Input

	ToProcessGroupMonitoringMapOutput() ProcessGroupMonitoringMapOutput
	ToProcessGroupMonitoringMapOutputWithContext(context.Context) ProcessGroupMonitoringMapOutput
}

type ProcessGroupMonitoringMap map[string]ProcessGroupMonitoringInput

func (ProcessGroupMonitoringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProcessGroupMonitoring)(nil)).Elem()
}

func (i ProcessGroupMonitoringMap) ToProcessGroupMonitoringMapOutput() ProcessGroupMonitoringMapOutput {
	return i.ToProcessGroupMonitoringMapOutputWithContext(context.Background())
}

func (i ProcessGroupMonitoringMap) ToProcessGroupMonitoringMapOutputWithContext(ctx context.Context) ProcessGroupMonitoringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcessGroupMonitoringMapOutput)
}

type ProcessGroupMonitoringOutput struct{ *pulumi.OutputState }

func (ProcessGroupMonitoringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcessGroupMonitoring)(nil)).Elem()
}

func (o ProcessGroupMonitoringOutput) ToProcessGroupMonitoringOutput() ProcessGroupMonitoringOutput {
	return o
}

func (o ProcessGroupMonitoringOutput) ToProcessGroupMonitoringOutputWithContext(ctx context.Context) ProcessGroupMonitoringOutput {
	return o
}

// Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
func (o ProcessGroupMonitoringOutput) MonitoringState() pulumi.StringOutput {
	return o.ApplyT(func(v *ProcessGroupMonitoring) pulumi.StringOutput { return v.MonitoringState }).(pulumi.StringOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o ProcessGroupMonitoringOutput) ProcessGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProcessGroupMonitoring) pulumi.StringOutput { return v.ProcessGroupId }).(pulumi.StringOutput)
}

type ProcessGroupMonitoringArrayOutput struct{ *pulumi.OutputState }

func (ProcessGroupMonitoringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProcessGroupMonitoring)(nil)).Elem()
}

func (o ProcessGroupMonitoringArrayOutput) ToProcessGroupMonitoringArrayOutput() ProcessGroupMonitoringArrayOutput {
	return o
}

func (o ProcessGroupMonitoringArrayOutput) ToProcessGroupMonitoringArrayOutputWithContext(ctx context.Context) ProcessGroupMonitoringArrayOutput {
	return o
}

func (o ProcessGroupMonitoringArrayOutput) Index(i pulumi.IntInput) ProcessGroupMonitoringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProcessGroupMonitoring {
		return vs[0].([]*ProcessGroupMonitoring)[vs[1].(int)]
	}).(ProcessGroupMonitoringOutput)
}

type ProcessGroupMonitoringMapOutput struct{ *pulumi.OutputState }

func (ProcessGroupMonitoringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProcessGroupMonitoring)(nil)).Elem()
}

func (o ProcessGroupMonitoringMapOutput) ToProcessGroupMonitoringMapOutput() ProcessGroupMonitoringMapOutput {
	return o
}

func (o ProcessGroupMonitoringMapOutput) ToProcessGroupMonitoringMapOutputWithContext(ctx context.Context) ProcessGroupMonitoringMapOutput {
	return o
}

func (o ProcessGroupMonitoringMapOutput) MapIndex(k pulumi.StringInput) ProcessGroupMonitoringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProcessGroupMonitoring {
		return vs[0].(map[string]*ProcessGroupMonitoring)[vs[1].(string)]
	}).(ProcessGroupMonitoringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProcessGroupMonitoringInput)(nil)).Elem(), &ProcessGroupMonitoring{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcessGroupMonitoringArrayInput)(nil)).Elem(), ProcessGroupMonitoringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcessGroupMonitoringMapInput)(nil)).Elem(), ProcessGroupMonitoringMap{})
	pulumi.RegisterOutputType(ProcessGroupMonitoringOutput{})
	pulumi.RegisterOutputType(ProcessGroupMonitoringArrayOutput{})
	pulumi.RegisterOutputType(ProcessGroupMonitoringMapOutput{})
}
