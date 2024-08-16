package noseryoung.ch.gameshop.service.impl;

import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.GenreDTO;
import noseryoung.ch.gameshop.dto.GenreDTO;
import noseryoung.ch.gameshop.entity.Genre;
import noseryoung.ch.gameshop.entity.Genre;
import noseryoung.ch.gameshop.mapper.GenreMapper;
import noseryoung.ch.gameshop.mapper.GenreMapper;
import noseryoung.ch.gameshop.repository.GenreRepository;
import noseryoung.ch.gameshop.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public List<GenreDTO> getAllGenre() {
        List<Genre> categories = genreRepository.findAll();
        return categories.stream()
                .map(GenreMapper::mapToGenreDTO)
                .collect(Collectors.toList());
    }

    public GenreDTO createGenre(GenreDTO genreDTO){
        Genre genre = GenreMapper.mapToGenre(genreDTO);
        Genre savedGenre = genreRepository.save(genre);
        return GenreMapper.mapToGenreDTO(savedGenre);
    }

    public GenreDTO updateGenre(int id, GenreDTO genreDTO){
        Optional<Genre> genreOptional = genreRepository.findById(id);
        if (genreOptional.isPresent()) {
            Genre genre = genreOptional.get();
            genre.setName(genreDTO.getName());
            Genre updatedGenre = genreRepository.save(genre);
            return GenreMapper.mapToGenreDTO(updatedGenre);
        } else {
            throw new RuntimeException("Genre not found");
        }
    }

    public void deleteGenre(int id){
        genreRepository.deleteById(id);
    }
}