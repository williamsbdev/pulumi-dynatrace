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

    public sealed class FailureDetectionRulesConditionsConditionPredicateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("caseSensitive")]
        public Input<bool>? CaseSensitive { get; set; }

        [Input("managementZones")]
        private InputList<string>? _managementZones;
        public InputList<string> ManagementZones
        {
            get => _managementZones ?? (_managementZones = new InputList<string>());
            set => _managementZones = value;
        }

        [Input("predicateType", required: true)]
        public Input<string> PredicateType { get; set; } = null!;

        [Input("serviceTypes")]
        private InputList<string>? _serviceTypes;
        public InputList<string> ServiceTypes
        {
            get => _serviceTypes ?? (_serviceTypes = new InputList<string>());
            set => _serviceTypes = value;
        }

        [Input("tagKeys")]
        private InputList<string>? _tagKeys;
        public InputList<string> TagKeys
        {
            get => _tagKeys ?? (_tagKeys = new InputList<string>());
            set => _tagKeys = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("textValues")]
        private InputList<string>? _textValues;
        public InputList<string> TextValues
        {
            get => _textValues ?? (_textValues = new InputList<string>());
            set => _textValues = value;
        }

        public FailureDetectionRulesConditionsConditionPredicateGetArgs()
        {
        }
        public static new FailureDetectionRulesConditionsConditionPredicateGetArgs Empty => new FailureDetectionRulesConditionsConditionPredicateGetArgs();
    }
}