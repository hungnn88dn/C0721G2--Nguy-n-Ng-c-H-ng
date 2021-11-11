package exercise.controller;

import exercise.bean.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping(value = "")
    public String sayHello() {
      return "calculator";
    }

    @GetMapping (value = "calculator")
    public String calculator(@RequestParam String first, @RequestParam String second, @RequestParam String operator ,Model model) throws Exception {
        double result = 0.0;
        double a = Double.parseDouble(first);
        double b = Double.parseDouble(second);
        if (operator.equals("add")) {
            result = a + b;
        } else if (operator.equals("sub")) {
            result = a - b;
        }else if (operator.equals("div")) {
            result = a/b;
        }else if (operator.equals("mul")) {
            result = a*b;
        }
        model.addAttribute("resultCalculator",result);
       return "result";
    }


}
