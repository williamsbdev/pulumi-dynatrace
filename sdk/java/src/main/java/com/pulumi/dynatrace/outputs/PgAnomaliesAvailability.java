// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PgAnomaliesAvailability {
    /**
     * @return How to monitor the availability of the process group:  * `PROCESS_IMPACT`: Alert if any process of the group becomes unavailable.  * `MINIMUM_THRESHOLD`: Alert if the number of active processes in the group falls below the specified threshold.  * `OFF`: Availability monitoring is disabled.
     * 
     */
    private String method;
    /**
     * @return Alert if the number of active processes in the group is lower than this value.
     * 
     */
    private @Nullable Integer minimumThreshold;

    private PgAnomaliesAvailability() {}
    /**
     * @return How to monitor the availability of the process group:  * `PROCESS_IMPACT`: Alert if any process of the group becomes unavailable.  * `MINIMUM_THRESHOLD`: Alert if the number of active processes in the group falls below the specified threshold.  * `OFF`: Availability monitoring is disabled.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Alert if the number of active processes in the group is lower than this value.
     * 
     */
    public Optional<Integer> minimumThreshold() {
        return Optional.ofNullable(this.minimumThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgAnomaliesAvailability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String method;
        private @Nullable Integer minimumThreshold;
        public Builder() {}
        public Builder(PgAnomaliesAvailability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.minimumThreshold = defaults.minimumThreshold;
        }

        @CustomType.Setter
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        @CustomType.Setter
        public Builder minimumThreshold(@Nullable Integer minimumThreshold) {
            this.minimumThreshold = minimumThreshold;
            return this;
        }
        public PgAnomaliesAvailability build() {
            final var o = new PgAnomaliesAvailability();
            o.method = method;
            o.minimumThreshold = minimumThreshold;
            return o;
        }
    }
}
