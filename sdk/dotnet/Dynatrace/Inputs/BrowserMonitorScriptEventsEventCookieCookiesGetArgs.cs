// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class BrowserMonitorScriptEventsEventCookieCookiesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cookies", required: true)]
        private InputList<Inputs.BrowserMonitorScriptEventsEventCookieCookiesCookieGetArgs>? _cookies;
        public InputList<Inputs.BrowserMonitorScriptEventsEventCookieCookiesCookieGetArgs> Cookies
        {
            get => _cookies ?? (_cookies = new InputList<Inputs.BrowserMonitorScriptEventsEventCookieCookiesCookieGetArgs>());
            set => _cookies = value;
        }

        public BrowserMonitorScriptEventsEventCookieCookiesGetArgs()
        {
        }
        public static new BrowserMonitorScriptEventsEventCookieCookiesGetArgs Empty => new BrowserMonitorScriptEventsEventCookieCookiesGetArgs();
    }
}