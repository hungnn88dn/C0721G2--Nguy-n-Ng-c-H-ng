package exercise.flower.controller;


import exercise.flower.model.Bill;
import exercise.flower.model.Cart;
import exercise.flower.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ShoppingCartController {

    @Autowired
    BillService billService;


    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }

    @GetMapping("/shopping-cart")
    public ModelAndView showCart (@SessionAttribute("cart") Cart cart){
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("cart",cart);
        return modelAndView;
    }
    @GetMapping("flowers/{id}/delete")
    public String delete(@PathVariable int id, @SessionAttribute("cart") Cart cart, Model model) {
        cart.delete(id);
        System.out.println(cart.getFlowers());
        model.addAttribute("cart", cart);
        return "cart";
    }

    @PostMapping("/bill")
    public String bill(@SessionAttribute("cart") Cart cart, RedirectAttributes redirectAttributes){
         Bill bill= new Bill();
         bill.setInfo(String.valueOf(cart.getFlowers().toString()));
         bill.setTotal(String.valueOf(cart.countTotalPayment()));
          billService.save(bill);
        return "redirect:/shop";
    }
}