// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnsibleTowerNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnsibleTowerNotificationArgs Empty = new AnsibleTowerNotificationArgs();

    /**
     * The notification is active (`true`) or inactive (`false`). Default is `false`.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return The notification is active (`true`) or inactive (`false`). Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    @Import(name="customMessage", required=true)
    private Output<String> customMessage;

    /**
     * @return The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    public Output<String> customMessage() {
        return this.customMessage;
    }

    /**
     * Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
     * 
     */
    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * The URL of the target Ansible Tower job template
     * 
     */
    @Import(name="jobTemplateUrl", required=true)
    private Output<String> jobTemplateUrl;

    /**
     * @return The URL of the target Ansible Tower job template
     * 
     */
    public Output<String> jobTemplateUrl() {
        return this.jobTemplateUrl;
    }

    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    @Import(name="legacyId")
    private @Nullable Output<String> legacyId;

    /**
     * @return The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    public Optional<Output<String>> legacyId() {
        return Optional.ofNullable(this.legacyId);
    }

    /**
     * The display name within the Dynatrace WebUI.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The display name within the Dynatrace WebUI.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The password for the Ansible Tower account
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the Ansible Tower account
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ID of the associated alerting profile.
     * 
     */
    @Import(name="profile", required=true)
    private Output<String> profile;

    /**
     * @return The ID of the associated alerting profile.
     * 
     */
    public Output<String> profile() {
        return this.profile;
    }

    /**
     * The username of the Ansible Tower account
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username of the Ansible Tower account
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private AnsibleTowerNotificationArgs() {}

    private AnsibleTowerNotificationArgs(AnsibleTowerNotificationArgs $) {
        this.active = $.active;
        this.customMessage = $.customMessage;
        this.insecure = $.insecure;
        this.jobTemplateUrl = $.jobTemplateUrl;
        this.legacyId = $.legacyId;
        this.name = $.name;
        this.password = $.password;
        this.profile = $.profile;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnsibleTowerNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnsibleTowerNotificationArgs $;

        public Builder() {
            $ = new AnsibleTowerNotificationArgs();
        }

        public Builder(AnsibleTowerNotificationArgs defaults) {
            $ = new AnsibleTowerNotificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active The notification is active (`true`) or inactive (`false`). Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active The notification is active (`true`) or inactive (`false`). Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param customMessage The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
         * 
         * @return builder
         * 
         */
        public Builder customMessage(Output<String> customMessage) {
            $.customMessage = customMessage;
            return this;
        }

        /**
         * @param customMessage The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
         * 
         * @return builder
         * 
         */
        public Builder customMessage(String customMessage) {
            return customMessage(Output.of(customMessage));
        }

        /**
         * @param insecure Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param jobTemplateUrl The URL of the target Ansible Tower job template
         * 
         * @return builder
         * 
         */
        public Builder jobTemplateUrl(Output<String> jobTemplateUrl) {
            $.jobTemplateUrl = jobTemplateUrl;
            return this;
        }

        /**
         * @param jobTemplateUrl The URL of the target Ansible Tower job template
         * 
         * @return builder
         * 
         */
        public Builder jobTemplateUrl(String jobTemplateUrl) {
            return jobTemplateUrl(Output.of(jobTemplateUrl));
        }

        /**
         * @param legacyId The ID of these settings when referred to from resources requiring the REST API V1 keys
         * 
         * @return builder
         * 
         */
        public Builder legacyId(@Nullable Output<String> legacyId) {
            $.legacyId = legacyId;
            return this;
        }

        /**
         * @param legacyId The ID of these settings when referred to from resources requiring the REST API V1 keys
         * 
         * @return builder
         * 
         */
        public Builder legacyId(String legacyId) {
            return legacyId(Output.of(legacyId));
        }

        /**
         * @param name The display name within the Dynatrace WebUI.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The display name within the Dynatrace WebUI.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password for the Ansible Tower account
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the Ansible Tower account
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param profile The ID of the associated alerting profile.
         * 
         * @return builder
         * 
         */
        public Builder profile(Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile The ID of the associated alerting profile.
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param username The username of the Ansible Tower account
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the Ansible Tower account
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public AnsibleTowerNotificationArgs build() {
            $.customMessage = Objects.requireNonNull($.customMessage, "expected parameter 'customMessage' to be non-null");
            $.jobTemplateUrl = Objects.requireNonNull($.jobTemplateUrl, "expected parameter 'jobTemplateUrl' to be non-null");
            $.profile = Objects.requireNonNull($.profile, "expected parameter 'profile' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
