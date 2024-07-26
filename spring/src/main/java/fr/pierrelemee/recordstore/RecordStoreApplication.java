package fr.pierrelemee.recordstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("title", "Bienvenue");
        return mav;
    }


    @GetMapping(value = "/hello", name = "hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Bien le bonjour %s!", name);
    }

}
