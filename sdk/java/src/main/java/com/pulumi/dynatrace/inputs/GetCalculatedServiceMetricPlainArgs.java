// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCalculatedServiceMetricPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCalculatedServiceMetricPlainArgs Empty = new GetCalculatedServiceMetricPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetCalculatedServiceMetricPlainArgs() {}

    private GetCalculatedServiceMetricPlainArgs(GetCalculatedServiceMetricPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCalculatedServiceMetricPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCalculatedServiceMetricPlainArgs $;

        public Builder() {
            $ = new GetCalculatedServiceMetricPlainArgs();
        }

        public Builder(GetCalculatedServiceMetricPlainArgs defaults) {
            $ = new GetCalculatedServiceMetricPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCalculatedServiceMetricPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
