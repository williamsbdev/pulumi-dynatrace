// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebApplicationUserTagsTagArgs;
import java.util.List;
import java.util.Objects;


public final class WebApplicationUserTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationUserTagsArgs Empty = new WebApplicationUserTagsArgs();

    /**
     * User tag settings
     * 
     */
    @Import(name="tags", required=true)
    private Output<List<WebApplicationUserTagsTagArgs>> tags;

    /**
     * @return User tag settings
     * 
     */
    public Output<List<WebApplicationUserTagsTagArgs>> tags() {
        return this.tags;
    }

    private WebApplicationUserTagsArgs() {}

    private WebApplicationUserTagsArgs(WebApplicationUserTagsArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationUserTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationUserTagsArgs $;

        public Builder() {
            $ = new WebApplicationUserTagsArgs();
        }

        public Builder(WebApplicationUserTagsArgs defaults) {
            $ = new WebApplicationUserTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags User tag settings
         * 
         * @return builder
         * 
         */
        public Builder tags(Output<List<WebApplicationUserTagsTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags User tag settings
         * 
         * @return builder
         * 
         */
        public Builder tags(List<WebApplicationUserTagsTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags User tag settings
         * 
         * @return builder
         * 
         */
        public Builder tags(WebApplicationUserTagsTagArgs... tags) {
            return tags(List.of(tags));
        }

        public WebApplicationUserTagsArgs build() {
            $.tags = Objects.requireNonNull($.tags, "expected parameter 'tags' to be non-null");
            return $;
        }
    }

}