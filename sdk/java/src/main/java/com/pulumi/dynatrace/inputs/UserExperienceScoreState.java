// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserExperienceScoreState extends com.pulumi.resources.ResourceArgs {

    public static final UserExperienceScoreState Empty = new UserExperienceScoreState();

    /**
     * If last user action in a session is classified as Frustrating, classify the entire session as Frustrating
     * 
     */
    @Import(name="considerLastAction")
    private @Nullable Output<Boolean> considerLastAction;

    /**
     * @return If last user action in a session is classified as Frustrating, classify the entire session as Frustrating
     * 
     */
    public Optional<Output<Boolean>> considerLastAction() {
        return Optional.ofNullable(this.considerLastAction);
    }

    /**
     * Consider rage clicks / rage taps in score calculation
     * 
     */
    @Import(name="considerRageClick")
    private @Nullable Output<Boolean> considerRageClick;

    /**
     * @return Consider rage clicks / rage taps in score calculation
     * 
     */
    public Optional<Output<Boolean>> considerRageClick() {
        return Optional.ofNullable(this.considerRageClick);
    }

    /**
     * User experience is considered Frustrating when the selected percentage or more of the user actions in a session are rated as Frustrating.
     * 
     */
    @Import(name="maxFrustratedUserActionsThreshold")
    private @Nullable Output<Integer> maxFrustratedUserActionsThreshold;

    /**
     * @return User experience is considered Frustrating when the selected percentage or more of the user actions in a session are rated as Frustrating.
     * 
     */
    public Optional<Output<Integer>> maxFrustratedUserActionsThreshold() {
        return Optional.ofNullable(this.maxFrustratedUserActionsThreshold);
    }

    /**
     * User experience is considered Satisfying when at least the selected percentage of the user actions in a session are rated as Satisfying.
     * 
     */
    @Import(name="minSatisfiedUserActionsThreshold")
    private @Nullable Output<Integer> minSatisfiedUserActionsThreshold;

    /**
     * @return User experience is considered Satisfying when at least the selected percentage of the user actions in a session are rated as Satisfying.
     * 
     */
    public Optional<Output<Integer>> minSatisfiedUserActionsThreshold() {
        return Optional.ofNullable(this.minSatisfiedUserActionsThreshold);
    }

    private UserExperienceScoreState() {}

    private UserExperienceScoreState(UserExperienceScoreState $) {
        this.considerLastAction = $.considerLastAction;
        this.considerRageClick = $.considerRageClick;
        this.maxFrustratedUserActionsThreshold = $.maxFrustratedUserActionsThreshold;
        this.minSatisfiedUserActionsThreshold = $.minSatisfiedUserActionsThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserExperienceScoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserExperienceScoreState $;

        public Builder() {
            $ = new UserExperienceScoreState();
        }

        public Builder(UserExperienceScoreState defaults) {
            $ = new UserExperienceScoreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param considerLastAction If last user action in a session is classified as Frustrating, classify the entire session as Frustrating
         * 
         * @return builder
         * 
         */
        public Builder considerLastAction(@Nullable Output<Boolean> considerLastAction) {
            $.considerLastAction = considerLastAction;
            return this;
        }

        /**
         * @param considerLastAction If last user action in a session is classified as Frustrating, classify the entire session as Frustrating
         * 
         * @return builder
         * 
         */
        public Builder considerLastAction(Boolean considerLastAction) {
            return considerLastAction(Output.of(considerLastAction));
        }

        /**
         * @param considerRageClick Consider rage clicks / rage taps in score calculation
         * 
         * @return builder
         * 
         */
        public Builder considerRageClick(@Nullable Output<Boolean> considerRageClick) {
            $.considerRageClick = considerRageClick;
            return this;
        }

        /**
         * @param considerRageClick Consider rage clicks / rage taps in score calculation
         * 
         * @return builder
         * 
         */
        public Builder considerRageClick(Boolean considerRageClick) {
            return considerRageClick(Output.of(considerRageClick));
        }

        /**
         * @param maxFrustratedUserActionsThreshold User experience is considered Frustrating when the selected percentage or more of the user actions in a session are rated as Frustrating.
         * 
         * @return builder
         * 
         */
        public Builder maxFrustratedUserActionsThreshold(@Nullable Output<Integer> maxFrustratedUserActionsThreshold) {
            $.maxFrustratedUserActionsThreshold = maxFrustratedUserActionsThreshold;
            return this;
        }

        /**
         * @param maxFrustratedUserActionsThreshold User experience is considered Frustrating when the selected percentage or more of the user actions in a session are rated as Frustrating.
         * 
         * @return builder
         * 
         */
        public Builder maxFrustratedUserActionsThreshold(Integer maxFrustratedUserActionsThreshold) {
            return maxFrustratedUserActionsThreshold(Output.of(maxFrustratedUserActionsThreshold));
        }

        /**
         * @param minSatisfiedUserActionsThreshold User experience is considered Satisfying when at least the selected percentage of the user actions in a session are rated as Satisfying.
         * 
         * @return builder
         * 
         */
        public Builder minSatisfiedUserActionsThreshold(@Nullable Output<Integer> minSatisfiedUserActionsThreshold) {
            $.minSatisfiedUserActionsThreshold = minSatisfiedUserActionsThreshold;
            return this;
        }

        /**
         * @param minSatisfiedUserActionsThreshold User experience is considered Satisfying when at least the selected percentage of the user actions in a session are rated as Satisfying.
         * 
         * @return builder
         * 
         */
        public Builder minSatisfiedUserActionsThreshold(Integer minSatisfiedUserActionsThreshold) {
            return minSatisfiedUserActionsThreshold(Output.of(minSatisfiedUserActionsThreshold));
        }

        public UserExperienceScoreState build() {
            return $;
        }
    }

}
