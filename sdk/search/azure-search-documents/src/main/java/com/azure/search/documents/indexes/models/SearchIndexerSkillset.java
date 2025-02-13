// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** A list of skills. */
@Fluent
public final class SearchIndexerSkillset implements JsonSerializable<SearchIndexerSkillset> {
    /*
     * The name of the skillset.
     */
    private final String name;

    /*
     * The description of the skillset.
     */
    private String description;

    /*
     * A list of skills in the skillset.
     */
    private List<SearchIndexerSkill> skills;

    /*
     * Details about cognitive services to be used when running skills.
     */
    private CognitiveServicesAccount cognitiveServicesAccount;

    /*
     * Definition of additional projections to azure blob, table, or files, of enriched data.
     */
    private SearchIndexerKnowledgeStore knowledgeStore;

    /*
     * Definition of additional projections to secondary search index(es).
     */
    private SearchIndexerIndexProjections indexProjections;

    /*
     * The ETag of the skillset.
     */
    private String eTag;

    /*
     * A description of an encryption key that you create in Azure Key Vault. This key is used to provide an additional
     * level of encryption-at-rest for your skillset definition when you want full assurance that no one, not even
     * Microsoft, can decrypt your skillset definition in Azure Cognitive Search. Once you have encrypted your skillset
     * definition, it will always remain encrypted. Azure Cognitive Search will ignore attempts to set this property to
     * null. You can change this property as needed if you want to rotate your encryption key; Your skillset definition
     * will be unaffected. Encryption with customer-managed keys is not available for free search services, and is only
     * available for paid services created on or after January 1, 2019.
     */
    private SearchResourceEncryptionKey encryptionKey;

    /**
     * Creates an instance of SearchIndexerSkillset class.
     *
     * @param name the name value to set.
     */
    public SearchIndexerSkillset(String name) {
        this.name = name;
    }

    /**
     * Creates an instance of SearchIndexerSkillset class.
     *
     * @param name the name value to set.
     * @param skills the skills value to set.
     */
    public SearchIndexerSkillset(String name, List<SearchIndexerSkill> skills) {
        this(name);
        this.skills = skills;
    }

    /**
     * Get the name property: The name of the skillset.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the description property: The description of the skillset.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the skillset.
     *
     * @param description the description value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the skills property: A list of skills in the skillset.
     *
     * @return the skills value.
     */
    public List<SearchIndexerSkill> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: A list of skills in the skillset.
     *
     * @param skills the skills value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setSkills(List<SearchIndexerSkill> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the cognitiveServicesAccount property: Details about cognitive services to be used when running skills.
     *
     * @return the cognitiveServicesAccount value.
     */
    public CognitiveServicesAccount getCognitiveServicesAccount() {
        return this.cognitiveServicesAccount;
    }

    /**
     * Set the cognitiveServicesAccount property: Details about cognitive services to be used when running skills.
     *
     * @param cognitiveServicesAccount the cognitiveServicesAccount value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setCognitiveServicesAccount(CognitiveServicesAccount cognitiveServicesAccount) {
        this.cognitiveServicesAccount = cognitiveServicesAccount;
        return this;
    }

    /**
     * Get the knowledgeStore property: Definition of additional projections to azure blob, table, or files, of enriched
     * data.
     *
     * @return the knowledgeStore value.
     */
    public SearchIndexerKnowledgeStore getKnowledgeStore() {
        return this.knowledgeStore;
    }

    /**
     * Set the knowledgeStore property: Definition of additional projections to azure blob, table, or files, of enriched
     * data.
     *
     * @param knowledgeStore the knowledgeStore value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setKnowledgeStore(SearchIndexerKnowledgeStore knowledgeStore) {
        this.knowledgeStore = knowledgeStore;
        return this;
    }

    /**
     * Get the indexProjections property: Definition of additional projections to secondary search index(es).
     *
     * @return the indexProjections value.
     */
    public SearchIndexerIndexProjections getIndexProjections() {
        return this.indexProjections;
    }

    /**
     * Set the indexProjections property: Definition of additional projections to secondary search index(es).
     *
     * @param indexProjections the indexProjections value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setIndexProjections(SearchIndexerIndexProjections indexProjections) {
        this.indexProjections = indexProjections;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the skillset.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the skillset.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your skillset definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your skillset definition in Azure Cognitive Search. Once
     * you have encrypted your skillset definition, it will always remain encrypted. Azure Cognitive Search will ignore
     * attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your skillset definition will be unaffected. Encryption with customer-managed keys is not
     * available for free search services, and is only available for paid services created on or after January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your skillset definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your skillset definition in Azure Cognitive Search. Once
     * you have encrypted your skillset definition, it will always remain encrypted. Azure Cognitive Search will ignore
     * attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your skillset definition will be unaffected. Encryption with customer-managed keys is not
     * available for free search services, and is only available for paid services created on or after January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("skills", this.skills, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("cognitiveServices", this.cognitiveServicesAccount);
        jsonWriter.writeJsonField("knowledgeStore", this.knowledgeStore);
        jsonWriter.writeJsonField("indexProjections", this.indexProjections);
        jsonWriter.writeStringField("@odata.etag", this.eTag);
        jsonWriter.writeJsonField("encryptionKey", this.encryptionKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerSkillset from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerSkillset if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchIndexerSkillset.
     */
    public static SearchIndexerSkillset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    String description = null;
                    List<SearchIndexerSkill> skills = null;
                    CognitiveServicesAccount cognitiveServicesAccount = null;
                    SearchIndexerKnowledgeStore knowledgeStore = null;
                    SearchIndexerIndexProjections indexProjections = null;
                    String eTag = null;
                    SearchResourceEncryptionKey encryptionKey = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("description".equals(fieldName)) {
                            description = reader.getString();
                        } else if ("skills".equals(fieldName)) {
                            skills = reader.readArray(reader1 -> SearchIndexerSkill.fromJson(reader1));
                        } else if ("cognitiveServices".equals(fieldName)) {
                            cognitiveServicesAccount = CognitiveServicesAccount.fromJson(reader);
                        } else if ("knowledgeStore".equals(fieldName)) {
                            knowledgeStore = SearchIndexerKnowledgeStore.fromJson(reader);
                        } else if ("indexProjections".equals(fieldName)) {
                            indexProjections = SearchIndexerIndexProjections.fromJson(reader);
                        } else if ("@odata.etag".equals(fieldName)) {
                            eTag = reader.getString();
                        } else if ("encryptionKey".equals(fieldName)) {
                            encryptionKey = SearchResourceEncryptionKey.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        SearchIndexerSkillset deserializedSearchIndexerSkillset = new SearchIndexerSkillset(name);
                        deserializedSearchIndexerSkillset.description = description;
                        deserializedSearchIndexerSkillset.skills = skills;
                        deserializedSearchIndexerSkillset.cognitiveServicesAccount = cognitiveServicesAccount;
                        deserializedSearchIndexerSkillset.knowledgeStore = knowledgeStore;
                        deserializedSearchIndexerSkillset.indexProjections = indexProjections;
                        deserializedSearchIndexerSkillset.eTag = eTag;
                        deserializedSearchIndexerSkillset.encryptionKey = encryptionKey;

                        return deserializedSearchIndexerSkillset;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the skills property: A list of skills in the skillset.
     *
     * @param skills the skills value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setSkills(SearchIndexerSkill... skills) {
        this.skills = (skills == null) ? null : java.util.Arrays.asList(skills);
        return this;
    }
}
