package com.gaweb.worker_spring.repositories;

import com.gaweb.worker_spring.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
