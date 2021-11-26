package exercise.flower.controller;


import exercise.flower.model.Cart;
import exercise.flower.model.Flower;
import exercise.flower.service.IFlowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class FlowerController {

    @Qualifier("flowerService")
    @Autowired
   IFlowerService iFlowerService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("shop");
        modelAndView.addObject("flowers", iFlowerService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Flower> productOptional = iFlowerService.findById(id);
        if (!productOptional.isPresent()) {
            return "error.404";
        }
        if (action.equals("show")) {
            cart.addFlower(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addFlower(productOptional.get());
        return "redirect:/shop";
    }
}
