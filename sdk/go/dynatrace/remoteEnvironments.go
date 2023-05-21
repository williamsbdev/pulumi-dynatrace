// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type RemoteEnvironments struct {
	pulumi.CustomResourceState

	// Name
	Name pulumi.StringOutput `pulumi:"name"`
	// Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
	NetworkScope pulumi.StringOutput `pulumi:"networkScope"`
	// Provide a valid token created on the remote environment.
	Token pulumi.StringOutput `pulumi:"token"`
	// Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
	Uri pulumi.StringOutput `pulumi:"uri"`
}

// NewRemoteEnvironments registers a new resource with the given unique name, arguments, and options.
func NewRemoteEnvironments(ctx *pulumi.Context,
	name string, args *RemoteEnvironmentsArgs, opts ...pulumi.ResourceOption) (*RemoteEnvironments, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkScope == nil {
		return nil, errors.New("invalid value for required argument 'NetworkScope'")
	}
	if args.Token == nil {
		return nil, errors.New("invalid value for required argument 'Token'")
	}
	if args.Uri == nil {
		return nil, errors.New("invalid value for required argument 'Uri'")
	}
	if args.Token != nil {
		args.Token = pulumi.ToSecret(args.Token).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"token",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource RemoteEnvironments
	err := ctx.RegisterResource("dynatrace:index/remoteEnvironments:RemoteEnvironments", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRemoteEnvironments gets an existing RemoteEnvironments resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRemoteEnvironments(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RemoteEnvironmentsState, opts ...pulumi.ResourceOption) (*RemoteEnvironments, error) {
	var resource RemoteEnvironments
	err := ctx.ReadResource("dynatrace:index/remoteEnvironments:RemoteEnvironments", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RemoteEnvironments resources.
type remoteEnvironmentsState struct {
	// Name
	Name *string `pulumi:"name"`
	// Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
	NetworkScope *string `pulumi:"networkScope"`
	// Provide a valid token created on the remote environment.
	Token *string `pulumi:"token"`
	// Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
	Uri *string `pulumi:"uri"`
}

type RemoteEnvironmentsState struct {
	// Name
	Name pulumi.StringPtrInput
	// Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
	NetworkScope pulumi.StringPtrInput
	// Provide a valid token created on the remote environment.
	Token pulumi.StringPtrInput
	// Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
	Uri pulumi.StringPtrInput
}

func (RemoteEnvironmentsState) ElementType() reflect.Type {
	return reflect.TypeOf((*remoteEnvironmentsState)(nil)).Elem()
}

type remoteEnvironmentsArgs struct {
	// Name
	Name *string `pulumi:"name"`
	// Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
	NetworkScope string `pulumi:"networkScope"`
	// Provide a valid token created on the remote environment.
	Token string `pulumi:"token"`
	// Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
	Uri string `pulumi:"uri"`
}

// The set of arguments for constructing a RemoteEnvironments resource.
type RemoteEnvironmentsArgs struct {
	// Name
	Name pulumi.StringPtrInput
	// Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
	NetworkScope pulumi.StringInput
	// Provide a valid token created on the remote environment.
	Token pulumi.StringInput
	// Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
	Uri pulumi.StringInput
}

func (RemoteEnvironmentsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*remoteEnvironmentsArgs)(nil)).Elem()
}

type RemoteEnvironmentsInput interface {
	pulumi.Input

	ToRemoteEnvironmentsOutput() RemoteEnvironmentsOutput
	ToRemoteEnvironmentsOutputWithContext(ctx context.Context) RemoteEnvironmentsOutput
}

func (*RemoteEnvironments) ElementType() reflect.Type {
	return reflect.TypeOf((**RemoteEnvironments)(nil)).Elem()
}

func (i *RemoteEnvironments) ToRemoteEnvironmentsOutput() RemoteEnvironmentsOutput {
	return i.ToRemoteEnvironmentsOutputWithContext(context.Background())
}

func (i *RemoteEnvironments) ToRemoteEnvironmentsOutputWithContext(ctx context.Context) RemoteEnvironmentsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RemoteEnvironmentsOutput)
}

// RemoteEnvironmentsArrayInput is an input type that accepts RemoteEnvironmentsArray and RemoteEnvironmentsArrayOutput values.
// You can construct a concrete instance of `RemoteEnvironmentsArrayInput` via:
//
//	RemoteEnvironmentsArray{ RemoteEnvironmentsArgs{...} }
type RemoteEnvironmentsArrayInput interface {
	pulumi.Input

	ToRemoteEnvironmentsArrayOutput() RemoteEnvironmentsArrayOutput
	ToRemoteEnvironmentsArrayOutputWithContext(context.Context) RemoteEnvironmentsArrayOutput
}

type RemoteEnvironmentsArray []RemoteEnvironmentsInput

func (RemoteEnvironmentsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RemoteEnvironments)(nil)).Elem()
}

func (i RemoteEnvironmentsArray) ToRemoteEnvironmentsArrayOutput() RemoteEnvironmentsArrayOutput {
	return i.ToRemoteEnvironmentsArrayOutputWithContext(context.Background())
}

