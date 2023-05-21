// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.GeolocationArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.GeolocationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/geolocation:Geolocation")
public class Geolocation extends com.pulumi.resources.CustomResource {
    /**
     * Display the world map
     * 
     */
    @Export(name="displayWorldmap", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> displayWorldmap;

    /**
     * @return Display the world map
     * 
     */
    public Output<Boolean> displayWorldmap() {
        return this.displayWorldmap;
    }
    /**
     * The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Geolocation(String name) {
        this(name, GeolocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Geolocation(String name, GeolocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Geolocation(String name, GeolocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/geolocation:Geolocation", name, args == null ? GeolocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Geolocation(String name, Output<String> id, @Nullable GeolocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/geolocation:Geolocation", name, state, makeResourceOptions(options, id));
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
    public static Geolocation get(String name, Output<String> id, @Nullable GeolocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Geolocation(name, id, state, options);
    }
}
