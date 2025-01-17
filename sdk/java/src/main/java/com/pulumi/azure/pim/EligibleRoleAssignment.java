// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.pim.EligibleRoleAssignmentArgs;
import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentState;
import com.pulumi.azure.pim.outputs.EligibleRoleAssignmentSchedule;
import com.pulumi.azure.pim.outputs.EligibleRoleAssignmentTicket;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Pim Eligible Role Assignment.
 * 
 * ## Example Usage
 * ### Subscription)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.inputs.GetSubscriptionArgs;
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumi.time.Static;
 * import com.pulumi.azure.pim.EligibleRoleAssignment;
 * import com.pulumi.azure.pim.EligibleRoleAssignmentArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleExpirationArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var primary = CoreFunctions.getSubscription();
 * 
 *         final var exampleClientConfig = CoreFunctions.getClientConfig();
 * 
 *         final var exampleRoleDefinition = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name(&#34;Reader&#34;)
 *             .build());
 * 
 *         var exampleStatic = new Static(&#34;exampleStatic&#34;);
 * 
 *         var exampleEligibleRoleAssignment = new EligibleRoleAssignment(&#34;exampleEligibleRoleAssignment&#34;, EligibleRoleAssignmentArgs.builder()        
 *             .scope(primary.applyValue(getSubscriptionResult -&gt; getSubscriptionResult.id()))
 *             .roleDefinitionId(String.format(&#34;%s%s&#34;, primary.applyValue(getSubscriptionResult -&gt; getSubscriptionResult.id()),exampleRoleDefinition.applyValue(getRoleDefinitionResult -&gt; getRoleDefinitionResult.id())))
 *             .principalId(exampleClientConfig.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .schedule(EligibleRoleAssignmentScheduleArgs.builder()
 *                 .startDateTime(exampleStatic.rfc3339())
 *                 .expiration(EligibleRoleAssignmentScheduleExpirationArgs.builder()
 *                     .durationHours(8)
 *                     .build())
 *                 .build())
 *             .justification(&#34;Expiration Duration Set&#34;)
 *             .ticket(EligibleRoleAssignmentTicketArgs.builder()
 *                 .number(&#34;1&#34;)
 *                 .system(&#34;example ticket system&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Management Group)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumi.azure.management.Group;
 * import com.pulumi.time.Static;
 * import com.pulumi.azure.pim.EligibleRoleAssignment;
 * import com.pulumi.azure.pim.EligibleRoleAssignmentArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleExpirationArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var exampleClientConfig = CoreFunctions.getClientConfig();
 * 
 *         final var exampleRoleDefinition = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name(&#34;Reader&#34;)
 *             .build());
 * 
 *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
 * 
 *         var exampleStatic = new Static(&#34;exampleStatic&#34;);
 * 
 *         var exampleEligibleRoleAssignment = new EligibleRoleAssignment(&#34;exampleEligibleRoleAssignment&#34;, EligibleRoleAssignmentArgs.builder()        
 *             .scope(exampleGroup.id())
 *             .roleDefinitionId(exampleRoleDefinition.applyValue(getRoleDefinitionResult -&gt; getRoleDefinitionResult.id()))
 *             .principalId(exampleClientConfig.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .schedule(EligibleRoleAssignmentScheduleArgs.builder()
 *                 .startDateTime(exampleStatic.rfc3339())
 *                 .expiration(EligibleRoleAssignmentScheduleExpirationArgs.builder()
 *                     .durationHours(8)
 *                     .build())
 *                 .build())
 *             .justification(&#34;Expiration Duration Set&#34;)
 *             .ticket(EligibleRoleAssignmentTicketArgs.builder()
 *                 .number(&#34;1&#34;)
 *                 .system(&#34;example ticket system&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Pim Eligible Role Assignments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:pim/eligibleRoleAssignment:EligibleRoleAssignment example /subscriptions/00000000-0000-0000-0000-000000000000|/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/roleDefinitions/00000000-0000-0000-0000-000000000000|00000000-0000-0000-0000-000000000000
 * ```
 * 
 */
@ResourceType(type="azure:pim/eligibleRoleAssignment:EligibleRoleAssignment")
public class EligibleRoleAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    @Export(name="justification", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> justification;

    /**
     * @return The justification of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    public Output<Optional<String>> justification() {
        return Codegen.optional(this.justification);
    }
    /**
     * The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    @Export(name="principalId", refs={String.class}, tree="[0]")
    private Output<String> principalId;

    /**
     * @return The principal id. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * The type of principal.
     * *
     * 
     */
    @Export(name="principalType", refs={String.class}, tree="[0]")
    private Output<String> principalType;

    /**
     * @return The type of principal.
     * *
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }
    /**
     * The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    @Export(name="roleDefinitionId", refs={String.class}, tree="[0]")
    private Output<String> roleDefinitionId;

    /**
     * @return The role definition id. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    @Export(name="schedule", refs={EligibleRoleAssignmentSchedule.class}, tree="[0]")
    private Output</* @Nullable */ EligibleRoleAssignmentSchedule> schedule;

    /**
     * @return A `schedule` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    public Output<Optional<EligibleRoleAssignmentSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The scope. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    @Export(name="ticket", refs={EligibleRoleAssignmentTicket.class}, tree="[0]")
    private Output</* @Nullable */ EligibleRoleAssignmentTicket> ticket;

    /**
     * @return A `ticket` block as defined below. Changing this forces a new Pim Eligible Role Assignment to be created.
     * 
     */
    public Output<Optional<EligibleRoleAssignmentTicket>> ticket() {
        return Codegen.optional(this.ticket);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EligibleRoleAssignment(String name) {
        this(name, EligibleRoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EligibleRoleAssignment(String name, EligibleRoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EligibleRoleAssignment(String name, EligibleRoleAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:pim/eligibleRoleAssignment:EligibleRoleAssignment", name, args == null ? EligibleRoleAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EligibleRoleAssignment(String name, Output<String> id, @Nullable EligibleRoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:pim/eligibleRoleAssignment:EligibleRoleAssignment", name, state, makeResourceOptions(options, id));
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
    public static EligibleRoleAssignment get(String name, Output<String> id, @Nullable EligibleRoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EligibleRoleAssignment(name, id, state, options);
    }
}
