// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceHttpFailureBrokenLinksArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHttpFailureBrokenLinksArgs Empty = new ServiceHttpFailureBrokenLinksArgs();

    /**
     * If your application relies on other hosts at other domains, add the associated domain names here. Once configured, Dynatrace will consider 404s thrown by hosts at these domains to be service failures related to your application.
     * 
     */
    @Import(name="brokenLinkDomains")
    private @Nullable Output<List<String>> brokenLinkDomains;

    /**
     * @return If your application relies on other hosts at other domains, add the associated domain names here. Once configured, Dynatrace will consider 404s thrown by hosts at these domains to be service failures related to your application.
     * 
     */
    public Optional<Output<List<String>>> brokenLinkDomains() {
        return Optional.ofNullable(this.brokenLinkDomains);
    }

    /**
     * Consider 404 HTTP response codes as failures
     * 
     */
    @Import(name="http404NotFoundFailures", required=true)
    private Output<Boolean> http404NotFoundFailures;

    /**
     * @return Consider 404 HTTP response codes as failures
     * 
     */
    public Output<Boolean> http404NotFoundFailures() {
        return this.http404NotFoundFailures;
    }

    private ServiceHttpFailureBrokenLinksArgs() {}

    private ServiceHttpFailureBrokenLinksArgs(ServiceHttpFailureBrokenLinksArgs $) {
        this.brokenLinkDomains = $.brokenLinkDomains;
        this.http404NotFoundFailures = $.http404NotFoundFailures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHttpFailureBrokenLinksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHttpFailureBrokenLinksArgs $;

        public Builder() {
            $ = new ServiceHttpFailureBrokenLinksArgs();
        }

        public Builder(ServiceHttpFailureBrokenLinksArgs defaults) {
            $ = new ServiceHttpFailureBrokenLinksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brokenLinkDomains If your application relies on other hosts at other domains, add the associated domain names here. Once configured, Dynatrace will consider 404s thrown by hosts at these domains to be service failures related to your application.
         * 
         * @return builder
         * 
         */
        public Builder brokenLinkDomains(@Nullable Output<List<String>> brokenLinkDomains) {
            $.brokenLinkDomains = brokenLinkDomains;
            return this;
        }

        /**
         * @param brokenLinkDomains If your application relies on other hosts at other domains, add the associated domain names here. Once configured, Dynatrace will consider 404s thrown by hosts at these domains to be service failures related to your application.
         * 
         * @return builder
         * 
         */
        public Builder brokenLinkDomains(List<String> brokenLinkDomains) {
            return brokenLinkDomains(Output.of(brokenLinkDomains));
        }

        /**
         * @param brokenLinkDomains If your application relies on other hosts at other domains, add the associated domain names here. Once configured, Dynatrace will consider 404s thrown by hosts at these domains to be service failures related to your application.
         * 
         * @return builder
         * 
         */
        public Builder brokenLinkDomains(String... brokenLinkDomains) {
            return brokenLinkDomains(List.of(brokenLinkDomains));
        }

        /**
         * @param http404NotFoundFailures Consider 404 HTTP response codes as failures
         * 
         * @return builder
         * 
         */
        public Builder http404NotFoundFailures(Output<Boolean> http404NotFoundFailures) {
            $.http404NotFoundFailures = http404NotFoundFailures;
            return this;
        }

        /**
         * @param http404NotFoundFailures Consider 404 HTTP response codes as failures
         * 
         * @return builder
         * 
         */
        public Builder http404NotFoundFailures(Boolean http404NotFoundFailures) {
            return http404NotFoundFailures(Output.of(http404NotFoundFailures));
        }

        public ServiceHttpFailureBrokenLinksArgs build() {
            $.http404NotFoundFailures = Objects.requireNonNull($.http404NotFoundFailures, "expected parameter 'http404NotFoundFailures' to be non-null");
            return $;
        }
    }

}
