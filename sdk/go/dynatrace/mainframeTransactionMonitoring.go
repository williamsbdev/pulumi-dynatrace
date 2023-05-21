// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type MainframeTransactionMonitoring struct {
	pulumi.CustomResourceState

	// If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
	GroupCicsRegions pulumi.BoolOutput `pulumi:"groupCicsRegions"`
	// If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
	GroupImsRegions pulumi.BoolOutput `pulumi:"groupImsRegions"`
	// If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
	MonitorAllCtgProtocols pulumi.BoolOutput `pulumi:"monitorAllCtgProtocols"`
	// Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
	MonitorAllIncomingWebRequests pulumi.BoolOutput `pulumi:"monitorAllIncomingWebRequests"`
	// We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
	NodeLimit pulumi.IntOutput `pulumi:"nodeLimit"`
	// If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
	ZosCicsServiceDetectionUsesTransactionId pulumi.BoolOutput `pulumi:"zosCicsServiceDetectionUsesTransactionId"`
	// If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
	ZosImsServiceDetectionUsesTransactionId pulumi.BoolOutput `pulumi:"zosImsServiceDetectionUsesTransactionId"`
}

// NewMainframeTransactionMonitoring registers a new resource with the given unique name, arguments, and options.
func NewMainframeTransactionMonitoring(ctx *pulumi.Context,
	name string, args *MainframeTransactionMonitoringArgs, opts ...pulumi.ResourceOption) (*MainframeTransactionMonitoring, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupCicsRegions == nil {
		return nil, errors.New("invalid value for required argument 'GroupCicsRegions'")
	}
	if args.GroupImsRegions == nil {
		return nil, errors.New("invalid value for required argument 'GroupImsRegions'")
	}
	if args.MonitorAllCtgProtocols == nil {
		return nil, errors.New("invalid value for required argument 'MonitorAllCtgProtocols'")
	}
	if args.MonitorAllIncomingWebRequests == nil {
		return nil, errors.New("invalid value for required argument 'MonitorAllIncomingWebRequests'")
	}
	if args.NodeLimit == nil {
		return nil, errors.New("invalid value for required argument 'NodeLimit'")
	}
	if args.ZosCicsServiceDetectionUsesTransactionId == nil {
		return nil, errors.New("invalid value for required argument 'ZosCicsServiceDetectionUsesTransactionId'")
	}
	if args.ZosImsServiceDetectionUsesTransactionId == nil {
		return nil, errors.New("invalid value for required argument 'ZosImsServiceDetectionUsesTransactionId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource MainframeTransactionMonitoring
	err := ctx.RegisterResource("dynatrace:index/mainframeTransactionMonitoring:MainframeTransactionMonitoring", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMainframeTransactionMonitoring gets an existing MainframeTransactionMonitoring resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMainframeTransactionMonitoring(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MainframeTransactionMonitoringState, opts ...pulumi.ResourceOption) (*MainframeTransactionMonitoring, error) {
	var resource MainframeTransactionMonitoring
	err := ctx.ReadResource("dynatrace:index/mainframeTransactionMonitoring:MainframeTransactionMonitoring", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MainframeTransactionMonitoring resources.
type mainframeTransactionMonitoringState struct {
	// If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
	GroupCicsRegions *bool `pulumi:"groupCicsRegions"`
	// If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
	GroupImsRegions *bool `pulumi:"groupImsRegions"`
	// If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
	MonitorAllCtgProtocols *bool `pulumi:"monitorAllCtgProtocols"`
	// Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
	MonitorAllIncomingWebRequests *bool `pulumi:"monitorAllIncomingWebRequests"`
	// We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
	NodeLimit *int `pulumi:"nodeLimit"`
	// If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
	ZosCicsServiceDetectionUsesTransactionId *bool `pulumi:"zosCicsServiceDetectionUsesTransactionId"`
	// If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
	ZosImsServiceDetectionUsesTransactionId *bool `pulumi:"zosImsServiceDetectionUsesTransactionId"`
}

type MainframeTransactionMonitoringState struct {
	// If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
	GroupCicsRegions pulumi.BoolPtrInput
	// If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
	GroupImsRegions pulumi.BoolPtrInput
	// If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
	MonitorAllCtgProtocols pulumi.BoolPtrInput
	// Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
	MonitorAllIncomingWebRequests pulumi.BoolPtrInput
	// We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
	NodeLimit pulumi.IntPtrInput
	// If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
	ZosCicsServiceDetectionUsesTransactionId pulumi.BoolPtrInput
	// If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
	ZosImsServiceDetectionUsesTransactionId pulumi.BoolPtrInput
}

func (MainframeTransactionMonitoringState) ElementType() reflect.Type {
	return reflect.TypeOf((*mainframeTransactionMonitoringState)(nil)).Elem()
}

type mainframeTransactionMonitoringArgs struct {
	// If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
	GroupCicsRegions bool `pulumi:"groupCicsRegions"`
	// If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
	GroupImsRegions bool `pulumi:"groupImsRegions"`
	// If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
	MonitorAllCtgProtocols bool `pulumi:"monitorAllCtgProtocols"`
	// Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
	MonitorAllIncomingWebRequests bool `pulumi:"monitorAllIncomingWebRequests"`
	// We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
	NodeLimit int `pulumi:"nodeLimit"`
	// If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
	ZosCicsServiceDetectionUsesTransactionId bool `pulumi:"zosCicsServiceDetectionUsesTransactionId"`
	// If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
	ZosImsServiceDetectionUsesTransactionId bool `pulumi:"zosImsServiceDetectionUsesTransactionId"`
}

// The set of arguments for constructing a MainframeTransactionMonitoring resource.
type MainframeTransactionMonitoringArgs struct {
	// If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
	GroupCicsRegions pulumi.BoolInput
	// If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
	GroupImsRegions pulumi.BoolInput
	// If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
	MonitorAllCtgProtocols pulumi.BoolInput
	// Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
	MonitorAllIncomingWebRequests pulumi.BoolInput
	// We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
	NodeLimit pulumi.IntInput
	// If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
	ZosCicsServiceDetectionUsesTransactionId pulumi.BoolInput
	// If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
	ZosImsServiceDetectionUsesTransactionId pulumi.BoolInput
}

func (MainframeTransactionMonitoringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mainframeTransactionMonitoringArgs)(nil)).Elem()
}

type MainframeTransactionMonitoringInput interface {
	pulumi.Input

	ToMainframeTransactionMonitoringOutput() MainframeTransactionMonitoringOutput
	ToMainframeTransactionMonitoringOutputWithContext(ctx context.Context) MainframeTransactionMonitoringOutput
}

func (*MainframeTransactionMonitoring) ElementType() reflect.Type {
	return reflect.TypeOf((**MainframeTransactionMonitoring)(nil)).Elem()
}

func (i *MainframeTransactionMonitoring) ToMainframeTransactionMonitoringOutput() MainframeTransactionMonitoringOutput {
	return i.ToMainframeTransactionMonitoringOutputWithContext(context.Background())
}

func (i *MainframeTransactionMonitoring) ToMainframeTransactionMonitoringOutputWithContext(ctx context.Context) MainframeTransactionMonitoringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MainframeTransactionMonitoringOutput)
}

// MainframeTransactionMonitoringArrayInput is an input type that accepts MainframeTransactionMonitoringArray and MainframeTransactionMonitoringArrayOutput values.
// You can construct a concrete instance of `MainframeTransactionMonitoringArrayInput` via:
//
//	MainframeTransactionMonitoringArray{ MainframeTransactionMonitoringArgs{...} }
type MainframeTransactionMonitoringArrayInput interface {
	pulumi.Input

	ToMainframeTransactionMonitoringArrayOutput() MainframeTransactionMonitoringArrayOutput
	ToMainframeTransactionMonitoringArrayOutputWithContext(context.Context) MainframeTransactionMonitoringArrayOutput
}

type MainframeTransactionMonitoringArray []MainframeTransactionMonitoringInput

func (MainframeTransactionMonitoringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MainframeTransactionMonitoring)(nil)).Elem()
}

