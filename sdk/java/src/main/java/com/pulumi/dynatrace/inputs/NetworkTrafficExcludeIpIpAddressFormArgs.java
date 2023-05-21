// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetworkTrafficExcludeIpIpAddressFormArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkTrafficExcludeIpIpAddressFormArgs Empty = new NetworkTrafficExcludeIpIpAddressFormArgs();

    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    private NetworkTrafficExcludeIpIpAddressFormArgs() {}

    private NetworkTrafficExcludeIpIpAddressFormArgs(NetworkTrafficExcludeIpIpAddressFormArgs $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkTrafficExcludeIpIpAddressFormArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkTrafficExcludeIpIpAddressFormArgs $;

        public Builder() {
            $ = new NetworkTrafficExcludeIpIpAddressFormArgs();
        }

        public Builder(NetworkTrafficExcludeIpIpAddressFormArgs defaults) {
            $ = new NetworkTrafficExcludeIpIpAddressFormArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public NetworkTrafficExcludeIpIpAddressFormArgs build() {
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            return $;
        }
    }

}