package exercise.demo.controller;



import exercise.demo.model.Book;
import exercise.demo.service.IBookService;
import exercise.demo.service.IBorrowService;
import exercise.demo.service.IStatusService;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class BorrowBookController {

    @Qualifier("bookServiceImpl")
    @Autowired
    IBookService iBookService;


    @Qualifier("borrowServiceImpl")
    @Autowired
    IBorrowService  iBorrowService;


    @Qualifier("statusSerivceImpl")
    @Autowired
    IStatusService iStatusService;

    @GetMapping("")
    public String showlist(){
        return "home";
    }

    @GetMapping("books")
    public String displayBook(Optional<String> author,
                              Optional<String> name ,
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        if(!author.isPresent()){
            if(name.isPresent()) {
                model.addAttribute("books",iBookService.findAllBookByName(name.get(),pageable));
                model.addAttribute("name",name.get());
            }else {
                model.addAttribute("books",iBookService.findAllBook(pageable));
            }
        }else {
            model.addAttribute("books",iBookService.findAllBookByAuthor(author.get(),pageable));
            model.addAttribute("author",author.get());
        }
        return "book";
    }

    @GetMapping("borrows")
    public String displayBorrow(
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        model.addAttribute("books", iBookService.findAll());
        model.addAttribute("status", iStatusService.findAll());
        model.addAttribute("borrows", iBorrowService.findAllBorrow(pageable));
        return "borrow";
    }

    @GetMapping("books/create")
    public String create(Model model) {
        model.addAttribute("book", new Book());
        return "create-book";
    }

    @PostMapping("books/save")
    public String save(@Validated @ModelAttribute("book") Book book, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "create-book";
        }
        iBookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("books/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("books", iBookService.findById(id));
        return "edit-book";
    }

    @PostMapping("books/update")
    public String update(Book book) {
        iBookService.save( book);
        return "redirect:/books";
    }

    @GetMapping("books/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("books", iBookService.findById(id));
        return "delete-book";
    }

    @PostMapping("books/delete")
    public String delete(Book book, RedirectAttributes redirect) {
        iBookService.delete(book);
        redirect.addFlashAttribute("success", "Removed song successfully!");
        return "redirect:/books";
    }
}
