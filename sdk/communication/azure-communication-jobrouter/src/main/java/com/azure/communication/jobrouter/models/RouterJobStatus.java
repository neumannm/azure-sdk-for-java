// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the Job. */
public final class RouterJobStatus extends ExpandableStringEnum<RouterJobStatus> {

    /** Job is waiting to be classified. */
    @Generated public static final RouterJobStatus PENDING_CLASSIFICATION = fromString("pendingClassification");

    /** Job has been queued. */
    @Generated public static final RouterJobStatus QUEUED = fromString("queued");

    /** Job has been assigned to a worker. */
    @Generated public static final RouterJobStatus ASSIGNED = fromString("assigned");

    /** Job has been completed by a worker. */
    @Generated public static final RouterJobStatus COMPLETED = fromString("completed");

    /** Job has been closed by a worker. */
    @Generated public static final RouterJobStatus CLOSED = fromString("closed");

    /** Job has been cancelled. */
    @Generated public static final RouterJobStatus CANCELLED = fromString("cancelled");

    /** Classification process failed for the job. */
    @Generated public static final RouterJobStatus CLASSIFICATION_FAILED = fromString("classificationFailed");

    /** Job has been created. */
    @Generated public static final RouterJobStatus CREATED = fromString("created");

    /** Job has been created but not been scheduled yet. */
    @Generated public static final RouterJobStatus PENDING_SCHEDULE = fromString("pendingSchedule");

    /** Job has been scheduled successfully. */
    @Generated public static final RouterJobStatus SCHEDULED = fromString("scheduled");

    /** Job scheduling failed. */
    @Generated public static final RouterJobStatus SCHEDULE_FAILED = fromString("scheduleFailed");

    /** Job is in a suspended state and waiting for an update. */
    @Generated public static final RouterJobStatus WAITING_FOR_ACTIVATION = fromString("waitingForActivation");

    /**
     * Creates a new instance of RouterJobStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RouterJobStatus() {}

    /**
     * Creates or finds a RouterJobStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterJobStatus.
     */
    @Generated
    @JsonCreator
    public static RouterJobStatus fromString(String name) {
        return fromString(name, RouterJobStatus.class);
    }

    /**
     * Gets known RouterJobStatus values.
     *
     * @return known RouterJobStatus values.
     */
    @Generated
    public static Collection<RouterJobStatus> values() {
        return values(RouterJobStatus.class);
    }
}
