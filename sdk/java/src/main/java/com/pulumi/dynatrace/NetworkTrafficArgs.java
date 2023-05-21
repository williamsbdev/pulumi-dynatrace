// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.NetworkTrafficExcludeIpArgs;
import com.pulumi.dynatrace.inputs.NetworkTrafficExcludeNicArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkTrafficArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkTrafficArgs Empty = new NetworkTrafficArgs();

    /**
     * Providing a host IP address, you will exclude network traffic only in calculating connectivity (other metrics will still be calculated).
     * 
     */
    @Import(name="excludeIp")
    private @Nullable Output<NetworkTrafficExcludeIpArgs> excludeIp;

    /**
     * @return Providing a host IP address, you will exclude network traffic only in calculating connectivity (other metrics will still be calculated).
     * 
     */
    public Optional<Output<NetworkTrafficExcludeIpArgs>> excludeIp() {
        return Optional.ofNullable(this.excludeIp);
    }

    /**
     * Selecting a network interface, you will exclude all network traffic on that interface from being monitored. You can select from the list below what to not monitor, or input it manually using the &#34;other one&#34; option.
     * 
     */
    @Import(name="excludeNic")
    private @Nullable Output<NetworkTrafficExcludeNicArgs> excludeNic;

    /**
     * @return Selecting a network interface, you will exclude all network traffic on that interface from being monitored. You can select from the list below what to not monitor, or input it manually using the &#34;other one&#34; option.
     * 
     */
    public Optional<Output<NetworkTrafficExcludeNicArgs>> excludeNic() {
        return Optional.ofNullable(this.excludeNic);
    }

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="hostId", required=true)
    private Output<String> hostId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Output<String> hostId() {
        return this.hostId;
    }

    private NetworkTrafficArgs() {}

    private NetworkTrafficArgs(NetworkTrafficArgs $) {
        this.excludeIp = $.excludeIp;
        this.excludeNic = $.excludeNic;
        this.hostId = $.hostId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkTrafficArgs $;

        public Builder() {
            $ = new NetworkTrafficArgs();
        }

        public Builder(NetworkTrafficArgs defaults) {
            $ = new NetworkTrafficArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeIp Providing a host IP address, you will exclude network traffic only in calculating connectivity (other metrics will still be calculated).
         * 
         * @return builder
         * 
         */
        public Builder excludeIp(@Nullable Output<NetworkTrafficExcludeIpArgs> excludeIp) {
            $.excludeIp = excludeIp;
            return this;
        }

        /**
         * @param excludeIp Providing a host IP address, you will exclude network traffic only in calculating connectivity (other metrics will still be calculated).
         * 
         * @return builder
         * 
         */
        public Builder excludeIp(NetworkTrafficExcludeIpArgs excludeIp) {
            return excludeIp(Output.of(excludeIp));
        }

        /**
         * @param excludeNic Selecting a network interface, you will exclude all network traffic on that interface from being monitored. You can select from the list below what to not monitor, or input it manually using the &#34;other one&#34; option.
         * 
         * @return builder
         * 
         */
        public Builder excludeNic(@Nullable Output<NetworkTrafficExcludeNicArgs> excludeNic) {
            $.excludeNic = excludeNic;
            return this;
        }

        /**
         * @param excludeNic Selecting a network interface, you will exclude all network traffic on that interface from being monitored. You can select from the list below what to not monitor, or input it manually using the &#34;other one&#34; option.
         * 
         * @return builder
         * 
         */
        public Builder excludeNic(NetworkTrafficExcludeNicArgs excludeNic) {
            return excludeNic(Output.of(excludeNic));
        }

        /**
         * @param hostId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder hostId(Output<String> hostId) {
            $.hostId = hostId;
            return this;
        }

        /**
         * @param hostId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder hostId(String hostId) {
            return hostId(Output.of(hostId));
        }

        public NetworkTrafficArgs build() {
            $.hostId = Objects.requireNonNull($.hostId, "expected parameter 'hostId' to be non-null");
            return $;
        }
    }

}