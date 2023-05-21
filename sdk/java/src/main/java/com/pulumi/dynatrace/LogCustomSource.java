// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.LogCustomSourceArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.LogCustomSourceState;
import com.pulumi.dynatrace.outputs.LogCustomSourceContext;
import com.pulumi.dynatrace.outputs.LogCustomSourceCustomLogSource;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/logCustomSource:LogCustomSource")
public class LogCustomSource extends com.pulumi.resources.CustomResource {
    /**
     * Define Custom Log Source only within context if provided
     * 
     */
    @Export(name="context", refs={LogCustomSourceContext.class}, tree="[0]")
    private Output</* @Nullable */ LogCustomSourceContext> context;

    /**
     * @return Define Custom Log Source only within context if provided
     * 
     */
    public Output<Optional<LogCustomSourceContext>> context() {
        return Codegen.optional(this.context);
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="customLogSource", refs={LogCustomSourceCustomLogSource.class}, tree="[0]")
    private Output<LogCustomSourceCustomLogSource> customLogSource;

    /**
     * @return no documentation available
     * 
     */
    public Output<LogCustomSourceCustomLogSource> customLogSource() {
        return this.customLogSource;
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
     * Name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogCustomSource(String name) {
        this(name, LogCustomSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogCustomSource(String name, LogCustomSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogCustomSource(String name, LogCustomSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logCustomSource:LogCustomSource", name, args == null ? LogCustomSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogCustomSource(String name, Output<String> id, @Nullable LogCustomSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logCustomSource:LogCustomSource", name, state, makeResourceOptions(options, id));
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
    public static LogCustomSource get(String name, Output<String> id, @Nullable LogCustomSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogCustomSource(name, id, state, options);
    }
}
