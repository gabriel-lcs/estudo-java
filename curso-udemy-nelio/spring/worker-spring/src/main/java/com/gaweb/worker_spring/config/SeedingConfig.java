package com.gaweb.worker_spring.config;

import com.gaweb.worker_spring.entities.Department;
import com.gaweb.worker_spring.entities.HourContract;
import com.gaweb.worker_spring.entities.Worker;
import com.gaweb.worker_spring.entities.WorkerLevel;
import com.gaweb.worker_spring.repositories.DepartmentRepository;
import com.gaweb.worker_spring.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Transactional
@Configuration
public class SeedingConfig implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception{

        Department department = new Department("Design");

        department = departmentRepository.save(department);

        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, department);

        worker = workerRepository.save(worker);

        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);
    }

}
