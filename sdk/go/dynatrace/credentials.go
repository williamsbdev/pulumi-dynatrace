// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Credentials struct {
	pulumi.CustomResourceState

	// The certificate in the string format.
	Certificate pulumi.StringPtrOutput `pulumi:"certificate"`
	// The list contains summary data related to the use of credentials
	//
	// Deprecated: `credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data
	CredentialUsageSummaries CredentialsCredentialUsageSummaryArrayOutput `pulumi:"credentialUsageSummaries"`
	// A short description of the credentials set
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// External Vault Configuration
	External CredentialsExternalPtrOutput `pulumi:"external"`
	// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
	Format pulumi.StringPtrOutput `pulumi:"format"`
	// The name of the credentials set
	Name pulumi.StringOutput `pulumi:"name"`
	// The credentials set is available to every user (`false`) or to owner only (`true`)
	OwnerAccessOnly pulumi.BoolPtrOutput `pulumi:"ownerAccessOnly"`
	// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
	// you want to set an empty password, use the value `--empty--`.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
	Public pulumi.BoolPtrOutput `pulumi:"public"`
	// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
	Scope pulumi.StringOutput `pulumi:"scope"`
	// Token in the string format. Specifying a token implies `Token Authentication`.
	Token pulumi.StringPtrOutput `pulumi:"token"`
	// The username of the credentials set.
	Username pulumi.StringPtrOutput `pulumi:"username"`
}

