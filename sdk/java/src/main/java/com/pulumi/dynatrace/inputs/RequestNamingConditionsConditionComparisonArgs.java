// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonBooleanArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonEsbInputNodeTypeArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonFailedStateArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonFailureReasonArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonFastStringArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonFlawStateArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonGenericArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonHttpMethodArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonHttpStatusClassArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonIibInputNodeTypeArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonNumberArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonNumberRequestAttributeArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonServiceTypeArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonStringArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonStringRequestAttributeArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonTagArgs;
import com.pulumi.dynatrace.inputs.RequestNamingConditionsConditionComparisonZosCallTypeArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestNamingConditionsConditionComparisonArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestNamingConditionsConditionComparisonArgs Empty = new RequestNamingConditionsConditionComparisonArgs();

    @Import(name="boolean")
    private @Nullable Output<RequestNamingConditionsConditionComparisonBooleanArgs> boolean_;

    public Optional<Output<RequestNamingConditionsConditionComparisonBooleanArgs>> boolean_() {
        return Optional.ofNullable(this.boolean_);
    }

    @Import(name="esbInputNodeType")
    private @Nullable Output<RequestNamingConditionsConditionComparisonEsbInputNodeTypeArgs> esbInputNodeType;

    public Optional<Output<RequestNamingConditionsConditionComparisonEsbInputNodeTypeArgs>> esbInputNodeType() {
        return Optional.ofNullable(this.esbInputNodeType);
    }

    @Import(name="failedState")
    private @Nullable Output<RequestNamingConditionsConditionComparisonFailedStateArgs> failedState;

    public Optional<Output<RequestNamingConditionsConditionComparisonFailedStateArgs>> failedState() {
        return Optional.ofNullable(this.failedState);
    }

    @Import(name="failureReason")
    private @Nullable Output<RequestNamingConditionsConditionComparisonFailureReasonArgs> failureReason;

    public Optional<Output<RequestNamingConditionsConditionComparisonFailureReasonArgs>> failureReason() {
        return Optional.ofNullable(this.failureReason);
    }

    @Import(name="fastString")
    private @Nullable Output<RequestNamingConditionsConditionComparisonFastStringArgs> fastString;

    public Optional<Output<RequestNamingConditionsConditionComparisonFastStringArgs>> fastString() {
        return Optional.ofNullable(this.fastString);
    }

    @Import(name="flawState")
    private @Nullable Output<RequestNamingConditionsConditionComparisonFlawStateArgs> flawState;

    public Optional<Output<RequestNamingConditionsConditionComparisonFlawStateArgs>> flawState() {
        return Optional.ofNullable(this.flawState);
    }

    @Import(name="generic")
    private @Nullable Output<RequestNamingConditionsConditionComparisonGenericArgs> generic;

    public Optional<Output<RequestNamingConditionsConditionComparisonGenericArgs>> generic() {
        return Optional.ofNullable(this.generic);
    }

    @Import(name="httpMethod")
    private @Nullable Output<RequestNamingConditionsConditionComparisonHttpMethodArgs> httpMethod;

    public Optional<Output<RequestNamingConditionsConditionComparisonHttpMethodArgs>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    @Import(name="httpStatusClass")
    private @Nullable Output<RequestNamingConditionsConditionComparisonHttpStatusClassArgs> httpStatusClass;

    public Optional<Output<RequestNamingConditionsConditionComparisonHttpStatusClassArgs>> httpStatusClass() {
        return Optional.ofNullable(this.httpStatusClass);
    }

    @Import(name="iibInputNodeType")
    private @Nullable Output<RequestNamingConditionsConditionComparisonIibInputNodeTypeArgs> iibInputNodeType;

    public Optional<Output<RequestNamingConditionsConditionComparisonIibInputNodeTypeArgs>> iibInputNodeType() {
        return Optional.ofNullable(this.iibInputNodeType);
    }

    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    @Import(name="number")
    private @Nullable Output<RequestNamingConditionsConditionComparisonNumberArgs> number;

    public Optional<Output<RequestNamingConditionsConditionComparisonNumberArgs>> number() {
        return Optional.ofNullable(this.number);
    }

    @Import(name="numberRequestAttribute")
    private @Nullable Output<RequestNamingConditionsConditionComparisonNumberRequestAttributeArgs> numberRequestAttribute;

    public Optional<Output<RequestNamingConditionsConditionComparisonNumberRequestAttributeArgs>> numberRequestAttribute() {
        return Optional.ofNullable(this.numberRequestAttribute);
    }

    @Import(name="serviceType")
    private @Nullable Output<RequestNamingConditionsConditionComparisonServiceTypeArgs> serviceType;

    public Optional<Output<RequestNamingConditionsConditionComparisonServiceTypeArgs>> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }

    @Import(name="string")
    private @Nullable Output<RequestNamingConditionsConditionComparisonStringArgs> string;

    public Optional<Output<RequestNamingConditionsConditionComparisonStringArgs>> string() {
        return Optional.ofNullable(this.string);
    }

    @Import(name="stringRequestAttribute")
    private @Nullable Output<RequestNamingConditionsConditionComparisonStringRequestAttributeArgs> stringRequestAttribute;

    public Optional<Output<RequestNamingConditionsConditionComparisonStringRequestAttributeArgs>> stringRequestAttribute() {
        return Optional.ofNullable(this.stringRequestAttribute);
    }

    @Import(name="tag")
    private @Nullable Output<RequestNamingConditionsConditionComparisonTagArgs> tag;

    public Optional<Output<RequestNamingConditionsConditionComparisonTagArgs>> tag() {
        return Optional.ofNullable(this.tag);
    }

    @Import(name="zosCallType")
    private @Nullable Output<RequestNamingConditionsConditionComparisonZosCallTypeArgs> zosCallType;

    public Optional<Output<RequestNamingConditionsConditionComparisonZosCallTypeArgs>> zosCallType() {
        return Optional.ofNullable(this.zosCallType);
    }

    private RequestNamingConditionsConditionComparisonArgs() {}

    private RequestNamingConditionsConditionComparisonArgs(RequestNamingConditionsConditionComparisonArgs $) {
        this.boolean_ = $.boolean_;
        this.esbInputNodeType = $.esbInputNodeType;
        this.failedState = $.failedState;
        this.failureReason = $.failureReason;
        this.fastString = $.fastString;
        this.flawState = $.flawState;
        this.generic = $.generic;
        this.httpMethod = $.httpMethod;
        this.httpStatusClass = $.httpStatusClass;
        this.iibInputNodeType = $.iibInputNodeType;
        this.negate = $.negate;
        this.number = $.number;
        this.numberRequestAttribute = $.numberRequestAttribute;
        this.serviceType = $.serviceType;
        this.string = $.string;
        this.stringRequestAttribute = $.stringRequestAttribute;
        this.tag = $.tag;
        this.zosCallType = $.zosCallType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestNamingConditionsConditionComparisonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestNamingConditionsConditionComparisonArgs $;

        public Builder() {
            $ = new RequestNamingConditionsConditionComparisonArgs();
        }

        public Builder(RequestNamingConditionsConditionComparisonArgs defaults) {
            $ = new RequestNamingConditionsConditionComparisonArgs(Objects.requireNonNull(defaults));
        }

        public Builder boolean_(@Nullable Output<RequestNamingConditionsConditionComparisonBooleanArgs> boolean_) {
            $.boolean_ = boolean_;
            return this;
        }

        public Builder boolean_(RequestNamingConditionsConditionComparisonBooleanArgs boolean_) {
            return boolean_(Output.of(boolean_));
        }

        public Builder esbInputNodeType(@Nullable Output<RequestNamingConditionsConditionComparisonEsbInputNodeTypeArgs> esbInputNodeType) {
            $.esbInputNodeType = esbInputNodeType;
            return this;
        }

        public Builder esbInputNodeType(RequestNamingConditionsConditionComparisonEsbInputNodeTypeArgs esbInputNodeType) {
            return esbInputNodeType(Output.of(esbInputNodeType));
        }

        public Builder failedState(@Nullable Output<RequestNamingConditionsConditionComparisonFailedStateArgs> failedState) {
            $.failedState = failedState;
            return this;
        }

        public Builder failedState(RequestNamingConditionsConditionComparisonFailedStateArgs failedState) {
            return failedState(Output.of(failedState));
        }

        public Builder failureReason(@Nullable Output<RequestNamingConditionsConditionComparisonFailureReasonArgs> failureReason) {
            $.failureReason = failureReason;
            return this;
        }

        public Builder failureReason(RequestNamingConditionsConditionComparisonFailureReasonArgs failureReason) {
            return failureReason(Output.of(failureReason));
        }

        public Builder fastString(@Nullable Output<RequestNamingConditionsConditionComparisonFastStringArgs> fastString) {
            $.fastString = fastString;
            return this;
        }

        public Builder fastString(RequestNamingConditionsConditionComparisonFastStringArgs fastString) {
            return fastString(Output.of(fastString));
        }

        public Builder flawState(@Nullable Output<RequestNamingConditionsConditionComparisonFlawStateArgs> flawState) {
            $.flawState = flawState;
            return this;
        }

        public Builder flawState(RequestNamingConditionsConditionComparisonFlawStateArgs flawState) {
            return flawState(Output.of(flawState));
        }

        public Builder generic(@Nullable Output<RequestNamingConditionsConditionComparisonGenericArgs> generic) {
            $.generic = generic;
            return this;
        }

        public Builder generic(RequestNamingConditionsConditionComparisonGenericArgs generic) {
            return generic(Output.of(generic));
        }

        public Builder httpMethod(@Nullable Output<RequestNamingConditionsConditionComparisonHttpMethodArgs> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(RequestNamingConditionsConditionComparisonHttpMethodArgs httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        public Builder httpStatusClass(@Nullable Output<RequestNamingConditionsConditionComparisonHttpStatusClassArgs> httpStatusClass) {
            $.httpStatusClass = httpStatusClass;
            return this;
        }

        public Builder httpStatusClass(RequestNamingConditionsConditionComparisonHttpStatusClassArgs httpStatusClass) {
            return httpStatusClass(Output.of(httpStatusClass));
        }

        public Builder iibInputNodeType(@Nullable Output<RequestNamingConditionsConditionComparisonIibInputNodeTypeArgs> iibInputNodeType) {
            $.iibInputNodeType = iibInputNodeType;
            return this;
        }

        public Builder iibInputNodeType(RequestNamingConditionsConditionComparisonIibInputNodeTypeArgs iibInputNodeType) {
            return iibInputNodeType(Output.of(iibInputNodeType));
        }

        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        public Builder number(@Nullable Output<RequestNamingConditionsConditionComparisonNumberArgs> number) {
            $.number = number;
            return this;
        }

        public Builder number(RequestNamingConditionsConditionComparisonNumberArgs number) {
            return number(Output.of(number));
        }

        public Builder numberRequestAttribute(@Nullable Output<RequestNamingConditionsConditionComparisonNumberRequestAttributeArgs> numberRequestAttribute) {
            $.numberRequestAttribute = numberRequestAttribute;
            return this;
        }

        public Builder numberRequestAttribute(RequestNamingConditionsConditionComparisonNumberRequestAttributeArgs numberRequestAttribute) {
            return numberRequestAttribute(Output.of(numberRequestAttribute));
        }

        public Builder serviceType(@Nullable Output<RequestNamingConditionsConditionComparisonServiceTypeArgs> serviceType) {
            $.serviceType = serviceType;
            return this;
        }

        public Builder serviceType(RequestNamingConditionsConditionComparisonServiceTypeArgs serviceType) {
            return serviceType(Output.of(serviceType));
        }

        public Builder string(@Nullable Output<RequestNamingConditionsConditionComparisonStringArgs> string) {
            $.string = string;
            return this;
        }

        public Builder string(RequestNamingConditionsConditionComparisonStringArgs string) {
            return string(Output.of(string));
        }

        public Builder stringRequestAttribute(@Nullable Output<RequestNamingConditionsConditionComparisonStringRequestAttributeArgs> stringRequestAttribute) {
            $.stringRequestAttribute = stringRequestAttribute;
            return this;
        }

        public Builder stringRequestAttribute(RequestNamingConditionsConditionComparisonStringRequestAttributeArgs stringRequestAttribute) {
            return stringRequestAttribute(Output.of(stringRequestAttribute));
        }

        public Builder tag(@Nullable Output<RequestNamingConditionsConditionComparisonTagArgs> tag) {
            $.tag = tag;
            return this;
        }

        public Builder tag(RequestNamingConditionsConditionComparisonTagArgs tag) {
            return tag(Output.of(tag));
        }

        public Builder zosCallType(@Nullable Output<RequestNamingConditionsConditionComparisonZosCallTypeArgs> zosCallType) {
            $.zosCallType = zosCallType;
            return this;
        }

        public Builder zosCallType(RequestNamingConditionsConditionComparisonZosCallTypeArgs zosCallType) {
            return zosCallType(Output.of(zosCallType));
        }

        public RequestNamingConditionsConditionComparisonArgs build() {
            return $;
        }
    }

}