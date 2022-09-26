// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.RequestAttributeDataSourceCicsSdkMethodNodeCondition;
import com.pulumi.dynatrace.outputs.RequestAttributeDataSourceIibLabelMethodNodeCondition;
import com.pulumi.dynatrace.outputs.RequestAttributeDataSourceIibMethodNodeCondition;
import com.pulumi.dynatrace.outputs.RequestAttributeDataSourceMethod;
import com.pulumi.dynatrace.outputs.RequestAttributeDataSourceScope;
import com.pulumi.dynatrace.outputs.RequestAttributeDataSourceValueProcessing;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RequestAttributeDataSource {
    /**
     * @return Specifies the location where the values are captured and stored.  Required if the **source** is one of the following: `GET_PARAMETER`, `URI`, `REQUEST_HEADER`, `RESPONSE_HEADER`.   Not applicable in other cases.   If the **source** value is `REQUEST_HEADER` or `RESPONSE_HEADER`, the `CAPTURE_AND_STORE_ON_BOTH` location is not allowed
     * 
     */
    private @Nullable String capturingAndStorageLocation;
    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    private @Nullable RequestAttributeDataSourceCicsSdkMethodNodeCondition cicsSdkMethodNodeCondition;
    /**
     * @return The data source is enabled (`true`) or disabled (`false`)
     * 
     */
    private Boolean enabled;
    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    private @Nullable RequestAttributeDataSourceIibLabelMethodNodeCondition iibLabelMethodNodeCondition;
    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    private @Nullable RequestAttributeDataSourceIibMethodNodeCondition iibMethodNodeCondition;
    /**
     * @return The IBM integration bus node type for which the value is captured.  This or `iibMethodNodeCondition` is required if the **source** is: `IIB_NODE`.  Not applicable in other cases
     * 
     */
    private @Nullable String iibNodeType;
    /**
     * @return The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
     * 
     */
    private @Nullable List<RequestAttributeDataSourceMethod> methods;
    /**
     * @return The name of the web request parameter to capture.  Required if the **source** is one of the following: `POST_PARAMETER`, `GET_PARAMETER`, `REQUEST_HEADER`, `RESPONSE_HEADER`, `CUSTOM_ATTRIBUTE`.  Not applicable in other cases
     * 
     */
    private @Nullable String parameterName;
    /**
     * @return Conditions for data capturing
     * 
     */
    private @Nullable RequestAttributeDataSourceScope scope;
    /**
     * @return The technology of the session attribute to capture if the **source** value is `SESSION_ATTRIBUTE`.
     * 
     */
    private @Nullable String sessionAttributeTechnology;
    /**
     * @return The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**
     * 
     */
    private String source;
    private @Nullable String technology;
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    private @Nullable String unknowns;
    private @Nullable RequestAttributeDataSourceValueProcessing valueProcessing;

    private RequestAttributeDataSource() {}
    /**
     * @return Specifies the location where the values are captured and stored.  Required if the **source** is one of the following: `GET_PARAMETER`, `URI`, `REQUEST_HEADER`, `RESPONSE_HEADER`.   Not applicable in other cases.   If the **source** value is `REQUEST_HEADER` or `RESPONSE_HEADER`, the `CAPTURE_AND_STORE_ON_BOTH` location is not allowed
     * 
     */
    public Optional<String> capturingAndStorageLocation() {
        return Optional.ofNullable(this.capturingAndStorageLocation);
    }
    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    public Optional<RequestAttributeDataSourceCicsSdkMethodNodeCondition> cicsSdkMethodNodeCondition() {
        return Optional.ofNullable(this.cicsSdkMethodNodeCondition);
    }
    /**
     * @return The data source is enabled (`true`) or disabled (`false`)
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    public Optional<RequestAttributeDataSourceIibLabelMethodNodeCondition> iibLabelMethodNodeCondition() {
        return Optional.ofNullable(this.iibLabelMethodNodeCondition);
    }
    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    public Optional<RequestAttributeDataSourceIibMethodNodeCondition> iibMethodNodeCondition() {
        return Optional.ofNullable(this.iibMethodNodeCondition);
    }
    /**
     * @return The IBM integration bus node type for which the value is captured.  This or `iibMethodNodeCondition` is required if the **source** is: `IIB_NODE`.  Not applicable in other cases
     * 
     */
    public Optional<String> iibNodeType() {
        return Optional.ofNullable(this.iibNodeType);
    }
    /**
     * @return The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
     * 
     */
    public List<RequestAttributeDataSourceMethod> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * @return The name of the web request parameter to capture.  Required if the **source** is one of the following: `POST_PARAMETER`, `GET_PARAMETER`, `REQUEST_HEADER`, `RESPONSE_HEADER`, `CUSTOM_ATTRIBUTE`.  Not applicable in other cases
     * 
     */
    public Optional<String> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }
    /**
     * @return Conditions for data capturing
     * 
     */
    public Optional<RequestAttributeDataSourceScope> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The technology of the session attribute to capture if the **source** value is `SESSION_ATTRIBUTE`.
     * 
     */
    public Optional<String> sessionAttributeTechnology() {
        return Optional.ofNullable(this.sessionAttributeTechnology);
    }
    /**
     * @return The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**
     * 
     */
    public String source() {
        return this.source;
    }
    public Optional<String> technology() {
        return Optional.ofNullable(this.technology);
    }
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }
    public Optional<RequestAttributeDataSourceValueProcessing> valueProcessing() {
        return Optional.ofNullable(this.valueProcessing);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestAttributeDataSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String capturingAndStorageLocation;
        private @Nullable RequestAttributeDataSourceCicsSdkMethodNodeCondition cicsSdkMethodNodeCondition;
        private Boolean enabled;
        private @Nullable RequestAttributeDataSourceIibLabelMethodNodeCondition iibLabelMethodNodeCondition;
        private @Nullable RequestAttributeDataSourceIibMethodNodeCondition iibMethodNodeCondition;
        private @Nullable String iibNodeType;
        private @Nullable List<RequestAttributeDataSourceMethod> methods;
        private @Nullable String parameterName;
        private @Nullable RequestAttributeDataSourceScope scope;
        private @Nullable String sessionAttributeTechnology;
        private String source;
        private @Nullable String technology;
        private @Nullable String unknowns;
        private @Nullable RequestAttributeDataSourceValueProcessing valueProcessing;
        public Builder() {}
        public Builder(RequestAttributeDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capturingAndStorageLocation = defaults.capturingAndStorageLocation;
    	      this.cicsSdkMethodNodeCondition = defaults.cicsSdkMethodNodeCondition;
    	      this.enabled = defaults.enabled;
    	      this.iibLabelMethodNodeCondition = defaults.iibLabelMethodNodeCondition;
    	      this.iibMethodNodeCondition = defaults.iibMethodNodeCondition;
    	      this.iibNodeType = defaults.iibNodeType;
    	      this.methods = defaults.methods;
    	      this.parameterName = defaults.parameterName;
    	      this.scope = defaults.scope;
    	      this.sessionAttributeTechnology = defaults.sessionAttributeTechnology;
    	      this.source = defaults.source;
    	      this.technology = defaults.technology;
    	      this.unknowns = defaults.unknowns;
    	      this.valueProcessing = defaults.valueProcessing;
        }

        @CustomType.Setter
        public Builder capturingAndStorageLocation(@Nullable String capturingAndStorageLocation) {
            this.capturingAndStorageLocation = capturingAndStorageLocation;
            return this;
        }
        @CustomType.Setter
        public Builder cicsSdkMethodNodeCondition(@Nullable RequestAttributeDataSourceCicsSdkMethodNodeCondition cicsSdkMethodNodeCondition) {
            this.cicsSdkMethodNodeCondition = cicsSdkMethodNodeCondition;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder iibLabelMethodNodeCondition(@Nullable RequestAttributeDataSourceIibLabelMethodNodeCondition iibLabelMethodNodeCondition) {
            this.iibLabelMethodNodeCondition = iibLabelMethodNodeCondition;
            return this;
        }
        @CustomType.Setter
        public Builder iibMethodNodeCondition(@Nullable RequestAttributeDataSourceIibMethodNodeCondition iibMethodNodeCondition) {
            this.iibMethodNodeCondition = iibMethodNodeCondition;
            return this;
        }
        @CustomType.Setter
        public Builder iibNodeType(@Nullable String iibNodeType) {
            this.iibNodeType = iibNodeType;
            return this;
        }
        @CustomType.Setter
        public Builder methods(@Nullable List<RequestAttributeDataSourceMethod> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(RequestAttributeDataSourceMethod... methods) {
            return methods(List.of(methods));
        }
        @CustomType.Setter
        public Builder parameterName(@Nullable String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable RequestAttributeDataSourceScope scope) {
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder sessionAttributeTechnology(@Nullable String sessionAttributeTechnology) {
            this.sessionAttributeTechnology = sessionAttributeTechnology;
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder technology(@Nullable String technology) {
            this.technology = technology;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        @CustomType.Setter
        public Builder valueProcessing(@Nullable RequestAttributeDataSourceValueProcessing valueProcessing) {
            this.valueProcessing = valueProcessing;
            return this;
        }
        public RequestAttributeDataSource build() {
            final var o = new RequestAttributeDataSource();
            o.capturingAndStorageLocation = capturingAndStorageLocation;
            o.cicsSdkMethodNodeCondition = cicsSdkMethodNodeCondition;
            o.enabled = enabled;
            o.iibLabelMethodNodeCondition = iibLabelMethodNodeCondition;
            o.iibMethodNodeCondition = iibMethodNodeCondition;
            o.iibNodeType = iibNodeType;
            o.methods = methods;
            o.parameterName = parameterName;
            o.scope = scope;
            o.sessionAttributeTechnology = sessionAttributeTechnology;
            o.source = source;
            o.technology = technology;
            o.unknowns = unknowns;
            o.valueProcessing = valueProcessing;
            return o;
        }
    }
}