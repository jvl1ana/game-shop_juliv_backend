package noseryoung.ch.gameshop.repository;

import noseryoung.ch.gameshop.entity.Game;
import noseryoung.ch.gameshop.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
