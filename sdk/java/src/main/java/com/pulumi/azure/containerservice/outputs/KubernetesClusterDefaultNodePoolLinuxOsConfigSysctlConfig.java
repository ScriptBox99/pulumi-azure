// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfig {
    /**
     * @return The sysctl setting fs.aio-max-nr. Must be between `65536` and `6553500`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer fsAioMaxNr;
    /**
     * @return The sysctl setting fs.file-max. Must be between `8192` and `12000500`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer fsFileMax;
    /**
     * @return The sysctl setting fs.inotify.max_user_watches. Must be between `781250` and `2097152`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer fsInotifyMaxUserWatches;
    /**
     * @return The sysctl setting fs.nr_open. Must be between `8192` and `20000500`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer fsNrOpen;
    /**
     * @return The sysctl setting kernel.threads-max. Must be between `20` and `513785`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer kernelThreadsMax;
    /**
     * @return The sysctl setting net.core.netdev_max_backlog. Must be between `1000` and `3240000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreNetdevMaxBacklog;
    /**
     * @return The sysctl setting net.core.optmem_max. Must be between `20480` and `4194304`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreOptmemMax;
    /**
     * @return The sysctl setting net.core.rmem_default. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreRmemDefault;
    /**
     * @return The sysctl setting net.core.rmem_max. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreRmemMax;
    /**
     * @return The sysctl setting net.core.somaxconn. Must be between `4096` and `3240000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreSomaxconn;
    /**
     * @return The sysctl setting net.core.wmem_default. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreWmemDefault;
    /**
     * @return The sysctl setting net.core.wmem_max. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netCoreWmemMax;
    /**
     * @return The sysctl setting net.ipv4.ip_local_port_range max value. Must be between `1024` and `60999`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4IpLocalPortRangeMax;
    /**
     * @return The sysctl setting net.ipv4.ip_local_port_range min value. Must be between `1024` and `60999`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4IpLocalPortRangeMin;
    /**
     * @return The sysctl setting net.ipv4.neigh.default.gc_thresh1. Must be between `128` and `80000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4NeighDefaultGcThresh1;
    /**
     * @return The sysctl setting net.ipv4.neigh.default.gc_thresh2. Must be between `512` and `90000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4NeighDefaultGcThresh2;
    /**
     * @return The sysctl setting net.ipv4.neigh.default.gc_thresh3. Must be between `1024` and `100000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4NeighDefaultGcThresh3;
    /**
     * @return The sysctl setting net.ipv4.tcp_fin_timeout. Must be between `5` and `120`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4TcpFinTimeout;
    /**
     * @return The sysctl setting net.ipv4.tcp_keepalive_intvl. Must be between `10` and `75`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4TcpKeepaliveIntvl;
    /**
     * @return The sysctl setting net.ipv4.tcp_keepalive_probes. Must be between `1` and `15`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4TcpKeepaliveProbes;
    /**
     * @return The sysctl setting net.ipv4.tcp_keepalive_time. Must be between `30` and `432000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4TcpKeepaliveTime;
    /**
     * @return The sysctl setting net.ipv4.tcp_max_syn_backlog. Must be between `128` and `3240000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4TcpMaxSynBacklog;
    /**
     * @return The sysctl setting net.ipv4.tcp_max_tw_buckets. Must be between `8000` and `1440000`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netIpv4TcpMaxTwBuckets;
    /**
     * @return The sysctl setting net.ipv4.tcp_tw_reuse. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Boolean netIpv4TcpTwReuse;
    /**
     * @return The sysctl setting net.netfilter.nf_conntrack_buckets. Must be between `65536` and `147456`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netNetfilterNfConntrackBuckets;
    /**
     * @return The sysctl setting net.netfilter.nf_conntrack_max. Must be between `131072` and `1048576`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer netNetfilterNfConntrackMax;
    /**
     * @return The sysctl setting vm.max_map_count. Must be between `65530` and `262144`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer vmMaxMapCount;
    /**
     * @return The sysctl setting vm.swappiness. Must be between `0` and `100`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer vmSwappiness;
    /**
     * @return The sysctl setting vm.vfs_cache_pressure. Must be between `0` and `100`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer vmVfsCachePressure;

    @CustomType.Constructor
    private KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfig(
        @CustomType.Parameter("fsAioMaxNr") @Nullable Integer fsAioMaxNr,
        @CustomType.Parameter("fsFileMax") @Nullable Integer fsFileMax,
        @CustomType.Parameter("fsInotifyMaxUserWatches") @Nullable Integer fsInotifyMaxUserWatches,
        @CustomType.Parameter("fsNrOpen") @Nullable Integer fsNrOpen,
        @CustomType.Parameter("kernelThreadsMax") @Nullable Integer kernelThreadsMax,
        @CustomType.Parameter("netCoreNetdevMaxBacklog") @Nullable Integer netCoreNetdevMaxBacklog,
        @CustomType.Parameter("netCoreOptmemMax") @Nullable Integer netCoreOptmemMax,
        @CustomType.Parameter("netCoreRmemDefault") @Nullable Integer netCoreRmemDefault,
        @CustomType.Parameter("netCoreRmemMax") @Nullable Integer netCoreRmemMax,
        @CustomType.Parameter("netCoreSomaxconn") @Nullable Integer netCoreSomaxconn,
        @CustomType.Parameter("netCoreWmemDefault") @Nullable Integer netCoreWmemDefault,
        @CustomType.Parameter("netCoreWmemMax") @Nullable Integer netCoreWmemMax,
        @CustomType.Parameter("netIpv4IpLocalPortRangeMax") @Nullable Integer netIpv4IpLocalPortRangeMax,
        @CustomType.Parameter("netIpv4IpLocalPortRangeMin") @Nullable Integer netIpv4IpLocalPortRangeMin,
        @CustomType.Parameter("netIpv4NeighDefaultGcThresh1") @Nullable Integer netIpv4NeighDefaultGcThresh1,
        @CustomType.Parameter("netIpv4NeighDefaultGcThresh2") @Nullable Integer netIpv4NeighDefaultGcThresh2,
        @CustomType.Parameter("netIpv4NeighDefaultGcThresh3") @Nullable Integer netIpv4NeighDefaultGcThresh3,
        @CustomType.Parameter("netIpv4TcpFinTimeout") @Nullable Integer netIpv4TcpFinTimeout,
        @CustomType.Parameter("netIpv4TcpKeepaliveIntvl") @Nullable Integer netIpv4TcpKeepaliveIntvl,
        @CustomType.Parameter("netIpv4TcpKeepaliveProbes") @Nullable Integer netIpv4TcpKeepaliveProbes,
        @CustomType.Parameter("netIpv4TcpKeepaliveTime") @Nullable Integer netIpv4TcpKeepaliveTime,
        @CustomType.Parameter("netIpv4TcpMaxSynBacklog") @Nullable Integer netIpv4TcpMaxSynBacklog,
        @CustomType.Parameter("netIpv4TcpMaxTwBuckets") @Nullable Integer netIpv4TcpMaxTwBuckets,
        @CustomType.Parameter("netIpv4TcpTwReuse") @Nullable Boolean netIpv4TcpTwReuse,
        @CustomType.Parameter("netNetfilterNfConntrackBuckets") @Nullable Integer netNetfilterNfConntrackBuckets,
        @CustomType.Parameter("netNetfilterNfConntrackMax") @Nullable Integer netNetfilterNfConntrackMax,
        @CustomType.Parameter("vmMaxMapCount") @Nullable Integer vmMaxMapCount,
        @CustomType.Parameter("vmSwappiness") @Nullable Integer vmSwappiness,
        @CustomType.Parameter("vmVfsCachePressure") @Nullable Integer vmVfsCachePressure) {
        this.fsAioMaxNr = fsAioMaxNr;
        this.fsFileMax = fsFileMax;
        this.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
        this.fsNrOpen = fsNrOpen;
        this.kernelThreadsMax = kernelThreadsMax;
        this.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
        this.netCoreOptmemMax = netCoreOptmemMax;
        this.netCoreRmemDefault = netCoreRmemDefault;
        this.netCoreRmemMax = netCoreRmemMax;
        this.netCoreSomaxconn = netCoreSomaxconn;
        this.netCoreWmemDefault = netCoreWmemDefault;
        this.netCoreWmemMax = netCoreWmemMax;
        this.netIpv4IpLocalPortRangeMax = netIpv4IpLocalPortRangeMax;
        this.netIpv4IpLocalPortRangeMin = netIpv4IpLocalPortRangeMin;
        this.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
        this.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
        this.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
        this.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
        this.netIpv4TcpKeepaliveIntvl = netIpv4TcpKeepaliveIntvl;
        this.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
        this.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
        this.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
        this.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
        this.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
        this.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
        this.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
        this.vmMaxMapCount = vmMaxMapCount;
        this.vmSwappiness = vmSwappiness;
        this.vmVfsCachePressure = vmVfsCachePressure;
    }

    /**
     * @return The sysctl setting fs.aio-max-nr. Must be between `65536` and `6553500`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> fsAioMaxNr() {
        return Optional.ofNullable(this.fsAioMaxNr);
    }
    /**
     * @return The sysctl setting fs.file-max. Must be between `8192` and `12000500`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> fsFileMax() {
        return Optional.ofNullable(this.fsFileMax);
    }
    /**
     * @return The sysctl setting fs.inotify.max_user_watches. Must be between `781250` and `2097152`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> fsInotifyMaxUserWatches() {
        return Optional.ofNullable(this.fsInotifyMaxUserWatches);
    }
    /**
     * @return The sysctl setting fs.nr_open. Must be between `8192` and `20000500`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> fsNrOpen() {
        return Optional.ofNullable(this.fsNrOpen);
    }
    /**
     * @return The sysctl setting kernel.threads-max. Must be between `20` and `513785`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> kernelThreadsMax() {
        return Optional.ofNullable(this.kernelThreadsMax);
    }
    /**
     * @return The sysctl setting net.core.netdev_max_backlog. Must be between `1000` and `3240000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreNetdevMaxBacklog() {
        return Optional.ofNullable(this.netCoreNetdevMaxBacklog);
    }
    /**
     * @return The sysctl setting net.core.optmem_max. Must be between `20480` and `4194304`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreOptmemMax() {
        return Optional.ofNullable(this.netCoreOptmemMax);
    }
    /**
     * @return The sysctl setting net.core.rmem_default. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreRmemDefault() {
        return Optional.ofNullable(this.netCoreRmemDefault);
    }
    /**
     * @return The sysctl setting net.core.rmem_max. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreRmemMax() {
        return Optional.ofNullable(this.netCoreRmemMax);
    }
    /**
     * @return The sysctl setting net.core.somaxconn. Must be between `4096` and `3240000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreSomaxconn() {
        return Optional.ofNullable(this.netCoreSomaxconn);
    }
    /**
     * @return The sysctl setting net.core.wmem_default. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreWmemDefault() {
        return Optional.ofNullable(this.netCoreWmemDefault);
    }
    /**
     * @return The sysctl setting net.core.wmem_max. Must be between `212992` and `134217728`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netCoreWmemMax() {
        return Optional.ofNullable(this.netCoreWmemMax);
    }
    /**
     * @return The sysctl setting net.ipv4.ip_local_port_range max value. Must be between `1024` and `60999`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4IpLocalPortRangeMax() {
        return Optional.ofNullable(this.netIpv4IpLocalPortRangeMax);
    }
    /**
     * @return The sysctl setting net.ipv4.ip_local_port_range min value. Must be between `1024` and `60999`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4IpLocalPortRangeMin() {
        return Optional.ofNullable(this.netIpv4IpLocalPortRangeMin);
    }
    /**
     * @return The sysctl setting net.ipv4.neigh.default.gc_thresh1. Must be between `128` and `80000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4NeighDefaultGcThresh1() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh1);
    }
    /**
     * @return The sysctl setting net.ipv4.neigh.default.gc_thresh2. Must be between `512` and `90000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4NeighDefaultGcThresh2() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh2);
    }
    /**
     * @return The sysctl setting net.ipv4.neigh.default.gc_thresh3. Must be between `1024` and `100000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4NeighDefaultGcThresh3() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh3);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_fin_timeout. Must be between `5` and `120`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4TcpFinTimeout() {
        return Optional.ofNullable(this.netIpv4TcpFinTimeout);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_keepalive_intvl. Must be between `10` and `75`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4TcpKeepaliveIntvl() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveIntvl);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_keepalive_probes. Must be between `1` and `15`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4TcpKeepaliveProbes() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveProbes);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_keepalive_time. Must be between `30` and `432000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4TcpKeepaliveTime() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveTime);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_max_syn_backlog. Must be between `128` and `3240000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4TcpMaxSynBacklog() {
        return Optional.ofNullable(this.netIpv4TcpMaxSynBacklog);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_max_tw_buckets. Must be between `8000` and `1440000`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netIpv4TcpMaxTwBuckets() {
        return Optional.ofNullable(this.netIpv4TcpMaxTwBuckets);
    }
    /**
     * @return The sysctl setting net.ipv4.tcp_tw_reuse. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> netIpv4TcpTwReuse() {
        return Optional.ofNullable(this.netIpv4TcpTwReuse);
    }
    /**
     * @return The sysctl setting net.netfilter.nf_conntrack_buckets. Must be between `65536` and `147456`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netNetfilterNfConntrackBuckets() {
        return Optional.ofNullable(this.netNetfilterNfConntrackBuckets);
    }
    /**
     * @return The sysctl setting net.netfilter.nf_conntrack_max. Must be between `131072` and `1048576`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> netNetfilterNfConntrackMax() {
        return Optional.ofNullable(this.netNetfilterNfConntrackMax);
    }
    /**
     * @return The sysctl setting vm.max_map_count. Must be between `65530` and `262144`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> vmMaxMapCount() {
        return Optional.ofNullable(this.vmMaxMapCount);
    }
    /**
     * @return The sysctl setting vm.swappiness. Must be between `0` and `100`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> vmSwappiness() {
        return Optional.ofNullable(this.vmSwappiness);
    }
    /**
     * @return The sysctl setting vm.vfs_cache_pressure. Must be between `0` and `100`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> vmVfsCachePressure() {
        return Optional.ofNullable(this.vmVfsCachePressure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fsAioMaxNr;
        private @Nullable Integer fsFileMax;
        private @Nullable Integer fsInotifyMaxUserWatches;
        private @Nullable Integer fsNrOpen;
        private @Nullable Integer kernelThreadsMax;
        private @Nullable Integer netCoreNetdevMaxBacklog;
        private @Nullable Integer netCoreOptmemMax;
        private @Nullable Integer netCoreRmemDefault;
        private @Nullable Integer netCoreRmemMax;
        private @Nullable Integer netCoreSomaxconn;
        private @Nullable Integer netCoreWmemDefault;
        private @Nullable Integer netCoreWmemMax;
        private @Nullable Integer netIpv4IpLocalPortRangeMax;
        private @Nullable Integer netIpv4IpLocalPortRangeMin;
        private @Nullable Integer netIpv4NeighDefaultGcThresh1;
        private @Nullable Integer netIpv4NeighDefaultGcThresh2;
        private @Nullable Integer netIpv4NeighDefaultGcThresh3;
        private @Nullable Integer netIpv4TcpFinTimeout;
        private @Nullable Integer netIpv4TcpKeepaliveIntvl;
        private @Nullable Integer netIpv4TcpKeepaliveProbes;
        private @Nullable Integer netIpv4TcpKeepaliveTime;
        private @Nullable Integer netIpv4TcpMaxSynBacklog;
        private @Nullable Integer netIpv4TcpMaxTwBuckets;
        private @Nullable Boolean netIpv4TcpTwReuse;
        private @Nullable Integer netNetfilterNfConntrackBuckets;
        private @Nullable Integer netNetfilterNfConntrackMax;
        private @Nullable Integer vmMaxMapCount;
        private @Nullable Integer vmSwappiness;
        private @Nullable Integer vmVfsCachePressure;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsAioMaxNr = defaults.fsAioMaxNr;
    	      this.fsFileMax = defaults.fsFileMax;
    	      this.fsInotifyMaxUserWatches = defaults.fsInotifyMaxUserWatches;
    	      this.fsNrOpen = defaults.fsNrOpen;
    	      this.kernelThreadsMax = defaults.kernelThreadsMax;
    	      this.netCoreNetdevMaxBacklog = defaults.netCoreNetdevMaxBacklog;
    	      this.netCoreOptmemMax = defaults.netCoreOptmemMax;
    	      this.netCoreRmemDefault = defaults.netCoreRmemDefault;
    	      this.netCoreRmemMax = defaults.netCoreRmemMax;
    	      this.netCoreSomaxconn = defaults.netCoreSomaxconn;
    	      this.netCoreWmemDefault = defaults.netCoreWmemDefault;
    	      this.netCoreWmemMax = defaults.netCoreWmemMax;
    	      this.netIpv4IpLocalPortRangeMax = defaults.netIpv4IpLocalPortRangeMax;
    	      this.netIpv4IpLocalPortRangeMin = defaults.netIpv4IpLocalPortRangeMin;
    	      this.netIpv4NeighDefaultGcThresh1 = defaults.netIpv4NeighDefaultGcThresh1;
    	      this.netIpv4NeighDefaultGcThresh2 = defaults.netIpv4NeighDefaultGcThresh2;
    	      this.netIpv4NeighDefaultGcThresh3 = defaults.netIpv4NeighDefaultGcThresh3;
    	      this.netIpv4TcpFinTimeout = defaults.netIpv4TcpFinTimeout;
    	      this.netIpv4TcpKeepaliveIntvl = defaults.netIpv4TcpKeepaliveIntvl;
    	      this.netIpv4TcpKeepaliveProbes = defaults.netIpv4TcpKeepaliveProbes;
    	      this.netIpv4TcpKeepaliveTime = defaults.netIpv4TcpKeepaliveTime;
    	      this.netIpv4TcpMaxSynBacklog = defaults.netIpv4TcpMaxSynBacklog;
    	      this.netIpv4TcpMaxTwBuckets = defaults.netIpv4TcpMaxTwBuckets;
    	      this.netIpv4TcpTwReuse = defaults.netIpv4TcpTwReuse;
    	      this.netNetfilterNfConntrackBuckets = defaults.netNetfilterNfConntrackBuckets;
    	      this.netNetfilterNfConntrackMax = defaults.netNetfilterNfConntrackMax;
    	      this.vmMaxMapCount = defaults.vmMaxMapCount;
    	      this.vmSwappiness = defaults.vmSwappiness;
    	      this.vmVfsCachePressure = defaults.vmVfsCachePressure;
        }

        public Builder fsAioMaxNr(@Nullable Integer fsAioMaxNr) {
            this.fsAioMaxNr = fsAioMaxNr;
            return this;
        }
        public Builder fsFileMax(@Nullable Integer fsFileMax) {
            this.fsFileMax = fsFileMax;
            return this;
        }
        public Builder fsInotifyMaxUserWatches(@Nullable Integer fsInotifyMaxUserWatches) {
            this.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
            return this;
        }
        public Builder fsNrOpen(@Nullable Integer fsNrOpen) {
            this.fsNrOpen = fsNrOpen;
            return this;
        }
        public Builder kernelThreadsMax(@Nullable Integer kernelThreadsMax) {
            this.kernelThreadsMax = kernelThreadsMax;
            return this;
        }
        public Builder netCoreNetdevMaxBacklog(@Nullable Integer netCoreNetdevMaxBacklog) {
            this.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
            return this;
        }
        public Builder netCoreOptmemMax(@Nullable Integer netCoreOptmemMax) {
            this.netCoreOptmemMax = netCoreOptmemMax;
            return this;
        }
        public Builder netCoreRmemDefault(@Nullable Integer netCoreRmemDefault) {
            this.netCoreRmemDefault = netCoreRmemDefault;
            return this;
        }
        public Builder netCoreRmemMax(@Nullable Integer netCoreRmemMax) {
            this.netCoreRmemMax = netCoreRmemMax;
            return this;
        }
        public Builder netCoreSomaxconn(@Nullable Integer netCoreSomaxconn) {
            this.netCoreSomaxconn = netCoreSomaxconn;
            return this;
        }
        public Builder netCoreWmemDefault(@Nullable Integer netCoreWmemDefault) {
            this.netCoreWmemDefault = netCoreWmemDefault;
            return this;
        }
        public Builder netCoreWmemMax(@Nullable Integer netCoreWmemMax) {
            this.netCoreWmemMax = netCoreWmemMax;
            return this;
        }
        public Builder netIpv4IpLocalPortRangeMax(@Nullable Integer netIpv4IpLocalPortRangeMax) {
            this.netIpv4IpLocalPortRangeMax = netIpv4IpLocalPortRangeMax;
            return this;
        }
        public Builder netIpv4IpLocalPortRangeMin(@Nullable Integer netIpv4IpLocalPortRangeMin) {
            this.netIpv4IpLocalPortRangeMin = netIpv4IpLocalPortRangeMin;
            return this;
        }
        public Builder netIpv4NeighDefaultGcThresh1(@Nullable Integer netIpv4NeighDefaultGcThresh1) {
            this.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
            return this;
        }
        public Builder netIpv4NeighDefaultGcThresh2(@Nullable Integer netIpv4NeighDefaultGcThresh2) {
            this.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
            return this;
        }
        public Builder netIpv4NeighDefaultGcThresh3(@Nullable Integer netIpv4NeighDefaultGcThresh3) {
            this.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
            return this;
        }
        public Builder netIpv4TcpFinTimeout(@Nullable Integer netIpv4TcpFinTimeout) {
            this.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
            return this;
        }
        public Builder netIpv4TcpKeepaliveIntvl(@Nullable Integer netIpv4TcpKeepaliveIntvl) {
            this.netIpv4TcpKeepaliveIntvl = netIpv4TcpKeepaliveIntvl;
            return this;
        }
        public Builder netIpv4TcpKeepaliveProbes(@Nullable Integer netIpv4TcpKeepaliveProbes) {
            this.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
            return this;
        }
        public Builder netIpv4TcpKeepaliveTime(@Nullable Integer netIpv4TcpKeepaliveTime) {
            this.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
            return this;
        }
        public Builder netIpv4TcpMaxSynBacklog(@Nullable Integer netIpv4TcpMaxSynBacklog) {
            this.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
            return this;
        }
        public Builder netIpv4TcpMaxTwBuckets(@Nullable Integer netIpv4TcpMaxTwBuckets) {
            this.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
            return this;
        }
        public Builder netIpv4TcpTwReuse(@Nullable Boolean netIpv4TcpTwReuse) {
            this.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
            return this;
        }
        public Builder netNetfilterNfConntrackBuckets(@Nullable Integer netNetfilterNfConntrackBuckets) {
            this.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
            return this;
        }
        public Builder netNetfilterNfConntrackMax(@Nullable Integer netNetfilterNfConntrackMax) {
            this.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
            return this;
        }
        public Builder vmMaxMapCount(@Nullable Integer vmMaxMapCount) {
            this.vmMaxMapCount = vmMaxMapCount;
            return this;
        }
        public Builder vmSwappiness(@Nullable Integer vmSwappiness) {
            this.vmSwappiness = vmSwappiness;
            return this;
        }
        public Builder vmVfsCachePressure(@Nullable Integer vmVfsCachePressure) {
            this.vmVfsCachePressure = vmVfsCachePressure;
            return this;
        }        public KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfig build() {
            return new KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfig(fsAioMaxNr, fsFileMax, fsInotifyMaxUserWatches, fsNrOpen, kernelThreadsMax, netCoreNetdevMaxBacklog, netCoreOptmemMax, netCoreRmemDefault, netCoreRmemMax, netCoreSomaxconn, netCoreWmemDefault, netCoreWmemMax, netIpv4IpLocalPortRangeMax, netIpv4IpLocalPortRangeMin, netIpv4NeighDefaultGcThresh1, netIpv4NeighDefaultGcThresh2, netIpv4NeighDefaultGcThresh3, netIpv4TcpFinTimeout, netIpv4TcpKeepaliveIntvl, netIpv4TcpKeepaliveProbes, netIpv4TcpKeepaliveTime, netIpv4TcpMaxSynBacklog, netIpv4TcpMaxTwBuckets, netIpv4TcpTwReuse, netNetfilterNfConntrackBuckets, netNetfilterNfConntrackMax, vmMaxMapCount, vmSwappiness, vmVfsCachePressure);
        }
    }
}