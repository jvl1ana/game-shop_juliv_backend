package noseryoung.ch.gameshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int game_id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private int release_year;

    @Column (nullable = false)
    private int age;

    @Column (nullable = false)
    private int age_rec;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name= "id_console", referencedColumnName = "console_id")
    private Console console;

    @ManyToOne
    @JoinColumn(name= "id_status", referencedColumnName = "status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name= "id_genre", referencedColumnName = "genre_id")
    private Genre genre;

}
