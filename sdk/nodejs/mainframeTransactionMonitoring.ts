// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class MainframeTransactionMonitoring extends pulumi.CustomResource {
    /**
     * Get an existing MainframeTransactionMonitoring resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MainframeTransactionMonitoringState, opts?: pulumi.CustomResourceOptions): MainframeTransactionMonitoring {
        return new MainframeTransactionMonitoring(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/mainframeTransactionMonitoring:MainframeTransactionMonitoring';

    /**
     * Returns true if the given object is an instance of MainframeTransactionMonitoring.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MainframeTransactionMonitoring {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MainframeTransactionMonitoring.__pulumiType;
    }

    /**
     * If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
     */
    public readonly groupCicsRegions!: pulumi.Output<boolean>;
    /**
     * If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
     */
    public readonly groupImsRegions!: pulumi.Output<boolean>;
    /**
     * If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
     */
    public readonly monitorAllCtgProtocols!: pulumi.Output<boolean>;
    /**
     * Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
     */
    public readonly monitorAllIncomingWebRequests!: pulumi.Output<boolean>;
    /**
     * We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
     */
    public readonly nodeLimit!: pulumi.Output<number>;
    /**
     * If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
     */
    public readonly zosCicsServiceDetectionUsesTransactionId!: pulumi.Output<boolean>;
    /**
     * If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
     */
    public readonly zosImsServiceDetectionUsesTransactionId!: pulumi.Output<boolean>;

    /**
     * Create a MainframeTransactionMonitoring resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MainframeTransactionMonitoringArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MainframeTransactionMonitoringArgs | MainframeTransactionMonitoringState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MainframeTransactionMonitoringState | undefined;
            resourceInputs["groupCicsRegions"] = state ? state.groupCicsRegions : undefined;
            resourceInputs["groupImsRegions"] = state ? state.groupImsRegions : undefined;
            resourceInputs["monitorAllCtgProtocols"] = state ? state.monitorAllCtgProtocols : undefined;
            resourceInputs["monitorAllIncomingWebRequests"] = state ? state.monitorAllIncomingWebRequests : undefined;
            resourceInputs["nodeLimit"] = state ? state.nodeLimit : undefined;
            resourceInputs["zosCicsServiceDetectionUsesTransactionId"] = state ? state.zosCicsServiceDetectionUsesTransactionId : undefined;
            resourceInputs["zosImsServiceDetectionUsesTransactionId"] = state ? state.zosImsServiceDetectionUsesTransactionId : undefined;
        } else {
            const args = argsOrState as MainframeTransactionMonitoringArgs | undefined;
            if ((!args || args.groupCicsRegions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupCicsRegions'");
            }
            if ((!args || args.groupImsRegions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupImsRegions'");
            }
            if ((!args || args.monitorAllCtgProtocols === undefined) && !opts.urn) {
                throw new Error("Missing required property 'monitorAllCtgProtocols'");
            }
            if ((!args || args.monitorAllIncomingWebRequests === undefined) && !opts.urn) {
                throw new Error("Missing required property 'monitorAllIncomingWebRequests'");
            }
            if ((!args || args.nodeLimit === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeLimit'");
            }
            if ((!args || args.zosCicsServiceDetectionUsesTransactionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zosCicsServiceDetectionUsesTransactionId'");
            }
            if ((!args || args.zosImsServiceDetectionUsesTransactionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zosImsServiceDetectionUsesTransactionId'");
            }
            resourceInputs["groupCicsRegions"] = args ? args.groupCicsRegions : undefined;
            resourceInputs["groupImsRegions"] = args ? args.groupImsRegions : undefined;
            resourceInputs["monitorAllCtgProtocols"] = args ? args.monitorAllCtgProtocols : undefined;
            resourceInputs["monitorAllIncomingWebRequests"] = args ? args.monitorAllIncomingWebRequests : undefined;
            resourceInputs["nodeLimit"] = args ? args.nodeLimit : undefined;
            resourceInputs["zosCicsServiceDetectionUsesTransactionId"] = args ? args.zosCicsServiceDetectionUsesTransactionId : undefined;
            resourceInputs["zosImsServiceDetectionUsesTransactionId"] = args ? args.zosImsServiceDetectionUsesTransactionId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MainframeTransactionMonitoring.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MainframeTransactionMonitoring resources.
 */
export interface MainframeTransactionMonitoringState {
    /**
     * If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
     */
    groupCicsRegions?: pulumi.Input<boolean>;
    /**
     * If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
     */
    groupImsRegions?: pulumi.Input<boolean>;
    /**
     * If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
     */
    monitorAllCtgProtocols?: pulumi.Input<boolean>;
    /**
     * Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
     */
    monitorAllIncomingWebRequests?: pulumi.Input<boolean>;
    /**
     * We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
     */
    nodeLimit?: pulumi.Input<number>;
    /**
     * If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
     */
    zosCicsServiceDetectionUsesTransactionId?: pulumi.Input<boolean>;
    /**
     * If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
     */
    zosImsServiceDetectionUsesTransactionId?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a MainframeTransactionMonitoring resource.
 */
export interface MainframeTransactionMonitoringArgs {
    /**
     * If enabled, CICS regions belonging to the same CICSPlex will be grouped into a single process group. If disabled, a process group will be created for each CICS region.
     */
    groupCicsRegions: pulumi.Input<boolean>;
    /**
     * If enabled, IMS regions belonging to the same subsystem will be grouped into a single process group. If disabled, a process group will be created for each IMS region.
     */
    groupImsRegions: pulumi.Input<boolean>;
    /**
     * If enabled, the CICS Transaction Gateway sensor will trace all EXCI requests including those that are using the TCP/IP or SNA protocol.
     */
    monitorAllCtgProtocols: pulumi.Input<boolean>;
    /**
     * Dynatrace automatically traces incoming web requests when they are called by already-monitored services. Enable this setting to monitor all incoming web requests. We recommend enabling it only over a short period of time.
     */
    monitorAllIncomingWebRequests: pulumi.Input<boolean>;
    /**
     * We recommend the default limit of 500 nodes. The value 0 means unlimited number of nodes.
     */
    nodeLimit: pulumi.Input<number>;
    /**
     * If enabled, a CICS service will be created for each monitored transaction ID within a process group. If disabled, a CICS service will be created for each monitored CICS region within a process group. We recommend enabling it only when the CICS regions are grouped by their CICSPlex.
     */
    zosCicsServiceDetectionUsesTransactionId: pulumi.Input<boolean>;
    /**
     * If enabled, an IMS service will be created for each monitored transaction ID within a process group. If disabled, an IMS service will be created for each monitored IMS region within a process group. We recommend enabling it only when the IMS regions are grouped by their subsystem.
     */
    zosImsServiceDetectionUsesTransactionId: pulumi.Input<boolean>;
}