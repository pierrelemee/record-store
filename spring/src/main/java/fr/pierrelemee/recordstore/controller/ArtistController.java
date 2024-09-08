package fr.pierrelemee.recordstore.controller;


import fr.pierrelemee.recordstore.entity.Artist;
import fr.pierrelemee.recordstore.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping(value = "/")
public class ArtistController {

    @Autowired
    protected ArtistRepository repository;

    @GetMapping(value = "/", name = "artist_index")
    public ModelAndView index(final Model model) {
        Iterable<Artist> artists = this.repository.findRandom();

        model.addAttribute("title", "Bienvenue!");
        model.addAttribute("welcome", "Bienvenue sur la boutique!");
        model.addAttribute("artists", artists);

        return new ModelAndView("index");
    }


    @GetMapping(value = "/artist/{artistId}", name = "artist_detail")
    public ModelAndView detail(@PathVariable Long artistId, final Model model) {
        model.addAttribute("title", "Bienvenue!");

        Artist artist = this.repository.findById(artistId).orElseThrow();
        System.out.println(artist.getClass());
        model.addAttribute("artist", artist);
        model.addAttribute("welcome", String.format("Fiche artiste: %s", artist.getName()));

        return new ModelAndView("detail");
    }

}
