// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupDiscreteRecoveryPoint;
import com.azure.resourcemanager.dataprotection.models.RecoveryPointDataStoreDetails;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupDiscreteRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupDiscreteRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureBackupDiscreteRecoveryPoint\",\"friendlyName\":\"ynwcvtbv\",\"recoveryPointDataStoresDetails\":[{\"creationTime\":\"2021-05-06T12:46:31Z\",\"expiryTime\":\"2021-04-30T18:22:27Z\",\"id\":\"yqiatkzwp\",\"metaData\":\"p\",\"state\":\"cjaesgvvs\",\"type\":\"yajguqfhwygzlv\",\"visible\":false,\"rehydrationExpiryTime\":\"2021-10-30T00:31:15Z\",\"rehydrationStatus\":\"DELETED\"},{\"creationTime\":\"2021-10-16T01:46:34Z\",\"expiryTime\":\"2021-02-14T09:42:03Z\",\"id\":\"rmuhapfcq\",\"metaData\":\"sqxqvp\",\"state\":\"uoymgccelvezry\",\"type\":\"lmfeokerq\",\"visible\":false,\"rehydrationExpiryTime\":\"2021-02-06T22:33:53Z\",\"rehydrationStatus\":\"DELETE_IN_PROGRESS\"},{\"creationTime\":\"2021-02-24T18:35:08Z\",\"expiryTime\":\"2021-02-13T21:16:22Z\",\"id\":\"dkow\",\"metaData\":\"bqpc\",\"state\":\"kbwcc\",\"type\":\"jvcdwxlpqekf\",\"visible\":false,\"rehydrationExpiryTime\":\"2021-05-12T04:10:49Z\",\"rehydrationStatus\":\"FAILED\"}],\"recoveryPointTime\":\"2021-11-08T00:22:08Z\",\"policyName\":\"ngwfqatm\",\"policyVersion\":\"htmdvy\",\"recoveryPointId\":\"ikdgszywkbir\",\"recoveryPointType\":\"uzhlhkjoqrv\",\"retentionTagName\":\"aatjinrvgoupmfi\",\"retentionTagVersion\":\"fggjioolvr\",\"expiryTime\":\"2021-01-31T00:57:49Z\"}")
                .toObject(AzureBackupDiscreteRecoveryPoint.class);
        Assertions.assertEquals("ynwcvtbv", model.friendlyName());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-06T12:46:31Z"),
                model.recoveryPointDataStoresDetails().get(0).creationTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-30T18:22:27Z"),
                model.recoveryPointDataStoresDetails().get(0).expiryTime());
        Assertions.assertEquals("yqiatkzwp", model.recoveryPointDataStoresDetails().get(0).id());
        Assertions.assertEquals("p", model.recoveryPointDataStoresDetails().get(0).metadata());
        Assertions.assertEquals("cjaesgvvs", model.recoveryPointDataStoresDetails().get(0).state());
        Assertions.assertEquals("yajguqfhwygzlv", model.recoveryPointDataStoresDetails().get(0).type());
        Assertions.assertEquals(false, model.recoveryPointDataStoresDetails().get(0).visible());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T00:22:08Z"), model.recoveryPointTime());
        Assertions.assertEquals("ngwfqatm", model.policyName());
        Assertions.assertEquals("htmdvy", model.policyVersion());
        Assertions.assertEquals("ikdgszywkbir", model.recoveryPointId());
        Assertions.assertEquals("uzhlhkjoqrv", model.recoveryPointType());
        Assertions.assertEquals("aatjinrvgoupmfi", model.retentionTagName());
        Assertions.assertEquals("fggjioolvr", model.retentionTagVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupDiscreteRecoveryPoint model =
            new AzureBackupDiscreteRecoveryPoint()
                .withFriendlyName("ynwcvtbv")
                .withRecoveryPointDataStoresDetails(
                    Arrays
                        .asList(
                            new RecoveryPointDataStoreDetails()
                                .withCreationTime(OffsetDateTime.parse("2021-05-06T12:46:31Z"))
                                .withExpiryTime(OffsetDateTime.parse("2021-04-30T18:22:27Z"))
                                .withId("yqiatkzwp")
                                .withMetadata("p")
                                .withState("cjaesgvvs")
                                .withType("yajguqfhwygzlv")
                                .withVisible(false),
                            new RecoveryPointDataStoreDetails()
                                .withCreationTime(OffsetDateTime.parse("2021-10-16T01:46:34Z"))
                                .withExpiryTime(OffsetDateTime.parse("2021-02-14T09:42:03Z"))
                                .withId("rmuhapfcq")
                                .withMetadata("sqxqvp")
                                .withState("uoymgccelvezry")
                                .withType("lmfeokerq")
                                .withVisible(false),
                            new RecoveryPointDataStoreDetails()
                                .withCreationTime(OffsetDateTime.parse("2021-02-24T18:35:08Z"))
                                .withExpiryTime(OffsetDateTime.parse("2021-02-13T21:16:22Z"))
                                .withId("dkow")
                                .withMetadata("bqpc")
                                .withState("kbwcc")
                                .withType("jvcdwxlpqekf")
                                .withVisible(false)))
                .withRecoveryPointTime(OffsetDateTime.parse("2021-11-08T00:22:08Z"))
                .withPolicyName("ngwfqatm")
                .withPolicyVersion("htmdvy")
                .withRecoveryPointId("ikdgszywkbir")
                .withRecoveryPointType("uzhlhkjoqrv")
                .withRetentionTagName("aatjinrvgoupmfi")
                .withRetentionTagVersion("fggjioolvr");
        model = BinaryData.fromObject(model).toObject(AzureBackupDiscreteRecoveryPoint.class);
        Assertions.assertEquals("ynwcvtbv", model.friendlyName());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-06T12:46:31Z"),
                model.recoveryPointDataStoresDetails().get(0).creationTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-30T18:22:27Z"),
                model.recoveryPointDataStoresDetails().get(0).expiryTime());
        Assertions.assertEquals("yqiatkzwp", model.recoveryPointDataStoresDetails().get(0).id());
        Assertions.assertEquals("p", model.recoveryPointDataStoresDetails().get(0).metadata());
        Assertions.assertEquals("cjaesgvvs", model.recoveryPointDataStoresDetails().get(0).state());
        Assertions.assertEquals("yajguqfhwygzlv", model.recoveryPointDataStoresDetails().get(0).type());
        Assertions.assertEquals(false, model.recoveryPointDataStoresDetails().get(0).visible());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T00:22:08Z"), model.recoveryPointTime());
        Assertions.assertEquals("ngwfqatm", model.policyName());
        Assertions.assertEquals("htmdvy", model.policyVersion());
        Assertions.assertEquals("ikdgszywkbir", model.recoveryPointId());
        Assertions.assertEquals("uzhlhkjoqrv", model.recoveryPointType());
        Assertions.assertEquals("aatjinrvgoupmfi", model.retentionTagName());
        Assertions.assertEquals("fggjioolvr", model.retentionTagVersion());
    }
}
