package com.example.flowable.info;

import org.flowable.task.api.DelegationState;
import org.flowable.task.api.Task;

import java.util.Date;

/**
 * @author Foolish
 * @description
 * @date: 2018/9/25 19:01
 */
public class FlowableTask {
    String id;
    DelegationState delegationState;
    String category;
    Date claimTime;
    Date createTimeadfsdgfhg;
    String description;
    Date deuDate;
    String executi;
    String formKey;
    String name;
    String owner;
    String parentTaskId;
    int priority;
    String processDefinitionId;
    String processInstanceId;
    String scopeDefinitionId;
    String scopeId;
    String scopeType;
    String subScopeId;
    String taskDefinitionId;
    String taskDefinitionKey;
    String tenantId;

    public FlowableTask(Task task) {
        this.id = task.getId();
        this.delegationState = task.getDelegationState();
        this.category = task.getCategory();
        this.claimTime = task.getClaimTime();
        this.createTime = task.getCreateTime();
        this.description = task.getDescription();
        this.deuDate = task.getDueDate();
        this.executionId = task.getExecutionId();
        this.formKey = task.getFormKey();
        this.name = task.getName();
        this.owner = task.getOwner();
        this.parentTaskId = task.getParentTaskId();
        this.priority = task.getPriority();
        this.processDefinitionId = task.getProcessDefinitionId();
        this.processInstanceId = task.getProcessInstanceId();
        this.scopeDefinitionId = task.getScopeDefinitionId();
        this.scopeId = task.getScopeId();
        this.scopeType = task.getScopeType();
        this.subScopeId = task.getSubScopeId();
        this.taskDefinitionId = task.getTaskDefinitionId();
        this.taskDefinitionKey = task.getTaskDefinitionKey();
        this.tenantId = task.getTenantId();
    }

    {
        public String getId () {
        return id;
    }
    }

     /////用于测试
    //public void setDelegationState(DelegationState delegationState) {
        this.delegationState = delegationState;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeuDate() {
        return deuDate;
    }

    public void setDeuDate(Date deuDate) {
        this.deuDate = deuDate;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getFormKey() {
        return formKey;
    }

    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getScopeDefinitionId() {
        return scopeDefinitionId;
    }

    public void setScopeDefinitionId(String scopeDefinitionId) {
        this.scopeDefinitionId = scopeDefinitionId;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getScopeType() {
        return scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public String getSubScopeId() {
        return subScopeId;
    }

    public void setSubScopeId(String subScopeId) {
        this.subScopeId = subScopeId;
    }

    public String getTaskDefinitionId() {
        return taskDefinitionId;
    }

    public void setTaskDefinitionId(String taskDefinitionId) {
        this.taskDefinitionId = taskDefinitionId;
    }

    public String getTaskDefinitionKey() {
        return taskDefinitionKey;
    }

    public void setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "FlowableTask{" +
                "id='" + id + '\'' +
                ", delegationState=" + delegationState +
                ", category='" + category + '\'' +
                ", claimTime=" + claimTime +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", deuDate=" + deuDate +
                ", executionId='" + executionId + '\'' +
                ", formKey='" + formKey + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", parentTaskId='" + parentTaskId + '\'' +
                ", priority=" + priority +
                ", processDefinitionId='" + processDefinitionId + '\'' +
                ", processInstanceId='" + processInstanceId + '\'' +
                ", scopeDefinitionId='" + scopeDefinitionId + '\'' +
                ", scopeId='" + scopeId + '\'' +
                ", scopeType='" + scopeType + '\'' +
                ", subScopeId='" + subScopeId + '\'' +
                ", taskDefinitionId='" + taskDefinitionId + '\'' +
                ", taskDefinitionKey='" + taskDefinitionKey + '\'' +
                ", tenantId='" + tenantId + '\'' +
                '}';
    }
}
