// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostConnectionLostDetection;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostHighCpuSaturationDetection;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostHighGcActivityDetection;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostHighMemoryDetection;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostHighSystemLoadDetection;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostOutOfMemoryDetection;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostOutOfThreadsDetection;
import java.util.Objects;

@CustomType
public final class HostAnomaliesV2Host {
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostConnectionLostDetection connectionLostDetection;
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostHighCpuSaturationDetection highCpuSaturationDetection;
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostHighGcActivityDetection highGcActivityDetection;
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostHighMemoryDetection highMemoryDetection;
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostHighSystemLoadDetection highSystemLoadDetection;
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostOutOfMemoryDetection outOfMemoryDetection;
    /**
     * @return no documentation available
     * 
     */
    private HostAnomaliesV2HostOutOfThreadsDetection outOfThreadsDetection;

    private HostAnomaliesV2Host() {}
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostConnectionLostDetection connectionLostDetection() {
        return this.connectionLostDetection;
    }
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostHighCpuSaturationDetection highCpuSaturationDetection() {
        return this.highCpuSaturationDetection;
    }
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostHighGcActivityDetection highGcActivityDetection() {
        return this.highGcActivityDetection;
    }
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostHighMemoryDetection highMemoryDetection() {
        return this.highMemoryDetection;
    }
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostHighSystemLoadDetection highSystemLoadDetection() {
        return this.highSystemLoadDetection;
    }
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostOutOfMemoryDetection outOfMemoryDetection() {
        return this.outOfMemoryDetection;
    }
    /**
     * @return no documentation available
     * 
     */
    public HostAnomaliesV2HostOutOfThreadsDetection outOfThreadsDetection() {
        return this.outOfThreadsDetection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesV2Host defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private HostAnomaliesV2HostConnectionLostDetection connectionLostDetection;
        private HostAnomaliesV2HostHighCpuSaturationDetection highCpuSaturationDetection;
        private HostAnomaliesV2HostHighGcActivityDetection highGcActivityDetection;
        private HostAnomaliesV2HostHighMemoryDetection highMemoryDetection;
        private HostAnomaliesV2HostHighSystemLoadDetection highSystemLoadDetection;
        private HostAnomaliesV2HostOutOfMemoryDetection outOfMemoryDetection;
        private HostAnomaliesV2HostOutOfThreadsDetection outOfThreadsDetection;
        public Builder() {}
        public Builder(HostAnomaliesV2Host defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionLostDetection = defaults.connectionLostDetection;
    	      this.highCpuSaturationDetection = defaults.highCpuSaturationDetection;
    	      this.highGcActivityDetection = defaults.highGcActivityDetection;
    	      this.highMemoryDetection = defaults.highMemoryDetection;
    	      this.highSystemLoadDetection = defaults.highSystemLoadDetection;
    	      this.outOfMemoryDetection = defaults.outOfMemoryDetection;
    	      this.outOfThreadsDetection = defaults.outOfThreadsDetection;
        }

        @CustomType.Setter
        public Builder connectionLostDetection(HostAnomaliesV2HostConnectionLostDetection connectionLostDetection) {
            this.connectionLostDetection = Objects.requireNonNull(connectionLostDetection);
            return this;
        }
        @CustomType.Setter
        public Builder highCpuSaturationDetection(HostAnomaliesV2HostHighCpuSaturationDetection highCpuSaturationDetection) {
            this.highCpuSaturationDetection = Objects.requireNonNull(highCpuSaturationDetection);
            return this;
        }
        @CustomType.Setter
        public Builder highGcActivityDetection(HostAnomaliesV2HostHighGcActivityDetection highGcActivityDetection) {
            this.highGcActivityDetection = Objects.requireNonNull(highGcActivityDetection);
            return this;
        }
        @CustomType.Setter
        public Builder highMemoryDetection(HostAnomaliesV2HostHighMemoryDetection highMemoryDetection) {
            this.highMemoryDetection = Objects.requireNonNull(highMemoryDetection);
            return this;
        }
        @CustomType.Setter
        public Builder highSystemLoadDetection(HostAnomaliesV2HostHighSystemLoadDetection highSystemLoadDetection) {
            this.highSystemLoadDetection = Objects.requireNonNull(highSystemLoadDetection);
            return this;
        }
        @CustomType.Setter
        public Builder outOfMemoryDetection(HostAnomaliesV2HostOutOfMemoryDetection outOfMemoryDetection) {
            this.outOfMemoryDetection = Objects.requireNonNull(outOfMemoryDetection);
            return this;
        }
        @CustomType.Setter
        public Builder outOfThreadsDetection(HostAnomaliesV2HostOutOfThreadsDetection outOfThreadsDetection) {
            this.outOfThreadsDetection = Objects.requireNonNull(outOfThreadsDetection);
            return this;
        }
        public HostAnomaliesV2Host build() {
            final var o = new HostAnomaliesV2Host();
            o.connectionLostDetection = connectionLostDetection;
            o.highCpuSaturationDetection = highCpuSaturationDetection;
            o.highGcActivityDetection = highGcActivityDetection;
            o.highMemoryDetection = highMemoryDetection;
            o.highSystemLoadDetection = highSystemLoadDetection;
            o.outOfMemoryDetection = outOfMemoryDetection;
            o.outOfThreadsDetection = outOfThreadsDetection;
            return o;
        }
    }
}