func (i MainframeTransactionMonitoringArray) ToMainframeTransactionMonitoringArrayOutput() MainframeTransactionMonitoringArrayOutput {
	return i.ToMainframeTransactionMonitoringArrayOutputWithContext(context.Background())
}

func (i MainframeTransactionMonitoringArray) ToMainframeTransactionMonitoringArrayOutputWithContext(ctx context.Context) MainframeTransactionMonitoringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MainframeTransactionMonitoringArrayOutput)
}

// MainframeTransactionMonitoringMapInput is an input type that accepts MainframeTransactionMonitoringMap and MainframeTransactionMonitoringMapOutput values.
// You can construct a concrete instance of `MainframeTransactionMonitoringMapInput` via:
//
//	MainframeTransactionMonitoringMap{ "key": MainframeTransactionMonitoringArgs{...} }
type MainframeTransactionMonitoringMapInput interface {
	pulumi.Input

	ToMainframeTransactionMonitoringMapOutput() MainframeTransactionMonitoringMapOutput
	ToMainframeTransactionMonitoringMapOutputWithContext(context.Context) MainframeTransactionMonitoringMapOutput
}

type MainframeTransactionMonitoringMap map[string]MainframeTransactionMonitoringInput

func (MainframeTransactionMonitoringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MainframeTransactionMonitoring)(nil)).Elem()
}

func (i MainframeTransactionMonitoringMap) ToMainframeTransactionMonitoringMapOutput() MainframeTransactionMonitoringMapOutput {
	return i.ToMainframeTransactionMonitoringMapOutputWithContext(context.Background())
}

