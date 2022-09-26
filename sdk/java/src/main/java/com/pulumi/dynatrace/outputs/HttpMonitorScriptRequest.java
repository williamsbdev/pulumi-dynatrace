// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HttpMonitorScriptRequestAuthentication;
import com.pulumi.dynatrace.outputs.HttpMonitorScriptRequestConfiguration;
import com.pulumi.dynatrace.outputs.HttpMonitorScriptRequestValidation;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpMonitorScriptRequest {
    private @Nullable HttpMonitorScriptRequestAuthentication authentication;
    private @Nullable String body;
    private @Nullable HttpMonitorScriptRequestConfiguration configuration;
    private @Nullable String description;
    private String method;
    private @Nullable String postProcessing;
    private @Nullable String preProcessing;
    private String url;
    private @Nullable HttpMonitorScriptRequestValidation validation;

    private HttpMonitorScriptRequest() {}
    public Optional<HttpMonitorScriptRequestAuthentication> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    public Optional<HttpMonitorScriptRequestConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public String method() {
        return this.method;
    }
    public Optional<String> postProcessing() {
        return Optional.ofNullable(this.postProcessing);
    }
    public Optional<String> preProcessing() {
        return Optional.ofNullable(this.preProcessing);
    }
    public String url() {
        return this.url;
    }
    public Optional<HttpMonitorScriptRequestValidation> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpMonitorScriptRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HttpMonitorScriptRequestAuthentication authentication;
        private @Nullable String body;
        private @Nullable HttpMonitorScriptRequestConfiguration configuration;
        private @Nullable String description;
        private String method;
        private @Nullable String postProcessing;
        private @Nullable String preProcessing;
        private String url;
        private @Nullable HttpMonitorScriptRequestValidation validation;
        public Builder() {}
        public Builder(HttpMonitorScriptRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.method = defaults.method;
    	      this.postProcessing = defaults.postProcessing;
    	      this.preProcessing = defaults.preProcessing;
    	      this.url = defaults.url;
    	      this.validation = defaults.validation;
        }

        @CustomType.Setter
        public Builder authentication(@Nullable HttpMonitorScriptRequestAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder configuration(@Nullable HttpMonitorScriptRequestConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        @CustomType.Setter
        public Builder postProcessing(@Nullable String postProcessing) {
            this.postProcessing = postProcessing;
            return this;
        }
        @CustomType.Setter
        public Builder preProcessing(@Nullable String preProcessing) {
            this.preProcessing = preProcessing;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder validation(@Nullable HttpMonitorScriptRequestValidation validation) {
            this.validation = validation;
            return this;
        }
        public HttpMonitorScriptRequest build() {
            final var o = new HttpMonitorScriptRequest();
            o.authentication = authentication;
            o.body = body;
            o.configuration = configuration;
            o.description = description;
            o.method = method;
            o.postProcessing = postProcessing;
            o.preProcessing = preProcessing;
            o.url = url;
            o.validation = validation;
            return o;
        }
    }
}