// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoredTechnologiesGoArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredTechnologiesGoArgs Empty = new MonitoredTechnologiesGoArgs();

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
     * 
     */
    @Import(name="enabledGoStaticMonitoring")
    private @Nullable Output<Boolean> enabledGoStaticMonitoring;

    /**
     * @return Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
     * 
     */
    public Optional<Output<Boolean>> enabledGoStaticMonitoring() {
        return Optional.ofNullable(this.enabledGoStaticMonitoring);
    }

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="hostId")
    private @Nullable Output<String> hostId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Optional<Output<String>> hostId() {
        return Optional.ofNullable(this.hostId);
    }

    private MonitoredTechnologiesGoArgs() {}

    private MonitoredTechnologiesGoArgs(MonitoredTechnologiesGoArgs $) {
        this.enabled = $.enabled;
        this.enabledGoStaticMonitoring = $.enabledGoStaticMonitoring;
        this.hostId = $.hostId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredTechnologiesGoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredTechnologiesGoArgs $;

        public Builder() {
            $ = new MonitoredTechnologiesGoArgs();
        }

        public Builder(MonitoredTechnologiesGoArgs defaults) {
            $ = new MonitoredTechnologiesGoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param enabledGoStaticMonitoring Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
         * 
         * @return builder
         * 
         */
        public Builder enabledGoStaticMonitoring(@Nullable Output<Boolean> enabledGoStaticMonitoring) {
            $.enabledGoStaticMonitoring = enabledGoStaticMonitoring;
            return this;
        }

        /**
         * @param enabledGoStaticMonitoring Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
         * 
         * @return builder
         * 
         */
        public Builder enabledGoStaticMonitoring(Boolean enabledGoStaticMonitoring) {
            return enabledGoStaticMonitoring(Output.of(enabledGoStaticMonitoring));
        }

        /**
         * @param hostId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder hostId(@Nullable Output<String> hostId) {
            $.hostId = hostId;
            return this;
        }

        /**
         * @param hostId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder hostId(String hostId) {
            return hostId(Output.of(hostId));
        }

        public MonitoredTechnologiesGoArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
