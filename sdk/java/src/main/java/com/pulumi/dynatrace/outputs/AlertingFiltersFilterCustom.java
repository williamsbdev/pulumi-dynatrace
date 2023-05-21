// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AlertingFiltersFilterCustomDescription;
import com.pulumi.dynatrace.outputs.AlertingFiltersFilterCustomMetadata;
import com.pulumi.dynatrace.outputs.AlertingFiltersFilterCustomTitle;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertingFiltersFilterCustom {
    private @Nullable AlertingFiltersFilterCustomDescription description;
    private @Nullable AlertingFiltersFilterCustomMetadata metadata;
    private @Nullable AlertingFiltersFilterCustomTitle title;

    private AlertingFiltersFilterCustom() {}
    public Optional<AlertingFiltersFilterCustomDescription> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<AlertingFiltersFilterCustomMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<AlertingFiltersFilterCustomTitle> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingFiltersFilterCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AlertingFiltersFilterCustomDescription description;
        private @Nullable AlertingFiltersFilterCustomMetadata metadata;
        private @Nullable AlertingFiltersFilterCustomTitle title;
        public Builder() {}
        public Builder(AlertingFiltersFilterCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder description(@Nullable AlertingFiltersFilterCustomDescription description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable AlertingFiltersFilterCustomMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable AlertingFiltersFilterCustomTitle title) {
            this.title = title;
            return this;
        }
        public AlertingFiltersFilterCustom build() {
            final var o = new AlertingFiltersFilterCustom();
            o.description = description;
            o.metadata = metadata;
            o.title = title;
            return o;
        }
    }
}
