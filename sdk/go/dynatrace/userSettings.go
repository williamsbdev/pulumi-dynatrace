// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type UserSettings struct {
	pulumi.CustomResourceState

	// Possible Values: `Auto`, `En`, `Ja`
	Language pulumi.StringOutput `pulumi:"language"`
	// Region
	Region pulumi.StringOutput `pulumi:"region"`
	// The scope of this setting (user, userdefaults)
	Scope pulumi.StringOutput `pulumi:"scope"`
	// Possible Values: `Auto`, `Dark`, `Light`
	Theme pulumi.StringOutput `pulumi:"theme"`
	// Timezone
	Timezone pulumi.StringOutput `pulumi:"timezone"`
}

// NewUserSettings registers a new resource with the given unique name, arguments, and options.
func NewUserSettings(ctx *pulumi.Context,
	name string, args *UserSettingsArgs, opts ...pulumi.ResourceOption) (*UserSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Language == nil {
		return nil, errors.New("invalid value for required argument 'Language'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.Theme == nil {
		return nil, errors.New("invalid value for required argument 'Theme'")
	}
	if args.Timezone == nil {
		return nil, errors.New("invalid value for required argument 'Timezone'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource UserSettings
	err := ctx.RegisterResource("dynatrace:index/userSettings:UserSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserSettings gets an existing UserSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserSettingsState, opts ...pulumi.ResourceOption) (*UserSettings, error) {
	var resource UserSettings
	err := ctx.ReadResource("dynatrace:index/userSettings:UserSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserSettings resources.
type userSettingsState struct {
	// Possible Values: `Auto`, `En`, `Ja`
	Language *string `pulumi:"language"`
	// Region
	Region *string `pulumi:"region"`
	// The scope of this setting (user, userdefaults)
	Scope *string `pulumi:"scope"`
	// Possible Values: `Auto`, `Dark`, `Light`
	Theme *string `pulumi:"theme"`
	// Timezone
	Timezone *string `pulumi:"timezone"`
}

type UserSettingsState struct {
	// Possible Values: `Auto`, `En`, `Ja`
	Language pulumi.StringPtrInput
	// Region
	Region pulumi.StringPtrInput
	// The scope of this setting (user, userdefaults)
	Scope pulumi.StringPtrInput
	// Possible Values: `Auto`, `Dark`, `Light`
	Theme pulumi.StringPtrInput
	// Timezone
	Timezone pulumi.StringPtrInput
}

func (UserSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*userSettingsState)(nil)).Elem()
}

type userSettingsArgs struct {
	// Possible Values: `Auto`, `En`, `Ja`
	Language string `pulumi:"language"`
	// Region
	Region string `pulumi:"region"`
	// The scope of this setting (user, userdefaults)
	Scope string `pulumi:"scope"`
	// Possible Values: `Auto`, `Dark`, `Light`
	Theme string `pulumi:"theme"`
	// Timezone
	Timezone string `pulumi:"timezone"`
}

// The set of arguments for constructing a UserSettings resource.
type UserSettingsArgs struct {
	// Possible Values: `Auto`, `En`, `Ja`
	Language pulumi.StringInput
	// Region
	Region pulumi.StringInput
	// The scope of this setting (user, userdefaults)
	Scope pulumi.StringInput
	// Possible Values: `Auto`, `Dark`, `Light`
	Theme pulumi.StringInput
	// Timezone
	Timezone pulumi.StringInput
}

func (UserSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userSettingsArgs)(nil)).Elem()
}

type UserSettingsInput interface {
	pulumi.Input

	ToUserSettingsOutput() UserSettingsOutput
	ToUserSettingsOutputWithContext(ctx context.Context) UserSettingsOutput
}

func (*UserSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**UserSettings)(nil)).Elem()
}

func (i *UserSettings) ToUserSettingsOutput() UserSettingsOutput {
	return i.ToUserSettingsOutputWithContext(context.Background())
}

func (i *UserSettings) ToUserSettingsOutputWithContext(ctx context.Context) UserSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserSettingsOutput)
}

// UserSettingsArrayInput is an input type that accepts UserSettingsArray and UserSettingsArrayOutput values.
// You can construct a concrete instance of `UserSettingsArrayInput` via:
//
//	UserSettingsArray{ UserSettingsArgs{...} }
type UserSettingsArrayInput interface {
	pulumi.Input

	ToUserSettingsArrayOutput() UserSettingsArrayOutput
	ToUserSettingsArrayOutputWithContext(context.Context) UserSettingsArrayOutput
}

