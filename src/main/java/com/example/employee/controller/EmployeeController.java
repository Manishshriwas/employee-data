package com.example.employee.controller;


import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
     @Autowired
    private EmployeeService employeeService;

     @GetMapping("/all-emp")
    public List<Employee> getAllEmployees(){
         return employeeService.getAllEmployees();
     }

     @PostMapping("/add-emp")
    public String addEmployee(@RequestBody Employee employee){
         employeeService.addEmployee(employee);
         return "Employee added successfully";
     }
     @PutMapping("/{id}")
    public String updateEmployee(@PathVariable String id,@RequestBody Employee employee){
         employeeService.deleteEmployee(id);
         return "Employee deleted Successfully !";
     }
}
