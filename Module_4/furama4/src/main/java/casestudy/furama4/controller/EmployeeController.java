package casestudy.furama4.controller;

import casestudy.furama4.models.Employee;
import casestudy.furama4.service.DivisionService;
import casestudy.furama4.service.EmployeeService;
import casestudy.furama4.service.LevelService;
import casestudy.furama4.service.PositionService;
import casestudy.furama4.service.impl.employee.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller(value = "/employee")
public class EmployeeController {

    @Qualifier("employeeServiceImpl")
    @Autowired
    EmployeeService employeeService;

    @Autowired
    LevelService levelService;

    @Qualifier("divisionServiceImpl")
    @Autowired
    DivisionService divisionService;

    @Qualifier("positionServiceImpl")
    @Autowired
    PositionService positionService;

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/employee")
    public String displayBlog(Optional<String> name,
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        if(name.isPresent()){
            model.addAttribute("employees",employeeService.findAllEmployeeByName(name.get(),pageable));
            model.addAttribute("name",name.get());
        }else {
            model.addAttribute("employees", employeeService.findAllEmployee(pageable));
        }
        return "employee/list";
    }

    @GetMapping("employee/create")
    public String create(Model model) {
        model.addAttribute("levels", levelService.findAll());
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("postions", positionService.findAll());
        model.addAttribute("employee", new Employee());
        return "employee/test";
    }

    @PostMapping("employee/save")
    public String save(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model) {
        new Employee().validate(employee,bindingResult);
        if (bindingResult.hasFieldErrors() || employeeService.exitEmail(employee.getEmail())  ) {
            model.addAttribute("levels", levelService.findAll());
            model.addAttribute("divisions", divisionService.findAll());
            model.addAttribute("postions", positionService.findAll());
            return "employee/test";
        }
        if(employeeService.exitEmail(employee.getEmail())) {
            model.addAttribute("levels", levelService.findAll());
            model.addAttribute("divisions", divisionService.findAll());
            model.addAttribute("postions", positionService.findAll());
            model.addAttribute("error", "mail was created");
            return "employee/test";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("employee/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("employee", employeeService.findById(id));
        model.addAttribute("levels", levelService.findAll());
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("postions", positionService.findAll());
        return "employee/edit";
    }

    @PostMapping("employee/update")
    public String update(@Validated @ModelAttribute("employee") Employee employee,BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() || employeeService.exitEmail(employee.getEmail())) {
            model.addAttribute("levels", levelService.findAll());
            model.addAttribute("divisions", divisionService.findAll());
            model.addAttribute("postions", positionService.findAll());
            return "employee/edit";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }

//    @GetMapping("employee/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("employee", employeeService.findById(id));
//        return "employee/delete";
//    }

//    @GetMapping("employee/delete/{id}")
//    public String delete(@PathVariable int id) {
//        employeeService.delete(employeeService.findById(id));
//        return "redirect:/employee";
//    }

//    @PostMapping("employee/actionDelete")
//    public String delete(Employee employee) {
//        employeeService.delete(employee);
//        return "redirect:/employee";
//    }

    @GetMapping("employee/actionDelete/{id}")
    public String delete(@PathVariable int id) {
        employeeService.deleteById(id);
        return "redirect:/employee";
    }
}
