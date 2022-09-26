// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationConversionGoalsGoal;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebApplicationConversionGoals {
    /**
     * @return A conversion goal of the application
     * 
     */
    private List<WebApplicationConversionGoalsGoal> goals;

    private WebApplicationConversionGoals() {}
    /**
     * @return A conversion goal of the application
     * 
     */
    public List<WebApplicationConversionGoalsGoal> goals() {
        return this.goals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationConversionGoals defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebApplicationConversionGoalsGoal> goals;
        public Builder() {}
        public Builder(WebApplicationConversionGoals defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goals = defaults.goals;
        }

        @CustomType.Setter
        public Builder goals(List<WebApplicationConversionGoalsGoal> goals) {
            this.goals = Objects.requireNonNull(goals);
            return this;
        }
        public Builder goals(WebApplicationConversionGoalsGoal... goals) {
            return goals(List.of(goals));
        }
        public WebApplicationConversionGoals build() {
            final var o = new WebApplicationConversionGoals();
            o.goals = goals;
            return o;
        }
    }
}