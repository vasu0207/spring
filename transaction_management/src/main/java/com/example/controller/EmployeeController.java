package com.example.controller;

import com.example.Service.EmployeeService;
import com.example.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employee", method = RequestMethod.GET)
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/getAllEmployees")
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}
