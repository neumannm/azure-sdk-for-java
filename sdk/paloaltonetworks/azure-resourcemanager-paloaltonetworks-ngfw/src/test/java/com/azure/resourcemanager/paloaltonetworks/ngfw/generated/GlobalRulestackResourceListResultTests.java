// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.GlobalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AzureResourceManagerManagedIdentityProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestackResourceListResult;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ManagedIdentityType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GlobalRulestackResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalRulestackResourceListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"panEtag\":\"hq\",\"panLocation\":\"gjxpybczmehmt\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[],\"description\":\"phrupidgsybbejhp\",\"defaultMode\":\"NONE\",\"minAppIdVersion\":\"msxaobhd\",\"provisioningState\":\"Canceled\"},\"location\":\"qioqjzehtbmu\",\"identity\":{\"tenantId\":\"wnoi\",\"principalId\":\"wlrxyb\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"id\":\"ijgkdm\",\"name\":\"pazlobcufpdz\",\"type\":\"rbt\"},{\"properties\":{\"panEtag\":\"qjnqglhqgnufoooj\",\"panLocation\":\"ifsqesaagdfmg\",\"scope\":\"LOCAL\",\"associatedSubscriptions\":[],\"description\":\"xrifkwmrvkts\",\"defaultMode\":\"FIREWALL\",\"minAppIdVersion\":\"ocipaouajpsqucm\",\"provisioningState\":\"Creating\"},\"location\":\"dkfo\",\"identity\":{\"tenantId\":\"ygjofjdd\",\"principalId\":\"s\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"id\":\"pewnw\",\"name\":\"eitjz\",\"type\":\"flusarhmof\"},{\"properties\":{\"panEtag\":\"hs\",\"panLocation\":\"urkdtmlx\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[],\"description\":\"sjtxukcdmp\",\"defaultMode\":\"NONE\",\"minAppIdVersion\":\"y\",\"provisioningState\":\"Updating\"},\"location\":\"w\",\"identity\":{\"tenantId\":\"dxtayrlhm\",\"principalId\":\"fp\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"id\":\"bmtukknryrti\",\"name\":\"fxti\",\"type\":\"bpzvgn\"}],\"nextLink\":\"symglzufcyz\"}")
                .toObject(GlobalRulestackResourceListResult.class);
        Assertions.assertEquals("qioqjzehtbmu", model.value().get(0).location());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("hq", model.value().get(0).panEtag());
        Assertions.assertEquals("gjxpybczmehmt", model.value().get(0).panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, model.value().get(0).scope());
        Assertions.assertEquals("phrupidgsybbejhp", model.value().get(0).description());
        Assertions.assertEquals(DefaultMode.NONE, model.value().get(0).defaultMode());
        Assertions.assertEquals("msxaobhd", model.value().get(0).minAppIdVersion());
        Assertions.assertEquals("symglzufcyz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalRulestackResourceListResult model =
            new GlobalRulestackResourceListResult()
                .withValue(
                    Arrays
                        .asList(
                            new GlobalRulestackResourceInner()
                                .withLocation("qioqjzehtbmu")
                                .withIdentity(
                                    new AzureResourceManagerManagedIdentityProperties()
                                        .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPanEtag("hq")
                                .withPanLocation("gjxpybczmehmt")
                                .withScope(ScopeType.GLOBAL)
                                .withAssociatedSubscriptions(Arrays.asList())
                                .withDescription("phrupidgsybbejhp")
                                .withDefaultMode(DefaultMode.NONE)
                                .withMinAppIdVersion("msxaobhd"),
                            new GlobalRulestackResourceInner()
                                .withLocation("dkfo")
                                .withIdentity(
                                    new AzureResourceManagerManagedIdentityProperties()
                                        .withType(ManagedIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPanEtag("qjnqglhqgnufoooj")
                                .withPanLocation("ifsqesaagdfmg")
                                .withScope(ScopeType.LOCAL)
                                .withAssociatedSubscriptions(Arrays.asList())
                                .withDescription("xrifkwmrvkts")
                                .withDefaultMode(DefaultMode.FIREWALL)
                                .withMinAppIdVersion("ocipaouajpsqucm"),
                            new GlobalRulestackResourceInner()
                                .withLocation("w")
                                .withIdentity(
                                    new AzureResourceManagerManagedIdentityProperties()
                                        .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPanEtag("hs")
                                .withPanLocation("urkdtmlx")
                                .withScope(ScopeType.GLOBAL)
                                .withAssociatedSubscriptions(Arrays.asList())
                                .withDescription("sjtxukcdmp")
                                .withDefaultMode(DefaultMode.NONE)
                                .withMinAppIdVersion("y")))
                .withNextLink("symglzufcyz");
        model = BinaryData.fromObject(model).toObject(GlobalRulestackResourceListResult.class);
        Assertions.assertEquals("qioqjzehtbmu", model.value().get(0).location());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("hq", model.value().get(0).panEtag());
        Assertions.assertEquals("gjxpybczmehmt", model.value().get(0).panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, model.value().get(0).scope());
        Assertions.assertEquals("phrupidgsybbejhp", model.value().get(0).description());
        Assertions.assertEquals(DefaultMode.NONE, model.value().get(0).defaultMode());
        Assertions.assertEquals("msxaobhd", model.value().get(0).minAppIdVersion());
        Assertions.assertEquals("symglzufcyz", model.nextLink());
    }

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
