// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.connections;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.connections.inputs.GetManagedApiArgs;
import com.pulumi.azure.connections.inputs.GetManagedApiPlainArgs;
import com.pulumi.azure.connections.outputs.GetManagedApiResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ConnectionsFunctions {
    /**
     * Uses this data source to access information about an existing Managed API.
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
     *         final var example = Output.of(ConnectionsFunctions.getManagedApi(GetManagedApiArgs.builder()
     *             .name(&#34;servicebus&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getManagedApiResult -&gt; getManagedApiResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetManagedApiResult> getManagedApi(GetManagedApiArgs args) {
        return getManagedApi(args, InvokeOptions.Empty);
    }
    /**
     * Uses this data source to access information about an existing Managed API.
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
     *         final var example = Output.of(ConnectionsFunctions.getManagedApi(GetManagedApiArgs.builder()
     *             .name(&#34;servicebus&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getManagedApiResult -&gt; getManagedApiResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetManagedApiResult> getManagedApiPlain(GetManagedApiPlainArgs args) {
        return getManagedApiPlain(args, InvokeOptions.Empty);
    }
    /**
     * Uses this data source to access information about an existing Managed API.
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
     *         final var example = Output.of(ConnectionsFunctions.getManagedApi(GetManagedApiArgs.builder()
     *             .name(&#34;servicebus&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getManagedApiResult -&gt; getManagedApiResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetManagedApiResult> getManagedApi(GetManagedApiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:connections/getManagedApi:getManagedApi", TypeShape.of(GetManagedApiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Uses this data source to access information about an existing Managed API.
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
     *         final var example = Output.of(ConnectionsFunctions.getManagedApi(GetManagedApiArgs.builder()
     *             .name(&#34;servicebus&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getManagedApiResult -&gt; getManagedApiResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetManagedApiResult> getManagedApiPlain(GetManagedApiPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:connections/getManagedApi:getManagedApi", TypeShape.of(GetManagedApiResult.class), args, Utilities.withVersion(options));
    }
}