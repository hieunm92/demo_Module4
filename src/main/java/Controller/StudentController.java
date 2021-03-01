package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/list")
    public String listStudent(){
        return "list";
    }

    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hieu","Hieu Hanoi");
        return  modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("name","Ngo Minh Hieu");
        modelAndView.addObject("age","29");
        modelAndView.addObject("id",id);
        return  modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView search (@RequestParam String name, String a){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("search", name);
        modelAndView.addObject("a", a);
        return modelAndView;
    }
}
