// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleZone = new Azure.Dns.Zone("exampleZone", new()
    ///     {
    ///         ResourceGroupName = azurerm_resource_group.Test.Name,
    ///     });
    /// 
    ///     var exampleFrontdoorProfile = new Azure.Cdn.FrontdoorProfile("exampleFrontdoorProfile", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         SkuName = "Standard_AzureFrontDoor",
    ///     });
    /// 
    ///     var exampleFrontdoorCustomDomain = new Azure.Cdn.FrontdoorCustomDomain("exampleFrontdoorCustomDomain", new()
    ///     {
    ///         CdnFrontdoorProfileId = exampleFrontdoorProfile.Id,
    ///         DnsZoneId = exampleZone.Id,
    ///         HostName = "contoso.fabrikam.com",
    ///         Tls = new Azure.Cdn.Inputs.FrontdoorCustomDomainTlsArgs
    ///         {
    ///             CertificateType = "ManagedCertificate",
    ///             MinimumTlsVersion = "TLS12",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Example CNAME Record Usage
    /// 
    /// !&gt;**IMPORTANT:** You **must** include the `depends_on` meta-argument which references both the `azure.cdn.FrontdoorRoute` and the `azure.cdn.FrontdoorSecurityPolicy` that are associated with your Custom Domain. The reason for these `depends_on` meta-arguments is because all of the resources for the Custom Domain need to be associated within Front Door before the CNAME record can be written to the domains DNS, else the CNAME validation will fail and Front Door will not enable traffic to the Domain.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Dns.CNameRecord("example", new()
    ///     {
    ///         ZoneName = azurerm_dns_zone.Example.Name,
    ///         ResourceGroupName = azurerm_resource_group.Example.Name,
    ///         Ttl = 3600,
    ///         Record = azurerm_cdn_frontdoor_endpoint.Example.Host_name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             azurerm_cdn_frontdoor_route.Example,
    ///             azurerm_cdn_frontdoor_security_policy.Example,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Front Door Custom Domains can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/customDomains/customDomain1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain")]
    public partial class FrontdoorCustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Front Door Profile. Changing this forces a new Front Door Profile to be created.
        /// </summary>
        [Output("cdnFrontdoorProfileId")]
        public Output<string> CdnFrontdoorProfileId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Azure DNS Zone which should be used for this Front Door Custom Domain. If you are using Azure to host your [DNS domains](https://learn.microsoft.com/azure/dns/dns-overview), you must delegate the domain provider's domain name system (DNS) to an Azure DNS Zone. For more information, see [Delegate a domain to Azure DNS](https://learn.microsoft.com/azure/dns/dns-delegate-domain-azure-dns). Otherwise, if you're using your own domain provider to handle your DNS, you must validate the Front Door Custom Domain by creating the DNS TXT records manually.
        /// </summary>
        [Output("dnsZoneId")]
        public Output<string?> DnsZoneId { get; private set; } = null!;

        /// <summary>
        /// The date time that the token expires.
        /// </summary>
        [Output("expirationDate")]
        public Output<string> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// The host name of the domain. The `host_name` field must be the FQDN of your domain(e.g. `contoso.fabrikam.com`). Changing this forces a new Front Door Custom Domain to be created.
        /// </summary>
        [Output("hostName")]
        public Output<string> HostName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Front Door Custom Domain. Possible values must be between 2 and 260 characters in length, must begin with a letter or number, end with a letter or number and contain only letters, numbers and hyphens. Changing this forces a new Front Door Custom Domain to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `tls` block as defined below.
        /// </summary>
        [Output("tls")]
        public Output<Outputs.FrontdoorCustomDomainTls> Tls { get; private set; } = null!;

        /// <summary>
        /// Challenge used for DNS TXT record or file based validation.
        /// </summary>
        [Output("validationToken")]
        public Output<string> ValidationToken { get; private set; } = null!;


        /// <summary>
        /// Create a FrontdoorCustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FrontdoorCustomDomain(string name, FrontdoorCustomDomainArgs args, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain", name, args ?? new FrontdoorCustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FrontdoorCustomDomain(string name, Input<string> id, FrontdoorCustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "azure:cdn/frontdoorCustomEndpoint:FrontdoorCustomEndpoint"},
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FrontdoorCustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FrontdoorCustomDomain Get(string name, Input<string> id, FrontdoorCustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new FrontdoorCustomDomain(name, id, state, options);
        }
    }

    public sealed class FrontdoorCustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Profile. Changing this forces a new Front Door Profile to be created.
        /// </summary>
        [Input("cdnFrontdoorProfileId", required: true)]
        public Input<string> CdnFrontdoorProfileId { get; set; } = null!;

        /// <summary>
        /// The ID of the Azure DNS Zone which should be used for this Front Door Custom Domain. If you are using Azure to host your [DNS domains](https://learn.microsoft.com/azure/dns/dns-overview), you must delegate the domain provider's domain name system (DNS) to an Azure DNS Zone. For more information, see [Delegate a domain to Azure DNS](https://learn.microsoft.com/azure/dns/dns-delegate-domain-azure-dns). Otherwise, if you're using your own domain provider to handle your DNS, you must validate the Front Door Custom Domain by creating the DNS TXT records manually.
        /// </summary>
        [Input("dnsZoneId")]
        public Input<string>? DnsZoneId { get; set; }

        /// <summary>
        /// The host name of the domain. The `host_name` field must be the FQDN of your domain(e.g. `contoso.fabrikam.com`). Changing this forces a new Front Door Custom Domain to be created.
        /// </summary>
        [Input("hostName", required: true)]
        public Input<string> HostName { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Front Door Custom Domain. Possible values must be between 2 and 260 characters in length, must begin with a letter or number, end with a letter or number and contain only letters, numbers and hyphens. Changing this forces a new Front Door Custom Domain to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `tls` block as defined below.
        /// </summary>
        [Input("tls", required: true)]
        public Input<Inputs.FrontdoorCustomDomainTlsArgs> Tls { get; set; } = null!;

        public FrontdoorCustomDomainArgs()
        {
        }
        public static new FrontdoorCustomDomainArgs Empty => new FrontdoorCustomDomainArgs();
    }

    public sealed class FrontdoorCustomDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Profile. Changing this forces a new Front Door Profile to be created.
        /// </summary>
        [Input("cdnFrontdoorProfileId")]
        public Input<string>? CdnFrontdoorProfileId { get; set; }

        /// <summary>
        /// The ID of the Azure DNS Zone which should be used for this Front Door Custom Domain. If you are using Azure to host your [DNS domains](https://learn.microsoft.com/azure/dns/dns-overview), you must delegate the domain provider's domain name system (DNS) to an Azure DNS Zone. For more information, see [Delegate a domain to Azure DNS](https://learn.microsoft.com/azure/dns/dns-delegate-domain-azure-dns). Otherwise, if you're using your own domain provider to handle your DNS, you must validate the Front Door Custom Domain by creating the DNS TXT records manually.
        /// </summary>
        [Input("dnsZoneId")]
        public Input<string>? DnsZoneId { get; set; }

        /// <summary>
        /// The date time that the token expires.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// The host name of the domain. The `host_name` field must be the FQDN of your domain(e.g. `contoso.fabrikam.com`). Changing this forces a new Front Door Custom Domain to be created.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The name which should be used for this Front Door Custom Domain. Possible values must be between 2 and 260 characters in length, must begin with a letter or number, end with a letter or number and contain only letters, numbers and hyphens. Changing this forces a new Front Door Custom Domain to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `tls` block as defined below.
        /// </summary>
        [Input("tls")]
        public Input<Inputs.FrontdoorCustomDomainTlsGetArgs>? Tls { get; set; }

        /// <summary>
        /// Challenge used for DNS TXT record or file based validation.
        /// </summary>
        [Input("validationToken")]
        public Input<string>? ValidationToken { get; set; }

        public FrontdoorCustomDomainState()
        {
        }
        public static new FrontdoorCustomDomainState Empty => new FrontdoorCustomDomainState();
    }
}