// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class OwnershipTeamsContactDetailsContactDetail
    {
        public readonly string? Email;
        public readonly string IntegrationType;
        public readonly Outputs.OwnershipTeamsContactDetailsContactDetailJira? Jira;
        public readonly string? MsTeams;
        public readonly string? SlackChannel;
        public readonly string? Url;

        [OutputConstructor]
        private OwnershipTeamsContactDetailsContactDetail(
            string? email,

            string integrationType,

            Outputs.OwnershipTeamsContactDetailsContactDetailJira? jira,

            string? msTeams,

            string? slackChannel,

            string? url)
        {
            Email = email;
            IntegrationType = integrationType;
            Jira = jira;
            MsTeams = msTeams;
            SlackChannel = slackChannel;
            Url = url;
        }
    }
}
