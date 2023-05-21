// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.UpdateWindowsDailyRecurrenceRecurrenceRange;
import com.pulumi.dynatrace.outputs.UpdateWindowsDailyRecurrenceUpdateTime;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class UpdateWindowsDailyRecurrence {
    private Integer every;
    private UpdateWindowsDailyRecurrenceRecurrenceRange recurrenceRange;
    private UpdateWindowsDailyRecurrenceUpdateTime updateTime;

    private UpdateWindowsDailyRecurrence() {}
    public Integer every() {
        return this.every;
    }
    public UpdateWindowsDailyRecurrenceRecurrenceRange recurrenceRange() {
        return this.recurrenceRange;
    }
    public UpdateWindowsDailyRecurrenceUpdateTime updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateWindowsDailyRecurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer every;
        private UpdateWindowsDailyRecurrenceRecurrenceRange recurrenceRange;
        private UpdateWindowsDailyRecurrenceUpdateTime updateTime;
        public Builder() {}
        public Builder(UpdateWindowsDailyRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.every = defaults.every;
    	      this.recurrenceRange = defaults.recurrenceRange;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder every(Integer every) {
            this.every = Objects.requireNonNull(every);
            return this;
        }
        @CustomType.Setter
        public Builder recurrenceRange(UpdateWindowsDailyRecurrenceRecurrenceRange recurrenceRange) {
            this.recurrenceRange = Objects.requireNonNull(recurrenceRange);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(UpdateWindowsDailyRecurrenceUpdateTime updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public UpdateWindowsDailyRecurrence build() {
            final var o = new UpdateWindowsDailyRecurrence();
            o.every = every;
            o.recurrenceRange = recurrenceRange;
            o.updateTime = updateTime;
            return o;
        }
    }
}
