package noseryoung.ch.gameshop.controller;


import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.service.ConsoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:5173" })
@RestController
@RequestMapping("/api/console")
@AllArgsConstructor
public class ConsoleController {
    private final ConsoleService consoleService;

    @GetMapping
    public ResponseEntity<List<ConsoleDTO>> getAllCategories() {
        List<ConsoleDTO> consoles = consoleService.getAllConsole();
        return new ResponseEntity<>(consoles, HttpStatus.OK);


    }

    @PostMapping
    public ResponseEntity<ConsoleDTO> createConsole(@RequestBody ConsoleDTO consoleDTO) {
        ConsoleDTO createdConsole = consoleService.createConsole(consoleDTO);
        return new ResponseEntity<>(createdConsole, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConsoleDTO> updateConsole(@PathVariable int id, @RequestBody ConsoleDTO consoleDTO) {
        ConsoleDTO updatedConsole = consoleService.updateConsole(id, consoleDTO);
        return new ResponseEntity<>(updatedConsole, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsole(@PathVariable int id) {
        consoleService.deleteConsole(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
