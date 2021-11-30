package com.webApp.webApp.dto;

import com.webApp.webApp.enums.ApprovalStatus;

public class ExpenseDto {

    private Integer id;

    private String description;

    private Integer expenseTypeId;

    private ApprovalStatus approvalStatus;

    private Double amount;

    private String currency;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExpenseTypeId() {
        return expenseTypeId;
    }

    public void setExpenseTypeId(Integer expenseTypeId) {
        this.expenseTypeId = expenseTypeId;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ExpenseDto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", expenseTypeId=" + expenseTypeId +
                ", approvalStatus=" + approvalStatus +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", userId=" + userId +
                '}';
    }
}
