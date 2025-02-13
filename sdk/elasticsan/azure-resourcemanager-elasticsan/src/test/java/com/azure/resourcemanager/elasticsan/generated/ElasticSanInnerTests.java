// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import com.azure.resourcemanager.elasticsan.models.PublicNetworkAccess;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ElasticSanInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticSanInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"sku\":{\"name\":\"Premium_ZRS\",\"tier\":\"Premium\"},\"availabilityZones\":[\"izgazxu\",\"izuckyfihrfidfvz\"],\"provisioningState\":\"Deleting\",\"baseSizeTiB\":2309073457131020260,\"extendedCapacitySizeTiB\":3785168823699765982,\"totalVolumeSizeGiB\":7093196131799680709,\"volumeGroupCount\":1702945430371192394,\"totalIops\":9204546244351616694,\"totalMBps\":1735908186849769210,\"totalSizeTiB\":263357956670416647,\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Pending\",\"privateEndpoint\":{\"id\":\"km\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"mxdcufufsrp\",\"actionsRequired\":\"zidnsezcxtbzsgfy\"},\"groupIds\":[\"newmdwzjeiachbo\"]},\"id\":\"flnrosfqpteehzz\",\"name\":\"ypyqrimzinp\",\"type\":\"swjdkirso\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"crmnohjtckwhds\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"yip\",\"actionsRequired\":\"sqwpgrjb\"},\"groupIds\":[\"rcjxvsnbyxqabn\",\"ocpcy\",\"hurzafblj\"]},\"id\":\"pbtoqcjmkl\",\"name\":\"a\",\"type\":\"bqidtqaj\"},{\"properties\":{\"provisioningState\":\"Pending\",\"privateEndpoint\":{\"id\":\"kudjkrlkhb\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"pgzgq\",\"actionsRequired\":\"zloc\"},\"groupIds\":[\"paierh\"]},\"id\":\"csglum\",\"name\":\"a\",\"type\":\"tjaodxobnb\"},{\"properties\":{\"provisioningState\":\"Invalid\",\"privateEndpoint\":{\"id\":\"xo\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"onpimexgstxg\",\"actionsRequired\":\"odgmaajrmvdjwz\"},\"groupIds\":[\"vmclw\",\"ijcoejctb\",\"aqsqsycbkbfk\",\"ukdkexxppofmxa\"]},\"id\":\"fjpgddtocjjxhvp\",\"name\":\"o\",\"type\":\"exhd\"}],\"publicNetworkAccess\":\"Enabled\"},\"location\":\"qeojnxqbzvddntw\",\"tags\":{\"vuhrhcffcyddgl\":\"icbtwnpzao\"},\"id\":\"jthjqkwpyei\",\"name\":\"xmqci\",\"type\":\"q\"}")
                .toObject(ElasticSanInner.class);
        Assertions.assertEquals("qeojnxqbzvddntw", model.location());
        Assertions.assertEquals("icbtwnpzao", model.tags().get("vuhrhcffcyddgl"));
        Assertions.assertEquals(SkuName.PREMIUM_ZRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("izgazxu", model.availabilityZones().get(0));
        Assertions.assertEquals(2309073457131020260L, model.baseSizeTiB());
        Assertions.assertEquals(3785168823699765982L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticSanInner model =
            new ElasticSanInner()
                .withLocation("qeojnxqbzvddntw")
                .withTags(mapOf("vuhrhcffcyddgl", "icbtwnpzao"))
                .withSku(new Sku().withName(SkuName.PREMIUM_ZRS).withTier(SkuTier.PREMIUM))
                .withAvailabilityZones(Arrays.asList("izgazxu", "izuckyfihrfidfvz"))
                .withBaseSizeTiB(2309073457131020260L)
                .withExtendedCapacitySizeTiB(3785168823699765982L)
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(ElasticSanInner.class);
        Assertions.assertEquals("qeojnxqbzvddntw", model.location());
        Assertions.assertEquals("icbtwnpzao", model.tags().get("vuhrhcffcyddgl"));
        Assertions.assertEquals(SkuName.PREMIUM_ZRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("izgazxu", model.availabilityZones().get(0));
        Assertions.assertEquals(2309073457131020260L, model.baseSizeTiB());
        Assertions.assertEquals(3785168823699765982L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
