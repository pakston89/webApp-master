package com.webApp.webApp.dto.mapper;

import com.webApp.webApp.dto.ExpenseDto;
import com.webApp.webApp.model.Expense;
import org.mapstruct.Mapper;
import java.util.List;

//ComponentModel = "spring" produces a bean to inject it anywhere
@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    ExpenseDto expenseToExpenseDto(Expense expense);

    List<ExpenseDto> expensesToExpensesDto(List<Expense> expenses);

    Expense expenseDtoToExpense(ExpenseDto expenseDto);



}
