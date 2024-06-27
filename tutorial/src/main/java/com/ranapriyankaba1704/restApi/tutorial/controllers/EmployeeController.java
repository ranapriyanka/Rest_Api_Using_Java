package com.ranapriyankaba1704.restApi.tutorial.controllers;

//Operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.ranapriyankaba1704.restApi.tutorial.dto.EmployeeDTO;
import com.ranapriyankaba1704.restApi.tutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeDTO creatNewEmployee(@RequestBody EmployeeDTO employeeDTO){
         return employeeService.creatNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }

}
