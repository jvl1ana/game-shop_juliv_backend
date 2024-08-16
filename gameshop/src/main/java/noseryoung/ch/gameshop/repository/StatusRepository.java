package noseryoung.ch.gameshop.repository;

import noseryoung.ch.gameshop.entity.Game;
import noseryoung.ch.gameshop.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
