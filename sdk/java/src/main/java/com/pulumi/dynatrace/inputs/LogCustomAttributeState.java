// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogCustomAttributeState extends com.pulumi.resources.ResourceArgs {

    public static final LogCustomAttributeState Empty = new LogCustomAttributeState();

    /**
     * The attribute key is case insensitive in log data ingestion.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The attribute key is case insensitive in log data ingestion.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Show attribute values in side bar
     * 
     */
    @Import(name="sidebar")
    private @Nullable Output<Boolean> sidebar;

    /**
     * @return Show attribute values in side bar
     * 
     */
    public Optional<Output<Boolean>> sidebar() {
        return Optional.ofNullable(this.sidebar);
    }

    private LogCustomAttributeState() {}

    private LogCustomAttributeState(LogCustomAttributeState $) {
        this.key = $.key;
        this.sidebar = $.sidebar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogCustomAttributeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogCustomAttributeState $;

        public Builder() {
            $ = new LogCustomAttributeState();
        }

        public Builder(LogCustomAttributeState defaults) {
            $ = new LogCustomAttributeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The attribute key is case insensitive in log data ingestion.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The attribute key is case insensitive in log data ingestion.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param sidebar Show attribute values in side bar
         * 
         * @return builder
         * 
         */
        public Builder sidebar(@Nullable Output<Boolean> sidebar) {
            $.sidebar = sidebar;
            return this;
        }

        /**
         * @param sidebar Show attribute values in side bar
         * 
         * @return builder
         * 
         */
        public Builder sidebar(Boolean sidebar) {
            return sidebar(Output.of(sidebar));
        }

        public LogCustomAttributeState build() {
            return $;
        }
    }

}
