package online.edmond.blog.web;

import online.edmond.blog.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {
    private PersonsService personsService;


    @Autowired
    public void setPersonsService(PersonsService personsService) {
        this.personsService = personsService;
    }

    @Autowired
    public PersonsService getPersonsService() {
        return personsService;
    }

    @GetMapping("/oldIndex")
    public String index(Model model){
        model.addAttribute("oldIndex", personsService.listAllPersons());
        return "testDataLoading";
    }

    @GetMapping("/index")
    public String main(Model model){
        model.addAttribute("index", personsService.listAllPersons());
        return "index";
    }

}
