// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An attachment which attaches worker selectors to a job. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = WorkerSelectorAttachment.class)
@JsonTypeName("WorkerSelectorAttachment")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "conditional", value = ConditionalWorkerSelectorAttachment.class),
    @JsonSubTypes.Type(name = "pass-through", value = PassThroughWorkerSelectorAttachment.class),
    @JsonSubTypes.Type(name = "rule-engine", value = RuleEngineWorkerSelectorAttachment.class),
    @JsonSubTypes.Type(name = "static", value = StaticWorkerSelectorAttachment.class),
    @JsonSubTypes.Type(
            name = "weighted-allocation-worker-selector",
            value = WeightedAllocationWorkerSelectorAttachment.class)
})
@Immutable
public class WorkerSelectorAttachment {

    /** Creates an instance of WorkerSelectorAttachment class. */
    @Generated
    public WorkerSelectorAttachment() {}
}
