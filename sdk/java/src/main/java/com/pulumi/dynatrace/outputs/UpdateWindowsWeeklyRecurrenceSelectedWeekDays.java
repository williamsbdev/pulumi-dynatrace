// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class UpdateWindowsWeeklyRecurrenceSelectedWeekDays {
    private Boolean friday;
    private Boolean monday;
    private Boolean saturday;
    private Boolean sunday;
    private Boolean thursday;
    private Boolean tuesday;
    private Boolean wednesday;

    private UpdateWindowsWeeklyRecurrenceSelectedWeekDays() {}
    public Boolean friday() {
        return this.friday;
    }
    public Boolean monday() {
        return this.monday;
    }
    public Boolean saturday() {
        return this.saturday;
    }
    public Boolean sunday() {
        return this.sunday;
    }
    public Boolean thursday() {
        return this.thursday;
    }
    public Boolean tuesday() {
        return this.tuesday;
    }
    public Boolean wednesday() {
        return this.wednesday;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateWindowsWeeklyRecurrenceSelectedWeekDays defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean friday;
        private Boolean monday;
        private Boolean saturday;
        private Boolean sunday;
        private Boolean thursday;
        private Boolean tuesday;
        private Boolean wednesday;
        public Builder() {}
        public Builder(UpdateWindowsWeeklyRecurrenceSelectedWeekDays defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friday = defaults.friday;
    	      this.monday = defaults.monday;
    	      this.saturday = defaults.saturday;
    	      this.sunday = defaults.sunday;
    	      this.thursday = defaults.thursday;
    	      this.tuesday = defaults.tuesday;
    	      this.wednesday = defaults.wednesday;
        }

        @CustomType.Setter
        public Builder friday(Boolean friday) {
            this.friday = Objects.requireNonNull(friday);
            return this;
        }
        @CustomType.Setter
        public Builder monday(Boolean monday) {
            this.monday = Objects.requireNonNull(monday);
            return this;
        }
        @CustomType.Setter
        public Builder saturday(Boolean saturday) {
            this.saturday = Objects.requireNonNull(saturday);
            return this;
        }
        @CustomType.Setter
        public Builder sunday(Boolean sunday) {
            this.sunday = Objects.requireNonNull(sunday);
            return this;
        }
        @CustomType.Setter
        public Builder thursday(Boolean thursday) {
            this.thursday = Objects.requireNonNull(thursday);
            return this;
        }
        @CustomType.Setter
        public Builder tuesday(Boolean tuesday) {
            this.tuesday = Objects.requireNonNull(tuesday);
            return this;
        }
        @CustomType.Setter
        public Builder wednesday(Boolean wednesday) {
            this.wednesday = Objects.requireNonNull(wednesday);
            return this;
        }
        public UpdateWindowsWeeklyRecurrenceSelectedWeekDays build() {
            final var o = new UpdateWindowsWeeklyRecurrenceSelectedWeekDays();
            o.friday = friday;
            o.monday = monday;
            o.saturday = saturday;
            o.sunday = sunday;
            o.thursday = thursday;
            o.tuesday = tuesday;
            o.wednesday = wednesday;
            return o;
        }
    }
}
