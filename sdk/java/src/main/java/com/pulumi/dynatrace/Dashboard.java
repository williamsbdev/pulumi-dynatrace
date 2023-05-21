// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.DashboardArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.DashboardState;
import com.pulumi.dynatrace.outputs.DashboardDashboardMetadata;
import com.pulumi.dynatrace.outputs.DashboardMetadata;
import com.pulumi.dynatrace.outputs.DashboardTile;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/dashboard:Dashboard")
public class Dashboard extends com.pulumi.resources.CustomResource {
    /**
     * contains parameters of a dashboard
     * 
     */
    @Export(name="dashboardMetadata", refs={DashboardDashboardMetadata.class}, tree="[0]")
    private Output</* @Nullable */ DashboardDashboardMetadata> dashboardMetadata;

    /**
     * @return contains parameters of a dashboard
     * 
     */
    public Output<Optional<DashboardDashboardMetadata>> dashboardMetadata() {
        return Codegen.optional(this.dashboardMetadata);
    }
    /**
     * `metadata` exists for backwards compatibility but shouldn&#39;t get specified anymore
     * 
     * @deprecated
     * `metadata` exists for backwards compatibility but shouldn&#39;t get specified anymore
     * 
     */
    @Deprecated /* `metadata` exists for backwards compatibility but shouldn't get specified anymore */
    @Export(name="metadata", refs={DashboardMetadata.class}, tree="[0]")
    private Output</* @Nullable */ DashboardMetadata> metadata;

    /**
     * @return `metadata` exists for backwards compatibility but shouldn&#39;t get specified anymore
     * 
     */
    public Output<Optional<DashboardMetadata>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * the tiles this Dashboard consist of
     * 
     */
    @Export(name="tiles", refs={List.class,DashboardTile.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DashboardTile>> tiles;

    /**
     * @return the tiles this Dashboard consist of
     * 
     */
    public Output<Optional<List<DashboardTile>>> tiles() {
        return Codegen.optional(this.tiles);
    }
    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Export(name="unknowns", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Output<Optional<String>> unknowns() {
        return Codegen.optional(this.unknowns);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dashboard(String name) {
        this(name, DashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dashboard(String name, @Nullable DashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dashboard(String name, @Nullable DashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/dashboard:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dashboard(String name, Output<String> id, @Nullable DashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/dashboard:Dashboard", name, state, makeResourceOptions(options, id));
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
    public static Dashboard get(String name, Output<String> id, @Nullable DashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, state, options);
    }
}
