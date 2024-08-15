package noseryoung.ch.gameshop.service.impl;

import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.GameDTO;
import noseryoung.ch.gameshop.entity.Game;
import noseryoung.ch.gameshop.mapper.GameMapper;
import noseryoung.ch.gameshop.repository.GameRepository;
import noseryoung.ch.gameshop.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    @Override
    public List<GameDTO> getAllGames(){
        List<Game> games = gameRepository.findAll();
        return games.stream()
                .map(GameMapper::mapToGameDTO).
                collect(Collectors.toList());
    }

    public List<GameDTO> getAllGamesStatus(int gameStatus){
        List<Game> games = gameRepository.allGamesStatus(gameStatus);
        return games.stream()
                .map(GameMapper::mapToGameDTO)
                .collect(Collectors.toList());
    }

    public List<GameDTO> getAllGamesStatusGenre(int gameStatus, int gameGenre){
        List<Game> games = gameRepository.allGamesStatusGenre(gameStatus, gameGenre);
        return games.stream()
                .map(GameMapper::mapToGameDTO)
                .collect(Collectors.toList());
    }

    public List<GameDTO> getAllGamesStatusConsole(int gameStatus, int gameConsole){
        List<Game> games = gameRepository.allGamesStatusConsole(gameStatus, gameConsole);
        return games.stream()
                .map(GameMapper::mapToGameDTO)
                .collect(Collectors.toList());
    }

    public List<GameDTO> getAllGamesStatusGenreConsole(int gameStatus, int gameGenre, int gameConsole){
        List<Game> games = gameRepository.allGamesStatusGenreConsole(gameStatus, gameGenre, gameConsole);
        return games.stream()
                .map(GameMapper::mapToGameDTO)
                .collect(Collectors.toList());
    }

    public GameDTO createGame(GameDTO gameDTO){
        Game game = GameMapper.mapToGame(gameDTO);
        Game savedGame = gameRepository.save(game);
        return GameMapper.mapToGameDTO(savedGame);
    }

    public GameDTO updateGame(int id, GameDTO gameDTO){
        Optional<Game> gameOptional = gameRepository.findById(id);
        if (gameOptional.isPresent()) {
            Game game = gameOptional.get();
            game.setName(gameDTO.getName());
            game.setRelease_year(gameDTO.getRelease_year());
            game.setAge(gameDTO.getAge());
            game.setAge_rec(gameDTO.getAge_rec());
            game.setDescription(gameDTO.getDescription());
            game.setConsole(gameDTO.getConsole());
            game.setStatus(gameDTO.getStatus());
            game.setGenre(gameDTO.getGenre());
            Game updatedGame = gameRepository.save(game);
            return GameMapper.mapToGameDTO(updatedGame);
        } else {
            throw new RuntimeException("Game not found");
        }
    }

    public void deleteGame(int id){
        gameRepository.deleteById(id);
    }
}
