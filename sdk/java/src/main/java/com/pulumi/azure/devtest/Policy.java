// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.devtest.PolicyArgs;
import com.pulumi.azure.devtest.inputs.PolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Policy within a Dev Test Policy Set.
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
 *         var exampleLab = new Lab(&#34;exampleLab&#34;, LabArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tags(Map.of(&#34;Sydney&#34;, &#34;Australia&#34;))
 *             .build());
 * 
 *         var examplePolicy = new Policy(&#34;examplePolicy&#34;, PolicyArgs.builder()        
 *             .policySetName(&#34;default&#34;)
 *             .labName(exampleLab.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .factData(&#34;&#34;)
 *             .threshold(&#34;999&#34;)
 *             .evaluatorType(&#34;MaxValuePolicy&#34;)
 *             .tags(Map.of(&#34;Acceptance&#34;, &#34;Test&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Dev Test Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:devtest/policy:Policy policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1/policysets/default/policies/policy1
 * ```
 * 
 */
@ResourceType(type="azure:devtest/policy:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * A description for the Policy.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the Policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Evaluation Type used for this Policy. Possible values include: &#39;AllowedValuesPolicy&#39;, &#39;MaxValuePolicy&#39;. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="evaluatorType", type=String.class, parameters={})
    private Output<String> evaluatorType;

    /**
     * @return The Evaluation Type used for this Policy. Possible values include: &#39;AllowedValuesPolicy&#39;, &#39;MaxValuePolicy&#39;. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> evaluatorType() {
        return this.evaluatorType;
    }
    /**
     * The Fact Data for this Policy.
     * 
     */
    @Export(name="factData", type=String.class, parameters={})
    private Output</* @Nullable */ String> factData;

    /**
     * @return The Fact Data for this Policy.
     * 
     */
    public Output<Optional<String>> factData() {
        return Codegen.optional(this.factData);
    }
    /**
     * Specifies the name of the Dev Test Lab in which the Policy should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="labName", type=String.class, parameters={})
    private Output<String> labName;

    /**
     * @return Specifies the name of the Dev Test Lab in which the Policy should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }
    /**
     * Specifies the name of the Dev Test Policy. Possible values are `GalleryImage`, `LabPremiumVmCount`, `LabTargetCost`, `LabVmCount`, `LabVmSize`, `UserOwnedLabPremiumVmCount`, `UserOwnedLabVmCount` and `UserOwnedLabVmCountInSubnet`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Dev Test Policy. Possible values are `GalleryImage`, `LabPremiumVmCount`, `LabTargetCost`, `LabVmCount`, `LabVmSize`, `UserOwnedLabPremiumVmCount`, `UserOwnedLabVmCount` and `UserOwnedLabVmCountInSubnet`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the Policy Set within the Dev Test Lab where this policy should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="policySetName", type=String.class, parameters={})
    private Output<String> policySetName;

    /**
     * @return Specifies the name of the Policy Set within the Dev Test Lab where this policy should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> policySetName() {
        return this.policySetName;
    }
    /**
     * The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
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
     * The Threshold for this Policy.
     * 
     */
    @Export(name="threshold", type=String.class, parameters={})
    private Output<String> threshold;

    /**
     * @return The Threshold for this Policy.
     * 
     */
    public Output<String> threshold() {
        return this.threshold;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:devtest/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:devtest/policy:Policy", name, state, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}