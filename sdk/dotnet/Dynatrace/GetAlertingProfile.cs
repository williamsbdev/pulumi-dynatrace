// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    public static class GetAlertingProfile
    {
        /// <summary>
        /// The Alerting Profile queries for an Alerting Profile that has a specified name. In case multiple Alerting Profiles share the same name the first one found will be used.
        /// The ID of this Data Resource aligns with the IDs used by the Dynatrace Settings 2.0 API.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Dynatrace = Lbrlabs.PulumiPackage.Dynatrace;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Dynatrace.GetAlertingProfile.Invoke(new()
        ///     {
        ///         Name = "Default",
        ///     });
        /// 
        ///     var myWebhookNotification = new Dynatrace.WebhookNotification("myWebhookNotification", new()
        ///     {
        ///         Active = false,
        ///         Profile = @default.Apply(getAlertingProfileResult =&gt; getAlertingProfileResult).Apply(@default =&gt; @default.Apply(getAlertingProfileResult =&gt; getAlertingProfileResult.Id)),
        ///         Url = "https://webhook.site/40bf4d43-1a50-4ebd-913d-bf50ce7c3a1e",
        ///         Insecure = true,
        ///         NotifyEventMerges = true,
        ///         NotifyClosedProblems = true,
        ///         Payload = "web-hook-payload",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAlertingProfileResult> InvokeAsync(GetAlertingProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlertingProfileResult>("dynatrace:index/getAlertingProfile:getAlertingProfile", args ?? new GetAlertingProfileArgs(), options.WithDefaults());

        /// <summary>
        /// The Alerting Profile queries for an Alerting Profile that has a specified name. In case multiple Alerting Profiles share the same name the first one found will be used.
        /// The ID of this Data Resource aligns with the IDs used by the Dynatrace Settings 2.0 API.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Dynatrace = Lbrlabs.PulumiPackage.Dynatrace;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Dynatrace.GetAlertingProfile.Invoke(new()
        ///     {
        ///         Name = "Default",
        ///     });
        /// 
        ///     var myWebhookNotification = new Dynatrace.WebhookNotification("myWebhookNotification", new()
        ///     {
        ///         Active = false,
        ///         Profile = @default.Apply(getAlertingProfileResult =&gt; getAlertingProfileResult).Apply(@default =&gt; @default.Apply(getAlertingProfileResult =&gt; getAlertingProfileResult.Id)),
        ///         Url = "https://webhook.site/40bf4d43-1a50-4ebd-913d-bf50ce7c3a1e",
        ///         Insecure = true,
        ///         NotifyEventMerges = true,
        ///         NotifyClosedProblems = true,
        ///         Payload = "web-hook-payload",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAlertingProfileResult> Invoke(GetAlertingProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlertingProfileResult>("dynatrace:index/getAlertingProfile:getAlertingProfile", args ?? new GetAlertingProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlertingProfileArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAlertingProfileArgs()
        {
        }
        public static new GetAlertingProfileArgs Empty => new GetAlertingProfileArgs();
    }

    public sealed class GetAlertingProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetAlertingProfileInvokeArgs()
        {
        }
        public static new GetAlertingProfileInvokeArgs Empty => new GetAlertingProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlertingProfileResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetAlertingProfileResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}