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

    public sealed class SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockListRules", required: true)]
        private InputList<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs>? _blockListRules;
        public InputList<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs> BlockListRules
        {
            get => _blockListRules ?? (_blockListRules = new InputList<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs>());
            set => _blockListRules = value;
        }

        public SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesGetArgs()
        {
        }
        public static new SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesGetArgs Empty => new SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesGetArgs();
    }
}
