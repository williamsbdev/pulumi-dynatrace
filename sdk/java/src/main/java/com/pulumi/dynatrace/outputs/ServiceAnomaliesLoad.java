// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceAnomaliesLoadDrops;
import com.pulumi.dynatrace.outputs.ServiceAnomaliesLoadSpikes;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAnomaliesLoad {
    /**
     * @return The configuration of traffic drops detection
     * 
     */
    private @Nullable ServiceAnomaliesLoadDrops drops;
    /**
     * @return The configuration of traffic spikes detection
     * 
     */
    private @Nullable ServiceAnomaliesLoadSpikes spikes;

    private ServiceAnomaliesLoad() {}
    /**
     * @return The configuration of traffic drops detection
     * 
     */
    public Optional<ServiceAnomaliesLoadDrops> drops() {
        return Optional.ofNullable(this.drops);
    }
    /**
     * @return The configuration of traffic spikes detection
     * 
     */
    public Optional<ServiceAnomaliesLoadSpikes> spikes() {
        return Optional.ofNullable(this.spikes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAnomaliesLoad defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceAnomaliesLoadDrops drops;
        private @Nullable ServiceAnomaliesLoadSpikes spikes;
        public Builder() {}
        public Builder(ServiceAnomaliesLoad defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drops = defaults.drops;
    	      this.spikes = defaults.spikes;
        }

        @CustomType.Setter
        public Builder drops(@Nullable ServiceAnomaliesLoadDrops drops) {
            this.drops = drops;
            return this;
        }
        @CustomType.Setter
        public Builder spikes(@Nullable ServiceAnomaliesLoadSpikes spikes) {
            this.spikes = spikes;
            return this;
        }
        public ServiceAnomaliesLoad build() {
            final var o = new ServiceAnomaliesLoad();
            o.drops = drops;
            o.spikes = spikes;
            return o;
        }
    }
}