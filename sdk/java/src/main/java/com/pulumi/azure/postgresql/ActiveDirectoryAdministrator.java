// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.postgresql.ActiveDirectoryAdministratorArgs;
import com.pulumi.azure.postgresql.inputs.ActiveDirectoryAdministratorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows you to set a user or group as the AD administrator for an PostgreSQL server in Azure
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleServer = new Server(&#34;exampleServer&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .version(&#34;9.6&#34;)
 *             .administratorLogin(&#34;4dm1n157r470r&#34;)
 *             .administratorLoginPassword(&#34;4-v3ry-53cr37-p455w0rd&#34;)
 *             .skuName(&#34;GP_Gen5_2&#34;)
 *             .sslEnforcementEnabled(true)
 *             .build());
 * 
 *         var exampleActiveDirectoryAdministrator = new ActiveDirectoryAdministrator(&#34;exampleActiveDirectoryAdministrator&#34;, ActiveDirectoryAdministratorArgs.builder()        
 *             .serverName(exampleServer.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .login(&#34;sqladmin&#34;)
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .objectId(current.apply(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A PostgreSQL Active Directory Administrator can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:postgresql/activeDirectoryAdministrator:ActiveDirectoryAdministrator administrator /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.DBforPostgreSQL/servers/myserver/administrators/activeDirectory
 * ```
 * 
 */
@ResourceType(type="azure:postgresql/activeDirectoryAdministrator:ActiveDirectoryAdministrator")
public class ActiveDirectoryAdministrator extends com.pulumi.resources.CustomResource {
    /**
     * The login name of the principal to set as the server administrator
     * 
     */
    @Export(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return The login name of the principal to set as the server administrator
     * 
     */
    public Output<String> login() {
        return this.login;
    }
    /**
     * The ID of the principal to set as the server administrator. For a managed identity this should be the Client ID of the identity.
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return The ID of the principal to set as the server administrator. For a managed identity this should be the Client ID of the identity.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }
    /**
     * The name of the resource group for the PostgreSQL server. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group for the PostgreSQL server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the PostgreSQL Server on which to set the administrator. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverName", type=String.class, parameters={})
    private Output<String> serverName;

    /**
     * @return The name of the PostgreSQL Server on which to set the administrator. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }
    /**
     * The Azure Tenant ID
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The Azure Tenant ID
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActiveDirectoryAdministrator(String name) {
        this(name, ActiveDirectoryAdministratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActiveDirectoryAdministrator(String name, ActiveDirectoryAdministratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActiveDirectoryAdministrator(String name, ActiveDirectoryAdministratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/activeDirectoryAdministrator:ActiveDirectoryAdministrator", name, args == null ? ActiveDirectoryAdministratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActiveDirectoryAdministrator(String name, Output<String> id, @Nullable ActiveDirectoryAdministratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/activeDirectoryAdministrator:ActiveDirectoryAdministrator", name, state, makeResourceOptions(options, id));
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
    public static ActiveDirectoryAdministrator get(String name, Output<String> id, @Nullable ActiveDirectoryAdministratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActiveDirectoryAdministrator(name, id, state, options);
    }
}