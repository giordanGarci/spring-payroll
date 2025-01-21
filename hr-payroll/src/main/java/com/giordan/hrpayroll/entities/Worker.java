package com.giordan.hrpayroll.entities;

import lombok.Data;

@Data
public class Worker {
    private Long id;
    private String name;
    private Double dailyIncome;
}
