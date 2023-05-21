// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceExternalWebServiceConditionsConditionArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceExternalWebServiceConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExternalWebServiceConditionsArgs Empty = new ServiceExternalWebServiceConditionsArgs();

    @Import(name="conditions", required=true)
    private Output<List<ServiceExternalWebServiceConditionsConditionArgs>> conditions;

    public Output<List<ServiceExternalWebServiceConditionsConditionArgs>> conditions() {
        return this.conditions;
    }

    private ServiceExternalWebServiceConditionsArgs() {}

    private ServiceExternalWebServiceConditionsArgs(ServiceExternalWebServiceConditionsArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExternalWebServiceConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExternalWebServiceConditionsArgs $;

        public Builder() {
            $ = new ServiceExternalWebServiceConditionsArgs();
        }

        public Builder(ServiceExternalWebServiceConditionsArgs defaults) {
            $ = new ServiceExternalWebServiceConditionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(Output<List<ServiceExternalWebServiceConditionsConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ServiceExternalWebServiceConditionsConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ServiceExternalWebServiceConditionsConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public ServiceExternalWebServiceConditionsArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}
