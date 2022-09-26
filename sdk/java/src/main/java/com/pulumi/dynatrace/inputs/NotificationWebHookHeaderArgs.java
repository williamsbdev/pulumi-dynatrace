// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationWebHookHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationWebHookHeaderArgs Empty = new NotificationWebHookHeaderArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private NotificationWebHookHeaderArgs() {}

    private NotificationWebHookHeaderArgs(NotificationWebHookHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationWebHookHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationWebHookHeaderArgs $;

        public Builder() {
            $ = new NotificationWebHookHeaderArgs();
        }

        public Builder(NotificationWebHookHeaderArgs defaults) {
            $ = new NotificationWebHookHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public NotificationWebHookHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}