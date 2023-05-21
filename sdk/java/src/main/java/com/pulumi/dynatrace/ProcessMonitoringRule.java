// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ProcessMonitoringRuleArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ProcessMonitoringRuleState;
import com.pulumi.dynatrace.outputs.ProcessMonitoringRuleCondition;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/processMonitoringRule:ProcessMonitoringRule")
public class ProcessMonitoringRule extends com.pulumi.resources.CustomResource {
    /**
     * Condition
     * 
     */
    @Export(name="condition", refs={ProcessMonitoringRuleCondition.class}, tree="[0]")
    private Output<ProcessMonitoringRuleCondition> condition;

    /**
     * @return Condition
     * 
     */
    public Output<ProcessMonitoringRuleCondition> condition() {
        return this.condition;
    }
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope
     * 
     */
    @Export(name="hostGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostGroupId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope
     * 
     */
    public Output<Optional<String>> hostGroupId() {
        return Codegen.optional(this.hostGroupId);
    }
    /**
     * Possible Values: `MONITORING_ON`, `MONITORING_OFF`
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return Possible Values: `MONITORING_ON`, `MONITORING_OFF`
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProcessMonitoringRule(String name) {
        this(name, ProcessMonitoringRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProcessMonitoringRule(String name, ProcessMonitoringRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProcessMonitoringRule(String name, ProcessMonitoringRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/processMonitoringRule:ProcessMonitoringRule", name, args == null ? ProcessMonitoringRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProcessMonitoringRule(String name, Output<String> id, @Nullable ProcessMonitoringRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/processMonitoringRule:ProcessMonitoringRule", name, state, makeResourceOptions(options, id));
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
    public static ProcessMonitoringRule get(String name, Output<String> id, @Nullable ProcessMonitoringRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProcessMonitoringRule(name, id, state, options);
    }
}
