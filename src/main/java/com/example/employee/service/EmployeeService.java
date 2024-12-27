package com.example.employee.service;

import com.example.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
private List<Employee> employeeList=new ArrayList<>();
public List<Employee>getAllEmployees(){
    return employeeList;
}
public void addEmployee(Employee employee){
    employeeList.add(employee);
}
public void updateEmployee(String id,Employee updatedEmployee){
    for(int i=0;i<employeeList.size();i++){
        if(employeeList.get(i).getEmployee_id().equals(id)){
            employeeList.set(i,updatedEmployee);
            return;
        }
    }
}
public void deleteEmployee(String id){
    employeeList.removeIf(employee -> employee.getEmployee_id().equals(id));
}
}
