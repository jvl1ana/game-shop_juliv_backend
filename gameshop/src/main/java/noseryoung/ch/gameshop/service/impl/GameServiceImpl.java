package noseryoung.ch.gameshop.service.impl;

import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.GameDTO;
import noseryoung.ch.gameshop.entity.Game;
import noseryoung.ch.gameshop.mapper.GameMapper;
import noseryoung.ch.gameshop.repository.GameRepository;
import noseryoung.ch.gameshop.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
