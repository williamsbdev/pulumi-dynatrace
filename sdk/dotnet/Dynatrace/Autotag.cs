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
    [DynatraceResourceType("dynatrace:index/autotag:Autotag")]
    public partial class Autotag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the auto-tag.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        /// </summary>
        [Output("entitySelectorBasedRules")]
        public Output<ImmutableArray<Outputs.AutotagEntitySelectorBasedRule>> EntitySelectorBasedRules { get; private set; } = null!;

        /// <summary>
        /// The name of the auto-tag, which is applied to entities. Additionally you can specify a **valueFormat** in the tag rule.
        /// In that case the tag is used in the `name:valueFormat` format. For example you can extend the `Infrastructure` tag to
        /// `Infrastructure:Windows` and `Infrastructure:Linux`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.AutotagRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Output("unknowns")]
        public Output<string?> Unknowns { get; private set; } = null!;


        /// <summary>
        /// Create a Autotag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Autotag(string name, AutotagArgs? args = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/autotag:Autotag", name, args ?? new AutotagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Autotag(string name, Input<string> id, AutotagState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/autotag:Autotag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Autotag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Autotag Get(string name, Input<string> id, AutotagState? state = null, CustomResourceOptions? options = null)
        {
            return new Autotag(name, id, state, options);
        }
    }

    public sealed class AutotagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the auto-tag.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entitySelectorBasedRules")]
        private InputList<Inputs.AutotagEntitySelectorBasedRuleArgs>? _entitySelectorBasedRules;

        /// <summary>
        /// A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        /// </summary>
        public InputList<Inputs.AutotagEntitySelectorBasedRuleArgs> EntitySelectorBasedRules
        {
            get => _entitySelectorBasedRules ?? (_entitySelectorBasedRules = new InputList<Inputs.AutotagEntitySelectorBasedRuleArgs>());
            set => _entitySelectorBasedRules = value;
        }

        /// <summary>
        /// The name of the auto-tag, which is applied to entities. Additionally you can specify a **valueFormat** in the tag rule.
        /// In that case the tag is used in the `name:valueFormat` format. For example you can extend the `Infrastructure` tag to
        /// `Infrastructure:Windows` and `Infrastructure:Linux`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.AutotagRuleArgs>? _rules;

        /// <summary>
        /// A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        /// </summary>
        public InputList<Inputs.AutotagRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AutotagRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public AutotagArgs()
        {
        }
        public static new AutotagArgs Empty => new AutotagArgs();
    }

    public sealed class AutotagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the auto-tag.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entitySelectorBasedRules")]
        private InputList<Inputs.AutotagEntitySelectorBasedRuleGetArgs>? _entitySelectorBasedRules;

        /// <summary>
        /// A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        /// </summary>
        public InputList<Inputs.AutotagEntitySelectorBasedRuleGetArgs> EntitySelectorBasedRules
        {
            get => _entitySelectorBasedRules ?? (_entitySelectorBasedRules = new InputList<Inputs.AutotagEntitySelectorBasedRuleGetArgs>());
            set => _entitySelectorBasedRules = value;
        }

        /// <summary>
        /// The name of the auto-tag, which is applied to entities. Additionally you can specify a **valueFormat** in the tag rule.
        /// In that case the tag is used in the `name:valueFormat` format. For example you can extend the `Infrastructure` tag to
        /// `Infrastructure:Windows` and `Infrastructure:Linux`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.AutotagRuleGetArgs>? _rules;

        /// <summary>
        /// A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        /// </summary>
        public InputList<Inputs.AutotagRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AutotagRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public AutotagState()
        {
        }
        public static new AutotagState Empty => new AutotagState();
    }
}
