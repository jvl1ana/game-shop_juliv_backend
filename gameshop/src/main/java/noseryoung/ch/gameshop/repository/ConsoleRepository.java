package noseryoung.ch.gameshop.repository;

import noseryoung.ch.gameshop.entity.Console;
import noseryoung.ch.gameshop.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsoleRepository extends JpaRepository<Console, Integer> {
}
