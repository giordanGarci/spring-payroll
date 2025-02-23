package com.giordan.hrpayroll.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.giordan.hrpayroll.services.PaymentService;
import com.giordan.hrpayroll.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/payments")
public class PaymentResouce {
    
    private final PaymentService paymentService;


    @CircuitBreaker(name = "defaultCB", fallbackMethod = "getPaymentAlternative")
    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable long workerId, @PathVariable int days) {
        Payment payment = paymentService.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

    public ResponseEntity<Payment> getPaymentAlternative(long workerId, int days, Throwable throwable) {
        Payment paymentFallback = new Payment("Fallback Worker", 0.0, 0);
        return ResponseEntity.ok(paymentFallback);
    }
    
}
