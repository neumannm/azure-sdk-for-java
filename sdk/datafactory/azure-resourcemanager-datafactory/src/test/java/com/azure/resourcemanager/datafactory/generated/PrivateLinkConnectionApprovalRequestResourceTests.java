// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrivateEndpoint;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequest;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequestResource;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkConnectionApprovalRequestResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkConnectionApprovalRequestResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateLinkServiceConnectionState\":{\"status\":\"vpbbt\",\"description\":\"fjoknss\",\"actionsRequired\":\"zqedikdfrdbi\"},\"privateEndpoint\":{\"id\":\"jgeihfqlggwfi\"}},\"name\":\"cxmjpbyephmg\",\"type\":\"ljvrcmyfqipgxhnp\",\"etag\":\"yqwcabvnuil\",\"id\":\"yaswlpaugmr\"}")
                .toObject(PrivateLinkConnectionApprovalRequestResource.class);
        Assertions.assertEquals("yaswlpaugmr", model.id());
        Assertions.assertEquals("vpbbt", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("fjoknss", model.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("zqedikdfrdbi", model.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("jgeihfqlggwfi", model.properties().privateEndpoint().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkConnectionApprovalRequestResource model =
            new PrivateLinkConnectionApprovalRequestResource()
                .withId("yaswlpaugmr")
                .withProperties(
                    new PrivateLinkConnectionApprovalRequest()
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkConnectionState()
                                .withStatus("vpbbt")
                                .withDescription("fjoknss")
                                .withActionsRequired("zqedikdfrdbi"))
                        .withPrivateEndpoint(new PrivateEndpoint().withId("jgeihfqlggwfi")));
        model = BinaryData.fromObject(model).toObject(PrivateLinkConnectionApprovalRequestResource.class);
        Assertions.assertEquals("yaswlpaugmr", model.id());
        Assertions.assertEquals("vpbbt", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("fjoknss", model.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("zqedikdfrdbi", model.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("jgeihfqlggwfi", model.properties().privateEndpoint().id());
    }
}
