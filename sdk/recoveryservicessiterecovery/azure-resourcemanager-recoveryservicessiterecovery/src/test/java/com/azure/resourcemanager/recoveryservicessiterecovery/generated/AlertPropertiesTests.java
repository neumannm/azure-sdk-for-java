// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AlertProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AlertPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertProperties model =
            BinaryData
                .fromString(
                    "{\"sendToOwners\":\"wryoqpsoacc\",\"customEmailAddresses\":[\"akl\",\"lahbcryff\",\"fdosyg\"],\"locale\":\"paojakhmsbzjh\"}")
                .toObject(AlertProperties.class);
        Assertions.assertEquals("wryoqpsoacc", model.sendToOwners());
        Assertions.assertEquals("akl", model.customEmailAddresses().get(0));
        Assertions.assertEquals("paojakhmsbzjh", model.locale());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertProperties model =
            new AlertProperties()
                .withSendToOwners("wryoqpsoacc")
                .withCustomEmailAddresses(Arrays.asList("akl", "lahbcryff", "fdosyg"))
                .withLocale("paojakhmsbzjh");
        model = BinaryData.fromObject(model).toObject(AlertProperties.class);
        Assertions.assertEquals("wryoqpsoacc", model.sendToOwners());
        Assertions.assertEquals("akl", model.customEmailAddresses().get(0));
        Assertions.assertEquals("paojakhmsbzjh", model.locale());
    }
}
