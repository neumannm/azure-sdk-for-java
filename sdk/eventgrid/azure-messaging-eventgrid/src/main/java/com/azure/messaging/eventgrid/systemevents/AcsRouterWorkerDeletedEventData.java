// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterWorkerDeleted event. */
@Fluent
public final class AcsRouterWorkerDeletedEventData extends AcsRouterWorkerEventData {
    /** Creates an instance of AcsRouterWorkerDeletedEventData class. */
    public AcsRouterWorkerDeletedEventData() {}

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerDeletedEventData setWorkerId(String workerId) {
        super.setWorkerId(workerId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerDeletedEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerDeletedEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerDeletedEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }
}
