// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KafkaClusterRolesHeadNode {
    /**
     * @return The Password associated with the local administrator for the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String password;
    /**
     * @return A list of SSH Keys which should be used for the local administrator on the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> sshKeys;
    /**
     * @return The ID of the Subnet within the Virtual Network where the Head Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * @return The Username of the local administrator for the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    private final String username;
    /**
     * @return The ID of the Virtual Network where the Head Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String virtualNetworkId;
    /**
     * @return The Size of the Virtual Machine which should be used as the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    private final String vmSize;

    @CustomType.Constructor
    private KafkaClusterRolesHeadNode(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("sshKeys") @Nullable List<String> sshKeys,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("username") String username,
        @CustomType.Parameter("virtualNetworkId") @Nullable String virtualNetworkId,
        @CustomType.Parameter("vmSize") String vmSize) {
        this.password = password;
        this.sshKeys = sshKeys;
        this.subnetId = subnetId;
        this.username = username;
        this.virtualNetworkId = virtualNetworkId;
        this.vmSize = vmSize;
    }

    /**
     * @return The Password associated with the local administrator for the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return A list of SSH Keys which should be used for the local administrator on the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    public List<String> sshKeys() {
        return this.sshKeys == null ? List.of() : this.sshKeys;
    }
    /**
     * @return The ID of the Subnet within the Virtual Network where the Head Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return The Username of the local administrator for the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    public String username() {
        return this.username;
    }
    /**
     * @return The ID of the Virtual Network where the Head Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }
    /**
     * @return The Size of the Virtual Machine which should be used as the Head Nodes. Changing this forces a new resource to be created.
     * 
     */
    public String vmSize() {
        return this.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaClusterRolesHeadNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable List<String> sshKeys;
        private @Nullable String subnetId;
        private String username;
        private @Nullable String virtualNetworkId;
        private String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaClusterRolesHeadNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.sshKeys = defaults.sshKeys;
    	      this.subnetId = defaults.subnetId;
    	      this.username = defaults.username;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder sshKeys(@Nullable List<String> sshKeys) {
            this.sshKeys = sshKeys;
            return this;
        }
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder virtualNetworkId(@Nullable String virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public Builder vmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }        public KafkaClusterRolesHeadNode build() {
            return new KafkaClusterRolesHeadNode(password, sshKeys, subnetId, username, virtualNetworkId, vmSize);
        }
    }
}