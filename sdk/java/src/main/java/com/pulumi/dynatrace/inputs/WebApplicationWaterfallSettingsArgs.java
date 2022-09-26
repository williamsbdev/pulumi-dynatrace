// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class WebApplicationWaterfallSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationWaterfallSettingsArgs Empty = new WebApplicationWaterfallSettingsArgs();

    /**
     * Warn about resources with a lower browser cache rate above *X*%. Values between 1 and 100 are allowed.
     * 
     */
    @Import(name="resourceBrowserCachingThreshold", required=true)
    private Output<Integer> resourceBrowserCachingThreshold;

    /**
     * @return Warn about resources with a lower browser cache rate above *X*%. Values between 1 and 100 are allowed.
     * 
     */
    public Output<Integer> resourceBrowserCachingThreshold() {
        return this.resourceBrowserCachingThreshold;
    }

    /**
     * Warn about resources larger than *X* bytes. Values between 0 and 99999000 are allowed.
     * 
     */
    @Import(name="resourcesThreshold", required=true)
    private Output<Integer> resourcesThreshold;

    /**
     * @return Warn about resources larger than *X* bytes. Values between 0 and 99999000 are allowed.
     * 
     */
    public Output<Integer> resourcesThreshold() {
        return this.resourcesThreshold;
    }

    /**
     * Warn about slow CDN resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
     * 
     */
    @Import(name="slowCndResourcesThreshold", required=true)
    private Output<Integer> slowCndResourcesThreshold;

    /**
     * @return Warn about slow CDN resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
     * 
     */
    public Output<Integer> slowCndResourcesThreshold() {
        return this.slowCndResourcesThreshold;
    }

    /**
     * Warn about slow 1st party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
     * 
     */
    @Import(name="slowFirstPartyResourcesThreshold", required=true)
    private Output<Integer> slowFirstPartyResourcesThreshold;

    /**
     * @return Warn about slow 1st party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
     * 
     */
    public Output<Integer> slowFirstPartyResourcesThreshold() {
        return this.slowFirstPartyResourcesThreshold;
    }

    /**
     * Warn about slow 3rd party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
     * 
     */
    @Import(name="slowThirdPartyResourcesThreshold", required=true)
    private Output<Integer> slowThirdPartyResourcesThreshold;

    /**
     * @return Warn about slow 3rd party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
     * 
     */
    public Output<Integer> slowThirdPartyResourcesThreshold() {
        return this.slowThirdPartyResourcesThreshold;
    }

    /**
     * Warn if Speed index exceeds *X* % of Visually complete. Values between 1 and 99 are allowed.
     * 
     */
    @Import(name="speedIndexVisuallyCompleteRatioThreshold", required=true)
    private Output<Integer> speedIndexVisuallyCompleteRatioThreshold;

    /**
     * @return Warn if Speed index exceeds *X* % of Visually complete. Values between 1 and 99 are allowed.
     * 
     */
    public Output<Integer> speedIndexVisuallyCompleteRatioThreshold() {
        return this.speedIndexVisuallyCompleteRatioThreshold;
    }

    /**
     * Warn about uncompressed resources larger than *X* bytes. Values between 0 and 99999 are allowed.
     * 
     */
    @Import(name="uncompressedResourcesThreshold", required=true)
    private Output<Integer> uncompressedResourcesThreshold;

    /**
     * @return Warn about uncompressed resources larger than *X* bytes. Values between 0 and 99999 are allowed.
     * 
     */
    public Output<Integer> uncompressedResourcesThreshold() {
        return this.uncompressedResourcesThreshold;
    }

    private WebApplicationWaterfallSettingsArgs() {}

    private WebApplicationWaterfallSettingsArgs(WebApplicationWaterfallSettingsArgs $) {
        this.resourceBrowserCachingThreshold = $.resourceBrowserCachingThreshold;
        this.resourcesThreshold = $.resourcesThreshold;
        this.slowCndResourcesThreshold = $.slowCndResourcesThreshold;
        this.slowFirstPartyResourcesThreshold = $.slowFirstPartyResourcesThreshold;
        this.slowThirdPartyResourcesThreshold = $.slowThirdPartyResourcesThreshold;
        this.speedIndexVisuallyCompleteRatioThreshold = $.speedIndexVisuallyCompleteRatioThreshold;
        this.uncompressedResourcesThreshold = $.uncompressedResourcesThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationWaterfallSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationWaterfallSettingsArgs $;

        public Builder() {
            $ = new WebApplicationWaterfallSettingsArgs();
        }

        public Builder(WebApplicationWaterfallSettingsArgs defaults) {
            $ = new WebApplicationWaterfallSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceBrowserCachingThreshold Warn about resources with a lower browser cache rate above *X*%. Values between 1 and 100 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourceBrowserCachingThreshold(Output<Integer> resourceBrowserCachingThreshold) {
            $.resourceBrowserCachingThreshold = resourceBrowserCachingThreshold;
            return this;
        }

        /**
         * @param resourceBrowserCachingThreshold Warn about resources with a lower browser cache rate above *X*%. Values between 1 and 100 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourceBrowserCachingThreshold(Integer resourceBrowserCachingThreshold) {
            return resourceBrowserCachingThreshold(Output.of(resourceBrowserCachingThreshold));
        }

        /**
         * @param resourcesThreshold Warn about resources larger than *X* bytes. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourcesThreshold(Output<Integer> resourcesThreshold) {
            $.resourcesThreshold = resourcesThreshold;
            return this;
        }

        /**
         * @param resourcesThreshold Warn about resources larger than *X* bytes. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourcesThreshold(Integer resourcesThreshold) {
            return resourcesThreshold(Output.of(resourcesThreshold));
        }

        /**
         * @param slowCndResourcesThreshold Warn about slow CDN resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder slowCndResourcesThreshold(Output<Integer> slowCndResourcesThreshold) {
            $.slowCndResourcesThreshold = slowCndResourcesThreshold;
            return this;
        }

        /**
         * @param slowCndResourcesThreshold Warn about slow CDN resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder slowCndResourcesThreshold(Integer slowCndResourcesThreshold) {
            return slowCndResourcesThreshold(Output.of(slowCndResourcesThreshold));
        }

        /**
         * @param slowFirstPartyResourcesThreshold Warn about slow 1st party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder slowFirstPartyResourcesThreshold(Output<Integer> slowFirstPartyResourcesThreshold) {
            $.slowFirstPartyResourcesThreshold = slowFirstPartyResourcesThreshold;
            return this;
        }

        /**
         * @param slowFirstPartyResourcesThreshold Warn about slow 1st party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder slowFirstPartyResourcesThreshold(Integer slowFirstPartyResourcesThreshold) {
            return slowFirstPartyResourcesThreshold(Output.of(slowFirstPartyResourcesThreshold));
        }

        /**
         * @param slowThirdPartyResourcesThreshold Warn about slow 3rd party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder slowThirdPartyResourcesThreshold(Output<Integer> slowThirdPartyResourcesThreshold) {
            $.slowThirdPartyResourcesThreshold = slowThirdPartyResourcesThreshold;
            return this;
        }

        /**
         * @param slowThirdPartyResourcesThreshold Warn about slow 3rd party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder slowThirdPartyResourcesThreshold(Integer slowThirdPartyResourcesThreshold) {
            return slowThirdPartyResourcesThreshold(Output.of(slowThirdPartyResourcesThreshold));
        }

        /**
         * @param speedIndexVisuallyCompleteRatioThreshold Warn if Speed index exceeds *X* % of Visually complete. Values between 1 and 99 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder speedIndexVisuallyCompleteRatioThreshold(Output<Integer> speedIndexVisuallyCompleteRatioThreshold) {
            $.speedIndexVisuallyCompleteRatioThreshold = speedIndexVisuallyCompleteRatioThreshold;
            return this;
        }

        /**
         * @param speedIndexVisuallyCompleteRatioThreshold Warn if Speed index exceeds *X* % of Visually complete. Values between 1 and 99 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder speedIndexVisuallyCompleteRatioThreshold(Integer speedIndexVisuallyCompleteRatioThreshold) {
            return speedIndexVisuallyCompleteRatioThreshold(Output.of(speedIndexVisuallyCompleteRatioThreshold));
        }

        /**
         * @param uncompressedResourcesThreshold Warn about uncompressed resources larger than *X* bytes. Values between 0 and 99999 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder uncompressedResourcesThreshold(Output<Integer> uncompressedResourcesThreshold) {
            $.uncompressedResourcesThreshold = uncompressedResourcesThreshold;
            return this;
        }

        /**
         * @param uncompressedResourcesThreshold Warn about uncompressed resources larger than *X* bytes. Values between 0 and 99999 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder uncompressedResourcesThreshold(Integer uncompressedResourcesThreshold) {
            return uncompressedResourcesThreshold(Output.of(uncompressedResourcesThreshold));
        }

        public WebApplicationWaterfallSettingsArgs build() {
            $.resourceBrowserCachingThreshold = Objects.requireNonNull($.resourceBrowserCachingThreshold, "expected parameter 'resourceBrowserCachingThreshold' to be non-null");
            $.resourcesThreshold = Objects.requireNonNull($.resourcesThreshold, "expected parameter 'resourcesThreshold' to be non-null");
            $.slowCndResourcesThreshold = Objects.requireNonNull($.slowCndResourcesThreshold, "expected parameter 'slowCndResourcesThreshold' to be non-null");
            $.slowFirstPartyResourcesThreshold = Objects.requireNonNull($.slowFirstPartyResourcesThreshold, "expected parameter 'slowFirstPartyResourcesThreshold' to be non-null");
            $.slowThirdPartyResourcesThreshold = Objects.requireNonNull($.slowThirdPartyResourcesThreshold, "expected parameter 'slowThirdPartyResourcesThreshold' to be non-null");
            $.speedIndexVisuallyCompleteRatioThreshold = Objects.requireNonNull($.speedIndexVisuallyCompleteRatioThreshold, "expected parameter 'speedIndexVisuallyCompleteRatioThreshold' to be non-null");
            $.uncompressedResourcesThreshold = Objects.requireNonNull($.uncompressedResourcesThreshold, "expected parameter 'uncompressedResourcesThreshold' to be non-null");
            return $;
        }
    }

}