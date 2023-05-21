// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs Empty = new DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs();

    @Import(name="writeAndReadTime", required=true)
    private Output<Integer> writeAndReadTime;

    public Output<Integer> writeAndReadTime() {
        return this.writeAndReadTime;
    }

    private DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs() {}

    private DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs(DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs $) {
        this.writeAndReadTime = $.writeAndReadTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs();
        }

        public Builder(DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs defaults) {
            $ = new DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder writeAndReadTime(Output<Integer> writeAndReadTime) {
            $.writeAndReadTime = writeAndReadTime;
            return this;
        }

        public Builder writeAndReadTime(Integer writeAndReadTime) {
            return writeAndReadTime(Output.of(writeAndReadTime));
        }

        public DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs build() {
            $.writeAndReadTime = Objects.requireNonNull($.writeAndReadTime, "expected parameter 'writeAndReadTime' to be non-null");
            return $;
        }
    }

}
