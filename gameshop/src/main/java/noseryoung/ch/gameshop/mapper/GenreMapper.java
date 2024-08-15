package noseryoung.ch.gameshop.mapper;

import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.dto.GenreDTO;
import noseryoung.ch.gameshop.entity.Console;
import noseryoung.ch.gameshop.entity.Genre;

public class GenreMapper {

    public static GenreDTO mapToGenreDTO(Genre genre){
        return new GenreDTO(
                genre.getGenre_id(),
                genre.getName()
        );
    }

    public static Genre mapToGenre (GenreDTO genreDTO){
        return new Genre(
                genreDTO.getGenre_id(),
                genreDTO.getName()
        );
    }

}
