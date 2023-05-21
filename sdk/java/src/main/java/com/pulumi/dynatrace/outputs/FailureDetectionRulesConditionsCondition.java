// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.FailureDetectionRulesConditionsConditionPredicate;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FailureDetectionRulesConditionsCondition {
    private String attribute;
    private FailureDetectionRulesConditionsConditionPredicate predicate;

    private FailureDetectionRulesConditionsCondition() {}
    public String attribute() {
        return this.attribute;
    }
    public FailureDetectionRulesConditionsConditionPredicate predicate() {
        return this.predicate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureDetectionRulesConditionsCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attribute;
        private FailureDetectionRulesConditionsConditionPredicate predicate;
        public Builder() {}
        public Builder(FailureDetectionRulesConditionsCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.predicate = defaults.predicate;
        }

        @CustomType.Setter
        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        @CustomType.Setter
        public Builder predicate(FailureDetectionRulesConditionsConditionPredicate predicate) {
            this.predicate = Objects.requireNonNull(predicate);
            return this;
        }
        public FailureDetectionRulesConditionsCondition build() {
            final var o = new FailureDetectionRulesConditionsCondition();
            o.attribute = attribute;
            o.predicate = predicate;
            return o;
        }
    }
}
