package com.giordan.hrpayroll.services;

import com.giordan.hrpayroll.entities.Payment;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.giordan.hrpayroll.entities.Worker;
import com.giordan.hrpayroll.feignclients.WorkerFeignClient;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;
    
    public Payment getPayment(long workerId, Integer days) {
        
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
