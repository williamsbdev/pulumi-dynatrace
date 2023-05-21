// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type LogBuckets struct {
	pulumi.CustomResourceState

	// A 'bucket' is the length of time your logs will be stored. Select the bucket that's best for you.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Matcher (DQL)
	Matcher pulumi.StringOutput `pulumi:"matcher"`
	// Rule name
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
}

// NewLogBuckets registers a new resource with the given unique name, arguments, and options.
func NewLogBuckets(ctx *pulumi.Context,
	name string, args *LogBucketsArgs, opts ...pulumi.ResourceOption) (*LogBuckets, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Matcher == nil {
		return nil, errors.New("invalid value for required argument 'Matcher'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource LogBuckets
	err := ctx.RegisterResource("dynatrace:index/logBuckets:LogBuckets", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogBuckets gets an existing LogBuckets resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogBuckets(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogBucketsState, opts ...pulumi.ResourceOption) (*LogBuckets, error) {
	var resource LogBuckets
	err := ctx.ReadResource("dynatrace:index/logBuckets:LogBuckets", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogBuckets resources.
type logBucketsState struct {
	// A 'bucket' is the length of time your logs will be stored. Select the bucket that's best for you.
	BucketName *string `pulumi:"bucketName"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Matcher (DQL)
	Matcher *string `pulumi:"matcher"`
	// Rule name
	RuleName *string `pulumi:"ruleName"`
}

type LogBucketsState struct {
	// A 'bucket' is the length of time your logs will be stored. Select the bucket that's best for you.
	BucketName pulumi.StringPtrInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Matcher (DQL)
	Matcher pulumi.StringPtrInput
	// Rule name
	RuleName pulumi.StringPtrInput
}

func (LogBucketsState) ElementType() reflect.Type {
	return reflect.TypeOf((*logBucketsState)(nil)).Elem()
}

type logBucketsArgs struct {
	// A 'bucket' is the length of time your logs will be stored. Select the bucket that's best for you.
	BucketName string `pulumi:"bucketName"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Matcher (DQL)
	Matcher string `pulumi:"matcher"`
	// Rule name
	RuleName string `pulumi:"ruleName"`
}

// The set of arguments for constructing a LogBuckets resource.
type LogBucketsArgs struct {
	// A 'bucket' is the length of time your logs will be stored. Select the bucket that's best for you.
	BucketName pulumi.StringInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Matcher (DQL)
	Matcher pulumi.StringInput
	// Rule name
	RuleName pulumi.StringInput
}

func (LogBucketsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logBucketsArgs)(nil)).Elem()
}

type LogBucketsInput interface {
	pulumi.Input

	ToLogBucketsOutput() LogBucketsOutput
	ToLogBucketsOutputWithContext(ctx context.Context) LogBucketsOutput
}

func (*LogBuckets) ElementType() reflect.Type {
	return reflect.TypeOf((**LogBuckets)(nil)).Elem()
}

func (i *LogBuckets) ToLogBucketsOutput() LogBucketsOutput {
	return i.ToLogBucketsOutputWithContext(context.Background())
}

func (i *LogBuckets) ToLogBucketsOutputWithContext(ctx context.Context) LogBucketsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogBucketsOutput)
}

// LogBucketsArrayInput is an input type that accepts LogBucketsArray and LogBucketsArrayOutput values.
// You can construct a concrete instance of `LogBucketsArrayInput` via:
//
//	LogBucketsArray{ LogBucketsArgs{...} }
type LogBucketsArrayInput interface {
	pulumi.Input

	ToLogBucketsArrayOutput() LogBucketsArrayOutput
	ToLogBucketsArrayOutputWithContext(context.Context) LogBucketsArrayOutput
}

type LogBucketsArray []LogBucketsInput

func (LogBucketsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogBuckets)(nil)).Elem()
}

func (i LogBucketsArray) ToLogBucketsArrayOutput() LogBucketsArrayOutput {
	return i.ToLogBucketsArrayOutputWithContext(context.Background())
}

func (i LogBucketsArray) ToLogBucketsArrayOutputWithContext(ctx context.Context) LogBucketsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogBucketsArrayOutput)
}

// LogBucketsMapInput is an input type that accepts LogBucketsMap and LogBucketsMapOutput values.
// You can construct a concrete instance of `LogBucketsMapInput` via:
//
//	LogBucketsMap{ "key": LogBucketsArgs{...} }
type LogBucketsMapInput interface {
	pulumi.Input

	ToLogBucketsMapOutput() LogBucketsMapOutput
	ToLogBucketsMapOutputWithContext(context.Context) LogBucketsMapOutput
}

type LogBucketsMap map[string]LogBucketsInput

func (LogBucketsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogBuckets)(nil)).Elem()
}

func (i LogBucketsMap) ToLogBucketsMapOutput() LogBucketsMapOutput {
	return i.ToLogBucketsMapOutputWithContext(context.Background())
}

func (i LogBucketsMap) ToLogBucketsMapOutputWithContext(ctx context.Context) LogBucketsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogBucketsMapOutput)
}

type LogBucketsOutput struct{ *pulumi.OutputState }

func (LogBucketsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogBuckets)(nil)).Elem()
}

func (o LogBucketsOutput) ToLogBucketsOutput() LogBucketsOutput {
	return o
}

func (o LogBucketsOutput) ToLogBucketsOutputWithContext(ctx context.Context) LogBucketsOutput {
	return o
}

// A 'bucket' is the length of time your logs will be stored. Select the bucket that's best for you.
func (o LogBucketsOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *LogBuckets) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// This setting is enabled (`true`) or disabled (`false`)
func (o LogBucketsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *LogBuckets) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Matcher (DQL)
func (o LogBucketsOutput) Matcher() pulumi.StringOutput {
	return o.ApplyT(func(v *LogBuckets) pulumi.StringOutput { return v.Matcher }).(pulumi.StringOutput)
}

// Rule name
func (o LogBucketsOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *LogBuckets) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

type LogBucketsArrayOutput struct{ *pulumi.OutputState }

func (LogBucketsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogBuckets)(nil)).Elem()
}

func (o LogBucketsArrayOutput) ToLogBucketsArrayOutput() LogBucketsArrayOutput {
	return o
}

func (o LogBucketsArrayOutput) ToLogBucketsArrayOutputWithContext(ctx context.Context) LogBucketsArrayOutput {
	return o
}

func (o LogBucketsArrayOutput) Index(i pulumi.IntInput) LogBucketsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogBuckets {
		return vs[0].([]*LogBuckets)[vs[1].(int)]
	}).(LogBucketsOutput)
}

type LogBucketsMapOutput struct{ *pulumi.OutputState }

func (LogBucketsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogBuckets)(nil)).Elem()
}

func (o LogBucketsMapOutput) ToLogBucketsMapOutput() LogBucketsMapOutput {
	return o
}

func (o LogBucketsMapOutput) ToLogBucketsMapOutputWithContext(ctx context.Context) LogBucketsMapOutput {
	return o
}

func (o LogBucketsMapOutput) MapIndex(k pulumi.StringInput) LogBucketsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogBuckets {
		return vs[0].(map[string]*LogBuckets)[vs[1].(string)]
	}).(LogBucketsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogBucketsInput)(nil)).Elem(), &LogBuckets{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogBucketsArrayInput)(nil)).Elem(), LogBucketsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogBucketsMapInput)(nil)).Elem(), LogBucketsMap{})
	pulumi.RegisterOutputType(LogBucketsOutput{})
	pulumi.RegisterOutputType(LogBucketsArrayOutput{})
	pulumi.RegisterOutputType(LogBucketsMapOutput{})
}
