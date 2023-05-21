// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class SessionReplayWebPrivacyMaskingPresetsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
        /// </summary>
        [Input("playbackMaskingAllowListRules")]
        public Input<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs>? PlaybackMaskingAllowListRules { get; set; }

        /// <summary>
        /// (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
        /// </summary>
        [Input("playbackMaskingBlockListRules")]
        public Input<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesArgs>? PlaybackMaskingBlockListRules { get; set; }

        /// <summary>
        /// (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_ALL`, `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`
        /// </summary>
        [Input("playbackMaskingPreset", required: true)]
        public Input<string> PlaybackMaskingPreset { get; set; } = null!;

        /// <summary>
        /// (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
        /// </summary>
        [Input("recordingMaskingAllowListRules")]
        public Input<Inputs.SessionReplayWebPrivacyMaskingPresetsRecordingMaskingAllowListRulesArgs>? RecordingMaskingAllowListRules { get; set; }

        /// <summary>
        /// (Field has overlap with `dynatrace.ApplicationDataPrivacy`) The elements are defined by the CSS selector or attribute name.
        /// </summary>
        [Input("recordingMaskingBlockListRules")]
        public Input<Inputs.SessionReplayWebPrivacyMaskingPresetsRecordingMaskingBlockListRulesArgs>? RecordingMaskingBlockListRules { get; set; }

        /// <summary>
        /// (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Possible Values: `MASK_USER_INPUT`, `ALLOW_LIST`, `BLOCK_LIST`, `MASK_ALL`
        /// </summary>
        [Input("recordingMaskingPreset", required: true)]
        public Input<string> RecordingMaskingPreset { get; set; } = null!;

        public SessionReplayWebPrivacyMaskingPresetsArgs()
        {
        }
        public static new SessionReplayWebPrivacyMaskingPresetsArgs Empty => new SessionReplayWebPrivacyMaskingPresetsArgs();
    }
}
