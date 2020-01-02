package com.example.Service;

import com.example.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setAddress("Manikonda");
        employeeDto.setName("kota");
        employeeDtos.add(employeeDto);

        return employeeDtos;
    }
}
