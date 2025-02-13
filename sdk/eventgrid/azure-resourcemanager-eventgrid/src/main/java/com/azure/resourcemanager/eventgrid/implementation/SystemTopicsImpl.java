// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.SystemTopicsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner;
import com.azure.resourcemanager.eventgrid.models.SystemTopic;
import com.azure.resourcemanager.eventgrid.models.SystemTopics;

public final class SystemTopicsImpl implements SystemTopics {
    private static final ClientLogger LOGGER = new ClientLogger(SystemTopicsImpl.class);

    private final SystemTopicsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public SystemTopicsImpl(
        SystemTopicsClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SystemTopic> getByResourceGroupWithResponse(
        String resourceGroupName, String systemTopicName, Context context) {
        Response<SystemTopicInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, systemTopicName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SystemTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SystemTopic getByResourceGroup(String resourceGroupName, String systemTopicName) {
        SystemTopicInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, systemTopicName);
        if (inner != null) {
            return new SystemTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String systemTopicName) {
        this.serviceClient().delete(resourceGroupName, systemTopicName);
    }

    public void delete(String resourceGroupName, String systemTopicName, Context context) {
        this.serviceClient().delete(resourceGroupName, systemTopicName, context);
    }

    public PagedIterable<SystemTopic> list() {
        PagedIterable<SystemTopicInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SystemTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<SystemTopic> list(String filter, Integer top, Context context) {
        PagedIterable<SystemTopicInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new SystemTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<SystemTopic> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SystemTopicInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SystemTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<SystemTopic> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<SystemTopicInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new SystemTopicImpl(inner1, this.manager()));
    }

    public SystemTopic getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String systemTopicName = Utils.getValueFromIdByName(id, "systemTopics");
        if (systemTopicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'systemTopics'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, systemTopicName, Context.NONE).getValue();
    }

    public Response<SystemTopic> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String systemTopicName = Utils.getValueFromIdByName(id, "systemTopics");
        if (systemTopicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'systemTopics'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, systemTopicName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String systemTopicName = Utils.getValueFromIdByName(id, "systemTopics");
        if (systemTopicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'systemTopics'.", id)));
        }
        this.delete(resourceGroupName, systemTopicName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String systemTopicName = Utils.getValueFromIdByName(id, "systemTopics");
        if (systemTopicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'systemTopics'.", id)));
        }
        this.delete(resourceGroupName, systemTopicName, context);
    }

    private SystemTopicsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    public SystemTopicImpl define(String name) {
        return new SystemTopicImpl(name, this.manager());
    }
}
