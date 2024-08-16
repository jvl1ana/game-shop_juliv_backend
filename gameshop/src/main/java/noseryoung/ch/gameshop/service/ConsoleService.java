package noseryoung.ch.gameshop.service;

import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.entity.Console;

import java.util.List;

public interface ConsoleService {
    List<ConsoleDTO> getAllConsole();

    ConsoleDTO createConsole(ConsoleDTO consoleDTO);

    ConsoleDTO updateConsole(int id, ConsoleDTO consoleDTO);

    void deleteConsole(int id);
}
