// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.MongoCollectionArgs;
import com.pulumi.azure.cosmosdb.inputs.MongoCollectionState;
import com.pulumi.azure.cosmosdb.outputs.MongoCollectionAutoscaleSettings;
import com.pulumi.azure.cosmosdb.outputs.MongoCollectionIndex;
import com.pulumi.azure.cosmosdb.outputs.MongoCollectionSystemIndex;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Mongo Collection within a Cosmos DB Account.
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
 *         final var exampleAccount = Output.of(CosmosdbFunctions.getAccount(GetAccountArgs.builder()
 *             .name(&#34;tfex-cosmosdb-account&#34;)
 *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
 *             .build()));
 * 
 *         var exampleMongoDatabase = new MongoDatabase(&#34;exampleMongoDatabase&#34;, MongoDatabaseArgs.builder()        
 *             .resourceGroupName(exampleAccount.apply(getAccountResult -&gt; getAccountResult.resourceGroupName()))
 *             .accountName(exampleAccount.apply(getAccountResult -&gt; getAccountResult.name()))
 *             .build());
 * 
 *         var exampleMongoCollection = new MongoCollection(&#34;exampleMongoCollection&#34;, MongoCollectionArgs.builder()        
 *             .resourceGroupName(exampleAccount.apply(getAccountResult -&gt; getAccountResult.resourceGroupName()))
 *             .accountName(exampleAccount.apply(getAccountResult -&gt; getAccountResult.name()))
 *             .databaseName(exampleMongoDatabase.name())
 *             .defaultTtlSeconds(&#34;777&#34;)
 *             .shardKey(&#34;uniqueKey&#34;)
 *             .throughput(400)
 *             .indices(MongoCollectionIndexArgs.builder()
 *                 .keys(&#34;_id&#34;)
 *                 .unique(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CosmosDB Mongo Collection can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cosmosdb/mongoCollection:MongoCollection collection1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/mongodbDatabases/db1/collections/collection1
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/mongoCollection:MongoCollection")
public class MongoCollection extends com.pulumi.resources.CustomResource {
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The default time to live of Analytical Storage for this Mongo Collection. If present and the value is set to `-1`, it is equal to infinity, and items don’t expire by default. If present and the value is set to some number `n` – items will expire `n` seconds after their last modified time.
     * 
     */
    @Export(name="analyticalStorageTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> analyticalStorageTtl;

    /**
     * @return The default time to live of Analytical Storage for this Mongo Collection. If present and the value is set to `-1`, it is equal to infinity, and items don’t expire by default. If present and the value is set to some number `n` – items will expire `n` seconds after their last modified time.
     * 
     */
    public Output<Optional<Integer>> analyticalStorageTtl() {
        return Codegen.optional(this.analyticalStorageTtl);
    }
    @Export(name="autoscaleSettings", type=MongoCollectionAutoscaleSettings.class, parameters={})
    private Output</* @Nullable */ MongoCollectionAutoscaleSettings> autoscaleSettings;

    public Output<Optional<MongoCollectionAutoscaleSettings>> autoscaleSettings() {
        return Codegen.optional(this.autoscaleSettings);
    }
    /**
     * The name of the Cosmos DB Mongo Database in which the Cosmos DB Mongo Collection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the Cosmos DB Mongo Database in which the Cosmos DB Mongo Collection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * The default Time To Live in seconds. If the value is `-1`, items are not automatically expired.
     * * # `index` - (Optional) One or more `index` blocks as defined below.
     * 
     */
    @Export(name="defaultTtlSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> defaultTtlSeconds;

    /**
     * @return The default Time To Live in seconds. If the value is `-1`, items are not automatically expired.
     * * # `index` - (Optional) One or more `index` blocks as defined below.
     * 
     */
    public Output<Optional<Integer>> defaultTtlSeconds() {
        return Codegen.optional(this.defaultTtlSeconds);
    }
    @Export(name="indices", type=List.class, parameters={MongoCollectionIndex.class})
    private Output</* @Nullable */ List<MongoCollectionIndex>> indices;

    public Output<Optional<List<MongoCollectionIndex>>> indices() {
        return Codegen.optional(this.indices);
    }
    /**
     * Specifies the name of the Cosmos DB Mongo Collection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB Mongo Collection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Cosmos DB Mongo Collection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB Mongo Collection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the key to partition on for sharding. There must not be any other unique index keys.
     * 
     */
    @Export(name="shardKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> shardKey;

    /**
     * @return The name of the key to partition on for sharding. There must not be any other unique index keys.
     * 
     */
    public Output<Optional<String>> shardKey() {
        return Codegen.optional(this.shardKey);
    }
    /**
     * One or more `system_indexes` blocks as defined below.
     * 
     */
    @Export(name="systemIndexes", type=List.class, parameters={MongoCollectionSystemIndex.class})
    private Output<List<MongoCollectionSystemIndex>> systemIndexes;

    /**
     * @return One or more `system_indexes` blocks as defined below.
     * 
     */
    public Output<List<MongoCollectionSystemIndex>> systemIndexes() {
        return this.systemIndexes;
    }
    @Export(name="throughput", type=Integer.class, parameters={})
    private Output<Integer> throughput;

    public Output<Integer> throughput() {
        return this.throughput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MongoCollection(String name) {
        this(name, MongoCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MongoCollection(String name, MongoCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MongoCollection(String name, MongoCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/mongoCollection:MongoCollection", name, args == null ? MongoCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MongoCollection(String name, Output<String> id, @Nullable MongoCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/mongoCollection:MongoCollection", name, state, makeResourceOptions(options, id));
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
    public static MongoCollection get(String name, Output<String> id, @Nullable MongoCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MongoCollection(name, id, state, options);
    }
}