// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.AlertingFiltersFilterCustomDescriptionArgs;
import com.pulumi.dynatrace.inputs.AlertingFiltersFilterCustomTitleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertingFiltersFilterCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertingFiltersFilterCustomArgs Empty = new AlertingFiltersFilterCustomArgs();

    @Import(name="description")
    private @Nullable Output<AlertingFiltersFilterCustomDescriptionArgs> description;

    public Optional<Output<AlertingFiltersFilterCustomDescriptionArgs>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="title")
    private @Nullable Output<AlertingFiltersFilterCustomTitleArgs> title;

    public Optional<Output<AlertingFiltersFilterCustomTitleArgs>> title() {
        return Optional.ofNullable(this.title);
    }

    private AlertingFiltersFilterCustomArgs() {}

    private AlertingFiltersFilterCustomArgs(AlertingFiltersFilterCustomArgs $) {
        this.description = $.description;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertingFiltersFilterCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertingFiltersFilterCustomArgs $;

        public Builder() {
            $ = new AlertingFiltersFilterCustomArgs();
        }

        public Builder(AlertingFiltersFilterCustomArgs defaults) {
            $ = new AlertingFiltersFilterCustomArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<AlertingFiltersFilterCustomDescriptionArgs> description) {
            $.description = description;
            return this;
        }

        public Builder description(AlertingFiltersFilterCustomDescriptionArgs description) {
            return description(Output.of(description));
        }

        public Builder title(@Nullable Output<AlertingFiltersFilterCustomTitleArgs> title) {
            $.title = title;
            return this;
        }

        public Builder title(AlertingFiltersFilterCustomTitleArgs title) {
            return title(Output.of(title));
        }

        public AlertingFiltersFilterCustomArgs build() {
            return $;
        }
    }

}