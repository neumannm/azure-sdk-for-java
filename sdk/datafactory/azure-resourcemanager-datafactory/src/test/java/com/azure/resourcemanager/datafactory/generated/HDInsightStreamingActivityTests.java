// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightStreamingActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightStreamingActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightStreamingActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"HDInsightStreaming\",\"typeProperties\":{\"storageLinkedServices\":[{\"referenceName\":\"uy\",\"parameters\":{\"n\":\"dataubgnm\",\"i\":\"datada\"}},{\"referenceName\":\"hulvpnqvcutwngfd\",\"parameters\":{\"quycokpfyojf\":\"datam\",\"syxthdfqqz\":\"datavmsf\"}},{\"referenceName\":\"qgmoexgnyugsasgh\",\"parameters\":{\"ndxrofwctjhdbidl\":\"dataexdxhxpqkcstynjx\",\"kpx\":\"dataktiojitfa\",\"sorwtakny\":\"dataetdrcm\",\"oskwujhskxx\":\"dataxrrf\"}},{\"referenceName\":\"k\",\"parameters\":{\"t\":\"dataactfimcax\"}}],\"arguments\":[\"dataqtimqicsfaqypjc\",\"datadtktfpj\",\"dataxkujwn\"],\"getDebugInfo\":\"Failure\",\"mapper\":\"dataoqwuforaxbeamip\",\"reducer\":\"datasyed\",\"input\":\"datayrpipslc\",\"output\":\"datawgrzzqf\",\"filePaths\":[\"datadifghdgsyhncxoqx\",\"datajzdpl\",\"datagllvkor\",\"dataosoxxoqyikdjaog\"],\"fileLinkedService\":{\"referenceName\":\"txqxvmybqjlgrlfn\",\"parameters\":{\"lhzjiqibmiwrh\":\"datacmd\"}},\"combiner\":\"datakxrqzgshqx\",\"commandEnvironment\":[\"datanu\",\"datafslawimhoaqj\",\"datalhlpz\",\"datamdaiv\"],\"defines\":{\"nhbsvr\":\"datazbzdi\",\"noasyyadyfnxt\":\"datarccx\",\"gsva\":\"datalnzcm\"}},\"linkedServiceName\":{\"referenceName\":\"uov\",\"parameters\":{\"enfjhfsz\":\"datatykprrdd\"}},\"policy\":{\"timeout\":\"dataosmqscvyuldkpdle\",\"retry\":\"dataljujpsubxggknmvk\",\"retryIntervalInSeconds\":1332323921,\"secureInput\":false,\"secureOutput\":false,\"\":{\"z\":\"datasjea\",\"jwsddyq\":\"datajcsbkmaluchbfrt\",\"txsyufex\":\"dataxpnzpuknfpgg\"}},\"name\":\"vhjyxau\",\"description\":\"kqofrkfccqjenzl\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"jbvqaey\",\"dependencyConditions\":[\"Succeeded\",\"Failed\",\"Completed\"],\"\":{\"ledm\":\"datalxdwliitai\",\"dletjiudcoktsgc\":\"dataup\",\"grebecxuuzeuklu\":\"datapjlmsta\",\"ejamychwwrvvtj\":\"datak\"}}],\"userProperties\":[{\"name\":\"txvmbedvvmrtnmg\",\"value\":\"databfzaaiihyl\"},{\"name\":\"w\",\"value\":\"datahlbpmplethek\"},{\"name\":\"bnamtv\",\"value\":\"dataoaac\"}],\"\":{\"ytytyrvtuxv\":\"dataonsvjc\"}}")
                .toObject(HDInsightStreamingActivity.class);
        Assertions.assertEquals("vhjyxau", model.name());
        Assertions.assertEquals("kqofrkfccqjenzl", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("jbvqaey", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("txvmbedvvmrtnmg", model.userProperties().get(0).name());
        Assertions.assertEquals("uov", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1332323921, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("uy", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("txqxvmybqjlgrlfn", model.fileLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightStreamingActivity model =
            new HDInsightStreamingActivity()
                .withName("vhjyxau")
                .withDescription("kqofrkfccqjenzl")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("jbvqaey")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("txvmbedvvmrtnmg").withValue("databfzaaiihyl"),
                            new UserProperty().withName("w").withValue("datahlbpmplethek"),
                            new UserProperty().withName("bnamtv").withValue("dataoaac")))
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("uov")
                        .withParameters(mapOf("enfjhfsz", "datatykprrdd")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("dataosmqscvyuldkpdle")
                        .withRetry("dataljujpsubxggknmvk")
                        .withRetryIntervalInSeconds(1332323921)
                        .withSecureInput(false)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()))
                .withStorageLinkedServices(
                    Arrays
                        .asList(
                            new LinkedServiceReference()
                                .withReferenceName("uy")
                                .withParameters(mapOf("n", "dataubgnm", "i", "datada")),
                            new LinkedServiceReference()
                                .withReferenceName("hulvpnqvcutwngfd")
                                .withParameters(mapOf("quycokpfyojf", "datam", "syxthdfqqz", "datavmsf")),
                            new LinkedServiceReference()
                                .withReferenceName("qgmoexgnyugsasgh")
                                .withParameters(
                                    mapOf(
                                        "ndxrofwctjhdbidl",
                                        "dataexdxhxpqkcstynjx",
                                        "kpx",
                                        "dataktiojitfa",
                                        "sorwtakny",
                                        "dataetdrcm",
                                        "oskwujhskxx",
                                        "dataxrrf")),
                            new LinkedServiceReference()
                                .withReferenceName("k")
                                .withParameters(mapOf("t", "dataactfimcax"))))
                .withArguments(Arrays.asList("dataqtimqicsfaqypjc", "datadtktfpj", "dataxkujwn"))
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.FAILURE)
                .withMapper("dataoqwuforaxbeamip")
                .withReducer("datasyed")
                .withInput("datayrpipslc")
                .withOutput("datawgrzzqf")
                .withFilePaths(Arrays.asList("datadifghdgsyhncxoqx", "datajzdpl", "datagllvkor", "dataosoxxoqyikdjaog"))
                .withFileLinkedService(
                    new LinkedServiceReference()
                        .withReferenceName("txqxvmybqjlgrlfn")
                        .withParameters(mapOf("lhzjiqibmiwrh", "datacmd")))
                .withCombiner("datakxrqzgshqx")
                .withCommandEnvironment(Arrays.asList("datanu", "datafslawimhoaqj", "datalhlpz", "datamdaiv"))
                .withDefines(mapOf("nhbsvr", "datazbzdi", "noasyyadyfnxt", "datarccx", "gsva", "datalnzcm"));
        model = BinaryData.fromObject(model).toObject(HDInsightStreamingActivity.class);
        Assertions.assertEquals("vhjyxau", model.name());
        Assertions.assertEquals("kqofrkfccqjenzl", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("jbvqaey", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("txvmbedvvmrtnmg", model.userProperties().get(0).name());
        Assertions.assertEquals("uov", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1332323921, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("uy", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("txqxvmybqjlgrlfn", model.fileLinkedService().referenceName());
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
