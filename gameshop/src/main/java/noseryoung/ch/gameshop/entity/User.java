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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int console_id;

    @Column (nullable = false)
    private String firstname;

    @Column (nullable = false)
    private String lastname;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private String address;

    @Column (nullable = false)
    private int postcode;

    @Column (nullable = false)
    private String city;

    @Column (nullable = false)
    private String country;
}
