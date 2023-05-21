// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class WebAppAnomaliesTrafficSpikesTrafficSpikesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAnomaliesTrafficSpikesTrafficSpikesArgs Empty = new WebAppAnomaliesTrafficSpikesTrafficSpikesArgs();

    @Import(name="minutesAbnormalState", required=true)
    private Output<Double> minutesAbnormalState;

    public Output<Double> minutesAbnormalState() {
        return this.minutesAbnormalState;
    }

    @Import(name="trafficSpikePercentage", required=true)
    private Output<Double> trafficSpikePercentage;

    public Output<Double> trafficSpikePercentage() {
        return this.trafficSpikePercentage;
    }

    private WebAppAnomaliesTrafficSpikesTrafficSpikesArgs() {}

    private WebAppAnomaliesTrafficSpikesTrafficSpikesArgs(WebAppAnomaliesTrafficSpikesTrafficSpikesArgs $) {
        this.minutesAbnormalState = $.minutesAbnormalState;
        this.trafficSpikePercentage = $.trafficSpikePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAnomaliesTrafficSpikesTrafficSpikesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAnomaliesTrafficSpikesTrafficSpikesArgs $;

        public Builder() {
            $ = new WebAppAnomaliesTrafficSpikesTrafficSpikesArgs();
        }

        public Builder(WebAppAnomaliesTrafficSpikesTrafficSpikesArgs defaults) {
            $ = new WebAppAnomaliesTrafficSpikesTrafficSpikesArgs(Objects.requireNonNull(defaults));
        }

        public Builder minutesAbnormalState(Output<Double> minutesAbnormalState) {
            $.minutesAbnormalState = minutesAbnormalState;
            return this;
        }

        public Builder minutesAbnormalState(Double minutesAbnormalState) {
            return minutesAbnormalState(Output.of(minutesAbnormalState));
        }

        public Builder trafficSpikePercentage(Output<Double> trafficSpikePercentage) {
            $.trafficSpikePercentage = trafficSpikePercentage;
            return this;
        }

        public Builder trafficSpikePercentage(Double trafficSpikePercentage) {
            return trafficSpikePercentage(Output.of(trafficSpikePercentage));
        }

        public WebAppAnomaliesTrafficSpikesTrafficSpikesArgs build() {
            $.minutesAbnormalState = Objects.requireNonNull($.minutesAbnormalState, "expected parameter 'minutesAbnormalState' to be non-null");
            $.trafficSpikePercentage = Objects.requireNonNull($.trafficSpikePercentage, "expected parameter 'trafficSpikePercentage' to be non-null");
            return $;
        }
    }

}
