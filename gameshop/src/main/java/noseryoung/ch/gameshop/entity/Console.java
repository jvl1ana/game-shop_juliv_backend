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
@Table(name = "console")
public class Console {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int console_id;

    @Column (nullable = false)
    private String name;

}
