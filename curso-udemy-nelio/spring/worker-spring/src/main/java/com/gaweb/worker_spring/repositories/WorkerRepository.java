package com.gaweb.worker_spring.repositories;

import com.gaweb.worker_spring.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
