// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostConnectionLostDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostHighCpuSaturationDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostHighGcActivityDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostHighMemoryDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostHighSystemLoadDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostOutOfMemoryDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostOutOfThreadsDetectionArgs;
import java.util.Objects;


public final class HostAnomaliesV2HostArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2HostArgs Empty = new HostAnomaliesV2HostArgs();

    /**
     * no documentation available
     * 
     */
    @Import(name="connectionLostDetection", required=true)
    private Output<HostAnomaliesV2HostConnectionLostDetectionArgs> connectionLostDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostConnectionLostDetectionArgs> connectionLostDetection() {
        return this.connectionLostDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highCpuSaturationDetection", required=true)
    private Output<HostAnomaliesV2HostHighCpuSaturationDetectionArgs> highCpuSaturationDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostHighCpuSaturationDetectionArgs> highCpuSaturationDetection() {
        return this.highCpuSaturationDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highGcActivityDetection", required=true)
    private Output<HostAnomaliesV2HostHighGcActivityDetectionArgs> highGcActivityDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostHighGcActivityDetectionArgs> highGcActivityDetection() {
        return this.highGcActivityDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highMemoryDetection", required=true)
    private Output<HostAnomaliesV2HostHighMemoryDetectionArgs> highMemoryDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostHighMemoryDetectionArgs> highMemoryDetection() {
        return this.highMemoryDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highSystemLoadDetection", required=true)
    private Output<HostAnomaliesV2HostHighSystemLoadDetectionArgs> highSystemLoadDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostHighSystemLoadDetectionArgs> highSystemLoadDetection() {
        return this.highSystemLoadDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="outOfMemoryDetection", required=true)
    private Output<HostAnomaliesV2HostOutOfMemoryDetectionArgs> outOfMemoryDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostOutOfMemoryDetectionArgs> outOfMemoryDetection() {
        return this.outOfMemoryDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="outOfThreadsDetection", required=true)
    private Output<HostAnomaliesV2HostOutOfThreadsDetectionArgs> outOfThreadsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2HostOutOfThreadsDetectionArgs> outOfThreadsDetection() {
        return this.outOfThreadsDetection;
    }

    private HostAnomaliesV2HostArgs() {}

    private HostAnomaliesV2HostArgs(HostAnomaliesV2HostArgs $) {
        this.connectionLostDetection = $.connectionLostDetection;
        this.highCpuSaturationDetection = $.highCpuSaturationDetection;
        this.highGcActivityDetection = $.highGcActivityDetection;
        this.highMemoryDetection = $.highMemoryDetection;
        this.highSystemLoadDetection = $.highSystemLoadDetection;
        this.outOfMemoryDetection = $.outOfMemoryDetection;
        this.outOfThreadsDetection = $.outOfThreadsDetection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2HostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2HostArgs $;

        public Builder() {
            $ = new HostAnomaliesV2HostArgs();
        }

        public Builder(HostAnomaliesV2HostArgs defaults) {
            $ = new HostAnomaliesV2HostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionLostDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder connectionLostDetection(Output<HostAnomaliesV2HostConnectionLostDetectionArgs> connectionLostDetection) {
            $.connectionLostDetection = connectionLostDetection;
            return this;
        }

        /**
         * @param connectionLostDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder connectionLostDetection(HostAnomaliesV2HostConnectionLostDetectionArgs connectionLostDetection) {
            return connectionLostDetection(Output.of(connectionLostDetection));
        }

        /**
         * @param highCpuSaturationDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highCpuSaturationDetection(Output<HostAnomaliesV2HostHighCpuSaturationDetectionArgs> highCpuSaturationDetection) {
            $.highCpuSaturationDetection = highCpuSaturationDetection;
            return this;
        }

        /**
         * @param highCpuSaturationDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highCpuSaturationDetection(HostAnomaliesV2HostHighCpuSaturationDetectionArgs highCpuSaturationDetection) {
            return highCpuSaturationDetection(Output.of(highCpuSaturationDetection));
        }

        /**
         * @param highGcActivityDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highGcActivityDetection(Output<HostAnomaliesV2HostHighGcActivityDetectionArgs> highGcActivityDetection) {
            $.highGcActivityDetection = highGcActivityDetection;
            return this;
        }

        /**
         * @param highGcActivityDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highGcActivityDetection(HostAnomaliesV2HostHighGcActivityDetectionArgs highGcActivityDetection) {
            return highGcActivityDetection(Output.of(highGcActivityDetection));
        }

        /**
         * @param highMemoryDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highMemoryDetection(Output<HostAnomaliesV2HostHighMemoryDetectionArgs> highMemoryDetection) {
            $.highMemoryDetection = highMemoryDetection;
            return this;
        }

        /**
         * @param highMemoryDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highMemoryDetection(HostAnomaliesV2HostHighMemoryDetectionArgs highMemoryDetection) {
            return highMemoryDetection(Output.of(highMemoryDetection));
        }

        /**
         * @param highSystemLoadDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highSystemLoadDetection(Output<HostAnomaliesV2HostHighSystemLoadDetectionArgs> highSystemLoadDetection) {
            $.highSystemLoadDetection = highSystemLoadDetection;
            return this;
        }

        /**
         * @param highSystemLoadDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highSystemLoadDetection(HostAnomaliesV2HostHighSystemLoadDetectionArgs highSystemLoadDetection) {
            return highSystemLoadDetection(Output.of(highSystemLoadDetection));
        }

        /**
         * @param outOfMemoryDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder outOfMemoryDetection(Output<HostAnomaliesV2HostOutOfMemoryDetectionArgs> outOfMemoryDetection) {
            $.outOfMemoryDetection = outOfMemoryDetection;
            return this;
        }

        /**
         * @param outOfMemoryDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder outOfMemoryDetection(HostAnomaliesV2HostOutOfMemoryDetectionArgs outOfMemoryDetection) {
            return outOfMemoryDetection(Output.of(outOfMemoryDetection));
        }

        /**
         * @param outOfThreadsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder outOfThreadsDetection(Output<HostAnomaliesV2HostOutOfThreadsDetectionArgs> outOfThreadsDetection) {
            $.outOfThreadsDetection = outOfThreadsDetection;
            return this;
        }

        /**
         * @param outOfThreadsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder outOfThreadsDetection(HostAnomaliesV2HostOutOfThreadsDetectionArgs outOfThreadsDetection) {
            return outOfThreadsDetection(Output.of(outOfThreadsDetection));
        }

        public HostAnomaliesV2HostArgs build() {
            $.connectionLostDetection = Objects.requireNonNull($.connectionLostDetection, "expected parameter 'connectionLostDetection' to be non-null");
            $.highCpuSaturationDetection = Objects.requireNonNull($.highCpuSaturationDetection, "expected parameter 'highCpuSaturationDetection' to be non-null");
            $.highGcActivityDetection = Objects.requireNonNull($.highGcActivityDetection, "expected parameter 'highGcActivityDetection' to be non-null");
            $.highMemoryDetection = Objects.requireNonNull($.highMemoryDetection, "expected parameter 'highMemoryDetection' to be non-null");
            $.highSystemLoadDetection = Objects.requireNonNull($.highSystemLoadDetection, "expected parameter 'highSystemLoadDetection' to be non-null");
            $.outOfMemoryDetection = Objects.requireNonNull($.outOfMemoryDetection, "expected parameter 'outOfMemoryDetection' to be non-null");
            $.outOfThreadsDetection = Objects.requireNonNull($.outOfThreadsDetection, "expected parameter 'outOfThreadsDetection' to be non-null");
            return $;
        }
    }

}
