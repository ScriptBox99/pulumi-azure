// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventSubscriptionStorageBlobDeadLetterDestination {
    /**
     * @return Specifies the id of the storage account id where the storage blob is located.
     * 
     */
    private final String storageAccountId;
    /**
     * @return Specifies the name of the Storage blob container that is the destination of the deadletter events.
     * 
     */
    private final String storageBlobContainerName;

    @CustomType.Constructor
    private EventSubscriptionStorageBlobDeadLetterDestination(
        @CustomType.Parameter("storageAccountId") String storageAccountId,
        @CustomType.Parameter("storageBlobContainerName") String storageBlobContainerName) {
        this.storageAccountId = storageAccountId;
        this.storageBlobContainerName = storageBlobContainerName;
    }

    /**
     * @return Specifies the id of the storage account id where the storage blob is located.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }
    /**
     * @return Specifies the name of the Storage blob container that is the destination of the deadletter events.
     * 
     */
    public String storageBlobContainerName() {
        return this.storageBlobContainerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionStorageBlobDeadLetterDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String storageAccountId;
        private String storageBlobContainerName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionStorageBlobDeadLetterDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.storageBlobContainerName = defaults.storageBlobContainerName;
        }

        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public Builder storageBlobContainerName(String storageBlobContainerName) {
            this.storageBlobContainerName = Objects.requireNonNull(storageBlobContainerName);
            return this;
        }        public EventSubscriptionStorageBlobDeadLetterDestination build() {
            return new EventSubscriptionStorageBlobDeadLetterDestination(storageAccountId, storageBlobContainerName);
        }
    }
}