// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.SyntheticAvailabilityArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.SyntheticAvailabilityState;
import java.lang.Boolean;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/syntheticAvailability:SyntheticAvailability")
public class SyntheticAvailability extends com.pulumi.resources.CustomResource {
    /**
     * Exclude periods with maintenance windows from availability calculation
     * 
     */
    @Export(name="excludeMaintenanceWindows", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> excludeMaintenanceWindows;

    /**
     * @return Exclude periods with maintenance windows from availability calculation
     * 
     */
    public Output<Boolean> excludeMaintenanceWindows() {
        return this.excludeMaintenanceWindows;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyntheticAvailability(String name) {
        this(name, SyntheticAvailabilityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyntheticAvailability(String name, SyntheticAvailabilityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyntheticAvailability(String name, SyntheticAvailabilityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/syntheticAvailability:SyntheticAvailability", name, args == null ? SyntheticAvailabilityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SyntheticAvailability(String name, Output<String> id, @Nullable SyntheticAvailabilityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/syntheticAvailability:SyntheticAvailability", name, state, makeResourceOptions(options, id));
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
    public static SyntheticAvailability get(String name, Output<String> id, @Nullable SyntheticAvailabilityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyntheticAvailability(name, id, state, options);
    }
}
