// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Kubernetes struct {
	pulumi.CustomResourceState

	// ActiveGate Group
	ActiveGateGroup pulumi.StringPtrOutput `pulumi:"activeGateGroup"`
	// Create a bearer token for [Kubernetes](https://dt-url.net/og43szq "Kubernetes") or
	// [OpenShift](https://dt-url.net/7l43xtp "OpenShift").
	AuthToken pulumi.StringPtrOutput `pulumi:"authToken"`
	// Require valid certificates for communication with API server (recommended)
	CertificateCheckEnabled pulumi.BoolPtrOutput `pulumi:"certificateCheckEnabled"`
	// Monitor Kubernetes namespaces, services, workloads, and pods
	CloudApplicationPipelineEnabled pulumi.BoolOutput `pulumi:"cloudApplicationPipelineEnabled"`
	// Unique ID of the cluster, the containerized ActiveGate is deployed to. Defaults to the UUID of the kube-system
	// namespace. The cluster ID of containerized ActiveGates is shown on the Deployment status screen.
	ClusterId pulumi.StringPtrOutput `pulumi:"clusterId"`
	// For more information on local Kubernetes API monitoring, see the [documentation](https://dt-url.net/6q62uep).
	ClusterIdEnabled pulumi.BoolOutput `pulumi:"clusterIdEnabled"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Get the API URL for [Kubernetes](https://dt-url.net/kz23snj "Kubernetes") or [OpenShift](https://dt-url.net/d623xgw "OpenShift").
	EndpointUrl pulumi.StringPtrOutput `pulumi:"endpointUrl"`
	// Define Kubernetes event filters to ingest events into your environment. For more details, see the
	// [documentation](https://dt-url.net/2201p0u).
	EventPatterns KubernetesEventPatternsPtrOutput `pulumi:"eventPatterns"`
	// All events are monitored by default unless event filters are specified.
	EventProcessingActive pulumi.BoolOutput `pulumi:"eventProcessingActive"`
	// Include only events specified by Events Field Selectors
	FilterEvents pulumi.BoolPtrOutput `pulumi:"filterEvents"`
	// Verify hostname in certificate against Kubernetes API URL
	HostnameVerificationEnabled pulumi.BoolPtrOutput `pulumi:"hostnameVerificationEnabled"`
	// For a list of included events, see the [documentation](https://dt-url.net/l61d02no).
	IncludeAllFdiEvents pulumi.BoolPtrOutput `pulumi:"includeAllFdiEvents"`
	// Renaming the cluster breaks configurations that are based on its name (e.g., management zones, and alerting).
	Label pulumi.StringOutput `pulumi:"label"`
	// The workload resource metrics are based on a subset of cAdvisor metrics. Depending on your Kubernetes cluster size, this
	// may increase the CPU/memory resource consumption of your ActiveGate.
	OpenMetricsBuiltinEnabled pulumi.BoolOutput `pulumi:"openMetricsBuiltinEnabled"`
	// For annotation guidance, see the [documentation](https://dt-url.net/g42i0ppw).
	OpenMetricsPipelineEnabled pulumi.BoolOutput `pulumi:"openMetricsPipelineEnabled"`
	// To enable dashboards and alerts, add the [Kubernetes persistent volume
	// claims](ui/hub/ext/com.dynatrace.extension.kubernetes-pvc) extension to your environment.
	PvcMonitoringEnabled pulumi.BoolOutput `pulumi:"pvcMonitoringEnabled"`
	// The scope of this setting (KUBERNETES_CLUSTER)
	Scope pulumi.StringOutput `pulumi:"scope"`
}

// NewKubernetes registers a new resource with the given unique name, arguments, and options.
func NewKubernetes(ctx *pulumi.Context,
	name string, args *KubernetesArgs, opts ...pulumi.ResourceOption) (*Kubernetes, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudApplicationPipelineEnabled == nil {
		return nil, errors.New("invalid value for required argument 'CloudApplicationPipelineEnabled'")
	}
	if args.ClusterIdEnabled == nil {
		return nil, errors.New("invalid value for required argument 'ClusterIdEnabled'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.EventProcessingActive == nil {
		return nil, errors.New("invalid value for required argument 'EventProcessingActive'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.OpenMetricsBuiltinEnabled == nil {
		return nil, errors.New("invalid value for required argument 'OpenMetricsBuiltinEnabled'")
	}
	if args.OpenMetricsPipelineEnabled == nil {
		return nil, errors.New("invalid value for required argument 'OpenMetricsPipelineEnabled'")
	}
	if args.PvcMonitoringEnabled == nil {
		return nil, errors.New("invalid value for required argument 'PvcMonitoringEnabled'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.AuthToken != nil {
		args.AuthToken = pulumi.ToSecret(args.AuthToken).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"authToken",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource Kubernetes
	err := ctx.RegisterResource("dynatrace:index/kubernetes:Kubernetes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetes gets an existing Kubernetes resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetes(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesState, opts ...pulumi.ResourceOption) (*Kubernetes, error) {
	var resource Kubernetes
	err := ctx.ReadResource("dynatrace:index/kubernetes:Kubernetes", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Kubernetes resources.
type kubernetesState struct {
	// ActiveGate Group
	ActiveGateGroup *string `pulumi:"activeGateGroup"`
	// Create a bearer token for [Kubernetes](https://dt-url.net/og43szq "Kubernetes") or
	// [OpenShift](https://dt-url.net/7l43xtp "OpenShift").
	AuthToken *string `pulumi:"authToken"`
	// Require valid certificates for communication with API server (recommended)
	CertificateCheckEnabled *bool `pulumi:"certificateCheckEnabled"`
	// Monitor Kubernetes namespaces, services, workloads, and pods
	CloudApplicationPipelineEnabled *bool `pulumi:"cloudApplicationPipelineEnabled"`
	// Unique ID of the cluster, the containerized ActiveGate is deployed to. Defaults to the UUID of the kube-system
	// namespace. The cluster ID of containerized ActiveGates is shown on the Deployment status screen.
	ClusterId *string `pulumi:"clusterId"`
	// For more information on local Kubernetes API monitoring, see the [documentation](https://dt-url.net/6q62uep).
	ClusterIdEnabled *bool `pulumi:"clusterIdEnabled"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Get the API URL for [Kubernetes](https://dt-url.net/kz23snj "Kubernetes") or [OpenShift](https://dt-url.net/d623xgw "OpenShift").
	EndpointUrl *string `pulumi:"endpointUrl"`
	// Define Kubernetes event filters to ingest events into your environment. For more details, see the
	// [documentation](https://dt-url.net/2201p0u).
	EventPatterns *KubernetesEventPatterns `pulumi:"eventPatterns"`
	// All events are monitored by default unless event filters are specified.
	EventProcessingActive *bool `pulumi:"eventProcessingActive"`
	// Include only events specified by Events Field Selectors
	FilterEvents *bool `pulumi:"filterEvents"`
	// Verify hostname in certificate against Kubernetes API URL
	HostnameVerificationEnabled *bool `pulumi:"hostnameVerificationEnabled"`
	// For a list of included events, see the [documentation](https://dt-url.net/l61d02no).
	IncludeAllFdiEvents *bool `pulumi:"includeAllFdiEvents"`
	// Renaming the cluster breaks configurations that are based on its name (e.g., management zones, and alerting).
	Label *string `pulumi:"label"`
	// The workload resource metrics are based on a subset of cAdvisor metrics. Depending on your Kubernetes cluster size, this
	// may increase the CPU/memory resource consumption of your ActiveGate.
	OpenMetricsBuiltinEnabled *bool `pulumi:"openMetricsBuiltinEnabled"`
	// For annotation guidance, see the [documentation](https://dt-url.net/g42i0ppw).
	OpenMetricsPipelineEnabled *bool `pulumi:"openMetricsPipelineEnabled"`
	// To enable dashboards and alerts, add the [Kubernetes persistent volume
	// claims](ui/hub/ext/com.dynatrace.extension.kubernetes-pvc) extension to your environment.
	PvcMonitoringEnabled *bool `pulumi:"pvcMonitoringEnabled"`
	// The scope of this setting (KUBERNETES_CLUSTER)
	Scope *string `pulumi:"scope"`
}

