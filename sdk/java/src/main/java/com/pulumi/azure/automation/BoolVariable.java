// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.BoolVariableArgs;
import com.pulumi.azure.automation.inputs.BoolVariableState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a boolean variable in Azure Automation
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;Basic&#34;)
 *             .build());
 * 
 *         var exampleBoolVariable = new BoolVariable(&#34;exampleBoolVariable&#34;, BoolVariableArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .automationAccountName(exampleAccount.name())
 *             .value(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Automation Bool Variable can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:automation/boolVariable:BoolVariable example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/tfex-example-rg/providers/Microsoft.Automation/automationAccounts/tfex-example-account/variables/tfex-example-var
 * ```
 * 
 */
@ResourceType(type="azure:automation/boolVariable:BoolVariable")
public class BoolVariable extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", type=String.class, parameters={})
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * The description of the Automation Variable.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Automation Variable.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies if the Automation Variable is encrypted. Defaults to `false`.
     * 
     */
    @Export(name="encrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return Specifies if the Automation Variable is encrypted. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> encrypted() {
        return Codegen.optional(this.encrypted);
    }
    /**
     * The name of the Automation Variable. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Automation Variable. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The value of the Automation Variable as a `boolean`.
     * 
     */
    @Export(name="value", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> value;

    /**
     * @return The value of the Automation Variable as a `boolean`.
     * 
     */
    public Output<Optional<Boolean>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BoolVariable(String name) {
        this(name, BoolVariableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BoolVariable(String name, BoolVariableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BoolVariable(String name, BoolVariableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/boolVariable:BoolVariable", name, args == null ? BoolVariableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BoolVariable(String name, Output<String> id, @Nullable BoolVariableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/boolVariable:BoolVariable", name, state, makeResourceOptions(options, id));
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
    public static BoolVariable get(String name, Output<String> id, @Nullable BoolVariableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BoolVariable(name, id, state, options);
    }
}