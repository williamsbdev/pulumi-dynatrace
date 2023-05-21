// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs Empty = new WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs();

    @Import(name="slowestDegradationMilliseconds", required=true)
    private Output<Double> slowestDegradationMilliseconds;

    public Output<Double> slowestDegradationMilliseconds() {
        return this.slowestDegradationMilliseconds;
    }

    @Import(name="slowestDegradationPercent", required=true)
    private Output<Double> slowestDegradationPercent;

    public Output<Double> slowestDegradationPercent() {
        return this.slowestDegradationPercent;
    }

    private WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs() {}

    private WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs(WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs $) {
        this.slowestDegradationMilliseconds = $.slowestDegradationMilliseconds;
        this.slowestDegradationPercent = $.slowestDegradationPercent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs $;

        public Builder() {
            $ = new WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs();
        }

        public Builder(WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs defaults) {
            $ = new WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs(Objects.requireNonNull(defaults));
        }

        public Builder slowestDegradationMilliseconds(Output<Double> slowestDegradationMilliseconds) {
            $.slowestDegradationMilliseconds = slowestDegradationMilliseconds;
            return this;
        }

        public Builder slowestDegradationMilliseconds(Double slowestDegradationMilliseconds) {
            return slowestDegradationMilliseconds(Output.of(slowestDegradationMilliseconds));
        }

        public Builder slowestDegradationPercent(Output<Double> slowestDegradationPercent) {
            $.slowestDegradationPercent = slowestDegradationPercent;
            return this;
        }

        public Builder slowestDegradationPercent(Double slowestDegradationPercent) {
            return slowestDegradationPercent(Output.of(slowestDegradationPercent));
        }

        public WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs build() {
            $.slowestDegradationMilliseconds = Objects.requireNonNull($.slowestDegradationMilliseconds, "expected parameter 'slowestDegradationMilliseconds' to be non-null");
            $.slowestDegradationPercent = Objects.requireNonNull($.slowestDegradationPercent, "expected parameter 'slowestDegradationPercent' to be non-null");
            return $;
        }
    }

}
