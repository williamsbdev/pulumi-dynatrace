// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationUserActionNamingSettingsPlaceholdersPlaceholder;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebApplicationUserActionNamingSettingsPlaceholders {
    private List<WebApplicationUserActionNamingSettingsPlaceholdersPlaceholder> placeholders;

    private WebApplicationUserActionNamingSettingsPlaceholders() {}
    public List<WebApplicationUserActionNamingSettingsPlaceholdersPlaceholder> placeholders() {
        return this.placeholders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationUserActionNamingSettingsPlaceholders defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebApplicationUserActionNamingSettingsPlaceholdersPlaceholder> placeholders;
        public Builder() {}
        public Builder(WebApplicationUserActionNamingSettingsPlaceholders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.placeholders = defaults.placeholders;
        }

        @CustomType.Setter
        public Builder placeholders(List<WebApplicationUserActionNamingSettingsPlaceholdersPlaceholder> placeholders) {
            this.placeholders = Objects.requireNonNull(placeholders);
            return this;
        }
        public Builder placeholders(WebApplicationUserActionNamingSettingsPlaceholdersPlaceholder... placeholders) {
            return placeholders(List.of(placeholders));
        }
        public WebApplicationUserActionNamingSettingsPlaceholders build() {
            final var o = new WebApplicationUserActionNamingSettingsPlaceholders();
            o.placeholders = placeholders;
            return o;
        }
    }
}