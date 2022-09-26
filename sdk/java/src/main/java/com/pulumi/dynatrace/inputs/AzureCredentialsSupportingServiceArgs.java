// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.AzureCredentialsSupportingServiceMonitoredMetricArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureCredentialsSupportingServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCredentialsSupportingServiceArgs Empty = new AzureCredentialsSupportingServiceArgs();

    /**
     * A list of Azure tags to be monitored.  You can specify up to 10 tags. A resource tagged with *any* of the specified tags is monitored.  Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`
     * 
     */
    @Import(name="monitoredMetrics")
    private @Nullable Output<List<AzureCredentialsSupportingServiceMonitoredMetricArgs>> monitoredMetrics;

    /**
     * @return A list of Azure tags to be monitored.  You can specify up to 10 tags. A resource tagged with *any* of the specified tags is monitored.  Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`
     * 
     */
    public Optional<Output<List<AzureCredentialsSupportingServiceMonitoredMetricArgs>>> monitoredMetrics() {
        return Optional.ofNullable(this.monitoredMetrics);
    }

    /**
     * The name of the supporting service.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the supporting service.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private AzureCredentialsSupportingServiceArgs() {}

    private AzureCredentialsSupportingServiceArgs(AzureCredentialsSupportingServiceArgs $) {
        this.monitoredMetrics = $.monitoredMetrics;
        this.name = $.name;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCredentialsSupportingServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCredentialsSupportingServiceArgs $;

        public Builder() {
            $ = new AzureCredentialsSupportingServiceArgs();
        }

        public Builder(AzureCredentialsSupportingServiceArgs defaults) {
            $ = new AzureCredentialsSupportingServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitoredMetrics A list of Azure tags to be monitored.  You can specify up to 10 tags. A resource tagged with *any* of the specified tags is monitored.  Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`
         * 
         * @return builder
         * 
         */
        public Builder monitoredMetrics(@Nullable Output<List<AzureCredentialsSupportingServiceMonitoredMetricArgs>> monitoredMetrics) {
            $.monitoredMetrics = monitoredMetrics;
            return this;
        }

        /**
         * @param monitoredMetrics A list of Azure tags to be monitored.  You can specify up to 10 tags. A resource tagged with *any* of the specified tags is monitored.  Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`
         * 
         * @return builder
         * 
         */
        public Builder monitoredMetrics(List<AzureCredentialsSupportingServiceMonitoredMetricArgs> monitoredMetrics) {
            return monitoredMetrics(Output.of(monitoredMetrics));
        }

        /**
         * @param monitoredMetrics A list of Azure tags to be monitored.  You can specify up to 10 tags. A resource tagged with *any* of the specified tags is monitored.  Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`
         * 
         * @return builder
         * 
         */
        public Builder monitoredMetrics(AzureCredentialsSupportingServiceMonitoredMetricArgs... monitoredMetrics) {
            return monitoredMetrics(List.of(monitoredMetrics));
        }

        /**
         * @param name The name of the supporting service.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the supporting service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param unknowns Any attributes that aren&#39;t yet supported by this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns Any attributes that aren&#39;t yet supported by this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public AzureCredentialsSupportingServiceArgs build() {
            return $;
        }
    }

}