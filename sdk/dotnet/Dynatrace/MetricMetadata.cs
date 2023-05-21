// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/metricMetadata:MetricMetadata")]
    public partial class MetricMetadata : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Define metadata per metric dimension.
        /// </summary>
        [Output("dimensions")]
        public Output<Outputs.MetricMetadataDimensions?> Dimensions { get; private set; } = null!;

        /// <summary>
        /// Display name
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The scope of this setting (metric)
        /// </summary>
        [Output("metricId")]
        public Output<string> MetricId { get; private set; } = null!;

        /// <summary>
        /// Metric properties
        /// </summary>
        [Output("metricProperties")]
        public Output<Outputs.MetricMetadataMetricProperties?> MetricProperties { get; private set; } = null!;

        /// <summary>
        /// Specifies which entity dimension should be used as the primary dimension. The property can only be configured for metrics ingested with the Metrics API.
        /// </summary>
        [Output("sourceEntityType")]
        public Output<string?> SourceEntityType { get; private set; } = null!;

        /// <summary>
        /// Tags
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Unit
        /// </summary>
        [Output("unit")]
        public Output<string> Unit { get; private set; } = null!;

        /// <summary>
        /// The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:
        /// </summary>
        [Output("unitDisplayFormat")]
        public Output<string?> UnitDisplayFormat { get; private set; } = null!;


        /// <summary>
        /// Create a MetricMetadata resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetricMetadata(string name, MetricMetadataArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/metricMetadata:MetricMetadata", name, args ?? new MetricMetadataArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetricMetadata(string name, Input<string> id, MetricMetadataState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/metricMetadata:MetricMetadata", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MetricMetadata resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetricMetadata Get(string name, Input<string> id, MetricMetadataState? state = null, CustomResourceOptions? options = null)
        {
            return new MetricMetadata(name, id, state, options);
        }
    }

    public sealed class MetricMetadataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Define metadata per metric dimension.
        /// </summary>
        [Input("dimensions")]
        public Input<Inputs.MetricMetadataDimensionsArgs>? Dimensions { get; set; }

        /// <summary>
        /// Display name
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The scope of this setting (metric)
        /// </summary>
        [Input("metricId", required: true)]
        public Input<string> MetricId { get; set; } = null!;

        /// <summary>
        /// Metric properties
        /// </summary>
        [Input("metricProperties")]
        public Input<Inputs.MetricMetadataMetricPropertiesArgs>? MetricProperties { get; set; }

        /// <summary>
        /// Specifies which entity dimension should be used as the primary dimension. The property can only be configured for metrics ingested with the Metrics API.
        /// </summary>
        [Input("sourceEntityType")]
        public Input<string>? SourceEntityType { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Unit
        /// </summary>
        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        /// <summary>
        /// The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:
        /// </summary>
        [Input("unitDisplayFormat")]
        public Input<string>? UnitDisplayFormat { get; set; }

        public MetricMetadataArgs()
        {
        }
        public static new MetricMetadataArgs Empty => new MetricMetadataArgs();
    }

    public sealed class MetricMetadataState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Define metadata per metric dimension.
        /// </summary>
        [Input("dimensions")]
        public Input<Inputs.MetricMetadataDimensionsGetArgs>? Dimensions { get; set; }

        /// <summary>
        /// Display name
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The scope of this setting (metric)
        /// </summary>
        [Input("metricId")]
        public Input<string>? MetricId { get; set; }

        /// <summary>
        /// Metric properties
        /// </summary>
        [Input("metricProperties")]
        public Input<Inputs.MetricMetadataMetricPropertiesGetArgs>? MetricProperties { get; set; }

        /// <summary>
        /// Specifies which entity dimension should be used as the primary dimension. The property can only be configured for metrics ingested with the Metrics API.
        /// </summary>
        [Input("sourceEntityType")]
        public Input<string>? SourceEntityType { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Unit
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        /// <summary>
        /// The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:
        /// </summary>
        [Input("unitDisplayFormat")]
        public Input<string>? UnitDisplayFormat { get; set; }

        public MetricMetadataState()
        {
        }
        public static new MetricMetadataState Empty => new MetricMetadataState();
    }
}