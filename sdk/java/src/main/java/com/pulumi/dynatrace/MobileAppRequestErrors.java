// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.MobileAppRequestErrorsArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.MobileAppRequestErrorsState;
import com.pulumi.dynatrace.outputs.MobileAppRequestErrorsErrorRules;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/mobileAppRequestErrors:MobileAppRequestErrors")
public class MobileAppRequestErrors extends com.pulumi.resources.CustomResource {
    /**
     * no documentation available
     * 
     */
    @Export(name="errorRules", refs={MobileAppRequestErrorsErrorRules.class}, tree="[0]")
    private Output</* @Nullable */ MobileAppRequestErrorsErrorRules> errorRules;

    /**
     * @return no documentation available
     * 
     */
    public Output<Optional<MobileAppRequestErrorsErrorRules>> errorRules() {
        return Codegen.optional(this.errorRules);
    }
    /**
     * The scope of this setting (MOBILE*APPLICATION, CUSTOM*APPLICATION)
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The scope of this setting (MOBILE*APPLICATION, CUSTOM*APPLICATION)
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MobileAppRequestErrors(String name) {
        this(name, MobileAppRequestErrorsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MobileAppRequestErrors(String name, MobileAppRequestErrorsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MobileAppRequestErrors(String name, MobileAppRequestErrorsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/mobileAppRequestErrors:MobileAppRequestErrors", name, args == null ? MobileAppRequestErrorsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MobileAppRequestErrors(String name, Output<String> id, @Nullable MobileAppRequestErrorsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/mobileAppRequestErrors:MobileAppRequestErrors", name, state, makeResourceOptions(options, id));
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
    public static MobileAppRequestErrors get(String name, Output<String> id, @Nullable MobileAppRequestErrorsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MobileAppRequestErrors(name, id, state, options);
    }
}
