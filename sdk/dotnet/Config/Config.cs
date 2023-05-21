// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("dynatrace");

        private static readonly __Value<string?> _dtApiToken = new __Value<string?>(() => __config.Get("dtApiToken") ?? Utilities.GetEnv("DYNATRACE_API_TOKEN", "DT_API_TOKEN"));
        public static string? DtApiToken
        {
            get => _dtApiToken.Get();
            set => _dtApiToken.Set(value);
        }

        private static readonly __Value<string?> _dtClusterApiToken = new __Value<string?>(() => __config.Get("dtClusterApiToken") ?? Utilities.GetEnv("DYNATRACE_CLUSTER_API_TOKEN", "DT_CLUSTER_API_TOKEN"));
        public static string? DtClusterApiToken
        {
            get => _dtClusterApiToken.Get();
            set => _dtClusterApiToken.Set(value);
        }

        private static readonly __Value<string?> _dtClusterUrl = new __Value<string?>(() => __config.Get("dtClusterUrl") ?? Utilities.GetEnv("DYNATRACE_CLUSTER_URL", "DT_CLUSTER_URL"));
        public static string? DtClusterUrl
        {
            get => _dtClusterUrl.Get();
            set => _dtClusterUrl.Set(value);
        }

        private static readonly __Value<string?> _dtEnvUrl = new __Value<string?>(() => __config.Get("dtEnvUrl") ?? Utilities.GetEnv("DYNATRACE_ENV_URL", "DT_ENV_URL"));
        public static string? DtEnvUrl
        {
            get => _dtEnvUrl.Get();
            set => _dtEnvUrl.Set(value);
        }

        private static readonly __Value<string?> _iamAccountId = new __Value<string?>(() => __config.Get("iamAccountId"));
        public static string? IamAccountId
        {
            get => _iamAccountId.Get();
            set => _iamAccountId.Set(value);
        }

        private static readonly __Value<string?> _iamClientId = new __Value<string?>(() => __config.Get("iamClientId"));
        public static string? IamClientId
        {
            get => _iamClientId.Get();
            set => _iamClientId.Set(value);
        }

        private static readonly __Value<string?> _iamClientSecret = new __Value<string?>(() => __config.Get("iamClientSecret"));
        public static string? IamClientSecret
        {
            get => _iamClientSecret.Get();
            set => _iamClientSecret.Set(value);
        }

    }
}
