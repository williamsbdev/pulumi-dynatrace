// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs;
import com.pulumi.dynatrace.inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesArgs;
import com.pulumi.dynatrace.inputs.SessionReplayWebPrivacyMaskingPresetsRecordingMaskingAllowListRulesArgs;
import com.pulumi.dynatrace.inputs.SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SessionReplayWebPrivacyMaskingPresetsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SessionReplayWebPrivacyMaskingPresetsArgs Empty = new SessionReplayWebPrivacyMaskingPresetsArgs();

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    @Import(name="playbackMaskingAllowListRules")
    private @Nullable Output<SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs> playbackMaskingAllowListRules;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    public Optional<Output<SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs>> playbackMaskingAllowListRules() {
        return Optional.ofNullable(this.playbackMaskingAllowListRules);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    @Import(name="playbackMaskingBlockListRules")
    private @Nullable Output<SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesArgs> playbackMaskingBlockListRules;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    public Optional<Output<SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesArgs>> playbackMaskingBlockListRules() {
        return Optional.ofNullable(this.playbackMaskingBlockListRules);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_ALL`, `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`
     * 
     */
    @Import(name="playbackMaskingPreset", required=true)
    private Output<String> playbackMaskingPreset;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_ALL`, `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`
     * 
     */
    public Output<String> playbackMaskingPreset() {
        return this.playbackMaskingPreset;
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    @Import(name="recordingMaskingAllowListRules")
    private @Nullable Output<SessionReplayWebPrivacyMaskingPresetsRecordingMaskingAllowListRulesArgs> recordingMaskingAllowListRules;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    public Optional<Output<SessionReplayWebPrivacyMaskingPresetsRecordingMaskingAllowListRulesArgs>> recordingMaskingAllowListRules() {
        return Optional.ofNullable(this.recordingMaskingAllowListRules);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    @Import(name="recordingMaskingBlockListRules")
    private @Nullable Output<SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesArgs> recordingMaskingBlockListRules;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
     * 
     */
    public Optional<Output<SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesArgs>> recordingMaskingBlockListRules() {
        return Optional.ofNullable(this.recordingMaskingBlockListRules);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`, `MASK_ALL`
     * 
     */
    @Import(name="recordingMaskingPreset", required=true)
    private Output<String> recordingMaskingPreset;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`, `MASK_ALL`
     * 
     */
    public Output<String> recordingMaskingPreset() {
        return this.recordingMaskingPreset;
    }

    private SessionReplayWebPrivacyMaskingPresetsArgs() {}

    private SessionReplayWebPrivacyMaskingPresetsArgs(SessionReplayWebPrivacyMaskingPresetsArgs $) {
        this.playbackMaskingAllowListRules = $.playbackMaskingAllowListRules;
        this.playbackMaskingBlockListRules = $.playbackMaskingBlockListRules;
        this.playbackMaskingPreset = $.playbackMaskingPreset;
        this.recordingMaskingAllowListRules = $.recordingMaskingAllowListRules;
        this.recordingMaskingBlockListRules = $.recordingMaskingBlockListRules;
        this.recordingMaskingPreset = $.recordingMaskingPreset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SessionReplayWebPrivacyMaskingPresetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SessionReplayWebPrivacyMaskingPresetsArgs $;

        public Builder() {
            $ = new SessionReplayWebPrivacyMaskingPresetsArgs();
        }

        public Builder(SessionReplayWebPrivacyMaskingPresetsArgs defaults) {
            $ = new SessionReplayWebPrivacyMaskingPresetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param playbackMaskingAllowListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder playbackMaskingAllowListRules(@Nullable Output<SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs> playbackMaskingAllowListRules) {
            $.playbackMaskingAllowListRules = playbackMaskingAllowListRules;
            return this;
        }

        /**
         * @param playbackMaskingAllowListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder playbackMaskingAllowListRules(SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs playbackMaskingAllowListRules) {
            return playbackMaskingAllowListRules(Output.of(playbackMaskingAllowListRules));
        }

        /**
         * @param playbackMaskingBlockListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder playbackMaskingBlockListRules(@Nullable Output<SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesArgs> playbackMaskingBlockListRules) {
            $.playbackMaskingBlockListRules = playbackMaskingBlockListRules;
            return this;
        }

        /**
         * @param playbackMaskingBlockListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder playbackMaskingBlockListRules(SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesArgs playbackMaskingBlockListRules) {
            return playbackMaskingBlockListRules(Output.of(playbackMaskingBlockListRules));
        }

        /**
         * @param playbackMaskingPreset (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_ALL`, `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`
         * 
         * @return builder
         * 
         */
        public Builder playbackMaskingPreset(Output<String> playbackMaskingPreset) {
            $.playbackMaskingPreset = playbackMaskingPreset;
            return this;
        }

        /**
         * @param playbackMaskingPreset (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_ALL`, `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`
         * 
         * @return builder
         * 
         */
        public Builder playbackMaskingPreset(String playbackMaskingPreset) {
            return playbackMaskingPreset(Output.of(playbackMaskingPreset));
        }

        /**
         * @param recordingMaskingAllowListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder recordingMaskingAllowListRules(@Nullable Output<SessionReplayWebPrivacyMaskingPresetsRecordingMaskingAllowListRulesArgs> recordingMaskingAllowListRules) {
            $.recordingMaskingAllowListRules = recordingMaskingAllowListRules;
            return this;
        }

        /**
         * @param recordingMaskingAllowListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder recordingMaskingAllowListRules(SessionReplayWebPrivacyMaskingPresetsRecordingMaskingAllowListRulesArgs recordingMaskingAllowListRules) {
            return recordingMaskingAllowListRules(Output.of(recordingMaskingAllowListRules));
        }

        /**
         * @param recordingMaskingBlockListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder recordingMaskingBlockListRules(@Nullable Output<SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesArgs> recordingMaskingBlockListRules) {
            $.recordingMaskingBlockListRules = recordingMaskingBlockListRules;
            return this;
        }

        /**
         * @param recordingMaskingBlockListRules (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
         * 
         * @return builder
         * 
         */
        public Builder recordingMaskingBlockListRules(SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesArgs recordingMaskingBlockListRules) {
            return recordingMaskingBlockListRules(Output.of(recordingMaskingBlockListRules));
        }

        /**
         * @param recordingMaskingPreset (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`, `MASK_ALL`
         * 
         * @return builder
         * 
         */
        public Builder recordingMaskingPreset(Output<String> recordingMaskingPreset) {
            $.recordingMaskingPreset = recordingMaskingPreset;
            return this;
        }

        /**
         * @param recordingMaskingPreset (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`, `MASK_ALL`
         * 
         * @return builder
         * 
         */
        public Builder recordingMaskingPreset(String recordingMaskingPreset) {
            return recordingMaskingPreset(Output.of(recordingMaskingPreset));
        }

        public SessionReplayWebPrivacyMaskingPresetsArgs build() {
            $.playbackMaskingPreset = Objects.requireNonNull($.playbackMaskingPreset, "expected parameter 'playbackMaskingPreset' to be non-null");
            $.recordingMaskingPreset = Objects.requireNonNull($.recordingMaskingPreset, "expected parameter 'recordingMaskingPreset' to be non-null");
            return $;
        }
    }

}
