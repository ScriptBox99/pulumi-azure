// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessPolicyResult {
    /**
     * @return the certificate permissions for the access policy
     * 
     */
    private final List<String> certificatePermissions;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return the key permissions for the access policy
     * 
     */
    private final List<String> keyPermissions;
    private final String name;
    /**
     * @return the secret permissions for the access policy
     * 
     */
    private final List<String> secretPermissions;

    @CustomType.Constructor
    private GetAccessPolicyResult(
        @CustomType.Parameter("certificatePermissions") List<String> certificatePermissions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyPermissions") List<String> keyPermissions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secretPermissions") List<String> secretPermissions) {
        this.certificatePermissions = certificatePermissions;
        this.id = id;
        this.keyPermissions = keyPermissions;
        this.name = name;
        this.secretPermissions = secretPermissions;
    }

    /**
     * @return the certificate permissions for the access policy
     * 
     */
    public List<String> certificatePermissions() {
        return this.certificatePermissions;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return the key permissions for the access policy
     * 
     */
    public List<String> keyPermissions() {
        return this.keyPermissions;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return the secret permissions for the access policy
     * 
     */
    public List<String> secretPermissions() {
        return this.secretPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificatePermissions;
        private String id;
        private List<String> keyPermissions;
        private String name;
        private List<String> secretPermissions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePermissions = defaults.certificatePermissions;
    	      this.id = defaults.id;
    	      this.keyPermissions = defaults.keyPermissions;
    	      this.name = defaults.name;
    	      this.secretPermissions = defaults.secretPermissions;
        }

        public Builder certificatePermissions(List<String> certificatePermissions) {
            this.certificatePermissions = Objects.requireNonNull(certificatePermissions);
            return this;
        }
        public Builder certificatePermissions(String... certificatePermissions) {
            return certificatePermissions(List.of(certificatePermissions));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyPermissions(List<String> keyPermissions) {
            this.keyPermissions = Objects.requireNonNull(keyPermissions);
            return this;
        }
        public Builder keyPermissions(String... keyPermissions) {
            return keyPermissions(List.of(keyPermissions));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secretPermissions(List<String> secretPermissions) {
            this.secretPermissions = Objects.requireNonNull(secretPermissions);
            return this;
        }
        public Builder secretPermissions(String... secretPermissions) {
            return secretPermissions(List.of(secretPermissions));
        }        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(certificatePermissions, id, keyPermissions, name, secretPermissions);
        }
    }
}