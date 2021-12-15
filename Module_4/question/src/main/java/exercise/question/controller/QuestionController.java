package exercise.question.controller;

import exercise.question.model.Question;
import exercise.question.service.IQuestionService;
import exercise.question.service.ITypeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class QuestionController {

    @Qualifier("questionService")
    @Autowired
    IQuestionService questionService;

    @Qualifier("typeQuestionSerivce")
    @Autowired
    ITypeQuestionService typeQuestionService;

    @GetMapping("")
    public String showlist(){
        return "home";
    }


    @GetMapping("/question")
    public String displayBlog(Optional<String> title,
                              Optional<Integer> typeID,
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        if(!title.isPresent()){
            if(typeID.isPresent()) {
                model.addAttribute("questions",questionService.findAllQuestionByFilmID(typeID.get(),pageable));
                model.addAttribute("typeID",typeID.get());
            }else {
                model.addAttribute("questions",questionService.findAllQuestion(pageable));
            }
        }else {
            model.addAttribute("questions",questionService.findQuestionByTitle(title.get(),pageable));
            model.addAttribute("title",title.get());
        }
        model.addAttribute("typeQuestions", typeQuestionService.findAll());
        return "list";
    }

    @GetMapping("question/create")
    public String create(Model model) {
        model.addAttribute("typeQuestions", typeQuestionService.findAll());
        model.addAttribute("question", new Question());
        return "create";
    }

    @PostMapping("question/save")
    public String save(@Validated @ModelAttribute("question") Question question, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() ) {
            model.addAttribute("typeQuestions", typeQuestionService.findAll());
            return "create";
        }
        questionService.save(question);
        return "redirect:/question";
    }

    @GetMapping("question/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("typeQuestions", typeQuestionService.findAll());
        model.addAttribute("question", questionService.findById(id));
        return "edit";
    }

    @PostMapping("question/update")
    public String update(@Validated @ModelAttribute("question") Question question,BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() ) {
            model.addAttribute("typeQuestions", typeQuestionService.findAll());
            return "edit";
        }
        questionService.save(question);
        return "redirect:/question";
    }
    @GetMapping("question/actionDelete/{id}")
    public String delete(@PathVariable int id) {
        questionService.deleteById(id);
        return "redirect:/question";
    }
    @GetMapping("question/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("question", questionService.findById(id));
        return "view";
    }
}
