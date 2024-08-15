package noseryoung.ch.gameshop.mapper;

import noseryoung.ch.gameshop.dto.GameDTO;
import noseryoung.ch.gameshop.entity.Game;

public class GameMapper {

    public static GameDTO mapToGameDTO(Game game){
        return new GameDTO(
                game.getGame_id(),
                game.getName(),
                game.getRelease_year(),
                game.getAge(),
                game.getAge_rec(),
                game.getDescription(),
                game.getConsole(),
                game.getStatus(),
                game.getGenre()
        );
    }

    public static Game mapToGame( GameDTO gameDTO){
        return new Game(
                gameDTO.getGame_id(),
                gameDTO.getName(),
                gameDTO.getRelease_year(),
                gameDTO.getAge(),
                gameDTO.getAge_rec(),
                gameDTO.getDescription(),
                gameDTO.getConsole(),
                gameDTO.getStatus(),
                gameDTO.getGenre()
        );
    }

}


