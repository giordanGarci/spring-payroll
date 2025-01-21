package com.giordan.hrpayroll.services;

import com.giordan.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    public Payment getPayment(long workerId, Integer days) {
        return new Payment("John", 100.0, days);
    }
}
