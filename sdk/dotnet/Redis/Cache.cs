// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Redis
{
    /// <summary>
    /// Manages a Redis Cache.
    /// 
    /// ## Default Redis Configuration Values
    /// 
    /// | Redis Value                     | Basic        | Standard     | Premium      |
    /// | ------------------------------- | ------------ | ------------ | ------------ |
    /// | enable_authentication           | true         | true         | true         |
    /// | maxmemory_reserved              | 2            | 50           | 200          |
    /// | maxfragmentationmemory_reserved | 2            | 50           | 200          |
    /// | maxmemory_delta                 | 2            | 50           | 200          |
    /// | maxmemory_policy                | volatile-lru | volatile-lru | volatile-lru |
    /// 
    /// &gt; **NOTE:** The `maxmemory_reserved`, `maxmemory_delta` and `maxfragmentationmemory-reserved` settings are only available for Standard and Premium caches. More details are available in the Relevant Links section below._
    /// 
    /// ---
    /// 
    /// A `patch_schedule` block supports the following:
    /// 
    /// * `day_of_week` (Required) the Weekday name - possible values include `Monday`, `Tuesday`, `Wednesday` etc.
    /// 
    /// * `start_hour_utc` - (Optional) the Start Hour for maintenance in UTC - possible values range from `0 - 23`.
    /// 
    /// &gt; **Note:** The Patch Window lasts for `5` hours from the `start_hour_utc`.
    /// 
    /// ## Relevant Links
    /// 
    ///  - [Azure Redis Cache: SKU specific configuration limitations](https://azure.microsoft.com/en-us/documentation/articles/cache-configure/#advanced-settings)
    ///  - [Redis: Available Configuration Settings](http://redis.io/topics/config)
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/redis_cache.html.markdown.
    /// </summary>
    public partial class Cache : Pulumi.CustomResource
    {
        /// <summary>
        /// The size of the Redis cache to deploy. Valid values for a SKU `family` of C (Basic/Standard) are `0, 1, 2, 3, 4, 5, 6`, and for P (Premium) `family` are `1, 2, 3, 4`.
        /// </summary>
        [Output("capacity")]
        public Output<int> Capacity { get; private set; } = null!;

        /// <summary>
        /// Enable the non-SSL port (6379) - disabled by default.
        /// </summary>
        [Output("enableNonSslPort")]
        public Output<bool?> EnableNonSslPort { get; private set; } = null!;

        /// <summary>
        /// The SKU family/pricing group to use. Valid values are `C` (for Basic/Standard SKU family) and `P` (for `Premium`)
        /// </summary>
        [Output("family")]
        public Output<string> Family { get; private set; } = null!;

        /// <summary>
        /// The Hostname of the Redis Instance
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// The location of the resource group.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The minimum TLS version.  Defaults to `1.0`.
        /// </summary>
        [Output("minimumTlsVersion")]
        public Output<string?> MinimumTlsVersion { get; private set; } = null!;

        /// <summary>
        /// The name of the Redis instance. Changing this forces a
        /// new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of `patch_schedule` blocks as defined below - only available for Premium SKU's.
        /// </summary>
        [Output("patchSchedules")]
        public Output<ImmutableArray<Outputs.CachePatchSchedules>> PatchSchedules { get; private set; } = null!;

        /// <summary>
        /// The non-SSL Port of the Redis Instance
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// The Primary Access Key for the Redis Instance
        /// </summary>
        [Output("primaryAccessKey")]
        public Output<string> PrimaryAccessKey { get; private set; } = null!;

        /// <summary>
        /// The Static IP Address to assign to the Redis Cache when hosted inside the Virtual Network. Changing this forces a new resource to be created.
        /// </summary>
        [Output("privateStaticIpAddress")]
        public Output<string> PrivateStaticIpAddress { get; private set; } = null!;

        /// <summary>
        /// A `redis_configuration` as defined below - with some limitations by SKU - defaults/details are shown below.
        /// </summary>
        [Output("redisConfiguration")]
        public Output<Outputs.CacheRedisConfiguration> RedisConfiguration { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to
        /// create the Redis instance.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The Secondary Access Key for the Redis Instance
        /// </summary>
        [Output("secondaryAccessKey")]
        public Output<string> SecondaryAccessKey { get; private set; } = null!;

        /// <summary>
        /// *Only available when using the Premium SKU* The number of Shards to create on the Redis Cluster.
        /// </summary>
        [Output("shardCount")]
        public Output<int?> ShardCount { get; private set; } = null!;

        /// <summary>
        /// The SKU of Redis to use. Possible values are `Basic`, `Standard` and `Premium`.
        /// </summary>
        [Output("skuName")]
        public Output<string> SkuName { get; private set; } = null!;

        /// <summary>
        /// The SSL Port of the Redis Instance
        /// </summary>
        [Output("sslPort")]
        public Output<int> SslPort { get; private set; } = null!;

        /// <summary>
        /// *Only available when using the Premium SKU* The ID of the Subnet within which the Redis Cache should be deployed. This Subnet must only contain Azure Cache for Redis instances without any other type of resources. Changing this forces a new resource to be created.
        /// </summary>
        [Output("subnetId")]
        public Output<string?> SubnetId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>> Tags { get; private set; } = null!;

        /// <summary>
        /// A list of a single item of the Availability Zone which the Redis Cache should be allocated in.
        /// </summary>
        [Output("zones")]
        public Output<string?> Zones { get; private set; } = null!;


        /// <summary>
        /// Create a Cache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cache(string name, CacheArgs args, CustomResourceOptions? options = null)
            : base("azure:redis/cache:Cache", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Cache(string name, Input<string> id, CacheState? state = null, CustomResourceOptions? options = null)
            : base("azure:redis/cache:Cache", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Cache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cache Get(string name, Input<string> id, CacheState? state = null, CustomResourceOptions? options = null)
        {
            return new Cache(name, id, state, options);
        }
    }

    public sealed class CacheArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The size of the Redis cache to deploy. Valid values for a SKU `family` of C (Basic/Standard) are `0, 1, 2, 3, 4, 5, 6`, and for P (Premium) `family` are `1, 2, 3, 4`.
        /// </summary>
        [Input("capacity", required: true)]
        public Input<int> Capacity { get; set; } = null!;

        /// <summary>
        /// Enable the non-SSL port (6379) - disabled by default.
        /// </summary>
        [Input("enableNonSslPort")]
        public Input<bool>? EnableNonSslPort { get; set; }

        /// <summary>
        /// The SKU family/pricing group to use. Valid values are `C` (for Basic/Standard SKU family) and `P` (for `Premium`)
        /// </summary>
        [Input("family", required: true)]
        public Input<string> Family { get; set; } = null!;

        /// <summary>
        /// The location of the resource group.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The minimum TLS version.  Defaults to `1.0`.
        /// </summary>
        [Input("minimumTlsVersion")]
        public Input<string>? MinimumTlsVersion { get; set; }

        /// <summary>
        /// The name of the Redis instance. Changing this forces a
        /// new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("patchSchedules")]
        private InputList<Inputs.CachePatchSchedulesArgs>? _patchSchedules;

        /// <summary>
        /// A list of `patch_schedule` blocks as defined below - only available for Premium SKU's.
        /// </summary>
        public InputList<Inputs.CachePatchSchedulesArgs> PatchSchedules
        {
            get => _patchSchedules ?? (_patchSchedules = new InputList<Inputs.CachePatchSchedulesArgs>());
            set => _patchSchedules = value;
        }

        /// <summary>
        /// The Static IP Address to assign to the Redis Cache when hosted inside the Virtual Network. Changing this forces a new resource to be created.
        /// </summary>
        [Input("privateStaticIpAddress")]
        public Input<string>? PrivateStaticIpAddress { get; set; }

        /// <summary>
        /// A `redis_configuration` as defined below - with some limitations by SKU - defaults/details are shown below.
        /// </summary>
        [Input("redisConfiguration")]
        public Input<Inputs.CacheRedisConfigurationArgs>? RedisConfiguration { get; set; }

        /// <summary>
        /// The name of the resource group in which to
        /// create the Redis instance.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// *Only available when using the Premium SKU* The number of Shards to create on the Redis Cluster.
        /// </summary>
        [Input("shardCount")]
        public Input<int>? ShardCount { get; set; }

        /// <summary>
        /// The SKU of Redis to use. Possible values are `Basic`, `Standard` and `Premium`.
        /// </summary>
        [Input("skuName", required: true)]
        public Input<string> SkuName { get; set; } = null!;

        /// <summary>
        /// *Only available when using the Premium SKU* The ID of the Subnet within which the Redis Cache should be deployed. This Subnet must only contain Azure Cache for Redis instances without any other type of resources. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// A list of a single item of the Availability Zone which the Redis Cache should be allocated in.
        /// </summary>
        [Input("zones")]
        public Input<string>? Zones { get; set; }

        public CacheArgs()
        {
        }
    }

    public sealed class CacheState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The size of the Redis cache to deploy. Valid values for a SKU `family` of C (Basic/Standard) are `0, 1, 2, 3, 4, 5, 6`, and for P (Premium) `family` are `1, 2, 3, 4`.
        /// </summary>
        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// Enable the non-SSL port (6379) - disabled by default.
        /// </summary>
        [Input("enableNonSslPort")]
        public Input<bool>? EnableNonSslPort { get; set; }

        /// <summary>
        /// The SKU family/pricing group to use. Valid values are `C` (for Basic/Standard SKU family) and `P` (for `Premium`)
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        /// <summary>
        /// The Hostname of the Redis Instance
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The location of the resource group.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The minimum TLS version.  Defaults to `1.0`.
        /// </summary>
        [Input("minimumTlsVersion")]
        public Input<string>? MinimumTlsVersion { get; set; }

        /// <summary>
        /// The name of the Redis instance. Changing this forces a
        /// new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("patchSchedules")]
        private InputList<Inputs.CachePatchSchedulesGetArgs>? _patchSchedules;

        /// <summary>
        /// A list of `patch_schedule` blocks as defined below - only available for Premium SKU's.
        /// </summary>
        public InputList<Inputs.CachePatchSchedulesGetArgs> PatchSchedules
        {
            get => _patchSchedules ?? (_patchSchedules = new InputList<Inputs.CachePatchSchedulesGetArgs>());
            set => _patchSchedules = value;
        }

        /// <summary>
        /// The non-SSL Port of the Redis Instance
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The Primary Access Key for the Redis Instance
        /// </summary>
        [Input("primaryAccessKey")]
        public Input<string>? PrimaryAccessKey { get; set; }

        /// <summary>
        /// The Static IP Address to assign to the Redis Cache when hosted inside the Virtual Network. Changing this forces a new resource to be created.
        /// </summary>
        [Input("privateStaticIpAddress")]
        public Input<string>? PrivateStaticIpAddress { get; set; }

        /// <summary>
        /// A `redis_configuration` as defined below - with some limitations by SKU - defaults/details are shown below.
        /// </summary>
        [Input("redisConfiguration")]
        public Input<Inputs.CacheRedisConfigurationGetArgs>? RedisConfiguration { get; set; }

        /// <summary>
        /// The name of the resource group in which to
        /// create the Redis instance.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The Secondary Access Key for the Redis Instance
        /// </summary>
        [Input("secondaryAccessKey")]
        public Input<string>? SecondaryAccessKey { get; set; }

        /// <summary>
        /// *Only available when using the Premium SKU* The number of Shards to create on the Redis Cluster.
        /// </summary>
        [Input("shardCount")]
        public Input<int>? ShardCount { get; set; }

        /// <summary>
        /// The SKU of Redis to use. Possible values are `Basic`, `Standard` and `Premium`.
        /// </summary>
        [Input("skuName")]
        public Input<string>? SkuName { get; set; }

        /// <summary>
        /// The SSL Port of the Redis Instance
        /// </summary>
        [Input("sslPort")]
        public Input<int>? SslPort { get; set; }

        /// <summary>
        /// *Only available when using the Premium SKU* The ID of the Subnet within which the Redis Cache should be deployed. This Subnet must only contain Azure Cache for Redis instances without any other type of resources. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// A list of a single item of the Availability Zone which the Redis Cache should be allocated in.
        /// </summary>
        [Input("zones")]
        public Input<string>? Zones { get; set; }

        public CacheState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class CachePatchSchedulesArgs : Pulumi.ResourceArgs
    {
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        [Input("startHourUtc")]
        public Input<int>? StartHourUtc { get; set; }

        public CachePatchSchedulesArgs()
        {
        }
    }

    public sealed class CachePatchSchedulesGetArgs : Pulumi.ResourceArgs
    {
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        [Input("startHourUtc")]
        public Input<int>? StartHourUtc { get; set; }

        public CachePatchSchedulesGetArgs()
        {
        }
    }

    public sealed class CacheRedisConfigurationArgs : Pulumi.ResourceArgs
    {
        [Input("aofBackupEnabled")]
        public Input<bool>? AofBackupEnabled { get; set; }

        [Input("aofStorageConnectionString0")]
        public Input<string>? AofStorageConnectionString0 { get; set; }

        [Input("aofStorageConnectionString1")]
        public Input<string>? AofStorageConnectionString1 { get; set; }

        [Input("enableAuthentication")]
        public Input<bool>? EnableAuthentication { get; set; }

        /// <summary>
        /// Returns the max number of connected clients at the same time.
        /// </summary>
        [Input("maxclients")]
        public Input<int>? Maxclients { get; set; }

        [Input("maxfragmentationmemoryReserved")]
        public Input<int>? MaxfragmentationmemoryReserved { get; set; }

        [Input("maxmemoryDelta")]
        public Input<int>? MaxmemoryDelta { get; set; }

        [Input("maxmemoryPolicy")]
        public Input<string>? MaxmemoryPolicy { get; set; }

        [Input("maxmemoryReserved")]
        public Input<int>? MaxmemoryReserved { get; set; }

        [Input("notifyKeyspaceEvents")]
        public Input<string>? NotifyKeyspaceEvents { get; set; }

        [Input("rdbBackupEnabled")]
        public Input<bool>? RdbBackupEnabled { get; set; }

        [Input("rdbBackupFrequency")]
        public Input<int>? RdbBackupFrequency { get; set; }

        [Input("rdbBackupMaxSnapshotCount")]
        public Input<int>? RdbBackupMaxSnapshotCount { get; set; }

        [Input("rdbStorageConnectionString")]
        public Input<string>? RdbStorageConnectionString { get; set; }

        public CacheRedisConfigurationArgs()
        {
        }
    }

    public sealed class CacheRedisConfigurationGetArgs : Pulumi.ResourceArgs
    {
        [Input("aofBackupEnabled")]
        public Input<bool>? AofBackupEnabled { get; set; }

        [Input("aofStorageConnectionString0")]
        public Input<string>? AofStorageConnectionString0 { get; set; }

        [Input("aofStorageConnectionString1")]
        public Input<string>? AofStorageConnectionString1 { get; set; }

        [Input("enableAuthentication")]
        public Input<bool>? EnableAuthentication { get; set; }

        /// <summary>
        /// Returns the max number of connected clients at the same time.
        /// </summary>
        [Input("maxclients")]
        public Input<int>? Maxclients { get; set; }

        [Input("maxfragmentationmemoryReserved")]
        public Input<int>? MaxfragmentationmemoryReserved { get; set; }

        [Input("maxmemoryDelta")]
        public Input<int>? MaxmemoryDelta { get; set; }

        [Input("maxmemoryPolicy")]
        public Input<string>? MaxmemoryPolicy { get; set; }

        [Input("maxmemoryReserved")]
        public Input<int>? MaxmemoryReserved { get; set; }

        [Input("notifyKeyspaceEvents")]
        public Input<string>? NotifyKeyspaceEvents { get; set; }

        [Input("rdbBackupEnabled")]
        public Input<bool>? RdbBackupEnabled { get; set; }

        [Input("rdbBackupFrequency")]
        public Input<int>? RdbBackupFrequency { get; set; }

        [Input("rdbBackupMaxSnapshotCount")]
        public Input<int>? RdbBackupMaxSnapshotCount { get; set; }

        [Input("rdbStorageConnectionString")]
        public Input<string>? RdbStorageConnectionString { get; set; }

        public CacheRedisConfigurationGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class CachePatchSchedules
    {
        public readonly string DayOfWeek;
        public readonly int? StartHourUtc;

        [OutputConstructor]
        private CachePatchSchedules(
            string dayOfWeek,
            int? startHourUtc)
        {
            DayOfWeek = dayOfWeek;
            StartHourUtc = startHourUtc;
        }
    }

    [OutputType]
    public sealed class CacheRedisConfiguration
    {
        public readonly bool? AofBackupEnabled;
        public readonly string? AofStorageConnectionString0;
        public readonly string? AofStorageConnectionString1;
        public readonly bool? EnableAuthentication;
        /// <summary>
        /// Returns the max number of connected clients at the same time.
        /// </summary>
        public readonly int Maxclients;
        public readonly int MaxfragmentationmemoryReserved;
        public readonly int MaxmemoryDelta;
        public readonly string? MaxmemoryPolicy;
        public readonly int MaxmemoryReserved;
        public readonly string? NotifyKeyspaceEvents;
        public readonly bool? RdbBackupEnabled;
        public readonly int? RdbBackupFrequency;
        public readonly int? RdbBackupMaxSnapshotCount;
        public readonly string? RdbStorageConnectionString;

        [OutputConstructor]
        private CacheRedisConfiguration(
            bool? aofBackupEnabled,
            string? aofStorageConnectionString0,
            string? aofStorageConnectionString1,
            bool? enableAuthentication,
            int maxclients,
            int maxfragmentationmemoryReserved,
            int maxmemoryDelta,
            string? maxmemoryPolicy,
            int maxmemoryReserved,
            string? notifyKeyspaceEvents,
            bool? rdbBackupEnabled,
            int? rdbBackupFrequency,
            int? rdbBackupMaxSnapshotCount,
            string? rdbStorageConnectionString)
        {
            AofBackupEnabled = aofBackupEnabled;
            AofStorageConnectionString0 = aofStorageConnectionString0;
            AofStorageConnectionString1 = aofStorageConnectionString1;
            EnableAuthentication = enableAuthentication;
            Maxclients = maxclients;
            MaxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
            MaxmemoryDelta = maxmemoryDelta;
            MaxmemoryPolicy = maxmemoryPolicy;
            MaxmemoryReserved = maxmemoryReserved;
            NotifyKeyspaceEvents = notifyKeyspaceEvents;
            RdbBackupEnabled = rdbBackupEnabled;
            RdbBackupFrequency = rdbBackupFrequency;
            RdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
            RdbStorageConnectionString = rdbStorageConnectionString;
        }
    }
    }
}