// NewCredentials registers a new resource with the given unique name, arguments, and options.
func NewCredentials(ctx *pulumi.Context,
	name string, args *CredentialsArgs, opts ...pulumi.ResourceOption) (*Credentials, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	if args.Token != nil {
		args.Token = pulumi.ToSecret(args.Token).(pulumi.StringPtrInput)
	}
	if args.Username != nil {
		args.Username = pulumi.ToSecret(args.Username).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
		"token",
		"username",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource Credentials
	err := ctx.RegisterResource("dynatrace:index/credentials:Credentials", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCredentials gets an existing Credentials resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCredentials(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CredentialsState, opts ...pulumi.ResourceOption) (*Credentials, error) {
	var resource Credentials
	err := ctx.ReadResource("dynatrace:index/credentials:Credentials", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Credentials resources.
type credentialsState struct {
	// The certificate in the string format.
	Certificate *string `pulumi:"certificate"`
	// The list contains summary data related to the use of credentials
	//
	// Deprecated: `credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data
	CredentialUsageSummaries []CredentialsCredentialUsageSummary `pulumi:"credentialUsageSummaries"`
	// A short description of the credentials set
	Description *string `pulumi:"description"`
	// External Vault Configuration
	External *CredentialsExternal `pulumi:"external"`
	// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
	Format *string `pulumi:"format"`
	// The name of the credentials set
	Name *string `pulumi:"name"`
	// The credentials set is available to every user (`false`) or to owner only (`true`)
	OwnerAccessOnly *bool `pulumi:"ownerAccessOnly"`
	// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
	// you want to set an empty password, use the value `--empty--`.
	Password *string `pulumi:"password"`
	// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
	Public *bool `pulumi:"public"`
	// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
	Scope *string `pulumi:"scope"`
	// Token in the string format. Specifying a token implies `Token Authentication`.
	Token *string `pulumi:"token"`
	// The username of the credentials set.
	Username *string `pulumi:"username"`
}

type CredentialsState struct {
	// The certificate in the string format.
	Certificate pulumi.StringPtrInput
	// The list contains summary data related to the use of credentials
	//
	// Deprecated: `credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data
	CredentialUsageSummaries CredentialsCredentialUsageSummaryArrayInput
	// A short description of the credentials set
	Description pulumi.StringPtrInput
	// External Vault Configuration
	External CredentialsExternalPtrInput
	// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
	Format pulumi.StringPtrInput
	// The name of the credentials set
	Name pulumi.StringPtrInput
	// The credentials set is available to every user (`false`) or to owner only (`true`)
	OwnerAccessOnly pulumi.BoolPtrInput
	// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
	// you want to set an empty password, use the value `--empty--`.
	Password pulumi.StringPtrInput
	// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
	Public pulumi.BoolPtrInput
	// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
	Scope pulumi.StringPtrInput
	// Token in the string format. Specifying a token implies `Token Authentication`.
	Token pulumi.StringPtrInput
	// The username of the credentials set.
	Username pulumi.StringPtrInput
}

func (CredentialsState) ElementType() reflect.Type {
	return reflect.TypeOf((*credentialsState)(nil)).Elem()
}

type credentialsArgs struct {
	// The certificate in the string format.
	Certificate *string `pulumi:"certificate"`
	// The list contains summary data related to the use of credentials
	//
	// Deprecated: `credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data
	CredentialUsageSummaries []CredentialsCredentialUsageSummary `pulumi:"credentialUsageSummaries"`
	// A short description of the credentials set
	Description *string `pulumi:"description"`
	// External Vault Configuration
	External *CredentialsExternal `pulumi:"external"`
	// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
	Format *string `pulumi:"format"`
	// The name of the credentials set
	Name *string `pulumi:"name"`
	// The credentials set is available to every user (`false`) or to owner only (`true`)
	OwnerAccessOnly *bool `pulumi:"ownerAccessOnly"`
	// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
	// you want to set an empty password, use the value `--empty--`.
	Password *string `pulumi:"password"`
	// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
	Public *bool `pulumi:"public"`
	// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
	Scope string `pulumi:"scope"`
	// Token in the string format. Specifying a token implies `Token Authentication`.
	Token *string `pulumi:"token"`
	// The username of the credentials set.
	Username *string `pulumi:"username"`
}

// The set of arguments for constructing a Credentials resource.
type CredentialsArgs struct {
	// The certificate in the string format.
	Certificate pulumi.StringPtrInput
	// The list contains summary data related to the use of credentials
	//
	// Deprecated: `credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data
	CredentialUsageSummaries CredentialsCredentialUsageSummaryArrayInput
	// A short description of the credentials set
	Description pulumi.StringPtrInput
	// External Vault Configuration
	External CredentialsExternalPtrInput
	// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
	Format pulumi.StringPtrInput
	// The name of the credentials set
	Name pulumi.StringPtrInput
	// The credentials set is available to every user (`false`) or to owner only (`true`)
	OwnerAccessOnly pulumi.BoolPtrInput
	// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
	// you want to set an empty password, use the value `--empty--`.
	Password pulumi.StringPtrInput
	// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
	Public pulumi.BoolPtrInput
	// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
	Scope pulumi.StringInput
	// Token in the string format. Specifying a token implies `Token Authentication`.
	Token pulumi.StringPtrInput
	// The username of the credentials set.
	Username pulumi.StringPtrInput
}

func (CredentialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*credentialsArgs)(nil)).Elem()
}

type CredentialsInput interface {
	pulumi.Input

	ToCredentialsOutput() CredentialsOutput
	ToCredentialsOutputWithContext(ctx context.Context) CredentialsOutput
}

func (*Credentials) ElementType() reflect.Type {
	return reflect.TypeOf((**Credentials)(nil)).Elem()
}

func (i *Credentials) ToCredentialsOutput() CredentialsOutput {
	return i.ToCredentialsOutputWithContext(context.Background())
}

func (i *Credentials) ToCredentialsOutputWithContext(ctx context.Context) CredentialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialsOutput)
}

// CredentialsArrayInput is an input type that accepts CredentialsArray and CredentialsArrayOutput values.
// You can construct a concrete instance of `CredentialsArrayInput` via:
//
//	CredentialsArray{ CredentialsArgs{...} }
type CredentialsArrayInput interface {
	pulumi.Input

	ToCredentialsArrayOutput() CredentialsArrayOutput
	ToCredentialsArrayOutputWithContext(context.Context) CredentialsArrayOutput
}

type CredentialsArray []CredentialsInput

func (CredentialsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Credentials)(nil)).Elem()
}

func (i CredentialsArray) ToCredentialsArrayOutput() CredentialsArrayOutput {
	return i.ToCredentialsArrayOutputWithContext(context.Background())
}

func (i CredentialsArray) ToCredentialsArrayOutputWithContext(ctx context.Context) CredentialsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialsArrayOutput)
}

