// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostPoolRegistrationInfoState extends com.pulumi.resources.ResourceArgs {

    public static final GetHostPoolRegistrationInfoState Empty = new GetHostPoolRegistrationInfoState();

    /**
     * A valid `RFC3339Time` for the expiration of the token..
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return A valid `RFC3339Time` for the expiration of the token..
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The ID of the Virtual Desktop Host Pool to link the Registration Info to. Changing this forces a new Registration Info resource to be created. Only a single virtual_desktop_host_pool_registration_info resource should be associated with a given hostpool. Assigning multiple resources will produce inconsistent results.
     * 
     */
    @Import(name="hostpoolId")
    private @Nullable Output<String> hostpoolId;

    /**
     * @return The ID of the Virtual Desktop Host Pool to link the Registration Info to. Changing this forces a new Registration Info resource to be created. Only a single virtual_desktop_host_pool_registration_info resource should be associated with a given hostpool. Assigning multiple resources will produce inconsistent results.
     * 
     */
    public Optional<Output<String>> hostpoolId() {
        return Optional.ofNullable(this.hostpoolId);
    }

    /**
     * The registration token generated by the Virtual Desktop Host Pool for registration of session hosts.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The registration token generated by the Virtual Desktop Host Pool for registration of session hosts.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private GetHostPoolRegistrationInfoState() {}

    private GetHostPoolRegistrationInfoState(GetHostPoolRegistrationInfoState $) {
        this.expirationDate = $.expirationDate;
        this.hostpoolId = $.hostpoolId;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostPoolRegistrationInfoState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostPoolRegistrationInfoState $;

        public Builder() {
            $ = new GetHostPoolRegistrationInfoState();
        }

        public Builder(GetHostPoolRegistrationInfoState defaults) {
            $ = new GetHostPoolRegistrationInfoState(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationDate A valid `RFC3339Time` for the expiration of the token..
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate A valid `RFC3339Time` for the expiration of the token..
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param hostpoolId The ID of the Virtual Desktop Host Pool to link the Registration Info to. Changing this forces a new Registration Info resource to be created. Only a single virtual_desktop_host_pool_registration_info resource should be associated with a given hostpool. Assigning multiple resources will produce inconsistent results.
         * 
         * @return builder
         * 
         */
        public Builder hostpoolId(@Nullable Output<String> hostpoolId) {
            $.hostpoolId = hostpoolId;
            return this;
        }

        /**
         * @param hostpoolId The ID of the Virtual Desktop Host Pool to link the Registration Info to. Changing this forces a new Registration Info resource to be created. Only a single virtual_desktop_host_pool_registration_info resource should be associated with a given hostpool. Assigning multiple resources will produce inconsistent results.
         * 
         * @return builder
         * 
         */
        public Builder hostpoolId(String hostpoolId) {
            return hostpoolId(Output.of(hostpoolId));
        }

        /**
         * @param token The registration token generated by the Virtual Desktop Host Pool for registration of session hosts.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The registration token generated by the Virtual Desktop Host Pool for registration of session hosts.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public GetHostPoolRegistrationInfoState build() {
            return $;
        }
    }

}