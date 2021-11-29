package com.webApp.webApp.dto;

import com.webApp.webApp.enums.ApprovalStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class ExpenseDto {

    private Integer id;

    private String description;

    private Integer expenseTypeId;

    private ApprovalStatus approvalStatus;

    private Double amount;

    private String currency;

    private Integer userId;
}
