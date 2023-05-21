// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationDataPrivacySessionReplayDataPrivacyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDataPrivacySessionReplayDataPrivacyArgs Empty = new ApplicationDataPrivacySessionReplayDataPrivacyArgs();

    /**
     * (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Content masking settings for Session Replay.
     * 
     */
    @Import(name="contentMaskingSettings", required=true)
    private Output<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs> contentMaskingSettings;

    /**
     * @return (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Content masking settings for Session Replay.
     * 
     */
    public Output<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs> contentMaskingSettings() {
        return this.contentMaskingSettings;
    }

    @Import(name="optIn")
    private @Nullable Output<Boolean> optIn;

    public Optional<Output<Boolean>> optIn() {
        return Optional.ofNullable(this.optIn);
    }

    @Import(name="urlExclusionRules")
    private @Nullable Output<List<String>> urlExclusionRules;

    public Optional<Output<List<String>>> urlExclusionRules() {
        return Optional.ofNullable(this.urlExclusionRules);
    }

    private ApplicationDataPrivacySessionReplayDataPrivacyArgs() {}

    private ApplicationDataPrivacySessionReplayDataPrivacyArgs(ApplicationDataPrivacySessionReplayDataPrivacyArgs $) {
        this.contentMaskingSettings = $.contentMaskingSettings;
        this.optIn = $.optIn;
        this.urlExclusionRules = $.urlExclusionRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDataPrivacySessionReplayDataPrivacyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDataPrivacySessionReplayDataPrivacyArgs $;

        public Builder() {
            $ = new ApplicationDataPrivacySessionReplayDataPrivacyArgs();
        }

        public Builder(ApplicationDataPrivacySessionReplayDataPrivacyArgs defaults) {
            $ = new ApplicationDataPrivacySessionReplayDataPrivacyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentMaskingSettings (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Content masking settings for Session Replay.
         * 
         * @return builder
         * 
         */
        public Builder contentMaskingSettings(Output<ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs> contentMaskingSettings) {
            $.contentMaskingSettings = contentMaskingSettings;
            return this;
        }

        /**
         * @param contentMaskingSettings (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Content masking settings for Session Replay.
         * 
         * @return builder
         * 
         */
        public Builder contentMaskingSettings(ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs contentMaskingSettings) {
            return contentMaskingSettings(Output.of(contentMaskingSettings));
        }

        public Builder optIn(@Nullable Output<Boolean> optIn) {
            $.optIn = optIn;
            return this;
        }

        public Builder optIn(Boolean optIn) {
            return optIn(Output.of(optIn));
        }

        public Builder urlExclusionRules(@Nullable Output<List<String>> urlExclusionRules) {
            $.urlExclusionRules = urlExclusionRules;
            return this;
        }

        public Builder urlExclusionRules(List<String> urlExclusionRules) {
            return urlExclusionRules(Output.of(urlExclusionRules));
        }

        public Builder urlExclusionRules(String... urlExclusionRules) {
            return urlExclusionRules(List.of(urlExclusionRules));
        }

        public ApplicationDataPrivacySessionReplayDataPrivacyArgs build() {
            $.contentMaskingSettings = Objects.requireNonNull($.contentMaskingSettings, "expected parameter 'contentMaskingSettings' to be non-null");
            return $;
        }
    }

}
