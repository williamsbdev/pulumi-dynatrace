// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.AwsAnomaliesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.AwsAnomaliesState;
import com.pulumi.dynatrace.outputs.AwsAnomaliesEc2CandidateHighCpuDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesElbHighConnectionErrorsDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesLambdaHighErrorRateDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesRdsHighCpuDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesRdsHighMemoryDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesRdsHighWriteReadLatencyDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesRdsLowStorageDetection;
import com.pulumi.dynatrace.outputs.AwsAnomaliesRdsRestartsSequenceDetection;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/awsAnomalies:AwsAnomalies")
public class AwsAnomalies extends com.pulumi.resources.CustomResource {
    /**
     * no documentation available
     * 
     */
    @Export(name="ec2CandidateHighCpuDetection", refs={AwsAnomaliesEc2CandidateHighCpuDetection.class}, tree="[0]")
    private Output<AwsAnomaliesEc2CandidateHighCpuDetection> ec2CandidateHighCpuDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesEc2CandidateHighCpuDetection> ec2CandidateHighCpuDetection() {
        return this.ec2CandidateHighCpuDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="elbHighConnectionErrorsDetection", refs={AwsAnomaliesElbHighConnectionErrorsDetection.class}, tree="[0]")
    private Output<AwsAnomaliesElbHighConnectionErrorsDetection> elbHighConnectionErrorsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesElbHighConnectionErrorsDetection> elbHighConnectionErrorsDetection() {
        return this.elbHighConnectionErrorsDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="lambdaHighErrorRateDetection", refs={AwsAnomaliesLambdaHighErrorRateDetection.class}, tree="[0]")
    private Output<AwsAnomaliesLambdaHighErrorRateDetection> lambdaHighErrorRateDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesLambdaHighErrorRateDetection> lambdaHighErrorRateDetection() {
        return this.lambdaHighErrorRateDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="rdsHighCpuDetection", refs={AwsAnomaliesRdsHighCpuDetection.class}, tree="[0]")
    private Output<AwsAnomaliesRdsHighCpuDetection> rdsHighCpuDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesRdsHighCpuDetection> rdsHighCpuDetection() {
        return this.rdsHighCpuDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="rdsHighMemoryDetection", refs={AwsAnomaliesRdsHighMemoryDetection.class}, tree="[0]")
    private Output<AwsAnomaliesRdsHighMemoryDetection> rdsHighMemoryDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesRdsHighMemoryDetection> rdsHighMemoryDetection() {
        return this.rdsHighMemoryDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="rdsHighWriteReadLatencyDetection", refs={AwsAnomaliesRdsHighWriteReadLatencyDetection.class}, tree="[0]")
    private Output<AwsAnomaliesRdsHighWriteReadLatencyDetection> rdsHighWriteReadLatencyDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesRdsHighWriteReadLatencyDetection> rdsHighWriteReadLatencyDetection() {
        return this.rdsHighWriteReadLatencyDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="rdsLowStorageDetection", refs={AwsAnomaliesRdsLowStorageDetection.class}, tree="[0]")
    private Output<AwsAnomaliesRdsLowStorageDetection> rdsLowStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesRdsLowStorageDetection> rdsLowStorageDetection() {
        return this.rdsLowStorageDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="rdsRestartsSequenceDetection", refs={AwsAnomaliesRdsRestartsSequenceDetection.class}, tree="[0]")
    private Output<AwsAnomaliesRdsRestartsSequenceDetection> rdsRestartsSequenceDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<AwsAnomaliesRdsRestartsSequenceDetection> rdsRestartsSequenceDetection() {
        return this.rdsRestartsSequenceDetection;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsAnomalies(String name) {
        this(name, AwsAnomaliesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsAnomalies(String name, AwsAnomaliesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsAnomalies(String name, AwsAnomaliesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/awsAnomalies:AwsAnomalies", name, args == null ? AwsAnomaliesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AwsAnomalies(String name, Output<String> id, @Nullable AwsAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/awsAnomalies:AwsAnomalies", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AwsAnomalies get(String name, Output<String> id, @Nullable AwsAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsAnomalies(name, id, state, options);
    }
}
