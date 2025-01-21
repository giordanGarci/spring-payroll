package com.giordan.hrworker.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.giordan.hrworker.repositories.WorkerRepository;
import com.giordan.hrworker.entities.Worker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
    
    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }

}
