package fr.pierrelemee.recordstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class RecordStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordStoreApplication.class, args);
    }

    @GetMapping(value = "/", name = "index")
    public ModelAndView index(final Model model) {
        model.addAttribute("title", "Bienvenue!");
        model.addAttribute("welcome", "Bienvenue sur la boutique!");
        return new ModelAndView("index");
    }


    @GetMapping(value = "/hello", name = "hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Bien le bonjour %s!", name);
    }
}