type KubernetesState struct {
	// ActiveGate Group
	ActiveGateGroup pulumi.StringPtrInput
	// Create a bearer token for [Kubernetes](https://dt-url.net/og43szq "Kubernetes") or
	// [OpenShift](https://dt-url.net/7l43xtp "OpenShift").
	AuthToken pulumi.StringPtrInput
	// Require valid certificates for communication with API server (recommended)
	CertificateCheckEnabled pulumi.BoolPtrInput
	// Monitor Kubernetes namespaces, services, workloads, and pods
	CloudApplicationPipelineEnabled pulumi.BoolPtrInput
	// Unique ID of the cluster, the containerized ActiveGate is deployed to. Defaults to the UUID of the kube-system
	// namespace. The cluster ID of containerized ActiveGates is shown on the Deployment status screen.
	ClusterId pulumi.StringPtrInput
	// For more information on local Kubernetes API monitoring, see the [documentation](https://dt-url.net/6q62uep).
	ClusterIdEnabled pulumi.BoolPtrInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Get the API URL for [Kubernetes](https://dt-url.net/kz23snj "Kubernetes") or [OpenShift](https://dt-url.net/d623xgw "OpenShift").
	EndpointUrl pulumi.StringPtrInput
	// Define Kubernetes event filters to ingest events into your environment. For more details, see the
	// [documentation](https://dt-url.net/2201p0u).
	EventPatterns KubernetesEventPatternsPtrInput
	// All events are monitored by default unless event filters are specified.
	EventProcessingActive pulumi.BoolPtrInput
	// Include only events specified by Events Field Selectors
	FilterEvents pulumi.BoolPtrInput
	// Verify hostname in certificate against Kubernetes API URL
	HostnameVerificationEnabled pulumi.BoolPtrInput
	// For a list of included events, see the [documentation](https://dt-url.net/l61d02no).
	IncludeAllFdiEvents pulumi.BoolPtrInput
	// Renaming the cluster breaks configurations that are based on its name (e.g., management zones, and alerting).
	Label pulumi.StringPtrInput
	// The workload resource metrics are based on a subset of cAdvisor metrics. Depending on your Kubernetes cluster size, this
	// may increase the CPU/memory resource consumption of your ActiveGate.
	OpenMetricsBuiltinEnabled pulumi.BoolPtrInput
	// For annotation guidance, see the [documentation](https://dt-url.net/g42i0ppw).
	OpenMetricsPipelineEnabled pulumi.BoolPtrInput
	// To enable dashboards and alerts, add the [Kubernetes persistent volume
	// claims](ui/hub/ext/com.dynatrace.extension.kubernetes-pvc) extension to your environment.
	PvcMonitoringEnabled pulumi.BoolPtrInput
	// The scope of this setting (KUBERNETES_CLUSTER)
	Scope pulumi.StringPtrInput
}

func (KubernetesState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesState)(nil)).Elem()
}

