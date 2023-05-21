// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type RumIpDetermination struct {
	pulumi.CustomResourceState

	// Client IP header name
	HeaderName pulumi.StringOutput `pulumi:"headerName"`
}

// NewRumIpDetermination registers a new resource with the given unique name, arguments, and options.
func NewRumIpDetermination(ctx *pulumi.Context,
	name string, args *RumIpDeterminationArgs, opts ...pulumi.ResourceOption) (*RumIpDetermination, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HeaderName == nil {
		return nil, errors.New("invalid value for required argument 'HeaderName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RumIpDetermination
	err := ctx.RegisterResource("dynatrace:index/rumIpDetermination:RumIpDetermination", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRumIpDetermination gets an existing RumIpDetermination resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRumIpDetermination(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RumIpDeterminationState, opts ...pulumi.ResourceOption) (*RumIpDetermination, error) {
	var resource RumIpDetermination
	err := ctx.ReadResource("dynatrace:index/rumIpDetermination:RumIpDetermination", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RumIpDetermination resources.
type rumIpDeterminationState struct {
	// Client IP header name
	HeaderName *string `pulumi:"headerName"`
}

type RumIpDeterminationState struct {
	// Client IP header name
	HeaderName pulumi.StringPtrInput
}

func (RumIpDeterminationState) ElementType() reflect.Type {
	return reflect.TypeOf((*rumIpDeterminationState)(nil)).Elem()
}

type rumIpDeterminationArgs struct {
	// Client IP header name
	HeaderName string `pulumi:"headerName"`
}

// The set of arguments for constructing a RumIpDetermination resource.
type RumIpDeterminationArgs struct {
	// Client IP header name
	HeaderName pulumi.StringInput
}

func (RumIpDeterminationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rumIpDeterminationArgs)(nil)).Elem()
}

type RumIpDeterminationInput interface {
	pulumi.Input

	ToRumIpDeterminationOutput() RumIpDeterminationOutput
	ToRumIpDeterminationOutputWithContext(ctx context.Context) RumIpDeterminationOutput
}

func (*RumIpDetermination) ElementType() reflect.Type {
	return reflect.TypeOf((**RumIpDetermination)(nil)).Elem()
}

func (i *RumIpDetermination) ToRumIpDeterminationOutput() RumIpDeterminationOutput {
	return i.ToRumIpDeterminationOutputWithContext(context.Background())
}

func (i *RumIpDetermination) ToRumIpDeterminationOutputWithContext(ctx context.Context) RumIpDeterminationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RumIpDeterminationOutput)
}

// RumIpDeterminationArrayInput is an input type that accepts RumIpDeterminationArray and RumIpDeterminationArrayOutput values.
// You can construct a concrete instance of `RumIpDeterminationArrayInput` via:
//
//	RumIpDeterminationArray{ RumIpDeterminationArgs{...} }
type RumIpDeterminationArrayInput interface {
	pulumi.Input

	ToRumIpDeterminationArrayOutput() RumIpDeterminationArrayOutput
	ToRumIpDeterminationArrayOutputWithContext(context.Context) RumIpDeterminationArrayOutput
}

type RumIpDeterminationArray []RumIpDeterminationInput

func (RumIpDeterminationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RumIpDetermination)(nil)).Elem()
}

func (i RumIpDeterminationArray) ToRumIpDeterminationArrayOutput() RumIpDeterminationArrayOutput {
	return i.ToRumIpDeterminationArrayOutputWithContext(context.Background())
}

func (i RumIpDeterminationArray) ToRumIpDeterminationArrayOutputWithContext(ctx context.Context) RumIpDeterminationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RumIpDeterminationArrayOutput)
}

// RumIpDeterminationMapInput is an input type that accepts RumIpDeterminationMap and RumIpDeterminationMapOutput values.
// You can construct a concrete instance of `RumIpDeterminationMapInput` via:
//
//	RumIpDeterminationMap{ "key": RumIpDeterminationArgs{...} }
type RumIpDeterminationMapInput interface {
	pulumi.Input

	ToRumIpDeterminationMapOutput() RumIpDeterminationMapOutput
	ToRumIpDeterminationMapOutputWithContext(context.Context) RumIpDeterminationMapOutput
}

type RumIpDeterminationMap map[string]RumIpDeterminationInput

func (RumIpDeterminationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RumIpDetermination)(nil)).Elem()
}

func (i RumIpDeterminationMap) ToRumIpDeterminationMapOutput() RumIpDeterminationMapOutput {
	return i.ToRumIpDeterminationMapOutputWithContext(context.Background())
}

func (i RumIpDeterminationMap) ToRumIpDeterminationMapOutputWithContext(ctx context.Context) RumIpDeterminationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RumIpDeterminationMapOutput)
}

type RumIpDeterminationOutput struct{ *pulumi.OutputState }

func (RumIpDeterminationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RumIpDetermination)(nil)).Elem()
}

func (o RumIpDeterminationOutput) ToRumIpDeterminationOutput() RumIpDeterminationOutput {
	return o
}

func (o RumIpDeterminationOutput) ToRumIpDeterminationOutputWithContext(ctx context.Context) RumIpDeterminationOutput {
	return o
}

// Client IP header name
func (o RumIpDeterminationOutput) HeaderName() pulumi.StringOutput {
	return o.ApplyT(func(v *RumIpDetermination) pulumi.StringOutput { return v.HeaderName }).(pulumi.StringOutput)
}

type RumIpDeterminationArrayOutput struct{ *pulumi.OutputState }

func (RumIpDeterminationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RumIpDetermination)(nil)).Elem()
}

func (o RumIpDeterminationArrayOutput) ToRumIpDeterminationArrayOutput() RumIpDeterminationArrayOutput {
	return o
}

func (o RumIpDeterminationArrayOutput) ToRumIpDeterminationArrayOutputWithContext(ctx context.Context) RumIpDeterminationArrayOutput {
	return o
}

func (o RumIpDeterminationArrayOutput) Index(i pulumi.IntInput) RumIpDeterminationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RumIpDetermination {
		return vs[0].([]*RumIpDetermination)[vs[1].(int)]
	}).(RumIpDeterminationOutput)
}

type RumIpDeterminationMapOutput struct{ *pulumi.OutputState }

func (RumIpDeterminationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RumIpDetermination)(nil)).Elem()
}

func (o RumIpDeterminationMapOutput) ToRumIpDeterminationMapOutput() RumIpDeterminationMapOutput {
	return o
}

func (o RumIpDeterminationMapOutput) ToRumIpDeterminationMapOutputWithContext(ctx context.Context) RumIpDeterminationMapOutput {
	return o
}

func (o RumIpDeterminationMapOutput) MapIndex(k pulumi.StringInput) RumIpDeterminationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RumIpDetermination {
		return vs[0].(map[string]*RumIpDetermination)[vs[1].(string)]
	}).(RumIpDeterminationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RumIpDeterminationInput)(nil)).Elem(), &RumIpDetermination{})
	pulumi.RegisterInputType(reflect.TypeOf((*RumIpDeterminationArrayInput)(nil)).Elem(), RumIpDeterminationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RumIpDeterminationMapInput)(nil)).Elem(), RumIpDeterminationMap{})
	pulumi.RegisterOutputType(RumIpDeterminationOutput{})
	pulumi.RegisterOutputType(RumIpDeterminationArrayOutput{})
	pulumi.RegisterOutputType(RumIpDeterminationMapOutput{})
}