func (i RemoteEnvironmentsArray) ToRemoteEnvironmentsArrayOutputWithContext(ctx context.Context) RemoteEnvironmentsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RemoteEnvironmentsArrayOutput)
}

// RemoteEnvironmentsMapInput is an input type that accepts RemoteEnvironmentsMap and RemoteEnvironmentsMapOutput values.
// You can construct a concrete instance of `RemoteEnvironmentsMapInput` via:
//
//	RemoteEnvironmentsMap{ "key": RemoteEnvironmentsArgs{...} }
type RemoteEnvironmentsMapInput interface {
	pulumi.Input

	ToRemoteEnvironmentsMapOutput() RemoteEnvironmentsMapOutput
	ToRemoteEnvironmentsMapOutputWithContext(context.Context) RemoteEnvironmentsMapOutput
}

type RemoteEnvironmentsMap map[string]RemoteEnvironmentsInput

func (RemoteEnvironmentsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RemoteEnvironments)(nil)).Elem()
}

func (i RemoteEnvironmentsMap) ToRemoteEnvironmentsMapOutput() RemoteEnvironmentsMapOutput {
	return i.ToRemoteEnvironmentsMapOutputWithContext(context.Background())
}

func (i RemoteEnvironmentsMap) ToRemoteEnvironmentsMapOutputWithContext(ctx context.Context) RemoteEnvironmentsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RemoteEnvironmentsMapOutput)
}

type RemoteEnvironmentsOutput struct{ *pulumi.OutputState }

func (RemoteEnvironmentsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RemoteEnvironments)(nil)).Elem()
}

func (o RemoteEnvironmentsOutput) ToRemoteEnvironmentsOutput() RemoteEnvironmentsOutput {
	return o
}

func (o RemoteEnvironmentsOutput) ToRemoteEnvironmentsOutputWithContext(ctx context.Context) RemoteEnvironmentsOutput {
	return o
}

// Name
func (o RemoteEnvironmentsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RemoteEnvironments) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Possible Values: `CLUSTER`, `EXTERNAL`, `INTERNAL`
func (o RemoteEnvironmentsOutput) NetworkScope() pulumi.StringOutput {
	return o.ApplyT(func(v *RemoteEnvironments) pulumi.StringOutput { return v.NetworkScope }).(pulumi.StringOutput)
}

// Provide a valid token created on the remote environment.
func (o RemoteEnvironmentsOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v *RemoteEnvironments) pulumi.StringOutput { return v.Token }).(pulumi.StringOutput)
}

// Specify the full URI to the remote environment. Your local environment will have to be able to connect this URI on a network level.
func (o RemoteEnvironmentsOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *RemoteEnvironments) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

type RemoteEnvironmentsArrayOutput struct{ *pulumi.OutputState }

func (RemoteEnvironmentsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RemoteEnvironments)(nil)).Elem()
}

func (o RemoteEnvironmentsArrayOutput) ToRemoteEnvironmentsArrayOutput() RemoteEnvironmentsArrayOutput {
	return o
}

func (o RemoteEnvironmentsArrayOutput) ToRemoteEnvironmentsArrayOutputWithContext(ctx context.Context) RemoteEnvironmentsArrayOutput {
	return o
}

func (o RemoteEnvironmentsArrayOutput) Index(i pulumi.IntInput) RemoteEnvironmentsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RemoteEnvironments {
		return vs[0].([]*RemoteEnvironments)[vs[1].(int)]
	}).(RemoteEnvironmentsOutput)
}

type RemoteEnvironmentsMapOutput struct{ *pulumi.OutputState }

func (RemoteEnvironmentsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RemoteEnvironments)(nil)).Elem()
}

func (o RemoteEnvironmentsMapOutput) ToRemoteEnvironmentsMapOutput() RemoteEnvironmentsMapOutput {
	return o
}

func (o RemoteEnvironmentsMapOutput) ToRemoteEnvironmentsMapOutputWithContext(ctx context.Context) RemoteEnvironmentsMapOutput {
	return o
}

func (o RemoteEnvironmentsMapOutput) MapIndex(k pulumi.StringInput) RemoteEnvironmentsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RemoteEnvironments {
		return vs[0].(map[string]*RemoteEnvironments)[vs[1].(string)]
	}).(RemoteEnvironmentsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RemoteEnvironmentsInput)(nil)).Elem(), &RemoteEnvironments{})
	pulumi.RegisterInputType(reflect.TypeOf((*RemoteEnvironmentsArrayInput)(nil)).Elem(), RemoteEnvironmentsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RemoteEnvironmentsMapInput)(nil)).Elem(), RemoteEnvironmentsMap{})
	pulumi.RegisterOutputType(RemoteEnvironmentsOutput{})
	pulumi.RegisterOutputType(RemoteEnvironmentsArrayOutput{})
	pulumi.RegisterOutputType(RemoteEnvironmentsMapOutput{})
}
