package com.giordan.hrpayroll.services;

import com.giordan.hrpayroll.entities.Payment;

import org.springframework.stereotype.Service;
import com.giordan.hrpayroll.entities.Worker;
import com.giordan.hrpayroll.feignclients.WorkerFeignClient;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;
    
    public Payment getPayment(long workerId, Integer days) {
        
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
