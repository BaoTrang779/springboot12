package fit.se2.springboot1.controller;
import fit.se2.springboot1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import fit.se2.springboot1.repository.EmployeeRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @RequestMapping(value = "/")
    public String getAllEmployee(Model model){
        List<Employee> employees = employeeRepository.findAll();
        System.out.println(employees);
        model.addAttribute("employees", employees);
        return "employeeList";
    }
}
