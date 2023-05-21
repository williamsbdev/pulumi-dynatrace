// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.HttpMonitorArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.HttpMonitorState;
import com.pulumi.dynatrace.outputs.HttpMonitorAnomalyDetection;
import com.pulumi.dynatrace.outputs.HttpMonitorScript;
import com.pulumi.dynatrace.outputs.HttpMonitorTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/httpMonitor:HttpMonitor")
public class HttpMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The anomaly detection configuration.
     * 
     */
    @Export(name="anomalyDetections", refs={List.class,HttpMonitorAnomalyDetection.class}, tree="[0,1]")
    private Output</* @Nullable */ List<HttpMonitorAnomalyDetection>> anomalyDetections;

    /**
     * @return The anomaly detection configuration.
     * 
     */
    public Output<Optional<List<HttpMonitorAnomalyDetection>>> anomalyDetections() {
        return Codegen.optional(this.anomalyDetections);
    }
    /**
     * The monitor is enabled (`true`) or disabled (`false`).
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The monitor is enabled (`true`) or disabled (`false`).
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The frequency of the monitor, in minutes.
     * 
     */
    @Export(name="frequency", refs={Integer.class}, tree="[0]")
    private Output<Integer> frequency;

    /**
     * @return The frequency of the monitor, in minutes.
     * 
     */
    public Output<Integer> frequency() {
        return this.frequency;
    }
    /**
     * A list of locations from which the monitor is executed. To specify a location, use its entity ID.
     * 
     */
    @Export(name="locations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> locations;

    /**
     * @return A list of locations from which the monitor is executed. To specify a location, use its entity ID.
     * 
     */
    public Output<Optional<List<String>>> locations() {
        return Codegen.optional(this.locations);
    }
    /**
     * A set of manually assigned applications.
     * 
     */
    @Export(name="manuallyAssignedApps", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> manuallyAssignedApps;

    /**
     * @return A set of manually assigned applications.
     * 
     */
    public Output<Optional<List<String>>> manuallyAssignedApps() {
        return Codegen.optional(this.manuallyAssignedApps);
    }
    /**
     * The name of the monitor.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the monitor.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The HTTP Script
     * 
     */
    @Export(name="script", refs={HttpMonitorScript.class}, tree="[0]")
    private Output</* @Nullable */ HttpMonitorScript> script;

    /**
     * @return The HTTP Script
     * 
     */
    public Output<Optional<HttpMonitorScript>> script() {
        return Codegen.optional(this.script);
    }
    /**
     * A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
     * source &#39;USER&#39; will be added automatically.
     * 
     */
    @Export(name="tags", refs={List.class,HttpMonitorTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<HttpMonitorTag>> tags;

    /**
     * @return A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
     * source &#39;USER&#39; will be added automatically.
     * 
     */
    public Output<Optional<List<HttpMonitorTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HttpMonitor(String name) {
        this(name, HttpMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpMonitor(String name, HttpMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpMonitor(String name, HttpMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/httpMonitor:HttpMonitor", name, args == null ? HttpMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HttpMonitor(String name, Output<String> id, @Nullable HttpMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/httpMonitor:HttpMonitor", name, state, makeResourceOptions(options, id));
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
    public static HttpMonitor get(String name, Output<String> id, @Nullable HttpMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HttpMonitor(name, id, state, options);
    }
}
