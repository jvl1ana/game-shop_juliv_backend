package noseryoung.ch.gameshop.service;

import noseryoung.ch.gameshop.dto.GameDTO;

import java.util.List;

public interface GameService {
    List<GameDTO> getAllGames();

    List<GameDTO> getAllGamesStatus(int gameStatus);

    List<GameDTO> getAllGamesStatusGenre(int gameStatus, int gameGenre);

    List<GameDTO> getAllGamesStatusConsole(int gameStatus, int gameConsole);

    List<GameDTO> getAllGamesStatusGenreConsole(int gameStatus, int gameGenre, int gameConsole);
}
