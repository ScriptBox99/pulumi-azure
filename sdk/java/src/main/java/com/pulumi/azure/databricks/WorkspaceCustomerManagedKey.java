// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.databricks.WorkspaceCustomerManagedKeyArgs;
import com.pulumi.azure.databricks.inputs.WorkspaceCustomerManagedKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Databricks Workspace Customer Managed Key can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey workspace1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Databricks/customerManagedKey/workspace1
 * ```
 * 
 */
@ResourceType(type="azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey")
public class WorkspaceCustomerManagedKey extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Key Vault.
     * 
     */
    @Export(name="keyVaultKeyId", type=String.class, parameters={})
    private Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault.
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }
    /**
     * The ID of the Databricks workspace.
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    /**
     * @return The ID of the Databricks workspace.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceCustomerManagedKey(String name) {
        this(name, WorkspaceCustomerManagedKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceCustomerManagedKey(String name, WorkspaceCustomerManagedKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceCustomerManagedKey(String name, WorkspaceCustomerManagedKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey", name, args == null ? WorkspaceCustomerManagedKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkspaceCustomerManagedKey(String name, Output<String> id, @Nullable WorkspaceCustomerManagedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WorkspaceCustomerManagedKey get(String name, Output<String> id, @Nullable WorkspaceCustomerManagedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceCustomerManagedKey(name, id, state, options);
    }
}