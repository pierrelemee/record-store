package fr.pierrelemee.recordstore;

import fr.pierrelemee.recordstore.entity.Artist;
import fr.pierrelemee.recordstore.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class RecordStoreApplication {



    public static void main(String[] args) {
        SpringApplication.run(RecordStoreApplication.class, args);
    }
}
