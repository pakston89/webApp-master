package com.webApp.webApp.model;

import com.webApp.webApp.enums.ApprovalStatus;
import javax.persistence.*;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "expense_type_id")
    private Integer expenseTypeId;

    @Column(name = "approval_status")
    private ApprovalStatus approvalStatus;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "currency")
    private String currency;

    @Column(name = "user_id")
    private Integer userId;

    public Expense() {

    }

    public Expense(Integer id, String description, Integer expenseTypeId, Double amount, String currency, Integer userId) {
        this.id = id;
        this.description = description;
        this.expenseTypeId = expenseTypeId;
        this.amount = amount;
        this.currency = currency;
        this.userId = userId;
    }

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
        return "Expense{" +
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
