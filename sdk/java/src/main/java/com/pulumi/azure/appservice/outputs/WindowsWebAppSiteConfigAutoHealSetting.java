// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSiteConfigAutoHealSettingAction;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSiteConfigAutoHealSettingTrigger;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WindowsWebAppSiteConfigAutoHealSetting {
    /**
     * @return An `action` block as defined above.
     * 
     */
    private final WindowsWebAppSiteConfigAutoHealSettingAction action;
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    private final WindowsWebAppSiteConfigAutoHealSettingTrigger trigger;

    @CustomType.Constructor
    private WindowsWebAppSiteConfigAutoHealSetting(
        @CustomType.Parameter("action") WindowsWebAppSiteConfigAutoHealSettingAction action,
        @CustomType.Parameter("trigger") WindowsWebAppSiteConfigAutoHealSettingTrigger trigger) {
        this.action = action;
        this.trigger = trigger;
    }

    /**
     * @return An `action` block as defined above.
     * 
     */
    public WindowsWebAppSiteConfigAutoHealSettingAction action() {
        return this.action;
    }
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    public WindowsWebAppSiteConfigAutoHealSettingTrigger trigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSiteConfigAutoHealSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsWebAppSiteConfigAutoHealSettingAction action;
        private WindowsWebAppSiteConfigAutoHealSettingTrigger trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSiteConfigAutoHealSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.trigger = defaults.trigger;
        }

        public Builder action(WindowsWebAppSiteConfigAutoHealSettingAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder trigger(WindowsWebAppSiteConfigAutoHealSettingTrigger trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }        public WindowsWebAppSiteConfigAutoHealSetting build() {
            return new WindowsWebAppSiteConfigAutoHealSetting(action, trigger);
        }
    }
}