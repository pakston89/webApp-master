package com.webApp.webApp.dto;

public class ExpenseTypeDto {

    private Integer id;

    private String description;

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

    @Override
    public String toString() {
        return "ExpenseTypeDto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
