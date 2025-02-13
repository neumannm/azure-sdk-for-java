// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.SparkUserPlugin;
import org.junit.jupiter.api.Assertions;

public final class SparkUserPluginTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SparkUserPlugin model = BinaryData.fromString("{\"path\":\"joya\"}").toObject(SparkUserPlugin.class);
        Assertions.assertEquals("joya", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SparkUserPlugin model = new SparkUserPlugin().withPath("joya");
        model = BinaryData.fromObject(model).toObject(SparkUserPlugin.class);
        Assertions.assertEquals("joya", model.path());
    }
}
