// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GeolocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GeolocationArgs Empty = new GeolocationArgs();

    /**
     * Display the world map
     * 
     */
    @Import(name="displayWorldmap", required=true)
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
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private GeolocationArgs() {}

    private GeolocationArgs(GeolocationArgs $) {
        this.displayWorldmap = $.displayWorldmap;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GeolocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GeolocationArgs $;

        public Builder() {
            $ = new GeolocationArgs();
        }

        public Builder(GeolocationArgs defaults) {
            $ = new GeolocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayWorldmap Display the world map
         * 
         * @return builder
         * 
         */
        public Builder displayWorldmap(Output<Boolean> displayWorldmap) {
            $.displayWorldmap = displayWorldmap;
            return this;
        }

        /**
         * @param displayWorldmap Display the world map
         * 
         * @return builder
         * 
         */
        public Builder displayWorldmap(Boolean displayWorldmap) {
            return displayWorldmap(Output.of(displayWorldmap));
        }

        /**
         * @param scope The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public GeolocationArgs build() {
            $.displayWorldmap = Objects.requireNonNull($.displayWorldmap, "expected parameter 'displayWorldmap' to be non-null");
            return $;
        }
    }

}
