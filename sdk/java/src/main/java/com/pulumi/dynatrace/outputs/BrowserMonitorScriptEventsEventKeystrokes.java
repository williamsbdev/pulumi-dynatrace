// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventKeystrokesTarget;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventKeystrokesValidate;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventKeystrokesWait;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorScriptEventsEventKeystrokes {
    private @Nullable Boolean masked;
    private @Nullable Boolean simulateBlurEvent;
    private @Nullable BrowserMonitorScriptEventsEventKeystrokesTarget target;
    private String text;
    private @Nullable BrowserMonitorScriptEventsEventKeystrokesValidate validate;
    private @Nullable BrowserMonitorScriptEventsEventKeystrokesWait wait;

    private BrowserMonitorScriptEventsEventKeystrokes() {}
    public Optional<Boolean> masked() {
        return Optional.ofNullable(this.masked);
    }
    public Optional<Boolean> simulateBlurEvent() {
        return Optional.ofNullable(this.simulateBlurEvent);
    }
    public Optional<BrowserMonitorScriptEventsEventKeystrokesTarget> target() {
        return Optional.ofNullable(this.target);
    }
    public String text() {
        return this.text;
    }
    public Optional<BrowserMonitorScriptEventsEventKeystrokesValidate> validate() {
        return Optional.ofNullable(this.validate);
    }
    public Optional<BrowserMonitorScriptEventsEventKeystrokesWait> wait_() {
        return Optional.ofNullable(this.wait);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventKeystrokes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean masked;
        private @Nullable Boolean simulateBlurEvent;
        private @Nullable BrowserMonitorScriptEventsEventKeystrokesTarget target;
        private String text;
        private @Nullable BrowserMonitorScriptEventsEventKeystrokesValidate validate;
        private @Nullable BrowserMonitorScriptEventsEventKeystrokesWait wait;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventKeystrokes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masked = defaults.masked;
    	      this.simulateBlurEvent = defaults.simulateBlurEvent;
    	      this.target = defaults.target;
    	      this.text = defaults.text;
    	      this.validate = defaults.validate;
    	      this.wait = defaults.wait;
        }

        @CustomType.Setter
        public Builder masked(@Nullable Boolean masked) {
            this.masked = masked;
            return this;
        }
        @CustomType.Setter
        public Builder simulateBlurEvent(@Nullable Boolean simulateBlurEvent) {
            this.simulateBlurEvent = simulateBlurEvent;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable BrowserMonitorScriptEventsEventKeystrokesTarget target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        @CustomType.Setter
        public Builder validate(@Nullable BrowserMonitorScriptEventsEventKeystrokesValidate validate) {
            this.validate = validate;
            return this;
        }
        @CustomType.Setter("wait")
        public Builder wait_(@Nullable BrowserMonitorScriptEventsEventKeystrokesWait wait) {
            this.wait = wait;
            return this;
        }
        public BrowserMonitorScriptEventsEventKeystrokes build() {
            final var o = new BrowserMonitorScriptEventsEventKeystrokes();
            o.masked = masked;
            o.simulateBlurEvent = simulateBlurEvent;
            o.target = target;
            o.text = text;
            o.validate = validate;
            o.wait = wait;
            return o;
        }
    }
}