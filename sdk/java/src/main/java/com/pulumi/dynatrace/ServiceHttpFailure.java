// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ServiceHttpFailureArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ServiceHttpFailureState;
import com.pulumi.dynatrace.outputs.ServiceHttpFailureBrokenLinks;
import com.pulumi.dynatrace.outputs.ServiceHttpFailureHttpResponseCodes;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/serviceHttpFailure:ServiceHttpFailure")
public class ServiceHttpFailure extends com.pulumi.resources.CustomResource {
    /**
     * HTTP 404 response codes are thrown when a web server can&#39;t find a certain page. 404s are classified as broken links on the client side and therefore aren&#39;t considered to be service failures. By enabling this setting, you can have 404s treated as server-side service failures.
     * 
     */
    @Export(name="brokenLinks", refs={ServiceHttpFailureBrokenLinks.class}, tree="[0]")
    private Output</* @Nullable */ ServiceHttpFailureBrokenLinks> brokenLinks;

    /**
     * @return HTTP 404 response codes are thrown when a web server can&#39;t find a certain page. 404s are classified as broken links on the client side and therefore aren&#39;t considered to be service failures. By enabling this setting, you can have 404s treated as server-side service failures.
     * 
     */
    public Output<Optional<ServiceHttpFailureBrokenLinks>> brokenLinks() {
        return Codegen.optional(this.brokenLinks);
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
     * HTTP response codes
     * 
     */
    @Export(name="httpResponseCodes", refs={ServiceHttpFailureHttpResponseCodes.class}, tree="[0]")
    private Output</* @Nullable */ ServiceHttpFailureHttpResponseCodes> httpResponseCodes;

    /**
     * @return HTTP response codes
     * 
     */
    public Output<Optional<ServiceHttpFailureHttpResponseCodes>> httpResponseCodes() {
        return Codegen.optional(this.httpResponseCodes);
    }
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceHttpFailure(String name) {
        this(name, ServiceHttpFailureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceHttpFailure(String name, ServiceHttpFailureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceHttpFailure(String name, ServiceHttpFailureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/serviceHttpFailure:ServiceHttpFailure", name, args == null ? ServiceHttpFailureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceHttpFailure(String name, Output<String> id, @Nullable ServiceHttpFailureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/serviceHttpFailure:ServiceHttpFailure", name, state, makeResourceOptions(options, id));
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
    public static ServiceHttpFailure get(String name, Output<String> id, @Nullable ServiceHttpFailureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceHttpFailure(name, id, state, options);
    }
}
