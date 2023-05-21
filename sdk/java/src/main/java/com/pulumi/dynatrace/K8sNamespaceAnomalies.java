// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.K8sNamespaceAnomaliesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.K8sNamespaceAnomaliesState;
import com.pulumi.dynatrace.outputs.K8sNamespaceAnomaliesCpuLimitsQuotaSaturation;
import com.pulumi.dynatrace.outputs.K8sNamespaceAnomaliesCpuRequestsQuotaSaturation;
import com.pulumi.dynatrace.outputs.K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation;
import com.pulumi.dynatrace.outputs.K8sNamespaceAnomaliesMemoryRequestsQuotaSaturation;
import com.pulumi.dynatrace.outputs.K8sNamespaceAnomaliesPodsQuotaSaturation;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/k8sNamespaceAnomalies:K8sNamespaceAnomalies")
public class K8sNamespaceAnomalies extends com.pulumi.resources.CustomResource {
    /**
     * Alerts if almost no CPU-limit quota left in namespace
     * 
     */
    @Export(name="cpuLimitsQuotaSaturation", refs={K8sNamespaceAnomaliesCpuLimitsQuotaSaturation.class}, tree="[0]")
    private Output<K8sNamespaceAnomaliesCpuLimitsQuotaSaturation> cpuLimitsQuotaSaturation;

    /**
     * @return Alerts if almost no CPU-limit quota left in namespace
     * 
     */
    public Output<K8sNamespaceAnomaliesCpuLimitsQuotaSaturation> cpuLimitsQuotaSaturation() {
        return this.cpuLimitsQuotaSaturation;
    }
    /**
     * Alerts if almost no CPU-request quota left in namespace
     * 
     */
    @Export(name="cpuRequestsQuotaSaturation", refs={K8sNamespaceAnomaliesCpuRequestsQuotaSaturation.class}, tree="[0]")
    private Output<K8sNamespaceAnomaliesCpuRequestsQuotaSaturation> cpuRequestsQuotaSaturation;

    /**
     * @return Alerts if almost no CPU-request quota left in namespace
     * 
     */
    public Output<K8sNamespaceAnomaliesCpuRequestsQuotaSaturation> cpuRequestsQuotaSaturation() {
        return this.cpuRequestsQuotaSaturation;
    }
    /**
     * Alerts if almost no memory-limit quota left in namespace
     * 
     */
    @Export(name="memoryLimitsQuotaSaturation", refs={K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation.class}, tree="[0]")
    private Output<K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation> memoryLimitsQuotaSaturation;

    /**
     * @return Alerts if almost no memory-limit quota left in namespace
     * 
     */
    public Output<K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation> memoryLimitsQuotaSaturation() {
        return this.memoryLimitsQuotaSaturation;
    }
    /**
     * Alerts if almost no memory-request quota left in namespace
     * 
     */
    @Export(name="memoryRequestsQuotaSaturation", refs={K8sNamespaceAnomaliesMemoryRequestsQuotaSaturation.class}, tree="[0]")
    private Output<K8sNamespaceAnomaliesMemoryRequestsQuotaSaturation> memoryRequestsQuotaSaturation;

    /**
     * @return Alerts if almost no memory-request quota left in namespace
     * 
     */
    public Output<K8sNamespaceAnomaliesMemoryRequestsQuotaSaturation> memoryRequestsQuotaSaturation() {
        return this.memoryRequestsQuotaSaturation;
    }
    /**
     * Alerts if almost no pod quota left in namespace
     * 
     */
    @Export(name="podsQuotaSaturation", refs={K8sNamespaceAnomaliesPodsQuotaSaturation.class}, tree="[0]")
    private Output<K8sNamespaceAnomaliesPodsQuotaSaturation> podsQuotaSaturation;

    /**
     * @return Alerts if almost no pod quota left in namespace
     * 
     */
    public Output<K8sNamespaceAnomaliesPodsQuotaSaturation> podsQuotaSaturation() {
        return this.podsQuotaSaturation;
    }
    /**
     * The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public K8sNamespaceAnomalies(String name) {
        this(name, K8sNamespaceAnomaliesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public K8sNamespaceAnomalies(String name, K8sNamespaceAnomaliesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public K8sNamespaceAnomalies(String name, K8sNamespaceAnomaliesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/k8sNamespaceAnomalies:K8sNamespaceAnomalies", name, args == null ? K8sNamespaceAnomaliesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private K8sNamespaceAnomalies(String name, Output<String> id, @Nullable K8sNamespaceAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/k8sNamespaceAnomalies:K8sNamespaceAnomalies", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static K8sNamespaceAnomalies get(String name, Output<String> id, @Nullable K8sNamespaceAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new K8sNamespaceAnomalies(name, id, state, options);
    }
}
