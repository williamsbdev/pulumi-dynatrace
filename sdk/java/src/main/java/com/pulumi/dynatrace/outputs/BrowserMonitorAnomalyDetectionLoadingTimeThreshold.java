// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorAnomalyDetectionLoadingTimeThresholdThreshold;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorAnomalyDetectionLoadingTimeThreshold {
    private @Nullable Boolean enabled;
    private @Nullable List<BrowserMonitorAnomalyDetectionLoadingTimeThresholdThreshold> thresholds;

    private BrowserMonitorAnomalyDetectionLoadingTimeThreshold() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<BrowserMonitorAnomalyDetectionLoadingTimeThresholdThreshold> thresholds() {
        return this.thresholds == null ? List.of() : this.thresholds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorAnomalyDetectionLoadingTimeThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<BrowserMonitorAnomalyDetectionLoadingTimeThresholdThreshold> thresholds;
        public Builder() {}
        public Builder(BrowserMonitorAnomalyDetectionLoadingTimeThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.thresholds = defaults.thresholds;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder thresholds(@Nullable List<BrowserMonitorAnomalyDetectionLoadingTimeThresholdThreshold> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public Builder thresholds(BrowserMonitorAnomalyDetectionLoadingTimeThresholdThreshold... thresholds) {
            return thresholds(List.of(thresholds));
        }
        public BrowserMonitorAnomalyDetectionLoadingTimeThreshold build() {
            final var o = new BrowserMonitorAnomalyDetectionLoadingTimeThreshold();
            o.enabled = enabled;
            o.thresholds = thresholds;
            return o;
        }
    }
}