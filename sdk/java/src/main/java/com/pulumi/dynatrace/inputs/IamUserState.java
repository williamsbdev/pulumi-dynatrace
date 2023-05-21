// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamUserState extends com.pulumi.resources.ResourceArgs {

    public static final IamUserState Empty = new IamUserState();

    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    private IamUserState() {}

    private IamUserState(IamUserState $) {
        this.email = $.email;
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamUserState $;

        public Builder() {
            $ = new IamUserState();
        }

        public Builder(IamUserState defaults) {
            $ = new IamUserState(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        public IamUserState build() {
            return $;
        }
    }

}
