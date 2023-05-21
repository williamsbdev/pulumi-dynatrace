// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebAppAnomaliesTrafficSpikesTrafficSpikes;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAppAnomaliesTrafficSpikes {
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    private Boolean enabled;
    /**
     * @return Dynatrace learns your typical application traffic over an observation period of one week.
     * 
     */
    private @Nullable WebAppAnomaliesTrafficSpikesTrafficSpikes trafficSpikes;

    private WebAppAnomaliesTrafficSpikes() {}
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Dynatrace learns your typical application traffic over an observation period of one week.
     * 
     */
    public Optional<WebAppAnomaliesTrafficSpikesTrafficSpikes> trafficSpikes() {
        return Optional.ofNullable(this.trafficSpikes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppAnomaliesTrafficSpikes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable WebAppAnomaliesTrafficSpikesTrafficSpikes trafficSpikes;
        public Builder() {}
        public Builder(WebAppAnomaliesTrafficSpikes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.trafficSpikes = defaults.trafficSpikes;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder trafficSpikes(@Nullable WebAppAnomaliesTrafficSpikesTrafficSpikes trafficSpikes) {
            this.trafficSpikes = trafficSpikes;
            return this;
        }
        public WebAppAnomaliesTrafficSpikes build() {
            final var o = new WebAppAnomaliesTrafficSpikes();
            o.enabled = enabled;
            o.trafficSpikes = trafficSpikes;
            return o;
        }
    }
}