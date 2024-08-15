package noseryoung.ch.gameshop.controller;


import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.GameDTO;
import noseryoung.ch.gameshop.repository.GameRepository;
import noseryoung.ch.gameshop.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:5173" })
@RestController
@RequestMapping("/api/games")
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameDTO>> getAllGames() {
        List<GameDTO> categories = gameService.getAllGames();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/status/{statusId}")
    public ResponseEntity<List<GameDTO>> getAllGamesStatus(@PathVariable int statusId) {
        List<GameDTO> categories = gameService.getAllGamesStatus(statusId);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/status/{statusId}/console/{consoleId}")
    public ResponseEntity<List<GameDTO>> getAllGamesStatusConsole(@PathVariable int statusId, @PathVariable int consoleId) {
        List<GameDTO> categories = gameService.getAllGamesStatusConsole(statusId, consoleId);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/status/{statusId}/genre/{genreId}/console/{consoleId}")
    public ResponseEntity<List<GameDTO>> getAllGamesStatusGenreConsole(@PathVariable int statusId, @PathVariable int genreId, @PathVariable int consoleId) {
        List<GameDTO> categories = gameService.getAllGamesStatusGenreConsole(statusId, genreId, consoleId);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/status/{statusId}/genre/{genreId}")
    public ResponseEntity<List<GameDTO>> getAllGamesStatusGenre(@PathVariable int statusId, @PathVariable int genreId) {
        List<GameDTO> categories = gameService.getAllGamesStatusGenre(statusId, genreId);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }


}
