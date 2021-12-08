package casestudy.furama4.controller;

import casestudy.furama4.models.Customer;
import casestudy.furama4.models.Employee;
import casestudy.furama4.service.CustomerSerivce;
import casestudy.furama4.service.impl.customer.CustomerServiceImpl;
import casestudy.furama4.service.impl.customer.TypeCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

import java.util.Optional;

@Controller(value = "/customer")
public class CustomerController {
    @Qualifier("customerServiceImpl")
    @Autowired
    CustomerSerivce customerSerivce;

    @Autowired
    TypeCustomerServiceImpl typeCustomerService;

    @GetMapping("/customer")
    public String displayBlog(Optional<String> name,
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        if(name.isPresent()){
            model.addAttribute("customers",customerSerivce.findAllCustomerByName(name.get(),pageable));
            model.addAttribute("name",name.get());
        }else {
            model.addAttribute("customers", customerSerivce.findAllCustomer(pageable));
        }
        return "customer/list";
    }

    @GetMapping("customer/create")
    public String create(Model model) {
        model.addAttribute("typeCustomers", typeCustomerService.findAll());
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("customer/save")
    public String save(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() ) {
            model.addAttribute("typeCustomers", typeCustomerService.findAll());
            return "customer/create";
        }
        customerSerivce.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("typeCustomers", typeCustomerService.findAll());
        model.addAttribute("customer", customerSerivce.findById(id));
        return "customer/edit";
    }

    @PostMapping("customer/update")
    public String update(@Validated @ModelAttribute("customer") Customer customer,BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() ) {
            model.addAttribute("typeCustomers", typeCustomerService.findAll());
            return "customer/create";
        }
        customerSerivce.save(customer);
        return "redirect:/customer";
    }

//    @GetMapping("customer/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("customer", customerSerivce.findById(id));
//        return "customer/delete";
//    }

    @GetMapping("customer/actionDelete/{id}")
    public String delete(@PathVariable int id) {
        customerSerivce.deleteById(id);
        return "redirect:/customer";
    }
}
