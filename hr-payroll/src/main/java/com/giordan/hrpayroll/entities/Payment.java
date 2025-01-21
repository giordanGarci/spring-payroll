package com.giordan.hrpayroll.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String name;
    private Double dayIncome;
    private Integer days;

    public double getTotal(){
        return dayIncome * days;
    }

}