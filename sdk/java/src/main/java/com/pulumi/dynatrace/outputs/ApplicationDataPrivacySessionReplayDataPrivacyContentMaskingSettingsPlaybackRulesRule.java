// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackRulesRule {
    private String selector;
    private String type;
    private @Nullable Boolean userInteractionHidden;

    private ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackRulesRule() {}
    public String selector() {
        return this.selector;
    }
    public String type() {
        return this.type;
    }
    public Optional<Boolean> userInteractionHidden() {
        return Optional.ofNullable(this.userInteractionHidden);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String selector;
        private String type;
        private @Nullable Boolean userInteractionHidden;
        public Builder() {}
        public Builder(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selector = defaults.selector;
    	      this.type = defaults.type;
    	      this.userInteractionHidden = defaults.userInteractionHidden;
        }

        @CustomType.Setter
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder userInteractionHidden(@Nullable Boolean userInteractionHidden) {
            this.userInteractionHidden = userInteractionHidden;
            return this;
        }
        public ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackRulesRule build() {
            final var o = new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackRulesRule();
            o.selector = selector;
            o.type = type;
            o.userInteractionHidden = userInteractionHidden;
            return o;
        }
    }
}