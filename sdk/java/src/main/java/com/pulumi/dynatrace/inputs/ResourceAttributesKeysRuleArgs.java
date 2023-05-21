// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResourceAttributesKeysRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceAttributesKeysRuleArgs Empty = new ResourceAttributesKeysRuleArgs();

    @Import(name="attributeKey", required=true)
    private Output<String> attributeKey;

    public Output<String> attributeKey() {
        return this.attributeKey;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="masking", required=true)
    private Output<String> masking;

    public Output<String> masking() {
        return this.masking;
    }

    private ResourceAttributesKeysRuleArgs() {}

    private ResourceAttributesKeysRuleArgs(ResourceAttributesKeysRuleArgs $) {
        this.attributeKey = $.attributeKey;
        this.enabled = $.enabled;
        this.masking = $.masking;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceAttributesKeysRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceAttributesKeysRuleArgs $;

        public Builder() {
            $ = new ResourceAttributesKeysRuleArgs();
        }

        public Builder(ResourceAttributesKeysRuleArgs defaults) {
            $ = new ResourceAttributesKeysRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributeKey(Output<String> attributeKey) {
            $.attributeKey = attributeKey;
            return this;
        }

        public Builder attributeKey(String attributeKey) {
            return attributeKey(Output.of(attributeKey));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder masking(Output<String> masking) {
            $.masking = masking;
            return this;
        }

        public Builder masking(String masking) {
            return masking(Output.of(masking));
        }

        public ResourceAttributesKeysRuleArgs build() {
            $.attributeKey = Objects.requireNonNull($.attributeKey, "expected parameter 'attributeKey' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.masking = Objects.requireNonNull($.masking, "expected parameter 'masking' to be non-null");
            return $;
        }
    }

}
