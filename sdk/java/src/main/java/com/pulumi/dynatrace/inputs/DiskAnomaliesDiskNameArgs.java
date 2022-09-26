// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DiskAnomaliesDiskNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskAnomaliesDiskNameArgs Empty = new DiskAnomaliesDiskNameArgs();

    /**
     * Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * Value to compare to
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value to compare to
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DiskAnomaliesDiskNameArgs() {}

    private DiskAnomaliesDiskNameArgs(DiskAnomaliesDiskNameArgs $) {
        this.operator = $.operator;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAnomaliesDiskNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAnomaliesDiskNameArgs $;

        public Builder() {
            $ = new DiskAnomaliesDiskNameArgs();
        }

        public Builder(DiskAnomaliesDiskNameArgs defaults) {
            $ = new DiskAnomaliesDiskNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param value Value to compare to
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value to compare to
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DiskAnomaliesDiskNameArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}