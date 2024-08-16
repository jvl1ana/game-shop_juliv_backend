package noseryoung.ch.gameshop.service;

import noseryoung.ch.gameshop.dto.GenreDTO;
import noseryoung.ch.gameshop.dto.GenreDTO;

import java.util.List;

public interface GenreService {

    List<GenreDTO> getAllGenre();
    GenreDTO createGenre(GenreDTO genreDTO);

    GenreDTO updateGenre(int id, GenreDTO genreDTO);

    void deleteGenre(int id);
    
}
