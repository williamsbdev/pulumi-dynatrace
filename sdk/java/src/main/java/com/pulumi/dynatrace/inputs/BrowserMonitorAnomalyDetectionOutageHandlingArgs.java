// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyArgs;
import com.pulumi.dynatrace.inputs.BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorAnomalyDetectionOutageHandlingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorAnomalyDetectionOutageHandlingArgs Empty = new BrowserMonitorAnomalyDetectionOutageHandlingArgs();

    @Import(name="globalOutage")
    private @Nullable Output<Boolean> globalOutage;

    public Optional<Output<Boolean>> globalOutage() {
        return Optional.ofNullable(this.globalOutage);
    }

    @Import(name="globalOutagePolicies")
    private @Nullable Output<List<BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyArgs>> globalOutagePolicies;

    public Optional<Output<List<BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyArgs>>> globalOutagePolicies() {
        return Optional.ofNullable(this.globalOutagePolicies);
    }

    @Import(name="localOutage")
    private @Nullable Output<Boolean> localOutage;

    public Optional<Output<Boolean>> localOutage() {
        return Optional.ofNullable(this.localOutage);
    }

    @Import(name="localOutagePolicies")
    private @Nullable Output<List<BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs>> localOutagePolicies;

    public Optional<Output<List<BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs>>> localOutagePolicies() {
        return Optional.ofNullable(this.localOutagePolicies);
    }

    @Import(name="retryOnError")
    private @Nullable Output<Boolean> retryOnError;

    public Optional<Output<Boolean>> retryOnError() {
        return Optional.ofNullable(this.retryOnError);
    }

    private BrowserMonitorAnomalyDetectionOutageHandlingArgs() {}

    private BrowserMonitorAnomalyDetectionOutageHandlingArgs(BrowserMonitorAnomalyDetectionOutageHandlingArgs $) {
        this.globalOutage = $.globalOutage;
        this.globalOutagePolicies = $.globalOutagePolicies;
        this.localOutage = $.localOutage;
        this.localOutagePolicies = $.localOutagePolicies;
        this.retryOnError = $.retryOnError;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorAnomalyDetectionOutageHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorAnomalyDetectionOutageHandlingArgs $;

        public Builder() {
            $ = new BrowserMonitorAnomalyDetectionOutageHandlingArgs();
        }

        public Builder(BrowserMonitorAnomalyDetectionOutageHandlingArgs defaults) {
            $ = new BrowserMonitorAnomalyDetectionOutageHandlingArgs(Objects.requireNonNull(defaults));
        }

        public Builder globalOutage(@Nullable Output<Boolean> globalOutage) {
            $.globalOutage = globalOutage;
            return this;
        }

        public Builder globalOutage(Boolean globalOutage) {
            return globalOutage(Output.of(globalOutage));
        }

        public Builder globalOutagePolicies(@Nullable Output<List<BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyArgs>> globalOutagePolicies) {
            $.globalOutagePolicies = globalOutagePolicies;
            return this;
        }

        public Builder globalOutagePolicies(List<BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyArgs> globalOutagePolicies) {
            return globalOutagePolicies(Output.of(globalOutagePolicies));
        }

        public Builder globalOutagePolicies(BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyArgs... globalOutagePolicies) {
            return globalOutagePolicies(List.of(globalOutagePolicies));
        }

        public Builder localOutage(@Nullable Output<Boolean> localOutage) {
            $.localOutage = localOutage;
            return this;
        }

        public Builder localOutage(Boolean localOutage) {
            return localOutage(Output.of(localOutage));
        }

        public Builder localOutagePolicies(@Nullable Output<List<BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs>> localOutagePolicies) {
            $.localOutagePolicies = localOutagePolicies;
            return this;
        }

        public Builder localOutagePolicies(List<BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs> localOutagePolicies) {
            return localOutagePolicies(Output.of(localOutagePolicies));
        }

        public Builder localOutagePolicies(BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs... localOutagePolicies) {
            return localOutagePolicies(List.of(localOutagePolicies));
        }

        public Builder retryOnError(@Nullable Output<Boolean> retryOnError) {
            $.retryOnError = retryOnError;
            return this;
        }

        public Builder retryOnError(Boolean retryOnError) {
            return retryOnError(Output.of(retryOnError));
        }

        public BrowserMonitorAnomalyDetectionOutageHandlingArgs build() {
            return $;
        }
    }

}
