/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies details of the jobs to be created on a schedule.
 */
public class JobSpecification {
    /**
     * The priority of jobs created under this schedule.
     * Priority values can range from -1000 to 1000, with -1000 being the
     * lowest priority and 1000 being the highest priority. The default value
     * is 0. This priority is used as the default for all jobs under the job
     * schedule. You can update a job's priority after it has been created
     * using by using the update job API.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The display name for jobs created under this schedule.
     * The name need not be unique and can contain any Unicode characters up to
     * a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The flag that determines if this job will use tasks with dependencies.
     */
    @JsonProperty(value = "usesTaskDependencies")
    private Boolean usesTaskDependencies;

    /**
     * The action the Batch service should take when all tasks in a job created
     * under this schedule are in the completed state.
     * Note that if a job contains no tasks, then all tasks are considered
     * complete. This option is therefore most commonly used with a Job Manager
     * task; if you want to use automatic job termination without a Job
     * Manager, you should initially set onAllTasksComplete to noAction and
     * update the job properties to set onAllTasksComplete to terminateJob once
     * you have finished adding tasks. The default is noAction. Possible values
     * include: 'noAction', 'terminateJob'.
     */
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /**
     * The action the Batch service should take when any task fails in a job
     * created under this schedule. A task is considered to have failed if it
     * completes with a non-zero exit code and has exhausted its retry count,
     * or if it had a scheduling error.
     * The default is noAction. Possible values include: 'noAction',
     * 'performExitOptionsJobAction'.
     */
    @JsonProperty(value = "onTaskFailure")
    private OnTaskFailure onTaskFailure;

    /**
     * The execution constraints for jobs created under this schedule.
     */
    @JsonProperty(value = "constraints")
    private JobConstraints constraints;

    /**
     * The details of a Job Manager task to be launched when a job is started
     * under this schedule.
     * If the job does not specify a Job Manager task, the user must explicitly
     * add tasks to the job using the Task API. If the job does specify a Job
     * Manager task, the Batch service creates the Job Manager task when the
     * job is created, and will try to schedule the Job Manager task before
     * scheduling other tasks in the job.
     */
    @JsonProperty(value = "jobManagerTask")
    private JobManagerTask jobManagerTask;

    /**
     * The Job Preparation task for jobs created under this schedule.
     * If a job has a Job Preparation task, the Batch service will run the Job
     * Preparation task on a compute node before starting any tasks of that job
     * on that compute node.
     */
    @JsonProperty(value = "jobPreparationTask")
    private JobPreparationTask jobPreparationTask;

    /**
     * The Job Release task for jobs created under this schedule.
     * The primary purpose of the Job Release task is to undo changes to
     * compute nodes made by the Job Preparation task. Example activities
     * include deleting local files, or shutting down services that were
     * started as part of job preparation. A Job Release task cannot be
     * specified without also specifying a Job Preparation task for the job.
     * The Batch service runs the Job Release task on the compute nodes that
     * have run the Job Preparation task.
     */
    @JsonProperty(value = "jobReleaseTask")
    private JobReleaseTask jobReleaseTask;

    /**
     * A list of common environment variable settings. These environment
     * variables are set for all tasks in jobs created under this schedule
     * (including the Job Manager, Job Preparation and Job Release tasks).
     * Individual tasks can override an environment setting specified here by
     * specifying the same setting name with a different value.
     */
    @JsonProperty(value = "commonEnvironmentSettings")
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /**
     * The pool on which the Batch service runs the tasks of jobs created under
     * this schedule.
     */
    @JsonProperty(value = "poolInfo", required = true)
    private PoolInformation poolInfo;

    /**
     * A list of name-value pairs associated with each job created under this
     * schedule as metadata.
     * The Batch service does not assign any meaning to metadata; it is solely
     * for the use of user code.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the usesTaskDependencies value.
     *
     * @return the usesTaskDependencies value
     */
    public Boolean usesTaskDependencies() {
        return this.usesTaskDependencies;
    }

    /**
     * Set the usesTaskDependencies value.
     *
     * @param usesTaskDependencies the usesTaskDependencies value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withUsesTaskDependencies(Boolean usesTaskDependencies) {
        this.usesTaskDependencies = usesTaskDependencies;
        return this;
    }

    /**
     * Get the onAllTasksComplete value.
     *
     * @return the onAllTasksComplete value
     */
    public OnAllTasksComplete onAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set the onAllTasksComplete value.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get the onTaskFailure value.
     *
     * @return the onTaskFailure value
     */
    public OnTaskFailure onTaskFailure() {
        return this.onTaskFailure;
    }

    /**
     * Set the onTaskFailure value.
     *
     * @param onTaskFailure the onTaskFailure value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withOnTaskFailure(OnTaskFailure onTaskFailure) {
        this.onTaskFailure = onTaskFailure;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask value.
     *
     * @return the jobManagerTask value
     */
    public JobManagerTask jobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Set the jobManagerTask value.
     *
     * @param jobManagerTask the jobManagerTask value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withJobManagerTask(JobManagerTask jobManagerTask) {
        this.jobManagerTask = jobManagerTask;
        return this;
    }

    /**
     * Get the jobPreparationTask value.
     *
     * @return the jobPreparationTask value
     */
    public JobPreparationTask jobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Set the jobPreparationTask value.
     *
     * @param jobPreparationTask the jobPreparationTask value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withJobPreparationTask(JobPreparationTask jobPreparationTask) {
        this.jobPreparationTask = jobPreparationTask;
        return this;
    }

    /**
     * Get the jobReleaseTask value.
     *
     * @return the jobReleaseTask value
     */
    public JobReleaseTask jobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Set the jobReleaseTask value.
     *
     * @param jobReleaseTask the jobReleaseTask value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withJobReleaseTask(JobReleaseTask jobReleaseTask) {
        this.jobReleaseTask = jobReleaseTask;
        return this;
    }

    /**
     * Get the commonEnvironmentSettings value.
     *
     * @return the commonEnvironmentSettings value
     */
    public List<EnvironmentSetting> commonEnvironmentSettings() {
        return this.commonEnvironmentSettings;
    }

    /**
     * Set the commonEnvironmentSettings value.
     *
     * @param commonEnvironmentSettings the commonEnvironmentSettings value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withCommonEnvironmentSettings(List<EnvironmentSetting> commonEnvironmentSettings) {
        this.commonEnvironmentSettings = commonEnvironmentSettings;
        return this;
    }

    /**
     * Get the poolInfo value.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set the poolInfo value.
     *
     * @param poolInfo the poolInfo value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the JobSpecification object itself.
     */
    public JobSpecification withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
