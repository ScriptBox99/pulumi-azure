// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.DatasetParquetAzureBlobStorageLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetParquetSchemaColumnArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetParquetState extends com.pulumi.resources.ResourceArgs {

    public static final DatasetParquetState Empty = new DatasetParquetState();

    /**
     * A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * A `azure_blob_storage_location` block as defined below.
     * 
     */
    @Import(name="azureBlobStorageLocation")
    private @Nullable Output<DatasetParquetAzureBlobStorageLocationArgs> azureBlobStorageLocation;

    /**
     * @return A `azure_blob_storage_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetParquetAzureBlobStorageLocationArgs>> azureBlobStorageLocation() {
        return Optional.ofNullable(this.azureBlobStorageLocation);
    }

    /**
     * The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
     * 
     */
    @Import(name="compressionCodec")
    private @Nullable Output<String> compressionCodec;

    /**
     * @return The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
     * 
     */
    public Optional<Output<String>> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }

    @Import(name="compressionLevel")
    private @Nullable Output<String> compressionLevel;

    public Optional<Output<String>> compressionLevel() {
        return Optional.ofNullable(this.compressionLevel);
    }

    /**
     * The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The description for the Data Factory Dataset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Dataset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * A `http_server_location` block as defined below.
     * 
     */
    @Import(name="httpServerLocation")
    private @Nullable Output<DatasetParquetHttpServerLocationArgs> httpServerLocation;

    /**
     * @return A `http_server_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetParquetHttpServerLocationArgs>> httpServerLocation() {
        return Optional.ofNullable(this.httpServerLocation);
    }

    /**
     * The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<String> linkedServiceName;

    /**
     * @return The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    public Optional<Output<String>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A `schema_column` block as defined below.
     * 
     */
    @Import(name="schemaColumns")
    private @Nullable Output<List<DatasetParquetSchemaColumnArgs>> schemaColumns;

    /**
     * @return A `schema_column` block as defined below.
     * 
     */
    public Optional<Output<List<DatasetParquetSchemaColumnArgs>>> schemaColumns() {
        return Optional.ofNullable(this.schemaColumns);
    }

    private DatasetParquetState() {}

    private DatasetParquetState(DatasetParquetState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.azureBlobStorageLocation = $.azureBlobStorageLocation;
        this.compressionCodec = $.compressionCodec;
        this.compressionLevel = $.compressionLevel;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.folder = $.folder;
        this.httpServerLocation = $.httpServerLocation;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.parameters = $.parameters;
        this.schemaColumns = $.schemaColumns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetParquetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetParquetState $;

        public Builder() {
            $ = new DatasetParquetState();
        }

        public Builder(DatasetParquetState defaults) {
            $ = new DatasetParquetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param azureBlobStorageLocation A `azure_blob_storage_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorageLocation(@Nullable Output<DatasetParquetAzureBlobStorageLocationArgs> azureBlobStorageLocation) {
            $.azureBlobStorageLocation = azureBlobStorageLocation;
            return this;
        }

        /**
         * @param azureBlobStorageLocation A `azure_blob_storage_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorageLocation(DatasetParquetAzureBlobStorageLocationArgs azureBlobStorageLocation) {
            return azureBlobStorageLocation(Output.of(azureBlobStorageLocation));
        }

        /**
         * @param compressionCodec The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(@Nullable Output<String> compressionCodec) {
            $.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * @param compressionCodec The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(String compressionCodec) {
            return compressionCodec(Output.of(compressionCodec));
        }

        public Builder compressionLevel(@Nullable Output<String> compressionLevel) {
            $.compressionLevel = compressionLevel;
            return this;
        }

        public Builder compressionLevel(String compressionLevel) {
            return compressionLevel(Output.of(compressionLevel));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param httpServerLocation A `http_server_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder httpServerLocation(@Nullable Output<DatasetParquetHttpServerLocationArgs> httpServerLocation) {
            $.httpServerLocation = httpServerLocation;
            return this;
        }

        /**
         * @param httpServerLocation A `http_server_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder httpServerLocation(DatasetParquetHttpServerLocationArgs httpServerLocation) {
            return httpServerLocation(Output.of(httpServerLocation));
        }

        /**
         * @param linkedServiceName The Data Factory Linked Service name in which to associate the Dataset with.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<String> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName The Data Factory Linked Service name in which to associate the Dataset with.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(String linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param schemaColumns A `schema_column` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schemaColumns(@Nullable Output<List<DatasetParquetSchemaColumnArgs>> schemaColumns) {
            $.schemaColumns = schemaColumns;
            return this;
        }

        /**
         * @param schemaColumns A `schema_column` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schemaColumns(List<DatasetParquetSchemaColumnArgs> schemaColumns) {
            return schemaColumns(Output.of(schemaColumns));
        }

        /**
         * @param schemaColumns A `schema_column` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schemaColumns(DatasetParquetSchemaColumnArgs... schemaColumns) {
            return schemaColumns(List.of(schemaColumns));
        }

        public DatasetParquetState build() {
            return $;
        }
    }

}