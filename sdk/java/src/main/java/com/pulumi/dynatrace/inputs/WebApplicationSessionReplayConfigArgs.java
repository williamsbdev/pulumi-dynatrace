// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebApplicationSessionReplayConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationSessionReplayConfigArgs Empty = new WebApplicationSessionReplayConfigArgs();

    /**
     * Session replay sampling rating in percent
     * 
     */
    @Import(name="costControlPercentage", required=true)
    private Output<Integer> costControlPercentage;

    /**
     * @return Session replay sampling rating in percent
     * 
     */
    public Output<Integer> costControlPercentage() {
        return this.costControlPercentage;
    }

    /**
     * A list of URLs to be excluded from CSS resource capturing
     * 
     */
    @Import(name="cssResourceCapturingExclusionRules")
    private @Nullable Output<List<String>> cssResourceCapturingExclusionRules;

    /**
     * @return A list of URLs to be excluded from CSS resource capturing
     * 
     */
    public Optional<Output<List<String>>> cssResourceCapturingExclusionRules() {
        return Optional.ofNullable(this.cssResourceCapturingExclusionRules);
    }

    /**
     * Capture (`true`) or don&#39;t capture (`false`) CSS resources from the session
     * 
     */
    @Import(name="enableCssResourceCapturing")
    private @Nullable Output<Boolean> enableCssResourceCapturing;

    /**
     * @return Capture (`true`) or don&#39;t capture (`false`) CSS resources from the session
     * 
     */
    public Optional<Output<Boolean>> enableCssResourceCapturing() {
        return Optional.ofNullable(this.enableCssResourceCapturing);
    }

    /**
     * SessionReplay Enabled/Disabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return SessionReplay Enabled/Disabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WebApplicationSessionReplayConfigArgs() {}

    private WebApplicationSessionReplayConfigArgs(WebApplicationSessionReplayConfigArgs $) {
        this.costControlPercentage = $.costControlPercentage;
        this.cssResourceCapturingExclusionRules = $.cssResourceCapturingExclusionRules;
        this.enableCssResourceCapturing = $.enableCssResourceCapturing;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationSessionReplayConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationSessionReplayConfigArgs $;

        public Builder() {
            $ = new WebApplicationSessionReplayConfigArgs();
        }

        public Builder(WebApplicationSessionReplayConfigArgs defaults) {
            $ = new WebApplicationSessionReplayConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param costControlPercentage Session replay sampling rating in percent
         * 
         * @return builder
         * 
         */
        public Builder costControlPercentage(Output<Integer> costControlPercentage) {
            $.costControlPercentage = costControlPercentage;
            return this;
        }

        /**
         * @param costControlPercentage Session replay sampling rating in percent
         * 
         * @return builder
         * 
         */
        public Builder costControlPercentage(Integer costControlPercentage) {
            return costControlPercentage(Output.of(costControlPercentage));
        }

        /**
         * @param cssResourceCapturingExclusionRules A list of URLs to be excluded from CSS resource capturing
         * 
         * @return builder
         * 
         */
        public Builder cssResourceCapturingExclusionRules(@Nullable Output<List<String>> cssResourceCapturingExclusionRules) {
            $.cssResourceCapturingExclusionRules = cssResourceCapturingExclusionRules;
            return this;
        }

        /**
         * @param cssResourceCapturingExclusionRules A list of URLs to be excluded from CSS resource capturing
         * 
         * @return builder
         * 
         */
        public Builder cssResourceCapturingExclusionRules(List<String> cssResourceCapturingExclusionRules) {
            return cssResourceCapturingExclusionRules(Output.of(cssResourceCapturingExclusionRules));
        }

        /**
         * @param cssResourceCapturingExclusionRules A list of URLs to be excluded from CSS resource capturing
         * 
         * @return builder
         * 
         */
        public Builder cssResourceCapturingExclusionRules(String... cssResourceCapturingExclusionRules) {
            return cssResourceCapturingExclusionRules(List.of(cssResourceCapturingExclusionRules));
        }

        /**
         * @param enableCssResourceCapturing Capture (`true`) or don&#39;t capture (`false`) CSS resources from the session
         * 
         * @return builder
         * 
         */
        public Builder enableCssResourceCapturing(@Nullable Output<Boolean> enableCssResourceCapturing) {
            $.enableCssResourceCapturing = enableCssResourceCapturing;
            return this;
        }

        /**
         * @param enableCssResourceCapturing Capture (`true`) or don&#39;t capture (`false`) CSS resources from the session
         * 
         * @return builder
         * 
         */
        public Builder enableCssResourceCapturing(Boolean enableCssResourceCapturing) {
            return enableCssResourceCapturing(Output.of(enableCssResourceCapturing));
        }

        /**
         * @param enabled SessionReplay Enabled/Disabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled SessionReplay Enabled/Disabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WebApplicationSessionReplayConfigArgs build() {
            $.costControlPercentage = Objects.requireNonNull($.costControlPercentage, "expected parameter 'costControlPercentage' to be non-null");
            return $;
        }
    }

}