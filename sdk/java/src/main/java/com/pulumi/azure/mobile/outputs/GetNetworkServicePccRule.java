// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.azure.mobile.outputs.GetNetworkServicePccRuleQosPolicy;
import com.pulumi.azure.mobile.outputs.GetNetworkServicePccRuleServiceDataFlowTemplate;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkServicePccRule {
    /**
     * @return Specifies the name which should be used for this Mobile Network Service.
     * 
     */
    private String name;
    /**
     * @return A precedence value that is used to decide between data flow policy rules when identifying the QoS values to use for a particular SIM. A lower value means a higher priority.
     * 
     */
    private Integer precedence;
    /**
     * @return A `rule_qos_policy` block as defined below. The QoS policy to use for packets matching this rule.
     * 
     */
    private List<GetNetworkServicePccRuleQosPolicy> qosPolicies;
    /**
     * @return A `service_data_flow_template` block as defined below. The set of service data flow templates to use for this PCC rule.
     * 
     */
    private List<GetNetworkServicePccRuleServiceDataFlowTemplate> serviceDataFlowTemplates;
    /**
     * @return Determines whether flows that match this data flow policy rule are permitted.
     * 
     */
    private Boolean trafficControlEnabled;

    private GetNetworkServicePccRule() {}
    /**
     * @return Specifies the name which should be used for this Mobile Network Service.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A precedence value that is used to decide between data flow policy rules when identifying the QoS values to use for a particular SIM. A lower value means a higher priority.
     * 
     */
    public Integer precedence() {
        return this.precedence;
    }
    /**
     * @return A `rule_qos_policy` block as defined below. The QoS policy to use for packets matching this rule.
     * 
     */
    public List<GetNetworkServicePccRuleQosPolicy> qosPolicies() {
        return this.qosPolicies;
    }
    /**
     * @return A `service_data_flow_template` block as defined below. The set of service data flow templates to use for this PCC rule.
     * 
     */
    public List<GetNetworkServicePccRuleServiceDataFlowTemplate> serviceDataFlowTemplates() {
        return this.serviceDataFlowTemplates;
    }
    /**
     * @return Determines whether flows that match this data flow policy rule are permitted.
     * 
     */
    public Boolean trafficControlEnabled() {
        return this.trafficControlEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkServicePccRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Integer precedence;
        private List<GetNetworkServicePccRuleQosPolicy> qosPolicies;
        private List<GetNetworkServicePccRuleServiceDataFlowTemplate> serviceDataFlowTemplates;
        private Boolean trafficControlEnabled;
        public Builder() {}
        public Builder(GetNetworkServicePccRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.precedence = defaults.precedence;
    	      this.qosPolicies = defaults.qosPolicies;
    	      this.serviceDataFlowTemplates = defaults.serviceDataFlowTemplates;
    	      this.trafficControlEnabled = defaults.trafficControlEnabled;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder precedence(Integer precedence) {
            this.precedence = Objects.requireNonNull(precedence);
            return this;
        }
        @CustomType.Setter
        public Builder qosPolicies(List<GetNetworkServicePccRuleQosPolicy> qosPolicies) {
            this.qosPolicies = Objects.requireNonNull(qosPolicies);
            return this;
        }
        public Builder qosPolicies(GetNetworkServicePccRuleQosPolicy... qosPolicies) {
            return qosPolicies(List.of(qosPolicies));
        }
        @CustomType.Setter
        public Builder serviceDataFlowTemplates(List<GetNetworkServicePccRuleServiceDataFlowTemplate> serviceDataFlowTemplates) {
            this.serviceDataFlowTemplates = Objects.requireNonNull(serviceDataFlowTemplates);
            return this;
        }
        public Builder serviceDataFlowTemplates(GetNetworkServicePccRuleServiceDataFlowTemplate... serviceDataFlowTemplates) {
            return serviceDataFlowTemplates(List.of(serviceDataFlowTemplates));
        }
        @CustomType.Setter
        public Builder trafficControlEnabled(Boolean trafficControlEnabled) {
            this.trafficControlEnabled = Objects.requireNonNull(trafficControlEnabled);
            return this;
        }
        public GetNetworkServicePccRule build() {
            final var o = new GetNetworkServicePccRule();
            o.name = name;
            o.precedence = precedence;
            o.qosPolicies = qosPolicies;
            o.serviceDataFlowTemplates = serviceDataFlowTemplates;
            o.trafficControlEnabled = trafficControlEnabled;
            return o;
        }
    }
}