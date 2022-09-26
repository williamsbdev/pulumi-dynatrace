// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostPlainArgs Empty = new GetHostPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Required tags of the host to find
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return Required tags of the host to find
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetHostPlainArgs() {}

    private GetHostPlainArgs(GetHostPlainArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostPlainArgs $;

        public Builder() {
            $ = new GetHostPlainArgs();
        }

        public Builder(GetHostPlainArgs defaults) {
            $ = new GetHostPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Required tags of the host to find
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Required tags of the host to find
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetHostPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}