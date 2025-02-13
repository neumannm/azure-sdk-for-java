// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProvisioningState;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultSubResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Failed\",\"privateEndpoint\":{\"id\":\"lizhceumoqodkad\"},\"groupIds\":[\"AzureSiteRecovery\",\"AzureSiteRecovery\",\"AzureBackup\",\"AzureBackup\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"ywrxw\",\"actionsRequired\":\"dtluvvadswzsn\"}},\"eTag\":\"emlowuowhl\",\"location\":\"lnwy\",\"tags\":{\"okzkltr\":\"uvblg\",\"rqcrjidhftukvh\":\"owtdvrfmvlihcvj\"},\"id\":\"xlwyoj\",\"name\":\"fqz\",\"type\":\"kfnjyixhafrat\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnectionResource response =
            manager
                .privateEndpointConnections()
                .getWithResponse("woijpodtbl", "pkkwj", "jodqhykincn", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("lnwy", response.location());
        Assertions.assertEquals("uvblg", response.tags().get("okzkltr"));
        Assertions.assertEquals(ProvisioningState.FAILED, response.properties().provisioningState());
        Assertions.assertEquals("lizhceumoqodkad", response.properties().privateEndpoint().id());
        Assertions.assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, response.properties().groupIds().get(0));
        Assertions
            .assertEquals(
                PrivateEndpointConnectionStatus.REJECTED,
                response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ywrxw", response.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("dtluvvadswzsn", response.properties().privateLinkServiceConnectionState().actionRequired());
        Assertions.assertEquals("emlowuowhl", response.etag());
    }
}
