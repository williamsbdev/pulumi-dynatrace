// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ImsBridgesQueueManagerQueueManager;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ImsBridgesQueueManager {
    /**
     * @return Queue manager definition for IMS bridge
     * 
     */
    private @Nullable List<ImsBridgesQueueManagerQueueManager> queueManagers;

    private ImsBridgesQueueManager() {}
    /**
     * @return Queue manager definition for IMS bridge
     * 
     */
    public List<ImsBridgesQueueManagerQueueManager> queueManagers() {
        return this.queueManagers == null ? List.of() : this.queueManagers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImsBridgesQueueManager defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ImsBridgesQueueManagerQueueManager> queueManagers;
        public Builder() {}
        public Builder(ImsBridgesQueueManager defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueManagers = defaults.queueManagers;
        }

        @CustomType.Setter
        public Builder queueManagers(@Nullable List<ImsBridgesQueueManagerQueueManager> queueManagers) {
            this.queueManagers = queueManagers;
            return this;
        }
        public Builder queueManagers(ImsBridgesQueueManagerQueueManager... queueManagers) {
            return queueManagers(List.of(queueManagers));
        }
        public ImsBridgesQueueManager build() {
            final var o = new ImsBridgesQueueManager();
            o.queueManagers = queueManagers;
            return o;
        }
    }
}