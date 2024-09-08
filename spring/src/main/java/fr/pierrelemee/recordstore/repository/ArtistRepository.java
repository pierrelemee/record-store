package fr.pierrelemee.recordstore.repository;

import fr.pierrelemee.recordstore.entity.Artist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

    @Query("SELECT a FROM Artist a ORDER BY rand() LIMIT 10")
    Iterable<Artist> findRandom();
}