type UserSettingsArray []UserSettingsInput

func (UserSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserSettings)(nil)).Elem()
}

func (i UserSettingsArray) ToUserSettingsArrayOutput() UserSettingsArrayOutput {
	return i.ToUserSettingsArrayOutputWithContext(context.Background())
}

func (i UserSettingsArray) ToUserSettingsArrayOutputWithContext(ctx context.Context) UserSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserSettingsArrayOutput)
}

// UserSettingsMapInput is an input type that accepts UserSettingsMap and UserSettingsMapOutput values.
// You can construct a concrete instance of `UserSettingsMapInput` via:
//
//	UserSettingsMap{ "key": UserSettingsArgs{...} }
type UserSettingsMapInput interface {
	pulumi.Input

	ToUserSettingsMapOutput() UserSettingsMapOutput
	ToUserSettingsMapOutputWithContext(context.Context) UserSettingsMapOutput
}

type UserSettingsMap map[string]UserSettingsInput

func (UserSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserSettings)(nil)).Elem()
}

func (i UserSettingsMap) ToUserSettingsMapOutput() UserSettingsMapOutput {
	return i.ToUserSettingsMapOutputWithContext(context.Background())
}

func (i UserSettingsMap) ToUserSettingsMapOutputWithContext(ctx context.Context) UserSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserSettingsMapOutput)
}

type UserSettingsOutput struct{ *pulumi.OutputState }

func (UserSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserSettings)(nil)).Elem()
}

func (o UserSettingsOutput) ToUserSettingsOutput() UserSettingsOutput {
	return o
}

func (o UserSettingsOutput) ToUserSettingsOutputWithContext(ctx context.Context) UserSettingsOutput {
	return o
}

// Possible Values: `Auto`, `En`, `Ja`
func (o UserSettingsOutput) Language() pulumi.StringOutput {
	return o.ApplyT(func(v *UserSettings) pulumi.StringOutput { return v.Language }).(pulumi.StringOutput)
}

// Region
func (o UserSettingsOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *UserSettings) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The scope of this setting (user, userdefaults)
func (o UserSettingsOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *UserSettings) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// Possible Values: `Auto`, `Dark`, `Light`
func (o UserSettingsOutput) Theme() pulumi.StringOutput {
	return o.ApplyT(func(v *UserSettings) pulumi.StringOutput { return v.Theme }).(pulumi.StringOutput)
}

// Timezone
func (o UserSettingsOutput) Timezone() pulumi.StringOutput {
	return o.ApplyT(func(v *UserSettings) pulumi.StringOutput { return v.Timezone }).(pulumi.StringOutput)
}

type UserSettingsArrayOutput struct{ *pulumi.OutputState }

func (UserSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserSettings)(nil)).Elem()
}

func (o UserSettingsArrayOutput) ToUserSettingsArrayOutput() UserSettingsArrayOutput {
	return o
}

func (o UserSettingsArrayOutput) ToUserSettingsArrayOutputWithContext(ctx context.Context) UserSettingsArrayOutput {
	return o
}

func (o UserSettingsArrayOutput) Index(i pulumi.IntInput) UserSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserSettings {
		return vs[0].([]*UserSettings)[vs[1].(int)]
	}).(UserSettingsOutput)
}

type UserSettingsMapOutput struct{ *pulumi.OutputState }

func (UserSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserSettings)(nil)).Elem()
}

func (o UserSettingsMapOutput) ToUserSettingsMapOutput() UserSettingsMapOutput {
	return o
}

func (o UserSettingsMapOutput) ToUserSettingsMapOutputWithContext(ctx context.Context) UserSettingsMapOutput {
	return o
}

func (o UserSettingsMapOutput) MapIndex(k pulumi.StringInput) UserSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserSettings {
		return vs[0].(map[string]*UserSettings)[vs[1].(string)]
	}).(UserSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserSettingsInput)(nil)).Elem(), &UserSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserSettingsArrayInput)(nil)).Elem(), UserSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserSettingsMapInput)(nil)).Elem(), UserSettingsMap{})
	pulumi.RegisterOutputType(UserSettingsOutput{})
	pulumi.RegisterOutputType(UserSettingsArrayOutput{})
	pulumi.RegisterOutputType(UserSettingsMapOutput{})
}
