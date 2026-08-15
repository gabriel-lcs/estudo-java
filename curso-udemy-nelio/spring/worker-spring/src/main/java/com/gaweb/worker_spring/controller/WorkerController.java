package com.gaweb.worker_spring.controller;

import com.gaweb.worker_spring.dto.WorkerIncomeDTO;
import com.gaweb.worker_spring.entities.Worker;
import com.gaweb.worker_spring.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping(value = "/{id}/income/{year}/{month}")
    public WorkerIncomeDTO getIncome(@PathVariable Long id, @PathVariable Integer year, @PathVariable Integer month){

        Worker worker = workerRepository.findById(id).get();

        return new WorkerIncomeDTO(worker.getName(), worker.getDepartment().getName(), worker.income(year, month));
    }
}