// CredentialsMapInput is an input type that accepts CredentialsMap and CredentialsMapOutput values.
// You can construct a concrete instance of `CredentialsMapInput` via:
//
//	CredentialsMap{ "key": CredentialsArgs{...} }
type CredentialsMapInput interface {
	pulumi.Input

	ToCredentialsMapOutput() CredentialsMapOutput
	ToCredentialsMapOutputWithContext(context.Context) CredentialsMapOutput
}

type CredentialsMap map[string]CredentialsInput

func (CredentialsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Credentials)(nil)).Elem()
}

func (i CredentialsMap) ToCredentialsMapOutput() CredentialsMapOutput {
	return i.ToCredentialsMapOutputWithContext(context.Background())
}

func (i CredentialsMap) ToCredentialsMapOutputWithContext(ctx context.Context) CredentialsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialsMapOutput)
}

type CredentialsOutput struct{ *pulumi.OutputState }

func (CredentialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Credentials)(nil)).Elem()
}

func (o CredentialsOutput) ToCredentialsOutput() CredentialsOutput {
	return o
}

func (o CredentialsOutput) ToCredentialsOutputWithContext(ctx context.Context) CredentialsOutput {
	return o
}

// The certificate in the string format.
func (o CredentialsOutput) Certificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringPtrOutput { return v.Certificate }).(pulumi.StringPtrOutput)
}

// The list contains summary data related to the use of credentials
//
// Deprecated: `credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data
func (o CredentialsOutput) CredentialUsageSummaries() CredentialsCredentialUsageSummaryArrayOutput {
	return o.ApplyT(func(v *Credentials) CredentialsCredentialUsageSummaryArrayOutput { return v.CredentialUsageSummaries }).(CredentialsCredentialUsageSummaryArrayOutput)
}

// A short description of the credentials set
func (o CredentialsOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// External Vault Configuration
func (o CredentialsOutput) External() CredentialsExternalPtrOutput {
	return o.ApplyT(func(v *Credentials) CredentialsExternalPtrOutput { return v.External }).(CredentialsExternalPtrOutput)
}

// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
func (o CredentialsOutput) Format() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringPtrOutput { return v.Format }).(pulumi.StringPtrOutput)
}

// The name of the credentials set
func (o CredentialsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The credentials set is available to every user (`false`) or to owner only (`true`)
func (o CredentialsOutput) OwnerAccessOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.BoolPtrOutput { return v.OwnerAccessOnly }).(pulumi.BoolPtrOutput)
}

// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
// you want to set an empty password, use the value `--empty--`.
func (o CredentialsOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
func (o CredentialsOutput) Public() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.BoolPtrOutput { return v.Public }).(pulumi.BoolPtrOutput)
}

// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
func (o CredentialsOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// Token in the string format. Specifying a token implies `Token Authentication`.
func (o CredentialsOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

// The username of the credentials set.
func (o CredentialsOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

type CredentialsArrayOutput struct{ *pulumi.OutputState }

func (CredentialsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Credentials)(nil)).Elem()
}

func (o CredentialsArrayOutput) ToCredentialsArrayOutput() CredentialsArrayOutput {
	return o
}

func (o CredentialsArrayOutput) ToCredentialsArrayOutputWithContext(ctx context.Context) CredentialsArrayOutput {
	return o
}

func (o CredentialsArrayOutput) Index(i pulumi.IntInput) CredentialsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Credentials {
		return vs[0].([]*Credentials)[vs[1].(int)]
	}).(CredentialsOutput)
}

type CredentialsMapOutput struct{ *pulumi.OutputState }

func (CredentialsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Credentials)(nil)).Elem()
}

func (o CredentialsMapOutput) ToCredentialsMapOutput() CredentialsMapOutput {
	return o
}

func (o CredentialsMapOutput) ToCredentialsMapOutputWithContext(ctx context.Context) CredentialsMapOutput {
	return o
}

func (o CredentialsMapOutput) MapIndex(k pulumi.StringInput) CredentialsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Credentials {
		return vs[0].(map[string]*Credentials)[vs[1].(string)]
	}).(CredentialsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialsInput)(nil)).Elem(), &Credentials{})
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialsArrayInput)(nil)).Elem(), CredentialsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialsMapInput)(nil)).Elem(), CredentialsMap{})
	pulumi.RegisterOutputType(CredentialsOutput{})
	pulumi.RegisterOutputType(CredentialsArrayOutput{})
	pulumi.RegisterOutputType(CredentialsMapOutput{})
}
