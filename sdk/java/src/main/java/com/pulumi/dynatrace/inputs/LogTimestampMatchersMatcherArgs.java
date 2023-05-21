// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LogTimestampMatchersMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogTimestampMatchersMatcherArgs Empty = new LogTimestampMatchersMatcherArgs();

    @Import(name="attribute", required=true)
    private Output<String> attribute;

    public Output<String> attribute() {
        return this.attribute;
    }

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private LogTimestampMatchersMatcherArgs() {}

    private LogTimestampMatchersMatcherArgs(LogTimestampMatchersMatcherArgs $) {
        this.attribute = $.attribute;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogTimestampMatchersMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogTimestampMatchersMatcherArgs $;

        public Builder() {
            $ = new LogTimestampMatchersMatcherArgs();
        }

        public Builder(LogTimestampMatchersMatcherArgs defaults) {
            $ = new LogTimestampMatchersMatcherArgs(Objects.requireNonNull(defaults));
        }

        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public LogTimestampMatchersMatcherArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
