// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.EnvironmentQuotasDdusArgs;
import com.pulumi.dynatrace.inputs.EnvironmentQuotasDemUnitsArgs;
import com.pulumi.dynatrace.inputs.EnvironmentQuotasLogsArgs;
import com.pulumi.dynatrace.inputs.EnvironmentQuotasSyntheticArgs;
import com.pulumi.dynatrace.inputs.EnvironmentQuotasUserSessionsArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentQuotasArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentQuotasArgs Empty = new EnvironmentQuotasArgs();

    /**
     * Davis Data Units consumption and quota information on environment level. Not set (and not editable) if Davis data units is not enabled
     * 
     */
    @Import(name="ddus")
    private @Nullable Output<EnvironmentQuotasDdusArgs> ddus;

    /**
     * @return Davis Data Units consumption and quota information on environment level. Not set (and not editable) if Davis data units is not enabled
     * 
     */
    public Optional<Output<EnvironmentQuotasDdusArgs>> ddus() {
        return Optional.ofNullable(this.ddus);
    }

    /**
     * DEM units consumption and quota information on environment level
     * 
     */
    @Import(name="demUnits")
    private @Nullable Output<EnvironmentQuotasDemUnitsArgs> demUnits;

    /**
     * @return DEM units consumption and quota information on environment level
     * 
     */
    public Optional<Output<EnvironmentQuotasDemUnitsArgs>> demUnits() {
        return Optional.ofNullable(this.demUnits);
    }

    /**
     * Host units consumption and quota information on environment level
     * 
     */
    @Import(name="hostUnits")
    private @Nullable Output<Integer> hostUnits;

    /**
     * @return Host units consumption and quota information on environment level
     * 
     */
    public Optional<Output<Integer>> hostUnits() {
        return Optional.ofNullable(this.hostUnits);
    }

    /**
     * Log Monitoring consumption and quota information on environment level. Not set (and not editable) if Log monitoring is not enabled. Not set (and not editable) if Log monitoring is migrated to Davis data on license level
     * 
     */
    @Import(name="logs")
    private @Nullable Output<EnvironmentQuotasLogsArgs> logs;

    /**
     * @return Log Monitoring consumption and quota information on environment level. Not set (and not editable) if Log monitoring is not enabled. Not set (and not editable) if Log monitoring is migrated to Davis data on license level
     * 
     */
    public Optional<Output<EnvironmentQuotasLogsArgs>> logs() {
        return Optional.ofNullable(this.logs);
    }

    /**
     * Synthetic monitors consumption and quota information on environment level. Not set (and not editable) if neither Synthetic nor DEM units is enabled
     * 
     */
    @Import(name="synthetic")
    private @Nullable Output<EnvironmentQuotasSyntheticArgs> synthetic;

    /**
     * @return Synthetic monitors consumption and quota information on environment level. Not set (and not editable) if neither Synthetic nor DEM units is enabled
     * 
     */
    public Optional<Output<EnvironmentQuotasSyntheticArgs>> synthetic() {
        return Optional.ofNullable(this.synthetic);
    }

    /**
     * User sessions consumption and quota information on environment level
     * 
     */
    @Import(name="userSessions")
    private @Nullable Output<EnvironmentQuotasUserSessionsArgs> userSessions;

    /**
     * @return User sessions consumption and quota information on environment level
     * 
     */
    public Optional<Output<EnvironmentQuotasUserSessionsArgs>> userSessions() {
        return Optional.ofNullable(this.userSessions);
    }

    private EnvironmentQuotasArgs() {}

    private EnvironmentQuotasArgs(EnvironmentQuotasArgs $) {
        this.ddus = $.ddus;
        this.demUnits = $.demUnits;
        this.hostUnits = $.hostUnits;
        this.logs = $.logs;
        this.synthetic = $.synthetic;
        this.userSessions = $.userSessions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentQuotasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentQuotasArgs $;

        public Builder() {
            $ = new EnvironmentQuotasArgs();
        }

        public Builder(EnvironmentQuotasArgs defaults) {
            $ = new EnvironmentQuotasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddus Davis Data Units consumption and quota information on environment level. Not set (and not editable) if Davis data units is not enabled
         * 
         * @return builder
         * 
         */
        public Builder ddus(@Nullable Output<EnvironmentQuotasDdusArgs> ddus) {
            $.ddus = ddus;
            return this;
        }

        /**
         * @param ddus Davis Data Units consumption and quota information on environment level. Not set (and not editable) if Davis data units is not enabled
         * 
         * @return builder
         * 
         */
        public Builder ddus(EnvironmentQuotasDdusArgs ddus) {
            return ddus(Output.of(ddus));
        }

        /**
         * @param demUnits DEM units consumption and quota information on environment level
         * 
         * @return builder
         * 
         */
        public Builder demUnits(@Nullable Output<EnvironmentQuotasDemUnitsArgs> demUnits) {
            $.demUnits = demUnits;
            return this;
        }

        /**
         * @param demUnits DEM units consumption and quota information on environment level
         * 
         * @return builder
         * 
         */
        public Builder demUnits(EnvironmentQuotasDemUnitsArgs demUnits) {
            return demUnits(Output.of(demUnits));
        }

        /**
         * @param hostUnits Host units consumption and quota information on environment level
         * 
         * @return builder
         * 
         */
        public Builder hostUnits(@Nullable Output<Integer> hostUnits) {
            $.hostUnits = hostUnits;
            return this;
        }

        /**
         * @param hostUnits Host units consumption and quota information on environment level
         * 
         * @return builder
         * 
         */
        public Builder hostUnits(Integer hostUnits) {
            return hostUnits(Output.of(hostUnits));
        }

        /**
         * @param logs Log Monitoring consumption and quota information on environment level. Not set (and not editable) if Log monitoring is not enabled. Not set (and not editable) if Log monitoring is migrated to Davis data on license level
         * 
         * @return builder
         * 
         */
        public Builder logs(@Nullable Output<EnvironmentQuotasLogsArgs> logs) {
            $.logs = logs;
            return this;
        }

        /**
         * @param logs Log Monitoring consumption and quota information on environment level. Not set (and not editable) if Log monitoring is not enabled. Not set (and not editable) if Log monitoring is migrated to Davis data on license level
         * 
         * @return builder
         * 
         */
        public Builder logs(EnvironmentQuotasLogsArgs logs) {
            return logs(Output.of(logs));
        }

        /**
         * @param synthetic Synthetic monitors consumption and quota information on environment level. Not set (and not editable) if neither Synthetic nor DEM units is enabled
         * 
         * @return builder
         * 
         */
        public Builder synthetic(@Nullable Output<EnvironmentQuotasSyntheticArgs> synthetic) {
            $.synthetic = synthetic;
            return this;
        }

        /**
         * @param synthetic Synthetic monitors consumption and quota information on environment level. Not set (and not editable) if neither Synthetic nor DEM units is enabled
         * 
         * @return builder
         * 
         */
        public Builder synthetic(EnvironmentQuotasSyntheticArgs synthetic) {
            return synthetic(Output.of(synthetic));
        }

        /**
         * @param userSessions User sessions consumption and quota information on environment level
         * 
         * @return builder
         * 
         */
        public Builder userSessions(@Nullable Output<EnvironmentQuotasUserSessionsArgs> userSessions) {
            $.userSessions = userSessions;
            return this;
        }

        /**
         * @param userSessions User sessions consumption and quota information on environment level
         * 
         * @return builder
         * 
         */
        public Builder userSessions(EnvironmentQuotasUserSessionsArgs userSessions) {
            return userSessions(Output.of(userSessions));
        }

        public EnvironmentQuotasArgs build() {
            return $;
        }
    }

}