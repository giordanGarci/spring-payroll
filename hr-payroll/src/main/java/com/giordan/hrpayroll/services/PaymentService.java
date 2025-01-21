package com.giordan.hrpayroll.services;

import com.giordan.hrpayroll.entities.Payment;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import com.giordan.hrpayroll.entities.Worker;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String workerHost;
    
    public Payment getPayment(long workerId, Integer days) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", ""+workerId);

        String url = workerHost + "/workers/{id}";
        Worker worker = restTemplate.getForObject(url, Worker.class, params);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
