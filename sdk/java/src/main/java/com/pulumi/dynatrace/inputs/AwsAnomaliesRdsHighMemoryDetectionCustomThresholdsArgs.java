// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs Empty = new AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs();

    @Import(name="freeMemory", required=true)
    private Output<Double> freeMemory;

    public Output<Double> freeMemory() {
        return this.freeMemory;
    }

    @Import(name="swapUsage", required=true)
    private Output<Double> swapUsage;

    public Output<Double> swapUsage() {
        return this.swapUsage;
    }

    private AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs() {}

    private AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs(AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs $) {
        this.freeMemory = $.freeMemory;
        this.swapUsage = $.swapUsage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs();
        }

        public Builder(AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs defaults) {
            $ = new AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder freeMemory(Output<Double> freeMemory) {
            $.freeMemory = freeMemory;
            return this;
        }

        public Builder freeMemory(Double freeMemory) {
            return freeMemory(Output.of(freeMemory));
        }

        public Builder swapUsage(Output<Double> swapUsage) {
            $.swapUsage = swapUsage;
            return this;
        }

        public Builder swapUsage(Double swapUsage) {
            return swapUsage(Output.of(swapUsage));
        }

        public AwsAnomaliesRdsHighMemoryDetectionCustomThresholdsArgs build() {
            $.freeMemory = Objects.requireNonNull($.freeMemory, "expected parameter 'freeMemory' to be non-null");
            $.swapUsage = Objects.requireNonNull($.swapUsage, "expected parameter 'swapUsage' to be non-null");
            return $;
        }
    }

}