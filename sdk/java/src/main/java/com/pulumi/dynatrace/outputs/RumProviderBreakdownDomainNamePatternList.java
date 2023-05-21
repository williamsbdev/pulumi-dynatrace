// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.RumProviderBreakdownDomainNamePatternListDomainNamePattern;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RumProviderBreakdownDomainNamePatternList {
    private List<RumProviderBreakdownDomainNamePatternListDomainNamePattern> domainNamePatterns;

    private RumProviderBreakdownDomainNamePatternList() {}
    public List<RumProviderBreakdownDomainNamePatternListDomainNamePattern> domainNamePatterns() {
        return this.domainNamePatterns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RumProviderBreakdownDomainNamePatternList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<RumProviderBreakdownDomainNamePatternListDomainNamePattern> domainNamePatterns;
        public Builder() {}
        public Builder(RumProviderBreakdownDomainNamePatternList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNamePatterns = defaults.domainNamePatterns;
        }

        @CustomType.Setter
        public Builder domainNamePatterns(List<RumProviderBreakdownDomainNamePatternListDomainNamePattern> domainNamePatterns) {
            this.domainNamePatterns = Objects.requireNonNull(domainNamePatterns);
            return this;
        }
        public Builder domainNamePatterns(RumProviderBreakdownDomainNamePatternListDomainNamePattern... domainNamePatterns) {
            return domainNamePatterns(List.of(domainNamePatterns));
        }
        public RumProviderBreakdownDomainNamePatternList build() {
            final var o = new RumProviderBreakdownDomainNamePatternList();
            o.domainNamePatterns = domainNamePatterns;
            return o;
        }
    }
}