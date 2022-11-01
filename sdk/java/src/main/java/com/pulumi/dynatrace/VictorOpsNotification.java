// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.VictorOpsNotificationArgs;
import com.pulumi.dynatrace.inputs.VictorOpsNotificationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/victorOpsNotification:VictorOpsNotification")
public class VictorOpsNotification extends com.pulumi.resources.CustomResource {
    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output<Boolean> active;

    /**
     * @return The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * The API key for the target VictorOps account
     * 
     */
    @Export(name="apiKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return The API key for the target VictorOps account
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    /**
     * The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output<String> message;

    /**
     * @return The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
     * 
     */
    public Output<String> message() {
        return this.message;
    }
    /**
     * The name of the notification configuration
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the notification configuration
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the associated alerting profile
     * 
     */
    @Export(name="profile", type=String.class, parameters={})
    private Output<String> profile;

    /**
     * @return The ID of the associated alerting profile
     * 
     */
    public Output<String> profile() {
        return this.profile;
    }
    /**
     * The routing key, defining the group to be notified
     * 
     */
    @Export(name="routingKey", type=String.class, parameters={})
    private Output<String> routingKey;

    /**
     * @return The routing key, defining the group to be notified
     * 
     */
    public Output<String> routingKey() {
        return this.routingKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VictorOpsNotification(String name) {
        this(name, VictorOpsNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VictorOpsNotification(String name, VictorOpsNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VictorOpsNotification(String name, VictorOpsNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/victorOpsNotification:VictorOpsNotification", name, args == null ? VictorOpsNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VictorOpsNotification(String name, Output<String> id, @Nullable VictorOpsNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/victorOpsNotification:VictorOpsNotification", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey"
            ))
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
    public static VictorOpsNotification get(String name, Output<String> id, @Nullable VictorOpsNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VictorOpsNotification(name, id, state, options);
    }
}