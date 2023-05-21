// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.NetworkTrafficExcludeNicNicForm;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NetworkTrafficExcludeNic {
    private List<NetworkTrafficExcludeNicNicForm> nicForms;

    private NetworkTrafficExcludeNic() {}
    public List<NetworkTrafficExcludeNicNicForm> nicForms() {
        return this.nicForms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkTrafficExcludeNic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<NetworkTrafficExcludeNicNicForm> nicForms;
        public Builder() {}
        public Builder(NetworkTrafficExcludeNic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nicForms = defaults.nicForms;
        }

        @CustomType.Setter
        public Builder nicForms(List<NetworkTrafficExcludeNicNicForm> nicForms) {
            this.nicForms = Objects.requireNonNull(nicForms);
            return this;
        }
        public Builder nicForms(NetworkTrafficExcludeNicNicForm... nicForms) {
            return nicForms(List.of(nicForms));
        }
        public NetworkTrafficExcludeNic build() {
            final var o = new NetworkTrafficExcludeNic();
            o.nicForms = nicForms;
            return o;
        }
    }
}