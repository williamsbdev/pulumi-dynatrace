// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMobileApplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMobileApplicationPlainArgs Empty = new GetMobileApplicationPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetMobileApplicationPlainArgs() {}

    private GetMobileApplicationPlainArgs(GetMobileApplicationPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMobileApplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMobileApplicationPlainArgs $;

        public Builder() {
            $ = new GetMobileApplicationPlainArgs();
        }

        public Builder(GetMobileApplicationPlainArgs defaults) {
            $ = new GetMobileApplicationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetMobileApplicationPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
