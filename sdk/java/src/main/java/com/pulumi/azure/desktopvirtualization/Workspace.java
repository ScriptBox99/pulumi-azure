// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.desktopvirtualization.WorkspaceArgs;
import com.pulumi.azure.desktopvirtualization.inputs.WorkspaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Virtual Desktop Workspace.
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
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var workspace = new Workspace(&#34;workspace&#34;, WorkspaceArgs.builder()        
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .friendlyName(&#34;FriendlyName&#34;)
 *             .description(&#34;A description of my workspace&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Desktop Workspaces can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:desktopvirtualization/workspace:Workspace example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myGroup1/providers/Microsoft.DesktopVirtualization/workspaces/myworkspace
 * ```
 * 
 */
@ResourceType(type="azure:desktopvirtualization/workspace:Workspace")
public class Workspace extends com.pulumi.resources.CustomResource {
    /**
     * A description for the Virtual Desktop Workspace.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the Virtual Desktop Workspace.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A friendly name for the Virtual Desktop Workspace.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return A friendly name for the Virtual Desktop Workspace.
     * 
     */
    public Output<Optional<String>> friendlyName() {
        return Codegen.optional(this.friendlyName);
    }
    /**
     * The location/region where the Virtual Desktop Workspace is located. Changing the location/region forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location/region where the Virtual Desktop Workspace is located. Changing the location/region forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Virtual Desktop Workspace. Changing the name
     * forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Virtual Desktop Workspace. Changing the name
     * forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to
     * create the Virtual Desktop Workspace. Changing the resource group name forces
     * a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the Virtual Desktop Workspace. Changing the resource group name forces
     * a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workspace(String name) {
        this(name, WorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workspace(String name, WorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workspace(String name, WorkspaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:desktopvirtualization/workspace:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workspace(String name, Output<String> id, @Nullable WorkspaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:desktopvirtualization/workspace:Workspace", name, state, makeResourceOptions(options, id));
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
    public static Workspace get(String name, Output<String> id, @Nullable WorkspaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, state, options);
    }
}