type kubernetesArgs struct {
	// ActiveGate Group
	ActiveGateGroup *string `pulumi:"activeGateGroup"`
	// Create a bearer token for [Kubernetes](https://dt-url.net/og43szq "Kubernetes") or
	// [OpenShift](https://dt-url.net/7l43xtp "OpenShift").
	AuthToken *string `pulumi:"authToken"`
	// Require valid certificates for communication with API server (recommended)
	CertificateCheckEnabled *bool `pulumi:"certificateCheckEnabled"`
	// Monitor Kubernetes namespaces, services, workloads, and pods
	CloudApplicationPipelineEnabled bool `pulumi:"cloudApplicationPipelineEnabled"`
	// Unique ID of the cluster, the containerized ActiveGate is deployed to. Defaults to the UUID of the kube-system
	// namespace. The cluster ID of containerized ActiveGates is shown on the Deployment status screen.
	ClusterId *string `pulumi:"clusterId"`
	// For more information on local Kubernetes API monitoring, see the [documentation](https://dt-url.net/6q62uep).
	ClusterIdEnabled bool `pulumi:"clusterIdEnabled"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Get the API URL for [Kubernetes](https://dt-url.net/kz23snj "Kubernetes") or [OpenShift](https://dt-url.net/d623xgw "OpenShift").
	EndpointUrl *string `pulumi:"endpointUrl"`
	// Define Kubernetes event filters to ingest events into your environment. For more details, see the
	// [documentation](https://dt-url.net/2201p0u).
	EventPatterns *KubernetesEventPatterns `pulumi:"eventPatterns"`
	// All events are monitored by default unless event filters are specified.
	EventProcessingActive bool `pulumi:"eventProcessingActive"`
	// Include only events specified by Events Field Selectors
	FilterEvents *bool `pulumi:"filterEvents"`
	// Verify hostname in certificate against Kubernetes API URL
	HostnameVerificationEnabled *bool `pulumi:"hostnameVerificationEnabled"`
	// For a list of included events, see the [documentation](https://dt-url.net/l61d02no).
	IncludeAllFdiEvents *bool `pulumi:"includeAllFdiEvents"`
	// Renaming the cluster breaks configurations that are based on its name (e.g., management zones, and alerting).
	Label string `pulumi:"label"`
	// The workload resource metrics are based on a subset of cAdvisor metrics. Depending on your Kubernetes cluster size, this
	// may increase the CPU/memory resource consumption of your ActiveGate.
	OpenMetricsBuiltinEnabled bool `pulumi:"openMetricsBuiltinEnabled"`
	// For annotation guidance, see the [documentation](https://dt-url.net/g42i0ppw).
	OpenMetricsPipelineEnabled bool `pulumi:"openMetricsPipelineEnabled"`
	// To enable dashboards and alerts, add the [Kubernetes persistent volume
	// claims](ui/hub/ext/com.dynatrace.extension.kubernetes-pvc) extension to your environment.
	PvcMonitoringEnabled bool `pulumi:"pvcMonitoringEnabled"`
	// The scope of this setting (KUBERNETES_CLUSTER)
	Scope string `pulumi:"scope"`
}

// The set of arguments for constructing a Kubernetes resource.
type KubernetesArgs struct {
	// ActiveGate Group
	ActiveGateGroup pulumi.StringPtrInput
	// Create a bearer token for [Kubernetes](https://dt-url.net/og43szq "Kubernetes") or
	// [OpenShift](https://dt-url.net/7l43xtp "OpenShift").
	AuthToken pulumi.StringPtrInput
	// Require valid certificates for communication with API server (recommended)
	CertificateCheckEnabled pulumi.BoolPtrInput
	// Monitor Kubernetes namespaces, services, workloads, and pods
	CloudApplicationPipelineEnabled pulumi.BoolInput
	// Unique ID of the cluster, the containerized ActiveGate is deployed to. Defaults to the UUID of the kube-system
	// namespace. The cluster ID of containerized ActiveGates is shown on the Deployment status screen.
	ClusterId pulumi.StringPtrInput
	// For more information on local Kubernetes API monitoring, see the [documentation](https://dt-url.net/6q62uep).
	ClusterIdEnabled pulumi.BoolInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Get the API URL for [Kubernetes](https://dt-url.net/kz23snj "Kubernetes") or [OpenShift](https://dt-url.net/d623xgw "OpenShift").
	EndpointUrl pulumi.StringPtrInput
	// Define Kubernetes event filters to ingest events into your environment. For more details, see the
	// [documentation](https://dt-url.net/2201p0u).
	EventPatterns KubernetesEventPatternsPtrInput
	// All events are monitored by default unless event filters are specified.
	EventProcessingActive pulumi.BoolInput
	// Include only events specified by Events Field Selectors
	FilterEvents pulumi.BoolPtrInput
	// Verify hostname in certificate against Kubernetes API URL
	HostnameVerificationEnabled pulumi.BoolPtrInput
	// For a list of included events, see the [documentation](https://dt-url.net/l61d02no).
	IncludeAllFdiEvents pulumi.BoolPtrInput
	// Renaming the cluster breaks configurations that are based on its name (e.g., management zones, and alerting).
	Label pulumi.StringInput
	// The workload resource metrics are based on a subset of cAdvisor metrics. Depending on your Kubernetes cluster size, this
	// may increase the CPU/memory resource consumption of your ActiveGate.
	OpenMetricsBuiltinEnabled pulumi.BoolInput
	// For annotation guidance, see the [documentation](https://dt-url.net/g42i0ppw).
	OpenMetricsPipelineEnabled pulumi.BoolInput
	// To enable dashboards and alerts, add the [Kubernetes persistent volume
	// claims](ui/hub/ext/com.dynatrace.extension.kubernetes-pvc) extension to your environment.
	PvcMonitoringEnabled pulumi.BoolInput
	// The scope of this setting (KUBERNETES_CLUSTER)
	Scope pulumi.StringInput
}

func (KubernetesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesArgs)(nil)).Elem()
}

type KubernetesInput interface {
	pulumi.Input

	ToKubernetesOutput() KubernetesOutput
	ToKubernetesOutputWithContext(ctx context.Context) KubernetesOutput
}

func (*Kubernetes) ElementType() reflect.Type {
	return reflect.TypeOf((**Kubernetes)(nil)).Elem()
}

func (i *Kubernetes) ToKubernetesOutput() KubernetesOutput {
	return i.ToKubernetesOutputWithContext(context.Background())
}

func (i *Kubernetes) ToKubernetesOutputWithContext(ctx context.Context) KubernetesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesOutput)
}

// KubernetesArrayInput is an input type that accepts KubernetesArray and KubernetesArrayOutput values.
// You can construct a concrete instance of `KubernetesArrayInput` via:
//
//	KubernetesArray{ KubernetesArgs{...} }
type KubernetesArrayInput interface {
	pulumi.Input

	ToKubernetesArrayOutput() KubernetesArrayOutput
	ToKubernetesArrayOutputWithContext(context.Context) KubernetesArrayOutput
}

type KubernetesArray []KubernetesInput

func (KubernetesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Kubernetes)(nil)).Elem()
}

func (i KubernetesArray) ToKubernetesArrayOutput() KubernetesArrayOutput {
	return i.ToKubernetesArrayOutputWithContext(context.Background())
}

func (i KubernetesArray) ToKubernetesArrayOutputWithContext(ctx context.Context) KubernetesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesArrayOutput)
}

// KubernetesMapInput is an input type that accepts KubernetesMap and KubernetesMapOutput values.
// You can construct a concrete instance of `KubernetesMapInput` via:
//
//	KubernetesMap{ "key": KubernetesArgs{...} }
type KubernetesMapInput interface {
	pulumi.Input

	ToKubernetesMapOutput() KubernetesMapOutput
	ToKubernetesMapOutputWithContext(context.Context) KubernetesMapOutput
}

type KubernetesMap map[string]KubernetesInput

func (KubernetesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Kubernetes)(nil)).Elem()
}

func (i KubernetesMap) ToKubernetesMapOutput() KubernetesMapOutput {
	return i.ToKubernetesMapOutputWithContext(context.Background())
}

func (i KubernetesMap) ToKubernetesMapOutputWithContext(ctx context.Context) KubernetesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesMapOutput)
}

type KubernetesOutput struct{ *pulumi.OutputState }

func (KubernetesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Kubernetes)(nil)).Elem()
}

func (o KubernetesOutput) ToKubernetesOutput() KubernetesOutput {
	return o
}

func (o KubernetesOutput) ToKubernetesOutputWithContext(ctx context.Context) KubernetesOutput {
	return o
}

// ActiveGate Group
func (o KubernetesOutput) ActiveGateGroup() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.StringPtrOutput { return v.ActiveGateGroup }).(pulumi.StringPtrOutput)
}

// Create a bearer token for [Kubernetes](https://dt-url.net/og43szq "Kubernetes") or
// [OpenShift](https://dt-url.net/7l43xtp "OpenShift").
func (o KubernetesOutput) AuthToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.StringPtrOutput { return v.AuthToken }).(pulumi.StringPtrOutput)
}

// Require valid certificates for communication with API server (recommended)
func (o KubernetesOutput) CertificateCheckEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolPtrOutput { return v.CertificateCheckEnabled }).(pulumi.BoolPtrOutput)
}

// Monitor Kubernetes namespaces, services, workloads, and pods
func (o KubernetesOutput) CloudApplicationPipelineEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.CloudApplicationPipelineEnabled }).(pulumi.BoolOutput)
}

// Unique ID of the cluster, the containerized ActiveGate is deployed to. Defaults to the UUID of the kube-system
// namespace. The cluster ID of containerized ActiveGates is shown on the Deployment status screen.
func (o KubernetesOutput) ClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.StringPtrOutput { return v.ClusterId }).(pulumi.StringPtrOutput)
}

// For more information on local Kubernetes API monitoring, see the [documentation](https://dt-url.net/6q62uep).
func (o KubernetesOutput) ClusterIdEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.ClusterIdEnabled }).(pulumi.BoolOutput)
}

// This setting is enabled (`true`) or disabled (`false`)
func (o KubernetesOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Get the API URL for [Kubernetes](https://dt-url.net/kz23snj "Kubernetes") or [OpenShift](https://dt-url.net/d623xgw "OpenShift").
func (o KubernetesOutput) EndpointUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.StringPtrOutput { return v.EndpointUrl }).(pulumi.StringPtrOutput)
}

// Define Kubernetes event filters to ingest events into your environment. For more details, see the
// [documentation](https://dt-url.net/2201p0u).
func (o KubernetesOutput) EventPatterns() KubernetesEventPatternsPtrOutput {
	return o.ApplyT(func(v *Kubernetes) KubernetesEventPatternsPtrOutput { return v.EventPatterns }).(KubernetesEventPatternsPtrOutput)
}

// All events are monitored by default unless event filters are specified.
func (o KubernetesOutput) EventProcessingActive() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.EventProcessingActive }).(pulumi.BoolOutput)
}

// Include only events specified by Events Field Selectors
func (o KubernetesOutput) FilterEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolPtrOutput { return v.FilterEvents }).(pulumi.BoolPtrOutput)
}

// Verify hostname in certificate against Kubernetes API URL
func (o KubernetesOutput) HostnameVerificationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolPtrOutput { return v.HostnameVerificationEnabled }).(pulumi.BoolPtrOutput)
}

// For a list of included events, see the [documentation](https://dt-url.net/l61d02no).
func (o KubernetesOutput) IncludeAllFdiEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolPtrOutput { return v.IncludeAllFdiEvents }).(pulumi.BoolPtrOutput)
}

// Renaming the cluster breaks configurations that are based on its name (e.g., management zones, and alerting).
func (o KubernetesOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// The workload resource metrics are based on a subset of cAdvisor metrics. Depending on your Kubernetes cluster size, this
// may increase the CPU/memory resource consumption of your ActiveGate.
func (o KubernetesOutput) OpenMetricsBuiltinEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.OpenMetricsBuiltinEnabled }).(pulumi.BoolOutput)
}

// For annotation guidance, see the [documentation](https://dt-url.net/g42i0ppw).
func (o KubernetesOutput) OpenMetricsPipelineEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.OpenMetricsPipelineEnabled }).(pulumi.BoolOutput)
}

// To enable dashboards and alerts, add the [Kubernetes persistent volume
// claims](ui/hub/ext/com.dynatrace.extension.kubernetes-pvc) extension to your environment.
func (o KubernetesOutput) PvcMonitoringEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.BoolOutput { return v.PvcMonitoringEnabled }).(pulumi.BoolOutput)
}

// The scope of this setting (KUBERNETES_CLUSTER)
func (o KubernetesOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *Kubernetes) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

type KubernetesArrayOutput struct{ *pulumi.OutputState }

func (KubernetesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Kubernetes)(nil)).Elem()
}

func (o KubernetesArrayOutput) ToKubernetesArrayOutput() KubernetesArrayOutput {
	return o
}

func (o KubernetesArrayOutput) ToKubernetesArrayOutputWithContext(ctx context.Context) KubernetesArrayOutput {
	return o
}

func (o KubernetesArrayOutput) Index(i pulumi.IntInput) KubernetesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Kubernetes {
		return vs[0].([]*Kubernetes)[vs[1].(int)]
	}).(KubernetesOutput)
}

type KubernetesMapOutput struct{ *pulumi.OutputState }

func (KubernetesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Kubernetes)(nil)).Elem()
}

func (o KubernetesMapOutput) ToKubernetesMapOutput() KubernetesMapOutput {
	return o
}

func (o KubernetesMapOutput) ToKubernetesMapOutputWithContext(ctx context.Context) KubernetesMapOutput {
	return o
}

func (o KubernetesMapOutput) MapIndex(k pulumi.StringInput) KubernetesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Kubernetes {
		return vs[0].(map[string]*Kubernetes)[vs[1].(string)]
	}).(KubernetesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesInput)(nil)).Elem(), &Kubernetes{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesArrayInput)(nil)).Elem(), KubernetesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesMapInput)(nil)).Elem(), KubernetesMap{})
	pulumi.RegisterOutputType(KubernetesOutput{})
	pulumi.RegisterOutputType(KubernetesArrayOutput{})
	pulumi.RegisterOutputType(KubernetesMapOutput{})
}
