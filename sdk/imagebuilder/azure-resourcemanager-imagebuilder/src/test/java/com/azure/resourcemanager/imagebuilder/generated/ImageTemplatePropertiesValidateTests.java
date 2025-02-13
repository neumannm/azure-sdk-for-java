// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateInVMValidator;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplatePropertiesValidate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplatePropertiesValidateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplatePropertiesValidate model =
            BinaryData
                .fromString(
                    "{\"continueDistributeOnFailure\":true,\"sourceValidationOnly\":true,\"inVMValidations\":[{\"type\":\"ImageTemplateInVMValidator\",\"name\":\"dosyg\"},{\"type\":\"ImageTemplateInVMValidator\",\"name\":\"paojakhmsbzjh\"},{\"type\":\"ImageTemplateInVMValidator\",\"name\":\"zevdphlx\"}]}")
                .toObject(ImageTemplatePropertiesValidate.class);
        Assertions.assertEquals(true, model.continueDistributeOnFailure());
        Assertions.assertEquals(true, model.sourceValidationOnly());
        Assertions.assertEquals("dosyg", model.inVMValidations().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplatePropertiesValidate model =
            new ImageTemplatePropertiesValidate()
                .withContinueDistributeOnFailure(true)
                .withSourceValidationOnly(true)
                .withInVMValidations(
                    Arrays
                        .asList(
                            new ImageTemplateInVMValidator().withName("dosyg"),
                            new ImageTemplateInVMValidator().withName("paojakhmsbzjh"),
                            new ImageTemplateInVMValidator().withName("zevdphlx")));
        model = BinaryData.fromObject(model).toObject(ImageTemplatePropertiesValidate.class);
        Assertions.assertEquals(true, model.continueDistributeOnFailure());
        Assertions.assertEquals(true, model.sourceValidationOnly());
        Assertions.assertEquals("dosyg", model.inVMValidations().get(0).name());
    }
}
