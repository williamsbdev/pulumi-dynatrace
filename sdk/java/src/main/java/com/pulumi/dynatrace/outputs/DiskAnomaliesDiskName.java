// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiskAnomaliesDiskName {
    /**
     * @return Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
     * 
     */
    private String operator;
    /**
     * @return Value to compare to
     * 
     */
    private String value;

    private DiskAnomaliesDiskName() {}
    /**
     * @return Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Value to compare to
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskAnomaliesDiskName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private String value;
        public Builder() {}
        public Builder(DiskAnomaliesDiskName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public DiskAnomaliesDiskName build() {
            final var o = new DiskAnomaliesDiskName();
            o.operator = operator;
            o.value = value;
            return o;
        }
    }
}