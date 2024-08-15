package noseryoung.ch.gameshop.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import noseryoung.ch.gameshop.entity.Console;
import noseryoung.ch.gameshop.entity.Genre;
import noseryoung.ch.gameshop.entity.Status;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDTO {

        private int game_id;
        private String name;
        private int release_year;
        private int age;
        private int age_rec;
        private String description;
        private Console console;
        private Status status;
        private Genre genre;


}
