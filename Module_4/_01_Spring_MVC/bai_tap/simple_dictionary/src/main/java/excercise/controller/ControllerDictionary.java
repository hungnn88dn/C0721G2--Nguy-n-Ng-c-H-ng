package excercise.controller;

import excercise.bean.Dictionary;
import excercise.service.IService;
import excercise.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Set;

@Controller
public class ControllerDictionary {

    private IService irService = new ServiceImpl();

    @GetMapping(value ="")
    public String formSearch(){
        return "search";
    }

   @GetMapping (value = "search")
    public String search(@RequestParam String search, Model model) {
       Map<String, Dictionary> dictionaryMap= irService.findAll();
       String result ="";
       Set<String> set = dictionaryMap.keySet();
       for (String key: set ) {
           if (key.equals(search)) {
               result = dictionaryMap.get(key).getWord();
           }
       }
       model.addAttribute("resultDictionary",result);
       return "result";
   }
}