func (i MainframeTransactionMonitoringMap) ToMainframeTransactionMonitoringMapOutputWithContext(ctx context.Context) MainframeTransactionMonitoringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MainframeTransactionMonitoringMapOutput)
}

type MainframeTransactionMonitoringOutput struct{ *pulumi.OutputState }

func (MainframeTransactionMonitoringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MainframeTransactionMonitoring)(nil)).Elem()
}

func (o MainframeTransactionMonitoringOutput) ToMainframeTransactionMonitoringOutput() MainframeTransactionMonitoringOutput {
	return o
}

func (o MainframeTransactionMonitoringOutput) ToMainframeTransactionMonitoringOutputWithContext(ctx context.Context) MainframeTransactionMonitoringOutput {
	return o
}

// If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
func (o MainframeTransactionMonitoringOutput) GroupCicsRegions() pulumi.BoolOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.BoolOutput { return v.GroupCicsRegions }).(pulumi.BoolOutput)
}

// If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
func (o MainframeTransactionMonitoringOutput) GroupImsRegions() pulumi.BoolOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.BoolOutput { return v.GroupImsRegions }).(pulumi.BoolOutput)
}

// If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
func (o MainframeTransactionMonitoringOutput) MonitorAllCtgProtocols() pulumi.BoolOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.BoolOutput { return v.MonitorAllCtgProtocols }).(pulumi.BoolOutput)
}

// Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
func (o MainframeTransactionMonitoringOutput) MonitorAllIncomingWebRequests() pulumi.BoolOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.BoolOutput { return v.MonitorAllIncomingWebRequests }).(pulumi.BoolOutput)
}

// We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
func (o MainframeTransactionMonitoringOutput) NodeLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.IntOutput { return v.NodeLimit }).(pulumi.IntOutput)
}

// If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
func (o MainframeTransactionMonitoringOutput) ZosCicsServiceDetectionUsesTransactionId() pulumi.BoolOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.BoolOutput {
		return v.ZosCicsServiceDetectionUsesTransactionId
	}).(pulumi.BoolOutput)
}

// If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
func (o MainframeTransactionMonitoringOutput) ZosImsServiceDetectionUsesTransactionId() pulumi.BoolOutput {
	return o.ApplyT(func(v *MainframeTransactionMonitoring) pulumi.BoolOutput {
		return v.ZosImsServiceDetectionUsesTransactionId
	}).(pulumi.BoolOutput)
}

type MainframeTransactionMonitoringArrayOutput struct{ *pulumi.OutputState }

func (MainframeTransactionMonitoringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MainframeTransactionMonitoring)(nil)).Elem()
}

func (o MainframeTransactionMonitoringArrayOutput) ToMainframeTransactionMonitoringArrayOutput() MainframeTransactionMonitoringArrayOutput {
	return o
}

func (o MainframeTransactionMonitoringArrayOutput) ToMainframeTransactionMonitoringArrayOutputWithContext(ctx context.Context) MainframeTransactionMonitoringArrayOutput {
	return o
}

func (o MainframeTransactionMonitoringArrayOutput) Index(i pulumi.IntInput) MainframeTransactionMonitoringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MainframeTransactionMonitoring {
		return vs[0].([]*MainframeTransactionMonitoring)[vs[1].(int)]
	}).(MainframeTransactionMonitoringOutput)
}

type MainframeTransactionMonitoringMapOutput struct{ *pulumi.OutputState }

func (MainframeTransactionMonitoringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MainframeTransactionMonitoring)(nil)).Elem()
}

func (o MainframeTransactionMonitoringMapOutput) ToMainframeTransactionMonitoringMapOutput() MainframeTransactionMonitoringMapOutput {
	return o
}

func (o MainframeTransactionMonitoringMapOutput) ToMainframeTransactionMonitoringMapOutputWithContext(ctx context.Context) MainframeTransactionMonitoringMapOutput {
	return o
}

func (o MainframeTransactionMonitoringMapOutput) MapIndex(k pulumi.StringInput) MainframeTransactionMonitoringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MainframeTransactionMonitoring {
		return vs[0].(map[string]*MainframeTransactionMonitoring)[vs[1].(string)]
	}).(MainframeTransactionMonitoringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MainframeTransactionMonitoringInput)(nil)).Elem(), &MainframeTransactionMonitoring{})
	pulumi.RegisterInputType(reflect.TypeOf((*MainframeTransactionMonitoringArrayInput)(nil)).Elem(), MainframeTransactionMonitoringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MainframeTransactionMonitoringMapInput)(nil)).Elem(), MainframeTransactionMonitoringMap{})
	pulumi.RegisterOutputType(MainframeTransactionMonitoringOutput{})
	pulumi.RegisterOutputType(MainframeTransactionMonitoringArrayOutput{})
	pulumi.RegisterOutputType(MainframeTransactionMonitoringMapOutput{})
}
