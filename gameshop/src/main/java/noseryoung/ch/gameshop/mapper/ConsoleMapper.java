package noseryoung.ch.gameshop.mapper;

import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.entity.Console;

public class ConsoleMapper {

    public static ConsoleDTO mapToConsoleDTO(Console console){
        return new ConsoleDTO(
                console.getConsole_id(),
                console.getName()
        );
    }

    public static Console mapToconsole (ConsoleDTO consoleDTO){
        return new Console(
                consoleDTO.getConsole_id(),
                consoleDTO.getName()
        );
    }
}
