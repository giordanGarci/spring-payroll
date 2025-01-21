package com.giordan.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.giordan.hrworker.entities.Worker;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
