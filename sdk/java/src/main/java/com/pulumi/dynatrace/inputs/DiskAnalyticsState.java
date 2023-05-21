// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskAnalyticsState extends com.pulumi.resources.ResourceArgs {

    public static final DiskAnalyticsState Empty = new DiskAnalyticsState();

    /**
     * The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The scope of this setting (HOST, HOST_GROUP)
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP)
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private DiskAnalyticsState() {}

    private DiskAnalyticsState(DiskAnalyticsState $) {
        this.enabled = $.enabled;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAnalyticsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAnalyticsState $;

        public Builder() {
            $ = new DiskAnalyticsState();
        }

        public Builder(DiskAnalyticsState defaults) {
            $ = new DiskAnalyticsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP)
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public DiskAnalyticsState build() {
            return $;
        }
    }

}
