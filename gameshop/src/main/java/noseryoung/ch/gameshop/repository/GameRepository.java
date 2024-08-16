package noseryoung.ch.gameshop.repository;

import noseryoung.ch.gameshop.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("SELECT g FROM Game g WHERE g.status.status_id = :gameStatus ")
    List<Game> allGamesStatus(
            @Param("gameStatus") int gameStatus
    );

    @Query("SELECT g FROM Game g WHERE g.status.status_id = :gameStatus AND g.genre.genre_id = :gameGenre")
    List<Game> allGamesStatusGenre(
            @Param("gameStatus") int gameStatus,
            @Param("gameGenre") int gameGenre
    );

    @Query("SELECT g FROM Game g WHERE g.status.status_id = :gameStatus AND g.genre.genre_id = :gameGenre AND g.console.console_id = :gameConsole")
    List<Game> allGamesStatusGenreConsole(
            @Param("gameStatus") int gameStatus,
            @Param("gameGenre") int gameGenre,
            @Param("gameConsole") int gameConsole
    );

    @Query("SELECT g FROM Game g WHERE g.status.status_id = :gameStatus AND g.console.console_id = :gameConsole")
    List<Game> allGamesStatusConsole(
            @Param("gameStatus") int gameStatus,
            @Param("gameConsole") int gameConsole
    );


}
