// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSrvRecordRecord {
    /**
     * @return Port the service is listening on.
     * 
     */
    private Integer port;
    /**
     * @return Priority of the SRV record.
     * 
     */
    private Integer priority;
    /**
     * @return FQDN of the service.
     * 
     */
    private String target;
    /**
     * @return Weight of the SRV record.
     * 
     */
    private Integer weight;

    private GetSrvRecordRecord() {}
    /**
     * @return Port the service is listening on.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Priority of the SRV record.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return FQDN of the service.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return Weight of the SRV record.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSrvRecordRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private Integer priority;
        private String target;
        private Integer weight;
        public Builder() {}
        public Builder(GetSrvRecordRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.target = defaults.target;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public GetSrvRecordRecord build() {
            final var o = new GetSrvRecordRecord();
            o.port = port;
            o.priority = priority;
            o.target = target;
            o.weight = weight;
            return o;
        }
    }
}