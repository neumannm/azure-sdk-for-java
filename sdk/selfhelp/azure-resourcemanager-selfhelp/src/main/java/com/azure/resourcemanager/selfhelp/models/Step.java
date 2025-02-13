// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Troubleshooter step. */
@Fluent
public final class Step {
    /*
     * Unique step id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Step title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Step description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Get or sets the Step guidance.
     */
    @JsonProperty(value = "guidance")
    private String guidance;

    /*
     * Status of Troubleshooter Step execution.
     */
    @JsonProperty(value = "executionStatus")
    private ExecutionStatus executionStatus;

    /*
     * This field has more detailed status description of the execution status.
     */
    @JsonProperty(value = "executionStatusDescription")
    private String executionStatusDescription;

    /*
     * Type of Troubleshooting step.
     */
    @JsonProperty(value = "type")
    private Type type;

    /*
     * is this last step of the workflow.
     */
    @JsonProperty(value = "isLastStep")
    private Boolean isLastStep;

    /*
     * The inputs property.
     */
    @JsonProperty(value = "inputs")
    private List<StepInput> inputs;

    /*
     * Only for AutomatedStep type
     */
    @JsonProperty(value = "automatedCheckResults")
    private AutomatedCheckResult automatedCheckResults;

    /*
     * The insights property.
     */
    @JsonProperty(value = "insights")
    private List<Insight> insights;

    /*
     * The error detail.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /** Creates an instance of Step class. */
    public Step() {
    }

    /**
     * Get the id property: Unique step id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique step id.
     *
     * @param id the id value to set.
     * @return the Step object itself.
     */
    public Step withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the title property: Step title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Step title.
     *
     * @param title the title value to set.
     * @return the Step object itself.
     */
    public Step withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Step description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Step description.
     *
     * @param description the description value to set.
     * @return the Step object itself.
     */
    public Step withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the guidance property: Get or sets the Step guidance.
     *
     * @return the guidance value.
     */
    public String guidance() {
        return this.guidance;
    }

    /**
     * Set the guidance property: Get or sets the Step guidance.
     *
     * @param guidance the guidance value to set.
     * @return the Step object itself.
     */
    public Step withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * Get the executionStatus property: Status of Troubleshooter Step execution.
     *
     * @return the executionStatus value.
     */
    public ExecutionStatus executionStatus() {
        return this.executionStatus;
    }

    /**
     * Set the executionStatus property: Status of Troubleshooter Step execution.
     *
     * @param executionStatus the executionStatus value to set.
     * @return the Step object itself.
     */
    public Step withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * Get the executionStatusDescription property: This field has more detailed status description of the execution
     * status.
     *
     * @return the executionStatusDescription value.
     */
    public String executionStatusDescription() {
        return this.executionStatusDescription;
    }

    /**
     * Set the executionStatusDescription property: This field has more detailed status description of the execution
     * status.
     *
     * @param executionStatusDescription the executionStatusDescription value to set.
     * @return the Step object itself.
     */
    public Step withExecutionStatusDescription(String executionStatusDescription) {
        this.executionStatusDescription = executionStatusDescription;
        return this;
    }

    /**
     * Get the type property: Type of Troubleshooting step.
     *
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: Type of Troubleshooting step.
     *
     * @param type the type value to set.
     * @return the Step object itself.
     */
    public Step withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Get the isLastStep property: is this last step of the workflow.
     *
     * @return the isLastStep value.
     */
    public Boolean isLastStep() {
        return this.isLastStep;
    }

    /**
     * Set the isLastStep property: is this last step of the workflow.
     *
     * @param isLastStep the isLastStep value to set.
     * @return the Step object itself.
     */
    public Step withIsLastStep(Boolean isLastStep) {
        this.isLastStep = isLastStep;
        return this;
    }

    /**
     * Get the inputs property: The inputs property.
     *
     * @return the inputs value.
     */
    public List<StepInput> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The inputs property.
     *
     * @param inputs the inputs value to set.
     * @return the Step object itself.
     */
    public Step withInputs(List<StepInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the automatedCheckResults property: Only for AutomatedStep type.
     *
     * @return the automatedCheckResults value.
     */
    public AutomatedCheckResult automatedCheckResults() {
        return this.automatedCheckResults;
    }

    /**
     * Set the automatedCheckResults property: Only for AutomatedStep type.
     *
     * @param automatedCheckResults the automatedCheckResults value to set.
     * @return the Step object itself.
     */
    public Step withAutomatedCheckResults(AutomatedCheckResult automatedCheckResults) {
        this.automatedCheckResults = automatedCheckResults;
        return this;
    }

    /**
     * Get the insights property: The insights property.
     *
     * @return the insights value.
     */
    public List<Insight> insights() {
        return this.insights;
    }

    /**
     * Set the insights property: The insights property.
     *
     * @param insights the insights value to set.
     * @return the Step object itself.
     */
    public Step withInsights(List<Insight> insights) {
        this.insights = insights;
        return this;
    }

    /**
     * Get the error property: The error detail.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: The error detail.
     *
     * @param error the error value to set.
     * @return the Step object itself.
     */
    public Step withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
        if (automatedCheckResults() != null) {
            automatedCheckResults().validate();
        }
        if (insights() != null) {
            insights().forEach(e -> e.validate());
        }
    }
}
