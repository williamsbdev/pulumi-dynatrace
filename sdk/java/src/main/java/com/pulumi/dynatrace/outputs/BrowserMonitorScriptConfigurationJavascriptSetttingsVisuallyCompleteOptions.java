// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions {
    private @Nullable List<String> excludedElements;
    private @Nullable List<String> excludedUrls;
    private Integer imageSizeThreshold;
    private Integer inactivityTimeout;
    private Integer mutationTimeout;

    private BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions() {}
    public List<String> excludedElements() {
        return this.excludedElements == null ? List.of() : this.excludedElements;
    }
    public List<String> excludedUrls() {
        return this.excludedUrls == null ? List.of() : this.excludedUrls;
    }
    public Integer imageSizeThreshold() {
        return this.imageSizeThreshold;
    }
    public Integer inactivityTimeout() {
        return this.inactivityTimeout;
    }
    public Integer mutationTimeout() {
        return this.mutationTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> excludedElements;
        private @Nullable List<String> excludedUrls;
        private Integer imageSizeThreshold;
        private Integer inactivityTimeout;
        private Integer mutationTimeout;
        public Builder() {}
        public Builder(BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedElements = defaults.excludedElements;
    	      this.excludedUrls = defaults.excludedUrls;
    	      this.imageSizeThreshold = defaults.imageSizeThreshold;
    	      this.inactivityTimeout = defaults.inactivityTimeout;
    	      this.mutationTimeout = defaults.mutationTimeout;
        }

        @CustomType.Setter
        public Builder excludedElements(@Nullable List<String> excludedElements) {
            this.excludedElements = excludedElements;
            return this;
        }
        public Builder excludedElements(String... excludedElements) {
            return excludedElements(List.of(excludedElements));
        }
        @CustomType.Setter
        public Builder excludedUrls(@Nullable List<String> excludedUrls) {
            this.excludedUrls = excludedUrls;
            return this;
        }
        public Builder excludedUrls(String... excludedUrls) {
            return excludedUrls(List.of(excludedUrls));
        }
        @CustomType.Setter
        public Builder imageSizeThreshold(Integer imageSizeThreshold) {
            this.imageSizeThreshold = Objects.requireNonNull(imageSizeThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder inactivityTimeout(Integer inactivityTimeout) {
            this.inactivityTimeout = Objects.requireNonNull(inactivityTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder mutationTimeout(Integer mutationTimeout) {
            this.mutationTimeout = Objects.requireNonNull(mutationTimeout);
            return this;
        }
        public BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions build() {
            final var o = new BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions();
            o.excludedElements = excludedElements;
            o.excludedUrls = excludedUrls;
            o.imageSizeThreshold = imageSizeThreshold;
            o.inactivityTimeout = inactivityTimeout;
            o.mutationTimeout = mutationTimeout;
            return o;
        }
    }
}